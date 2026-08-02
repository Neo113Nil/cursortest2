package xsna;

import androidx.annotation.NonNull;
import com.vk.ml.MLFeatures;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.util.Supplier1;
import ru.ok.tensorflow.tflite.ModelDataProvider;

/* compiled from: TensorflowModelFromFileLoader.java */
/* loaded from: classes3.dex */
public final class iao0 implements Supplier1<ModelDataProvider, TensorflowModel> {
    public final boolean b;
    public final MLFeatures.MLFeature[] c;

    /* compiled from: TensorflowModelFromFileLoader.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TensorflowModel.values().length];
            a = iArr;
            try {
                iArr[TensorflowModel.HAND_DETECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TensorflowModel.HAND_CLASSIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TensorflowModel.FACE_DETECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[TensorflowModel.FACE_LANDMARK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[TensorflowModel.FACE_LANDMARK_WITH_ATTENTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[TensorflowModel.CAT_FACE_DETECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[TensorflowModel.CAT_FACE_LANDMARK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[TensorflowModel.HUMAN_SEGMENTATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[TensorflowModel.HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[TensorflowModel.HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[TensorflowModel.FACE_MORPH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[TensorflowModel.SKY_SEGMENTATION_RECURRENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[TensorflowModel.MORPHING_BABY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[TensorflowModel.MORPHING_BEAUTIFIER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[TensorflowModel.MORPHING_OLD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[TensorflowModel.MORPHING_YOUNG.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[TensorflowModel.MORPHING_RETOUCH.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[TensorflowModel.MORPHING_FAT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[TensorflowModel.MORPHING_CARTOON.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[TensorflowModel.MORPHING_CUSTOM_1.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[TensorflowModel.MORPHING_CUSTOM_2.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[TensorflowModel.MORPHING_CUSTOM_3.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[TensorflowModel.MORPHING_CUSTOM_4.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[TensorflowModel.MORPHING_CUSTOM_5.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public iao0(boolean z, TensorflowModel[] tensorflowModelArr) {
        this.b = z;
        MLFeatures.MLFeature[] mLFeatureArr = new MLFeatures.MLFeature[tensorflowModelArr.length];
        for (int i = 0; i < tensorflowModelArr.length; i++) {
            mLFeatureArr[i] = b(tensorflowModelArr[i]);
        }
        this.c = mLFeatureArr;
    }

    @NonNull
    public final MLFeatures.MLFeature b(TensorflowModel tensorflowModel) {
        int i = a.a[tensorflowModel.ordinal()];
        boolean z = this.b;
        switch (i) {
            case 1:
                return z ? MLFeatures.MLFeature.PALMDETECT : MLFeatures.MLFeature.PALMDETECT_U;
            case 2:
                return z ? MLFeatures.MLFeature.MULTITASK : MLFeatures.MLFeature.MULTITASK_U;
            case 3:
                return z ? MLFeatures.MLFeature.FACEDETECT : MLFeatures.MLFeature.FACEDETECT_U;
            case 4:
                return z ? MLFeatures.MLFeature.FACELANDMARK : MLFeatures.MLFeature.FACELANDMARK_U;
            case 5:
                return MLFeatures.MLFeature.FACE_LANDMARK_WITH_ATTENTION;
            case 6:
                return MLFeatures.MLFeature.CATDETECT;
            case 7:
                return MLFeatures.MLFeature.CATLANDMARK_RECURRENT;
            case 8:
                return z ? MLFeatures.MLFeature.FULL_SEGMENTATION : MLFeatures.MLFeature.FULL_SEGMENTATION_U;
            case 9:
                return z ? MLFeatures.MLFeature.HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH : MLFeatures.MLFeature.HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH_U;
            case 10:
                return z ? MLFeatures.MLFeature.HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH : MLFeatures.MLFeature.HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH_U;
            case 11:
                return MLFeatures.MLFeature.FACE_MORPH;
            case 12:
                return MLFeatures.MLFeature.SKY_SEGMENTATION_HMS_256_V7;
            case 13:
                return MLFeatures.MLFeature.MORPHING_BABY;
            case 14:
                return MLFeatures.MLFeature.MORPHING_BEAUTIFIER;
            case 15:
                return MLFeatures.MLFeature.MORPHING_OLD;
            case 16:
                return MLFeatures.MLFeature.MORPHING_YOUNG;
            case 17:
                return MLFeatures.MLFeature.MORPHING_RETOUCH;
            case 18:
                return MLFeatures.MLFeature.MORPHING_FAT;
            case 19:
                return MLFeatures.MLFeature.MORPHING_CARTOON;
            case 20:
                return MLFeatures.MLFeature.MORPHING_CUSTOM_1;
            case 21:
                return MLFeatures.MLFeature.MORPHING_CUSTOM_2;
            case 22:
                return MLFeatures.MLFeature.MORPHING_CUSTOM_3;
            case 23:
                return MLFeatures.MLFeature.MORPHING_CUSTOM_4;
            case 24:
                return MLFeatures.MLFeature.MORPHING_CUSTOM_5;
            default:
                throw new IllegalArgumentException("Unknown tensorflow model");
        }
    }

    @Override // ru.ok.gl.util.Supplier1
    public final ModelDataProvider get(@NonNull TensorflowModel tensorflowModel) {
        return new hao0(this, tensorflowModel);
    }

    public final boolean isReady() {
        for (MLFeatures.MLFeature mLFeature : this.c) {
            com.vk.ml.b bVar = MLFeatures.a;
            if (!bVar.f() || !com.vk.ml.b.g(bVar.d(mLFeature)) || !bVar.h(mLFeature)) {
                return false;
            }
        }
        return true;
    }
}
