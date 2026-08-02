package com.yandex.go.flex.main_screen.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tsv0;
import defpackage.vn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/main_screen/experiments/SuperAppMainScreenDocumentLoaderExperiment;", "Lvn11;", "Companion", "Type", "com/yandex/go/flex/main_screen/experiments/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppMainScreenDocumentLoaderExperiment implements vn11 {
    public static final d Companion = new d();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(25))};
    public static final SuperAppMainScreenDocumentLoaderExperiment d = new SuperAppMainScreenDocumentLoaderExperiment(0);
    public final Type b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/main_screen/experiments/SuperAppMainScreenDocumentLoaderExperiment$Type;", "", "Companion", "com/yandex/go/flex/main_screen/experiments/e", "DEFAULT", "LINKED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final e Companion;
        public static final Type DEFAULT;
        public static final Type LINKED;

        static {
            Type type = new Type("DEFAULT", 0);
            DEFAULT = type;
            Type type2 = new Type("LINKED", 1);
            LINKED = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new e();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(26));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SuperAppMainScreenDocumentLoaderExperiment(int i, Type type) {
        if ((i & 1) == 0) {
            this.b = Type.DEFAULT;
        } else {
            this.b = type;
        }
    }

    public SuperAppMainScreenDocumentLoaderExperiment() {
        this(0);
    }

    public SuperAppMainScreenDocumentLoaderExperiment(int i) {
        this.b = Type.DEFAULT;
    }
}
