package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsView;

/* loaded from: classes5.dex */
public final class n7i implements zo31 {
    public final LinearLayout a;
    public final PhotocommentsView b;
    public final ListItemComponent c;
    public final ListItemComponent d;

    public n7i(LinearLayout linearLayout, PhotocommentsView photocommentsView, ListItemComponent listItemComponent, ListItemComponent listItemComponent2) {
        this.a = linearLayout;
        this.b = photocommentsView;
        this.c = listItemComponent;
        this.d = listItemComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
