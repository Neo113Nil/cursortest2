package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.internal.transition.impl.TransitionAnimationSimple$Companion$Type;
import com.vk.importcontacts.impl.presentation.details.fragment.ImportContactsDetailsFragment;
import com.vk.importcontacts.impl.presentation.main.fragment.ImportContactsFragment;
import com.vk.socialgraph.init.SocialGraphLoginFragmentNewContainer;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ImportContactsRouterImpl.kt */
/* loaded from: classes2.dex */
public final class pqw implements oqw {
    @Override // xsna.oqw
    public final void a(SocialGraphLoginFragmentNewContainer socialGraphLoginFragmentNewContainer) {
        oz50 oz50Var = new oz50(ImportContactsFragment.class, null, null);
        oz50Var.s(true);
        oz50Var.t();
        oz50Var.g(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, socialGraphLoginFragmentNewContainer);
    }

    @Override // xsna.oqw
    public final void b(FragmentImpl fragmentImpl) {
        oz50 oz50Var = new oz50(ImportContactsDetailsFragment.class, null, null);
        oz50Var.s(true);
        oz50Var.t();
        oz50Var.u(TransitionAnimationSimple$Companion$Type.SLIDE_FROM_RIGHT.h());
        oz50Var.g(111, fragmentImpl);
    }
}
