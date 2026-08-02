package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.ImageSize;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes18.dex */
public final class y4h implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((BaseImageDto) obj).getWidth()), Integer.valueOf(((BaseImageDto) obj2).getWidth()));
            default:
                return jw5.b(Integer.valueOf(((ImageSize) obj).d.b), Integer.valueOf(((ImageSize) obj2).d.b));
        }
    }
}
