package xsna;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.B5;
import com.vk.api.generated.video.dto.VideoLiveStatusDto;
import com.vk.api.generated.video.dto.VideoVideoLiveStatusItemDto;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.feed.design.view.newsfeed.link.EnhancedFeedLinkCard;
import com.vk.feed.design.view.newsfeed.link.FeedLinkCard;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.media.MediaFilteringStrategy;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.pushes.receivers.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.ddd0;
import xsna.drz;
import xsna.pst;
import xsna.tj50;
import xsna.tsf0;
import xsna.usf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nyq implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ nyq(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                EnhancedFeedLinkCard enhancedFeedLinkCard = new EnhancedFeedLinkCard((Context) obj, null, 6);
                enhancedFeedLinkCard.setContent(new FeedLinkCard.b.a("https://sun9-16.userapi.com/s/v1/ig2/C16DtmtNbwTY7LP95rHkQBWEQYvN352fIARx-LfyCzry79HMHg8zk-lcXIW6m-LdKWj32S9fn3-5ew1CxkvE645W.jpg?quality=95&as=32x18,48x27,72x40,108x61,160x90,240x135,360x202,480x270,540x304,640x360,720x405,1080x607,1280x720,1440x810,1920x1080&from=bu&cs=1920x0", null, true, "H,2:1"));
                enhancedFeedLinkCard.setOverlayContent(new FeedLinkCard.OverlayContent.ActionButtonWithTitle("Очень длинный заголовок на столько, что должен не вмещаться в одну строку и, возможно, даже в три строки", "Читать", FeedLinkCard.OverlayContent.ActionButtonWithTitle.Appearance.Primary));
                return enhancedFeedLinkCard;
            case 1:
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (VideoVideoLiveStatusItemDto videoVideoLiveStatusItemDto : (List) obj) {
                    if (videoVideoLiveStatusItemDto.d() == VideoLiveStatusDto.FINISHED) {
                        linkedHashSet.add(Integer.valueOf(videoVideoLiveStatusItemDto.getId()));
                    }
                }
                return linkedHashSet;
            case 2:
                DialogsHistory dialogsHistory = new DialogsHistory(0, 31);
                dialogsHistory.k().addAll(((wpp) obj).c.values());
                return new drz.a(new xrm(dialogsHistory, null, null, null, 14), false);
            case 3:
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
                if (optJSONObject != null) {
                    return new UserProfile(optJSONObject);
                }
                return null;
            case 4:
                return Long.valueOf(((Group) obj).b);
            case 5:
                int i = HighlightEditFragment.h0;
                qgi0.r((tgi0) obj, "edit_toolbar_title");
                return s3q0.a;
            case 6:
                int i2 = ImSelectContactsFragment.v0;
                qgi0.r((tgi0) obj, "topBarLeftIcon");
                return s3q0.a;
            case 7:
                qgi0.r((tgi0) obj, "link_vkbid_toolbar_back");
                return s3q0.a;
            case 8:
                return io.reactivex.rxjava3.core.q.T(Boolean.TRUE);
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                return v1v.a(B5.U, (String) entry.getKey(), (String) entry.getValue());
            case 10:
                return Boolean.valueOf(((x410) obj).u);
            case 11:
                return Integer.valueOf(((y810) obj).e.size());
            case 12:
                pst pstVar = (pst) obj;
                if (!(pstVar instanceof pst.d) && !(pstVar instanceof pst.b) && !(pstVar instanceof pst.a)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                return ((MediaType) obj).h();
            case 14:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) co20.k).setValue(bool);
                return s3q0.a;
            case 15:
                return ((g8i) obj).id();
            case 16:
                qgi0.r((tgi0) obj, "vk_top_bar_save_btn");
                return s3q0.a;
            case 17:
                c.a aVar = com.vk.pushes.receivers.c.b;
                z4g.d().n(false);
                return s3q0.a;
            case 18:
                qgi0.r((tgi0) obj, "NotificationsSettingsGroupping");
                return s3q0.a;
            case 19:
                qgi0.r((tgi0) obj, "deleteAllEpisodes");
                return s3q0.a;
            case 20:
                int i3 = ((u1c0) obj).c;
                if (i3 != 93 && i3 != 248 && i3 != 314) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                tj50.a aVar2 = (tj50.a) obj;
                wo40 wo40Var = new wo40(11);
                ao8 ao8Var = ao8.d;
                return new ddd0.a(aVar2.a(wo40Var, ao8Var), aVar2.a(new acc0(2), ao8Var));
            case 22:
                tsf0.a aVar3 = ((tsf0) obj).b;
                if (aVar3 instanceof tsf0.a.b.C3766a) {
                    return usf0.a.InterfaceC3823a.b.C3825a.a;
                }
                if (aVar3 instanceof tsf0.a.b.c) {
                    return usf0.a.InterfaceC3823a.b.c.a;
                }
                if (aVar3 instanceof tsf0.a.b.C3767b) {
                    return new usf0.a.InterfaceC3823a.b.C3826b(((tsf0.a.b.C3767b) aVar3).a);
                }
                if (aVar3 instanceof tsf0.a.c) {
                    return usf0.a.InterfaceC3823a.c.a;
                }
                if (aVar3 instanceof tsf0.a.C3765a) {
                    return usf0.a.InterfaceC3823a.C3824a.a;
                }
                throw new NoWhenBranchMatchedException();
            case 23:
                return s3q0.a;
            case 24:
                return (io.reactivex.rxjava3.core.p) obj;
            case 25:
                List list = (List) obj;
                Object obj2 = list.get(0);
                gno0[] gno0VarArr = fno0.b;
                izs<Object, Object> izsVar = i2h0.x.c;
                Boolean bool2 = Boolean.FALSE;
                epx.f(obj2, bool2);
                long j = (obj2 != null ? (fno0) izsVar.invoke(obj2) : null).a;
                Object obj3 = list.get(1);
                epx.f(obj3, bool2);
                return new iio0(j, (obj3 != null ? (fno0) izsVar.invoke(obj3) : null).a);
            case 26:
                Intent intent = (Intent) obj;
                intent.putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
                intent.putExtra("camera_enabled", true);
                intent.putExtra("long_previews", true);
                intent.putExtra("short_divider", true);
                intent.putExtra("prevent_styling_photo", false);
                intent.putExtra("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC);
                intent.putExtra("single_mode", true);
                return s3q0.a;
            case 27:
                return ((VideoListWithTotalCount) obj).b;
            case 28:
                return s3q0.a;
            default:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ nyq(qsf0 qsf0Var) {
        this.b = 22;
    }
}
