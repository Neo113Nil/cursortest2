package defpackage;

import com.yandex.go.address.models.PlaceType;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes5.dex */
public final class md0 extends wys {
    public static final /* synthetic */ int U = 0;
    public final ListItemComponent R;
    public final o1c S;
    public final boolean T;

    public md0(ListItemComponent listItemComponent, o1c o1cVar) {
        super(listItemComponent);
        this.R = listItemComponent;
        this.S = o1cVar;
        this.T = true;
    }

    @Override // defpackage.wys
    public final boolean X() {
        return this.T;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        l2x l2xVar = (l2x) obj;
        PlaceType placeType = l2xVar.d;
        String str = l2xVar.e;
        ListItemComponent listItemComponent = this.R;
        listItemComponent.setTitle(str);
        listItemComponent.setLeadImage(l2xVar.b);
        listItemComponent.setTrailImage(l2xVar.c);
        listItemComponent.setDividers(DividerPosition.BOTTOM, !l2xVar.g ? DividerType.NONE : l2xVar.f ? DividerType.ICON_MARGIN : DividerType.MARGIN);
        listItemComponent.setDebounceClickListener(new hc(3, this, placeType));
    }
}
