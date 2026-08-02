package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class kxm0 implements zo31 {
    public final GoConstraintLayout a;
    public final ListItemSwitchComponent b;
    public final RecyclerView c;
    public final ButtonComponent d;
    public final RecyclerView e;
    public final RecyclerView f;
    public final RobotoTextView g;
    public final ToolbarComponent h;

    public kxm0(GoConstraintLayout goConstraintLayout, ListItemSwitchComponent listItemSwitchComponent, RecyclerView recyclerView, ButtonComponent buttonComponent, RecyclerView recyclerView2, RecyclerView recyclerView3, RobotoTextView robotoTextView, ToolbarComponent toolbarComponent) {
        this.a = goConstraintLayout;
        this.b = listItemSwitchComponent;
        this.c = recyclerView;
        this.d = buttonComponent;
        this.e = recyclerView2;
        this.f = recyclerView3;
        this.g = robotoTextView;
        this.h = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
