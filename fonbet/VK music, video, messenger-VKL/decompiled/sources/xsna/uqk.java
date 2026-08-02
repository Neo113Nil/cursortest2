package xsna;

import com.vk.dto.common.VideoUrl;
import java.time.Instant;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class uqk implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ uqk(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Instant instant;
        switch (this.a) {
            case 0:
                return ((pt50) obj).getClass();
            case 1:
                return ((VideoUrl) obj).name();
            case 2:
                return ((ihy0) obj).toString();
            default:
                gjy0 gjy0Var = (gjy0) obj;
                synchronized (gjy0Var.e) {
                    instant = gjy0Var.f;
                }
                return instant;
        }
    }
}
