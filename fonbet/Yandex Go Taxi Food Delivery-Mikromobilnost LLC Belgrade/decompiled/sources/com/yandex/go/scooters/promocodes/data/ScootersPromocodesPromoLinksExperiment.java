package com.yandex.go.scooters.promocodes.data;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.zqn0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/promocodes/data/ScootersPromocodesPromoLinksExperiment;", "Lw96;", "Lc6z;", "Companion", "PromoLinkItem", "com/yandex/go/scooters/promocodes/data/a", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersPromocodesPromoLinksExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] e;
    public static final ScootersPromocodesPromoLinksExperiment f;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new zqn0(21)), kotlin.a.b(lazyThreadSafetyMode, new zqn0(22))};
        f = new ScootersPromocodesPromoLinksExperiment(0);
    }

    public /* synthetic */ ScootersPromocodesPromoLinksExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/promocodes/data/ScootersPromocodesPromoLinksExperiment$PromoLinkItem;", "", "Companion", "$serializer", "com/yandex/go/scooters/promocodes/data/b", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PromoLinkItem {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ PromoLinkItem(int i, String str, String str2, String str3) {
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
        }

        public PromoLinkItem() {
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }

    public ScootersPromocodesPromoLinksExperiment() {
        this(0);
    }

    public ScootersPromocodesPromoLinksExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }
}
