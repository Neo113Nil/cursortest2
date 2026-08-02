package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.engine.commands.dialogs.DialogArchiveUnarchiveCmd;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.fd8;
import xsna.l1j;
import xsna.oye;
import xsna.q4r;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ur0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ur0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        int i2 = 3;
        switch (this.b) {
            case 0:
                AdditionalSettingsState.Data data = (AdditionalSettingsState.Data) obj;
                return Boolean.valueOf(!data.h || data.m);
            case 1:
                if (((Context) ((mvi) obj).y0(AndroidCompositionLocals_androidKt.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return gd8.b;
                }
                fd8.a.getClass();
                return fd8.a.c;
            case 2:
                qgi0.n((tgi0) obj, 0);
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 5:
                return pvo0.i(true, ((SdkClipVideoFile) obj).b0(), true, false);
            case 6:
                return Float.valueOf(((zgd) obj).d);
            case 7:
                return s3q0.a;
            case 8:
                return (u2e) j5g.Y(((b4e) obj).a);
            case 9:
                return ((ike) obj).b;
            case 10:
                String j1 = ((VideoFile) obj).j1();
                return j1 != null ? j1 : "";
            case 11:
                return Integer.valueOf(((mue) obj).getId());
            case 12:
                tj50.a aVar = (tj50.a) obj;
                eye eyeVar = eye.b;
                ao8 ao8Var = ao8.d;
                return new oye.a(aVar.a(eyeVar, ao8Var), aVar.a(fye.b, ao8Var));
            case 13:
                return Integer.valueOf(an10.b(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(-50, 50, 1))));
            case 14:
                return new ArrayList();
            case 15:
                return CommunityEventsState.a((CommunityEventsState) obj, CommunityEventsState.Content.c.a);
            case 16:
                return s3q0.a;
            case 17:
                String url = ((MarketGetEditUrlResponseDto) obj).getUrl();
                return url == null ? "" : url;
            case 18:
                enm enmVar = new enm(R.layout.vk_dialogs_components_view_holder, (ViewGroup) obj);
                ((Button) enmVar.itemView.findViewById(R.id.modalBottomSheetBtn)).setOnClickListener(new p01(enmVar, i2));
                return enmVar;
            case 19:
                return Boolean.valueOf(((l1j.f) obj).d);
            case 20:
                return 1;
            case 21:
                qgi0.r((tgi0) obj, "successFAQButton");
                return s3q0.a;
            case 22:
                return s3q0.a;
            case 23:
                DialogArchiveUnarchiveCmd.Action action = DialogArchiveUnarchiveCmd.Action.ARCHIVE;
                return new com.vk.im.engine.internal.jobs.dialogs.a((Peer) obj);
            case 24:
                return Long.valueOf(((ua80) obj).c);
            case 25:
                q4r q4rVar = (q4r) obj;
                if (q4rVar instanceof q4r.a) {
                    r3 = ((q4r.a) q4rVar).f.a;
                } else if (q4rVar instanceof q4r.b) {
                    r3 = ((q4r.b) q4rVar).c.a;
                } else if (!(q4rVar instanceof q4r.c) && !(q4rVar instanceof q4r.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(r3);
            case 26:
                ass assVar = (ass) obj;
                int i3 = FriendRequestsFragment.d0;
                return new FriendRequestsFragment.b(null, assVar.a, assVar.b, 3);
            case 27:
                ((Boolean) obj).booleanValue();
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                return s3q0.a;
            case 28:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.d);
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    i = R.string.music_talkback_player_pause;
                } else {
                    if (booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.music_talkback_player_podcast_play;
                }
                return Integer.valueOf(i);
        }
    }
}
