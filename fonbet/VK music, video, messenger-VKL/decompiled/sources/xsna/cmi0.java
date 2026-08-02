package xsna;

import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.prm0;

/* compiled from: SerialDescriptors.kt */
/* loaded from: classes8.dex */
public final class cmi0 {
    public static final mbd0 a(String str, gbd0 gbd0Var) {
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((kotlin.collections.builders.c) pbd0.a.values()).iterator();
        while (((MapBuilder.d) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((MapBuilder.f) it).next();
            if (str.equals(kSerializer.getDescriptor().f())) {
                StringBuilder a = t33.a("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                a.append(fpf0.a(kSerializer.getClass()).l());
                a.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(xqm0.g(a.toString()));
            }
        }
        return new mbd0(str, gbd0Var);
    }

    public static final zli0 b(String str, gmi0 gmi0Var, SerialDescriptor[] serialDescriptorArr, izs izsVar) {
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (gmi0Var.equals(prm0.a.a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        sfc sfcVar = new sfc(str);
        izsVar.invoke(sfcVar);
        return new zli0(str, gmi0Var, sfcVar.c.size(), rl3.u0(serialDescriptorArr), sfcVar);
    }

    public static zli0 c(String str, gmi0 gmi0Var, SerialDescriptor[] serialDescriptorArr) {
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (gmi0Var.equals(prm0.a.a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        sfc sfcVar = new sfc(str);
        s3q0 s3q0Var = s3q0.a;
        return new zli0(str, gmi0Var, sfcVar.c.size(), rl3.u0(serialDescriptorArr), sfcVar);
    }
}
