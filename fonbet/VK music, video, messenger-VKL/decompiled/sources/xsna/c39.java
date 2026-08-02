package xsna;

import com.vk.ml.api.tf.TensorflowFacade;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.TensorflowSegmentationType;

/* compiled from: CallEffectsTensorflowModelFromFileLoader.kt */
/* loaded from: classes7.dex */
public final class c39 {
    public static final a f;
    public static final /* synthetic */ qcy<Object>[] g;
    public final jx40 a;
    public final TensorflowFacade b;
    public final jms c;
    public final TensorflowModel[] d = {TensorflowModel.HAND_DETECTION, TensorflowModel.HAND_CLASSIFICATION};
    public final kta e = new kta(new q(this, 9), new zy(this, 13));

    /* compiled from: CallEffectsTensorflowModelFromFileLoader.kt */
    public static final class a {

        /* compiled from: CallEffectsTensorflowModelFromFileLoader.kt */
        /* renamed from: xsna.c39$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2638a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TensorflowSegmentationType.values().length];
                try {
                    iArr[TensorflowSegmentationType.NEW_SEGMENTATION_BIG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TensorflowSegmentationType.NEW_SEGMENTATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(c39.class, "loaderDelegate", "getLoaderDelegate()Lcom/vk/ml/loader/TensorflowModelFromFileLoader;", 0);
        fpf0.a.getClass();
        g = new qcy[]{propertyReference1Impl};
        f = new a();
    }

    public c39(jx40 jx40Var, TensorflowFacade tensorflowFacade, jms jmsVar) {
        this.a = jx40Var;
        this.b = tensorflowFacade;
        this.c = jmsVar;
    }
}
