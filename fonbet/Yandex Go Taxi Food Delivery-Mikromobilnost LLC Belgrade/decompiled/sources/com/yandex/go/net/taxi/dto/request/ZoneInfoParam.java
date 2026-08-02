package com.yandex.go.net.taxi.dto.request;

import defpackage.bd61;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/net/taxi/dto/request/ZoneInfoParam;", "", "Companion", "com/yandex/go/net/taxi/dto/request/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ZoneInfoParam {
    public static final c Companion = new c();
    public static final i3y[] j;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final List e;
    public final jsq0 f;
    public final boolean g;
    public final boolean h;
    public String i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bd61(4)), kotlin.a.b(lazyThreadSafetyMode, new bd61(5)), null, null, null};
    }

    public /* synthetic */ ZoneInfoParam(int i, String str, String str2, int i2, int i3, List list, jsq0 jsq0Var, boolean z, boolean z2, String str3) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, ZoneInfoParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = list;
        this.f = jsq0Var;
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = true;
        } else {
            this.h = z2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
    }

    public ZoneInfoParam(String str, String str2, int i, int i2, List list, jsq0 jsq0Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = list;
        this.f = jsq0Var;
        this.g = true;
        this.h = true;
        this.i = null;
    }
}
