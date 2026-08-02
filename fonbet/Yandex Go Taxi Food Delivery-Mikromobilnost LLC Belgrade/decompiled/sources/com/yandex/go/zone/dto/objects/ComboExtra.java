package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.yjd;
import defpackage.z2c;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ComboExtra;", "", "Companion", "RouteDisplayType", "$serializer", "com/yandex/go/zone/dto/objects/b0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComboExtra {
    public static final b0 Companion = new b0();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(11))};
    public final boolean a;
    public final RouteDisplayType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ComboExtra$RouteDisplayType;", "", "Companion", "com/yandex/go/zone/dto/objects/c0", "DEFAULT", "CURVE", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RouteDisplayType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RouteDisplayType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final RouteDisplayType CURVE;
        public static final c0 Companion;
        public static final RouteDisplayType DEFAULT;

        static {
            RouteDisplayType routeDisplayType = new RouteDisplayType("DEFAULT", 0);
            DEFAULT = routeDisplayType;
            RouteDisplayType routeDisplayType2 = new RouteDisplayType("CURVE", 1);
            CURVE = routeDisplayType2;
            RouteDisplayType[] routeDisplayTypeArr = {routeDisplayType, routeDisplayType2};
            $VALUES = routeDisplayTypeArr;
            $ENTRIES = kotlin.enums.a.a(routeDisplayTypeArr);
            Companion = new c0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(12));
        }

        public static RouteDisplayType valueOf(String str) {
            return (RouteDisplayType) Enum.valueOf(RouteDisplayType.class, str);
        }

        public static RouteDisplayType[] values() {
            return (RouteDisplayType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ComboExtra(int i, boolean z, RouteDisplayType routeDisplayType) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = routeDisplayType;
        }
    }

    public static final /* synthetic */ void d(ComboExtra comboExtra, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || comboExtra.a) {
            yjdVar.n(serialDescriptor, 0, comboExtra.a);
        }
        if (!yjdVar.F() && comboExtra.b == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 1, (KSerializer) c[1].getValue(), comboExtra.b);
    }

    /* renamed from: b, reason: from getter */
    public final RouteDisplayType getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    public ComboExtra() {
        this.a = false;
        this.b = null;
    }
}
