package xsna;

import com.vk.im.engine.ChannelSource;
import kotlin.NoWhenBranchMatchedException;
import xsna.qvm;

/* compiled from: DialogsSearchFeature.kt */
/* loaded from: classes18.dex */
public final class nvm extends di6<tvm, qvm, svm, ovm> {
    public final obb h;

    public nvm(nbb nbbVar) {
        super(new tvm());
        this.h = nbbVar;
    }

    @Override // xsna.di6
    public final void d(qvm qvmVar) {
        qvm qvmVar2 = qvmVar;
        boolean z = qvmVar2 instanceof qvm.a;
        obb obbVar = this.h;
        if (z) {
            qvm.a aVar = (qvm.a) qvmVar2;
            f(obbVar.b(aVar.b, aVar.c ? ChannelSource.RecommendationsPlus.c : ChannelSource.Plus.c), new pm1(this, 16), new dx3(this, 6));
        } else {
            if (!(qvmVar2 instanceof qvm.b)) {
                throw new NoWhenBranchMatchedException();
            }
            qvm.b bVar = (qvm.b) qvmVar2;
            long j = bVar.b;
            if (bVar.c) {
                ChannelSource.RecommendationsPlus recommendationsPlus = ChannelSource.RecommendationsPlus.c;
            } else {
                ChannelSource.Plus plus = ChannelSource.Plus.c;
            }
            f(obbVar.a(j), new p41(this, 16), new mvm(0, this, qvmVar2));
        }
    }
}
