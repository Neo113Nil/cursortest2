package xsna;

import android.graphics.Canvas;
import android.view.MotionEvent;
import com.vk.photo.editor.markup.view.DrawingView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.uap;

/* compiled from: NewElementDrawingSession.kt */
/* loaded from: classes4.dex */
public final class k760<E extends uap> implements tlo<E> {
    public final yap<E> a;
    public final vap<E, ? extends uap> b;
    public final jti0 c;
    public final DrawingView.a d;
    public final z860 e;

    /* compiled from: NewElementDrawingSession.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            k760 k760Var = (k760) this.receiver;
            k760Var.finish();
            z860 z860Var = k760Var.e;
            if (z860Var != null) {
                z860Var.onFinish();
            }
            return s3q0.a;
        }
    }

    public k760(yap yapVar, vap vapVar, jti0 jti0Var, DrawingView.a aVar, z860 z860Var) {
        this.a = yapVar;
        this.b = vapVar;
        this.c = jti0Var;
        this.d = aVar;
        this.e = z860Var;
    }

    @Override // xsna.tlo
    public final void a(Canvas canvas) {
        jti0 jti0Var = this.c;
        jti0Var.getClass();
        yap<E> yapVar = this.a;
        if (yapVar.b()) {
            yapVar.a(jti0Var.d());
            return;
        }
        qu90 c = jti0Var.c();
        if (!yapVar.f()) {
            c.clear();
        }
        yapVar.a(c);
        c.d(canvas);
    }

    @Override // xsna.tlo
    public final boolean d(MotionEvent motionEvent) {
        z860 z860Var = this.e;
        if (z860Var != null) {
            z860Var.d(motionEvent);
        }
        int action = motionEvent.getAction();
        yap<E> yapVar = this.a;
        if (action == 0) {
            yapVar.c(motionEvent);
            return true;
        }
        if (action == 1) {
            yapVar.d(motionEvent, new a(0, this, k760.class, "endProduce", "endProduce()V", 0));
            return true;
        }
        if (action == 2) {
            yapVar.e(motionEvent);
            return true;
        }
        if (action != 3) {
            return true;
        }
        yapVar.reset();
        this.c.f();
        return true;
    }

    @Override // xsna.tlo
    public final void finish() {
        yap<E> yapVar = this.a;
        E create = yapVar.create();
        vap<E, ? extends uap> vapVar = this.b;
        if (vapVar != null) {
            create = create != null ? vapVar.a(create) : null;
        }
        if (create != null) {
            this.d.invoke(create);
        }
        yapVar.reset();
        this.c.f();
    }
}
