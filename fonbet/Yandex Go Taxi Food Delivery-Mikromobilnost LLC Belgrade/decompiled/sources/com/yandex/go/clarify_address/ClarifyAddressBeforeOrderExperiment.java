package com.yandex.go.clarify_address;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.y99;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/clarify_address/ClarifyAddressBeforeOrderExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/clarify_address/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClarifyAddressBeforeOrderExperiment extends w96 implements c6z {
    public static final d Companion = new d();
    public static final i3y[] l;
    public static final ClarifyAddressBeforeOrderExperiment m;
    public final boolean b;
    public final List c;
    public final Map d;
    public final String e;
    public final String f;
    public final List g;
    public final OrderButton h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new y99(13)), kotlin.a.b(lazyThreadSafetyMode, new y99(14)), null, null, kotlin.a.b(lazyThreadSafetyMode, new y99(15)), null, null, null, null};
        m = new ClarifyAddressBeforeOrderExperiment(0);
    }

    public /* synthetic */ ClarifyAddressBeforeOrderExperiment(int i, boolean z, List list, Map map, String str, String str2, List list2, OrderButton orderButton, boolean z2, boolean z3, boolean z4) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = kotlin.collections.b.f();
        } else {
            this.d = map;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i & 32) == 0) {
            this.g = emptyList;
        } else {
            this.g = list2;
        }
        if ((i & 64) == 0) {
            this.h = new OrderButton(0);
        } else {
            this.h = orderButton;
        }
        if ((i & 128) == 0) {
            this.i = false;
        } else {
            this.i = z2;
        }
        if ((i & 256) == 0) {
            this.j = false;
        } else {
            this.j = z3;
        }
        if ((i & 512) == 0) {
            this.k = false;
        } else {
            this.k = z4;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.d;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ClarifyAddressBeforeOrderExperiment() {
        this(0);
    }

    public ClarifyAddressBeforeOrderExperiment(int i) {
        Map f = kotlin.collections.b.f();
        OrderButton orderButton = new OrderButton(0);
        this.b = false;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = f;
        this.e = "";
        this.f = "";
        this.g = emptyList;
        this.h = orderButton;
        this.i = false;
        this.j = false;
        this.k = false;
    }
}
