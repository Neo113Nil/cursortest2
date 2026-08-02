package xsna;

import android.content.Context;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.k840;

/* compiled from: PlayerStarter.kt */
/* loaded from: classes7.dex */
public final class e4b0 {
    public final Context a;
    public final List<Pair<String, List<Integer>>> b;
    public boolean c;
    public boolean d;
    public yp80 e;
    public int f;
    public final u2b0 g = k840.a.g().b();
    public final ix4 h = new ix4();
    public final emr i = new emr(1);

    /* JADX WARN: Multi-variable type inference failed */
    public e4b0(Context context, List<? extends Pair<String, ? extends List<Integer>>> list) {
        this.a = context;
        this.b = list;
    }

    public final void a() {
        this.d = true;
    }

    public final io.reactivex.rxjava3.disposables.c b(MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        List<Pair<String, List<Integer>>> list = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).i());
        }
        return new io.reactivex.rxjava3.internal.operators.observable.c0(hg1.m(rsg0.y0(yfb.x(hx4.o(this.h, arrayList, k840.a.h() ? "kids_section" : null, 2)), null, null, 3), this.a, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new re4(this, 3)).U(new oyr(new d0k(20), 13)).subscribe(new jw80(new ma(25, this, musicPlaybackLaunchContext), 4), new m330(new dn20(this, 15), 11));
    }

    public final void c(int i) {
        this.f = i;
    }
}
