package defpackage;

import com.ybsdk.network.Api;
import com.ybsdk.screens.registration.data.a;
import com.ybsdk.utils.poller.b;

/* loaded from: classes2.dex */
public final class ie9 implements v7p {
    public final /* synthetic */ int a;
    public final c6g b;
    public final k6g c;

    public /* synthetic */ ie9(c6g c6gVar, k6g k6gVar, int i) {
        this.a = i;
        this.b = c6gVar;
        this.c = k6gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        k6g k6gVar = this.c;
        c6g c6gVar = this.b;
        switch (i) {
            case 0:
                return new a((Api) c6gVar.get(), (b) k6gVar.get());
            default:
                return new com.ybsdk.screens.registration.data.b((Api) c6gVar.get(), (b) k6gVar.get());
        }
    }
}
