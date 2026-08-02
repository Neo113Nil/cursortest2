package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.log.L;
import com.vk.music.player.LoopMode;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.notifications.core.item.NotificationImage;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.search.fragment.RestoreSearchFragment;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.webrtc.utils.retry.RetryKt;
import xsna.h0g0;
import xsna.it80;
import xsna.jd50;
import xsna.wwi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gz30 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ gz30(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        float f;
        GroupsGroupFullDto groupsGroupFullDto;
        GroupsGroupFullDto.VideoNotificationsStatusDto W2;
        String i;
        VideoNotificationsStatus videoNotificationsStatus = null;
        switch (this.b) {
            case 0:
                int i2 = kwg0.a;
                return s3q0.a;
            case 1:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 1) {
                    return BaseOkResponseDto.OK;
                }
                return null;
            case 2:
                id50 id50Var = (id50) obj;
                return new jd50.a.C3117a(id50Var.g, id50Var.d);
            case 3:
                return io.reactivex.rxjava3.core.q.T(Collections.singletonList((NewsfeedData) obj));
            case 4:
                return NotificationImage.class;
            case 5:
                return s3q0.a;
            case 6:
                ChannelMsgSendConfig channelMsgSendConfig = (ChannelMsgSendConfig) obj;
                return ChannelMsgSendConfig.a(channelMsgSendConfig, null, true ^ channelMsgSendConfig.f(), false, false, false, null, null, null, null, false, false, false, false, null, 32765);
            case 7:
                int i3 = ((u1c0) obj).c;
                return Boolean.valueOf(i3 == 147 || i3 == 145);
            case 8:
                int i4 = PostingFragment.L0;
                return s3q0.a;
            case 9:
                return ((PostingState.Editing) obj).l;
            case 10:
                qgi0.r((tgi0) obj, "PrivacySettingsToolbarCloseButton");
                return s3q0.a;
            case 11:
                qgi0.r((tgi0) obj, "product_card_top_bar_share");
                return s3q0.a;
            case 12:
                int i5 = QuestionsListFragment.f0;
                qgi0.r((tgi0) obj, "settings_button");
                return s3q0.a;
            case 13:
                int i6 = h0g0.a.$EnumSwitchMapping$0[((LoopMode) obj).ordinal()];
                if (i6 == 1) {
                    f = 0.64f;
                } else {
                    if (i6 != 2 && i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 14:
                int i7 = RestoreSearchFragment.h0;
                return ((pno0) obj).d().toString();
            case 15:
                return RetryKt.b((Throwable) obj);
            case 16:
                return new v5s(((Integer) obj).intValue());
            case 17:
                L.j((Throwable) obj, "Catalog");
                return s3q0.a;
            case 18:
                return xwi0.a(((wwi0.b.C3961b) ((wwi0) obj).e).a);
            case 19:
                return Long.valueOf(4 - ((Long) obj).longValue());
            case 20:
                Throwable th = (Throwable) obj;
                L.i(th);
                h03.b(th);
                return s3q0.a;
            case 21:
                return Boolean.TRUE;
            case 22:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM cached_subscription");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 23:
                return new l5n0((ViewGroup) obj);
            case 24:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 25:
                return s3q0.a;
            case 26:
                return ((JSONObject) obj).getJSONObject("response");
            case 27:
                return s3q0.a;
            case 28:
                it80.a aVar = it80.b;
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) != null && (W2 = groupsGroupFullDto.W2()) != null && (i = W2.i()) != null) {
                    VideoNotificationsStatus.Companion.getClass();
                    videoNotificationsStatus = VideoNotificationsStatus.a.a(i);
                }
                aVar.getClass();
                return new it80(videoNotificationsStatus);
            default:
                g620.n(0);
                return s3q0.a;
        }
    }
}
