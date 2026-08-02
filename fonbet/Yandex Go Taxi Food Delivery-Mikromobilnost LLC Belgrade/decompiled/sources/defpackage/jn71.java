package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import yads.jc2;

/* loaded from: classes7.dex */
public final class jn71 implements ub81 {
    public boolean a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ eq71 w;

    public jn71(eq71 eq71Var) {
        this.w = eq71Var;
    }

    @Override // defpackage.ub81
    public final void f(jc2 jc2Var) {
        boolean z = false;
        this.a = false;
        eq71 eq71Var = this.w;
        ((gm71) eq71Var.g.c).a();
        ek71 ek71Var = eq71Var.a;
        ek71Var.v();
        ek71Var.v();
        bm81 bm81Var = ek71Var.w;
        ek71Var.v();
        boolean z2 = ek71Var.b0.l;
        bm81Var.a();
        ek71Var.i(null);
        int i = bf71.a;
        String message = jc2Var.getMessage();
        cf71 cf71Var = eq71Var.c;
        hn71 a = ((ip71) cf71Var.c).a();
        a.r(message, "error_message");
        Map map = (Map) a.b;
        ((ge71) cf71Var.b).c(new zj71("video_ad_player_error", new LinkedHashMap(map), (no61) a.c));
        j581 j581Var = eq71Var.i;
        a4 a4Var = eq71Var.h;
        if (j581Var == null || a4Var == null) {
            return;
        }
        eq71Var.d.getClass();
        j581Var.b(new cf71(z571.a(jc2Var), jc2Var, z, 16));
    }

    @Override // defpackage.ub81
    public final void onIsPlayingChanged(boolean z) {
        eq71 eq71Var = this.w;
        if (!z) {
            if (this.b) {
                return;
            }
            this.c = true;
            j581 j581Var = eq71Var.i;
            a4 a4Var = eq71Var.h;
            if (j581Var == null || a4Var == null) {
                return;
            }
            j581Var.i();
            return;
        }
        if (!this.a) {
            j581 j581Var2 = eq71Var.i;
            a4 a4Var2 = eq71Var.h;
            if (j581Var2 == null || a4Var2 == null) {
                return;
            }
            this.a = true;
            j581Var2.c();
            return;
        }
        if (this.c) {
            this.c = false;
            j581 j581Var3 = eq71Var.i;
            a4 a4Var3 = eq71Var.h;
            if (j581Var3 == null || a4Var3 == null) {
                return;
            }
            j581Var3.f();
        }
    }

    @Override // defpackage.ub81
    public final void onPlaybackStateChanged(int i) {
        eq71 eq71Var = this.w;
        if (i == 2) {
            this.b = true;
            j581 j581Var = eq71Var.i;
            a4 a4Var = eq71Var.h;
            if (j581Var == null || a4Var == null) {
                return;
            }
            j581Var.b();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            this.a = false;
            j581 j581Var2 = eq71Var.i;
            a4 a4Var2 = eq71Var.h;
            if (j581Var2 == null || a4Var2 == null) {
                return;
            }
            j581Var2.d();
            return;
        }
        ((gm71) eq71Var.g.c).a();
        j581 j581Var3 = eq71Var.i;
        a4 a4Var3 = eq71Var.h;
        if (j581Var3 != null && a4Var3 != null) {
            j581Var3.h();
        }
        if (this.b) {
            this.b = false;
            j581 j581Var4 = eq71Var.i;
            a4 a4Var4 = eq71Var.h;
            if (j581Var4 == null || a4Var4 == null) {
                return;
            }
            j581Var4.a();
        }
    }
}
