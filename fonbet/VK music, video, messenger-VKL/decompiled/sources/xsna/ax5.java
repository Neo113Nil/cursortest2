package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.vk.ads.externalsdkstat.api.ExternalSdk;
import com.vk.ads.externalsdkstat.api.di.AdsSdkStatTrackerComponent;
import com.vk.ads.yandex.impl.YandexAdFeatureImpl;
import com.vk.ads.yandex.impl.di.YandexAdFeatureComponentImpl;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.UserProfile;
import com.vk.googleump.api.di.GoogleUMPComponent;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import xsna.dis0;
import xsna.efb;
import xsna.swi0;
import xsna.we20;
import xsna.wwi0;
import xsna.yk8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ax5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        String name;
        s3q0 allInRoomParticipants$lambda$0;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                mtk0 mtk0Var = (mtk0) obj2;
                List list = sfl0.b;
                return yk8.a.e(cx5.d(f870.c(((Number) ((List) obj3).get(0)).intValue())), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (((ov70) mtk0Var.getValue()).a >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (((ov70) mtk0Var.getValue()).a & 4294967295L))) & 4294967295L), ((Number) ((mtk0) obj).getValue()).floatValue() * 1.8f, 8);
            case 1:
                return (efb.b) ((l7r0) obj3).d((ij20) obj2, (efb.a) obj);
            case 2:
                vwn vwnVar = (vwn) obj2;
                z0o z0oVar = (z0o) obj;
                Action action = ((iyn) obj3).j;
                if (action instanceof ActionOpenUrl) {
                    ActionOpenUrl actionOpenUrl = (ActionOpenUrl) action;
                    UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                    String m = (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null || (name = mobileOfficialAppsCoreNavStat$EventScreen.name()) == null) ? "group" : cqm0.m(name);
                    Uri parse = Uri.parse(actionOpenUrl.c);
                    String path = parse.getPath();
                    if (path == null || !drm0.D(path, "@donut-faq", false)) {
                        String fragment = parse.getFragment();
                        if (fragment != null) {
                            parse = parse.buildUpon().encodedFragment(Uri.parse(fragment).buildUpon().appendQueryParameter("screen", m).build().toString()).build();
                        }
                        actionOpenUrl = new ActionOpenUrl(parse.toString(), actionOpenUrl.d);
                    }
                    di60.w(actionOpenUrl, vwnVar.getContext(), null, null, null, null, 62);
                } else {
                    di60.w(action, vwnVar.getContext(), null, null, null, null, 62);
                }
                myn mynVar = z0oVar.i;
                mynVar.getClass();
                new bjc(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(mynVar.a.b), null, null, null, 58, null), new CommonCommunitiesStat$TypeDonutClick(CommonCommunitiesStat$TypeDonutClick.EventType.CLICK_DONUT_BANNER_SUBSCRIBE, null, null, 6, null), 2)).q();
                return s3q0.a;
            case 3:
                ((k5q) obj3).j((soz) obj2, (or10) obj, "fragment_loaded");
                return s3q0.a;
            case 4:
                FriendsSuggestsVh friendsSuggestsVh = (FriendsSuggestsVh) obj3;
                Context context = (Context) obj2;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj;
                CatalogDataType catalogDataType = uIBlockProfile.e;
                CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
                UserProfile userProfile = uIBlockProfile.A;
                if (catalogDataType == CatalogDataType.DATA_TYPE_CATALOG_USERS) {
                    CatalogViewType catalogViewType = uIBlockProfile.d;
                    CatalogViewType catalogViewType2 = CatalogViewType.SYNTHETIC_LIST_FOLLOWERS;
                }
                friendsSuggestsVh.c(FriendsAnalyticsInfo.ClickTarget.RemoveFromFriends);
                nts ntsVar = (nts) friendsSuggestsVh.f.getValue();
                UserId userId = userProfile.c;
                UiTracker uiTracker = UiTracker.a;
                friendsSuggestsVh.g(context, uIBlockProfile, nts.g(ntsVar, userId, null, catalogUserMeta.d, UiTracker.d(), null, 18), new l22(15, uIBlockProfile, friendsSuggestsVh));
                return s3q0.a;
            case 5:
                return (we20.b) ((l7r0) obj3).d((ij20) obj2, (we20.a) obj);
            case 6:
                allInRoomParticipants$lambda$0 = SessionRoomParticipantsDataProviderImpl.getAllInRoomParticipants$lambda$0((Set) obj3, (SessionRoomParticipantsDataProviderImpl) obj2, (izs) obj);
                return allInRoomParticipants$lambda$0;
            case 7:
                mwi0 mwi0Var = (mwi0) obj2;
                wwi0.c.C3962c c3962c = (wwi0.c.C3962c) obj;
                wwi0.b bVar = ((wwi0) obj3).e;
                mwi0Var.T(new swi0.g(bVar instanceof wwi0.b.C3961b ? ((wwi0.b.C3961b) bVar).a : wwi0.c.b.a, c3962c));
                return s3q0.a;
            case 8:
                arl0 arl0Var = (arl0) obj3;
                opl0 opl0Var = arl0Var.x;
                opl0Var.setItems((ArrayList) obj2);
                opl0Var.notifyItemChanged(((StoriesContainer) obj).n);
                arl0Var.o6();
                return s3q0.a;
            case 9:
                n0t0 n0t0Var = (n0t0) obj3;
                VideoFileOld videoFileOld = (VideoFileOld) obj2;
                czs0 czs0Var = (czs0) obj;
                Activity h = e3m.h(n0t0Var.itemView.getContext());
                if (h == null) {
                    c63 c63Var = c63.a;
                    h = c63.b();
                    if (h == null) {
                        return s3q0.a;
                    }
                }
                Activity activity = h;
                Object obj4 = dis0.t;
                n0t0Var.x = dis0.a.b(videoFileOld, activity, true, false, w8o.d(czs0Var.b.c), 40);
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr = YandexAdFeatureComponentImpl.b;
                m11 J8 = ((AdsSdkStatTrackerComponent) obj3).J8(ExternalSdk.YANDEX);
                lau P4 = ((GoogleUMPComponent) obj2).P4();
                P4.d(J8);
                return new YandexAdFeatureImpl(P4, ((AppContextDiComponent) obj).a, J8);
        }
    }
}
