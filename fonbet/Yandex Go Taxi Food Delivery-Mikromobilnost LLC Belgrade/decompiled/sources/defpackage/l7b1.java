package defpackage;

import android.view.inputmethod.ExtractedText;
import com.google.android.gms.internal.maps.zzi;
import com.yandex.payment.sdk.core.data.PaymentMethod;

/* loaded from: classes11.dex */
public abstract class l7b1 {
    public static zzi a;

    public static final PaymentMethod a(vcq0 vcq0Var) {
        if (vcq0Var == null) {
            vcq0Var = null;
        }
        if (vcq0Var != null) {
            return vcq0Var.a;
        }
        ny61.g("Wrong type");
        return null;
    }

    public static final ExtractedText b(hoy0 hoy0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = hoy0Var.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = hoy0Var.b;
        extractedText.selectionStart = asy0.f(j);
        extractedText.selectionEnd = asy0.e(j);
        extractedText.flags = !evu0.z(hoy0Var.a.b, '\n') ? 1 : 0;
        return extractedText;
    }
}
