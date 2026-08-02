package xsna;

import com.vk.clips.design.view.hsl.HslRecyclerView;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ygv implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ ygv(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        xgv xgvVar = (xgv) this.b;
        switch (i) {
            case 0:
                int i2 = HslRecyclerView.e;
                break;
        }
        return ((Boolean) xgvVar.invoke(obj)).booleanValue();
    }
}
