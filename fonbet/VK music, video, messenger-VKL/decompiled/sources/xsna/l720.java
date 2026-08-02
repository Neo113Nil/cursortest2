package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class l720 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ l720(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Double.valueOf(((SuperAppWidget) obj2).f()), Double.valueOf(((SuperAppWidget) obj).f()));
            default:
                return jw5.b(Integer.valueOf(((BaseImageDto) obj).getWidth()), Integer.valueOf(((BaseImageDto) obj2).getWidth()));
        }
    }
}
