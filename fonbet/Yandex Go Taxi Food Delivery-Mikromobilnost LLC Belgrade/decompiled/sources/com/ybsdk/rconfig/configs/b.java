package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import defpackage.dfr;
import defpackage.gw00;
import defpackage.tje;
import defpackage.uza;
import java.lang.reflect.ParameterizedType;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes9.dex */
public abstract class b {
    public static final dfr a;

    static {
        byte[] bArr = tje.R;
        byte[] bArr2 = new byte[24];
        for (int i = 0; i < 24; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        String str = new String(bArr2, uza.a);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, SamsungPayFeature.class);
        SamsungDefaultServices[] values = SamsungDefaultServices.values();
        int d = gw00.d(values.length);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (SamsungDefaultServices samsungDefaultServices : values) {
            Pair pair = new Pair(samsungDefaultServices.getPackageName(), samsungDefaultServices.getServiceId());
            linkedHashMap.put(pair.c(), pair.f());
        }
        a = new dfr(str, newParameterizedType, new CommonExperiment(new SamsungPayFeature(linkedHashMap, false), ExperimentApplyType.LATEST));
    }
}
