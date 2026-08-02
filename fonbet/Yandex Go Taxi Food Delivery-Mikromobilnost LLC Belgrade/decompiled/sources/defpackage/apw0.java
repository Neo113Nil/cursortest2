package defpackage;

import android.view.View;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class apw0 implements zo31 {
    public final ScrollView a;
    public final ButtonsView b;
    public final KeyboardAwareRobotoEditText c;
    public final RecyclerView d;
    public final RobotoTextView e;

    public apw0(ScrollView scrollView, ButtonsView buttonsView, KeyboardAwareRobotoEditText keyboardAwareRobotoEditText, RecyclerView recyclerView, RobotoTextView robotoTextView) {
        this.a = scrollView;
        this.b = buttonsView;
        this.c = keyboardAwareRobotoEditText;
        this.d = recyclerView;
        this.e = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
