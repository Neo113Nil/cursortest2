package xsna;

import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.libvideo.adfree.impl.ui.entity.BottomSheetViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import java.util.List;
import xsna.py20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class w78 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w78(int i, int i2, List list, izs izsVar) {
        this.b = 1;
        this.e = list;
        this.c = i;
        this.d = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                z78.b((BottomSheetViewState) this.e, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                List list = (List) this.e;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                z8u.b(this.c, I, (androidx.compose.runtime.a) obj, list, izsVar);
                break;
            case 2:
                ((Integer) obj2).getClass();
                py20.b.a((q630) this.e, (py20) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.j((PreviewViewState.h) this.e, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((vjg0) this.e).e((yzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                tfj0.a((ShortVideoListView.e) this.e, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((clm0) this.e).S0((gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ w78(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.d = obj2;
        this.c = i;
    }
}
