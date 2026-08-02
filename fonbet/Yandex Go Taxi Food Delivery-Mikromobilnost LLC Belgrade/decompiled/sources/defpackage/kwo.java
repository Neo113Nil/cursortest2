package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui.c;

/* loaded from: classes5.dex */
public final class kwo implements wni {
    public final Context a;
    public final c b;
    public final hwy0 c;

    public kwo(Context context, c cVar, hwy0 hwy0Var) {
        this.a = context;
        this.b = cVar;
        this.c = hwy0Var;
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a, null, 0, 6, null);
        composeView.setContent(new a(-932890043, new iwo(this, 0), true));
        return composeView;
    }
}
