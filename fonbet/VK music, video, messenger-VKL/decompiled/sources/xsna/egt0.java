package xsna;

import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.ui.video2.ScreenState;
import com.vk.superapp.browser.internal.ui.communitypicker.VkCommunityPickerActivity;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import xsna.d2x0;
import xsna.e2x0;
import xsna.m5x0;
import xsna.tww0;
import xsna.xcw0;
import xsna.z0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class egt0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ egt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [xsna.jfw0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                dw20 dw20Var = ((fgt0) obj2).b;
                if (dw20Var != null) {
                    String str = dw20.d1;
                    dw20Var.Sn(null);
                }
                break;
            case 1:
                sqt0 sqt0Var = (sqt0) obj2;
                mit0 mit0Var = (mit0) obj;
                ScreenState screenState = mit0Var.c.b;
                Boolean valueOf = Boolean.valueOf(screenState == ScreenState.MINI || screenState == ScreenState.PIP);
                sqt0Var.getClass();
                drt0 drt0Var = mit0Var.c;
                break;
            case 2:
                ubu0 ubu0Var = (ubu0) obj2;
                w25 w25Var = (w25) obj;
                Bundle arguments = ubu0Var.getArguments();
                String string = arguments != null ? arguments.getString(CommonConstant.KEY_ACCESS_TOKEN) : null;
                if (string != null) {
                    UserId userId = UserId.d;
                    Bundle arguments2 = ubu0Var.getArguments();
                    String string2 = arguments2 != null ? arguments2.getString("secret") : null;
                    UtilityTokens.CREATOR.getClass();
                    break;
                }
                break;
            case 3:
                int i2 = VkCommunityPickerActivity.g;
                ((VkCommunityPickerActivity) obj2).onBackPressed();
                break;
            case 4:
                break;
            case 5:
                ((tdu) obj).b(((Number) ((mtk0) obj2).getValue()).floatValue());
                break;
            case 6:
                VkTopBarSearchQueryVh vkTopBarSearchQueryVh = (VkTopBarSearchQueryVh) obj2;
                vkTopBarSearchQueryVh.c.E2(((tho0) obj).a.c);
                vkTopBarSearchQueryVh.Km(0L);
                break;
            case 7:
                break;
            case 8:
                e8w0 e8w0Var = (e8w0) obj2;
                e8w0Var.p.setText(j03.g(e8w0Var.b, (Throwable) obj, R.string.error));
                break;
            case 9:
                final VoipCallActivity voipCallActivity = (VoipCallActivity) obj2;
                final long longValue = ((Long) obj).longValue();
                int i3 = VoipCallActivity.P;
                voipCallActivity.e2(true, new gzs() { // from class: xsna.jfw0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        int i4 = VoipCallActivity.P;
                        com.vk.voip.ui.c.b.getClass();
                        com.vk.voip.ui.c.J().b(new n19(VoipCallActivity.this, longValue));
                        return s3q0.a;
                    }
                });
                break;
            case 10:
                List<GroupsGroupFullDto> list = (List) obj;
                break;
            case 11:
                nrw0 nrw0Var = (nrw0) obj2;
                nrw0Var.q(new xcw0.w(nrw0Var.e));
                break;
            case 12:
                pww0 pww0Var = (pww0) obj2;
                Pair pair = (Pair) obj;
                List list2 = (List) pair.d();
                Pair pair2 = (Pair) pair.g();
                b25 b25Var = pww0Var.g;
                pww0Var.T(new tww0.k.c(list2, (VoipScheduleCallTimeZone) pair2.i(), (List) pair2.j(), new m6h0(false, !o25.b(b25Var), !o25.b(b25Var), ScheduledAudioMuteOption.Enabled, ScheduledVideoMuteOption.Enabled, new ScheduledWatchTogetherOption(pww0Var.l.a().invoke().booleanValue(), true), o25.b(b25Var) ? ScheduledScreenSharingMuteOption.DisabledPermanent : ScheduledScreenSharingMuteOption.Enabled, o25.b(b25Var), o25.b(b25Var))));
                break;
            case 13:
                ((w0x0) obj2).T(new z0x0.b.a((Throwable) obj));
                break;
            case 14:
                d2x0 d2x0Var = (d2x0) obj2;
                e2x0.a aVar = (e2x0.a) obj;
                if (aVar instanceof e2x0.a.b) {
                    d2x0.b bVar = d2x0Var.i1;
                    (bVar != null ? bVar : null).a.setChecked(((e2x0.a.b) aVar).a);
                } else {
                    int i4 = d2x0.j1;
                }
                break;
            default:
                ((v5x0) obj2).C(new m5x0.a((w5w0) obj));
                break;
        }
        return s3q0.a;
    }
}
