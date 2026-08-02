package defpackage;

import java.io.File;
import kotlin.io.AccessDeniedException;

/* loaded from: classes9.dex */
public final class a2r extends x1r {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ c2r e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2r(c2r c2rVar, File file) {
        super(file);
        this.e = c2rVar;
    }

    @Override // defpackage.d2r
    public final File a() {
        wls wlsVar;
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null && (wlsVar = (wls) this.e.w.d) != null) {
                wlsVar.invoke(file, new AccessDeniedException(file));
            }
            File[] fileArr2 = this.c;
            if (fileArr2 == null || fileArr2.length == 0) {
                return null;
            }
        }
        File[] fileArr3 = this.c;
        int i = this.d;
        this.d = i + 1;
        return fileArr3[i];
    }
}
