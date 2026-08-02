package com.yandex.go.scooters.data_form.data;

import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;
import com.yandex.go.scooters.data_form.data.actions.ScootersSubmitUserPdDataAction;
import defpackage.d0n0;
import defpackage.eci0;
import defpackage.jcn0;
import defpackage.mu;
import defpackage.o0n0;
import defpackage.qoi0;
import defpackage.tls;
import defpackage.wzl0;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class b {
    public final jcn0 a;

    static {
        int i = jcn0.b;
    }

    public b(jcn0 jcn0Var) {
        this.a = jcn0Var;
    }

    public final o0n0 a(eci0 eci0Var, tls tlsVar) {
        return new o0n0(new d0n0("bdui/v1/user-pd-data/v1/form", "ScootersDataForm", ScootersBduiScreenType.FULLSCREEN, null, null), eci0Var, Collections.singletonList(new mu("submit_user_pd_data", qoi0.a(ScootersSubmitUserPdDataAction.class), new ScootersDataFormScreenConfigFactory$create$1(0, ScootersSubmitUserPdDataAction.Companion, com.yandex.go.scooters.data_form.data.actions.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new wzl0(18, tlsVar)), EmptyList.a, false)), this.a.a.a);
    }
}
