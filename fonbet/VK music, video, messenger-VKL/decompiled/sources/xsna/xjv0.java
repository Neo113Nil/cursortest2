package xsna;

import kotlin.NotImplementedError;

/* compiled from: VkSilentTokenExchanger.kt */
/* loaded from: classes.dex */
public interface xjv0 {

    /* compiled from: VkSilentTokenExchanger.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final xjv0 STUB = new C4011a();

        /* compiled from: VkSilentTokenExchanger.kt */
        /* renamed from: xsna.xjv0$a$a, reason: collision with other inner class name */
        public static final class C4011a implements xjv0 {
            @Override // xsna.xjv0
            public final b.a a() {
                return new b.a(new NotImplementedError());
            }
        }

        public final xjv0 getSTUB() {
            return STUB;
        }
    }

    b.a a();

    /* compiled from: VkSilentTokenExchanger.kt */
    /* loaded from: classes15.dex */
    public static abstract class b {

        /* compiled from: VkSilentTokenExchanger.kt */
        /* renamed from: xsna.xjv0$b$b, reason: collision with other inner class name */
        public static final class C4012b extends b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4012b)) {
                    return false;
                }
                ((C4012b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Success(accessToken=null, uid=0)";
            }
        }

        /* compiled from: VkSilentTokenExchanger.kt */
        public static final class a extends b {
            public final Throwable a;
            public final String b;
            public final boolean c;

            public a(Throwable th, String str) {
                this.a = th;
                this.b = str;
                this.c = true;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                Throwable th = this.a;
                int hashCode = (th == null ? 0 : th.hashCode()) * 31;
                String str = this.b;
                return Boolean.hashCode(this.c) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(cause=");
                sb.append(this.a);
                sb.append(", message=");
                sb.append(this.b);
                sb.append(", silentTokenWasUsed=");
                return defpackage.q0.a(sb, this.c, ')');
            }

            public /* synthetic */ a(NotImplementedError notImplementedError) {
                this(notImplementedError, "silent tokens are not supported!");
            }
        }
    }
}
