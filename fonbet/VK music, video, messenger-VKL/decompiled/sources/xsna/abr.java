package xsna;

import java.util.function.Function;
import org.chromium.base.FileUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class abr implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ abr(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Boolean lambda$static$0;
        switch (this.a) {
            case 0:
                lambda$static$0 = FileUtils.lambda$static$0((String) obj);
                return lambda$static$0;
            default:
                return ((gey0) obj).b;
        }
    }
}
