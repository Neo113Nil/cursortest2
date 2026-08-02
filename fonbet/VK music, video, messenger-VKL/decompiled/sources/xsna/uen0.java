package xsna;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.data.model.GooglePay;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vk.superapp.vkpay.checkout.data.model.VkPay;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: SuperappAnalyticsHolder.kt */
/* loaded from: classes6.dex */
public final class uen0 {
    public final String a;
    public final Integer b;
    public final String c;
    public volatile bin0<String> d = new doq();
    public volatile c e = new f();
    public volatile b f = new e();
    public volatile a g = new d();

    /* compiled from: SuperappAnalyticsHolder.kt */
    public interface a {
        String a();

        Integer getMethodsCount();
    }

    /* compiled from: SuperappAnalyticsHolder.kt */
    public interface b {
        Boolean a();

        String b();
    }

    /* compiled from: SuperappAnalyticsHolder.kt */
    public interface c {
        String a();

        Integer b();
    }

    /* compiled from: SuperappAnalyticsHolder.kt */
    public static final class d implements a {
        @Override // xsna.uen0.a
        public final String a() {
            return null;
        }

        @Override // xsna.uen0.a
        public final Integer getMethodsCount() {
            return null;
        }
    }

    /* compiled from: SuperappAnalyticsHolder.kt */
    public static final class e implements b {
        @Override // xsna.uen0.b
        public final Boolean a() {
            return null;
        }

        @Override // xsna.uen0.b
        public final String b() {
            return null;
        }
    }

    /* compiled from: SuperappAnalyticsHolder.kt */
    public static final class f implements c {
        @Override // xsna.uen0.c
        public final String a() {
            return null;
        }

        @Override // xsna.uen0.c
        public final Integer b() {
            return null;
        }
    }

    /* compiled from: SuperappAnalyticsHolder.kt */
    public static final class g implements b {
        @Override // xsna.uen0.b
        public final Boolean a() {
            return null;
        }

        @Override // xsna.uen0.b
        public final String b() {
            return null;
        }
    }

    /* compiled from: SuperappAnalyticsHolder.kt */
    public static final class h implements b {
        public final /* synthetic */ b0l0 a;

        public h(b0l0 b0l0Var) {
            this.a = b0l0Var;
        }

        @Override // xsna.uen0.b
        public final Boolean a() {
            return Boolean.valueOf(!this.a.b());
        }

        @Override // xsna.uen0.b
        public final String b() {
            if (a().booleanValue()) {
                return this.a.a().toString();
            }
            return null;
        }
    }

    /* compiled from: SuperappAnalyticsHolder.kt */
    public static final class i implements c {
        @Override // xsna.uen0.c
        public final String a() {
            return null;
        }

        @Override // xsna.uen0.c
        public final Integer b() {
            return null;
        }
    }

    /* compiled from: SuperappAnalyticsHolder.kt */
    public static final class j implements c {
        public final /* synthetic */ PayMethodData a;

        public j(PayMethodData payMethodData) {
            this.a = payMethodData;
        }

        @Override // xsna.uen0.c
        public final String a() {
            PayMethodData payMethodData = this.a;
            return payMethodData instanceof GooglePay ? AndroidStaticDeviceInfoDataSource.STORE_GOOGLE : payMethodData instanceof VkPay ? "wallet" : payMethodData instanceof Card ? "card" : "";
        }

        @Override // xsna.uen0.c
        public final Integer b() {
            PayMethodData payMethodData = this.a;
            if (payMethodData instanceof GooglePay) {
                return 501;
            }
            if (payMethodData instanceof VkPay) {
                return Integer.valueOf(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
            }
            return null;
        }
    }

    public uen0(String str, Integer num, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final void a(b0l0 b0l0Var) {
        if (b0l0Var == null) {
            this.f = new g();
        } else {
            this.f = new h(b0l0Var);
        }
    }

    public final void b(PayMethodData payMethodData) {
        if (payMethodData == null) {
            this.e = new i();
        } else {
            this.e = new j(payMethodData);
        }
    }
}
