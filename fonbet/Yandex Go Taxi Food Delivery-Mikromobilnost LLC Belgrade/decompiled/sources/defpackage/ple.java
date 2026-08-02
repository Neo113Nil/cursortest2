package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public final class ple extends wtf0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ple(String str, int i) {
        super("ContractsInternal.ConsumerRegistry.DeliveryFailed", g8e.z("registry_name", str));
        switch (i) {
            case 4:
                super(4, "web-chat-handle-web-directive-error", g8e.z("error_message", str), false);
                break;
            case 7:
                super(4, "web-chat-synchronize-authorization-error", g8e.z("error_message", str), false);
                break;
            default:
                break;
        }
    }

    public ple(String str, String str2) {
        super("Core.ErrorLog", b.i(new Pair("msg", str), new Pair(Constants.KEY_EXCEPTION, str2)));
    }

    public ple(ya41 ya41Var) {
        super(4, "web-chat-synchronize-authorization-success", ya41Var.c(), false);
    }
}
