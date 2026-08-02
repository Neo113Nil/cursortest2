package xsna;

import com.vk.dto.common.Good;
import com.vk.ecomm.products_selection.api.model.SelectionProductId;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class fqk implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((acy) ((pt50) obj)).a;
            default:
                Good good = (Good) obj;
                return new SelectionProductId(good.b, good.c);
        }
    }
}
