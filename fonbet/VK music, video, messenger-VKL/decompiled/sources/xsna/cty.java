package xsna;

import android.content.Context;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.settings.api.di.NewsfeedSettingsComponent;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.managed_groups.impl.ManagedGroupsComponentImpl;
import com.vk.managed_groups.impl.ManagedGroupsInnerComponent;
import com.vk.mediapicker.impl.di.MediaPickerComponentImpl;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.photogallery.c;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragmentNew;
import com.vk.photoviewer.PhotoViewer;
import com.vk.settings.impl.presentation.base.fragment.setting.NotificationSettingFragment;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vkontakte.android.LinkRedirActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bty;
import xsna.d4g0;
import xsna.i0c0;
import xsna.l310;
import xsna.mca0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class cty implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cty(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [xsna.e410] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 8;
        switch (this.b) {
            case 0:
                bty.b bVar = ((bty) this.c).j;
                if (bVar != null) {
                    mio.a(bVar);
                }
                return s3q0.a;
            case 1:
                LinkRedirActivity linkRedirActivity = (LinkRedirActivity) this.c;
                List<String> list = LinkRedirActivity.m;
                return ((ImReportersComponent) m7m.a(linkRedirActivity).a(fpf0.a(ImReportersComponent.class))).K();
            case 2:
                return (VoipActionMultiLineView) ((zcz) this.c).b.findViewById(R.id.is_service_chat_switch_view);
            case 3:
                ManagedGroupsComponentImpl managedGroupsComponentImpl = (ManagedGroupsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = ManagedGroupsComponentImpl.d;
                a1w a1wVar = q1w.a;
                mbl mblVar = new mbl(a1wVar != null ? a1wVar : null);
                nwy nwyVar = managedGroupsComponentImpl.a.b;
                qcy<Object> qcyVar = ManagedGroupsInnerComponent.c[0];
                return new hi00(mblVar, (ji00) nwyVar.c());
            case 4:
                iq00 iq00Var = (iq00) this.c;
                return new np00(iq00Var.b, iq00Var.c, ((dq00) iq00Var.a.getValue()).d, iq00Var.e);
            case 5:
                final MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.c;
                int i2 = MarketItemReviewsFragment.w0;
                return new n310(new i410(marketItemReviewsFragment), marketItemReviewsFragment.U, new eig0() { // from class: xsna.e410
                    @Override // xsna.eig0
                    public final void a(Object obj) {
                        d4g0 d4g0Var = (d4g0) obj;
                        int i3 = MarketItemReviewsFragment.w0;
                        boolean z = d4g0Var instanceof d4g0.a;
                        MarketItemReviewsFragment marketItemReviewsFragment2 = MarketItemReviewsFragment.this;
                        if (z) {
                            d4g0.a aVar = (d4g0.a) d4g0Var;
                            Integer valueOf = Integer.valueOf(aVar.a);
                            int i4 = aVar.b;
                            UserId userId = aVar.c;
                            b2g0 b2g0Var = aVar.d;
                            xn50.a.c(marketItemReviewsFragment2, new l310.q.a(valueOf, i4, userId, b2g0Var != null ? tni.g(b2g0Var) : null));
                            return;
                        }
                        if (d4g0Var instanceof d4g0.e) {
                            xn50.a.c(marketItemReviewsFragment2, new l310.g.d(((d4g0.e) d4g0Var).a));
                            return;
                        }
                        if (d4g0Var instanceof d4g0.d) {
                            d4g0.d dVar = (d4g0.d) d4g0Var;
                            xn50.a.c(marketItemReviewsFragment2, new l310.q.j(dVar.a, dVar.b));
                            return;
                        }
                        if (!(d4g0Var instanceof d4g0.b)) {
                            if (d4g0Var instanceof d4g0.c) {
                                d4g0.c cVar = (d4g0.c) d4g0Var;
                                xn50.a.c(marketItemReviewsFragment2, new l310.q.g(cVar.a, cVar.b, cVar.c));
                                return;
                            }
                            return;
                        }
                        d4g0.b bVar2 = (d4g0.b) d4g0Var;
                        int i5 = bVar2.a;
                        int i6 = bVar2.b;
                        UserId userId2 = bVar2.c;
                        b2g0 b2g0Var2 = bVar2.d;
                        xn50.a.c(marketItemReviewsFragment2, new l310.q.d(i5, i6, userId2, b2g0Var2 != null ? tni.g(b2g0Var2) : null));
                    }
                });
            case 6:
                ((FunctionReferenceImpl) this.c).invoke();
                return s3q0.a;
            case 7:
                MediaPickerComponentImpl mediaPickerComponentImpl = (MediaPickerComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = MediaPickerComponentImpl.d;
                bpn0 bpn0Var = jz10.a;
                Context context = mediaPickerComponentImpl.a;
                return new pt10(new bu10(new nu10(new zz10(new rq10(context.getApplicationContext()), (zy10) jz10.a.getValue()), context)));
            case 8:
                return ((ev10) this.c).c.Gd();
            case 9:
                return ((MiniPlayerControllersWrapper) this.c).v;
            case 10:
                return ((com.vk.catalog2.feature.music.configuration.b) this.c).j0();
            case 11:
                return ((MusicAnalyticsComponent) ((k7m) m7m.f((xp40) this.c)).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 12:
                pq50 pq50Var = (pq50) this.c;
                return new j4v(pq50Var.b7(), pq50Var.c7());
            case 13:
                ((jz50) this.c).a();
                return s3q0.a;
            case 14:
                fxc0.B().Y().D((Context) this.c, true);
                return Boolean.TRUE;
            case 15:
                NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) this.c;
                qcy<Object>[] qcyVarArr3 = NewsfeedCustomFragment2.r0;
                return new af60(new v100(newsfeedCustomFragment2, i), new z260(newsfeedCustomFragment2, 2), new w100(newsfeedCustomFragment2, i), new a040(newsfeedCustomFragment2, i));
            case 16:
                NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) this.c;
                int i3 = NewsfeedFilterListFragment2.X;
                return ((NewsfeedSettingsComponent) ((k7m) m7m.f(newsfeedFilterListFragment2)).a(fpf0.a(NewsfeedSettingsComponent.class))).j0();
            case 17:
                return ((ClipsViewerComponent) ((mo60) this.c).c().a(fpf0.a(ClipsViewerComponent.class))).Ba();
            case 18:
                NotificationSettingFragment notificationSettingFragment = (NotificationSettingFragment) this.c;
                qcy<Object>[] qcyVarArr4 = NotificationSettingFragment.W;
                String string = notificationSettingFragment.requireArguments().getString("setting_id");
                if (string != null) {
                    return string;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 19:
                return ((SakAnalyticsComponent) ((k7m) m7m.f((com.vk.onepasspromo.impl.b) this.c)).a(fpf0.a(SakAnalyticsComponent.class))).Qc();
            case 20:
                return "LivePlayerImpl.onTransferInitializing() - state= " + wl80.this.G;
            case 21:
                OnlineBookingInternalComponent onlineBookingInternalComponent = (OnlineBookingInternalComponent) this.c;
                OnlineBookingInternalComponent.a aVar = OnlineBookingInternalComponent.n;
                return new zu7(onlineBookingInternalComponent.Ef());
            case 22:
                return (TextView) ((dp90) this.c).b().findViewById(R.id.past_call_details_header_title);
            case 23:
                c.b bVar2 = (c.b) this.c;
                bVar2.i();
                PhotoViewer photoViewer = bVar2.b;
                if (photoViewer != null) {
                    photoViewer.g(true);
                }
                return Boolean.TRUE;
            case 24:
                hd60.a().h1(((mca0.b) this.c).itemView.getContext());
                return s3q0.a;
            case 25:
                PickVKPhotoFragmentNew pickVKPhotoFragmentNew = (PickVKPhotoFragmentNew) this.c;
                int i4 = PickVKPhotoFragmentNew.t0;
                return (PhotosComponent) m7m.d(pickVKPhotoFragmentNew).a(fpf0.a(PhotosComponent.class));
            case 26:
                g1k0 g1k0Var = (g1k0) this.c;
                bwf<Float> bwfVar = g1k0Var.b;
                float floatValue = bwfVar.getStart().floatValue();
                float floatValue2 = bwfVar.c().floatValue() - floatValue;
                return Float.valueOf(swe0.f(floatValue2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (swe0.f(g1k0Var.c(), bwfVar.getStart().floatValue(), bwfVar.c().floatValue()) - floatValue) / floatValue2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            case 27:
                ((i0c0.a) this.c).a();
                return s3q0.a;
            case 28:
                ((o7c0) this.c).v();
                return s3q0.a;
            default:
                Context context2 = ((j1d0) this.c).a;
                ArrayList arrayList = new ArrayList();
                r rVar = new r(20);
                fn80 fn80Var = new fn80(context2, arrayList, false);
                fn80Var.c = true;
                fn80Var.d = new v6j(rVar);
                androidx.media3.exoplayer.j[] a = fn80Var.a(y2r0.o(null), new l1d0(), new m1d0(), new io.reactivex.rxjava3.internal.operators.mixed.n(i), new zq(12));
                int length = a.length;
                androidx.media3.exoplayer.k[] kVarArr = new androidx.media3.exoplayer.k[length];
                for (int i5 = 0; i5 < length; i5++) {
                    kVarArr[i5] = a[i5].getCapabilities();
                }
                return kVarArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cty(gzs gzsVar) {
        this.b = 6;
        this.c = (FunctionReferenceImpl) gzsVar;
    }

    public /* synthetic */ cty(a4b0 a4b0Var, g1k0 g1k0Var) {
        this.b = 26;
        this.c = g1k0Var;
    }
}
