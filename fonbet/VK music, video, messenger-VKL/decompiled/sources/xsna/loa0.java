package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.themes.VKTheme;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dhr0;

/* compiled from: PinnedDialogsDividerItemDecoration.kt */
/* loaded from: classes2.dex */
public final class loa0 extends RecyclerView.n implements dhr0.e {
    public final bsm b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Paint h;
    public final Rect i;

    public loa0(bsm bsmVar) {
        this.b = bsmVar;
        int a = iah0.a(0.5f);
        this.c = a < 1 ? 1 : a;
        float f = 16;
        this.d = iah0.a(f);
        this.e = iah0.a(f);
        float f2 = 8;
        this.f = iah0.a(f2);
        this.g = iah0.a(f2);
        Paint paint = new Paint();
        paint.setColor(dhr0.t.c(R.attr.vk_legacy_separator_common));
        paint.setAntiAlias(false);
        paint.setDither(false);
        this.h = paint;
        this.i = new Rect();
        dhr0.f(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (l(recyclerView.getChildAdapterPosition(view))) {
            rect.set(0, 0, 0, this.c + this.f + this.g);
        }
    }

    public final boolean l(int i) {
        Dialog dialog;
        List<T> list = this.b.c.f;
        ogm ogmVar = (ogm) j5g.b0(i + 1, list);
        Object b0 = j5g.b0(i, list);
        agm agmVar = b0 instanceof agm ? (agm) b0 : null;
        if (agmVar != null && ogmVar != null) {
            agm agmVar2 = ogmVar instanceof agm ? (agm) ogmVar : null;
            if ((agmVar2 == null || (dialog = agmVar2.b) == null || !dialog.Bc()) && agmVar.b.Bc()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (l(recyclerView.getChildAdapterPosition(childAt))) {
                int left = recyclerView.getLeft() + this.d;
                Rect rect = this.i;
                rect.left = left;
                rect.top = childAt.getBottom() + this.f;
                rect.right = recyclerView.getRight() - this.e;
                rect.bottom = rect.top + this.c;
                canvas.drawRect(rect, this.h);
            }
        }
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        this.h.setColor(dhr0.t.c(R.attr.vk_legacy_separator_common));
    }
}
