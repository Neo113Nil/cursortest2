package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;

/* compiled from: VkWorkoutCommandsFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class a2w0 implements z1w0 {
    public final ayu0 a;
    public final f2w0 b;

    /* compiled from: VkWorkoutCommandsFactoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkUiCommand.values().length];
            try {
                iArr[VkUiCommand.ASK_GOOGLE_FIT_WORKOUT_PERMISSIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkUiCommand.ASK_HEALTH_CONNECT_WORKOUT_PERMISSIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkUiCommand.GET_GOOGLE_FIT_WORKOUT_PERMISSIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkUiCommand.GET_HEALTH_CONNECT_WORKOUT_PERMISSIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkUiCommand.GET_GOOGLE_FIT_WORKOUTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkUiCommand.GET_HEALTH_CONNECT_WORKOUTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a2w0(ayu0 ayu0Var, f2w0 f2w0Var) {
        this.a = ayu0Var;
        this.b = f2w0Var;
    }

    @Override // xsna.z1w0
    public final dvv0 a(FragmentImpl fragmentImpl, VkUiCommand vkUiCommand) {
        int i = a.$EnumSwitchMapping$0[vkUiCommand.ordinal()];
        f2w0 f2w0Var = this.b;
        ayu0 ayu0Var = this.a;
        switch (i) {
            case 1:
                return new st3(fragmentImpl, ayu0Var);
            case 2:
                return new yt3(fragmentImpl, ayu0Var);
            case 3:
                return new urt(fragmentImpl, ayu0Var);
            case 4:
                return new yrt(fragmentImpl, ayu0Var);
            case 5:
                return new vrt(fragmentImpl, ayu0Var, f2w0Var);
            case 6:
                return new bst(fragmentImpl, ayu0Var, f2w0Var);
            default:
                throw new IllegalArgumentException("VkWorkoutCommandsFactory can create vkWorkout commands only.");
        }
    }
}
