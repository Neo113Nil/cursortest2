package xsna;

import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zmh0 implements izs {
    public final /* synthetic */ cnh0 b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ CatalogProfileLocalState.FollowSource d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ zmh0(cnh0 cnh0Var, UserId userId, CatalogProfileLocalState.FollowSource followSource, boolean z) {
        this.b = cnh0Var;
        this.c = userId;
        this.d = followSource;
        this.e = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        this.b.g(this.c, this.d, this.e);
        return s3q0.a;
    }
}
