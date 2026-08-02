package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.im.design.R$styleable;
import com.vkontakte.android.R;

/* compiled from: CounterView.kt */
/* loaded from: classes2.dex */
public class zxj extends AppCompatTextView implements too0 {
    public final StringBuilder b;
    public final wng0 c;
    public boolean d;
    public int e;

    public zxj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void Ng() {
        e();
    }

    public void b(int i, StringBuilder sb) {
        if (i < 1000) {
            sb.append(i);
            return;
        }
        if (i < 1000000) {
            sb.append(i / 1000);
            sb.append('K');
        } else if (i >= 1000000000) {
            sb.append("∞");
        } else {
            sb.append(i / 1000000);
            sb.append('M');
        }
    }

    public final void e() {
        boolean z = this.d;
        wng0 wng0Var = this.c;
        if (z) {
            abg0 abg0Var = dhr0.t;
            setTextColor(abg0Var.c(R.attr.vk_legacy_counter_secondary_text));
            wng0Var.b(abg0Var.c(R.attr.vk_legacy_counter_secondary_background));
        } else {
            abg0 abg0Var2 = dhr0.t;
            setTextColor(abg0Var2.c(R.attr.vk_legacy_counter_primary_text));
            wng0Var.b(abg0Var2.c(this.e));
        }
    }

    public final int getBaseColor() {
        return this.e;
    }

    public final wng0 getBgDrawable() {
        return this.c;
    }

    public final StringBuilder getCounterSb() {
        return this.b;
    }

    public final void setBaseColor(int i) {
        this.e = i;
        e();
    }

    public final void setCounter(int i) {
        StringBuilder sb = this.b;
        sb.setLength(0);
        b(i, sb);
        setText(sb);
    }

    public final void setMuted(boolean z) {
        this.d = z;
        e();
    }

    public zxj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new StringBuilder();
        wng0 wng0Var = new wng0();
        this.c = wng0Var;
        this.e = R.attr.vk_legacy_counter_primary_background;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, 0, 0);
        wng0.e(obtainStyledAttributes.getDimensionPixelSize(0, cn70.b(12)), wng0Var);
        setBackground(wng0Var);
        obtainStyledAttributes.recycle();
    }
}
