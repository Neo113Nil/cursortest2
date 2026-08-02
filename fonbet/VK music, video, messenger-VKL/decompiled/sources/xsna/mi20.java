package xsna;

import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Device;
import android.health.connect.datatypes.Metadata;
import java.time.Instant;

/* compiled from: MetadataConverters.kt */
/* loaded from: classes12.dex */
public final class mi20 {
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    public static final Metadata a(hi20 hi20Var) {
        DataOrigin build;
        Metadata build2;
        Device.Builder type;
        Device build3;
        Device.Builder type2;
        Metadata.Builder c = n91.c();
        u5m u5mVar = hi20Var.g;
        if (u5mVar != null) {
            Device.Builder f = m91.f();
            String str = u5mVar.b;
            if (str != null) {
                f.setManufacturer(str);
            }
            String str2 = u5mVar.c;
            if (str2 != null) {
                f.setModel(str2);
            }
            try {
                Integer num = (Integer) v8x.O.get(Integer.valueOf(u5mVar.a));
                type2 = f.setType(num != null ? num.intValue() : 0);
                build3 = type2.build();
            } catch (IllegalArgumentException unused) {
                Integer num2 = (Integer) v8x.O.get(0);
                type = f.setType(num2 != null ? num2.intValue() : 0);
                build3 = type.build();
            }
            if (build3 != null) {
                c.setDevice(build3);
            }
        }
        c.setLastModifiedTime(hi20Var.d);
        c.setId(hi20Var.b);
        luk lukVar = hi20Var.c;
        DataOrigin.Builder e = l91.e();
        e.setPackageName(lukVar.a);
        build = e.build();
        c.setDataOrigin(build);
        c.setClientRecordId(hi20Var.e);
        c.setClientRecordVersion(hi20Var.f);
        Integer num3 = (Integer) v8x.L.get(Integer.valueOf(hi20Var.a));
        c.setRecordingMethod(num3 != null ? num3.intValue() : 0);
        build2 = c.build();
        return build2;
    }

    public static final hi20 b(Metadata metadata) {
        String id;
        DataOrigin dataOrigin;
        String packageName;
        Instant lastModifiedTime;
        String clientRecordId;
        long clientRecordVersion;
        int recordingMethod;
        Device device;
        Device build;
        String manufacturer;
        String model;
        int type;
        u5m u5mVar;
        id = metadata.getId();
        dataOrigin = metadata.getDataOrigin();
        packageName = dataOrigin.getPackageName();
        luk lukVar = new luk(packageName);
        lastModifiedTime = metadata.getLastModifiedTime();
        clientRecordId = metadata.getClientRecordId();
        clientRecordVersion = metadata.getClientRecordVersion();
        recordingMethod = metadata.getRecordingMethod();
        Integer num = (Integer) v8x.Q.get(Integer.valueOf(recordingMethod));
        int intValue = num != null ? num.intValue() : 0;
        device = metadata.getDevice();
        build = m91.f().build();
        if (device.equals(build)) {
            u5mVar = null;
        } else {
            manufacturer = device.getManufacturer();
            model = device.getModel();
            type = device.getType();
            Integer num2 = (Integer) v8x.P.get(Integer.valueOf(type));
            u5mVar = new u5m(num2 != null ? num2.intValue() : 0, manufacturer, model);
        }
        return new hi20(intValue, id, lukVar, lastModifiedTime, clientRecordId, clientRecordVersion, u5mVar);
    }
}
