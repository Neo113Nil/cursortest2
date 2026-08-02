package xsna;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.libvideo.author.VideoPinType;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoPinResultHandler.kt */
/* loaded from: classes2.dex */
public final class j3t0 {

    /* compiled from: VideoPinResultHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPinType.values().length];
            try {
                iArr[VideoPinType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPinType.SUBSCRIBERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPinType.NON_SUBSCRIBERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoPinType.CLIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(Activity activity, String str) {
        VkScreenSpinner vkScreenSpinner = new VkScreenSpinner(activity, null, 6);
        f4m.m(17, vkScreenSpinner);
        vkScreenSpinner.setSpinnerState(VkSpinnerContent.SpinnerState.Done);
        vkScreenSpinner.setSpinnerMode(VkScreenSpinner.SpinnerMode.Shadow);
        vkScreenSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size56);
        vkScreenSpinner.b(str, false);
        b33 b33Var = new b33(activity, 0);
        b33Var.setContentView(vkScreenSpinner);
        b33Var.setCancelable(false);
        b33Var.setCanceledOnTouchOutside(false);
        b33Var.show();
        Window window = b33Var.getWindow();
        if (window != null) {
            window.clearFlags(2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.getDecorView().setBackgroundColor(0);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new bi5(b33Var, 12), TimeUnit.SECONDS.toMillis(2L));
    }
}
