package com.yandex.go.taxi.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/experiments/ShowPolicyDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/experiments/l", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ShowPolicyDto {
    public static final l Companion = new l();
    public final String a;
    public final int b;
    public final int c;

    public /* synthetic */ ShowPolicyDto(int i, int i2, int i3, String str) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = Integer.MAX_VALUE;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = Integer.MAX_VALUE;
        } else {
            this.c = i3;
        }
    }

    public ShowPolicyDto() {
        this.a = "";
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
    }
}
