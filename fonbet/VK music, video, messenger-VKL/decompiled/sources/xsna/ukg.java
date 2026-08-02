package xsna;

import android.text.TextUtils;
import com.vk.core.apps.BuildInfo;

/* compiled from: CommonInfoBridge.kt */
/* loaded from: classes11.dex */
public final class ukg implements wvw {
    public static final ukg a = new ukg();
    public static final l7v b = new l7v(new a());

    /* compiled from: CommonInfoBridge.kt */
    public static final class a {
        public final com.vk.dto.hints.a a() {
            return (com.vk.dto.hints.a) ((bxx) q6r0.f().a(m6r0.q0));
        }

        public final void b(com.vk.dto.hints.a aVar) {
            o6r0 c = q6r0.c();
            if (aVar == null) {
                aVar = new com.vk.dto.hints.a(null);
            }
            c.j(aVar);
            c.f();
        }

        public final boolean c() {
            if (!BuildInfo.h() && !TextUtils.equals((String) q6r0.f().a(m6r0.q), "app_developer")) {
                return false;
            }
            o2l.a.getClass();
            return o2l.b("__dbg_test_tooltip", false);
        }
    }

    @Override // xsna.wvw
    public final l7v b() {
        return b;
    }
}
