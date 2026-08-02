package xsna;

import android.content.Context;
import androidx.recyclerview.widget.m;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.video.list.c;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.friend.FriendsRequestsCommonVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsSubscribersVh;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.exceptions.stacktrace.StopBgSyncAnrStackTraceInfoException;
import com.vk.metrics.eventtracking.VkMainTracker;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.albums.presentation.a;
import com.vk.photoviewer.ClippingImageView;
import com.vk.photoviewer.PhotoViewer;
import java.util.List;
import ru.ok.android.webrtc.Privacy;
import xsna.fk1;
import xsna.sq1;
import xsna.to50;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tm1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tm1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0;
        int i = this.b;
        int i2 = 1;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i3 = 3;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                int i4 = AlbumsFragment.j0;
                xn50.a.c((AlbumsFragment) obj3, new a.l.C1493a((fk1.a) obj2, ((sq1.c) obj).a));
                break;
            case 1:
                ae6 ae6Var = (ae6) obj3;
                ae6Var.e().setItems((List) obj2);
                ((m.d) obj).b(ae6Var.e());
                break;
            case 2:
                FriendsRequestsCommonVh friendsRequestsCommonVh = (FriendsRequestsCommonVh) obj3;
                Context context = (Context) obj2;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj;
                int i5 = uIBlockProfile.E;
                CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
                UserProfile userProfile = uIBlockProfile.A;
                int i6 = 2;
                uIBlockProfile.E = 2;
                if (uIBlockProfile.d == CatalogViewType.LIST_FRIENDS_REQUESTS) {
                    y0 = rsg0.y0(yfb.x(((nts) friendsRequestsCommonVh.c.getValue()).q(userProfile.c, catalogUserMeta.d, null)), null, null, 3);
                } else {
                    eos eosVar = new eos(userProfile.c, 0);
                    eosVar.H0(catalogUserMeta.d);
                    y0 = rsg0.y0(eosVar, null, null, 3);
                }
                ((io.reactivex.rxjava3.disposables.b) friendsRequestsCommonVh.e.getValue()).b(hg1.m(y0, context, 0L, false, 62).subscribe(new pm1(new jss(friendsRequestsCommonVh, context, uIBlockProfile), 23), new p41(new j76(uIBlockProfile, i5, i6), 26)));
                break;
            case 3:
                FriendsSubscribersVh friendsSubscribersVh = (FriendsSubscribersVh) obj3;
                Context context2 = (Context) obj2;
                UIBlockProfile uIBlockProfile2 = (UIBlockProfile) obj;
                friendsSubscribersVh.c(FriendsAnalyticsInfo.ClickTarget.RemoveFromFriends);
                ((io.reactivex.rxjava3.disposables.b) friendsSubscribersVh.i.getValue()).b(hg1.m(rsg0.y0(yfb.x(nts.g((nts) friendsSubscribersVh.f.getValue(), uIBlockProfile2.A.c, null, uIBlockProfile2.y.d, Privacy.FRIENDS, null, 18)), null, null, 3), context2, 0L, false, 62).subscribe(new ga(new jbo(uIBlockProfile2, friendsSubscribersVh, context2, i2), 29), new m1r(new com.vk.movika.sdk.base.logic.interactor.f(25), i3)));
                break;
            case 4:
                gzs gzsVar = (gzs) obj;
                ((l7v) obj3).d.remove((String) obj2);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 5:
                to50 to50Var = (to50) obj3;
                to50.d dVar = (to50.d) obj2;
                to50.d dVar2 = (to50.d) obj;
                if (!to50Var.a(dVar.a, dVar.b)) {
                    break;
                } else {
                    break;
                }
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj3;
                x6e0 x6e0Var = (x6e0) obj2;
                ClippingImageView clippingImageView = (ClippingImageView) obj;
                mrx0 mrx0Var = photoViewer.N;
                float f2 = (mrx0Var == null ? null : mrx0Var).a != null ? r4.left : x6e0Var.c;
                float f3 = (mrx0Var != null ? mrx0Var : null).a != null ? r1.top : x6e0Var.d;
                clippingImageView.setX(f2);
                clippingImageView.setY(f3);
                s3q0 s3q0Var = s3q0.a;
                photoViewer.l = s3q0Var;
                ggs ggsVar = photoViewer.q.k.get(photoViewer.r);
                if (ggsVar != null) {
                    ggsVar.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                photoViewer.w.setAlpha(1.0f);
                if (photoViewer.P && photoViewer.l != null) {
                    photoViewer.O = photoViewer.R;
                    photoViewer.o(true);
                    break;
                }
                break;
            case 7:
                ((izs) obj3).invoke(new c.C0473c(((vst0) obj2).b, p490.C((tny) ((bpf0) obj).a())));
                break;
            default:
                StopBgSyncAnrStackTraceInfoException stopBgSyncAnrStackTraceInfoException = (StopBgSyncAnrStackTraceInfoException) obj;
                ohp0 o = ((VkMainTracker) obj3).o((String) obj2);
                if (o != null) {
                    o.a(stopBgSyncAnrStackTraceInfoException);
                }
                break;
        }
        return s3q0.a;
    }
}
