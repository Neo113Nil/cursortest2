package xsna;

import com.vk.fullscreenvideo.ControlsState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class m8p0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xzs f;
    public final /* synthetic */ xzs g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m8p0(int i, ControlsState.b bVar, rqj rqjVar, izs izsVar, izs izsVar2, q630 q630Var) {
        this.d = bVar;
        this.e = rqjVar;
        this.f = izsVar;
        this.h = q630Var;
        this.g = izsVar2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ControlsState.b bVar = (ControlsState.b) this.d;
                rqj rqjVar = (rqj) this.e;
                izs izsVar = (izs) this.f;
                q630 q630Var = (q630) this.h;
                izs izsVar2 = (izs) this.g;
                ((Integer) obj2).getClass();
                p8p0.i(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, bVar, rqjVar, izsVar, izsVar2, q630Var);
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                phv0.a(this.c, (wzs) this.d, (jai) this.e, (wzs) this.f, (wzs) this.g, (wzs) this.h, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ m8p0(int i, wzs wzsVar, jai jaiVar, wzs wzsVar2, wzs wzsVar3, wzs wzsVar4, int i2) {
        this.c = i;
        this.d = wzsVar;
        this.e = jaiVar;
        this.f = wzsVar2;
        this.g = wzsVar3;
        this.h = wzsVar4;
    }
}
