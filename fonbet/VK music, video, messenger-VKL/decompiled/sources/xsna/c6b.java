package xsna;

import com.vk.im.engine.models.messages.Msg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c6b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ c6b(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                xgl0 xgl0Var = (xgl0) obj;
                g2b g2bVar = xgl0Var.y().b;
                int i = this.c;
                Msg e = g2bVar.e(i);
                return e == null ? xgl0Var.e().b.e(i) : e;
            case 1:
                return new tfu(n34.a(this.c));
            default:
                qgi0.v((tgi0) obj, this.c + 1.0f);
                return s3q0.a;
        }
    }
}
