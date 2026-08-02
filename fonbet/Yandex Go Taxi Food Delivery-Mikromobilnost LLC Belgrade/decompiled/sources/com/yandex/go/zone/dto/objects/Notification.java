package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j660;
import defpackage.k4o;
import defpackage.vfy;
import defpackage.wh60;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/zone/dto/objects/Notification;", "Lwh60;", "Lvfy;", "Companion", "Type", "com/yandex/go/zone/dto/objects/o2", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Notification implements wh60, vfy {
    public static final o2 Companion = new o2();
    public static final i3y[] f;
    public final Type a;
    public final int b;
    public final String c;
    public final Map d;
    public final List e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/Notification$Type;", "", "Companion", "com/yandex/go/zone/dto/objects/p2", "TARIFF_POPUP", "MULTICLASS_ASSIGN", "SCHEDULED_ORDER_PROMO", "REQUIREMENT_CARD_TITLE", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final p2 Companion;
        public static final Type MULTICLASS_ASSIGN;
        public static final Type REQUIREMENT_CARD_TITLE;
        public static final Type SCHEDULED_ORDER_PROMO;
        public static final Type TARIFF_POPUP;

        static {
            Type type = new Type("TARIFF_POPUP", 0);
            TARIFF_POPUP = type;
            Type type2 = new Type("MULTICLASS_ASSIGN", 1);
            MULTICLASS_ASSIGN = type2;
            Type type3 = new Type("SCHEDULED_ORDER_PROMO", 2);
            SCHEDULED_ORDER_PROMO = type3;
            Type type4 = new Type("REQUIREMENT_CARD_TITLE", 3);
            REQUIREMENT_CARD_TITLE = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new p2();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j660(19));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new j660(16)), null, null, kotlin.a.b(lazyThreadSafetyMode, new j660(17)), kotlin.a.b(lazyThreadSafetyMode, new j660(18))};
    }

    public /* synthetic */ Notification(int i, Type type, int i2, String str, Map map, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = type;
        }
        if ((i & 2) == 0) {
            this.b = 1;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = kotlin.collections.b.f();
        } else {
            this.d = map;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    @Override // defpackage.vfy
    /* renamed from: a, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public Notification() {
        Map f2 = kotlin.collections.b.f();
        this.a = null;
        this.b = 1;
        this.c = null;
        this.d = f2;
        this.e = EmptyList.a;
    }
}
