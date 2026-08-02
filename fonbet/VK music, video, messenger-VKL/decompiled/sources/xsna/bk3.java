package xsna;

import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.impl.support.ParentSupportFragment;
import com.vk.core.fragments.internal.transition.TransitionAnimation;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ArgumentsBasedTransitionProvider.kt */
/* loaded from: classes3.dex */
public final class bk3 implements hds {
    @Override // xsna.hds
    public final Map a(FragmentImpl fragmentImpl) {
        Bundle arguments = fragmentImpl.getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("shared_elements") : null;
        HashMap hashMap = serializable instanceof HashMap ? (HashMap) serializable : null;
        return hashMap != null ? hashMap : jgp.b;
    }

    @Override // xsna.hds
    public final TransitionAnimation.Animations b(ParentSupportFragment parentSupportFragment) {
        Bundle arguments = parentSupportFragment.getArguments();
        if (arguments == null || arguments.getBoolean("withoutAnimation")) {
            return null;
        }
        return (TransitionAnimation.Animations) arguments.getParcelable("transition");
    }
}
