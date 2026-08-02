package com.yandex.go.mainscreen.superapp.impl.header.experiment;

import defpackage.c6z;
import defpackage.cue;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/experiment/CurrentAddressModalExperiment;", "Lw96;", "Lc6z;", "Companion", "OnMapClickActionType", "com/yandex/go/mainscreen/superapp/impl/header/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CurrentAddressModalExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] n;
    public static final CurrentAddressModalExperiment o;
    public final boolean b;
    public final String c;
    public final Integer d;
    public final OnMapClickActionType e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final Map m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/experiment/CurrentAddressModalExperiment$OnMapClickActionType;", "", "Companion", "com/yandex/go/mainscreen/superapp/impl/header/experiment/b", "SELECT_ON_MAP", "OPEN_SUGGEST_MENU", "UNDEFINED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class OnMapClickActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ OnMapClickActionType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final OnMapClickActionType OPEN_SUGGEST_MENU;
        public static final OnMapClickActionType SELECT_ON_MAP;
        public static final OnMapClickActionType UNDEFINED;

        static {
            OnMapClickActionType onMapClickActionType = new OnMapClickActionType("SELECT_ON_MAP", 0);
            SELECT_ON_MAP = onMapClickActionType;
            OnMapClickActionType onMapClickActionType2 = new OnMapClickActionType("OPEN_SUGGEST_MENU", 1);
            OPEN_SUGGEST_MENU = onMapClickActionType2;
            OnMapClickActionType onMapClickActionType3 = new OnMapClickActionType("UNDEFINED", 2);
            UNDEFINED = onMapClickActionType3;
            OnMapClickActionType[] onMapClickActionTypeArr = {onMapClickActionType, onMapClickActionType2, onMapClickActionType3};
            $VALUES = onMapClickActionTypeArr;
            $ENTRIES = kotlin.enums.a.a(onMapClickActionTypeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cue(9));
        }

        public static OnMapClickActionType valueOf(String str) {
            return (OnMapClickActionType) Enum.valueOf(OnMapClickActionType.class, str);
        }

        public static OnMapClickActionType[] values() {
            return (OnMapClickActionType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new cue(6)), null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new cue(7)), kotlin.a.b(lazyThreadSafetyMode, new cue(8))};
        o = new CurrentAddressModalExperiment(0);
    }

    public /* synthetic */ CurrentAddressModalExperiment(int i, boolean z, String str, Integer num, OnMapClickActionType onMapClickActionType, boolean z2, String str2, String str3, String str4, String str5, String str6, List list, Map map) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 8) == 0) {
            this.e = OnMapClickActionType.UNDEFINED;
        } else {
            this.e = onMapClickActionType;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str2;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str3;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str4;
        }
        if ((i & 256) == 0) {
            this.j = "";
        } else {
            this.j = str5;
        }
        if ((i & 512) == 0) {
            this.k = "";
        } else {
            this.k = str6;
        }
        if ((i & 1024) == 0) {
            this.l = EmptyList.a;
        } else {
            this.l = list;
        }
        if ((i & 2048) == 0) {
            this.m = kotlin.collections.b.f();
        } else {
            this.m = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentAddressModalExperiment)) {
            return false;
        }
        CurrentAddressModalExperiment currentAddressModalExperiment = (CurrentAddressModalExperiment) obj;
        return this.b == currentAddressModalExperiment.b && jl40.l(this.c, currentAddressModalExperiment.c) && jl40.l(this.d, currentAddressModalExperiment.d) && this.e == currentAddressModalExperiment.e && this.f == currentAddressModalExperiment.f && jl40.l(this.g, currentAddressModalExperiment.g) && jl40.l(this.h, currentAddressModalExperiment.h) && jl40.l(this.i, currentAddressModalExperiment.i) && jl40.l(this.j, currentAddressModalExperiment.j) && jl40.l(this.k, currentAddressModalExperiment.k) && jl40.l(this.l, currentAddressModalExperiment.l) && jl40.l(this.m, currentAddressModalExperiment.m);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.m;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        Integer num = this.d;
        return this.m.hashCode() + unr0.c(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.e((this.e.hashCode() + ((b + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder v = ly3.v("CurrentAddressModalExperiment(enabled=", ", shareLink=", this.c, ", mapZoom=", this.b);
        v.append(this.d);
        v.append(", onMapClickActionType=");
        v.append(this.e);
        v.append(", currentLocationModalShow=");
        unr0.A(", titleKey=", this.g, ", saveLocationTitleKey=", v, this.f);
        g8e.D(v, this.h, ", changeLocationTitleKey=", this.i, ", shareLocationTitleKey=");
        g8e.D(v, this.j, ", shareTextKey=", this.k, ", mapDimensions=");
        v.append(this.l);
        v.append(", l10n=");
        v.append(this.m);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CurrentAddressModalExperiment() {
        this(0);
    }

    public CurrentAddressModalExperiment(int i) {
        OnMapClickActionType onMapClickActionType = OnMapClickActionType.UNDEFINED;
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = "";
        this.d = null;
        this.e = onMapClickActionType;
        this.f = false;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = EmptyList.a;
        this.m = f;
    }
}
