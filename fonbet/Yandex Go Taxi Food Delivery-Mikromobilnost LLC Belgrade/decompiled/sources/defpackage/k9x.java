package defpackage;

import com.yandex.messaging.ExistingChatRequest;

/* loaded from: classes11.dex */
public final class k9x extends s120 {
    public final /* synthetic */ int a;
    public final g720 b;
    public final Object c;

    public k9x(g720 g720Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = g720Var;
                this.c = "Messaging.Arguments.Key.TelemessengerCreation";
                break;
            default:
                this.b = g720Var;
                this.c = "Messaging.Arguments.Key.JoinLink";
                break;
        }
    }

    @Override // defpackage.s120
    public final String a() {
        switch (this.a) {
        }
        return (String) this.c;
    }

    @Override // defpackage.s120
    public final g720 b() {
        switch (this.a) {
        }
        return this.b;
    }

    public k9x(g720 g720Var, ExistingChatRequest existingChatRequest) {
        this.a = 2;
        this.b = g720Var;
        this.c = existingChatRequest;
    }
}
