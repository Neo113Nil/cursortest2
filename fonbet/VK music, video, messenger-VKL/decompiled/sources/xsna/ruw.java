package xsna;

import android.content.Context;
import android.view.GestureDetector;
import xsna.p52;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class ruw {
    public final p52.k a;
    public int b = 0;
    public boolean c;
    public final GestureDetector d;

    public ruw(Context context, p52.k kVar) {
        this.a = kVar;
        this.d = new GestureDetector(context, new quw(this));
    }
}
