package defpackage;

import android.view.View;
import ru.yandex.taxi.web.view.WebProgressViewHolder$LayoutType;

/* loaded from: classes6.dex */
public interface lj41 {
    WebProgressViewHolder$LayoutType getLayoutType();

    View getView();

    default void setVisible(boolean z) {
        getView().setVisibility(z ? 0 : 8);
    }
}
