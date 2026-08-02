package xsna;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes11.dex */
public final class q33 implements Runnable {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Typeface c;
    public final /* synthetic */ int d;

    public q33(TextView textView, Typeface typeface, int i) {
        this.b = textView;
        this.c = typeface;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.setTypeface(this.c, this.d);
    }
}
