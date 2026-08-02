package xsna;

import com.vk.voip.OKVoipEngine;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qo70 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                dfs dfsVar = OKVoipEngine.i;
                if (dfsVar != null) {
                    dfsVar.f(booleanValue);
                }
                return s3q0.a;
            default:
                it80.b.getClass();
                return it80.a.a();
        }
    }
}
