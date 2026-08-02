package xsna;

import android.graphics.drawable.Drawable;
import com.ironsource.C4637xa;
import com.ironsource.L2;
import com.ironsource.N2;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.photos.legacy.PhotoAlbumListFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.search.ui.api.SearchQuery;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment;
import com.yandex.mobile.ads.common.InitializationListener;
import java.util.List;
import java.util.Optional;
import xsna.g7g0;
import xsna.l5v0;
import xsna.tmw0;
import xsna.vuw0;
import xsna.vzw0;
import xsna.xn50;
import xsna.ydz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class bj50 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, m6o, io.reactivex.rxjava3.functions.c, s0x0, InitializationListener, ydz0.a, N2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bj50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.ironsource.N2
    public L2 a(boolean z) {
        L2 a;
        a = C4637xa.a((C4637xa) this.c, z);
        return a;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 18:
                return (List) ((com.vk.movika.tools.controls.seekbar.r) this.c).invoke(obj, obj2);
            default:
                return (vuw0.b) ((nx7) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        pjp0 pjp0Var = (pjp0) this.c;
        float[] fArr = h8g.a;
        return h8g.c(pjp0Var, d);
    }

    @Override // xsna.s0x0
    public void c(vzw0 vzw0Var) {
        VoipVideoListFragment voipVideoListFragment = (VoipVideoListFragment) this.c;
        int i = VoipVideoListFragment.S;
        if (vzw0Var instanceof vzw0.c) {
            xn50.a.c(voipVideoListFragment, tmw0.a.C3759a.b);
            return;
        }
        if (vzw0Var instanceof vzw0.a) {
            xn50.a.c(voipVideoListFragment, tmw0.a.b.b);
        } else if (vzw0Var instanceof vzw0.d) {
            xn50.a.c(voipVideoListFragment, new tmw0.c(((vzw0.d) vzw0Var).a));
        } else if (vzw0Var instanceof vzw0.b) {
            xn50.a.c(voipVideoListFragment, tmw0.b.b);
        }
    }

    @Override // com.yandex.mobile.ads.common.InitializationListener
    public void onInitializationCompleted() {
        ((YandexAdapter) this.c).initializationSuccess();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 3:
                int i2 = PhotoAlbumListFragment.O0;
                ((PhotoAlbumListFragment) obj2).getClass();
                return obj instanceof bwg0;
            default:
                ((ecq0) obj2).getClass();
                return obj instanceof h7o0;
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((xc50) obj2).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.t) ((g84) obj2).invoke(obj);
            case 2:
                return (cfr) ((xpt) obj2).invoke(obj);
            case 3:
            case 7:
            case 13:
            case 18:
            default:
                return (Boolean) ((efr0) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.e) ((xc50) obj2).invoke(obj);
            case 5:
                int i2 = PollResultsFragment.b0;
                return (Optional) ((xpt) obj2).invoke(obj);
            case 6:
                return (g7g0.c) ((xpt) obj2).invoke(obj);
            case 8:
                return ((qph0) obj2).invoke(obj);
            case 9:
                return (SearchQuery) ((xpt) obj2).invoke(obj);
            case 10:
                return (q9n0) ((r50) obj2).invoke(obj);
            case 11:
                return (Drawable) ((ohn0) obj2).invoke(obj);
            case 12:
                return (byte[]) ((m0m0) obj2).invoke(obj);
            case 14:
                return (bwq0) ((m0m0) obj2).invoke(obj);
            case 15:
                return (UsersDiscoverPresenter.a) ((m0m0) obj2).invoke(obj);
            case 16:
                return (String) ((m0m0) obj2).invoke(obj);
            case 17:
                return (Boolean) ((m0m0) obj2).invoke(obj);
            case 19:
                return (l5v0.a.b) ((t810) obj2).invoke(obj);
            case 20:
                return (it80) ((m0m0) obj2).invoke(obj);
        }
    }
}
