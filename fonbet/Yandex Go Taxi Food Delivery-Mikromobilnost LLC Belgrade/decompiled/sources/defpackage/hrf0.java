package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.LoadingComponent;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes13.dex */
public final class hrf0 implements zo31 {
    public final LinearLayout a;

    public hrf0(LinearLayout linearLayout, ListItemComponent listItemComponent, RecyclerView recyclerView, LoadingComponent loadingComponent, ListItemComponent listItemComponent2, AppCompatImageView appCompatImageView, ToolbarComponent toolbarComponent, ListHeaderComponent listHeaderComponent) {
        this.a = linearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
