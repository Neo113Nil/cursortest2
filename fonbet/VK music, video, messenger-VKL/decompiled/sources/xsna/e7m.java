package xsna;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.di.scope.SingletonScope;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DiComponentProviderImpl.kt */
/* loaded from: classes.dex */
public final class e7m {
    public final fmg0 a;
    public a b = new a.C2783a(new ArrayList());

    /* compiled from: DiComponentProviderImpl.kt */
    public interface a {

        /* compiled from: DiComponentProviderImpl.kt */
        /* renamed from: xsna.e7m$a$a, reason: collision with other inner class name */
        public static final class C2783a implements a {
            public final ArrayList a;

            public C2783a(ArrayList arrayList) {
                this.a = arrayList;
            }
        }

        /* compiled from: DiComponentProviderImpl.kt */
        public static final class b implements a {
            public final ipy a;

            public b(ipy ipyVar) {
                this.a = ipyVar;
            }
        }
    }

    public e7m(fmg0 fmg0Var) {
        this.a = fmg0Var;
    }

    public final DiScopedComponent a(rfc rfcVar) {
        return this.a.f(SingletonScope.a).d.a(rfcVar);
    }

    public final DiUnscopedComponent b(rfc rfcVar) {
        a7m a7mVar;
        k9i k9iVar = new k9i(rfcVar, null);
        a aVar = this.b;
        boolean z = aVar instanceof a.C2783a;
        fmg0 fmg0Var = this.a;
        if (z) {
            f7m f7mVar = new f7m(((a.C2783a) aVar).a);
            j9i g = fmg0Var.g(k9iVar);
            f7mVar.invoke(g);
            a7mVar = g.d;
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ipy ipyVar = ((a.b) aVar).a;
            j9i g2 = fmg0Var.g(k9iVar);
            ipyVar.invoke(g2);
            a7mVar = g2.d;
        }
        return (DiUnscopedComponent) a7mVar;
    }
}
