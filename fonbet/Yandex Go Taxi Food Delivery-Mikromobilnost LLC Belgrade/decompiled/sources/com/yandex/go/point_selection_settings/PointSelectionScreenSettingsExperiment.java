package com.yandex.go.point_selection_settings;

import defpackage.bbd0;
import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.n96;
import defpackage.nnm;
import defpackage.unr0;
import defpackage.yud0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/point_selection_settings/PointSelectionScreenSettingsExperiment;", "Ln96;", "Lc6z;", "Companion", "TariffsSettings", "com/yandex/go/point_selection_settings/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PointSelectionScreenSettingsExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] e;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new bbd0(29)), kotlin.a.b(lazyThreadSafetyMode, new yud0(0))};
    }

    public /* synthetic */ PointSelectionScreenSettingsExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointSelectionScreenSettingsExperiment)) {
            return false;
        }
        PointSelectionScreenSettingsExperiment pointSelectionScreenSettingsExperiment = (PointSelectionScreenSettingsExperiment) obj;
        return this.b == pointSelectionScreenSettingsExperiment.b && jl40.l(this.c, pointSelectionScreenSettingsExperiment.c) && jl40.l(this.d, pointSelectionScreenSettingsExperiment.d);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return ly3.s(nnm.l("PointSelectionScreenSettingsExperiment(enabled=", ", l10n=", ", settingsByTariffs=", this.c, this.b), this.d, Extension.C_BRAKE);
    }

    public PointSelectionScreenSettingsExperiment() {
        this(0);
    }

    public PointSelectionScreenSettingsExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/point_selection_settings/PointSelectionScreenSettingsExperiment$TariffsSettings;", "", "Companion", "Type", "$serializer", "com/yandex/go/point_selection_settings/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class TariffsSettings {
        public static final b Companion = new b();
        public static final i3y[] f;
        public final Type a;
        public final String b;
        public final String c;
        public final String d;
        public final List e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/point_selection_settings/PointSelectionScreenSettingsExperiment$TariffsSettings$Type;", "", "Companion", "com/yandex/go/point_selection_settings/c", "STARTING", "DESTINATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes5.dex */
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final c Companion;
            public static final Type DESTINATION;
            public static final Type STARTING;

            static {
                Type type = new Type("STARTING", 0);
                STARTING = type;
                Type type2 = new Type("DESTINATION", 1);
                DESTINATION = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new c();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(3));
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
            f = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new yud0(1)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new yud0(2))};
        }

        public /* synthetic */ TariffsSettings(int i, Type type, String str, String str2, String str3, List list) {
            this.a = (i & 1) == 0 ? Type.STARTING : type;
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
                this.e = EmptyList.a;
            } else {
                this.e = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TariffsSettings)) {
                return false;
            }
            TariffsSettings tariffsSettings = (TariffsSettings) obj;
            return this.a == tariffsSettings.a && jl40.l(this.b, tariffsSettings.b) && jl40.l(this.c, tariffsSettings.c) && jl40.l(this.d, tariffsSettings.d) && jl40.l(this.e, tariffsSettings.e);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TariffsSettings(type=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            g8e.D(sb, this.c, ", confirmButton=", this.d, ", tariffClasses=");
            return ly3.s(sb, this.e, Extension.C_BRAKE);
        }

        public TariffsSettings() {
            this.a = Type.STARTING;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = EmptyList.a;
        }
    }
}
