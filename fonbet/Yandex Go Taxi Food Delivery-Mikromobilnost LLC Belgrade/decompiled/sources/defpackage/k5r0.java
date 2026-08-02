package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class k5r0 extends wys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int R;
    public final View S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5r0(View view, int i) {
        super(view);
        this.R = i;
        this.S = view;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        View view = this.S;
        switch (i) {
            case 0:
                ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) view;
                b5r0 b5r0Var = ((whb) obj).a;
                listItemCheckComponent.setChecked(b5r0Var.c);
                listItemCheckComponent.setTitle(b5r0Var.b);
                listItemCheckComponent.setTitleTypeface(3);
                listItemCheckComponent.setDebounceClickListener(new mmp0(8, b5r0Var));
                if (!b5r0Var.d) {
                    listItemCheckComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
                    break;
                } else {
                    listItemCheckComponent.setDividers(DividerPosition.TOP, DividerType.MARGIN);
                    break;
                }
            case 1:
                ((RobotoTextView) view).setText(((w2j) obj).a);
                break;
            default:
                ((ListGroupHeaderComponent) view).setTitle(((ulr0) obj).a);
                break;
        }
    }
}
