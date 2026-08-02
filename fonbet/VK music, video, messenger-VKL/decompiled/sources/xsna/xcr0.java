package xsna;

import android.content.Context;
import com.vk.update.internal.VKInAppUpdateOpenStrategy;

/* compiled from: VKInAppUpdateEngineFactory.kt */
/* loaded from: classes6.dex */
public final class xcr0 {

    /* compiled from: VKInAppUpdateEngineFactory.kt */
    public static final class a {
        public final boolean a;
        public final Context b;
        public final String c;
        public final r63 d;
        public final ro e;
        public final VKInAppUpdateOpenStrategy f;

        public a() {
            throw null;
        }

        public a(boolean z, Context context, String str, r63 r63Var, ro roVar) {
            VKInAppUpdateOpenStrategy vKInAppUpdateOpenStrategy = VKInAppUpdateOpenStrategy.CUSTOM_TABS;
            this.a = z;
            this.b = context;
            this.c = str;
            this.d = r63Var;
            this.e = roVar;
            this.f = vKInAppUpdateOpenStrategy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f;
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + urd0.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31)) * 31);
        }

        public final String toString() {
            return "Config(enabled=" + this.a + ", context=" + this.b + ", baseUrl=" + this.c + ", okHttpClientProvider=" + this.d + ", logger=" + this.e + ", openStrategy=" + this.f + ')';
        }
    }

    public static wcr0 a(a aVar) {
        boolean z = aVar.a;
        Context context = aVar.b;
        return new wcr0(z, context.getPackageName(), new zcr0(aVar.c, aVar.e, aVar.d), context.getApplicationContext(), aVar.e, aVar.f);
    }
}
