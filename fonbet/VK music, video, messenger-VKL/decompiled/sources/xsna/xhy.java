package xsna;

import org.opencv.core.Mat;
import ru.ok.pattern.keypoints.KeypointPatternMatcher;
import ru.ok.tensorflow.util.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class xhy implements Function {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xhy(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.ok.tensorflow.util.Function
    public Object apply(Object obj) {
        hlb0 lambda$findHomography$2;
        lambda$findHomography$2 = ((KeypointPatternMatcher) this.b).lambda$findHomography$2((Mat) this.c, (hlb0) obj);
        return lambda$findHomography$2;
    }
}
