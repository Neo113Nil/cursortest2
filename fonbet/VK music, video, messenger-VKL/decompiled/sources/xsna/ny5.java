package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ny5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ny5(PreviewViewState.l lVar, int i) {
        this.b = 3;
        this.d = lVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((qy5) this.d).b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((noa) this.d).b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                ((Integer) obj2).intValue();
                b940.f((izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.n((PreviewViewState.l) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                hol0.c((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ny5(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
