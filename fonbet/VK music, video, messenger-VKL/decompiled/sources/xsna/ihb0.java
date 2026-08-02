package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.player.StartPlayPodcastSource;
import com.vk.music.player.StartPlaySource;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PodcastFetchController.kt */
/* loaded from: classes3.dex */
public final class ihb0 extends wn4 {
    public static final io.reactivex.rxjava3.internal.operators.observable.g1 i = io.reactivex.rxjava3.core.q.T(EmptyList.b);
    public final com.vk.music.player.playback.e a;
    public int e;
    public String g;
    public String h;
    public final io.reactivex.rxjava3.disposables.g b = new io.reactivex.rxjava3.disposables.g();
    public final clb0 c = new clb0();
    public final xga d = new xga();
    public boolean f = true;

    public ihb0(com.vk.music.player.playback.e eVar) {
        this.a = eVar;
        this.g = "";
        this.h = "";
        StartPlaySource startPlaySource = eVar.a;
        if (startPlaySource instanceof StartPlayCatalogSource) {
            StartPlayCatalogSource startPlayCatalogSource = (StartPlayCatalogSource) startPlaySource;
            this.g = startPlayCatalogSource.c;
            this.h = startPlayCatalogSource.e;
        }
    }

    @Override // xsna.wn4
    public final void g() {
        this.b.b(null);
        this.e = 0;
        this.f = true;
        this.g = "";
        this.h = null;
    }

    @Override // xsna.wn4
    public final boolean l() {
        return hg1.d(this.b.a());
    }

    @Override // xsna.wn4
    public final void m(int i2, izs<? super List<xd50>, s3q0> izsVar, izs<? super List<String>, s3q0> izsVar2) {
        String str;
        UserId userId;
        if (l()) {
            return;
        }
        com.vk.music.player.playback.e eVar = this.a;
        StartPlaySource startPlaySource = eVar.a;
        boolean z = startPlaySource instanceof StartPlayPodcastSource;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        io.reactivex.rxjava3.core.q qVar = i;
        if (z) {
            if (this.f) {
                StartPlayPodcastSource startPlayPodcastSource = startPlaySource instanceof StartPlayPodcastSource ? (StartPlayPodcastSource) startPlaySource : null;
                if (startPlayPodcastSource == null || (userId = startPlayPodcastSource.c) == null) {
                    userId = UserId.d;
                }
                qVar = rsg0.T(yfb.x(blb0.a(this.c, userId, 100, Integer.valueOf(this.e), null, eVar.b.zb(), 8))).U(new kxa0(new kb40(this, 12), 1)).E(new c2y(new rj60(this, 8), 18), lVar, kVar, kVar);
            }
        } else if ((startPlaySource instanceof StartPlayCatalogSource) && (str = this.h) != null) {
            qVar = rsg0.T(yfb.x(wga.f(this.d, this.g, str, null, null, null, null, null, 1020))).E(new sl30(new zl20(this, 17), 11), lVar, kVar, kVar).U(new xq70(new lw20(this, 18), 3));
        }
        this.b.b(qVar.a0(asu0.a.d()).subscribe(new q440(new f430(izsVar, 1), 11), new oo20(new pb00(this, 14), 12)));
    }

    @Override // xsna.wn4
    public final void p(izs<? super List<xd50>, s3q0> izsVar) {
        m(0, izsVar, new tc(2));
    }
}
