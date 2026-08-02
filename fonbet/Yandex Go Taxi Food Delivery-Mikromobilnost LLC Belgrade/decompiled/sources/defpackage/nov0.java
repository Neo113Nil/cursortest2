package defpackage;

import com.yandex.go.deeplinks.generated.summary.SummarySection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class nov0 {
    public static SummarySection a(String str) {
        Object obj;
        Iterator<E> it = SummarySection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((SummarySection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (SummarySection) obj;
    }
}
