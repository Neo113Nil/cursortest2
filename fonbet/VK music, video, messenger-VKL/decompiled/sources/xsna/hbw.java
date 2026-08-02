package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vk.channels.api.Channel;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import xsna.fbw;
import xsna.iab;
import xsna.wab;

/* compiled from: ImReactionsInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class hbw implements fbw {
    public final a1w a;
    public final yab b;
    public io.reactivex.rxjava3.subjects.f<Object> c;
    public io.reactivex.rxjava3.disposables.c d;
    public long e;
    public final CopyOnWriteArraySet<Integer> f = new CopyOnWriteArraySet<>();

    public hbw(a1w a1wVar, yab yabVar, eaw eawVar) {
        this.a = a1wVar;
        this.b = yabVar;
    }

    @Override // xsna.fbw
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
        this.c = null;
    }

    @Override // xsna.fbw
    public final void b(long j, ArrayList arrayList) {
        if (this.c == null) {
            this.e = j;
            final io.reactivex.rxjava3.subjects.f<Object> fVar = new io.reactivex.rxjava3.subjects.f<>();
            this.d = fVar.v0(15L, TimeUnit.SECONDS).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.gbw
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    hbw hbwVar = hbw.this;
                    CopyOnWriteArraySet<Integer> copyOnWriteArraySet = hbwVar.f;
                    for (List list : p4g.p(100, copyOnWriteArraySet)) {
                        hbwVar.a.D(fVar, new yst(hbwVar.e, list));
                    }
                    copyOnWriteArraySet.clear();
                }
            });
            this.c = fVar;
        }
        io.reactivex.rxjava3.subjects.f<Object> fVar2 = this.c;
        if (fVar2 != null) {
            this.f.addAll(arrayList);
            fVar2.onNext(new Object());
        }
    }

    @Override // xsna.fbw
    public final void c(long j, List<Integer> list) {
        this.a.D(this, new zn00(j, list));
    }

    @Override // xsna.fbw
    public final void d(int i, int i2, long j, boolean z) {
        this.a.D(this, z ? new hyi0(j, i2, wab.b.a) : new uyi0(j, i, i2, null, ""));
    }

    @Override // xsna.fbw
    public final void e(fbw.a aVar) {
        le6 uyi0Var;
        a1w a1wVar = this.a;
        long j = aVar.a;
        int i = aVar.b;
        int i2 = aVar.c;
        boolean z = aVar.d;
        int i3 = aVar.e;
        String str = aVar.f;
        if (!z) {
            uyi0Var = new uyi0(j, i, i2, Integer.valueOf(i3), str);
        } else {
            if (i3 < 0) {
                wpp wppVar = (wpp) vdg0.b(a1wVar.n(this, new gfb(Collections.singletonList(new Peer.Channel(j)), Source.CACHE, false, 12)), new d4r(24));
                Channel channel = wppVar != null ? (Channel) wppVar.c.get(Long.valueOf(j)) : null;
                if (channel == null || !channel.N) {
                    return;
                }
                Activity b = c63.b();
                FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
                if (fragmentActivity == null) {
                    return;
                }
                int i4 = iab.l1;
                gzs<s3q0> gzsVar = fkq0.a;
                UserId userId = new UserId(j);
                int i5 = iab.l1;
                new iab.a(fragmentActivity, userId, i).I0("ChannelReactionQuantitySelectorBottomSheet");
                return;
            }
            uyi0Var = new hyi0(j, i2, new wab.a(this.b.d(i3)));
        }
        a1wVar.D(this, uyi0Var);
    }
}
