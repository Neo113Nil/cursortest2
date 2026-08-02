package xsna;

import android.os.SystemClock;
import com.vk.clips.sdk.models.ads.SdkOrdAdvertiser;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.log.L;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import xsna.jhw0;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g1s0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ g1s0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object failure;
        boolean z = false;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                break;
            case 1:
                OrdAdInfo ordAdInfo = (OrdAdInfo) obj;
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                if (ordAdInfo != null) {
                    String str = ordAdInfo.b;
                    List<OrdAdvertiser> list = ordAdInfo.c;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    for (OrdAdvertiser ordAdvertiser : list) {
                        arrayList.add(new SdkOrdAdvertiser(ordAdvertiser.b, ordAdvertiser.c));
                    }
                    break;
                }
                break;
            case 2:
                int intValue = ((Integer) obj).intValue();
                if (360 <= intValue && intValue < 720) {
                    z = true;
                }
                break;
            case 3:
                h03.b((Throwable) obj);
                break;
            case 4:
                break;
            case 5:
                jhw0.b bVar = (jhw0.b) obj;
                if (bVar.a && (bVar.e instanceof jhw0.a.e) && (bVar.f instanceof jhw0.d.c)) {
                    z = true;
                }
                break;
            case 6:
                int i = VoipCallServiceFragment.Y;
                qgi0.r((tgi0) obj, "VoipCallService.History");
                break;
            case 7:
                fjw0 fjw0Var = (fjw0) obj;
                atw0 atw0Var = atw0.a;
                VoipViewModelState voipViewModelState = fjw0Var.b;
                VoipViewModelState voipViewModelState2 = fjw0Var.a;
                VoipViewModelState voipViewModelState3 = VoipViewModelState.Idle;
                if (voipViewModelState == voipViewModelState3 && voipViewModelState2 == VoipViewModelState.ReceivingCallFromPeer) {
                    atw0Var.getClass();
                    few fewVar = atw0.c;
                    if (fewVar != null) {
                        atw0.b.removeCallbacks(fewVar);
                    }
                    atw0.c = null;
                    few fewVar2 = new few(1);
                    atw0.c = fewVar2;
                    atw0.b.postDelayed(fewVar2, 2000L);
                }
                if (voipViewModelState2 == voipViewModelState3) {
                    atw0Var.getClass();
                    few fewVar3 = atw0.c;
                    if (fewVar3 != null) {
                        atw0.b.removeCallbacks(fewVar3);
                    }
                    atw0.c = null;
                    if (atw0.d) {
                        atw0.d = false;
                        try {
                            k840.a.g().b().f(new PlaybackActionMeta(2, SystemClock.elapsedRealtime()));
                            failure = s3q0.a;
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        Throwable a = Result.a(failure);
                        if (a != null) {
                            L.f("VoipMusicPlaybackFallback", "Failed to resume music playback after call", a);
                        }
                    }
                }
                break;
            case 8:
                int i2 = VoipPastCallsFragment.a0;
                qgi0.r((tgi0) obj, "VoipPastCalls.Back");
                break;
            default:
                break;
        }
        return s3q0.a;
    }
}
