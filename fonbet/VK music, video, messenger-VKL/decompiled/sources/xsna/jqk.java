package xsna;

import com.vk.dto.user.UserProfile;
import com.vk.privacyui.PrivacyEditFragment;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class jqk implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ jqk(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((pt50) obj) instanceof y7x0;
            default:
                int[] iArr = PrivacyEditFragment.W0;
                return ((UserProfile) obj).c.b < 2000000000;
        }
    }
}
