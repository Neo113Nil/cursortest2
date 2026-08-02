package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;

/* compiled from: VkStepsCommandsFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class dmv0 implements cmv0 {
    public final ayu0 a;
    public final hmv0 b;

    /* compiled from: VkStepsCommandsFactoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkUiCommand.values().length];
            try {
                iArr[VkUiCommand.GET_HEALTH_CONNECT_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkUiCommand.GET_STEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkUiCommand.GET_HEALTH_CONNECT_STEPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkUiCommand.GET_GOOGLE_FIT_STEPS_PERMISSIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkUiCommand.GET_HEALTH_CONNECT_STEPS_PERMISSIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dmv0(ayu0 ayu0Var, hmv0 hmv0Var) {
        this.a = ayu0Var;
        this.b = hmv0Var;
    }

    @Override // xsna.cmv0
    public final dvv0 a(FragmentImpl fragmentImpl, VkUiCommand vkUiCommand) {
        int i = a.$EnumSwitchMapping$0[vkUiCommand.ordinal()];
        ayu0 ayu0Var = this.a;
        if (i == 1) {
            return new gst(fragmentImpl, ayu0Var);
        }
        hmv0 hmv0Var = this.b;
        if (i == 2) {
            return new kut(fragmentImpl, ayu0Var, hmv0Var);
        }
        if (i == 3) {
            return new dvt(fragmentImpl, ayu0Var, hmv0Var);
        }
        if (i == 4) {
            return new rvt(fragmentImpl, ayu0Var);
        }
        if (i == 5) {
            return new qvt(fragmentImpl, ayu0Var);
        }
        throw new IllegalArgumentException("VkStepsCommandsFactory can create vkSteps commands only.");
    }
}
