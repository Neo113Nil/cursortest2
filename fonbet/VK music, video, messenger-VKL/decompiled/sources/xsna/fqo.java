package xsna;

import com.ironsource.Hb;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dynamic_loader.DynamicLib;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.stats.dynamiclib.DynamicLibEvent;
import java.util.concurrent.TimeUnit;

/* compiled from: DynamicLibReporter.kt */
/* loaded from: classes11.dex */
public final class fqo {
    public static final long a = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DynamicLibReporter.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a APPLOVIN;
        public static final a FILTERS;
        public static final a GL_EFFECTS;
        public static final a LIVES_PUBLISHER;
        public static final a LUTS;
        public static final a OPENCV;
        public static final a TENSORFLOW;
        private final int idx;
        private final String libName;

        static {
            a aVar = new a("GL_EFFECTS", 0, "gleffects", 0);
            GL_EFFECTS = aVar;
            a aVar2 = new a("OPENCV", 1, "opencv", 1);
            OPENCV = aVar2;
            a aVar3 = new a("TENSORFLOW", 2, "tensorflow", 2);
            TENSORFLOW = aVar3;
            a aVar4 = new a("FILTERS", 3, "clipsfilters", 3);
            FILTERS = aVar4;
            a aVar5 = new a("LIVES_PUBLISHER", 4, Hb.b, 5);
            LIVES_PUBLISHER = aVar5;
            a aVar6 = new a("LUTS", 5, "luts", 6);
            LUTS = aVar6;
            a aVar7 = new a("APPLOVIN", 6, "applovinads", 7);
            APPLOVIN = aVar7;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2, int i2) {
            this.libName = str2;
            this.idx = i2;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int i() {
            return this.idx;
        }

        public final String j() {
            return this.libName;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        if (BuildInfo.h() && DynamicLib.h().size() == a.h().size()) {
            int size = DynamicLib.h().size();
            for (int i = 0; i < size && epx.f(((DynamicLib) DynamicLib.h().get(i)).i(), ((a) a.h().get(i)).j()); i++) {
            }
        }
    }

    public static void a(String str, DynamicLibEvent dynamicLibEvent) {
        AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.DYN_LIB_EVENT);
        aggregateEventBuilder.w(0, str);
        aggregateEventBuilder.w(1, dynamicLibEvent.h());
        aggregateEventBuilder.q();
    }
}
