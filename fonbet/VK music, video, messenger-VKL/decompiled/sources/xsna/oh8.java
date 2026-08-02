package xsna;

import com.vk.dto.common.Good;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh8 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ oh8(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((Good) obj).Ab();
            default:
                return new ConcurrentHashMap();
        }
    }
}
