package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.ecomm.market.good.ui.j;
import com.vk.video.playlist.playlistscreen.ui.view.PlaylistButtonsStyle;
import xsna.jto0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class d9c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d9c(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                e9c.a((c9c) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.e | 1);
                f9o.a(this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, I);
                break;
            case 2:
                ((Integer) obj2).getClass();
                u7b0.f((w7b0) this.f, (PlaylistButtonsStyle) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((com.vk.ecomm.market.good.ui.j) this.f).i((hid0) this.c, (j.a) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.f1) this.f).c((q630) this.d, (Cell$Middle.Size) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((jto0) this.f).f((jto0.b) this.c, (i0b0) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ d9c(int i, int i2, Object obj, Object obj2, Object obj3, boolean z) {
        this.b = i2;
        this.f = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = i;
    }
}
