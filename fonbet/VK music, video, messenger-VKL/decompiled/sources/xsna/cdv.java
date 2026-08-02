package xsna;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes15.dex */
public final class cdv implements View.OnLayoutChangeListener {
    public final /* synthetic */ jcg b;

    public cdv(jcg jcgVar) {
        this.b = jcgVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.invoke();
    }
}
