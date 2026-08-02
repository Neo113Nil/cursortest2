package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.g;

/* loaded from: classes9.dex */
public final class npr extends RecyclerView.g {
    public final RecyclerView a;
    public int b;
    public Rect c;
    public Rect d;
    public boolean e;
    public final /* synthetic */ g f;

    public npr(g gVar, RecyclerView recyclerView) {
        this.f = gVar;
        this.a = recyclerView;
        recyclerView.setClipToPadding(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        g gVar = this.f;
        ListItemComponent listItemComponent = gVar.a;
        int i3 = this.b + i2;
        this.b = i3;
        if (i3 < 0 || !recyclerView.canScrollVertically(-1)) {
            this.b = 0;
        }
        int i4 = this.b;
        int height = listItemComponent.getHeight();
        if (height > 0) {
            gVar.c(Math.max(0.0f, i4 < height ? i4 / height : 1.0f));
        } else {
            gVar.c(0.0f);
        }
        if (this.e || this.b <= 0) {
            return;
        }
        this.e = true;
        Rect rect = this.c;
        if (rect == null) {
            return;
        }
        Rect rect2 = new Rect(this.d);
        rect2.bottom = listItemComponent.getMeasuredHeight() + rect.bottom;
        this.d = rect2;
        xw31.H(recyclerView, rect2);
    }
}
