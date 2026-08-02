package xsna;

import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class atb implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ atb() {
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                s3q0 s3q0Var = s3q0.a;
                break;
            default:
                GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
                if (!(obj instanceof fjw0)) {
                    if (obj instanceof r3x0) {
                        GroupCallViewModel.GroupCallViewMode groupCallViewMode = GroupCallViewModel.e;
                        GroupCallViewModel.GroupCallViewMode groupCallViewMode2 = GroupCallViewModel.GroupCallViewMode.GridViewMode;
                        if (groupCallViewMode == groupCallViewMode2) {
                            groupCallViewMode2 = GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode;
                        }
                        groupCallViewModel.getClass();
                        GroupCallViewModel.p(groupCallViewMode2);
                        break;
                    }
                } else {
                    fjw0 fjw0Var = (fjw0) obj;
                    VoipViewModelState voipViewModelState = fjw0Var.b;
                    VoipViewModelState voipViewModelState2 = fjw0Var.a;
                    groupCallViewModel.getClass();
                    if (voipViewModelState2 == VoipViewModelState.Idle) {
                        GroupCallViewModel.k.clear();
                        GroupCallViewModel.g.clear();
                        GroupCallViewModel.h.clear();
                        GroupCallViewModel.r();
                        GroupCallViewModel.e();
                        liu liuVar = GroupCallViewModel.r;
                        liuVar.e = null;
                        liuVar.f = null;
                        liuVar.d = null;
                        liuVar.c = null;
                        liuVar.a();
                        GroupCallViewModel.n.c = null;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ atb(pl2 pl2Var) {
    }
}
