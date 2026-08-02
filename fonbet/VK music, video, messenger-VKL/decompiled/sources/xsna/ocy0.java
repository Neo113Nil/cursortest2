package xsna;

import java.util.function.Function;
import one.video.calls.sdk_private.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class ocy0 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ ocy0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((f.b) obj).toString();
            default:
                return ((uny0) obj).a;
        }
    }
}
