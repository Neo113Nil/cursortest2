package defpackage;

import com.ybsdk.core.compose.ComposeFragment;

/* loaded from: classes15.dex */
public final class dgd implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComposeFragment b;

    public /* synthetic */ dgd(ComposeFragment composeFragment, int i) {
        this.a = i;
        this.b = composeFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        ComposeFragment composeFragment = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                composeFragment.Content(fidVar, 0);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                f1a1.e(wwg.S(1982760728, true, new dgd(composeFragment, i2), fidVar2), fidVar2, 6);
                break;
        }
        return zy11Var;
    }
}
