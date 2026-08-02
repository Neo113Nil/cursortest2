package xsna;

import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class wd01 implements si01 {
    public final /* synthetic */ vp01 a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ vl01 d;

    public wd01(vl01 vl01Var, vp01 vp01Var, HashSet hashSet, AtomicBoolean atomicBoolean) {
        this.d = vl01Var;
        this.a = vp01Var;
        this.b = hashSet;
        this.c = atomicBoolean;
    }

    @Override // xsna.si01
    public final void a(ZipFile zipFile, HashSet hashSet) throws IOException {
        this.d.c(this.a, hashSet, new bqz0(this));
    }
}
