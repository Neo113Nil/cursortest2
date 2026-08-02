package xsna;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import one.video.calls.sdk_private.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class r9i implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new ConcurrentHashMap();
            default:
                return (b.C2172b) ((one.video.calls.sdk_private.b) ((pt50) obj)).b.get(0);
        }
    }
}
