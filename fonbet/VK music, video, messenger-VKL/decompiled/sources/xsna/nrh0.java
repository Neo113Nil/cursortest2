package xsna;

import com.vk.search.params.api.SearchParams;

/* compiled from: SearchFeatureParametersConfigDelegateBinding.kt */
/* loaded from: classes5.dex */
public final class nrh0<P extends SearchParams> implements gm50 {
    public final krh0<P> b;
    public final f5z c;

    public nrh0(krh0 krh0Var, f5z f5zVar) {
        this.b = krh0Var;
        this.c = f5zVar;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
