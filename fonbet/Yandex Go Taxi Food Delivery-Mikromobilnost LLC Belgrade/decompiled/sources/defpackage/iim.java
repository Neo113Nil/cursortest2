package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.taxi.order.driver.profile.view.fact.DriverFactsLinearLayout;
import java.util.function.BiFunction;
import ru.yandex.taxi.design.CircleButtonsPanelComponent;

/* loaded from: classes14.dex */
public final /* synthetic */ class iim implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ iim(int i, ViewGroup viewGroup, int i2) {
        this.a = i2;
        this.b = i;
        this.c = viewGroup;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Integer layoutOnLeft$lambda$0;
        Integer layoutOnCenter$lambda$0;
        Integer onLayout$lambda$0;
        int i = this.a;
        ViewGroup viewGroup = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                layoutOnLeft$lambda$0 = DriverFactsLinearLayout.layoutOnLeft$lambda$0(i2, (DriverFactsLinearLayout) viewGroup, (View) obj, (Integer) obj2);
                return layoutOnLeft$lambda$0;
            case 1:
                layoutOnCenter$lambda$0 = DriverFactsLinearLayout.layoutOnCenter$lambda$0(i2, (DriverFactsLinearLayout) viewGroup, (View) obj, (Integer) obj2);
                return layoutOnCenter$lambda$0;
            default:
                onLayout$lambda$0 = CircleButtonsPanelComponent.onLayout$lambda$0(i2, (CircleButtonsPanelComponent) viewGroup, (View) obj, (Integer) obj2);
                return onLayout$lambda$0;
        }
    }
}
