package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.LoadingComponent;

/* loaded from: classes6.dex */
public final class f540 implements zo31 {
    public final /* synthetic */ int a;
    public final FrameLayout b;
    public final ListItemComponent c;
    public final LoadingComponent d;

    public /* synthetic */ f540(FrameLayout frameLayout, ListItemComponent listItemComponent, LoadingComponent loadingComponent, int i) {
        this.a = i;
        this.b = frameLayout;
        this.c = listItemComponent;
        this.d = loadingComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
