package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/LootBoxAnimationInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/typed_experiments/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LootBoxAnimationInfo {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public /* synthetic */ LootBoxAnimationInfo(int i, String str, String str2, String str3, String str4, float f, float f2, float f3, float f4, float f5) {
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
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = 0.0f;
        } else {
            this.e = f;
        }
        if ((i & 32) == 0) {
            this.f = 0.0f;
        } else {
            this.f = f2;
        }
        if ((i & 64) == 0) {
            this.g = 0.0f;
        } else {
            this.g = f3;
        }
        if ((i & 128) == 0) {
            this.h = 0.0f;
        } else {
            this.h = f4;
        }
        if ((i & 256) == 0) {
            this.i = 0.0f;
        } else {
            this.i = f5;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public LootBoxAnimationInfo() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
    }
}
