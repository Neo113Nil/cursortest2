package xsna;

import com.vk.libvideo.design.compose.movie.poster.PosterCardState;
import xsna.r1k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class n74 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n74(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).intValue();
                p74.g(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, str, izsVar);
                break;
            case 1:
                ((Integer) obj2).getClass();
                tag.a((r1k0.a.AbstractC3589a) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                egi.c((gho0) this.d, (jai) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                q630 q630Var = (q630) this.d;
                gzs gzsVar = (gzs) this.e;
                ((Integer) obj2).getClass();
                f1n.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            default:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.movie.poster.a.a((PosterCardState.b) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
