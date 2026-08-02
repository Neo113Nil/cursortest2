package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jog implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ jog(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean contains;
        switch (this.b) {
            case 0:
                contains = this.c.contains(((UIBlock) obj).w());
                break;
            default:
                contains = this.c.contains(((gza0) obj).b);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
