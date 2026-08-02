package com.yandex.plus.home.internal.di;

import defpackage.ol5;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class DataModule$panelRepository$2$2 extends FunctionReferenceImpl implements sls {
    public DataModule$panelRepository$2$2(Object obj) {
        super(0, obj, ol5.class, "createHeavyPanelDataFetchingBenchmark", "createHeavyPanelDataFetchingBenchmark()Lcom/yandex/plus/core/benchmark/DataFetchingBenchmark;", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return ((ol5) this.receiver).a.e("Panel.Heavy.DataLoading", "Panel.DataParsing");
    }
}
