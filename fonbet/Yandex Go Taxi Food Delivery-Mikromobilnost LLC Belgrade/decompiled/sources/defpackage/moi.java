package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes5.dex */
public final class moi implements wni {
    public final Context a;
    public final hwy0 b;
    public final dci c;
    public final poi w;

    public moi(Context context, hwy0 hwy0Var, dci dciVar, poi poiVar) {
        this.a = context;
        this.b = hwy0Var;
        this.c = dciVar;
        this.w = poiVar;
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a, null, 0, 6, null);
        composeView.setContent(new a(104697281, new loi(this, 0), true));
        return composeView;
    }
}
