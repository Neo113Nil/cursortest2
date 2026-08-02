package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import com.vk.photo.editor.markup.view.DrawingView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: ElementsView.kt */
/* loaded from: classes4.dex */
public final class bbp extends DrawingView {
    public geq i;
    public qkp0 j;
    public final wap k;
    public kc80 l;
    public boolean m;

    public bbp(Context context) {
        super(context, null, 0);
        this.k = new wap(context);
    }

    public final geq getExternalModifier() {
        return this.i;
    }

    public final qkp0 getTransformSessionTouchListener() {
        return this.j;
    }

    @Override // com.vk.photo.editor.markup.view.DrawingView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        bbp bbpVar;
        qkp0 qkp0Var;
        bbp bbpVar2 = this;
        if (bbpVar2.e && !bbpVar2.m) {
            if (bbpVar2.getDrawingSession() != null) {
                bbpVar2.l = null;
                tlo<?> drawingSession = bbpVar2.getDrawingSession();
                r9 = drawingSession != null ? drawingSession.d(motionEvent) : false;
                if (!r9) {
                    bbpVar2.setDrawingSession(null);
                }
                bbpVar2.invalidate();
                return r9;
            }
            wap wapVar = bbpVar2.k;
            wapVar.b.b.onTouchEvent(motionEvent);
            wapVar.c.a(motionEvent);
            wapVar.d.a(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                vlo drawingState = bbpVar2.getDrawingState();
                qcy<Object>[] qcyVarArr = xlo.a;
                List<uap> list = drawingState.a;
                ListIterator<uap> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    }
                    uap previous = listIterator.previous();
                    if ((previous instanceof kc80) && ((kc80) previous).b(motionEvent)) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                int i2 = i;
                uap uapVar = (uap) j5g.b0(i2, bbpVar2.getDrawingState().a);
                if (uapVar == null) {
                    return false;
                }
                geq geqVar = bbpVar2.i;
                if (geqVar != null) {
                    int i3 = 0;
                    bbpVar2 = this;
                    z = geqVar.a(uapVar, new u66(0, bbpVar2, bbp.class, "resetExternalSession", "resetExternalSession()V", i3, 1), new qr0(1, bbpVar2, bbp.class, "addElement", "addElement(Lcom/vk/photo/editor/markup/element/api/Element;)V", i3, 5));
                } else {
                    z = false;
                }
                bbpVar2.m = z;
                if (!z) {
                    bbpVar2.l = uapVar instanceof kc80 ? (kc80) uapVar : null;
                    if (uapVar instanceof skp0) {
                        skp0 skp0Var = (skp0) uapVar;
                        tlo<?> drawingSession2 = bbpVar2.getDrawingSession();
                        if (drawingSession2 != null) {
                            drawingSession2.finish();
                        }
                        bbpVar = bbpVar2;
                        bbpVar.setDrawingSession(new e730(skp0Var, bbpVar2.getCanvasHolder(), bbpVar.k, bbpVar2.j, new n99(1, bbpVar2, bbp.class, "addElement", "addElement(Lcom/vk/photo/editor/markup/element/api/Element;)V", 0, 4)));
                        tlo<?> drawingSession3 = bbpVar.getDrawingSession();
                        if (drawingSession3 != null) {
                            drawingSession3.d(motionEvent);
                        }
                        bbpVar.invalidate();
                        r9 = true;
                        if (!bbpVar.m || r9) {
                            ArrayList arrayList = new ArrayList(bbpVar.getDrawingState().a);
                            arrayList.remove(i2);
                            bbpVar.setDrawingState(vlo.a(bbpVar.getDrawingState(), arrayList));
                            bbpVar.getCanvasHolder().b(bbpVar.getDrawingState());
                        }
                        return !bbpVar.m;
                    }
                }
                bbpVar = bbpVar2;
                if (!bbpVar.m) {
                }
                ArrayList arrayList2 = new ArrayList(bbpVar.getDrawingState().a);
                arrayList2.remove(i2);
                bbpVar.setDrawingState(vlo.a(bbpVar.getDrawingState(), arrayList2));
                bbpVar.getCanvasHolder().b(bbpVar.getDrawingState());
                return !bbpVar.m;
            }
            if (action == 1 || action == 3) {
                bbpVar2.l = null;
                return true;
            }
            kc80 kc80Var = bbpVar2.l;
            if (kc80Var != null && (qkp0Var = bbpVar2.j) != null) {
                qkp0Var.z(kc80Var, motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setExternalModifier(geq geqVar) {
        this.i = geqVar;
    }

    public final void setTransformSessionTouchListener(qkp0 qkp0Var) {
        this.j = qkp0Var;
    }
}
