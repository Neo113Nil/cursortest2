package defpackage;

import com.yandex.messaging.ChatRequest;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class ksa0 {
    public abstract osa0 a(String str);

    public abstract List b();

    public abstract int c(String str);

    public abstract List d(String str);

    public abstract long e(wra0 wra0Var);

    public abstract long f(osa0 osa0Var);

    public void g(ChatRequest chatRequest, osa0 osa0Var) {
        e(new wra0(chatRequest, chatRequest.uniqueRequestId()));
        f(osa0Var);
    }

    public abstract int h(String str);

    public abstract int i(String str);

    public abstract int j(String str);

    public void k(ChatRequest chatRequest, String str) {
        if (j(str) <= 0 || c(chatRequest.uniqueRequestId()) != 0) {
            return;
        }
        i(chatRequest.uniqueRequestId());
    }

    public abstract int l(String str);
}
