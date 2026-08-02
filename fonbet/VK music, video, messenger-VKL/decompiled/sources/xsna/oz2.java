package xsna;

import com.vk.games.model.a;
import java.util.Comparator;
import java.util.Map;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class oz2 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ oz2(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
            case 1:
                return jw5.b(Integer.valueOf(((t8j) obj).c), Integer.valueOf(((t8j) obj2).c));
            case 2:
                return jw5.b(Boolean.valueOf(((com.vk.games.model.a) obj) instanceof a.c), Boolean.valueOf(((com.vk.games.model.a) obj2) instanceof a.c));
            default:
                return jw5.b(((cms0) ((mlt0) obj2).c).b(), ((cms0) ((mlt0) obj).c).b());
        }
    }
}
