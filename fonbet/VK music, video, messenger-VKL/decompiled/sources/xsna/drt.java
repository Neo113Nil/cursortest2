package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.superapp.api.dto.vkworkout.WorkoutData;
import java.util.Comparator;
import kotlin.Pair;
import xsna.wwi0;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class drt implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ drt(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b((Integer) ((Pair) obj).i(), (Integer) ((Pair) obj2).i());
            case 1:
                return jw5.b(Long.valueOf(((WorkoutData) obj2).c), Long.valueOf(((WorkoutData) obj).c));
            case 2:
                return jw5.b(Integer.valueOf(((Attach) obj2).xb()), Integer.valueOf(((Attach) obj).xb()));
            case 3:
                return jw5.b(Integer.valueOf(((wwi0.c.C3962c) obj).a.getId()), Integer.valueOf(((wwi0.c.C3962c) obj2).a.getId()));
            default:
                return jw5.b(Integer.valueOf(((androidx.media3.common.a) obj2).j), Integer.valueOf(((androidx.media3.common.a) obj).j));
        }
    }
}
