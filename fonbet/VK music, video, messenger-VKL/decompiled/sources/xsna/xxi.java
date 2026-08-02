package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class xxi implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xxi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((String) this.b).equals(((String) ((Map.Entry) obj).getKey()).toLowerCase(Locale.ROOT).replace(BundleUtil.UNDERLINE_TAG, "."));
            default:
                return ((Boolean) ((kl60) this.b).invoke(obj)).booleanValue();
        }
    }
}
