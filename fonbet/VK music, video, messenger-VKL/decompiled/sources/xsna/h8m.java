package xsna;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.DiWithScopeComponent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DiScopedComponentProviderImpl.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class h8m extends FunctionReferenceImpl implements wzs<k9i<Object>, izs<? super j9i, ? extends s3q0>, Object> {
    @Override // xsna.wzs
    public final Object invoke(k9i<Object> k9iVar, izs<? super j9i, ? extends s3q0> izsVar) {
        j9i c = ((g8m) this.receiver).a.c(k9iVar);
        izsVar.invoke(c);
        return (DiScopedComponent) ((DiWithScopeComponent) c.d);
    }
}
