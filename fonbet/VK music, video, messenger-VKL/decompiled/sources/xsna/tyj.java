package xsna;

import com.vk.dto.attaches.Attach;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes15.dex */
public final class tyj implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((wyj) obj).a.c.length()), Integer.valueOf(((wyj) obj2).a.c.length()));
            default:
                return jw5.b(Integer.valueOf(((Attach) obj2).xb()), Integer.valueOf(((Attach) obj).xb()));
        }
    }
}
