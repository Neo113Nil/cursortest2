package xsna;

import com.vk.libvideo.upload.impl.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dk40 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ dk40(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((xys) this.c).invoke(obj);
                break;
            case 1:
                ((ob60) this.c).invoke(obj);
                break;
            case 2:
                ((xys) this.c).invoke(obj);
                break;
            default:
                ((a.C1254a) this.c).invoke(obj);
                break;
        }
    }
}
