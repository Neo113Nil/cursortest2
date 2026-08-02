package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.x0;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.utils.TextChangedListener;
import ru.yandex.taxi.domain.RequirementAddressInputType;

/* loaded from: classes6.dex */
public final class pbj0 extends x0 {
    public final rm N;
    public final /* synthetic */ ubj0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbj0(ubj0 ubj0Var, rm rmVar) {
        super((ConstraintLayout) rmVar.b);
        this.O = ubj0Var;
        this.N = rmVar;
        W((AnimatedListItemInputComponent) rmVar.g, RequirementAddressInputType.PORCH);
        W((AnimatedListItemInputComponent) rmVar.d, RequirementAddressInputType.DOOR_PHONE);
        W((AnimatedListItemInputComponent) rmVar.c, RequirementAddressInputType.APARTMENT);
        W((AnimatedListItemInputComponent) rmVar.e, RequirementAddressInputType.FLOOR);
    }

    public final void W(AnimatedListItemInputComponent animatedListItemInputComponent, RequirementAddressInputType requirementAddressInputType) {
        animatedListItemInputComponent.addTextChangedListener(new TextChangedListener(new th40(25, this.O, this, requirementAddressInputType)));
    }
}
