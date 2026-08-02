package xsna;

import android.content.Context;
import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.impl.HorizontalButtonsWithScrollView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.player.PlayerTrack;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import java.util.ArrayList;
import xsna.c7g0;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zgo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zgo(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.x vVar;
        switch (this.b) {
            case 0:
                ep10 ep10Var = (ep10) this.c;
                aho ahoVar = (aho) this.d;
                tra0 tra0Var = (tra0) this.e;
                tra0.a aVar = (tra0.a) obj;
                float c = ep10Var.z1() ? ahoVar.p.e().c(ahoVar.p.g.getValue()) : ahoVar.p.g();
                Orientation orientation = ahoVar.r;
                float f = orientation == Orientation.Horizontal ? c : 0.0f;
                if (orientation != Orientation.Vertical) {
                    c = 0.0f;
                }
                aVar.q(tra0Var, an10.b(f), an10.b(c), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 1:
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) this.c;
                NewsEntry newsEntry = (NewsEntry) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                com.vk.newsfeed.common.util.j.h(entriesListPresenter.A, newsEntry, entriesListPresenter.b.M0(), entriesListPresenter.getRef(), entriesListPresenter.a(), arrayList, (jzf0) obj, 64);
                return arrayList;
            case 2:
                izs izsVar = (izs) this.c;
                HorizontalButtonsWithScrollView.d dVar = (HorizontalButtonsWithScrollView.d) this.d;
                HorizontalButtonsWithScrollView.d.a aVar2 = (HorizontalButtonsWithScrollView.d.a) this.e;
                ((Boolean) obj).getClass();
                izsVar.invoke(new HorizontalButtonsWithScrollView.a.b(dVar.b, aVar2.b));
                return s3q0.a;
            case 3:
                y1b0 y1b0Var = (y1b0) this.c;
                String str = (String) this.d;
                com.vk.music.player.playback.c cVar = (com.vk.music.player.playback.c) this.e;
                if (str == null) {
                    PlayerTrack b = cVar.q.b();
                    str = b != null ? b.f : null;
                }
                y1b0Var.invoke(str);
                return s3q0.a;
            default:
                p8c0 p8c0Var = (p8c0) this.c;
                Context context = (Context) this.d;
                c7g0 c7g0Var = (c7g0) this.e;
                p7c0 p7c0Var = (p7c0) obj;
                pbm0 pbm0Var = c7g0Var instanceof c7g0.a ? (pbm0) j5g.a0(((c7g0.a) c7g0Var).a.f) : c7g0Var instanceof c7g0.b ? (pbm0) j5g.a0(((c7g0.b) c7g0Var).b) : null;
                String contentImageUrl = p7c0Var.getContentImageUrl();
                if (contentImageUrl != null) {
                    vVar = ((pbm0Var == null || !pbm0Var.c) ? new io.reactivex.rxjava3.internal.operators.observable.p1(mcr0.f(10000L, contentImageUrl).U(new rt0(new fo20(p8c0Var, 11), 26)), new o8c0(new yr00(pbm0Var, p8c0Var), 0)) : new io.reactivex.rxjava3.internal.operators.observable.s0(new i7(pbm0Var, p8c0Var))).U(new n8c0(new dn20(p7c0Var, p8c0Var), 0)).m0();
                } else {
                    vVar = new io.reactivex.rxjava3.internal.operators.single.v(new ne40(p8c0Var, p7c0Var, context));
                }
                return vVar.l(new u730(new u3u(p7c0Var, p8c0Var), 8));
        }
    }
}
