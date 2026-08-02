package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import defpackage.dfr;
import defpackage.eqp0;
import defpackage.tje;
import defpackage.uza;
import java.lang.reflect.ParameterizedType;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class g {
    public static final dfr a;

    static {
        byte[] bArr = tje.j;
        byte[] bArr2 = new byte[19];
        for (int i = 0; i < 19; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        String str = new String(bArr2, uza.a);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, YbSdkRtmConfig.class);
        eqp0 eqp0Var = eqp0.i;
        a = new dfr(str, newParameterizedType, new CommonExperiment(new YbSdkRtmConfig(eqp0Var.a, eqp0Var.b, EmptyList.a, null, null, null, null, null), ExperimentApplyType.LATEST));
    }
}
