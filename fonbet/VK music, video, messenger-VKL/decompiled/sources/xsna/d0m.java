package xsna;

import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import java.util.function.Predicate;
import xsna.cyn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class d0m implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ d0m(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                int i = DeprecatedAttachActivity.K0;
                String str = ((cyn0.b) obj).e;
                if (str != null && !str.isEmpty()) {
                    break;
                }
                break;
            default:
                if (((u1c0) obj).c == 74) {
                    break;
                }
                break;
        }
        return true;
    }
}
