package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import ru.yandex.taxi.logistics.sdk.tracking.impl.show_content.ui.a;

/* loaded from: classes5.dex */
public final class f6s0 implements wni {
    public final Context a;
    public final a b;
    public final tgg c;
    public final hwy0 w;

    public f6s0(Context context, a aVar, tgg tggVar, hwy0 hwy0Var) {
        this.a = context;
        this.b = aVar;
        this.c = tggVar;
        this.w = hwy0Var;
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(-1068861980, new e6s0(this, 0), true));
        return composeView;
    }
}
