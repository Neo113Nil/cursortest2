package xsna;

import com.vk.log.L;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rva implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rva(Object obj, int i, int i2) {
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
                bVar.m.add(Integer.valueOf(this.c));
                break;
            case 1:
                ((ogs0) this.d).invoke(new rbt0(this.c, 50, 0, 32, EmptyList.b));
                break;
            default:
                Throwable th = (Throwable) obj;
                ((com.vk.libvideo.upload.impl.b) this.d).i(this.c, th, false);
                L.i(th);
                break;
        }
        return s3q0.a;
    }
}
