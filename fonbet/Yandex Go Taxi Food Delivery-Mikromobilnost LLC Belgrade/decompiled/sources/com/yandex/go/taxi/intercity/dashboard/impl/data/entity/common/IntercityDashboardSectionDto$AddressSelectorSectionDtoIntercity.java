package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/i0;", "Companion", "Placeholders", "PlaceholderPoint", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity extends i0 {
    public static final q Companion = new q();
    public final String a;
    public final Placeholders b;

    public IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity(int i, String str, Placeholders placeholders) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = placeholders;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity$Placeholders;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Placeholders {
        public static final s Companion = new s();
        public final PlaceholderPoint a;
        public final PlaceholderPoint b;

        public /* synthetic */ Placeholders(int i, PlaceholderPoint placeholderPoint, PlaceholderPoint placeholderPoint2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = placeholderPoint;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = placeholderPoint2;
            }
        }

        public Placeholders() {
            this.a = null;
            this.b = null;
        }
    }

    public IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity() {
        this.a = "";
        this.b = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity$PlaceholderPoint;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PlaceholderPoint {
        public static final r Companion = new r();
        public static final i3y[] h = {null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(20))};
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final Map g;

        public /* synthetic */ PlaceholderPoint(int i, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
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
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str6;
            }
            if ((i & 64) == 0) {
                this.g = kotlin.collections.b.f();
            } else {
                this.g = map;
            }
        }

        public PlaceholderPoint() {
            Map f = kotlin.collections.b.f();
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = f;
        }
    }
}
