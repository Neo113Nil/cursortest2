package xsna;

import com.vk.superapp.ui.widgets.SuperAppWidget;
import java.util.Comparator;
import xsna.us2;

/* compiled from: Comparisons.kt */
/* loaded from: classes11.dex */
public final class ys2 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ ys2(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((us2.d) obj).b), Integer.valueOf(((us2.d) obj2).b));
            default:
                return jw5.b(Double.valueOf(((SuperAppWidget) obj2).f()), Double.valueOf(((SuperAppWidget) obj).f()));
        }
    }
}
