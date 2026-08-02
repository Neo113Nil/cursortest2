package com.yandex.go.order.external.unifiedpolling.dto;

import com.yandex.go.order.external.unifiedpolling.dto.card.EatsOrderCardDto;
import com.yandex.go.order.external.unifiedpolling.dto.contact.EatsOrderContactDto;
import com.yandex.go.order.external.unifiedpolling.dto.courier.EatsOrderCourierDto;
import com.yandex.go.order.external.unifiedpolling.dto.details.EatsOrderDetailsDto;
import com.yandex.go.order.external.unifiedpolling.dto.place.EatsOrderPlaceDto;
import com.yandex.go.order.external.unifiedpolling.dto.status.EatsOrderStatusDto;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ktm;
import defpackage.qje;
import defpackage.r9v;
import defpackage.tvl;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/EatsOrderDto;", "", "Companion", PlusPayUiKitInflaterFactory.NAME_BUTTON, "WebCustomTabsActionDto", "Action", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EatsOrderDto {
    public static final c Companion = new c();
    public static final i3y[] t;
    public final EatsOrderStatusDto a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final EatsOrderDetailsDto f;
    public final EatsOrderPlaceDto g;
    public final EatsOrderCourierDto h;
    public final EatsOrderContactDto i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final r9v o;
    public final EatsOrderCardDto p;
    public final Button q;
    public final List r;
    public final Action s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/EatsOrderDto$WebCustomTabsActionDto;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class WebCustomTabsActionDto {
        public static final d Companion = new d();
        public final String a;
        public final boolean b;

        public /* synthetic */ WebCustomTabsActionDto(int i, String str, boolean z) {
            if (1 != (i & 1)) {
                qje.Z(i, 1, EatsOrderDto$WebCustomTabsActionDto$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getB() {
            return this.b;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        t = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new tvl(23)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new tvl(24)), null};
    }

    public /* synthetic */ EatsOrderDto(int i, EatsOrderStatusDto eatsOrderStatusDto, String str, String str2, String str3, Integer num, EatsOrderDetailsDto eatsOrderDetailsDto, EatsOrderPlaceDto eatsOrderPlaceDto, EatsOrderCourierDto eatsOrderCourierDto, EatsOrderContactDto eatsOrderContactDto, String str4, String str5, String str6, String str7, String str8, r9v r9vVar, EatsOrderCardDto eatsOrderCardDto, Button button, List list, Action action) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = eatsOrderStatusDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = eatsOrderDetailsDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = eatsOrderPlaceDto;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = eatsOrderCourierDto;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = eatsOrderContactDto;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str6;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str7;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str8;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = r9vVar;
        }
        this.p = (32768 & i) == 0 ? new EatsOrderCardDto(0) : eatsOrderCardDto;
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = button;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = list;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = action;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/EatsOrderDto$Action;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class Action {
        public static final a Companion = new a();
        public final String a;

        public /* synthetic */ Action(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public Action() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/EatsOrderDto$Button;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class Button {
        public static final b Companion = new b();
        public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(25))};
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final WebCustomTabsActionDto e;
        public final Map f;

        public /* synthetic */ Button(int i, String str, String str2, String str3, String str4, WebCustomTabsActionDto webCustomTabsActionDto, Map map) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = webCustomTabsActionDto;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = map;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* renamed from: b, reason: from getter */
        public final Map getF() {
            return this.f;
        }

        /* renamed from: c, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: d, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: e, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: f, reason: from getter */
        public final WebCustomTabsActionDto getE() {
            return this.e;
        }

        public Button() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }

    public EatsOrderDto() {
        EatsOrderCardDto eatsOrderCardDto = new EatsOrderCardDto(0);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = eatsOrderCardDto;
        this.q = null;
        this.r = null;
        this.s = null;
    }
}
