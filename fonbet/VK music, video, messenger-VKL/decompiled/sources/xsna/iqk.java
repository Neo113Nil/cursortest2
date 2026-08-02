package xsna;

import com.vk.dto.user.UserProfile;
import com.vk.privacyui.PrivacyEditFragment;
import java.util.function.Predicate;
import xsna.eqy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class iqk implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ iqk(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                pt50 pt50Var = (pt50) obj;
                if (!(pt50Var instanceof ame0) && !(pt50Var instanceof one.video.calls.sdk_private.b)) {
                    break;
                }
                break;
            case 1:
                int[] iArr = PrivacyEditFragment.W0;
                if (((UserProfile) obj).c.b >= 2000000000) {
                    break;
                }
                break;
            default:
                eqy0.b bVar = (eqy0.b) obj;
                if (bVar != eqy0.b.c && bVar != eqy0.b.d) {
                    break;
                }
                break;
        }
        return false;
    }
}
