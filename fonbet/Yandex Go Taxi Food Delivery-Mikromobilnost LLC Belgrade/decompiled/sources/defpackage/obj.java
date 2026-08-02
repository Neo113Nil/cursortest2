package defpackage;

import kotlin.a;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final class obj {
    public static final /* synthetic */ kgx[] d = {new MutablePropertyReference1Impl("conditionsPackVersion", 0, "getConditionsPackVersion()I", obj.class), new MutablePropertyReference1Impl("dynamicPerformanceClassLastUpdateTime", 0, "getDynamicPerformanceClassLastUpdateTime()J", obj.class)};
    public final i3y a;
    public final qdx b;
    public final sme0 c;

    public obj(dne0 dne0Var) {
        this.a = a.a(new km(dne0Var, 1));
        cne0 b = b();
        this.b = new qdx(-1, b, b, "conditions_pack_version");
        cne0 b2 = b();
        this.c = new sme0(0, b2, b2, "dynamic_class_update_time");
    }

    public final ybj a() {
        int i = b().i("device_ram_mb", 0);
        int i2 = b().i("device_cpu_count", 0);
        int i3 = b().i("device_cpu_max_freq", 0);
        String l = b().l(MetaDataField.DEVICE_ID_FIELD, null);
        if (l == null) {
            l = "";
        }
        if (i == 0 || i2 == 0 || i3 == 0 || l.length() == 0) {
            return null;
        }
        return new ybj(i, i2, i3, l);
    }

    public final cne0 b() {
        return (cne0) this.a.getValue();
    }

    public final void c(ybj ybjVar) {
        if (ybjVar == null) {
            return;
        }
        b().p(ybjVar.a, "device_ram_mb");
        b().p(ybjVar.b, "device_cpu_count");
        b().p(ybjVar.c, "device_cpu_max_freq");
        b().r(MetaDataField.DEVICE_ID_FIELD, ybjVar.d);
    }
}
