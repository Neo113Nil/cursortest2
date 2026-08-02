package xsna;

import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;

/* compiled from: VKSuperAppBrowserFragmentBuilder.kt */
/* loaded from: classes6.dex */
public class jgr0 extends oz50 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jgr0(String str, long j, Class cls, boolean z, int i) {
        super(cls, null, null);
        cls = (i & 8) != 0 ? VKSuperAppBrowserFragment.class : cls;
        z = (i & 16) != 0 ? false : z;
        this.j.putString("key_url", str);
        this.j.putLong("key_application_id", j);
        this.j.putString("original_url", null);
        this.j.putBoolean("is_user_banned", z);
    }
}
