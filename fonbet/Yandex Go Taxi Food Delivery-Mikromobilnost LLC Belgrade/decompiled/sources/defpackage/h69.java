package defpackage;

import com.ybsdk.feature.savings.internal.entities.c;
import com.ybsdk.feature.savings.internal.mapper.a;

/* loaded from: classes3.dex */
public final class h69 implements v7p {
    public final /* synthetic */ int a;
    public final g7g b;

    public /* synthetic */ h69(g7g g7gVar, int i) {
        this.a = i;
        this.b = g7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        g7g g7gVar = this.b;
        switch (i) {
            case 0:
                return new a((w530) g7gVar.get());
            case 1:
                return new c((w530) g7gVar.get());
            case 2:
                return new com.ybsdk.feature.savings.internal.network.dto.a((w530) g7gVar.get());
            default:
                return new ddm0((w530) g7gVar.get());
        }
    }
}
