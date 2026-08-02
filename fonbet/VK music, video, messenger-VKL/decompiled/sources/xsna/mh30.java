package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.SparseArray;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MsgBubbleDrawable.kt */
/* loaded from: classes2.dex */
public final class mh30 extends Drawable {
    public final Context a;
    public int c;
    public Drawable e;
    public final SparseArray<Drawable> b = new SparseArray<>();
    public final Rect d = new Rect();
    public final Rect f = new Rect();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgBubbleDrawable.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a END;
        public static final a START;
        private final int index;

        static {
            a aVar = new a("START", 0, -1);
            START = aVar;
            a aVar2 = new a("END", 1, -2);
            END = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2) {
            this.index = i2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.index;
        }
    }

    public mh30(Context context) {
        this.a = context;
        setAlpha(255);
        oh30 oh30Var = oh30.l;
        a(oh30.F, MsgBubblePart.FULL, 0);
    }

    public final void a(oh30 oh30Var, MsgBubblePart msgBubblePart, int i) {
        Drawable drawable;
        hl8 hl8Var = oh30Var.d;
        boolean z = oh30Var.k;
        int b = oh30Var.b.b(msgBubblePart);
        Context context = this.a;
        int g = b == 0 ? 0 : e3m.g(b, context);
        if (g == 0) {
            this.e = null;
        } else {
            SparseArray<Drawable> sparseArray = this.b;
            Drawable drawable2 = sparseArray.get(g);
            if (drawable2 == null) {
                e3m.a aVar = e3m.a;
                drawable2 = m33.a(g, context).mutate();
                sparseArray.put(g, drawable2);
            }
            Drawable drawable3 = drawable2;
            if (oh30Var.j) {
                int h = (z ? a.END : a.START).h();
                Drawable drawable4 = sparseArray.get(h);
                if (drawable4 == null) {
                    Resources resources = context.getResources();
                    nh30 nh30Var = new nh30(z);
                    nh30Var.setTint(z ? e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_outgoing, context) : e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_incoming, context));
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, xjo.b(nh30Var, 0, 0, 7));
                    sparseArray.put(h, bitmapDrawable);
                    drawable4 = bitmapDrawable;
                }
                drawable = drawable4;
            } else {
                drawable = null;
            }
            if (drawable != null) {
                LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) e43.l(drawable3, drawable).toArray(new Drawable[0]));
                layerDrawable.setLayerGravity(1, (z ? 5 : 3) | 48);
                layerDrawable.setLayerInsetTop(0, iah0.a(4.2f));
                if (z) {
                    layerDrawable.setLayerInsetRight(1, iah0.a(12.0f));
                } else {
                    layerDrawable.setLayerInsetLeft(1, iah0.a(12.0f));
                }
                drawable3 = layerDrawable;
            }
            this.e = drawable3;
            if (i != 0 && hl8Var.a() != null) {
                Drawable drawable5 = this.e;
                if (drawable5 != null) {
                    drawable5.setTint(l8g.f(1.0f, i));
                }
                Drawable drawable6 = this.e;
                if (drawable6 != null) {
                    drawable6.setTintMode(hl8Var.a());
                }
            }
        }
        Drawable drawable7 = this.e;
        if (drawable7 != null) {
            drawable7.setColorFilter(null);
        }
        Drawable drawable8 = this.e;
        if (drawable8 != null) {
            drawable8.setBounds(this.d);
        }
        this.f.set(oh30Var.c.j(msgBubblePart));
        setAlpha((i >> 24) & 255);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        rect.set(this.f);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect rect2 = this.d;
        rect2.set(rect);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c = i;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new IllegalStateException();
    }
}
