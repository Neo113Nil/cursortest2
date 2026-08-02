package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: ClipsHeartAvatarView.kt */
/* loaded from: classes16.dex */
public final class lfe extends View {
    public static final Rect f;
    public c b;
    public b c;
    public a d;
    public final Rect e;

    /* compiled from: ClipsHeartAvatarView.kt */
    public interface a {
    }

    /* compiled from: ClipsHeartAvatarView.kt */
    public interface b {

        /* compiled from: ClipsHeartAvatarView.kt */
        public interface a {
        }

        void b();

        void c(a aVar);

        void d(Canvas canvas, Rect rect);
    }

    /* compiled from: ClipsHeartAvatarView.kt */
    public interface c {
        void a(Canvas canvas);

        void b(lfe lfeVar);

        ccr0 i();

        void load(String str);
    }

    static {
        float f2 = 0;
        f = new Rect(iah0.a(f2), iah0.a(f2), iah0.a(f2), iah0.a(f2));
    }

    public lfe(Context context) {
        super(context, null, 0);
        this.e = new Rect();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b == null) {
            return;
        }
        int save = canvas.save();
        try {
            c cVar = this.b;
            c cVar2 = null;
            if (cVar == null) {
                cVar = null;
            }
            cVar.a(canvas);
            b bVar = this.c;
            if (bVar != null) {
                c cVar3 = this.b;
                if (cVar3 != null) {
                    cVar2 = cVar3;
                }
                bVar.d(canvas, cVar2.i().getBounds());
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect;
        super.onLayout(z, i, i2, i3, i4);
        if (this.b == null) {
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Rect rect2 = this.e;
        rect2.set(0, 0, i5, i6);
        if (this.d != null) {
            float f2 = 0;
            int a2 = iah0.a(f2);
            int a3 = iah0.a(f2);
            int width = rect2.width();
            int i7 = c1d.n;
            rect = new Rect(a2, a3, width - i7, rect2.height() - i7);
        } else {
            rect = f;
        }
        c cVar = this.b;
        if (cVar == null) {
            cVar = null;
        }
        cVar.i().setBounds(rect.left, rect.top, i5 - rect.right, i6 - rect.bottom);
    }

    public final void setHeartAvatarDrawableController(c cVar) {
        this.b = cVar;
        cVar.i().setCallback(this);
    }

    public final void setHeartAvatarDrawableInsetProvider(a aVar) {
        this.d = aVar;
    }

    public final void setHeartAvatarDrawableSlotDecorator(b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        c cVar = this.b;
        if (cVar == null) {
            cVar = null;
        }
        return drawable.equals(cVar.i()) || super.verifyDrawable(drawable);
    }
}
