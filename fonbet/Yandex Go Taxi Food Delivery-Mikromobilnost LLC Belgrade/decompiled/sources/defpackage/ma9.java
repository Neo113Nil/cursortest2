package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.d;

/* loaded from: classes5.dex */
public final class ma9 implements wni {
    public final Context a;
    public final d b;
    public final hwy0 c;

    public ma9(Context context, d dVar, hwy0 hwy0Var) {
        this.a = context;
        this.b = dVar;
        this.c = hwy0Var;
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a, null, 0, 6, null);
        composeView.setContent(new a(-381641654, new ka9(this, 0), true));
        return composeView;
    }
}
