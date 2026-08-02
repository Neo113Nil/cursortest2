package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class zcj implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(((q2a0) obj).La(), ((q2a0) obj2).La());
            default:
                return jw5.b(Integer.valueOf(((Dialog) obj2).Ub()), Integer.valueOf(((Dialog) obj).Ub()));
        }
    }
}
