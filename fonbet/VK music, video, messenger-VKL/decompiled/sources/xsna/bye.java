package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.shortvideo.ClipGridParams;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes17.dex */
public final class bye implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Long.valueOf(((ClipGridParams.Data.Profile) obj2).b.b.b.b), Long.valueOf(((ClipGridParams.Data.Profile) obj).b.b.b.b));
            default:
                return jw5.b(Integer.valueOf(((ImageSize) obj).d.b), Integer.valueOf(((ImageSize) obj2).d.b));
        }
    }
}
