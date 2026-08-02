package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import java.util.List;
import java.util.Map;
import xsna.nt7;
import xsna.r7x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class y87 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ y87(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(a.b.C0430a.b);
                break;
            case 1:
                izsVar.invoke(nt7.c.b);
                break;
            case 2:
                List list = (List) obj;
                int i2 = FriendsSelectionFragment.w0;
                if (izsVar != null) {
                    izsVar.invoke(p4g.q(list));
                }
                break;
            case 3:
                r7x.a aVar = (r7x.a) obj;
                break;
            case 4:
                izsVar.invoke((Map) obj);
                break;
            default:
                izsVar.invoke((String) obj);
                break;
        }
        return s3q0.a;
    }
}
