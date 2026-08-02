package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.multiaccount.api.domain.model.VkClientOpenSwitcherConfig;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.PinCodeAnalyticsParams;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import java.util.ArrayList;

/* compiled from: VkClientMultiAccountRouter.kt */
/* loaded from: classes3.dex */
public interface jlu0 extends com.vk.superapp.multiaccount.api.e {
    boolean b(String str);

    VkClientOpenSwitcherConfig d(MultiAccountEntryPoint multiAccountEntryPoint);

    void e(FragmentImpl fragmentImpl, MultiAccountEntryPoint multiAccountEntryPoint);

    void h(FragmentActivity fragmentActivity, MultiAccountEntryPoint multiAccountEntryPoint);

    void k(Context context, wku0 wku0Var);

    /* compiled from: VkClientMultiAccountRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final jlu0 STUB = new C3125a();

        public final jlu0 getSTUB() {
            return STUB;
        }

        /* compiled from: VkClientMultiAccountRouter.kt */
        /* renamed from: xsna.jlu0$a$a, reason: collision with other inner class name */
        public static final class C3125a implements jlu0 {
            @Override // com.vk.superapp.multiaccount.api.e
            public final boolean a(FragmentManager fragmentManager) {
                return false;
            }

            @Override // xsna.jlu0
            public final boolean b(String str) {
                return false;
            }

            @Override // xsna.jlu0
            public final VkClientOpenSwitcherConfig d(MultiAccountEntryPoint multiAccountEntryPoint) {
                return VkClientOpenSwitcherConfig.OPEN_SWITCHER;
            }

            @Override // xsna.jlu0
            public final void e(FragmentImpl fragmentImpl, MultiAccountEntryPoint multiAccountEntryPoint) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void f(FragmentManager fragmentManager, UserId userId) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void g(Context context, MultiAccountEntryPoint multiAccountEntryPoint) {
            }

            @Override // xsna.jlu0
            public final void h(FragmentActivity fragmentActivity, MultiAccountEntryPoint multiAccountEntryPoint) {
            }

            @Override // xsna.jlu0
            public final void k(Context context, wku0 wku0Var) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void l(Context context, UserId userId) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void c(Context context, UserId userId, PinCodeAnalyticsParams pinCodeAnalyticsParams) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void i(Context context, ArrayList arrayList, MultiAccountEntryPoint multiAccountEntryPoint) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void j(FragmentManager fragmentManager, MultiAccountEntryPoint multiAccountEntryPoint, SwitcherLaunchMode switcherLaunchMode, SwitcherUiMode switcherUiMode) {
            }
        }
    }
}
