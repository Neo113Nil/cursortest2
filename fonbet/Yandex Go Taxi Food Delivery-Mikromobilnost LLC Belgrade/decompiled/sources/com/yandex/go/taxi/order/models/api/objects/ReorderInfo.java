package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.lqi0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/ReorderInfo;", "", "Companion", "ReorderOption", "$serializer", "com/yandex/go/taxi/order/models/api/objects/b1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReorderInfo {
    public static final b1 Companion = new b1();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(11))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ ReorderInfo(int i, String str, String str2, String str3, String str4, List list) {
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
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final List getE() {
        return this.e;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/ReorderInfo$ReorderOption;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/c1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ReorderOption {
        public static final c1 Companion = new c1();
        public final String a;
        public final String b;

        public /* synthetic */ ReorderOption(int i, String str, String str2) {
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
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public ReorderOption() {
            this.a = "";
            this.b = "";
        }
    }

    public ReorderInfo() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = EmptyList.a;
    }
}
