package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;

/* loaded from: classes5.dex */
public final class ku41 implements ju41 {
    public final r0 a;
    public final gci0 b;

    public ku41() {
        r0 c = bvf0.c(WebViewState.READY);
        this.a = c;
        this.b = e.d(c);
    }

    @Override // defpackage.ju41
    public final gci0 getCurrentState() {
        return this.b;
    }
}
