package com.yandex.go.taxi.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/experiments/ShadowDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/experiments/k", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ShadowDto {
    public static final k Companion = new k();
    public final String a;
    public final float b;

    public /* synthetic */ ShadowDto(String str, int i, float f) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = 0.0f;
        } else {
            this.b = f;
        }
    }

    public ShadowDto() {
        this.a = "";
        this.b = 0.0f;
    }
}
