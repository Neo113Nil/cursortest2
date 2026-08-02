package defpackage;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes5.dex */
public final class h28 extends wys {
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int R;
    public final ListItemComponent S;
    public final o1c T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h28(ListItemComponent listItemComponent, o1c o1cVar, int i) {
        super(listItemComponent);
        this.R = i;
        this.S = listItemComponent;
        this.T = o1cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wys
    public final void c(Object obj) {
        String str;
        int i = this.R;
        ListItemComponent listItemComponent = this.S;
        switch (i) {
            case 0:
                m2x m2xVar = (m2x) obj;
                g28 g28Var = m2xVar.b;
                listItemComponent.setVisibility(!listItemComponent.isInEditMode() ? 0 : 8);
                c.D(listItemComponent.getLayoutParams().width, listItemComponent.isInEditMode() ? 0 : -2, listItemComponent);
                boolean z = g28Var.a;
                FavoriteAddress favoriteAddress = g28Var.e;
                if (z) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g8e.o("   ", favoriteAddress.q()));
                    Drawable k = c.k(hzg0.ic_new_favorite_suggest, this.a);
                    spannableStringBuilder.setSpan(k != null ? new CustomImageSpan(k, 2, false, false, null, 28, null) : null, 0, 1, 33);
                    str = spannableStringBuilder;
                } else {
                    str = favoriteAddress.q();
                }
                listItemComponent.setTitle(str);
                listItemComponent.setSubtitle(g28Var.c);
                listItemComponent.setDividers(DividerPosition.BOTTOM, m2xVar.c ? DividerType.ICON_MARGIN : DividerType.NONE);
                listItemComponent.setDebounceClickListener(new nm7(14, this, g28Var));
                break;
            default:
                FavoriteAddress favoriteAddress2 = ((u2x) obj).b;
                listItemComponent.setTitle(favoriteAddress2.q());
                listItemComponent.setSubtitle(favoriteAddress2.p());
                listItemComponent.setLeadImage(favoriteAddress2.getPlaceType() == PlaceType.HOME ? izg0.ic_suggested_favorite_home : izg0.ic_suggested_favorite_work);
                listItemComponent.setDebounceClickListener(new tpt0(15, this, favoriteAddress2));
                break;
        }
    }
}
