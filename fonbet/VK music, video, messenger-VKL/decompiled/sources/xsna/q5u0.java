package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: VisibleRectItemVisibilityCheckStrategy.kt */
/* loaded from: classes17.dex */
public final class q5u0 implements pvx {
    public final float a;
    public final float b;
    public final Rect c;
    public final Rect d;
    public boolean e;

    public q5u0(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = new Rect();
        this.d = new Rect();
    }

    @Override // xsna.pvx
    public final void a() {
        this.e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        if (((r6.height() * r6.width()) / r1) >= r0) goto L17;
     */
    @Override // xsna.pvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(RecyclerView recyclerView, View view) {
        boolean z = this.e;
        Rect rect = this.c;
        if (!z) {
            this.e = true;
            recyclerView.getLocalVisibleRect(rect);
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect2 = this.d;
        rect2.set(left, top, right, bottom);
        if (!rect2.intersect(rect)) {
            return false;
        }
        float width = view.getWidth();
        float height = view.getHeight();
        float f = width * height;
        float width2 = rect2.width() / width;
        float f2 = this.b;
        if (width2 >= f2 && rect2.height() / height >= f2) {
        }
        return ((float) (rect2.height() * rect2.width())) / (((float) recyclerView.getWidth()) * ((float) recyclerView.getHeight())) >= this.a;
    }

    public /* synthetic */ q5u0(float f, int i) {
        this(0.5f, (i & 2) != 0 ? 0.5f : f);
    }
}
