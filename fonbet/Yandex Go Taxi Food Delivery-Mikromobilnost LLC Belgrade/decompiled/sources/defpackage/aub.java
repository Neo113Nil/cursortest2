package defpackage;

import android.view.View;
import com.yandex.go.requirements.modal.CompoundOptionSelectModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineBannerView;
import com.yandex.go.taxi.order.driver.profile.view.fact.DriverFactsLinearLayout;
import java.util.function.BiFunction;
import ru.yandex.taxi.design.CircleButtonsPanelComponent;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceOptionSelectorView;
import ru.yandex.taxi.requirements.ui.selector.compound.CompoundOptionSelectorView;
import ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorView;
import ru.yandex.taxi.widget.InstructionsView;

/* loaded from: classes14.dex */
public final /* synthetic */ class aub implements BiFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ aub(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Integer _get_actualChildCount_$lambda$0;
        Integer _get_maxMeasuredHeight_$lambda$0;
        Integer _get_maxMeasuredWidth_$lambda$0;
        Integer _get_childWidthSum_$lambda$0;
        Boolean calculateDiff$lambda$0;
        Boolean calculateDiff$lambda$02;
        Integer layoutMeasuredDimensions$lambda$0;
        Integer layoutMeasuredDimensions$lambda$1;
        Boolean instructions$lambda$0;
        Boolean calculateDiff$lambda$03;
        Boolean calculateDiff$lambda$04;
        String str;
        Boolean calculateDiff$lambda$05;
        boolean z = false;
        switch (this.a) {
            case 0:
                _get_actualChildCount_$lambda$0 = CircleButtonsPanelComponent._get_actualChildCount_$lambda$0((View) obj, (Integer) obj2);
                return _get_actualChildCount_$lambda$0;
            case 1:
                _get_maxMeasuredHeight_$lambda$0 = CircleButtonsPanelComponent._get_maxMeasuredHeight_$lambda$0((View) obj, (Integer) obj2);
                return _get_maxMeasuredHeight_$lambda$0;
            case 2:
                _get_maxMeasuredWidth_$lambda$0 = CircleButtonsPanelComponent._get_maxMeasuredWidth_$lambda$0((View) obj, (Integer) obj2);
                return _get_maxMeasuredWidth_$lambda$0;
            case 3:
                _get_childWidthSum_$lambda$0 = CircleButtonsPanelComponent._get_childWidthSum_$lambda$0((View) obj, (Integer) obj2);
                return _get_childWidthSum_$lambda$0;
            case 4:
                calculateDiff$lambda$0 = CompoundOptionSelectModalView.calculateDiff$lambda$0((tud) obj, (tud) obj2);
                return calculateDiff$lambda$0;
            case 5:
                calculateDiff$lambda$02 = CompoundOptionSelectorView.calculateDiff$lambda$0((pud) obj, (pud) obj2);
                return calculateDiff$lambda$02;
            case 6:
                layoutMeasuredDimensions$lambda$0 = DriverFactsLinearLayout.setLayoutMeasuredDimensions$lambda$0((View) obj, (Integer) obj2);
                return layoutMeasuredDimensions$lambda$0;
            case 7:
                layoutMeasuredDimensions$lambda$1 = DriverFactsLinearLayout.setLayoutMeasuredDimensions$lambda$1((View) obj, (Integer) obj2);
                return layoutMeasuredDimensions$lambda$1;
            case 8:
                return Boolean.valueOf(jl40.l(((lzm) obj).getId(), ((lzm) obj2).getId()));
            case 9:
                return Boolean.valueOf(jl40.l((eip) obj, (eip) obj2));
            case 10:
                instructions$lambda$0 = InstructionsView.setInstructions$lambda$0((h4w) obj, (h4w) obj2);
                return instructions$lambda$0;
            case 11:
                return Boolean.valueOf(jl40.l(((auq) obj).a, ((auq) obj2).a));
            case 12:
                return Boolean.valueOf(jl40.l(((pkw) obj).a, ((pkw) obj2).a));
            case 13:
                calculateDiff$lambda$03 = RequiredAltChoiceOptionSelectorView.calculateDiff$lambda$0((waj0) obj, (waj0) obj2);
                return calculateDiff$lambda$03;
            case 14:
                return Boolean.valueOf(jl40.l(((u58) obj).a, ((u58) obj2).a));
            case 15:
                return Boolean.valueOf(jl40.l(((ndj0) obj).h, ((ndj0) obj2).h));
            case 16:
                calculateDiff$lambda$04 = RideCardTimelineBannerView.calculateDiff$lambda$0((rok0) obj, (rok0) obj2);
                return calculateDiff$lambda$04;
            case 17:
                w2x w2xVar = (w2x) obj;
                w2x w2xVar2 = (w2x) obj2;
                if (w2xVar.a == w2xVar2.a && w2xVar.equals(w2xVar2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                ikx0 ikx0Var = (ikx0) obj;
                ikx0 ikx0Var2 = (ikx0) obj2;
                kb5 kb5Var = ikx0Var.b;
                int i = ikx0Var.h;
                int i2 = ikx0Var2.h;
                kb5 kb5Var2 = ikx0Var2.b;
                if (i == i2 && i == yfh0.card_type_vertical && (str = kb5Var.a) != null && str.length() != 0) {
                    z = jl40.l(kb5Var.a, kb5Var2.a);
                } else if (ikx0Var.a == ikx0Var2.a && jl40.l(kb5Var.a, kb5Var2.a)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                return Boolean.valueOf(((elx0) obj).b((elx0) obj2));
            case 20:
                return Boolean.valueOf(((p7z0) obj).a.equals(((p7z0) obj2).a));
            case 21:
                calculateDiff$lambda$05 = UsualOptionSelectorView.calculateDiff$lambda$0((tf70) obj, (tf70) obj2);
                return calculateDiff$lambda$05;
            case 22:
                return Boolean.valueOf(jl40.l(((ob31) obj).a, ((ob31) obj2).a));
            case 23:
                return Boolean.valueOf(((elx0) obj).b((elx0) obj2));
            default:
                return Boolean.valueOf(jl40.l(((elx0) obj).a, ((elx0) obj2).a));
        }
    }
}
