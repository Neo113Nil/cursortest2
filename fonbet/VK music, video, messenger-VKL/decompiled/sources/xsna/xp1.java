package xsna;

import android.content.Context;
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
import xsna.mk50;
import xsna.qfa0;
import xsna.tzp0;

/* compiled from: AlbumsSettingsBottomSheet.kt */
/* loaded from: classes4.dex */
public final class xp1 extends tl50<cq1, rq1, vp1> {
    public static final /* synthetic */ int l1 = 0;
    public final bpn0 i1 = new bpn0(new ra0(this, 2));
    public final bpn0 j1 = new bpn0(new sa0(this, 4));
    public final bpn0 k1 = new bpn0(new im0(this, 2));

    /* compiled from: AlbumsSettingsBottomSheet.kt */
    public static final class a extends dw20.b {
        public static final tzp0.c.a f = new tzp0.c.a(new C4031a(), true);
        public final UserId e;

        /* compiled from: AlbumsSettingsBottomSheet.kt */
        /* renamed from: xsna.xp1$a$a, reason: collision with other inner class name */
        public static final class C4031a implements m0q0 {
            @Override // xsna.m0q0
            public final void y(UiTrackingScreen uiTrackingScreen) {
                uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.ALBUM_SETTINGS;
            }
        }

        public a(Context context, UserId userId) {
            super(context, f);
            this.e = userId;
            c(new a470());
            F0(true);
            x(0);
            this.d.C1 = true;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            xp1 xp1Var = new xp1();
            Bundle bundle = new Bundle();
            bundle.putParcelable("uid", this.e);
            xp1Var.setArguments(bundle);
            return xp1Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_albums_settings);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        rq1 rq1Var = (rq1) ao50Var;
        qq1 qq1Var = new qq1(view, this, (kdg0) this.k1.getValue(), (UserId) this.i1.getValue(), (AlbumsRepository) this.j1.getValue(), getFeature().e, new com.vk.movika.sdk.base.logic.interactor.p(this, 4));
        gm50.a.b(qq1Var, rq1Var.b, new com.vk.movika.sdk.base.observable.o(qq1Var, 2));
        gm50.a.b(qq1Var, rq1Var.a, new com.vk.movika.sdk.base.observable.p(qq1Var, 7));
        getFeature().k.a(new zx0(this, 1), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        s0e0 z8 = ((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).z8();
        qfa0 F4 = ((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).F4();
        bpn0 bpn0Var = this.i1;
        return new cq1(z8, (UserId) bpn0Var.getValue(), (AlbumsRepository) this.j1.getValue(), (qfa0.c) F4.c((UserId) bpn0Var.getValue()).g.getValue());
    }
}
