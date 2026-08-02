package yads;

import android.content.Context;
import java.io.File;
import xsna.dzy;
import xsna.m5q;

/* loaded from: classes10.dex */
public final class zo0 {
    public final vg0 a;
    public final a03 b;

    public /* synthetic */ zo0() {
        this(new vg0(), new a03());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r1 != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.media3.datasource.cache.c a(Context context) {
        long j;
        this.a.getClass();
        File a = vg0.a(context, "mobileads-video-cache");
        qu2 a2 = gx2.a().a(context);
        if (a2 != null) {
            j = a2.c;
        }
        j = 52428800;
        dzy dzyVar = new dzy(jt1.a(context, 41943040L, j));
        m5q m5qVar = new m5q(context.getApplicationContext(), "exoplayer_internal.db", null, 1);
        this.b.getClass();
        return new androidx.media3.datasource.cache.c(a, dzyVar, m5qVar, false);
    }

    public zo0(vg0 vg0Var, a03 a03Var) {
        this.a = vg0Var;
        this.b = a03Var;
    }
}
