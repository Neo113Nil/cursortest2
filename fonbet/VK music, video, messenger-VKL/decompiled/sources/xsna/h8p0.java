package xsna;

import com.vk.dto.shortvideo.ClipGridParams;
import java.util.Comparator;
import kotlin.Pair;

/* compiled from: SemanticsSort.kt */
/* loaded from: classes11.dex */
public final class h8p0 implements Comparator {
    public static final h8p0 c = new h8p0(0);
    public final /* synthetic */ int b;

    public /* synthetic */ h8p0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int compare = Float.compare(((zhf0) pair.i()).b, ((zhf0) pair2.i()).b);
                return compare != 0 ? compare : Float.compare(((zhf0) pair.i()).d, ((zhf0) pair2.i()).d);
            case 1:
                return jw5.b(Long.valueOf(((ClipGridParams.Data.Profile) obj2).b.b.b.b), Long.valueOf(((ClipGridParams.Data.Profile) obj).b.b.b.b));
            case 2:
                return jw5.b(Integer.valueOf(((fam) obj).e), Integer.valueOf(((fam) obj2).e));
            default:
                return jw5.b(Integer.valueOf(((dbq0) obj).d), Integer.valueOf(((dbq0) obj2).d));
        }
    }
}
