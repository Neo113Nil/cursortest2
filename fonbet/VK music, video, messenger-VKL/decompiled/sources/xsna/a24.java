package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.writebar.attach.AttachmentsEditorView;

/* compiled from: AttachEditorOnboardingController.kt */
/* loaded from: classes7.dex */
public final class a24 {
    public boolean a;
    public final VkOnboardingComponent b;
    public final q7v0 c;
    public final Handler d;

    public a24(AttachmentsEditorView attachmentsEditorView) {
        VkOnboardingComponent vkOnboardingComponent = (VkOnboardingComponent) ((k7m) m7m.c(attachmentsEditorView)).a(fpf0.a(VkOnboardingComponent.class));
        this.b = vkOnboardingComponent;
        q7v0 p3 = vkOnboardingComponent.p3();
        this.c = p3;
        this.d = new Handler(Looper.getMainLooper());
        if (p3.isReady()) {
            return;
        }
        p3.init();
    }
}
