package xsna;

import android.view.LayoutInflater;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.search.MovieSearchSuggestionVh;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDayBlockViewKt;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import xsna.me70;
import xsna.pox0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ke4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((le4) this.c).a((qe4) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                BookingCalendarDayBlockViewKt.c((mtk0) this.c, (xvy) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                u0o.a((v0o) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                g3x.d((wh50) this.c, (wh50) this.d, (androidx.compose.runtime.a) obj, ne7.I(55));
                break;
            case 4:
                MovieSearchSuggestionVh movieSearchSuggestionVh = (MovieSearchSuggestionVh) this.c;
                LayoutInflater layoutInflater = (LayoutInflater) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1214695602, intValue, -1, "com.vk.catalog2.common.ui.holders.search.MovieSearchSuggestionVh.createView.<anonymous>.<anonymous> (MovieSearchSuggestionVh.kt:70)");
                    }
                    jf30 jf30Var = (jf30) ((zak0) movieSearchSuggestionVh.c).getValue();
                    if (jf30Var == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        rrv0.d(null, null, null, null, kai.c(-799731725, new w2k(movieSearchSuggestionVh, layoutInflater, jf30Var, 4), aVar), aVar, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar.h();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ue70.d((me70.g) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                e2b0 e2b0Var = (e2b0) this.c;
                agk agkVar = (agk) this.d;
                String str = (String) obj;
                e2b0Var.t = ((PlaybackLaunchMeta) obj2).b;
                e2b0Var.h.post(new dxt(5, e2b0Var, str));
                e2b0Var.d0();
                agkVar.invoke(str);
                break;
            case 7:
                com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d dVar = (com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d) this.c;
                hxh0 hxh0Var = (hxh0) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(128913894, intValue2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.SearchPlaylistViewHolder.createView.<anonymous>.<anonymous>.<anonymous> (SearchPlaylistViewHolder.kt:99)");
                    }
                    com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.c.f(dVar, hxh0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mnx0.i((pox0.e) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ke4(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
