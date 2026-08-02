package defpackage;

import com.yandex.go.payments.addmethod.data.model.ApplicationBindingFlow;
import com.yandex.go.payments.addmethod.data.model.AsyncApplicationBindingFlow;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import java.util.Arrays;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes13.dex */
public final class mv5 extends xqt {
    public static final mv5 e = new mv5();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, WebviewBindingFlow.Companion.serializer(), qoi0.a(WebviewBindingFlow.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return "binding_flow";
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(ClidProvider.APPLICATION, ApplicationBindingFlow.Companion.serializer(), qoi0.a(ApplicationBindingFlow.class)), new f9("webview", WebviewBindingFlow.Companion.serializer(), qoi0.a(WebviewBindingFlow.class)), new f9("async_application", AsyncApplicationBindingFlow.Companion.serializer(), qoi0.a(AsyncApplicationBindingFlow.class)));
    }
}
