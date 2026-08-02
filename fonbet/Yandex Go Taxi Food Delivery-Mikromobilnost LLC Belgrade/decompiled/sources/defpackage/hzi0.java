package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.d;

/* loaded from: classes5.dex */
public final class hzi0 implements wni {
    public final Context a;
    public final d b;
    public final hwy0 c;
    public final dci w;

    public hzi0(Context context, d dVar, hwy0 hwy0Var, dci dciVar) {
        this.a = context;
        this.b = dVar;
        this.c = hwy0Var;
        this.w = dciVar;
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a, null, 0, 6, null);
        composeView.setContent(new a(268721892, new fzi0(this, 0), true));
        return composeView;
    }
}
