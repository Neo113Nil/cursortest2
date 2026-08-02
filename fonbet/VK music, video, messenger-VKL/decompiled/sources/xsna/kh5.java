package xsna;

import android.content.Context;
import com.vk.video.ui.upload.api.router.PublishArguments;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import xsna.t3s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class kh5 implements wb0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kh5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.b;
        return invoke((sj50) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wb0
    /* renamed from: j */
    public final qj50 invoke(sj50 sj50Var) {
        switch (this.b) {
            case 0:
                return new qps0((t3s0.a) this.c, sj50Var);
            case 1:
                return new com.vk.ecomm.orders.impl.orderlist.presentation.mvi.a(sj50Var, (kw00) this.c);
            default:
                PublishFragmentInternalComponent publishFragmentInternalComponent = (PublishFragmentInternalComponent) this.c;
                Context context = publishFragmentInternalComponent.c.a;
                PublishArguments publishArguments = publishFragmentInternalComponent.a.a;
                nwy nwyVar = publishFragmentInternalComponent.n;
                qcy<Object>[] qcyVarArr = PublishFragmentInternalComponent.w;
                qcy<Object> qcyVar = qcyVarArr[5];
                dot0 E = ((g7s0) nwyVar.c()).E();
                nwy nwyVar2 = publishFragmentInternalComponent.i;
                qcy<Object> qcyVar2 = qcyVarArr[0];
                fks0 fks0Var = (fks0) nwyVar2.c();
                nwy nwyVar3 = publishFragmentInternalComponent.u;
                qcy<Object> qcyVar3 = qcyVarArr[12];
                com.vk.core.utils.newtork.b bVar = (com.vk.core.utils.newtork.b) nwyVar3.c();
                b25 s = publishFragmentInternalComponent.d.s();
                com.vk.video.channel.common.di.b nf = publishFragmentInternalComponent.e.nf();
                nwy nwyVar4 = publishFragmentInternalComponent.t;
                qcy<Object> qcyVar4 = qcyVarArr[11];
                ice0 ice0Var = (ice0) nwyVar4.c();
                nwy nwyVar5 = publishFragmentInternalComponent.s;
                qcy<Object> qcyVar5 = qcyVarArr[10];
                return new gce0(context, publishArguments, ice0Var, (cn1) nwyVar5.c(), E, fks0Var, bVar, s, nf, publishFragmentInternalComponent.f.getExperiments(), publishFragmentInternalComponent.g, sj50Var);
        }
    }
}
