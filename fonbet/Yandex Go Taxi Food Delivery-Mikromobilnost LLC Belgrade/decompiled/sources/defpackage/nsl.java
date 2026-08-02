package defpackage;

import com.ybsdk.feature.status.screen.internal.ui.a;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class nsl implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ nsl(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.Z(new osl((List) obj));
                return zy11.a;
            default:
                return msl.a((msl) aVar.X(), null, false, 31);
        }
    }
}
