package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import xsna.b5x;

/* compiled from: InspectorImpl.kt */
/* loaded from: classes18.dex */
public final class n5x implements izs<Context, View> {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ b5x.c c;
    public final /* synthetic */ q5x d;

    public n5x(Activity activity, b5x.c cVar, q5x q5xVar) {
        this.b = activity;
        this.c = cVar;
        this.d = q5xVar;
    }

    @Override // xsna.izs
    public final View invoke(Context context) {
        b6x b6xVar = new b6x(this.b);
        b6xVar.setInspectorParams(this.c);
        b6xVar.setStyle(this.d.d.a);
        return b6xVar;
    }
}
