package defpackage;

import com.ybsdk.feature.pinstorage.internal.data.PinTokenAmModel;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class h0c0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinTokenAmModel b;

    public /* synthetic */ h0c0(PinTokenAmModel pinTokenAmModel, int i) {
        this.a = i;
        this.b = pinTokenAmModel;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        PinTokenAmModel pinTokenAmModel = this.b;
        List list = (List) obj;
        switch (i) {
            case 0:
                list.add(pinTokenAmModel);
                break;
            default:
                list.add(pinTokenAmModel);
                break;
        }
        return zy11Var;
    }
}
