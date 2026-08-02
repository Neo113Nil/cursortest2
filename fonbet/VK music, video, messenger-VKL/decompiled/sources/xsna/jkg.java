package xsna;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.a;
import com.vk.api.generated.polls.dto.PollsGetStatsResponseDto;
import com.vk.api.generated.polls.dto.PollsPollExtendedDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.PollInfo;
import com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivity;
import com.vk.poll.fragments.PollResultsFragment;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.i8a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jkg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jkg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        io.reactivex.rxjava3.core.q T;
        boolean d;
        int i = this.b;
        int i2 = 6;
        int i3 = 3;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((nkg) obj3).a(ne7.I(55), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                iea0 iea0Var = (iea0) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1838061815, intValue, -1, "com.vk.profile.core.tabs.ui.photos.CommunityProfileContentPhotoViewHolder.setupShimmers.<anonymous> (CommunityProfileContentPhotoViewHolder.kt:216)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1456413106, new nx7(iea0Var, i3), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                int intValue2 = ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                return ((Photo) obj3).Fb(intValue2, false).d.d;
            case 3:
                ((Integer) obj2).getClass();
                ((tyq) obj3).h(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                t8s.k((v1z) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                cxo cxoVar = (cxo) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gmq gmqVar = (gmq) obj2;
                if (gmqVar instanceof MarketFavable) {
                    MarketFavable marketFavable = (MarketFavable) gmqVar;
                    ((fy00) cxoVar.a.I.getValue()).b(new hy00(marketFavable.b, marketFavable.c, booleanValue));
                }
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((iku) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 7:
                MarketEditAlbumGoodVariantsFragment marketEditAlbumGoodVariantsFragment = (MarketEditAlbumGoodVariantsFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i4 = MarketEditAlbumGoodVariantsFragment.M0;
                if (aVar2.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-938145391, intValue3, -1, "com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment.initToolbar.<anonymous> (MarketEditAlbumGoodVariantsFragment.kt:77)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-837681354, new nx7(marketEditAlbumGoodVariantsFragment, i2), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                u150.f((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                OrderFragment orderFragment = (OrderFragment) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = OrderFragment.Y;
                if (aVar3.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-732787488, intValue4, -1, "com.vk.ecomm.orders.impl.order.presentation.OrderFragment.onCreateView.<anonymous>.<anonymous> (OrderFragment.kt:122)");
                    }
                    nzw nzwVar = orderFragment.V;
                    qcy<Object> qcyVar = OrderFragment.Y[0];
                    ix80 ix80Var = (ix80) nzwVar.getValue();
                    pu80 pu80Var = (pu80) orderFragment.W.getValue();
                    boolean y = aVar3.y(orderFragment);
                    Object x = aVar3.x();
                    if (y || x == a.C0011a.a) {
                        x = new k170(orderFragment, 4);
                        aVar3.R(x);
                    }
                    cx80.a(ix80Var, pu80Var, (izs) x, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 10:
                ((z8a0) obj3).e.invoke(new i8a0.c((List) obj, ((Boolean) obj2).booleanValue()));
                return s3q0.a;
            case 11:
                PollResultsFragment pollResultsFragment = (PollResultsFragment) obj3;
                PollsGetStatsResponseDto pollsGetStatsResponseDto = (PollsGetStatsResponseDto) obj;
                PollsPollExtendedDto pollsPollExtendedDto = (PollsPollExtendedDto) obj2;
                int i5 = PollResultsFragment.b0;
                List<Long> e = pollsPollExtendedDto.e();
                if (e == null || !(!e.isEmpty())) {
                    T = io.reactivex.rxjava3.core.q.T(Optional.empty());
                } else {
                    PollInfo pollInfo = pollResultsFragment.T;
                    int i6 = (pollInfo == null ? null : pollInfo).b;
                    UserId userId = (pollInfo == null ? null : pollInfo).c;
                    if (pollInfo == null) {
                        pollInfo = null;
                    }
                    boolean z = pollInfo.d;
                    tfx tfxVar = new tfx("polls.getVotersCriteria", new e630(6), new dr(28));
                    tfx.l(tfxVar, "poll_id", i6, 0, 0, 8);
                    tfxVar.i("answer_ids", e);
                    if (userId != null) {
                        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                    }
                    tfxVar.j("is_board", z);
                    T = rsg0.l0(yfb.x(tfxVar), null, 3).U(new bj50(new xpt(15), 5));
                }
                return T.U(new u730(new com.vk.movika.sdk.base.logic.processor.d(25, pollsGetStatsResponseDto, pollsPollExtendedDto), i2));
            case 12:
                wdc0 wdc0Var = (wdc0) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1837117907, intValue5, -1, "com.vk.newsfeed.impl.posting.PostingCtaAttachChoiceBottomSheetDelegate.view.<anonymous>.<anonymous> (PostingCtaAttachChoiceBottomSheetDelegate.kt:60)");
                    }
                    emi.e.g(6, aVar4, kai.c(-1623159857, new nx7(wdc0Var, 11), aVar4));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 13:
                nkd0 nkd0Var = (nkd0) obj3;
                ind0 ind0Var = (ind0) obj2;
                if (!ind0Var.b && !ind0Var.c && !ind0Var.d) {
                    mnd0 mnd0Var = nkd0Var.b;
                    myc0.h(mnd0Var.a, null, null, new knd0(mnd0Var, ind0Var, null), 3);
                }
                return s3q0.a;
            default:
                VideoContainerActivity videoContainerActivity = (VideoContainerActivity) obj3;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int intValue6 = ((Integer) obj2).intValue();
                int i7 = VideoContainerActivity.B;
                if (booleanValue2) {
                    Window window = videoContainerActivity.getWindow();
                    if (window == null) {
                        dhr0 dhr0Var = dhr0.a;
                    } else {
                        dhr0.a.getClass();
                        if (gz80.a(23)) {
                            View decorView = window.getDecorView();
                            int systemUiVisibility = decorView.getSystemUiVisibility();
                            window.setStatusBarColor(intValue6);
                            boolean z2 = intValue6 == 0;
                            if (z2) {
                                d = l8g.d(dhr0.t.c(R.attr.vk_ui_background));
                            } else {
                                if (z2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                d = l8g.d(intValue6);
                            }
                            if (d) {
                                decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                            } else {
                                decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                            }
                        } else {
                            Context context = window.getContext();
                            e3m.a aVar5 = e3m.a;
                            window.setStatusBarColor(context.getColor(R.color.vk_black));
                        }
                    }
                } else {
                    dhr0.t0(videoContainerActivity.getWindow(), intValue6);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ jkg(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
