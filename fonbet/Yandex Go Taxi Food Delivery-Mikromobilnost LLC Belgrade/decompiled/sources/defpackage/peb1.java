package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import androidx.core.view.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes11.dex */
public abstract class peb1 {
    public static final s72 a(u92 u92Var) {
        Canvas canvas = t72.a;
        s72 s72Var = new s72();
        s72Var.a = new Canvas(hua1.a(u92Var));
        return s72Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if ((r18 & 16) != 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(CharSequence charSequence, f530 f530Var, final int i, final int i2, fid fidVar, int i3, int i4) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1117001718);
        int i5 = 2;
        int i6 = i3 | (btsVar.k(charSequence) ? 4 : 2) | (((i4 & 16) == 0 && btsVar.c(i2)) ? 16384 : 8192);
        if (btsVar.V(i6 & 1, (i6 & 9363) != 9362)) {
            btsVar.a0();
            if ((i3 & 1) == 0 || btsVar.C()) {
                if ((i4 & 16) != 0) {
                    i2 = xng0.textMain;
                    i6 &= -57345;
                }
                btsVar.u();
                boolean z = (((57344 & i6) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar.c(i2)) || (i6 & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384;
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (z || Q == o430Var) {
                    Q = new tls() { // from class: jiy
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            RobotoTextView robotoTextView = new RobotoTextView((Context) obj, null, 0, 6, null);
                            robotoTextView.setImportantForAccessibility(2);
                            b.p(robotoTextView, null);
                            int u = tje.u(2, robotoTextView.getContext());
                            robotoTextView.setPadding(u, u, u, u);
                            robotoTextView.setTextSize(13.0f);
                            robotoTextView.setTextColor(new bdc(i2));
                            robotoTextView.setTextTypeface(i);
                            return robotoTextView;
                        }
                    };
                    btsVar.o0(Q);
                }
                tls tlsVar = (tls) Q;
                boolean z2 = (i6 & 14) == 4;
                Object Q2 = btsVar.Q();
                if (z2 || Q2 == o430Var) {
                    Q2 = new oau(i5, charSequence);
                    btsVar.o0(Q2);
                }
                androidx.compose.ui.viewinterop.b.a(tlsVar, f530Var, (tls) Q2, btsVar, 48, 0);
            } else {
                btsVar.Y();
            }
        } else {
            btsVar.Y();
        }
        int i7 = i2;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bn1(charSequence, f530Var, i, i7, i3, i4);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }
}
