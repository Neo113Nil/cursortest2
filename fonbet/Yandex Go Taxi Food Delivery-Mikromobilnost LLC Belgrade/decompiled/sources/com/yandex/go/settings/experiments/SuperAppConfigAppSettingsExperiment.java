package com.yandex.go.settings.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.uiv0;
import defpackage.vn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/settings/experiments/SuperAppConfigAppSettingsExperiment;", "Lvn11;", "Companion", "Type", "com/yandex/go/settings/experiments/a", "$serializer", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppConfigAppSettingsExperiment implements vn11 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new uiv0(22))};
    public static final SuperAppConfigAppSettingsExperiment d = new SuperAppConfigAppSettingsExperiment(0);
    public final Type b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/settings/experiments/SuperAppConfigAppSettingsExperiment$Type;", "", "Companion", "com/yandex/go/settings/experiments/b", "V1", "V2", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final Type V1;
        public static final Type V2;

        static {
            Type type = new Type("V1", 0);
            V1 = type;
            Type type2 = new Type("V2", 1);
            V2 = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new uiv0(23));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SuperAppConfigAppSettingsExperiment(int i, Type type) {
        if ((i & 1) == 0) {
            this.b = Type.V1;
        } else {
            this.b = type;
        }
    }

    public SuperAppConfigAppSettingsExperiment() {
        this(0);
    }

    public SuperAppConfigAppSettingsExperiment(int i) {
        this.b = Type.V1;
    }
}
