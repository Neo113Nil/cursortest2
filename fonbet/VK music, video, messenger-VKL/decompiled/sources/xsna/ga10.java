package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;

/* compiled from: MarketPickerContext.kt */
/* loaded from: classes4.dex */
public final class ga10 implements aj20 {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;

    public ga10(UserId userId, PostingMetricEntryPoint postingMetricEntryPoint, Integer num, Integer num2) {
        this.a = postingMetricEntryPoint;
        this.b = userId;
        this.c = num;
        this.d = num2;
    }

    @Override // xsna.aj20
    public yi20 build() {
        return (yi20) ((u9i) this.a).b((String) this.b, (String) this.c, (String) this.d, jk3.e);
    }

    @Override // xsna.aj20
    public aj20 setInstrumentationVersion(String str) {
        this.c = str;
        return this;
    }

    @Override // xsna.aj20
    public aj20 setSchemaUrl(String str) {
        this.d = str;
        return this;
    }

    public ga10(u9i u9iVar, String str) {
        this.a = u9iVar;
        this.b = str;
    }
}
