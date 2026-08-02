package defpackage;

import android.view.View;
import com.yandex.messaging.internal.authorized.sync.g;
import java.util.Map;
import java.util.Set;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.notification.b;

/* loaded from: classes5.dex */
public final class eu0 implements v7p {
    public final /* synthetic */ int a;
    public final eqh b;

    public eu0(vu4 vu4Var, eqh eqhVar) {
        this.a = 1;
        this.b = eqhVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        final eqh eqhVar = this.b;
        switch (i) {
            case 0:
                return new du0((Set) eqhVar.get());
            case 1:
                return (tu4) eqhVar.get();
            case 2:
                return new do6((a) eqhVar.get());
            case 3:
                return new yjh((gtt0) eqhVar.get());
            case 4:
                return new iqj0() { // from class: wxm
                    @Override // defpackage.iqj0
                    public final void a(View view) {
                        ((uxm) eqh.this.get()).i();
                    }
                };
            case 5:
                return new u0z((a) eqhVar.get());
            case 6:
                n420 n420Var = ((g) eqhVar.get()).a0;
                q5z.i(n420Var);
                return n420Var;
            case 7:
                return new b((a) eqhVar.get());
            case 8:
                return new aov0(i5m.a(eqhVar));
            case 9:
                return new bwt0((Map) eqhVar.get());
            case 10:
                return new ctw0(eqhVar);
            case 11:
                return new do6((a) eqhVar.get());
            default:
                return new u0z((a) eqhVar.get());
        }
    }

    public /* synthetic */ eu0(eqh eqhVar, int i) {
        this.a = i;
        this.b = eqhVar;
    }
}
