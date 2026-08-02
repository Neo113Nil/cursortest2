package xsna;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.cameraui.impl.QrScannerUi;
import com.vk.common.links.LaunchContext;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.common.model.OrderSnackbar;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.ecomm.orders.impl.order.presentation.mvi.c;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.chat.api.ChatAnalyticsParamsNoLogging;
import com.vk.newsfeed.impl.posting.settings.mvi.a;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadUpdate;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.search.params.api.domain.model.geo.Coordinate;
import com.vk.search.ui.SearchLocationPermissionsController;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.picture_in_picture.overlay.PictureInPictureOverlayService;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.dbe0;
import xsna.fh8;
import xsna.gm50;
import xsna.pdv0;
import xsna.qn60;
import xsna.tim0;
import xsna.usf0;
import xsna.zlh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k170 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k170(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                List list = (List) obj;
                if (list.isEmpty()) {
                    enj.q(R.string.post_not_found, 0, fragmentActivity);
                } else {
                    pdv0.a c = vtk0.c().c((NewsEntry) list.get(0));
                    c.B(null);
                    c.k(fragmentActivity);
                }
                return s3q0.a;
            case 1:
                ((bfm) obj2).invoke();
                return s3q0.a;
            case 2:
                return new pl20((ViewGroup) obj, ((im70) obj2).j);
            case 3:
                return io.reactivex.rxjava3.core.q.T(obj).U(new i630((qi00) obj2, 8)).z0(5L, TimeUnit.SECONDS, io.reactivex.rxjava3.core.q.T(obj));
            case 4:
                OrderFragment orderFragment = (OrderFragment) obj2;
                com.vk.ecomm.orders.impl.order.presentation.mvi.c cVar = (com.vk.ecomm.orders.impl.order.presentation.mvi.c) obj;
                qcy<Object>[] qcyVarArr = OrderFragment.Y;
                ru80 ru80Var = (ru80) orderFragment.X.getValue();
                ru80Var.getClass();
                Context requireContext = orderFragment.requireContext();
                if (cVar instanceof c.a) {
                    orderFragment.kn().onBackPressed();
                } else if (cVar instanceof c.f) {
                    ru80Var.b.a(((c.f) cVar).a, CommonMarketStat$TypeMarketOrdersItem.Source.ORDER_BUTTON, orderFragment);
                } else if (cVar instanceof c.j) {
                    fx80 fx80Var = (fx80) ru80Var.h.getValue();
                    Context requireContext2 = orderFragment.requireContext();
                    OrderSnackbar orderSnackbar = ((c.j) cVar).a;
                    fx80Var.getClass();
                    fx80.a(requireContext2, orderSnackbar);
                } else if (cVar instanceof c.d) {
                    maz.c(xwk.d().e(), requireContext, ((c.d) cVar).a, LaunchContext.A, null, null, 24);
                } else if (cVar instanceof c.e) {
                    c.e eVar = (c.e) cVar;
                    ru80Var.d.a(requireContext, eVar.a, eVar.b);
                } else if (cVar instanceof c.C0991c) {
                    cpu cpuVar = ru80Var.g;
                    UserId userId = ((c.C0991c) cVar).a;
                    int i2 = cpu.a;
                    cpuVar.g(requireContext, userId, null);
                } else if (cVar instanceof c.b) {
                    c.b bVar = (c.b) cVar;
                    String string = requireContext.getString(R.string.order_chat_greeting, bVar.c);
                    UserId userId2 = bVar.a;
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.CART;
                    UiTracker uiTracker = UiTracker.a;
                    pyb.b(ru80Var.e, requireContext, null, bVar.b, string, null, null, new ChatAnalyticsParamsNoLogging(null, userId2, commonMarketStat$TypeRefSource, UiTracker.c(), true, null, null, null, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, null), 31456242);
                } else if (cVar instanceof c.g) {
                    Uri c2 = rf3.c(((c.g) cVar).a, new StringBuilder("tel:"));
                    if (epx.f(c2.getScheme(), "tel")) {
                        Intent intent = new Intent("android.intent.action.DIAL", c2);
                        if (!requireContext.getPackageManager().hasSystemFeature("android.hardware.telephony") || intent.resolveActivity(requireContext.getPackageManager()) == null) {
                            Toast.makeText(requireContext, R.string.tel_link_cant_be_opened, 0).show();
                        } else {
                            requireContext.startActivity(intent);
                        }
                    }
                } else if (cVar instanceof c.h) {
                    c.h hVar = (c.h) cVar;
                    ru80Var.f.d(orderFragment.requireContext(), new qz00(hVar.b, hVar.a, CommonMarketStat$TypeRefSource.CART, null, null, null, null, null, null, null, null, null, null, 1048568));
                } else {
                    if (!(cVar instanceof c.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.i iVar = (c.i) cVar;
                    ru80Var.c.o(orderFragment.requireContext(), iVar.a, iVar.b);
                }
                return s3q0.a;
            case 5:
                ((d3a0) obj2).z.finish();
                return s3q0.a;
            case 6:
                bwt0.p0(((z8a0) obj2).m.getMenuButton(), ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 7:
                PhotosGetAlbums.a aVar = (PhotosGetAlbums.a) obj;
                g5g.D(aVar.a, true, new hxl((mha0) obj2, 26));
                return aVar;
            case 8:
                int i3 = PictureInPictureOverlayService.g;
                ((PictureInPictureOverlayService) obj2).stopSelf();
                return s3q0.a;
            case 9:
                dra0.this.a.a(g.j.b);
                return s3q0.a;
            case 10:
                ((k2b0) obj).t((com.vk.movika.sdk.player.base.model.a) obj2);
                return s3q0.a;
            case 11:
                int i4 = PostingFragment.L0;
                ((PostingFragment) obj2).getFeature().C(new PostingAction.Upload.Update((UploadUpdate) obj));
                return s3q0.a;
            case 12:
                gu80 gu80Var = (gu80) obj;
                ((com.vk.newsfeed.impl.posting.settings.mvi.b) obj2).C(new a.C1386a(gu80Var.b, gu80Var.c, gu80Var.a));
                return s3q0.a;
            case 13:
                qcy<Object>[] qcyVarArr2 = PostsFromNotificationsFragment.p0;
                ((SwipeDrawableRefreshLayout) obj2).setProgressDrawableFactory((d2e0) obj);
                return s3q0.a;
            case 14:
                com.vk.ecomm.market.good.ui.e eVar2 = (com.vk.ecomm.market.good.ui.e) obj2;
                com.vk.ecomm.market.good.ui.c cVar2 = eVar2.l;
                eVar2.f(cVar2 != null ? cVar2.h : null, cVar2 != null ? cVar2.j : null, false, eVar2.i.getContext());
                return s3q0.a;
            case 15:
                return PublishState.a((PublishState) obj, null, null, null, ((dbe0.o.a) ((dbe0.o) obj2)).b, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -9, 2047);
            case 16:
                ((QrScannerUi) obj2).c.o5(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 17:
                h2f0 h2f0Var = (h2f0) obj2;
                h2f0Var.l.performHapticFeedback(0);
                h2f0Var.m.invoke(Integer.valueOf(h2f0Var.getLayoutPosition()));
                return s3q0.a;
            case 18:
                VKList vKList = (VKList) obj2;
                qn60.c cVar3 = (qn60.c) obj;
                return new i5f0(cVar3.a, cVar3.b, vKList, vKList.j());
            case 19:
                rsf0 rsf0Var = (rsf0) obj2;
                gm50.a.a(rsf0Var, ((usf0.a) obj).a, new dn20(rsf0Var, 22));
                return s3q0.a;
            case 20:
                d0g0 d0g0Var = (d0g0) obj2;
                tdu tduVar = (tdu) obj;
                boolean v = d0g0Var.v();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                tduVar.o(!v ? Float.intBitsToFloat((int) (d0g0Var.f.b() >> 32)) : 0.0f);
                if (d0g0Var.v()) {
                    f = Float.intBitsToFloat((int) (d0g0Var.f.b() & 4294967295L));
                }
                tduVar.n(f);
                return s3q0.a;
            case 21:
                ((jmh0) obj2).a.invoke(new zlh0.e.a((String) obj));
                return s3q0.a;
            case 22:
                Location location = (Location) obj;
                ((SearchLocationPermissionsController) obj2).b.a(new Coordinate(location.getLatitude(), location.getLongitude()));
                return s3q0.a;
            case 23:
                ((com.vk.posting.presentation.video.search.g) obj2).f.setText("");
                return s3q0.a;
            case 24:
                ((ifi0) obj2).c();
                return s3q0.a;
            case 25:
                ((clj0) obj2).e.invoke(new fh8.g((dfw0) ((it80) obj).a));
                return s3q0.a;
            case 26:
                tim0 tim0Var = (tim0) obj2;
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    tim0Var.f(tim0.a.HASHTAG);
                }
                tim0Var.e.invoke();
                tim0Var.i.a(tim0Var.d, list2);
                return s3q0.a;
            case 27:
                FragmentEntry j = ((oz50) obj).j();
                ((ww50) obj2).t(j.b, j.c, false);
                return s3q0.a;
            case 28:
                ((com.vk.sharing.core.view.h) obj2).V5((Target) obj, true);
                return s3q0.a;
            default:
                ((izs) obj).invoke((tco0) obj2);
                return s3q0.a;
        }
    }

    public /* synthetic */ k170(qi00 qi00Var) {
        this.b = 3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = qi00Var;
    }
}
