package xsna;

import com.vk.superapp.api.dto.app.WebSubscriptionInfo;

/* compiled from: CreateSubscriptionResult.kt */
/* loaded from: classes6.dex */
public abstract class nak {
    public final int a;

    /* compiled from: CreateSubscriptionResult.kt */
    public static final class a extends nak {
        public final WebSubscriptionInfo b;

        public a(WebSubscriptionInfo webSubscriptionInfo) {
            super(webSubscriptionInfo.b);
            this.b = webSubscriptionInfo;
        }
    }

    /* compiled from: CreateSubscriptionResult.kt */
    public static final class b extends nak {
    }

    public nak(int i) {
        this.a = i;
    }
}
