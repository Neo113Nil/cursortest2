package ru.ok.gl.tf;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public enum TensorflowModel {
    HAND_DETECTION("palm_detection_160x96.tflite"),
    HAND_CLASSIFICATION("classification+point_mn1_data=16_mod_0.tflite"),
    FACE_DETECTION("face_detection_front_160x96.tflite"),
    FACE_LANDMARK("face_landmark.tflite"),
    MORPHING_BABY("baby_280723_large.tflite"),
    MORPHING_BEAUTIFIER("beautifier_heavy_256.tflite"),
    MORPHING_OLD("old_280723_large.tflite"),
    MORPHING_YOUNG("young_face.tflite"),
    MORPHING_RETOUCH("retouch_face.tflite"),
    MORPHING_FAT("chubby_1708_large_bigcrop.tflite"),
    MORPHING_CARTOON("cartoon3d_110823_large.tflite"),
    MORPHING_CUSTOM_1("custom_model_1.tflite"),
    MORPHING_CUSTOM_2("custom_model_2.tflite"),
    MORPHING_CUSTOM_3("custom_model_3.tflite"),
    MORPHING_CUSTOM_4("custom_model_4.tflite"),
    MORPHING_CUSTOM_5("custom_model_5.tflite"),
    FACE_LANDMARK_WITH_ATTENTION("face_landmark_with_attention.tflite"),
    CAT_FACE_DETECTION("blazecatdogmix_classic_mod=2.tflite"),
    CAT_FACE_LANDMARK("test_class_rnn_mod=3.tflite"),
    HUMAN_SEGMENTATION("unet_mobilenet_v2_mod_2.tflite"),
    HUMAN_SEGMENTATION_RECURRENT("mobilenet_v3_sinet_seq4_160x96_no_smoothing.tflite"),
    HUMAN_SEGMENTATION_RECURRENT_BIG("mobilenet_v3_sinet_seq4_224x128_no_smoothing.tflite"),
    HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH("mobilenet_v3_sinet_seq4_160x96_no_smoothing.tflite"),
    HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH("mobilenet_v3_sinet_seq4_224x128_no_smoothing.tflite"),
    SKY_SEGMENTATION_RECURRENT("mediapipe_net2_rec2_hms_256-affine-cons-v7.tflite"),
    FACE_MORPH("face_morph.zip");

    public final String value;

    TensorflowModel(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.value;
    }
}
