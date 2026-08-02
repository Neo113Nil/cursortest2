package xsna;

import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import xsna.fs70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ns70 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ns70(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = q630Var;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                os70.b((fs70.b) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.d((PreviewViewState.a) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.datacontent.presets.b.a((VideoMetaViewState.a) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ns70(fs70.b bVar, izs izsVar, int i) {
        this.b = 0;
        this.d = bVar;
        this.e = izsVar;
        this.c = i;
    }
}
