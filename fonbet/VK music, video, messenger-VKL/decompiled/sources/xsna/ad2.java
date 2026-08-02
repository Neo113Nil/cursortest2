package xsna;

import com.vk.libvideo.design.compose.movie.poster.PosterCardState;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ad2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ad2(Object obj, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.e = xzsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                dd2.b((q630) this.c, (jai) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                mmc.a((nmc) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1), this.d);
                break;
            case 2:
                q630 q630Var = (q630) this.c;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).getClass();
                ojj.c(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.movie.poster.a.c((PosterCardState) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.a.a((ArrayList) this.c, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ad2(Object obj, q630 q630Var, int i, int i2, int i3) {
        this.b = i3;
        this.e = obj;
        this.c = q630Var;
        this.d = i2;
    }
}
