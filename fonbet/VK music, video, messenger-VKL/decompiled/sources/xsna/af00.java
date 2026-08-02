package xsna;

import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MainMenuLayerDelegate.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class af00 extends FunctionReferenceImpl implements izs<GroupCallViewModel.GroupCallViewMode, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(GroupCallViewModel.GroupCallViewMode groupCallViewMode) {
        ((ze00) this.receiver).b().setPortalVisible(!com.vk.voip.ui.c.b.s0() || groupCallViewMode == GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode);
        return s3q0.a;
    }
}
