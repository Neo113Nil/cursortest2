package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.courier.DeliveryExplicitCommentCourierRequirementView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceSelectorWithHeaderView;
import ru.yandex.taxi.preorder.summary.tariffpage.data.b;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class nj1 extends lys {
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public static final /* synthetic */ int b0 = 0;
    public final /* synthetic */ int S;
    public Object T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nj1(xjg xjgVar) {
        super(r0);
        this.S = 3;
        LinearLayout linearLayout = new LinearLayout(((c9i) xjgVar.b).a);
        linearLayout.setOrientation(1);
        linearLayout.addView((DeliveryExplicitCommentCourierRequirementView) ((xvf0) ((wwf) xjgVar.c).c).get());
        this.T = xjgVar;
        x4e.y(-1, -2, (View) this.R);
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
            case 3:
            default:
                return super.X();
            case 4:
                return false;
        }
    }

    @Override // defpackage.wys
    public void Y() {
        switch (this.S) {
            case 0:
                super.Y();
                this.T = null;
                break;
            case 1:
                super.Y();
                this.T = null;
                break;
            default:
                super.Y();
                break;
        }
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        switch (this.S) {
            case 1:
                super.applyTheme(themeType);
                ((ListItemComponent) ((View) this.R)).setTrailImage(dzg0.ic_chevron);
                break;
            default:
                super.applyTheme(themeType);
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                jxm0 jxm0Var = (jxm0) obj;
                this.T = jxm0Var;
                ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) ((View) obj2);
                listItemSwitchComponent.setTitle(jxm0Var.a);
                listItemSwitchComponent.setSubtitle(jxm0Var.b);
                listItemSwitchComponent.setCheckedWithAnimation(jxm0Var.d);
                if (!jxm0Var.e) {
                    listItemSwitchComponent.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
                    break;
                } else {
                    listItemSwitchComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
                    break;
                }
            case 1:
                axm0 axm0Var = (axm0) obj;
                this.T = axm0Var;
                ListItemComponent listItemComponent = (ListItemComponent) ((View) obj2);
                listItemComponent.setTitle(axm0Var.a);
                listItemComponent.setSubtitle(axm0Var.b);
                break;
            case 2:
                ((b) this.T).a(((yn4) obj).a);
                break;
            case 3:
                ozh ozhVar = (ozh) obj;
                ((xjg) this.T).a(ozhVar.a, ozhVar.b);
                break;
            case 4:
                a0(((nac) ((pav) this.T).a((ImageView) ((View) obj2))).c(((v8n0) obj).a));
                break;
            default:
                z9j0 z9j0Var = (z9j0) obj;
                View view = (View) obj2;
                RequiredAltChoiceSelectorWithHeaderView requiredAltChoiceSelectorWithHeaderView = (RequiredAltChoiceSelectorWithHeaderView) view;
                requiredAltChoiceSelectorWithHeaderView.update(z9j0Var.b);
                if (!z9j0Var.a) {
                    requiredAltChoiceSelectorWithHeaderView.setHeaderBackground(dzg0.bg_group_header);
                    view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
                    break;
                } else {
                    requiredAltChoiceSelectorWithHeaderView.setHeaderBackground(dzg0.bg_transparent_ripple);
                    view.setPadding(view.getPaddingLeft(), ((Number) ((i3y) this.T).getValue()).intValue(), view.getPaddingRight(), view.getPaddingBottom());
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(LinearLayout linearLayout, b bVar) {
        super(linearLayout);
        this.S = 2;
        this.T = bVar;
        x4e.y(-1, -2, (View) this.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(RequiredAltChoiceSelectorWithHeaderView requiredAltChoiceSelectorWithHeaderView) {
        super(requiredAltChoiceSelectorWithHeaderView);
        this.S = 5;
        this.T = a.b(LazyThreadSafetyMode.NONE, new vyf0(16, this));
        ((RequiredAltChoiceSelectorWithHeaderView) ((View) this.R)).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj1(View view, int i) {
        super(view);
        this.S = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(GoImageView goImageView, pav pavVar) {
        super(goImageView);
        this.S = 4;
        this.T = pavVar;
        GoImageView goImageView2 = (GoImageView) ((View) this.R);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int h = c.h(16, goImageView2);
        marginLayoutParams.setMargins(h, 0, h, 0);
        goImageView2.setLayoutParams(marginLayoutParams);
    }
}
