package xsna;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Lambda;

/* compiled from: FileStorage.kt */
/* loaded from: classes12.dex */
public final class nar<T> implements mgl0<T> {
    public static final LinkedHashSet d = new LinkedHashSet();
    public static final Object e = new Object();
    public final qmi0<T> a;
    public final izs<File, uax> b = mar.i;
    public final gzs<File> c;

    /* compiled from: FileStorage.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(0);
            this.$file = file;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            Object obj = nar.e;
            File file = this.$file;
            synchronized (obj) {
                nar.d.remove(file.getAbsolutePath());
            }
            return s3q0.a;
        }
    }

    public nar(qmi0 qmi0Var, gzs gzsVar) {
        this.a = qmi0Var;
        this.c = gzsVar;
    }

    @Override // xsna.mgl0
    public final ogl0<T> a() {
        File canonicalFile = this.c.invoke().getCanonicalFile();
        synchronized (e) {
            String absolutePath = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = d;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(absolutePath);
        }
        return new qar(canonicalFile, this.a, this.b.invoke(canonicalFile), new a(canonicalFile));
    }
}
