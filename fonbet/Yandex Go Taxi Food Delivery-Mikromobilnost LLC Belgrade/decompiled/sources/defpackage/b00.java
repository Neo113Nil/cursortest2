package defpackage;

import android.os.Handler;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.data.e;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import java.util.LinkedHashMap;
import kotlin.a;

/* loaded from: classes15.dex */
public final class b00 {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final k020 d;
    public final e e;
    public final at2 f;
    public final x22 g;
    public final ai80 h;
    public final apq0 i;
    public final i3y j;
    public final i3y k;

    public b00(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, k020 k020Var, e eVar, at2 at2Var, x22 x22Var, o150 o150Var, wff0 wff0Var, ai80 ai80Var, apq0 apq0Var) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = k020Var;
        this.e = eVar;
        this.f = at2Var;
        this.g = x22Var;
        this.h = ai80Var;
        this.i = apq0Var;
        final int i = 0;
        this.j = a.a(new sls(this) { // from class: iz
            public final /* synthetic */ b00 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                b00 b00Var = this.b;
                switch (i2) {
                    case 0:
                        return (i00) b00Var.b.get();
                    default:
                        return (rsa0) b00Var.c.get();
                }
            }
        });
        final int i2 = 1;
        this.k = a.a(new sls(this) { // from class: iz
            public final /* synthetic */ b00 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                b00 b00Var = this.b;
                switch (i22) {
                    case 0:
                        return (i00) b00Var.b.get();
                    default:
                        return (rsa0) b00Var.c.get();
                }
            }
        });
    }

    public static final i00 a(b00 b00Var) {
        return (i00) b00Var.j.getValue();
    }

    public final void b(ChatRequest chatRequest, LocalMessageRef localMessageRef) {
        ((Handler) this.a.get()).post(new mz(this, chatRequest, localMessageRef, 0));
    }

    public final void c(ChatRequest chatRequest, yw80 yw80Var) {
        apq0 apq0Var = this.i;
        int i = apq0Var.a.a().a;
        cjw0 cjw0Var = apq0Var.c;
        String str = yw80Var.a;
        MessageData messageData = yw80Var.b;
        ((LinkedHashMap) cjw0Var.b).put(str, new zoq0((w3c) cjw0Var.a, messageData.type, i));
        cjw0 cjw0Var2 = apq0Var.b;
        ((LinkedHashMap) cjw0Var2.b).put(str, new zoq0((w3c) cjw0Var2.a, messageData.type, i));
        ((Handler) this.a.get()).post(new lz(5, this, chatRequest, yw80Var));
    }
}
