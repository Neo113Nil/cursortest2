package defpackage;

import com.yandex.messaging.input.InputState;
import com.yandex.messaging.input.bricks.writing.e;
import com.yandex.messaging.input.c;
import com.yandex.messaging.input.quote.QuotePresenter$QuoteType;
import com.yandex.messaging.input.quote.a;
import com.yandex.messaging.internal.ServerMessageRef;
import java.util.Collections;

/* loaded from: classes15.dex */
public final class m0w {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;

    public m0w(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
    }

    public final void a(String str, ServerMessageRef serverMessageRef, g720 g720Var) {
        xv10 xv10Var = new xv10(str, Collections.singletonList(serverMessageRef), QuotePresenter$QuoteType.REPLY, null, g720Var, 8);
        if (b()) {
            ((a) this.a.get()).f(xv10Var);
        }
    }

    public final boolean b() {
        ((ycz0) this.c.get()).a();
        ryv ryvVar = (ryv) this.d.get();
        ryvVar.e = false;
        h3y h3yVar = ryvVar.b;
        ((c) h3yVar.get()).c();
        InputState inputState = (InputState) ((c) h3yVar.get()).f.getValue();
        if (inputState != InputState.WRITING_WITHOUT_AUTH && inputState != InputState.WRITING_WITH_AUTH) {
            return false;
        }
        e eVar = (e) this.b.get();
        eVar.b(true);
        eVar.d();
        return true;
    }
}
