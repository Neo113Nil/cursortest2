package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;

/* compiled from: MaxInstallCheckHelper.kt */
/* loaded from: classes15.dex */
public final class eo10 {

    /* compiled from: MaxInstallCheckHelper.kt */
    public static abstract class a {

        /* compiled from: MaxInstallCheckHelper.kt */
        /* renamed from: xsna.eo10$a$a, reason: collision with other inner class name */
        public static final class C2826a extends a {
            public static final C2826a a = new C2826a();
        }

        /* compiled from: MaxInstallCheckHelper.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: MaxInstallCheckHelper.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    public static a a(Context context) {
        if (!BuildInfo.s()) {
            return a.b.a;
        }
        SakFeatures.b.getClass();
        b.d i = SakFeatures.c.i(SakFeatures.Type.SAK_DEF_CLIENT_INSTALL_ANDROID);
        if (i == null || !i.a) {
            return a.b.a;
        }
        if (xhr0.b(context, "ru.oneme.app")) {
            return a.b.a;
        }
        String obj = i.c.toString();
        return epx.f(obj, "A") ? a.c.a : epx.f(obj, "B") ? a.C2826a.a : a.b.a;
    }
}
