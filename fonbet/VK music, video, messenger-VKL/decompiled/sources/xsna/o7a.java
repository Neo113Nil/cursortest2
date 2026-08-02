package xsna;

import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.n7a;
import xsna.p7a;
import xsna.r7a;

/* compiled from: CatalogInternalNpsFeature.kt */
/* loaded from: classes16.dex */
public final class o7a extends wk50<w7a, r7a, n7a, p7a> {
    public final ljx f;

    public o7a(NpsFeatureModel npsFeatureModel, QuestionsTexts questionsTexts, ljx ljxVar) {
        super(new n7a.b(npsFeatureModel, questionsTexts), new q7a(r7a.c.b));
        this.f = ljxVar;
    }

    @Override // xsna.wk50
    public final void N(r7a r7aVar, n7a n7aVar) {
        io.reactivex.rxjava3.core.a aVar;
        r7a r7aVar2 = r7aVar;
        n7a n7aVar2 = n7aVar;
        if (n7aVar2 instanceof n7a.b) {
            n7a.b bVar = (n7a.b) n7aVar2;
            T(new p7a.b(bVar.b, bVar.c));
            return;
        }
        if (n7aVar2 instanceof n7a.a) {
            T(p7a.a.b);
            return;
        }
        boolean z = n7aVar2 instanceof n7a.d;
        ljx ljxVar = this.f;
        if (!z) {
            if (!(n7aVar2 instanceof n7a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (r7aVar2 instanceof r7a.a) {
                ljxVar.a.remove(((r7a.a) r7aVar2).b.b);
                return;
            }
            return;
        }
        if (r7aVar2 instanceof r7a.a) {
            String str = ((r7a.a) r7aVar2).b.b;
            if (ljxVar.a.add(str)) {
                tfx tfxVar = new tfx("feedbacks.skip", new eq0(13), new k73(14));
                tfx.o(tfxVar, "block_id", str, 0, 0, 12);
                dz2 x = yfb.x(tfxVar);
                x.n = true;
                x.q = Integer.MAX_VALUE;
                aVar = new io.reactivex.rxjava3.internal.operators.completable.v(rsg0.Z(x), io.reactivex.rxjava3.internal.functions.a.g);
            } else {
                aVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
            }
            a7f0.a.d(this, aVar, null, null, new defpackage.g(this, 15), 3);
        }
    }
}
