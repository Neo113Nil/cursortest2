package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;

/* loaded from: classes15.dex */
public final class mz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b00 b;
    public final /* synthetic */ ChatRequest c;
    public final /* synthetic */ LocalMessageRef w;

    public /* synthetic */ mz(b00 b00Var, ChatRequest chatRequest, LocalMessageRef localMessageRef, int i) {
        this.a = i;
        this.b = b00Var;
        this.c = chatRequest;
        this.w = localMessageRef;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i7b i7bVar;
        int i = this.a;
        LocalMessageRef localMessageRef = this.w;
        ChatRequest chatRequest = this.c;
        b00 b00Var = this.b;
        switch (i) {
            case 0:
                rsa0 rsa0Var = (rsa0) b00Var.k.getValue();
                i6f0 i6f0Var = rsa0Var.b;
                kse.a(rsa0Var.a);
                String messageId = localMessageRef.getMessageId();
                if (messageId == null) {
                    ny61.g("Required value was null.");
                    break;
                } else {
                    qsa0 qsa0Var = (qsa0) i6f0Var.b.get(messageId);
                    if (qsa0Var != null) {
                        kse.a(qsa0Var.g.a);
                        qsa0Var.e = true;
                        c18 c18Var = qsa0Var.d;
                        if (c18Var != null) {
                            c18Var.cancel();
                        }
                        qsa0Var.d = null;
                        i6f0Var.a.a(chatRequest, messageId);
                        i6f0Var.b.remove(messageId);
                    }
                    psa0 b = rsa0Var.b(chatRequest);
                    i7bVar = b != null ? b.b : null;
                    if (i7bVar != null) {
                        i7bVar.b(localMessageRef);
                    }
                    rsa0Var.f.k(chatRequest, messageId);
                    break;
                }
            case 1:
                rsa0 rsa0Var2 = (rsa0) b00Var.k.getValue();
                i6f0 i6f0Var2 = rsa0Var2.b;
                ksa0 ksa0Var = rsa0Var2.f;
                kse.a(rsa0Var2.a);
                String messageId2 = localMessageRef.getMessageId();
                if (messageId2 == null) {
                    ny61.g("Required value was null.");
                    break;
                } else if (!rsa0Var2.c.d.get()) {
                    psa0 b2 = rsa0Var2.b(chatRequest);
                    i7bVar = b2 != null ? b2.b : null;
                    if (i7bVar != null) {
                        osa0 a = ksa0Var.a(messageId2);
                        if (a == null) {
                            ny61.g("Required value was null.");
                            break;
                        } else {
                            rsa0Var2.d.getClass();
                            yw80 c = ax80.c(a);
                            qsa0 qsa0Var2 = (qsa0) i6f0Var2.b.get(messageId2);
                            if (qsa0Var2 == null) {
                                qsa0Var2 = new qsa0(rsa0Var2, chatRequest, i7bVar, c);
                            }
                            qsa0Var2.c();
                            if (!qsa0Var2.f && qsa0Var2.d != null) {
                                i6f0Var2.b.put(c.a, qsa0Var2);
                            }
                        }
                    }
                    ksa0Var.l(messageId2);
                    break;
                }
                break;
            default:
                b00.a(b00Var).a(new dlz0(chatRequest, localMessageRef));
                break;
        }
    }
}
