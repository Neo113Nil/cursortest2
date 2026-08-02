package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import kotlin.a;

/* loaded from: classes10.dex */
public final class lng {
    public final Context a;
    public final i3y b;
    public final i3y c;
    public final i3y d;

    public lng(Context context) {
        this.a = context;
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: kng
            public final /* synthetic */ lng b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float a;
                int i2 = i;
                lng lngVar = this.b;
                switch (i2) {
                    case 0:
                        TextPaint textPaint = new TextPaint();
                        textPaint.setTextSize(lngVar.a.getResources().getDimensionPixelSize(mrg0.component_text_size_body));
                        int[] iArr = up11.a;
                        textPaint.setTypeface(eja1.w(0, 0));
                        return textPaint;
                    case 1:
                        a = lngVar.a("—");
                        break;
                    default:
                        a = lngVar.a("–");
                        break;
                }
                return Float.valueOf(a);
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: kng
            public final /* synthetic */ lng b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float a;
                int i22 = i2;
                lng lngVar = this.b;
                switch (i22) {
                    case 0:
                        TextPaint textPaint = new TextPaint();
                        textPaint.setTextSize(lngVar.a.getResources().getDimensionPixelSize(mrg0.component_text_size_body));
                        int[] iArr = up11.a;
                        textPaint.setTypeface(eja1.w(0, 0));
                        return textPaint;
                    case 1:
                        a = lngVar.a("—");
                        break;
                    default:
                        a = lngVar.a("–");
                        break;
                }
                return Float.valueOf(a);
            }
        });
        final int i3 = 2;
        this.d = a.a(new sls(this) { // from class: kng
            public final /* synthetic */ lng b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float a;
                int i22 = i3;
                lng lngVar = this.b;
                switch (i22) {
                    case 0:
                        TextPaint textPaint = new TextPaint();
                        textPaint.setTextSize(lngVar.a.getResources().getDimensionPixelSize(mrg0.component_text_size_body));
                        int[] iArr = up11.a;
                        textPaint.setTypeface(eja1.w(0, 0));
                        return textPaint;
                    case 1:
                        a = lngVar.a("—");
                        break;
                    default:
                        a = lngVar.a("–");
                        break;
                }
                return Float.valueOf(a);
            }
        });
    }

    public final float a(String str) {
        float measureText = ((Paint) this.b.getValue()).measureText(str);
        if (measureText == 0.0f) {
            jst.e.k(new IllegalStateException("0 width for dash"), "Got 0 width after measuring dash symbol");
        }
        return measureText;
    }
}
