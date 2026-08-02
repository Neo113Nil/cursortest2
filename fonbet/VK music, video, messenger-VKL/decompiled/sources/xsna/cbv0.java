package xsna;

/* compiled from: VkPayCheckoutApiConfig.kt */
/* loaded from: classes6.dex */
public final class cbv0 {
    public final a a;
    public final boolean b;
    public final ibv0 c;

    /* compiled from: VkPayCheckoutApiConfig.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Endpoints(mailMoneyApiEndpoint=");
            sb.append(this.a);
            sb.append(", mailMoneySignatureEndpoint=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public cbv0(a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
        this.c = new ibv0(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbv0)) {
            return false;
        }
        cbv0 cbv0Var = (cbv0) obj;
        return epx.f(this.a, cbv0Var.a) && this.b == cbv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkPayCheckoutApiConfig(endpoints=");
        sb.append(this.a);
        sb.append(", useTestMerchant=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
