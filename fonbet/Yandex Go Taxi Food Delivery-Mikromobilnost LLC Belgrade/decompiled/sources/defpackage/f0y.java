package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.favorites.list.ui.FavoritesView;

/* loaded from: classes5.dex */
public final class f0y implements zo31 {
    public final FavoritesView a;
    public final ho4 b;
    public final RecyclerView c;
    public final ho4 d;
    public final ToolbarComponent e;
    public final GoView f;

    public f0y(FavoritesView favoritesView, ho4 ho4Var, RecyclerView recyclerView, ho4 ho4Var2, ToolbarComponent toolbarComponent, GoView goView) {
        this.a = favoritesView;
        this.b = ho4Var;
        this.c = recyclerView;
        this.d = ho4Var2;
        this.e = toolbarComponent;
        this.f = goView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
