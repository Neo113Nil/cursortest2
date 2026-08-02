package xsna;

import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.im.engine.models.messages.Msg;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes15.dex */
public final class x39 implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((Country) obj2).c.length()), Integer.valueOf(((Country) obj).c.length()));
            default:
                return jw5.b(Integer.valueOf(((Msg) obj).d), Integer.valueOf(((Msg) obj2).d));
        }
    }
}
