package xsna;

import com.vk.im.channelcreation.impl.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zwa implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zwa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [xsna.dqb$a, xsna.j8i] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((com.vk.im.channelcreation.impl.b) this.c).n(i.a.a);
                break;
            case 1:
                dqb dqbVar = (dqb) this.c;
                dqbVar.g = null;
                dqbVar.c.w();
                break;
            case 2:
                ((scl) this.c).k = false;
                break;
            default:
                ((ndn) this.c).p.b(null);
                break;
        }
    }
}
