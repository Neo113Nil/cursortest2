package xsna;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.di.component.DiUnscopedComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.pwj0;

/* compiled from: DiScopedComponentProviderImpl.kt */
/* loaded from: classes.dex */
public final class g8m<SK extends pwj0> implements f8m<SK> {
    public final m8m a;
    public a b = new a.C2926a(new ArrayList());

    /* compiled from: DiScopedComponentProviderImpl.kt */
    public interface a {

        /* compiled from: DiScopedComponentProviderImpl.kt */
        /* renamed from: xsna.g8m$a$a, reason: collision with other inner class name */
        public static final class C2926a implements a {
            public final ArrayList a;

            public C2926a(ArrayList arrayList) {
                this.a = arrayList;
            }
        }

        /* compiled from: DiScopedComponentProviderImpl.kt */
        public static final class b implements a {
            public final l8m a;

            public b(l8m l8mVar) {
                this.a = l8mVar;
            }
        }
    }

    /* compiled from: DiScopedComponentProviderImpl.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<j9i, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(j9i j9iVar) {
            ((List) this.receiver).add(j9iVar);
            return s3q0.a;
        }
    }

    public g8m(m8m m8mVar) {
        this.a = m8mVar;
    }

    @Override // xsna.f8m
    public final DiScopedComponent a(rfc rfcVar) {
        return (DiScopedComponent) d(new k9i<>(rfcVar, null), new h8m(2, this, g8m.class, "scopedObtain", "scopedObtain(Lcom/vk/di/internal/ComponentNodeKey;Lkotlin/jvm/functions/Function1;)Lcom/vk/di/component/DiWithScopeComponent;", 0));
    }

    @Override // xsna.f8m
    public final DiScopedWithParamsComponent b(rfc rfcVar, l9i l9iVar) {
        return (DiScopedWithParamsComponent) d(new k9i<>(rfcVar, l9iVar), new i8m(this));
    }

    @Override // xsna.f8m
    public final DiUnscopedComponent c(rfc rfcVar) {
        return (DiUnscopedComponent) d(new k9i<>(rfcVar, null), new j8m(this));
    }

    public final <C extends a7m> C d(k9i<C> k9iVar, wzs<? super k9i<C>, ? super izs<? super j9i, s3q0>, ? extends C> wzsVar) {
        a aVar = this.b;
        if (aVar instanceof a.C2926a) {
            return wzsVar.invoke(k9iVar, new b(1, ((a.C2926a) aVar).a, List.class, "add", "add(Ljava/lang/Object;)Z", 8));
        }
        if (aVar instanceof a.b) {
            return wzsVar.invoke(k9iVar, ((a.b) aVar).a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
