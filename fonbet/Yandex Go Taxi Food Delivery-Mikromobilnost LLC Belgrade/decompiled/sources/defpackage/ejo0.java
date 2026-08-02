package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes13.dex */
public final class ejo0 implements zo31 {
    public final ConstraintLayout a;
    public final Guideline b;
    public final ListItemComponent c;
    public final ViewStub d;
    public final AppCompatImageButton e;
    public final ToolbarComponent f;
    public final Guideline g;

    public ejo0(ConstraintLayout constraintLayout, Guideline guideline, ListItemComponent listItemComponent, ViewStub viewStub, AppCompatImageButton appCompatImageButton, ToolbarComponent toolbarComponent, Guideline guideline2) {
        this.a = constraintLayout;
        this.b = guideline;
        this.c = listItemComponent;
        this.d = viewStub;
        this.e = appCompatImageButton;
        this.f = toolbarComponent;
        this.g = guideline2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
