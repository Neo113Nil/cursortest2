package xsna;

import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: MusicFetchController.kt */
/* loaded from: classes3.dex */
public final class sk40 extends wn4 {
    public final q76 a;
    public final hza0 b;
    public List<gza0> c = new ArrayList();
    public Map<String, xd50> d = jgp.b;
    public int e;

    public sk40(q76 q76Var, hza0 hza0Var) {
        this.a = q76Var;
        this.b = hza0Var;
    }

    @Override // xsna.wn4
    public final void g() {
        this.b.cancel();
        this.a.f();
    }

    @Override // xsna.wn4
    public final boolean l() {
        return this.b.isLoading();
    }

    @Override // xsna.wn4
    public final void m(int i, izs<? super List<xd50>, s3q0> izsVar, izs<? super List<String>, s3q0> izsVar2) {
        int min = Math.min(this.c.size(), this.e + i);
        int i2 = this.e;
        if (i2 >= min) {
            izsVar.invoke(EmptyList.b);
            return;
        }
        List<gza0> subList = this.c.subList(i2, min);
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            if (!this.d.containsKey(((gza0) obj).a)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            izsVar.invoke(EmptyList.b);
        } else {
            this.b.a(arrayList, new ogd(arrayList, izsVar2, izsVar, 3));
        }
    }

    @Override // xsna.wn4
    public final void n(StartPlaySource startPlaySource, MusicPlaybackLaunchContext musicPlaybackLaunchContext, AdsAudioPixelsContainer adsAudioPixelsContainer, zxa0 zxa0Var) {
        this.a.k(startPlaySource, musicPlaybackLaunchContext, adsAudioPixelsContainer, zxa0Var);
    }

    @Override // xsna.wn4
    public final void q(ArrayList arrayList, LinkedHashMap linkedHashMap, int i) {
        this.c = arrayList;
        this.d = linkedHashMap;
        this.e = i;
    }
}
