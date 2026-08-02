package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.e3m;

/* compiled from: LayerListDrawable.kt */
/* loaded from: classes17.dex */
public final class hny extends Drawable {
    public final Context a;
    public final ArrayList<c> b = new ArrayList<>();
    public int c;

    /* compiled from: LayerListDrawable.kt */
    public static final class a extends c {
        public final baf0 b;
        public final apo c;

        public a(baf0 baf0Var, int i) {
            super(baf0Var);
            this.b = baf0Var;
            this.c = new apo(i);
        }

        @Override // xsna.hny.c
        public final void a() {
            this.b.a(this.c.a());
        }
    }

    /* compiled from: LayerListDrawable.kt */
    public static final class d extends b {
        public final apo e;

        public d(int i, float f) {
            super(f);
            this.e = new apo(i);
        }

        @Override // xsna.hny.b
        public final int a() {
            return this.e.a();
        }
    }

    /* compiled from: LayerListDrawable.kt */
    public static final class e extends c {
        public final baf0 b;

        public e(baf0 baf0Var) {
            super(baf0Var);
            this.b = baf0Var;
        }

        @Override // xsna.hny.c
        public final void a() {
            dhr0.a.getClass();
            this.b.a(dhr0.E().getColor(R.color.vk_white));
        }
    }

    public hny(Context context) {
        this.a = context;
    }

    public final void a(float f, int i) {
        e3m.a aVar = e3m.a;
        this.b.add(new c(new b(this.a.getColor(i), f)));
    }

    public final void b(Drawable drawable) {
        if (drawable != null) {
            this.b.add(new c(drawable));
        }
    }

    public final void c(float f, int i) {
        this.b.add(new c(new d(i, f)));
    }

    public final void d(int i, int i2) {
        e3m.a aVar = e3m.a;
        this.b.add(new a(new baf0(m33.a(i, this.a), 0), i2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        if (this.c != dhr0.C().c) {
            this.c = dhr0.C().c;
            z = true;
        } else {
            z = false;
        }
        Iterator<c> it = this.b.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (z) {
                next.a();
            }
            next.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int intrinsicHeight;
        int i;
        int intrinsicWidth;
        int i2;
        super.onBoundsChange(rect);
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            Drawable drawable = ((c) it.next()).a;
            if (drawable.getIntrinsicHeight() < 0) {
                i = rect.top;
                intrinsicHeight = rect.bottom;
            } else {
                int height = (rect.height() - drawable.getIntrinsicHeight()) / 2;
                int i3 = rect.top;
                int i4 = i3 + height;
                intrinsicHeight = i3 + height + drawable.getIntrinsicHeight();
                i = i4;
            }
            if (drawable.getIntrinsicWidth() < 0) {
                i2 = rect.left;
                intrinsicWidth = rect.right;
            } else {
                int width = (rect.width() - drawable.getIntrinsicWidth()) / 2;
                int i5 = rect.left;
                int i6 = i5 + width;
                intrinsicWidth = i5 + width + drawable.getIntrinsicWidth();
                i2 = i6;
            }
            drawable.setBounds(i2, i, intrinsicWidth, intrinsicHeight);
        }
    }

    /* compiled from: LayerListDrawable.kt */
    public static class b extends Drawable {
        public final float a;
        public final int b;
        public final RectF c;
        public final Paint d;

        public b(float f) {
            this.a = f;
            this.b = -16777216;
            this.c = new RectF();
            this.d = new Paint(1);
        }

        public int a() {
            return this.b;
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            int a = a();
            Paint paint = this.d;
            paint.setColor(a);
            float f = this.a;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawRoundRect(this.c, f, f, paint);
            } else if (f == -1.0f) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2, paint);
            } else {
                canvas.drawPaint(paint);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public final void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.c.set(rect);
        }

        public b(int i, float f) {
            this(f);
            this.b = i;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* compiled from: LayerListDrawable.kt */
    public static class c {
        public final Drawable a;

        public c(Drawable drawable) {
            this.a = drawable;
        }

        public void a() {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
