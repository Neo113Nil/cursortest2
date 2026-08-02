package xsna;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.exoplayer.source.l;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.mail.libverify.h.f;
import xsna.yx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b630 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s, y990, l.a, r580, Toolbar.h, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, f.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b630(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // ru.mail.libverify.h.f.b
    public void a(f.c cVar) {
        ru.mail.libverify.api.q.a((ru.mail.libverify.g.b) this.c, cVar);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (VoipCallServiceBannerHandler.a) ((a9b) this.c).invoke(obj, obj2);
    }

    @Override // xsna.r580
    public void c(DonutVideoAction donutVideoAction) {
        ((x5n0) this.c).K7(donutVideoAction, DonutVideoClickSource.DESCRIPTION);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        o3p0 o3p0Var = (o3p0) this.c;
        if (menuItem.getItemId() != R.id.vkim_search_menu) {
            return true;
        }
        aiv0 aiv0Var = o3p0Var.c;
        if (aiv0Var.e) {
            return true;
        }
        aiv0Var.b();
        return true;
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        u440 u440Var = (u440) this.c;
        ArrayList arrayList = u440Var.v;
        int i = 0;
        boolean z = arrayList.size() == 1;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            tam0 tam0Var = (tam0) obj;
            if (z) {
                tam0Var.k = ((g440) u440Var.s).getStickerBackgroundState();
            }
            rVar.onNext(new Pair(Integer.valueOf(i), tam0Var));
            i = i2;
        }
        rVar.onComplete();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 16:
                return ((Boolean) ((hij0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((u620) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // xsna.y990
    public void a(int i) {
        y990 y990Var = ((dad0) this.c).i;
        if (y990Var != null) {
            y990Var.a(i);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (Boolean) ((c3v) obj2).invoke(obj);
            case 1:
            case 7:
            case 8:
            case 13:
            case 14:
            case 16:
            case 19:
            case 23:
            default:
                return (Boolean) ((yjs0) obj2).invoke(obj);
            case 2:
                return (List) ((azt) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.e) ((wi6) obj2).invoke(obj);
            case 4:
                return (yx40.a) ((wq20) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((wq20) obj2).invoke(obj);
            case 6:
                return (vy60) ((tol) obj2).invoke(obj);
            case 9:
                return (Long) ((u620) obj2).invoke(obj);
            case 10:
                int i2 = RouletteView.k;
                return (io.reactivex.rxjava3.core.e) ((z43) obj2).invoke(obj);
            case 11:
                return ((msh0) obj2).invoke(obj);
            case 12:
                return (v800) ((tol) obj2).invoke(obj);
            case 15:
                return (List) ((kpk0) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((z43) obj2).invoke(obj);
            case 18:
                return (VideoAdvertisementsRepository.a) ((kpk0) obj2).invoke(obj);
            case 20:
                return (VideoStatistic) ((m8) obj2).invoke(obj);
            case 21:
                return (Boolean) ((yjs0) obj2).invoke(obj);
            case 22:
                int i3 = ngw0.n1;
                return (String) ((yjs0) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((mdm0) obj2).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.t) ((vgx0) obj2).invoke(obj);
        }
    }
}
