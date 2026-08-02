package xsna;

import java.io.File;
import java.util.List;
import xsna.m7a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class uva implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uva(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.d;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                bVar.n.remove(Integer.valueOf(this.c));
                break;
            case 1:
                com.vk.photos.root.common.b bVar2 = (com.vk.photos.root.common.b) this.d;
                List list = (List) obj;
                bVar2.b.a(new m7a0.b(list));
                bVar2.b.a(new m7a0.a(this.c, list));
                bVar2.c.g();
                break;
            case 2:
                ((dqn0) this.d).f(this.c, (File) obj);
                break;
            case 3:
                ((mov0) this.d).g.put(Integer.valueOf(this.c), Boolean.TRUE);
                break;
            default:
                b9w0 b9w0Var = ((dbw0) this.d).i;
                if (b9w0Var == null) {
                    b9w0Var = null;
                }
                b9w0Var.b(this.c);
                break;
        }
        return s3q0.a;
    }
}
