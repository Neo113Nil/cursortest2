package xsna;

import android.content.Context;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.im.ImageList;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.api.id.CallId;
import java.lang.ref.WeakReference;

/* compiled from: VoipCallRouter.kt */
/* loaded from: classes11.dex */
public interface phw0 {

    /* compiled from: VoipCallRouter.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final WeakReference<Context> a;
        public final MobileOfficialAppsCoreNavStat$EventScreen b;
        public final String c;

        public a(WeakReference<Context> weakReference, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str) {
            this.a = weakReference;
            this.b = mobileOfficialAppsCoreNavStat$EventScreen;
            this.c = str;
        }
    }

    /* compiled from: VoipCallRouter.kt */
    /* loaded from: classes7.dex */
    public static final class b {
        public final WeakReference<Context> a;
        public final boolean b = true;

        public b(WeakReference weakReference) {
            this.a = weakReference;
        }
    }

    /* compiled from: VoipCallRouter.kt */
    /* loaded from: classes7.dex */
    public static final class c {
        public final WeakReference<Context> a;

        public c(WeakReference<Context> weakReference) {
            this.a = weakReference;
        }
    }

    /* compiled from: VoipCallRouter.kt */
    /* loaded from: classes7.dex */
    public static final class d {
        public final WeakReference<Context> a;
        public final String b;
        public final VoipCallSource c;
        public final String d;
        public final String e;
        public final ImageList f;
        public final int g;
        public final CallId h;
        public final a i;

        /* compiled from: VoipCallRouter.kt */
        public static final class a {
            public final boolean a;
            public final boolean b;
            public final boolean c;

            public a(boolean z, boolean z2, boolean z3) {
                this.a = z;
                this.b = z2;
                this.c = z3;
            }

            public final boolean a() {
                return this.a;
            }

            public final boolean b() {
                return this.b;
            }

            public final boolean c() {
                return this.c;
            }
        }

        public d(WeakReference weakReference, String str, VoipCallSource voipCallSource, String str2, String str3, ImageList imageList, int i, a aVar, int i2) {
            str2 = (i2 & 8) != 0 ? "" : str2;
            str3 = (i2 & 16) != 0 ? "" : str3;
            imageList = (i2 & 32) != 0 ? null : imageList;
            i = (i2 & 64) != 0 ? 0 : i;
            CallId callId = CallId.e;
            aVar = (i2 & 256) != 0 ? new a(true, true, false) : aVar;
            this.a = weakReference;
            this.b = str;
            this.c = voipCallSource;
            this.d = str2;
            this.e = str3;
            this.f = imageList;
            this.g = i;
            this.h = callId;
            this.i = aVar;
        }

        public final CallId a() {
            return this.h;
        }

        public final String b() {
            return this.e;
        }

        public final VoipCallSource c() {
            return this.c;
        }

        public final WeakReference<Context> d() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public final ImageList f() {
            return this.f;
        }

        public final a g() {
            return this.i;
        }

        public final int h() {
            return this.g;
        }

        public final String i() {
            return this.b;
        }
    }

    void a(c cVar);

    void b(a aVar);

    void d(d dVar);

    void e(b bVar);

    default void c() {
    }
}
