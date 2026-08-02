package xsna;

import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import xsna.c8d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z7d implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z7d(Object obj, Object obj2, int i, int i2) {
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
                b8d.e((c8d.c) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ubk.a((zck) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ybo.j((cco) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                q630 q630Var = (q630) this.e;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                doi0.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 4:
                ((Integer) obj2).getClass();
                rok0.c((xow) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.datacontent.presets.b.e((VideoMetaViewState.DownloadStatus) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ z7d(q630 q630Var, izs izsVar, int i) {
        this.b = 3;
        this.e = q630Var;
        this.d = izsVar;
        this.c = i;
    }
}
