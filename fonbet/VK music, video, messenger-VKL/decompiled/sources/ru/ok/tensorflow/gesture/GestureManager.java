package ru.ok.tensorflow.gesture;

import com.unity3d.services.UnityAdsConstants;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.entity.PalmClass;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.util.Trigonometry;

/* loaded from: classes9.dex */
public class GestureManager {
    public static float THUMB_ANGLE_MARGINS = 40.0f;

    /* renamed from: ru.ok.tensorflow.gesture.GestureManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$tensorflow$entity$PalmClass;

        static {
            int[] iArr = new int[PalmClass.values().length];
            $SwitchMap$ru$ok$tensorflow$entity$PalmClass = iArr;
            try {
                iArr[PalmClass.PALM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.PALM_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.POINTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.KHABIB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.FIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.VICTORY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.THUMB_LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.THUMB_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.ONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.ROCK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.CROSS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.HOMMIE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.HEART_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.HEART_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.NOT_GESTURE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$ru$ok$tensorflow$entity$PalmClass[PalmClass.NOT_HAND.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private static float getGestureRotationDegrees(Recognition recognition) {
        float rotationDegrees = recognition.detection.getRotationDegrees(7, false);
        int i = AnonymousClass1.$SwitchMap$ru$ok$tensorflow$entity$PalmClass[recognition.palmClass.ordinal()];
        return Trigonometry.make0to360(rotationDegrees + (i != 8 ? i != 9 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : -90.0f : 90.0f));
    }

    public static Gesture recognitionToGesture(Recognition recognition) {
        switch (AnonymousClass1.$SwitchMap$ru$ok$tensorflow$entity$PalmClass[recognition.palmClass.ordinal()]) {
            case 1:
                return Gesture.PALM;
            case 2:
                return Gesture.PALM;
            case 3:
                return Gesture.OK;
            case 4:
                return Gesture.POINTER;
            case 5:
                return Gesture.KHABIB;
            case 6:
                return Gesture.FIST;
            case 7:
                return Gesture.VICTORY;
            case 8:
                return toOrientedThumb(recognition, THUMB_ANGLE_MARGINS);
            case 9:
                return toOrientedThumb(recognition, THUMB_ANGLE_MARGINS);
            case 10:
                return Gesture.ONE;
            case 11:
                return Gesture.ROCK;
            case 12:
                return Gesture.CROSS;
            case 13:
                return Gesture.HOMMIE;
            case 14:
                return Gesture.HEART_LEFT;
            case 15:
                return Gesture.HEART_RIGHT;
            case 16:
                return Gesture.NOT_GESTURE;
            case 17:
                return Gesture.NOT_HAND;
            default:
                return Gesture.OTHER;
        }
    }

    private static Gesture toOrientedThumb(Recognition recognition, float f) {
        PalmClass palmClass = recognition.palmClass;
        if (palmClass != PalmClass.THUMB_LEFT && palmClass != PalmClass.THUMB_RIGHT) {
            throw new AssertionError();
        }
        float gestureRotationDegrees = getGestureRotationDegrees(recognition);
        return (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + f >= gestureRotationDegrees || gestureRotationDegrees > 180.0f - f) ? (180.0f + f >= gestureRotationDegrees || gestureRotationDegrees > 360.0f - f) ? Gesture.THUMB : Gesture.THUMB_DOWN : Gesture.THUMB_UP;
    }
}
