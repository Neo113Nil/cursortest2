package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class pz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b00 b;
    public final /* synthetic */ ChatRequest c;

    public /* synthetic */ pz(b00 b00Var, ChatRequest chatRequest, int i) {
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
                b00.a(b00Var).a(new p0b(chatRequest));
                break;
            case 1:
                ((i00) b00Var.j.getValue()).a(new e050(chatRequest));
                break;
            case 2:
                b00.a(b00Var).a(new h7j0(chatRequest));
                break;
            default:
                b00.a(b00Var).a(new ttb0(chatRequest, null));
                break;
        }
    }
}
