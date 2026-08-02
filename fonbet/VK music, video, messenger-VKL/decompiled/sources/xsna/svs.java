package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.fullscreenbanners.ConsumeReason;
import com.vk.fullscreenbanners.api.dto.FullScreenBanner;
import com.vk.log.L;
import com.vk.music.notifications.inapp.InAppNotification;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: FullScreenBannerTabletPopup.kt */
/* loaded from: classes16.dex */
public final class svs extends com.vk.music.notifications.inapp.c implements View.OnClickListener {
    public final pvs i;
    public final mzp0 j;
    public final InAppNotification.DisplayingStrategy k = InAppNotification.DisplayingStrategy.REPLACE_ANY;
    public final int l = R.layout.full_screen_banner_tablet_popup;
    public final lvs m;
    public io.reactivex.rxjava3.disposables.c n;

    /* compiled from: FullScreenBannerTabletPopup.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public svs(pvs pvsVar, mzp0 mzp0Var) {
        this.i = pvsVar;
        this.j = mzp0Var;
        this.m = new lvs(pvsVar);
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final boolean C() {
        return false;
    }

    @Override // com.vk.music.notifications.inapp.c, com.vk.music.notifications.inapp.InAppNotification
    public final InAppNotification.DisplayingStrategy E() {
        return this.k;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final int G() {
        return this.l;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void M() {
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        this.n = ((io.reactivex.rxjava3.subjects.f) this.i.c.b).subscribe(new c60(new f2s(this, 4), 29), new n20(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 28));
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void N() {
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final boolean a0() {
        this.i.b.a(ConsumeReason.CLOSE.h());
        return false;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void d3(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.full_screen_banner_container);
        viewGroup.setClipChildren(true);
        viewGroup.setClipToOutline(true);
        bwt0.p(view, R.id.full_screen_banner_close, this, null, 4);
        new mvs((ViewGroup) view, this.m, this.i, this);
        mzp0 mzp0Var = this.j;
        if (mzp0Var != null) {
            mzp0Var.e(view);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.fsb_close_view || id == R.id.full_screen_banner_close) {
            this.i.b.a(ConsumeReason.CLOSE.h());
            d();
        }
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.AUDIO_FULLSCREEN_BANNER;
        FullScreenBanner fullScreenBanner = this.i.a;
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.AUDIO_FULLSCREEN_BANNER, Long.valueOf(fullScreenBanner.b), null, null, fullScreenBanner.c, null, 44, null);
    }
}
