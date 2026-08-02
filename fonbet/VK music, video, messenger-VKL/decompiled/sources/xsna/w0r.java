package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import xsna.n0x;
import xsna.qvq;
import xsna.qzn0;
import xsna.sx40;
import xsna.x0r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class w0r implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w0r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                InternalNpsQuestion internalNpsQuestion = (InternalNpsQuestion) this.c;
                n0x.b bVar = (n0x.b) this.d;
                InternalNpsQuestions internalNpsQuestions = bVar.a;
                x0r x0rVar = (x0r) this.e;
                qvq.g.b.a aVar = (qvq.g.b.a) this.f;
                io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.g;
                x0rVar.b.a(aVar.b, internalNpsQuestion != null ? new n0x.b(internalNpsQuestions, internalNpsQuestion) : new n0x.c(internalNpsQuestions, bVar.b));
                fVar.onNext(x0r.a.Success);
                break;
            default:
                rg50 rg50Var = (rg50) this.c;
                xtw xtwVar = (xtw) this.d;
                yvj yvjVar = (yvj) this.e;
                izs izsVar = (izs) this.f;
                h17 h17Var = (h17) this.g;
                rg50Var.C(xtwVar.a);
                myc0.h(yvjVar, null, null, new qzn0.b(h17Var, null), 3);
                izsVar.invoke(sx40.l0.b);
                break;
        }
        return s3q0.a;
    }
}
