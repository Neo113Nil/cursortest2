package com.yandex.go.scooters.data.model;

import defpackage.fxi;
import defpackage.gsq0;
import defpackage.hxe;
import defpackage.i3y;
import defpackage.ief;
import defpackage.tl90;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/CreateOffersV1Response;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/g", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateOffersV1Response {
    public static final g Companion = new g();
    public static final i3y[] i;
    public final List a;
    public final List b;
    public final ief c;
    public final Subscription d;
    public final tl90 e;
    public final boolean f;
    public final String g;
    public final fxi h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new hxe(15)), kotlin.a.b(lazyThreadSafetyMode, new hxe(16)), null, null, null, null, null, null};
    }

    public /* synthetic */ CreateOffersV1Response(int i2, List list, List list2, ief iefVar, Subscription subscription, tl90 tl90Var, boolean z, String str, fxi fxiVar) {
        int i3 = i2 & 1;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i2 & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i2 & 4) == 0) {
            this.c = ief.e;
        } else {
            this.c = iefVar;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = subscription;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = tl90Var;
        }
        if ((i2 & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = fxiVar;
        }
    }

    public CreateOffersV1Response() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = ief.e;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = null;
        this.h = null;
    }
}
