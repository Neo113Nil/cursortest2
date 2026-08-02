package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.progress.SpinnerProgressBar;

/* loaded from: classes12.dex */
public final class ky31 extends wys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public final /* synthetic */ int R;
    public final ListItemComponent S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky31(ListItemComponent listItemComponent, int i) {
        super(listItemComponent);
        this.R = i;
        this.S = listItemComponent;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        ListItemComponent listItemComponent = this.S;
        switch (i) {
            case 0:
                f5r0 f5r0Var = ((iy31) obj).a;
                listItemComponent.setTitle(f5r0Var.b);
                listItemComponent.setTitleTypeface(3);
                listItemComponent.clearTrailView();
                if (f5r0Var.c) {
                    SpinnerProgressBar spinnerProgressBar = new SpinnerProgressBar(listItemComponent.getContext(), null, 0, 0, 14, null);
                    View view = this.a;
                    spinnerProgressBar.setLayoutParams(new ViewGroup.MarginLayoutParams(c.g(24.0f, view), tje.v(view.getContext(), 24.0f)));
                    xw31.F(spinnerProgressBar, null, null, Integer.valueOf(tje.v(view.getContext(), 16.0f)), null);
                    listItemComponent.setTrailView(spinnerProgressBar);
                    listItemComponent.setTrailContainerClickListener(new hos0(9));
                } else {
                    listItemComponent.setClickableTrailImage(f1h0.ic_download_24);
                    listItemComponent.setTrailCompanionTintColorAttr(xng0.textMain);
                    listItemComponent.setTrailContainerClickListener(new jy31(0, f5r0Var));
                }
                if (!f5r0Var.d) {
                    listItemComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
                    break;
                } else {
                    listItemComponent.setDividers(DividerPosition.TOP, DividerType.MARGIN);
                    break;
                }
            default:
                listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON);
                listItemComponent.setTitle(kyh0.navigator_stops);
                break;
        }
    }
}
