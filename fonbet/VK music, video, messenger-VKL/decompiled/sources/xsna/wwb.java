package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.vwb;

/* compiled from: ChatProfileChatSettingsItemDecoration.kt */
/* loaded from: classes2.dex */
public final class wwb extends RecyclerView.n {
    public final qwb b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Paint i;
    public final Rect j;

    public wwb(qwb qwbVar, int i, int i2, int i3, int i4, int i5) {
        int a = (int) (cn70.a() * 0.5f);
        this.b = qwbVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = a;
        Paint paint = new Paint();
        paint.setColor(dhr0.t.c(R.attr.vk_legacy_separator_common));
        paint.setAntiAlias(false);
        paint.setDither(false);
        this.i = paint;
        this.j = new Rect();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r4 == (r6 - 1)) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean z;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        qwb qwbVar = this.b;
        int size = qwbVar.h.size();
        if (childAdapterPosition >= 0) {
            z = true;
        }
        z = false;
        hfz hfzVar = (hfz) j5g.b0(childAdapterPosition, qwbVar.h);
        if (hfzVar == null) {
            return;
        }
        boolean z2 = hfzVar instanceof vwb.b;
        int i = this.g;
        if (z2 && ((vwb.b) hfzVar).b == 8) {
            int i2 = z ? i : 0;
            rect.top = this.h + this.e + this.f;
            rect.bottom = i2;
        } else if (z) {
            rect.bottom = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.onDraw(canvas, recyclerView, a0Var);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                hfz hfzVar = (hfz) j5g.b0(layoutManager.getPosition(childAt), this.b.h);
                if (hfzVar == null) {
                    return;
                }
                if ((hfzVar instanceof vwb.b) && ((vwb.b) hfzVar).b == 8) {
                    int left = recyclerView.getLeft() + this.c;
                    Rect rect = this.j;
                    rect.left = left;
                    int top = childAt.getTop();
                    int i2 = this.h;
                    rect.top = (top - i2) - this.e;
                    rect.right = recyclerView.getRight() - this.d;
                    rect.bottom = rect.top + i2;
                    canvas.drawRect(rect, this.i);
                }
            }
        }
    }
}
