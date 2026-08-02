package defpackage;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class e901 {
    public static final e901 f = new e901(0);
    public final List a;
    public final List b;
    public final int c;
    public final RoadObjectSettingsExperiment.TrafficLight d;
    public final a e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ e901(int i) {
        this(r1, r1, 0, null, r5);
        a aVar = new a(0);
        EmptyList emptyList = EmptyList.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    public static e901 a(e901 e901Var, List list, ArrayList arrayList, int i, RoadObjectSettingsExperiment.TrafficLight trafficLight, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            list = e901Var.a;
        }
        List list2 = list;
        ArrayList arrayList2 = arrayList;
        if ((i2 & 2) != 0) {
            arrayList2 = e901Var.b;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i2 & 4) != 0) {
            i = e901Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            trafficLight = e901Var.d;
        }
        RoadObjectSettingsExperiment.TrafficLight trafficLight2 = trafficLight;
        if ((i2 & 16) != 0) {
            aVar = e901Var.e;
        }
        e901Var.getClass();
        return new e901(list2, arrayList3, i3, trafficLight2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e901)) {
            return false;
        }
        e901 e901Var = (e901) obj;
        return jl40.l(this.a, e901Var.a) && jl40.l(this.b, e901Var.b) && this.c == e901Var.c && jl40.l(this.d, e901Var.d) && jl40.l(this.e, e901Var.e);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, unr0.c(this.a.hashCode() * 31, 31, this.b), 31);
        RoadObjectSettingsExperiment.TrafficLight trafficLight = this.d;
        return this.e.hashCode() + ((b + (trafficLight == null ? 0 : trafficLight.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = qv10.v("TrafficLightsState(visibleTrafficLightPoints=", this.a, ", allTrafficLightPoints=", this.b, ", countHiddenTrafficLights=");
        v.append(this.c);
        v.append(", trafficLightSettings=");
        v.append(this.d);
        v.append(", bubble=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public static final class a {
        public final boolean a;
        public final float b;
        public final String c;

        public a(float f, boolean z, String str) {
            this.a = z;
            this.b = f;
            this.c = str;
        }

        public static a a(a aVar, boolean z, float f, String str, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                f = aVar.b;
            }
            if ((i & 4) != 0) {
                str = aVar.c;
            }
            aVar.getClass();
            return new a(f, z, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0 && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + g8e.c(this.b, Boolean.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BubbleState(isVisible=");
            sb.append(this.a);
            sb.append(", availableDistance=");
            sb.append(this.b);
            sb.append(", message=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i) {
            this(0.0f, false, "");
        }
    }

    public e901(List list, List list2, int i, RoadObjectSettingsExperiment.TrafficLight trafficLight, a aVar) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = trafficLight;
        this.e = aVar;
    }

    public e901() {
        this(0);
    }
}
