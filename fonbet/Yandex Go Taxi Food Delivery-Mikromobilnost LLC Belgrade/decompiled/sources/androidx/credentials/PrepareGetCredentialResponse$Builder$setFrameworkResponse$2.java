package androidx.credentials;

import defpackage.qte0;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class PrepareGetCredentialResponse$Builder$setFrameworkResponse$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        boolean hasAuthenticationResults;
        hasAuthenticationResults = ((qte0) this.receiver).d.hasAuthenticationResults();
        return Boolean.valueOf(hasAuthenticationResults);
    }
}
