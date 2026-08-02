package xsna;

import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PrimaryParticipantViewPagerHelper.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class cad0 extends FunctionReferenceImpl implements izs<GroupCallViewModel.GroupCallViewMode, Boolean> {
    @Override // xsna.izs
    public final Boolean invoke(GroupCallViewModel.GroupCallViewMode groupCallViewMode) {
        GroupCallViewModel.GroupCallViewMode groupCallViewMode2 = groupCallViewMode;
        ((dad0) this.receiver).getClass();
        return Boolean.valueOf(groupCallViewMode2 == GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode);
    }
}
