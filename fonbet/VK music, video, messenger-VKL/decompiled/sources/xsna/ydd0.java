package xsna;

import com.vk.dto.user.UserProfile;
import com.vk.privacyui.PrivacyEditFragment;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ydd0 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int[] iArr = PrivacyEditFragment.W0;
        return ((UserProfile) obj).c.b < 2000000000;
    }
}
