package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VoipCreateScheduleCallFragment.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class dnw0 extends FunctionReferenceImpl implements wzs<CallId, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(CallId callId, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel) {
        ((VoipCreateScheduleCallFragment) this.receiver).io(callId, sharingChannel);
        return s3q0.a;
    }
}
