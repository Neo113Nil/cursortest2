package yads;

import android.content.Context;
import java.io.File;

/* loaded from: classes10.dex */
public final class ap0 {
    public final vg0 a;
    public final b03 b;

    public /* synthetic */ ap0() {
        this(new vg0(), new b03());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r1 != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zz2 a(Context context) {
        long j;
        this.a.getClass();
        File a = vg0.a(context, "mobileads-video-cache");
        qu2 a2 = gx2.a().a(context);
        if (a2 != null) {
            j = a2.c;
        }
        j = 52428800;
        ef1 ef1Var = new ef1(jt1.a(context, 41943040L, j));
        kn0 kn0Var = new kn0(context);
        this.b.getClass();
        return new zz2(a, ef1Var, kn0Var);
    }

    public ap0(vg0 vg0Var, b03 b03Var) {
        this.a = vg0Var;
        this.b = b03Var;
    }
}
