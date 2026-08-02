package com.ybsdk.network.converters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.math.BigDecimal;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/network/converters/BigDecimalAdapter;", "", "", "string", "Ljava/math/BigDecimal;", "fromJson", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "value", "toJson", "(Ljava/math/BigDecimal;)Ljava/lang/String;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BigDecimalAdapter {
    public static final BigDecimalAdapter a = new BigDecimalAdapter();

    @FromJson
    public final BigDecimal fromJson(String string) {
        return new BigDecimal(string);
    }

    @ToJson
    public final String toJson(BigDecimal value) {
        return value.toPlainString();
    }
}
