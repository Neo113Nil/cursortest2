package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;

/* compiled from: SpannableUtils.kt */
/* loaded from: classes17.dex */
public final class ylw {
    public int a;
    public int b;
    public boolean d;
    public int f;
    public int g;
    public int h;
    public final izs<Context, Drawable> i;
    public int c = 1;
    public float e = -1.0f;
    public wzs<? super Context, ? super Integer, ? extends Drawable> j = new uhd(4);

    public ylw(int i) {
        this.i = new wlw(this, i, 0);
    }

    public static void e(ylw ylwVar) {
        ylwVar.e = -1.0f;
        ylwVar.d = true;
    }

    public final void a() {
        this.c = 3;
    }

    public final Spannable b(Context context) {
        int i;
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
        Drawable invoke = this.i.invoke(context);
        if (this.d) {
            invoke = invoke.mutate();
        }
        Drawable drawable = invoke;
        int i2 = this.a;
        if (i2 <= 0 || (i = this.b) <= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            drawable.setBounds(0, 0, i, i2);
        }
        newSpannable.setSpan(new tzx0(drawable, this.c, this.e, this.d, this.f, this.g, this.h), 0, 1, 33);
        return newSpannable;
    }

    public final void c(int i) {
        this.a = i;
        this.b = i;
    }

    public final void d(final int i) {
        this.j = new wzs() { // from class: xsna.xlw
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                return enj.d(((Integer) obj2).intValue(), i, (Context) obj);
            }
        };
    }
}
