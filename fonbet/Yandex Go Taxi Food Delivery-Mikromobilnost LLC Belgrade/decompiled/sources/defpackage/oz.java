package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class oz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b00 b;
    public final /* synthetic */ ChatRequest c;

    public /* synthetic */ oz(b00 b00Var, ChatRequest chatRequest, int i) {
        this.a = i;
        this.b = b00Var;
        this.c = chatRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ChatRequest chatRequest = this.c;
        b00 b00Var = this.b;
        switch (i) {
            case 0:
                b00.a(b00Var).a(new wg9(chatRequest, b00Var.h, b00Var.e));
                break;
            case 1:
                b00.a(b00Var).a(new d1o(chatRequest, b00Var.f, b00Var.d));
                break;
            case 2:
                ((i00) b00Var.j.getValue()).a(new b9y(chatRequest));
                break;
            default:
                b00.a(b00Var).a(new l221(chatRequest, b00Var.d));
                break;
        }
    }
}
