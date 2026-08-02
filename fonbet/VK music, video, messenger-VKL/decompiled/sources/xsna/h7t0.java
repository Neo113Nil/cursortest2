package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vk.voip.ui.scheduled.creation.ui.settings.ui.state.VoipScheduledCallSettingsContentViewState$ScreenState$Item;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.c9t0;
import xsna.iyw0;
import xsna.qtk0;
import xsna.w6t0;
import xsna.y88;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h7t0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ h7t0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting;
        int i;
        char c;
        switch (this.b) {
            case 0:
                boolean z = false;
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock.e == CatalogDataType.DATA_TYPE_SEARCH_AUTHORS && uIBlock.d == CatalogViewType.LIST_WITH_NOTIFICATION_STATE) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                c9t0 c9t0Var = (c9t0) obj;
                y88 b = c9t0Var.b();
                if (b instanceof y88.a) {
                    if (c9t0Var instanceof c9t0.e) {
                        qtk0<u490> qtk0Var = ((c9t0.e) c9t0Var).e;
                        if (qtk0Var instanceof qtk0.a) {
                            qtk0.a aVar = (qtk0.a) qtk0Var;
                            long j = fkq0.a(((u490) aVar.a).a.b).b;
                            u490 u490Var = (u490) aVar.a;
                            return new w6t0.a(j, u490Var.h, u490Var.f, u490Var.d, u490Var.e, u490Var.g, u490Var.u);
                        }
                    }
                    return w6t0.b.a;
                }
                if (b instanceof y88.c) {
                    return w6t0.c.a;
                }
                if (!(b instanceof y88.d)) {
                    return w6t0.b.a;
                }
                if (c9t0Var instanceof c9t0.e) {
                    qtk0<u490> qtk0Var2 = ((c9t0.e) c9t0Var).e;
                    if (qtk0Var2 instanceof qtk0.a) {
                        VideoNotificationsStatus videoNotificationsStatus = ((u490) ((qtk0.a) qtk0Var2).a).j;
                        return videoNotificationsStatus == null ? w6t0.b.a : new w6t0.d(videoNotificationsStatus);
                    }
                }
                return w6t0.b.a;
            case 2:
                ((jwr) obj).c(false);
                return s3q0.a;
            case 3:
                return (Map) obj;
            default:
                iyw0.a aVar2 = (iyw0.a) obj;
                VoipFeatures voipFeatures = VoipFeatures.VOIP_READ_CHAT_HISTORY;
                voipFeatures.getClass();
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting2 = null;
                if (com.vk.toggle.b.A.a(voipFeatures)) {
                    setting = new VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting(VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.SHOULD_SHOW_CHAT_HISTORY, R.string.voip_call_by_link_settings_chat_history, aVar2.j ? VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.C2074a.a : VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.c.a, null);
                } else {
                    setting = null;
                }
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type type = VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.AUDIO_MUTE;
                int i2 = nyw0.$EnumSwitchMapping$0[aVar2.e.ordinal()];
                int i3 = R.string.voip_call_by_link_setting_media_state_enabled;
                if (i2 == 1) {
                    i = R.string.voip_call_by_link_setting_media_state_enabled;
                } else if (i2 == 2) {
                    i = R.string.voip_call_by_link_setting_media_state_disabled_on_join_microphone;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.voip_call_by_link_setting_media_state_disabled_permanent;
                }
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.b bVar = VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.b.a;
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting3 = new VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting(type, R.string.voip_call_by_link_setting_media_microphones_title, bVar, Integer.valueOf(i));
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type type2 = VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.VIDEO_MUTE;
                int i4 = nyw0.$EnumSwitchMapping$1[aVar2.f.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        i3 = R.string.voip_call_by_link_setting_media_state_disabled_on_join_camera;
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = R.string.voip_call_by_link_setting_media_state_disabled_permanent;
                    }
                }
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting4 = new VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting(type2, R.string.voip_call_by_link_setting_video_mute, bVar, Integer.valueOf(i3));
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting5 = new VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting(VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.SCREEN_SHARING, R.string.voip_call_by_link_setting_share_screen, aVar2.h.a ? VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.C2074a.a : VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.c.a, null);
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting6 = new VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting(VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.RECORD, R.string.voip_call_by_link_setting_record, aVar2.i ? VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.c.a : VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.C2074a.a, null);
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting7 = new VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting(VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.FEEDBACK, R.string.voip_call_by_link_setting_feedback_title, aVar2.d ? VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.C2074a.a : VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.c.a, null);
                ScheduledWatchTogetherOption scheduledWatchTogetherOption = aVar2.g;
                if (scheduledWatchTogetherOption.b) {
                    c = 2;
                    setting2 = new VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting(VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.WATCH_TOGETHER_ITEM, R.string.voip_call_by_link_setting_watch_together_title, scheduledWatchTogetherOption.c ? VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.C2074a.a : VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.c.a, null);
                } else {
                    c = 2;
                }
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.a aVar3 = new VoipScheduledCallSettingsContentViewState$ScreenState$Item.a();
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting8 = new VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting(VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.WAITING_HALL, R.string.voip_call_by_link_setting_waiting_hall_title, aVar2.b ? VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.C2074a.a : VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.c.a, Integer.valueOf(R.string.voip_call_by_link_setting_waiting_hall_subtitle));
                VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting9 = new VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting(VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.ANONYMOUS_JOIN, R.string.voip_call_by_link_setting_anonymous_join_title, aVar2.c ? VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.C2074a.a : VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.c.a, Integer.valueOf(R.string.voip_call_by_link_setting_anonymous_join_subtitle));
                VoipScheduledCallSettingsContentViewState$ScreenState$Item[] voipScheduledCallSettingsContentViewState$ScreenState$ItemArr = new VoipScheduledCallSettingsContentViewState$ScreenState$Item[10];
                voipScheduledCallSettingsContentViewState$ScreenState$ItemArr[0] = setting3;
                voipScheduledCallSettingsContentViewState$ScreenState$ItemArr[1] = setting4;
                voipScheduledCallSettingsContentViewState$ScreenState$ItemArr[c] = setting5;
                voipScheduledCallSettingsContentViewState$ScreenState$ItemArr[3] = setting6;
                voipScheduledCallSettingsContentViewState$ScreenState$ItemArr[4] = setting7;
                voipScheduledCallSettingsContentViewState$ScreenState$ItemArr[5] = setting2;
                voipScheduledCallSettingsContentViewState$ScreenState$ItemArr[6] = aVar3;
                voipScheduledCallSettingsContentViewState$ScreenState$ItemArr[7] = setting8;
                voipScheduledCallSettingsContentViewState$ScreenState$ItemArr[8] = setting9;
                voipScheduledCallSettingsContentViewState$ScreenState$ItemArr[9] = setting;
                return new byw0(rl3.I(voipScheduledCallSettingsContentViewState$ScreenState$ItemArr));
        }
    }

    public /* synthetic */ h7t0(o9t0 o9t0Var) {
        this.b = 1;
    }
}
