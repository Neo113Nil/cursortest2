package xsna;

import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import xsna.uen0;

/* compiled from: SuperappAnalyticsHolder.kt */
/* loaded from: classes6.dex */
public final class ven0 implements uen0.a {
    public final /* synthetic */ List<PayMethodData> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ven0(List<? extends PayMethodData> list) {
        this.a = list;
    }

    @Override // xsna.uen0.a
    public final String a() {
        return j5g.g0(this.a, StringUtils.COMMA, null, null, 0, new w9l0(3), 30);
    }

    @Override // xsna.uen0.a
    public final Integer getMethodsCount() {
        return Integer.valueOf(this.a.size());
    }
}
