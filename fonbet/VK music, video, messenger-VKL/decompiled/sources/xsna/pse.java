package xsna;

import com.vk.music.informer.mvi.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pse implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ pse(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke((tho0) obj);
                break;
            case 1:
                this.c.invoke(new oqx(((tho0) obj).a.c));
                break;
            default:
                this.c.invoke(new e.c((String) obj));
                break;
        }
        return s3q0.a;
    }
}
