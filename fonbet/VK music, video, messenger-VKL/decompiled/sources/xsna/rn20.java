package xsna;

import com.vk.core.view.components.user.stack.VkUserStackOld;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rn20 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzs e;

    public /* synthetic */ rn20(Object obj, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = xzsVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                List list = (List) this.d;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).intValue();
                un20.e(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, list, izsVar);
                break;
            default:
                ((Integer) obj2).intValue();
                ((VkUserStackOld.d) this.d).e((yzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
