package defpackage;

import android.view.textclassifier.TextClassifier;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes10.dex */
public final class pr2 {
    public final /* synthetic */ AppCompatEditText a;

    public pr2(AppCompatEditText appCompatEditText) {
        this.a = appCompatEditText;
    }

    public final TextClassifier a() {
        TextClassifier textClassifier;
        textClassifier = super/*android.widget.TextView*/.getTextClassifier();
        return textClassifier;
    }

    public final void b(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }
}
