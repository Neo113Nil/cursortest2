package defpackage;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes11.dex */
public final class ib6 extends FloatingActionButton.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public ib6(BottomAppBar bottomAppBar, int i) {
        this.b = bottomAppBar;
        this.a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        float fabTranslationX;
        fabTranslationX = this.b.getFabTranslationX(this.a);
        floatingActionButton.setTranslationX(fabTranslationX);
        floatingActionButton.show(new hb6(this));
    }
}
