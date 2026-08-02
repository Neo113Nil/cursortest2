package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class l7f extends s120 {
    public final ChatRequest a;
    public final g720 b;

    public l7f(g720 g720Var, ChatRequest chatRequest) {
        this.a = chatRequest;
        this.b = g720Var;
    }

    @Override // defpackage.s120
    public final String a() {
        return "Messaging.Arguments.Key.CreateUserPoll";
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.b;
    }
}
