package xsna;

import android.text.Spanned;
import android.text.style.UnderlineSpan;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes17.dex */
public final class u5v<T> implements Comparator {
    public final /* synthetic */ CharSequence b;

    public u5v(Spanned spanned) {
        this.b = spanned;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        CharSequence charSequence = this.b;
        return jw5.b(Integer.valueOf(((Spanned) charSequence).getSpanStart((UnderlineSpan) t)), Integer.valueOf(((Spanned) charSequence).getSpanStart((UnderlineSpan) t2)));
    }
}
