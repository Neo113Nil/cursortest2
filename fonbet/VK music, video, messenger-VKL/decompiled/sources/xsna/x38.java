package xsna;

import androidx.annotation.NonNull;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar.java */
/* loaded from: classes13.dex */
public final class x38 extends FloatingActionButton.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    /* compiled from: BottomAppBar.java */
    public class a extends FloatingActionButton.a {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            int i = BottomAppBar.j0;
        }
    }

    public x38(BottomAppBar bottomAppBar, int i) {
        this.b = bottomAppBar;
        this.a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.b.B(this.a));
        floatingActionButton.l(new a(), true);
    }
}
