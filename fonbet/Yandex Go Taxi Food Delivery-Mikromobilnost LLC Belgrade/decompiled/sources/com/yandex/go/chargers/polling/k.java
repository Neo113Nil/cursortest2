package com.yandex.go.chargers.polling;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.chargers.utils.ChargersPreferencesExtensionsKt$listenKeyState$$inlined$simpleCallbackApiToFlow$1;
import com.yandex.go.chargers.utils.ChargersPreferencesExtensionsKt$listenStringSet$$inlined$start$1;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.c06;
import defpackage.cne0;
import defpackage.e2e0;
import defpackage.hbp0;
import defpackage.hna;
import defpackage.mdh;
import defpackage.mth;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u2a;
import defpackage.uyj;
import defpackage.ysa;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class k implements e2e0, u2a {
    public final Lifecycle a;
    public final tt2 b;
    public final Set c;
    public final r0 d = bvf0.c(kotlin.collections.b.f());
    public final hbp0 e;
    public final c06 f;

    /* JADX WARN: Multi-variable type inference failed */
    public k(ysa ysaVar, Lifecycle lifecycle, tt2 tt2Var, Set set) {
        this.a = lifecycle;
        this.b = tt2Var;
        this.c = set;
        this.e = new hbp0(new ChargersPollingInteractorImpl$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
        this.f = new c06(tt2Var, ysaVar);
    }

    @Override // defpackage.u2a
    public final void a() {
        hbp0 hbp0Var = this.e;
        hbp0Var.a();
        c06 c06Var = this.f;
        cne0 cne0Var = ((ysa) c06Var.b).b;
        int i = 6;
        tpr d = com.yandex.go.coroutines.b.d(new mth(kotlinx.coroutines.flow.e.g(new ChargersPreferencesExtensionsKt$listenKeyState$$inlined$simpleCallbackApiToFlow$1(new hna(cne0Var, 0), null)), i), new ChargersPreferencesExtensionsKt$listenStringSet$$inlined$start$1(null, cne0Var, "polling_execution_ids"));
        ((tt2) c06Var.a).getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, null, null, new ChargersPollingInteractorImpl$listenLaunchedPolls$$inlined$collectIn$1(new d(new f(new mth(new j0(null, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.F(d, mdh.b)), new ChargersPollingInteractorImpl$listenLaunchedPolls$$inlined$withPreviousEmit$1(3, null)), i), this)), null, this), 3);
    }

    @Override // defpackage.e2e0
    public final boolean c(String str) {
        return ((Map) this.d.getValue()).containsKey(str);
    }

    @Override // defpackage.e2e0
    public final void d(String str, String str2) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        hbp0.e(this.e, mdh.b, null, new ChargersPollingInteractorImpl$launchPolling$1(this, str, str2, null), 2);
    }

    @Override // defpackage.e2e0
    public final kotlinx.coroutines.flow.internal.g f(String str) {
        return kotlinx.coroutines.flow.e.X(this.d, new ChargersPollingInteractorImpl$listenPolling$$inlined$flatMapLatest$1(b64.j(str, ":"), null));
    }

    @Override // defpackage.u2a
    public final void onDetach() {
        ysa ysaVar = (ysa) this.f.b;
        ysaVar.d.setValue(ysaVar, ysa.e[1], EmptySet.a);
        this.e.b();
    }
}
