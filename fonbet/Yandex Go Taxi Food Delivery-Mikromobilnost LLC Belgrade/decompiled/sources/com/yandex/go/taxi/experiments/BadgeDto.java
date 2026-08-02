package com.yandex.go.taxi.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/experiments/BadgeDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/experiments/b", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BadgeDto {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;
    public final ShadowDto d;
    public final ShowPolicyDto e;

    public /* synthetic */ BadgeDto(int i, String str, String str2, String str3, ShadowDto shadowDto, ShowPolicyDto showPolicyDto) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = shadowDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = showPolicyDto;
        }
    }

    public BadgeDto() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = null;
    }
}
