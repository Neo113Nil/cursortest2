package xsna;

import android.text.format.DateUtils;
import com.vk.dto.actionlinks.ActionButtonStat;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.live.impl.views.stat.StatAdapter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StatPresenter.kt */
/* loaded from: classes3.dex */
public final class psk0 extends io.reactivex.rxjava3.observers.a<List<? extends UserProfile>> {
    public final /* synthetic */ com.vk.libvideo.live.impl.views.stat.a c;

    public psk0(com.vk.libvideo.live.impl.views.stat.a aVar) {
        this.c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        this.c.f.g0();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        com.vk.libvideo.live.impl.views.stat.a aVar = this.c;
        aVar.j.addAll((List) obj);
        ArrayList<UserProfile> arrayList = aVar.j;
        StatAdapter.a aVar2 = aVar.p;
        StatAdapter statAdapter = aVar.h;
        ArrayList<StatAdapter.a> arrayList2 = statAdapter.d;
        StatAdapter.Type type = StatAdapter.Type.TITLE;
        prk0 prk0Var = aVar.f;
        arrayList2.add(new StatAdapter.a(type, null, prk0Var.getViewContext().getString(R.string.live_viewers_stat_title), 0, 0, null, 250));
        ArrayList<StatAdapter.a> arrayList3 = statAdapter.d;
        StatAdapter.Type type2 = StatAdapter.Type.STAT;
        arrayList3.add(new StatAdapter.a(type2, null, prk0Var.getViewContext().getString(R.string.live_viewers_stat_views), aVar.n, 0, null, 242));
        boolean z = aVar.d;
        if (!z) {
            arrayList3.add(new StatAdapter.a(type2, null, prk0Var.getViewContext().getString(R.string.live_viewers_stat_views_unique), aVar.e, 0, null, 242));
        }
        arrayList3.add(new StatAdapter.a(type2, null, prk0Var.getViewContext().getString(R.string.live_viewers_stat_likes), aVar.l, 0, null, 242));
        arrayList3.add(new StatAdapter.a(type2, null, prk0Var.getViewContext().getString(R.string.live_viewers_stat_comments), aVar.m, 0, null, 242));
        arrayList3.add(aVar2);
        aVar2.e = DateUtils.formatElapsedTime(aVar.g);
        List<ActionButtonStat> list = aVar.o;
        if (list != null && !list.isEmpty()) {
            arrayList3.add(new StatAdapter.a(StatAdapter.Type.DELIMITER, null, null, 0, 0, null, 254));
            arrayList3.add(new StatAdapter.a(type, null, prk0Var.getViewContext().getString(R.string.live_viewers_stat_interactions), 0, 0, null, 250));
            for (ActionButtonStat actionButtonStat : list) {
                arrayList3.add(new StatAdapter.a(StatAdapter.Type.ACTION_LINK, null, prk0Var.getViewContext().getString(R.string.live_viewers_stat_actions_count), actionButtonStat.b, actionButtonStat.c, actionButtonStat.d, 146));
            }
        }
        if (z) {
            arrayList3.add(new StatAdapter.a(StatAdapter.Type.DELIMITER, null, null, 0, 0, null, 254));
            arrayList3.add(new StatAdapter.a(StatAdapter.Type.TITLE, null, prk0Var.getViewContext().getString(R.string.live_viewers_viewers_title), 0, 0, null, 250));
            if (arrayList.isEmpty()) {
                arrayList3.add(new StatAdapter.a(StatAdapter.Type.EMPTY, null, null, 0, 0, null, 254));
            } else {
                Iterator<UserProfile> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new StatAdapter.a(StatAdapter.Type.USER, it.next(), null, 0, 0, null, 252));
                }
                int i = aVar.k;
                if (i != 0) {
                    arrayList3.add(new StatAdapter.a(StatAdapter.Type.MORE, null, null, i, 0, null, 246));
                }
            }
        }
        statAdapter.notifyDataSetChanged();
        prk0Var.i0();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
    }
}
