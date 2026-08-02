package androidx.credentials;

import defpackage.qte0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class PrepareGetCredentialResponse$Builder$setFrameworkResponse$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean hasCredentialResults;
        hasCredentialResults = ((qte0) this.receiver).d.hasCredentialResults((String) obj);
        return Boolean.valueOf(hasCredentialResults);
    }
}
