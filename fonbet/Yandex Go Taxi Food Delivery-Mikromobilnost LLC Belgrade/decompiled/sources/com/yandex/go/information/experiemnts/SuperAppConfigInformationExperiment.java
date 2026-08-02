package com.yandex.go.information.experiemnts;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.uiv0;
import defpackage.vn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/information/experiemnts/SuperAppConfigInformationExperiment;", "Lvn11;", "Companion", "Type", "com/yandex/go/information/experiemnts/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppConfigInformationExperiment implements vn11 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new uiv0(28))};
    public static final SuperAppConfigInformationExperiment d = new SuperAppConfigInformationExperiment(0);
    public final Type b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/information/experiemnts/SuperAppConfigInformationExperiment$Type;", "", "Companion", "com/yandex/go/information/experiemnts/b", "COMMON", "SUPERLEGAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Type COMMON;
        public static final b Companion;
        public static final Type SUPERLEGAL;

        static {
            Type type = new Type("COMMON", 0);
            COMMON = type;
            Type type2 = new Type("SUPERLEGAL", 1);
            SUPERLEGAL = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new uiv0(29));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SuperAppConfigInformationExperiment(int i, Type type) {
        if ((i & 1) == 0) {
            this.b = Type.COMMON;
        } else {
            this.b = type;
        }
    }

    public SuperAppConfigInformationExperiment() {
        this(0);
    }

    public SuperAppConfigInformationExperiment(int i) {
        this.b = Type.COMMON;
    }
}
