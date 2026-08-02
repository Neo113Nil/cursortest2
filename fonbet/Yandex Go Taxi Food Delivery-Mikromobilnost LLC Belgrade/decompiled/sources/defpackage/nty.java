package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.ListReactionsResponse;

/* loaded from: classes15.dex */
public abstract class nty implements o5t0 {
    public void b(ListReactionsResponse listReactionsResponse) {
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return ListReactionsResponse.class;
    }

    public abstract void f(ListReactionsResponse listReactionsResponse);

    @Override // defpackage.o5t0
    public final String k() {
        return "list_reactions";
    }

    @Override // defpackage.o5t0
    public final int n(Object obj) {
        ListReactionsResponse listReactionsResponse = (ListReactionsResponse) obj;
        if (listReactionsResponse.getStatus() == 0) {
            f(listReactionsResponse);
            return 0;
        }
        b(listReactionsResponse);
        return o5t0.o(listReactionsResponse.getStatus());
    }
}
