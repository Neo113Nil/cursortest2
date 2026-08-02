package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;

/* compiled from: VkStepsCommandsFactory.kt */
/* loaded from: classes11.dex */
public interface cmv0 {

    /* compiled from: VkStepsCommandsFactory.kt */
    public static final class a {
        private static final cmv0 STUB = new C2669a();

        /* compiled from: VkStepsCommandsFactory.kt */
        /* renamed from: xsna.cmv0$a$a, reason: collision with other inner class name */
        public static final class C2669a implements cmv0 {
            @Override // xsna.cmv0
            public final dvv0 a(FragmentImpl fragmentImpl, VkUiCommand vkUiCommand) {
                return new bmv0();
            }
        }

        public static cmv0 a() {
            return STUB;
        }
    }

    dvv0 a(FragmentImpl fragmentImpl, VkUiCommand vkUiCommand);
}
