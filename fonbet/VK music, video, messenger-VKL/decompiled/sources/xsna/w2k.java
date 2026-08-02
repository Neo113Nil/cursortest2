package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.ui.holders.search.MovieSearchSuggestionVh;
import xsna.jpl0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class w2k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w2k(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                c3k.a((m3k) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.a) this.d).g((xow) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((cou) this.d).i((eou) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                String str = (String) this.d;
                String str2 = (String) this.c;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                md10.a(ne7.I(1), (androidx.compose.runtime.a) obj, str, str2, q630Var);
                break;
            case 4:
                MovieSearchSuggestionVh movieSearchSuggestionVh = (MovieSearchSuggestionVh) this.d;
                LayoutInflater layoutInflater = (LayoutInflater) this.c;
                jf30 jf30Var = (jf30) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-799731725, intValue, -1, "com.vk.catalog2.common.ui.holders.search.MovieSearchSuggestionVh.createView.<anonymous>.<anonymous>.<anonymous> (MovieSearchSuggestionVh.kt:72)");
                    }
                    q630 f = txj0.f(q630.a.a, 1.0f);
                    boolean J = aVar.J(movieSearchSuggestionVh) | aVar.y(layoutInflater) | aVar.J(jf30Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new com.vk.movika.sdk.base.logic.interactor.c(movieSearchSuggestionVh, layoutInflater, jf30Var);
                        aVar.R(x);
                    }
                    com.vk.catalog2.common.ui.holders.search.a.a(jf30Var, ojc.c(f, false, null, null, (gzs) x, 15), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 5:
                hv70 hv70Var = (hv70) this.d;
                izs izsVar = (izs) this.c;
                wh50 wh50Var = (wh50) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1821544649, intValue2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.OfflinePodcastEpisodesScreen.<anonymous> (OfflinePodcastEpisodesMviComposeComponent.kt:128)");
                    }
                    Object x2 = aVar2.x();
                    if (x2 == a.C0011a.a) {
                        x2 = new ymi(3, wh50Var);
                        aVar2.R(x2);
                    }
                    cv70.i(hv70Var, izsVar, (gzs) x2, aVar2, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((f7j0) this.d).g((t9j0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 7:
                ((Integer) obj2).getClass();
                lll0.a((jpl0.a.d) this.d, (gzs) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 8:
                q630 q630Var2 = (q630) this.e;
                gzs gzsVar = (gzs) this.d;
                gzs gzsVar2 = (gzs) this.c;
                ((Integer) obj2).getClass();
                vro0.a(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, gzsVar2, q630Var2);
                break;
            case 9:
                ((Integer) obj2).getClass();
                sbq0.d((bdq0) this.d, (gzs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((w6s0) this.d).a((Activity) this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ w2k(int i, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        this.b = 8;
        this.e = q630Var;
        this.d = gzsVar;
        this.c = gzsVar2;
    }

    public /* synthetic */ w2k(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ w2k(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }
}
