package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;

/* loaded from: classes5.dex */
public class g7h implements qm6, nwy0 {
    public final boolean A;
    public float B;
    public kdc D;
    public Drawable E;
    public Drawable F;
    public final Context a;
    public int b;
    public int c;
    public float w;
    public float x;
    public BubbleComponent z;
    public Rect y = new Rect(0, 0, 0, 0);
    public DefaultBubbleDecorator$Position C = DefaultBubbleDecorator$Position.CENTER;
    public DefaultBubbleDecorator$Direction G = DefaultBubbleDecorator$Direction.DOWN;

    public g7h(Context context) {
        this.a = context;
        this.A = xw31.n(context);
        this.E = tje.y(dzg0.bubble_default_pointer, context).mutate();
        this.F = tje.y(dzg0.bubble_default_frame, context).mutate();
        q(tje.u(24, context), context.getResources().getDimensionPixelSize(mrg0.go_design_s_space));
    }

    public static void g(Drawable drawable, Integer num) {
        if (num != null) {
            drawable.setTint(num.intValue());
        } else {
            drawable.setTintList(null);
        }
    }

    @Override // defpackage.qm6
    public final void a(Canvas canvas, int i, int i2, int i3, int i4) {
        Rect rect = this.y;
        int i5 = ((i3 - i) - rect.left) - rect.right;
        int i6 = ((i4 - i2) - rect.top) - rect.bottom;
        canvas.save();
        canvas.translate(i, i2);
        i(canvas, i5, i6);
        j(canvas, i5, i6);
        canvas.restore();
    }

    @Override // defpackage.qm6
    public void applyTheme() {
        m();
    }

    @Override // defpackage.qm6
    public final void b(kdc kdcVar) {
        this.D = kdcVar;
        m();
    }

    @Override // defpackage.qm6
    public final Rect c() {
        return this.y;
    }

    @Override // defpackage.qm6
    public final void d(BubbleComponent bubbleComponent) {
        this.z = bubbleComponent;
    }

    @Override // defpackage.qm6
    public final void detach() {
        this.z = null;
    }

    @Override // defpackage.qm6
    public final kdc e() {
        return this.D;
    }

    public void f(Integer num) {
        g(l(), num);
        g(k(), num);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float h(int i) {
        int i2 = f7h.a[this.G.ordinal()];
        boolean z = this.A;
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                if (z) {
                    return i;
                }
                return 0.0f;
            }
            if (i2 == 4) {
                if (z) {
                    return 0.0f;
                }
                return i;
            }
            if (i2 == 5) {
                return 0.0f;
            }
            w511.b();
            return 0.0f;
        }
        float f = this.w;
        float f2 = this.B;
        float f3 = f + f2;
        float f4 = i;
        float f5 = (f4 - f) - f2;
        int i3 = i - this.c;
        int i4 = f7h.b[this.C.ordinal()];
        if (i4 == 1) {
            return (f4 / 2.0f) + this.B;
        }
        if (i4 != 2) {
            if (i4 == 3) {
                return z ? f3 : f5;
            }
            if (i4 != 4) {
                w511.b();
                return 0.0f;
            }
            float f6 = this.w;
            float f7 = i3;
            float f8 = this.B;
            if (z) {
                f8 = 1.0f - f8;
            }
            return (f7 * f8) + f6;
        }
        if (z) {
        }
    }

    public void i(Canvas canvas, int i, int i2) {
        canvas.save();
        Rect rect = this.y;
        canvas.translate(rect.left, rect.top);
        k().setBounds(0, 0, i, i2);
        k().draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r10 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r8 = 90.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0034, code lost:
    
        if (r10 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(Canvas canvas, int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction = this.G;
        defaultBubbleDecorator$Direction.getClass();
        if (defaultBubbleDecorator$Direction == DefaultBubbleDecorator$Direction.NONE) {
            return;
        }
        DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction2 = this.G;
        int[] iArr = f7h.a;
        int i3 = iArr[defaultBubbleDecorator$Direction2.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                f = -90.0f;
                boolean z = this.A;
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            w511.b();
                            return;
                        }
                    }
                }
            }
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        canvas.translate(-this.w, -this.x);
        float h = h(i);
        int i4 = iArr[this.G.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 || i4 == 4) {
                    int i5 = i2 - this.c;
                    int i6 = f7h.b[this.C.ordinal()];
                    if (i6 == 1) {
                        f3 = i2 / 2.0f;
                        f4 = this.B;
                    } else if (i6 == 2) {
                        f3 = this.w;
                        f4 = this.B;
                    } else if (i6 == 3) {
                        f2 = (i2 - this.w) - this.B;
                    } else if (i6 != 4) {
                        w511.b();
                        return;
                    } else {
                        f2 = (i5 * this.B) + this.w;
                    }
                    f2 = f4 + f3;
                } else if (i4 != 5) {
                    w511.b();
                    return;
                }
            }
            f2 = 0.0f;
        } else {
            f2 = i2;
        }
        canvas.translate(h, f2);
        DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction3 = this.G;
        defaultBubbleDecorator$Direction3.getClass();
        int[] iArr2 = e7h.a;
        int i7 = iArr2[defaultBubbleDecorator$Direction3.ordinal()];
        if (i7 == 1 || i7 == 2) {
            canvas.translate(this.x, 0.0f);
        } else {
            DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction4 = this.G;
            defaultBubbleDecorator$Direction4.getClass();
            int i8 = iArr2[defaultBubbleDecorator$Direction4.ordinal()];
            if (i8 == 3 || i8 == 4) {
                canvas.translate(0.0f, this.x);
            }
        }
        canvas.rotate(f, this.w, this.x);
        l().setBounds(0, 0, this.c, this.b);
        l().draw(canvas);
    }

    public Drawable k() {
        return this.F;
    }

    public Drawable l() {
        return this.E;
    }

    public final void m() {
        kdc kdcVar = this.D;
        f(kdcVar != null ? Integer.valueOf(s8o.m(kdcVar, this.a)) : null);
        BubbleComponent bubbleComponent = this.z;
        if (bubbleComponent != null) {
            bubbleComponent.invalidate();
        }
    }

    public void n(Drawable drawable) {
        this.F = drawable.mutate();
        m();
    }

    public final void o(DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction) {
        this.G = defaultBubbleDecorator$Direction;
        r();
    }

    public void p(DefaultBubbleDecorator$Position defaultBubbleDecorator$Position, float f) {
        this.C = defaultBubbleDecorator$Position;
        this.B = f;
        m();
    }

    public final void q(int i, int i2) {
        this.c = i;
        this.b = i2;
        this.w = i / 2.0f;
        this.x = i2 / 2.0f;
        r();
    }

    public final void r() {
        int i;
        int i2;
        int i3;
        int i4 = f7h.a[this.G.ordinal()];
        int i5 = 0;
        if (i4 == 1) {
            i = this.b;
            i2 = 0;
            i3 = 0;
        } else if (i4 == 2) {
            i3 = this.b;
            i2 = 0;
            i = 0;
        } else if (i4 != 3) {
            if (i4 == 4) {
                i2 = this.b;
                i3 = 0;
            } else if (i4 != 5) {
                w511.b();
                return;
            } else {
                i2 = 0;
                i3 = 0;
            }
            i = i3;
        } else {
            i3 = 0;
            i = 0;
            i5 = this.b;
            i2 = 0;
        }
        if (this.A) {
            int i6 = i5;
            i5 = i2;
            i2 = i6;
        }
        this.y = new Rect(i5, i3, i2, i);
        BubbleComponent bubbleComponent = this.z;
        if (bubbleComponent != null) {
            bubbleComponent.requestLayout();
        }
    }
}
