package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.dw20;

/* compiled from: VideoBottomSheet.kt */
/* loaded from: classes2.dex */
public final class e6s0 extends kq6 {
    public static final int f = cn70.b(16);
    public static final int g = R.attr.vk_ui_text_secondary;
    public static final int h = R.attr.vk_ui_icon_secondary;
    public static final e0a i = new e0a(12);
    public final Activity c;
    public final s6s0 d;
    public final y6s0 e;

    /* compiled from: VideoBottomSheet.kt */
    public static final class a {
        public static boolean a(s6s0 s6s0Var) {
            return !e6s0.i.T(s6s0Var).isEmpty();
        }
    }

    public e6s0(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        this.c = activity;
        this.d = s6s0Var;
        this.e = y6s0Var;
    }

    public static final int d(e6s0 e6s0Var) {
        s6s0 s6s0Var = e6s0Var.d;
        Integer num = s6s0Var.h;
        if (num != null) {
            return num.intValue();
        }
        if (!s6s0Var.f) {
            return dhr0.t.c(R.attr.vk_ui_text_accent_themed);
        }
        dhr0.a.getClass();
        return e3m.f(R.attr.vk_ui_text_accent_themed, dhr0.s());
    }

    @Override // xsna.kq6
    public final dw20 a() {
        Context E;
        s6s0 s6s0Var = this.d;
        boolean z = s6s0Var.f;
        Activity activity = this.c;
        if (z) {
            dhr0.a.getClass();
            int i2 = dhr0.u().c;
            E = new l7s(activity, dhr0.u().c);
        } else {
            dhr0.a.getClass();
            E = dhr0.E();
        }
        av20.a aVar = new av20.a();
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(E));
        aVar.d = new f6s0(this, activity);
        aVar.e = new g6s0(this);
        av20 b = aVar.b();
        b.setItems(i.T(s6s0Var));
        dw20.b bVar = new dw20.b(activity, null);
        if (hg10.u(s6s0Var)) {
            bVar.r0(R.string.video_ad_title);
            e.a aVar2 = bVar.d;
            aVar2.e0 = 8388611;
            aVar2.g0 = Integer.valueOf(f);
        }
        dw20.b bVar2 = (dw20.b) dw20.a.k(bVar.a0(new z4d0(this, 26)).d0(new tfm0(this, 15)).f0(new ap30(this, 29)), b, 4);
        x6s0 x6s0Var = new x6s0(activity, s6s0Var.f, new mmm0(b, 13));
        bVar2.getClass();
        bVar2.d.D0.add(x6s0Var);
        return bVar2.I0("video_bottom_sheet");
    }

    @Override // xsna.kq6
    public final void c() {
        com.vk.libvideo.tracker.c.a(this.d.a);
        super.c();
    }
}
