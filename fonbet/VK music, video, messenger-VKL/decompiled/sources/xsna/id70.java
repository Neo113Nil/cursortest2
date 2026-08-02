package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import xsna.mk50;
import xsna.tzp0;

/* compiled from: NotificationMenuModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class id70 extends tl50<md70, ce70, fd70> {
    public static final /* synthetic */ int q1 = 0;
    public be70 i1;
    public boolean j1;
    public final b k1 = new b();
    public final Object l1;
    public final Object m1;
    public final Object n1;
    public final Object o1;
    public final Object p1;

    /* compiled from: NotificationMenuModalBottomSheet.kt */
    public static final class a extends wpi {
        public static final tzp0.c.a g = new tzp0.c.a(new C3050a(), false);

        /* compiled from: NotificationMenuModalBottomSheet.kt */
        /* renamed from: xsna.id70$a$a, reason: collision with other inner class name */
        public static final class C3050a implements m0q0 {
            @Override // xsna.m0q0
            public final void y(UiTrackingScreen uiTrackingScreen) {
                uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.NOTIFICATIONS_SETTINGS;
            }
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new id70();
        }
    }

    /* compiled from: NotificationMenuModalBottomSheet.kt */
    public static final class b implements fcn {
        public b() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            int i = id70.q1;
            id70 id70Var = id70.this;
            if (!id70Var.N0 || id70Var.j1) {
                id70Var.j1 = true;
                id70Var.hide();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    public id70() {
        gd70 gd70Var = new gd70(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l1 = msy.a(lazyThreadSafetyMode, gd70Var);
        this.m1 = msy.a(lazyThreadSafetyMode, new v100(this, 14));
        this.n1 = msy.a(lazyThreadSafetyMode, new fr20(this, 9));
        this.o1 = msy.a(lazyThreadSafetyMode, new z260(this, 5));
        this.p1 = msy.a(lazyThreadSafetyMode, new w100(this, 14));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        be70 be70Var = new be70(requireContext(), this);
        this.i1 = be70Var;
        return new mk50.c(be70Var.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ce70 ce70Var = (ce70) ao50Var;
        be70 be70Var = this.i1;
        if (be70Var != null) {
            be70Var.f(ce70Var, new kd70(1, getFeature(), md70.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((md70) vk50Var).h.a(new aj50(this, 4), this);
    }

    public final void bo() {
        ww50 v;
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null && (v = s200.v(mo2getContext)) != null) {
            v.H(this.k1);
        }
        hide();
        myc0.h(g5z.a(this), null, null, new jd70(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new md70((ExtendedProfilesRepository) this.n1.getValue(), (b25) this.o1.getValue());
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        final b33 b33Var = (b33) yn;
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.hd70
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                int i = id70.q1;
                ww50 v = s200.v(b33.this.getContext());
                if (v != null) {
                    v.S(this.k1);
                }
            }
        });
        return yn;
    }
}
