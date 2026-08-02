package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;

/* compiled from: VkWorkoutCommandsFactory.kt */
/* loaded from: classes11.dex */
public interface z1w0 {

    /* compiled from: VkWorkoutCommandsFactory.kt */
    public static final class a {
        private static final z1w0 STUB = new C4152a();

        /* compiled from: VkWorkoutCommandsFactory.kt */
        /* renamed from: xsna.z1w0$a$a, reason: collision with other inner class name */
        public static final class C4152a implements z1w0 {
            @Override // xsna.z1w0
            public final dvv0 a(FragmentImpl fragmentImpl, VkUiCommand vkUiCommand) {
                return new y1w0();
            }
        }

        public static z1w0 a() {
            return STUB;
        }
    }

    dvv0 a(FragmentImpl fragmentImpl, VkUiCommand vkUiCommand);
}
