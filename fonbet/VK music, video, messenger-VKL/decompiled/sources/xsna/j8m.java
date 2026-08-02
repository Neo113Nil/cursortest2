package xsna;

import com.vk.di.component.DiNoScopeComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DiScopedComponentProviderImpl.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class j8m extends FunctionReferenceImpl implements wzs<k9i<Object>, izs<? super j9i, ? extends s3q0>, Object> {
    public j8m(g8m g8mVar) {
        super(2, g8mVar, g8m.class, "externalObtain", "externalObtain(Lcom/vk/di/internal/ComponentNodeKey;Lkotlin/jvm/functions/Function1;)Lcom/vk/di/component/DiNoScopeComponent;", 0);
    }

    @Override // xsna.wzs
    public final Object invoke(k9i<Object> k9iVar, izs<? super j9i, ? extends s3q0> izsVar) {
        m8m m8mVar = ((g8m) this.receiver).a;
        j9i g = m8mVar.a.g(k9iVar);
        a8m a8mVar = m8mVar.e;
        g.b.add(a8mVar);
        a8mVar.a.add(g);
        m8mVar.g.add(g.c);
        izsVar.invoke(g);
        return (DiUnscopedComponent) ((DiNoScopeComponent) g.d);
    }
}
