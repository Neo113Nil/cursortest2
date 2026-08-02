package xsna;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import org.opencv.core.Mat;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.pattern.pipeline.PatternMatchesAsync;
import ru.ok.tensorflow.util.Producer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class qj7 implements Producer, pcs {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qj7(Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // ru.ok.tensorflow.util.Producer
    public Object apply() {
        PatternMatchesAsync lambda$process$0;
        lambda$process$0 = ((BodyPatternMatchingPipeline) this.b).lambda$process$0((Bitmap) this.c, (Bitmap) this.d, (Mat) this.e);
        return lambda$process$0;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        ubr0 ubr0Var = (ubr0) this.b;
        FragmentManager fragmentManager = (FragmentManager) this.c;
        rrn0 rrn0Var = (rrn0) this.d;
        ubr0Var.a(bundle, fragmentManager, rrn0Var, (ni0) this.e);
        ubr0Var.b(bundle, rrn0Var);
        if (bundle.getBoolean("DIALOG_IS_BANNER_AD_EVENT")) {
            ubr0Var.h.a(bundle);
        }
    }
}
