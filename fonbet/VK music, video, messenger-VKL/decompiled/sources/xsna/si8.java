package xsna;

import com.vk.dto.common.VideoFile;
import java.util.Comparator;
import kotlin.Pair;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class si8 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ si8(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Long.valueOf(((VideoFile) obj).Na()), Long.valueOf(((VideoFile) obj2).Na()));
            case 1:
                return jw5.b(Boolean.valueOf(((glu) obj2).e), Boolean.valueOf(((glu) obj).e));
            default:
                return jw5.b((Integer) ((Pair) obj).j(), (Integer) ((Pair) obj2).j());
        }
    }
}
