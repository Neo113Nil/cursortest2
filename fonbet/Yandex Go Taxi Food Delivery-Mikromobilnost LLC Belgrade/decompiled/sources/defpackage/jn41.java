package defpackage;

import com.yandex.plus.webview.api.container.WebViewContainerType;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes2.dex */
public final class jn41 implements xm41 {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // defpackage.xm41
    public final Set h() {
        return EmptySet.a;
    }

    @Override // defpackage.xm41
    public final void j(WebViewContainerType webViewContainerType, ym41 ym41Var) {
        this.a.put(webViewContainerType, new WeakReference(ym41Var));
    }
}
