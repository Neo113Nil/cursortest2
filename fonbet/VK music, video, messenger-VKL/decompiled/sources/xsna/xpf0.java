package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.components.viewcontrollers.msg_list.decoration.MsgRegionImageMask;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import com.vk.regionsdrawer.drawer.DrawMode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ac7;
import xsna.sho;

/* compiled from: RegionsDrawerDecoration.kt */
/* loaded from: classes5.dex */
public class xpf0 extends RecyclerView.n {
    public final eqd b;
    public final h6g c;
    public final leq d;
    public final dge e = new dge(new i8c0(2));
    public final Rect f = new Rect();
    public final ArrayList<spf0> g = new ArrayList<>();
    public final ac7 h;
    public final vpf0 i;
    public final ozm j;

    public xpf0(eqd eqdVar, h6g h6gVar, leq leqVar) {
        this.b = eqdVar;
        this.c = h6gVar;
        this.d = leqVar;
        ac7 ac7Var = new ac7();
        this.h = ac7Var;
        this.i = new vpf0(ac7Var);
        this.j = new ozm(ac7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
    
        r8 = null;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        ypf0 ypf0Var;
        MsgBubbleView G2;
        MsgRegionImageMask m3;
        Drawable drawable;
        dge dgeVar;
        View view;
        vpf0 vpf0Var = this.i;
        if (recyclerView.getLayerType() != 2) {
            throw new UnsupportedOperationException("Decoration works only when RecyclerView.layerType = LAYER_TYPE_HARDWARE (required for masks (xrefmode), alpha and so on)");
        }
        ArrayList<spf0> arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            spf0 spf0Var = arrayList.get(i2);
            spf0Var.a.setEmpty();
            spf0Var.b = 0;
            trm0 trm0Var = trm0.a;
            spf0Var.c = trm0Var;
            spf0Var.d = trm0Var;
            spf0Var.e = DrawMode.OFFSCREEN_LAYER;
        }
        dge dgeVar2 = this.e;
        ((ArrayList) dgeVar2.c).addAll(arrayList);
        arrayList.clear();
        int measuredWidth = recyclerView.getMeasuredWidth();
        int measuredHeight = recyclerView.getMeasuredHeight();
        Rect rect = this.f;
        rect.set(0, 0, measuredWidth, measuredHeight);
        if (rect.isEmpty()) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            Object childViewHolder = recyclerView.getChildViewHolder(childAt);
            if ((childViewHolder instanceof ypf0) && (G2 = (ypf0Var = (ypf0) childViewHolder).G2()) != null) {
                Drawable drawable2 = (Drawable) this.b.invoke(ypf0Var.W4());
                if (drawable2 != null && (m3 = ypf0Var.m3()) != null && (drawable = (Drawable) this.c.invoke(m3)) != null) {
                    ypf0Var.W4();
                    this.d.getClass();
                    DrawMode drawMode = DrawMode.OFFSCREEN_BITMAP;
                    if (drawMode != null) {
                        Object J = g5g.J((ArrayList) dgeVar2.c);
                        if (J == null) {
                            J = ((gzs) dgeVar2.b).invoke();
                        }
                        final spf0 spf0Var2 = (spf0) J;
                        dgeVar = dgeVar2;
                        spf0Var2.b = (int) ((childAt.getAlpha() * 255) + 0.5f);
                        spf0Var2.c = drawable2;
                        spf0Var2.d = drawable;
                        spf0Var2.e = drawMode;
                        Rect rect2 = spf0Var2.a;
                        rect2.set(G2.getLeft(), G2.getTop(), G2.getRight(), G2.getBottom());
                        Object parent = G2.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                            while (view != null && !view.equals(recyclerView)) {
                                rect2.offset(view.getLeft() + ((int) view.getTranslationX()), view.getTop() + ((int) view.getTranslationY()));
                                Object parent2 = view.getParent();
                                if (parent2 instanceof View) {
                                    view = (View) parent2;
                                }
                            }
                            sho o4 = ypf0Var.o4();
                            if (o4 != null) {
                                MsgBubbleView msgBubbleView = (MsgBubbleView) o4;
                                msgBubbleView.m = new WeakReference<>(new sho.a() { // from class: xsna.wpf0
                                    @Override // xsna.sho.a
                                    public final void draw(Canvas canvas2) {
                                        Bitmap bitmap;
                                        Bitmap bitmap2;
                                        xpf0 xpf0Var = xpf0.this;
                                        Rect rect3 = xpf0Var.f;
                                        if (rect3.isEmpty()) {
                                            return;
                                        }
                                        dge dgeVar3 = xpf0Var.e;
                                        Object J2 = g5g.J((ArrayList) dgeVar3.c);
                                        if (J2 == null) {
                                            J2 = ((gzs) dgeVar3.b).invoke();
                                        }
                                        spf0 spf0Var3 = (spf0) J2;
                                        spf0Var3.getClass();
                                        spf0 spf0Var4 = spf0Var2;
                                        spf0Var3.a = new Rect(spf0Var4.a);
                                        spf0Var3.b = spf0Var4.b;
                                        spf0Var3.c = spf0Var4.c;
                                        spf0Var3.d = spf0Var4.d;
                                        spf0Var3.e = spf0Var4.e;
                                        ozm ozmVar = xpf0Var.j;
                                        Bitmap bitmap3 = ozmVar.b;
                                        if (bitmap3 == null) {
                                            bitmap = Bitmap.createBitmap(rect3.width(), rect3.height(), ozm.e);
                                            bitmap.prepareToDraw();
                                            ozmVar.b = bitmap;
                                        } else if (bitmap3.getWidth() == rect3.width() && (bitmap2 = ozmVar.b) != null && bitmap2.getHeight() == rect3.height()) {
                                            bitmap = ozmVar.b;
                                            if (bitmap == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        } else {
                                            bitmap = ozmVar.b;
                                            if (bitmap == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            if (bitmap.getAllocationByteCount() / 4 < rect3.height() * rect3.width()) {
                                                bitmap.recycle();
                                                bitmap = Bitmap.createBitmap(rect3.width(), rect3.height(), ozm.e);
                                                bitmap.prepareToDraw();
                                            } else {
                                                bitmap.reconfigure(rect3.width(), rect3.height(), ozm.e);
                                            }
                                            ozmVar.b = bitmap;
                                        }
                                        Canvas canvas3 = new Canvas(bitmap);
                                        canvas3.drawRect(spf0Var3.a, ozmVar.c);
                                        Drawable drawable3 = spf0Var3.c;
                                        spf0Var3.d.setBounds(spf0Var3.a);
                                        spf0Var3.d.setAlpha(spf0Var3.b);
                                        spf0Var3.d.draw(canvas3);
                                        Bitmap a = ozmVar.a.a(drawable3, new Rect(0, 0, rect3.width(), rect3.height()));
                                        Rect rect4 = spf0Var3.a;
                                        canvas3.drawBitmap(a, rect4, rect4, ozmVar.d);
                                        Rect rect5 = spf0Var3.a;
                                        float f = -rect5.left;
                                        float f2 = -rect5.top;
                                        canvas2.translate(f, f2);
                                        Rect rect6 = spf0Var3.a;
                                        canvas2.drawBitmap(bitmap, rect6, rect6, (Paint) null);
                                        canvas2.translate(-f, -f2);
                                    }
                                });
                                msgBubbleView.invalidate();
                            }
                            arrayList.add(spf0Var2);
                            i++;
                            dgeVar2 = dgeVar;
                        }
                        view = null;
                    }
                }
            }
            dgeVar = dgeVar2;
            i++;
            dgeVar2 = dgeVar;
        }
        try {
            vpf0Var.a(canvas, rect, arrayList);
        } catch (OutOfMemoryError unused) {
            ArrayList<ac7.a> arrayList2 = this.h.a;
            List O0 = j5g.O0(arrayList2);
            arrayList2.clear();
            Iterator it = O0.iterator();
            while (it.hasNext()) {
                ((ac7.a) it.next()).c.recycle();
            }
            try {
                vpf0Var.a(canvas, rect, arrayList);
            } catch (OutOfMemoryError unused2) {
            }
        }
    }
}
