package xsna;

import com.vk.community.design.view.components.compose.b;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class g7c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g7c(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                l7c.i((xw80) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((b.a) this.e).a((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                q750.a((izs) this.e, (MusicPlayerInformerViewState.a) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.C((PreviewViewState.v) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((TopBar$Middle.Cell) this.e).a((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ g7c(izs izsVar, MusicPlayerInformerViewState.a aVar, int i) {
        this.b = 2;
        this.e = izsVar;
        this.c = aVar;
        this.d = i;
    }
}
