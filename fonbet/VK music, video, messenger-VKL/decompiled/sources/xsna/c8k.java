package xsna;

import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import xsna.b78;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class c8k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c8k(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                k8k.b((izs) this.d, (x9k) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((nbl) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                VideoPlaylistBottomSheetRedesign videoPlaylistBottomSheetRedesign = (VideoPlaylistBottomSheetRedesign) this.d;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                videoPlaylistBottomSheetRedesign.b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            default:
                ((Integer) obj2).getClass();
                x8u0.a((b78.a) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ c8k(izs izsVar, x9k x9kVar, int i) {
        this.b = 0;
        this.d = izsVar;
        this.e = x9kVar;
        this.c = i;
    }
}
