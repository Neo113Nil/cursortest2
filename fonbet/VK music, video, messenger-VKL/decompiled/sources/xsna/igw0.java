package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import com.vk.voip.ui.call_by_link.feature.VoipCallByLinkState;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VoipCallByLinkReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class igw0 extends FunctionReferenceImpl implements izs<VoipCallByLinkState, VoipCallByLinkViewState.ContentDialog> {
    @Override // xsna.izs
    public final VoipCallByLinkViewState.ContentDialog invoke(VoipCallByLinkState voipCallByLinkState) {
        VoipCallByLinkViewState.ContentDialog.Item bVar;
        int i;
        int i2;
        int i3;
        int i4;
        VoipCallByLinkState voipCallByLinkState2 = voipCallByLinkState;
        xfw0 xfw0Var = (xfw0) this.receiver;
        xfw0Var.getClass();
        if (voipCallByLinkState2 instanceof VoipCallByLinkState.a) {
            return VoipCallByLinkViewState.ContentDialog.b.a;
        }
        if (voipCallByLinkState2 instanceof VoipCallByLinkState.b) {
            return VoipCallByLinkViewState.ContentDialog.c.a;
        }
        if (!(voipCallByLinkState2 instanceof VoipCallByLinkState.Content)) {
            throw new NoWhenBranchMatchedException();
        }
        VoipCallByLinkState.Content content = (VoipCallByLinkState.Content) voipCallByLinkState2;
        VoipCallByLinkState.Content.c cVar = content.b;
        if (cVar instanceof VoipCallByLinkState.Content.c.a) {
            return VoipCallByLinkViewState.ContentDialog.a.a;
        }
        if (!(cVar instanceof VoipCallByLinkState.Content.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        b25 b25Var = xfw0Var.a;
        List<cgw0> list = content.c;
        VoipCallByLinkState.Content.f fVar = content.i;
        VoipCallByLinkState.Content.e eVar = content.h;
        VoipCallByLinkViewState.ContentDialog.Item.Setting setting = null;
        if (list.isEmpty()) {
            bVar = null;
        } else {
            VoipCallByLinkState.Content.b bVar2 = content.d;
            if (bVar2 instanceof VoipCallByLinkState.Content.b.a) {
                a.b.C1179b c1179b = new a.b.C1179b(b25Var.o().b);
                Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                bVar = new VoipCallByLinkViewState.ContentDialog.Item.a.C2031a(c1179b, ImageList.a.c(-1, -1, b25Var.o().c), b25Var.o().b, b25Var.o().j);
            } else {
                if (!(bVar2 instanceof VoipCallByLinkState.Content.b.C2013b)) {
                    throw new NoWhenBranchMatchedException();
                }
                cgw0 cgw0Var = ((VoipCallByLinkState.Content.b.C2013b) bVar2).a;
                bVar = new VoipCallByLinkViewState.ContentDialog.Item.a.b(cgw0Var.c, cgw0Var.b, cgw0Var.d);
            }
        }
        VoipCallByLinkViewState.ContentDialog.Item.Setting setting2 = new VoipCallByLinkViewState.ContentDialog.Item.Setting(VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.WAITING_HALL, R.drawable.vk_icon_door_arrow_right_outline_28, R.string.voip_call_by_link_setting_waiting_hall_title, R.string.voip_call_by_link_setting_waiting_hall_subtitle, content.e.a ? VoipCallByLinkViewState.ContentDialog.Item.Setting.a.C2030a.a : VoipCallByLinkViewState.ContentDialog.Item.Setting.a.c.a);
        VoipCallByLinkViewState.ContentDialog.Item.Setting setting3 = new VoipCallByLinkViewState.ContentDialog.Item.Setting(VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.ANONYMOUS_JOIN, R.drawable.vk_icon_incognito_outline_28, R.string.voip_call_by_link_setting_anonymous_join_title, R.string.voip_call_by_link_setting_anonymous_join_subtitle, content.f.a ? VoipCallByLinkViewState.ContentDialog.Item.Setting.a.C2030a.a : VoipCallByLinkViewState.ContentDialog.Item.Setting.a.c.a);
        VoipCallByLinkViewState.ContentDialog.Item.Setting.Type type = VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.MEDIA_MICROPHONES;
        VoipCallByLinkState.Content.e.c cVar3 = VoipCallByLinkState.Content.e.c.a;
        if (epx.f(eVar, cVar3) || epx.f(eVar, VoipCallByLinkState.Content.e.a.a)) {
            i = R.drawable.vk_icon_voice_outline_28;
        } else {
            if (!epx.f(eVar, VoipCallByLinkState.Content.e.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_mic_slash_outline_28;
        }
        boolean f = epx.f(eVar, cVar3);
        int i5 = R.string.voip_call_by_link_setting_media_state_disabled_permanent;
        if (f) {
            i2 = R.string.voip_call_by_link_setting_media_state_enabled;
        } else if (epx.f(eVar, VoipCallByLinkState.Content.e.a.a)) {
            i2 = R.string.voip_call_by_link_setting_media_state_disabled_on_join_microphone;
        } else {
            if (!epx.f(eVar, VoipCallByLinkState.Content.e.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.voip_call_by_link_setting_media_state_disabled_permanent;
        }
        VoipCallByLinkViewState.ContentDialog.Item.Setting.a.b bVar3 = VoipCallByLinkViewState.ContentDialog.Item.Setting.a.b.a;
        VoipCallByLinkViewState.ContentDialog.Item.Setting setting4 = new VoipCallByLinkViewState.ContentDialog.Item.Setting(type, i, R.string.voip_call_by_link_setting_media_microphones_title, i2, bVar3);
        VoipCallByLinkViewState.ContentDialog.Item.Setting.Type type2 = VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.MEDIA_VIDEO;
        VoipCallByLinkState.Content.f.c cVar4 = VoipCallByLinkState.Content.f.c.a;
        if (epx.f(fVar, cVar4) || epx.f(fVar, VoipCallByLinkState.Content.f.a.a)) {
            i3 = R.drawable.vk_icon_videocam_outline_28;
        } else {
            if (!epx.f(fVar, VoipCallByLinkState.Content.f.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R.drawable.vk_icon_videocam_slash_outline_28;
        }
        int i6 = i3;
        if (epx.f(fVar, cVar4)) {
            i4 = R.string.voip_call_by_link_setting_media_state_enabled;
        } else {
            if (epx.f(fVar, VoipCallByLinkState.Content.f.a.a)) {
                i5 = R.string.voip_call_by_link_setting_media_state_disabled_on_join_camera;
            } else if (!epx.f(fVar, VoipCallByLinkState.Content.f.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i4 = i5;
        }
        VoipCallByLinkViewState.ContentDialog.Item.Setting setting5 = new VoipCallByLinkViewState.ContentDialog.Item.Setting(type2, i6, R.string.voip_call_by_link_setting_media_video_title, i4, bVar3);
        VoipCallByLinkState.Content.h hVar = content.k;
        if (hVar.a) {
            setting = new VoipCallByLinkViewState.ContentDialog.Item.Setting(VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.WATCH_TOGETHER, R.drawable.vk_icon_logo_vk_video_outline_28, R.string.voip_call_by_link_setting_watch_together_title, R.string.voip_call_by_link_setting_watch_together_subtitle, hVar.b ? VoipCallByLinkViewState.ContentDialog.Item.Setting.a.C2030a.a : VoipCallByLinkViewState.ContentDialog.Item.Setting.a.c.a);
        }
        return new VoipCallByLinkViewState.ContentDialog.d(rl3.I(new VoipCallByLinkViewState.ContentDialog.Item[]{VoipCallByLinkViewState.ContentDialog.Item.b.b, bVar, setting2, setting3, setting4, setting5, setting, new VoipCallByLinkViewState.ContentDialog.Item.Setting(VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.FEEDBACK, R.drawable.vk_icon_hand_heart_outline_28, R.string.voip_call_by_link_setting_feedback_title, R.string.voip_call_by_link_setting_feedback_subtitle, content.g.a ? VoipCallByLinkViewState.ContentDialog.Item.Setting.a.C2030a.a : VoipCallByLinkViewState.ContentDialog.Item.Setting.a.c.a)}));
    }
}
