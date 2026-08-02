package defpackage;

import android.view.ContextThemeWrapper;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.masstransit.detailedroute.router.c;

/* loaded from: classes6.dex */
public final /* synthetic */ class pg30 implements bx20, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ pg30(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof bx20) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof bx20) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(1, (c) h55Var, c.class, "updateMapFocusRect", "updateMapFocusRect(I)V", 0);
            default:
                return new FunctionReferenceImpl(1, (m640) h55Var, m640.class, "updateMapFocusRect", "updateMapFocusRect(I)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // defpackage.bx20
    public final void update(int i) {
        int i2 = this.a;
        h55 h55Var = this.b;
        switch (i2) {
            case 0:
                ((c) h55Var).Q(i);
                break;
            default:
                m640 m640Var = (m640) h55Var;
                avj0 avj0Var = (avj0) ((zuj0) m640Var.G);
                int u = tje.u(24, avj0Var.a) + i;
                ContextThemeWrapper contextThemeWrapper = avj0Var.a;
                int u2 = tje.u(24, contextThemeWrapper);
                ((a3v) m640Var.H).q3(m640Var, u2, tje.u(80, contextThemeWrapper), u2, u);
                break;
        }
    }
}
