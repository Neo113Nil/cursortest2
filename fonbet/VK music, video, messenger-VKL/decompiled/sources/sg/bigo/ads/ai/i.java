package sg.bigo.ads.ai;

/* loaded from: classes9.dex */
public final class i {
    public static boolean a() {
        j jVar = k.a;
        h B = jVar != null ? jVar.B() : null;
        boolean z = false;
        sg.bigo.ads.bw.a.b((B == null || !B.a()) ? 0 : 1);
        boolean z2 = B != null && B.b();
        if (B != null && B.c()) {
            z = true;
        }
        return sg.bigo.ads.bg.a.a(z2, z);
    }

    public static int b() {
        j jVar = k.a;
        h B = jVar != null ? jVar.B() : null;
        int i = 0;
        int i2 = (B == null || !B.a()) ? 0 : 1;
        int i3 = (B == null || !B.b()) ? 0 : 1;
        if (B != null && B.c()) {
            i = 1;
        }
        return (sg.bigo.ads.bg.b.i() ? sg.bigo.ads.bg.b.d() : 2) | (i << 4) | (i3 << 3) | (i2 << 2);
    }

    public static void c() {
        j jVar = k.a;
        h B = jVar != null ? jVar.B() : null;
        sg.bigo.ads.bw.a.b((B == null || !B.a()) ? 0 : 1);
    }
}
