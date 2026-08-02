package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import com.ybsdk.feature.dashboard.internal.data.dto.BalanceItem;
import com.ybsdk.feature.dashboard.internal.data.dto.CardInfo;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardBalanceModel;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardBottomButton;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardFullScreenResponse;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardNavigationItemModel;
import com.ybsdk.feature.dashboard.internal.data.dto.GetDashboardResponse;
import com.ybsdk.feature.dashboard.internal.data.dto.HeaderTopButtonsResponse;
import com.ybsdk.feature.dashboard.internal.data.dto.ScreenItem;
import com.ybsdk.feature.dashboard.internal.domain.entities.DashboardCardInfoEntity;
import com.ybsdk.feature.dashboard.internal.domain.entities.NextPageLoadingStatus;
import com.ybsdk.feature.dashboard.internal.domain.entities.TopButtonTag;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.bwz0;
import defpackage.dzh0;
import defpackage.g8e;
import defpackage.jo4;
import defpackage.job1;
import defpackage.jy00;
import defpackage.mvg;
import defpackage.nhg;
import defpackage.nig;
import defpackage.nkg;
import defpackage.ny61;
import defpackage.phg;
import defpackage.qis;
import defpackage.qxy0;
import defpackage.rbv;
import defpackage.rh10;
import defpackage.rr51;
import defpackage.skg;
import defpackage.suf;
import defpackage.tcc;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.x5t;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/GetDashboardResponse;", "response", "Lx5t;", "<anonymous>", "(Lcom/ybsdk/feature/dashboard/internal/data/dto/GetDashboardResponse;)Lx5t;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.data.DashboardRepository$getDashboard$3$1", f = "DashboardRepository.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardRepository$getDashboard$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DashboardRepository$getDashboard$3$1 dashboardRepository$getDashboard$3$1 = new DashboardRepository$getDashboard$3$1(2, continuation);
        dashboardRepository$getDashboard$3$1.L$0 = obj;
        return dashboardRepository$getDashboard$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardRepository$getDashboard$3$1) create((GetDashboardResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008b  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [phg] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [bwz0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.String, java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.ybsdk.core.utils.text.Text$Constant] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.ybsdk.core.utils.text.Text] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0076 -> B:5:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.ybsdk.feature.divkit.api.domain.a aVar;
        Iterator it;
        Collection collection;
        GetDashboardResponse getDashboardResponse;
        ArrayList arrayList;
        skg skgVar;
        ?? r21;
        TopButtonTag topButtonTag;
        TopButtonTag topButtonTag2;
        boolean z;
        ?? r6;
        TopButtonTag topButtonTag3;
        skg skgVar2;
        nig nigVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z2 = true;
        ?? r4 = 0;
        if (i == 0) {
            kotlin.b.b(obj);
            GetDashboardResponse getDashboardResponse2 = (GetDashboardResponse) this.L$0;
            com.ybsdk.feature.divkit.api.domain.a aVar2 = new com.ybsdk.feature.divkit.api.domain.a(getDashboardResponse2.getCommonDivData());
            List<ScreenItem> screenItems = getDashboardResponse2.getScreenItems();
            ArrayList arrayList2 = new ArrayList();
            aVar = aVar2;
            it = screenItems.iterator();
            collection = arrayList2;
            getDashboardResponse = getDashboardResponse2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ScreenItem screenItem = (ScreenItem) this.L$4;
            it = (Iterator) this.L$3;
            collection = (Collection) this.L$2;
            aVar = (com.ybsdk.feature.divkit.api.domain.a) this.L$1;
            getDashboardResponse = (GetDashboardResponse) this.L$0;
            kotlin.b.b(obj);
            Object b = ((Result) obj).getValue();
            Throwable a = Result.a(b);
            if (a != null) {
                nigVar = new nig((rr51) b, screenItem.getItemType());
            } else {
                x4c.g("Can't parse dashboard divKit", a, null, null, 12);
                nigVar = null;
            }
            if (nigVar != null) {
                collection.add(nigVar);
            }
            if (it.hasNext()) {
                screenItem = (ScreenItem) it.next();
                DivDataDto divKitData = screenItem.getDivKitData();
                this.L$0 = getDashboardResponse;
                this.L$1 = aVar;
                this.L$2 = collection;
                this.L$3 = it;
                this.L$4 = screenItem;
                this.label = 1;
                b = aVar.b(divKitData, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Throwable a2 = Result.a(b);
                if (a2 != null) {
                }
                if (nigVar != null) {
                }
                if (it.hasNext()) {
                    List list = (List) collection;
                    List<DashboardFullScreenResponse> fullScreens = getDashboardResponse.getFullScreens();
                    int i2 = 10;
                    if (fullScreens != null) {
                        List<DashboardFullScreenResponse> list2 = fullScreens;
                        ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
                        for (DashboardFullScreenResponse dashboardFullScreenResponse : list2) {
                            arrayList3.add(new qis(dashboardFullScreenResponse.getEventId(), FullScreenEntity$Type.DASHBOARD, dashboardFullScreenResponse.getUrl(), dashboardFullScreenResponse.getName(), true, dashboardFullScreenResponse.getDropSessionsWithoutFullscreensOnShow()));
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    DashboardBalanceModel balance = getDashboardResponse.getBalance();
                    jo4 b2 = jy00.b(balance.getTitle());
                    jo4 b3 = jy00.b(balance.getValue());
                    BalanceItem subtitle = balance.getSubtitle();
                    nhg nhgVar = new nhg(b2, b3, subtitle != null ? jy00.b(subtitle) : null, qxy0.a(balance.getValue().getColoredText().getThemedColor(), ung0.ybColor_textIcon_primary), qxy0.a(balance.getTitle().getColoredText().getThemedColor(), ung0.ybColor_textIcon_primary));
                    String agreementId = getDashboardResponse.getAgreementId();
                    DashboardNavigationItemModel navigationItem = getDashboardResponse.getNavigationItem();
                    int i3 = 14;
                    if (navigationItem != null) {
                        rbv f = job1.f(qxy0.c(navigationItem.getImage(), null), new suf(i2));
                        if (f == null) {
                            x4c.g("Error parsing DashboardNavigationItemModel image", null, null, null, 14);
                            skgVar2 = null;
                        } else {
                            skgVar2 = new skg(g8e.i(Text.Companion, navigationItem.getTitle()), f);
                        }
                        skgVar = skgVar2;
                    } else {
                        skgVar = null;
                    }
                    List<HeaderTopButtonsResponse> topButtons = getDashboardResponse.getTopButtons();
                    ArrayList arrayList4 = new ArrayList();
                    for (HeaderTopButtonsResponse headerTopButtonsResponse : topButtons) {
                        rbv f2 = job1.f(qxy0.c(headerTopButtonsResponse.getImage(), r4), new suf(11));
                        if (f2 == null) {
                            x4c.g("Error parsing DashboardNavigationItemModel image", r4, r4, r4, i3);
                            z = z2;
                            TopButtonTag topButtonTag4 = r4;
                            topButtonTag = topButtonTag4;
                            topButtonTag3 = topButtonTag4;
                        } else {
                            TopButtonTag[] values = TopButtonTag.values();
                            int length = values.length;
                            int i4 = 0;
                            TopButtonTag topButtonTag5 = r4;
                            while (true) {
                                if (i4 >= length) {
                                    topButtonTag = topButtonTag5;
                                    topButtonTag2 = topButtonTag;
                                    break;
                                }
                                topButtonTag2 = values[i4];
                                String name = topButtonTag2.name();
                                topButtonTag = topButtonTag5;
                                Locale locale = Locale.ROOT;
                                if (name.toLowerCase(locale).equals(headerTopButtonsResponse.getTag().toLowerCase(locale))) {
                                    break;
                                }
                                i4++;
                                topButtonTag5 = topButtonTag;
                            }
                            if (topButtonTag2 == null) {
                                topButtonTag2 = TopButtonTag.UNKNOWN;
                            }
                            TopButtonTag topButtonTag6 = topButtonTag2;
                            String action = headerTopButtonsResponse.getAction();
                            int i5 = nkg.a[topButtonTag6.ordinal()];
                            z = true;
                            if (i5 == 1) {
                                r6 = unr0.h(Text.Companion, dzh0.ybsdk_dashboard_action_contact_support_title);
                            } else if (i5 == 2) {
                                r6 = unr0.h(Text.Companion, dzh0.ybsdk_dashboard_action_profile_title);
                            } else if (i5 == 3) {
                                r6 = unr0.h(Text.Companion, dzh0.ybsdk_dashboard_action_qr_code_transfer_title);
                            } else {
                                if (i5 != 4) {
                                    w511.b();
                                    return topButtonTag;
                                }
                                r6 = topButtonTag;
                            }
                            topButtonTag3 = new bwz0(action, f2, topButtonTag6, r6);
                        }
                        if (topButtonTag3 != null) {
                            arrayList4.add(topButtonTag3);
                        }
                        z2 = z;
                        r4 = topButtonTag;
                        i3 = 14;
                    }
                    DashboardCardInfoEntity dashboardCardInfoEntity = r4;
                    String cursor = getDashboardResponse.getCursor();
                    NextPageLoadingStatus nextPageLoadingStatus = NextPageLoadingStatus.FINISH;
                    CardInfo cardInfo = getDashboardResponse.getCardInfo();
                    DashboardCardInfoEntity d = cardInfo != null ? rh10.d(cardInfo) : dashboardCardInfoEntity;
                    DashboardBottomButton bottomButton = getDashboardResponse.getBottomButton();
                    if (bottomButton != null) {
                        Text.Constant i6 = g8e.i(Text.Companion, bottomButton.getTitle());
                        String subtitle2 = bottomButton.getSubtitle();
                        r21 = new phg(i6, subtitle2 != null ? new Text.Constant(subtitle2) : dashboardCardInfoEntity, bottomButton.getAction());
                    } else {
                        r21 = dashboardCardInfoEntity;
                    }
                    return new x5t(list, arrayList, nhgVar, agreementId, skgVar, arrayList4, cursor, nextPageLoadingStatus, d, r21);
                }
            }
        }
    }
}
