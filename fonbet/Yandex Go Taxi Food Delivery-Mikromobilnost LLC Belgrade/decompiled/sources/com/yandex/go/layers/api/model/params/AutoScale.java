package com.yandex.go.layers.api.model.params;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/layers/api/model/params/AutoScale;", "", "Companion", "$serializer", "com/yandex/go/layers/api/model/params/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AutoScale {
    public static final a Companion = new a();
    public final String a;
    public final Float b;
    public final Float c;
    public final Float d;
    public final Float e;

    public /* synthetic */ AutoScale(int i, String str, Float f, Float f2, Float f3, Float f4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f4;
        }
    }

    public AutoScale() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
