package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.impl.support.ParentSupportFragment;
import com.vk.core.fragments.internal.transition.TransitionAnimation;
import java.util.Map;

/* compiled from: FragmentTransitionProvider.kt */
/* loaded from: classes17.dex */
public interface hds {

    /* compiled from: FragmentTransitionProvider.kt */
    public static final class a {
        public static final C2986a a = new C2986a();

        /* compiled from: FragmentTransitionProvider.kt */
        /* renamed from: xsna.hds$a$a, reason: collision with other inner class name */
        public static final class C2986a implements hds {
            @Override // xsna.hds
            public final Map a(FragmentImpl fragmentImpl) {
                return jgp.b;
            }

            @Override // xsna.hds
            public final TransitionAnimation.Animations b(ParentSupportFragment parentSupportFragment) {
                return null;
            }
        }
    }

    Map a(FragmentImpl fragmentImpl);

    TransitionAnimation.Animations b(ParentSupportFragment parentSupportFragment);
}
