package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import just.adapter.scroll.experimental.OptimizedPaginationTriggerFeatureConfig;
import kotlin.collections.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class hzp0 implements KSerializer {
    public static final hzp0 a = new hzp0();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = d0q0.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        if (r11 == null) goto L56;
     */
    @Override // defpackage.myi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(Decoder decoder) {
        OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig;
        xyp0 xyp0Var;
        LinkedHashMap linkedHashMap;
        wzp0 wzp0Var;
        wzp0 wzp0Var2;
        wzp0 wzp0Var3;
        zzp0 zzp0Var;
        Boolean bool;
        Boolean bool2;
        d0q0 d0q0Var = (d0q0) decoder.B(b);
        c0q0 c0q0Var = d0q0Var.a;
        boolean z = true;
        boolean booleanValue = (c0q0Var == null || (bool2 = c0q0Var.a) == null) ? true : bool2.booleanValue();
        if (c0q0Var != null && (bool = c0q0Var.b) != null) {
            z = bool.booleanValue();
        }
        boolean z2 = booleanValue;
        bzp0 bzp0Var = new bzp0((c0q0Var == null || (zzp0Var = c0q0Var.c) == null) ? null : zzp0Var.a);
        Boolean bool3 = c0q0Var != null ? c0q0Var.d : null;
        azp0 azp0Var = new azp0((c0q0Var == null || (wzp0Var3 = c0q0Var.e) == null) ? null : wzp0Var3.a, (c0q0Var == null || (wzp0Var2 = c0q0Var.e) == null) ? null : wzp0Var2.b, (c0q0Var == null || (wzp0Var = c0q0Var.e) == null) ? null : wzp0Var.c);
        Boolean bool4 = c0q0Var != null ? c0q0Var.f : null;
        Boolean bool5 = c0q0Var != null ? c0q0Var.g : null;
        if (c0q0Var != null) {
            optimizedPaginationTriggerFeatureConfig = c0q0Var.i;
            if (optimizedPaginationTriggerFeatureConfig == null) {
                optimizedPaginationTriggerFeatureConfig = jl40.l(c0q0Var.h, Boolean.TRUE) ? OptimizedPaginationTriggerFeatureConfig.ENABLED_AUTOMATIC_TRIGGER : OptimizedPaginationTriggerFeatureConfig.DISABLED;
            }
        }
        optimizedPaginationTriggerFeatureConfig = OptimizedPaginationTriggerFeatureConfig.DISABLED;
        czp0 czp0Var = new czp0(z2, z, bzp0Var, bool3, azp0Var, bool4, bool5, optimizedPaginationTriggerFeatureConfig);
        List list = d0q0Var.b;
        String str = d0q0Var.c;
        mzp0 mzp0Var = d0q0Var.d;
        if (mzp0Var != null) {
            kr krVar = mzp0Var.a;
            kr krVar2 = mzp0Var.c;
            kr krVar3 = mzp0Var.d;
            kr krVar4 = mzp0Var.e;
            kr krVar5 = mzp0Var.f;
            List list2 = mzp0Var.g;
            if (list2 != null) {
                List list3 = list2;
                int d = gw00.d(tcc.n(list3, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                for (Object obj : list3) {
                    linkedHashMap2.put(((j2q0) obj).b(), obj);
                }
                linkedHashMap = linkedHashMap2;
            } else {
                linkedHashMap = null;
            }
            xyp0Var = new xyp0(krVar, krVar2, krVar3, krVar4, krVar5, linkedHashMap, 2);
        } else {
            xyp0Var = null;
        }
        pzp0 pzp0Var = d0q0Var.e;
        yyp0 yyp0Var = pzp0Var != null ? new yyp0(pzp0Var.a, pzp0Var.b) : null;
        tzp0 tzp0Var = d0q0Var.f;
        return new dzp0(czp0Var, list, str, xyp0Var, yyp0Var, tzp0Var != null ? new zyp0(tzp0Var.a, tzp0Var.b) : null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mzp0 mzp0Var;
        Collection values;
        dzp0 dzp0Var = (dzp0) obj;
        Boolean valueOf = Boolean.valueOf(dzp0Var.a.a);
        czp0 czp0Var = dzp0Var.a;
        Boolean valueOf2 = Boolean.valueOf(czp0Var.b);
        zzp0 zzp0Var = new zzp0(czp0Var.c.a);
        Boolean bool = czp0Var.d;
        azp0 azp0Var = czp0Var.e;
        c0q0 c0q0Var = new c0q0(valueOf, valueOf2, zzp0Var, bool, new wzp0(azp0Var != null ? azp0Var.a : null, azp0Var != null ? azp0Var.b : null, azp0Var != null ? azp0Var.c : null), czp0Var.f, czp0Var.g, czp0Var.h);
        List list = dzp0Var.b;
        String str = dzp0Var.c;
        xyp0 xyp0Var = dzp0Var.d;
        if (xyp0Var != null) {
            kr krVar = xyp0Var.a;
            kr krVar2 = xyp0Var.b;
            kr krVar3 = xyp0Var.c;
            kr krVar4 = xyp0Var.d;
            kr krVar5 = xyp0Var.e;
            kr krVar6 = xyp0Var.f;
            Map map = xyp0Var.g;
            mzp0Var = new mzp0(krVar, krVar2, krVar3, krVar4, krVar5, krVar6, (map == null || (values = map.values()) == null) ? null : a.J0(values));
        } else {
            mzp0Var = null;
        }
        yyp0 yyp0Var = dzp0Var.e;
        pzp0 pzp0Var = yyp0Var != null ? new pzp0(yyp0Var.a, yyp0Var.b) : null;
        zyp0 zyp0Var = dzp0Var.f;
        encoder.j(new d0q0(c0q0Var, list, str, mzp0Var, pzp0Var, zyp0Var != null ? new tzp0(zyp0Var.a, zyp0Var.b) : null), b);
    }
}
