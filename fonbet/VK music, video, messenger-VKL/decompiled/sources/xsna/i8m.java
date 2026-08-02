package xsna;

import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.di.component.DiWithScopeComponent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DiScopedComponentProviderImpl.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class i8m extends FunctionReferenceImpl implements wzs<k9i<Object>, izs<? super j9i, ? extends s3q0>, Object> {
    public i8m(g8m g8mVar) {
        super(2, g8mVar, g8m.class, "scopedObtain", "scopedObtain(Lcom/vk/di/internal/ComponentNodeKey;Lkotlin/jvm/functions/Function1;)Lcom/vk/di/component/DiWithScopeComponent;", 0);
    }

    @Override // xsna.wzs
    public final Object invoke(k9i<Object> k9iVar, izs<? super j9i, ? extends s3q0> izsVar) {
        j9i c = ((g8m) this.receiver).a.c(k9iVar);
        izsVar.invoke(c);
        return (DiScopedWithParamsComponent) ((DiWithScopeComponent) c.d);
    }
}
