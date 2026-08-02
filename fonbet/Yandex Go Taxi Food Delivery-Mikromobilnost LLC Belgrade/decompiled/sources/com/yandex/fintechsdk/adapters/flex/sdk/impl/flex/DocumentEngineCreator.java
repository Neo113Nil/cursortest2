package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex;

import defpackage.i3m;
import defpackage.i7x0;
import defpackage.jfe;
import defpackage.kyl;
import defpackage.l1o;
import defpackage.m0m;
import defpackage.mao;
import defpackage.ow50;
import defpackage.qxl;
import defpackage.ryh;
import defpackage.seu;
import defpackage.sjm0;
import defpackage.u6o;
import defpackage.yu;
import defpackage.yvf0;
import defpackage.z1o;
import flex.engine.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreator;", "Lyvf0;", "Lflex/engine/a;", "Lyu;", "actionDispatcherFactory", "Ljfe;", "contentControllerAdapterProvider", "Lm0m;", "documentLoader", "", "Li3m;", "documentTrackers", "Lu6o;", "errorControllerProvider", "Lsjm0;", "scaffoldControllerAdapterProvider", "<init>", "(Lyu;Lyvf0;Lm0m;Ljava/util/List;Lu6o;Lyvf0;)V", "get", "()Lflex/engine/a;", "Lyu;", "Lyvf0;", "Lm0m;", "Ljava/util/List;", "Lu6o;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentEngineCreator implements yvf0 {
    private final yu actionDispatcherFactory;
    private final yvf0 contentControllerAdapterProvider;
    private final m0m documentLoader;
    private final List<i3m> documentTrackers;
    private final u6o errorControllerProvider;
    private final yvf0 scaffoldControllerAdapterProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentEngineCreator(yu yuVar, yvf0 yvf0Var, m0m m0mVar, List<? extends i3m> list, u6o u6oVar, yvf0 yvf0Var2) {
        this.actionDispatcherFactory = yuVar;
        this.contentControllerAdapterProvider = yvf0Var;
        this.documentLoader = m0mVar;
        this.documentTrackers = list;
        this.errorControllerProvider = u6oVar;
        this.scaffoldControllerAdapterProvider = yvf0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mao get$lambda$0(l1o l1oVar) {
        return null;
    }

    @Override // defpackage.yvf0
    public a get() {
        yu yuVar = this.actionDispatcherFactory;
        jfe jfeVar = (jfe) this.contentControllerAdapterProvider.get();
        u6o u6oVar = this.errorControllerProvider;
        if (u6oVar == null) {
            u6oVar = new kyl(0);
        }
        u6o u6oVar2 = u6oVar;
        m0m m0mVar = this.documentLoader;
        ow50 ow50Var = new ow50();
        sjm0 sjm0Var = (sjm0) this.scaffoldControllerAdapterProvider.get();
        i7x0 i7x0Var = new i7x0();
        List<i3m> list = this.documentTrackers;
        seu seuVar = seu.A;
        qxl a = flex.engine.document.a.a();
        ryh ryhVar = new ryh(18, seuVar);
        z1o z1oVar = new z1o();
        EmptyList emptyList = EmptyList.a;
        return new a(m0mVar, yuVar, sjm0Var, jfeVar, i7x0Var, u6oVar2, seuVar, null, a, list, emptyList, null, emptyList, ryhVar, ow50Var, emptyList, z1oVar, null, 2097152);
    }
}
