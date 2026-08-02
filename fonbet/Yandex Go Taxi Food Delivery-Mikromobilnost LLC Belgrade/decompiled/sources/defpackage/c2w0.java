package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.b;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperAppMainScreenHeader;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.settings.MainMenuButton;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes.dex */
public final class c2w0 {
    public final View a;
    public final MainMenuButton b;
    public final RobotoTextView c;
    public final RobotoTextView d;
    public final View e;
    public final View f;
    public final View g;
    public final cxq0 h;
    public final ListItemComponent i;
    public final LinearLayout j;
    public final ButtonComponent k;
    public final ButtonComponent l;
    public final /* synthetic */ SuperAppMainScreenHeader m;

    public c2w0(SuperAppMainScreenHeader superAppMainScreenHeader, zo31 zo31Var) {
        w49 w49Var;
        this.m = superAppMainScreenHeader;
        this.a = zo31Var.getRoot();
        int i = yih0.menu_button;
        WeakHashMap weakHashMap = b.a;
        this.b = (MainMenuButton) ((View) rp31.d(superAppMainScreenHeader, i));
        this.c = (RobotoTextView) superAppMainScreenHeader.findViewById(yih0.you_are_here);
        this.d = (RobotoTextView) ((View) rp31.d(superAppMainScreenHeader, yih0.current_address));
        this.e = (View) rp31.d(superAppMainScreenHeader, yih0.address_logo_container);
        this.f = superAppMainScreenHeader.findViewById(dfh0.btn_cashback);
        this.g = superAppMainScreenHeader.findViewById(yih0.plus_badge);
        w49Var = superAppMainScreenHeader.cashbackViewFactory;
        this.h = w49Var != null ? ((t0w0) w49Var).a(superAppMainScreenHeader) : null;
        this.i = (ListItemComponent) ((View) rp31.d(superAppMainScreenHeader, yih0.clarify_address_hint));
        this.j = (LinearLayout) ((View) rp31.d(superAppMainScreenHeader, yih0.clarify_address_actions));
        this.k = (ButtonComponent) ((View) rp31.d(superAppMainScreenHeader, yih0.clarify_address_minor_button));
        this.l = (ButtonComponent) ((View) rp31.d(superAppMainScreenHeader, yih0.clarify_address_major_button));
    }
}
