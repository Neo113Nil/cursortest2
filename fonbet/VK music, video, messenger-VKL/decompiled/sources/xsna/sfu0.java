package xsna;

import androidx.fragment.app.FragmentActivity;

/* compiled from: VkBrowserBackPressCallback.kt */
/* loaded from: classes6.dex */
public final class sfu0 extends m180 {
    public final com.vk.superapp.browser.ui.a a;

    public sfu0(com.vk.superapp.browser.ui.a aVar) {
        super(true);
        this.a = aVar;
    }

    @Override // xsna.m180
    public final void handleOnBackPressed() {
        FragmentActivity activity;
        com.vk.superapp.browser.ui.a aVar = this.a;
        setEnabled(aVar.a0());
        if (isEnabled() || (activity = aVar.getActivity()) == null) {
            return;
        }
        activity.onBackPressed();
    }
}
