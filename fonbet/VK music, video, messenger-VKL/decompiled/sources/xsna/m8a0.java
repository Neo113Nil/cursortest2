package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.gm50;
import xsna.i8a0;
import xsna.mk50;
import xsna.qfa0;
import xsna.tzp0;
import xsna.xn50;

/* compiled from: PhotoFlowSettingsBottomSheet.kt */
/* loaded from: classes4.dex */
public final class m8a0 extends pyd0<o8a0, a9a0, i8a0> implements w8i {
    public static final /* synthetic */ int v1 = 0;
    public final bpn0 l1 = new bpn0(new l500(this, 22));
    public final bpn0 m1 = new bpn0(new os30(this, 12));
    public final bpn0 n1 = new bpn0(new r010(this, 17));
    public final bpn0 o1 = new bpn0(new flu(this, 27));
    public final bpn0 p1 = new bpn0(new t210(this, 16));
    public final bpn0 q1 = new bpn0(new sy50(this, 7));
    public final bpn0 r1 = new bpn0(new xrj(this, 28));
    public final bpn0 s1 = new bpn0(new rkt(this, 18));
    public final bpn0 t1 = new bpn0(new g880(this, 4));
    public final bpn0 u1 = new bpn0(new m960(this, 7));

    /* compiled from: PhotoFlowSettingsBottomSheet.kt */
    public static final class a extends dw20.b {
        public static final tzp0.c.a e = new tzp0.c.a(new C3327a(), true);

        /* compiled from: PhotoFlowSettingsBottomSheet.kt */
        /* renamed from: xsna.m8a0$a$a, reason: collision with other inner class name */
        public static final class C3327a implements m0q0 {
            @Override // xsna.m0q0
            public final void y(UiTrackingScreen uiTrackingScreen) {
                uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_SETTINGS;
            }
        }

        public /* synthetic */ a(Context context) {
            this(context, null);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new m8a0();
        }

        public a(Context context, lo10 lo10Var) {
            super(context, e);
            c(new a470());
            F0(true);
            x(0);
            this.d.C1 = true;
            l(dhr0.Y(R.attr.vk_ui_background_content, context));
            a0(new i030(2, lo10Var));
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_photo_flow_settings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        a9a0 a9a0Var = (a9a0) ao50Var;
        AlbumsRepository albumsRepository = (AlbumsRepository) this.n1.getValue();
        jed0 jed0Var = new jed0();
        z8a0 z8a0Var = new z8a0(view, (kdg0) this.m1.getValue(), this, albumsRepository, jed0Var, (UserId) this.s1.getValue(), ((o8a0) getFeature()).e, (el1) this.u1.getValue(), new ui(1, this, m8a0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8));
        gm50.a.b(z8a0Var, a9a0Var.b, new i750(z8a0Var, 7));
        gm50.a.b(z8a0Var, a9a0Var.a, new u3u(z8a0Var, 22));
        ((o8a0) getFeature()).i.a(new tn0(23, this, z8a0Var), this);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        xn50.a.c(this, i8a0.a.b);
        return true;
    }

    public final PhotosComponent bo() {
        return (PhotosComponent) this.l1.getValue();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ww50 v;
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null && (v = s200.v(mo2getContext)) != null) {
            v.H(this.j1);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new o8a0((f8a0) this.o1.getValue(), (ysg0) this.p1.getValue(), (s0e0) this.q1.getValue(), (qfa0.i) this.r1.getValue());
    }

    @Override // xsna.pyd0, xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        final b33 b33Var = (b33) yn;
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.l8a0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                int i = m8a0.v1;
                ww50 v = s200.v(b33.this.getContext());
                if (v != null) {
                    v.S(this.j1);
                }
            }
        });
        return yn;
    }
}
