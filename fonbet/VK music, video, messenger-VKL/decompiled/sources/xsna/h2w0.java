package xsna;

import com.vk.superapp.api.dto.vkworkout.WorkoutData;

/* compiled from: VkWorkoutMapper.kt */
/* loaded from: classes6.dex */
public final class h2w0 {

    /* compiled from: VkWorkoutMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkoutData.WorkoutType.values().length];
            try {
                iArr[WorkoutData.WorkoutType.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkoutData.WorkoutType.SWIMMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkoutData.WorkoutType.BIKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkoutData.WorkoutType.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
