package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.vkontakte.android.attachments.PhotoAttachment;
import xsna.tna0;

/* compiled from: FeedPinchGestureHelper.kt */
/* loaded from: classes4.dex */
public final class h2r implements tna0.a, View.OnTouchListener {
    public final gzs<PhotoAttachment> b;
    public final tna0 c = new tna0(this);
    public a d;
    public boolean e;

    /* compiled from: FeedPinchGestureHelper.kt */
    public interface a {
        void E4(PhotoAttachment photoAttachment);

        void W(float f, float f2, float f3, float f4, float f5);

        void m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h2r(View view, gzs<? extends PhotoAttachment> gzsVar) {
        this.b = gzsVar;
        view.setOnTouchListener(this);
    }

    @Override // xsna.tna0.a
    public final void W(float f, float f2, float f3, float f4, float f5) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.W(f, f2, f3, f4, f5);
        }
    }

    @Override // xsna.tna0.a
    public final void a(float f, float f2, float f3, float f4) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.E4(this.b.invoke());
        }
    }

    @Override // xsna.tna0.a
    public final void m() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.m();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        boolean a2 = this.e ? this.c.a(motionEvent) : false;
        if (a2 && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return a2;
    }
}
