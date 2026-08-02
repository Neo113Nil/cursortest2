package com.yandex.go.superapp.searchbar.impl.domain;

import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment;
import defpackage.d6z;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SuperappSearchbarConfigurationRepositoryImpl$toConfiguration$8$1 extends FunctionReferenceImpl implements tls {
    public SuperappSearchbarConfigurationRepositoryImpl$toConfiguration$8$1(SuperappSearchbarExperiment superappSearchbarExperiment) {
        super(1, superappSearchbarExperiment, d6z.class, "textByKey", "textByKey(Lru/yandex/taxi/common_models/net/LocalizedExperiment;Ljava/lang/String;)Ljava/lang/String;", 1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return d6z.Y((SuperappSearchbarExperiment) this.receiver, (String) obj);
    }
}
