package defpackage;

import com.vk.articles.ArticleFragment;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b;
import com.vk.profile.community.impl.ui.events.e;
import com.vk.stickers.views.LongtapRecyclerView;
import io.reactivex.rxjava3.functions.f;
import java.util.Map;
import xsna.dh5;
import xsna.el50;
import xsna.fl6;
import xsna.g1j;
import xsna.gpq;
import xsna.hpq;
import xsna.hx3;
import xsna.ih4;
import xsna.kpd;
import xsna.lbe;
import xsna.m1s;
import xsna.n40;
import xsna.o41;
import xsna.o9;
import xsna.qcy;
import xsna.qmg;
import xsna.qr60;
import xsna.rmg;
import xsna.sps;
import xsna.tc;
import xsna.y89;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class i0 implements f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((h0) obj2).invoke(obj);
                break;
            case 1:
                ((n40) obj2).invoke(obj);
                break;
            case 2:
                ((o41) obj2).invoke(obj);
                break;
            case 3:
                ((n40) obj2).invoke(obj);
                break;
            case 4:
                String str = (String) obj;
                VKCircleImageView vKCircleImageView = ((ArticleFragment) obj2).k0;
                if (vKCircleImageView != null) {
                    vKCircleImageView.o0(str, null);
                    break;
                }
                break;
            case 5:
                ((hx3) obj2).invoke(obj);
                break;
            case 6:
                ((fl6.l) obj2).invoke(obj);
                break;
            case 7:
                ((ih4) obj2).invoke(obj);
                break;
            case 8:
                ((n40) obj2).invoke(obj);
                break;
            case 9:
                ((n40) obj2).invoke(obj);
                break;
            case 10:
                ((dh5) obj2).invoke(obj);
                break;
            case 11:
                ((y89) obj2).invoke(obj);
                break;
            case 12:
                ((n40) obj2).invoke(obj);
                break;
            case 13:
                ((dh5) obj2).invoke(obj);
                break;
            case 14:
                ((qmg) obj2).invoke(obj);
                break;
            case 15:
                b bVar = (b) obj2;
                el50.a.b(bVar, new lbe(bVar, 8));
                break;
            case 16:
                el50.a.b((e) obj2, new tc(16));
                break;
            case 17:
                ((kpd) obj2).invoke(obj);
                break;
            case 18:
                ((h0) obj2).invoke(obj);
                break;
            case 19:
                ((g1j) obj2).invoke(obj);
                break;
            case 20:
                ((gpq) obj2).e(new hpq(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 21:
                ((dh5) obj2).invoke(obj);
                break;
            case 22:
                m1s m1sVar = (m1s) obj2;
                m1sVar.q(new rmg((Map) obj, m1sVar));
                break;
            case 23:
                ((sps) obj2).invoke(obj);
                break;
            case 24:
                ((o9) obj2).invoke(obj);
                break;
            case 25:
                qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
                ((g1j) obj2).invoke(obj);
                break;
            case 26:
                ((g1j) obj2).invoke(obj);
                break;
            case 27:
                int i2 = LongtapRecyclerView.n;
                ((g1j) obj2).invoke(obj);
                break;
            case 28:
                ((hx3) obj2).invoke(obj);
                break;
            default:
                ((h0) obj2).invoke(obj);
                break;
        }
    }
}
