package defpackage;

import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.surge.dialog.TextBlockView;

/* loaded from: classes6.dex */
public final class c6r0 extends wys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int R;
    public final DividerAwareComponent S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6r0(DividerAwareComponent dividerAwareComponent, int i) {
        super(dividerAwareComponent);
        this.R = i;
        this.S = dividerAwareComponent;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.R) {
            case 2:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        DividerAwareComponent dividerAwareComponent = this.S;
        switch (i) {
            case 0:
                blz0 blz0Var = (blz0) obj;
                ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) dividerAwareComponent;
                e5r0 e5r0Var = blz0Var.a;
                Integer num = e5r0Var.c;
                if (num != null) {
                    listItemSwitchComponent.setLeadImage(num.intValue());
                }
                listItemSwitchComponent.setChecked(e5r0Var.b);
                listItemSwitchComponent.setTitle(e5r0Var.a);
                listItemSwitchComponent.setTitleTypeface(3);
                listItemSwitchComponent.setDebounceClickListener(new mmp0(9, blz0Var));
                if (!e5r0Var.d) {
                    listItemSwitchComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
                    break;
                } else {
                    listItemSwitchComponent.setDividers(DividerPosition.TOP, DividerType.ICON_MARGIN);
                    break;
                }
            case 1:
                ((ListGroupHeaderComponent) dividerAwareComponent).setTitle(((cz4) obj).a);
                break;
            default:
                ((TextBlockView) dividerAwareComponent).render((lky0) obj);
                break;
        }
    }
}
