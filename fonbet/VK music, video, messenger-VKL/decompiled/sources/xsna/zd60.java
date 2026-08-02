package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.log.L;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.a;
import com.vk.toggle.features.FeedFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zd60 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zd60(int i, String str, boolean z, List list) {
        this.e = list;
        this.f = str;
        this.c = i;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MusicTrack musicTrack;
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                final List list = (List) obj3;
                final String str = (String) obj2;
                final UserId userId = (UserId) obj;
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                FeedFeatures feedFeatures = FeedFeatures.FILE_CACHE;
                feedFeatures.getClass();
                boolean a = com.vk.toggle.b.A.a(feedFeatures);
                final int i2 = this.c;
                final boolean z = this.d;
                if (!a) {
                    return new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.ae60
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            String b;
                            Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
                            final int i3 = i2;
                            final boolean z2 = z;
                            String b2 = NewsfeedData.a.b(i3, "newsfeed_cache_info", z2);
                            if (b2 != null && (b = NewsfeedData.a.b(i3, "newsfeed_cache_items", z2)) != null) {
                                final ArrayList t = up2.t(list);
                                final UserId userId2 = UserId.this;
                                L.c("NewsfeedCache", new gzs() { // from class: xsna.ah60
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        return "Saving to serializer storage: listId " + i3 + ", isSmart " + z2 + ", userId " + userId2 + ", entries size " + t.size();
                                    }
                                });
                                wmi0 wmi0Var = wmi0.a;
                                wmi0Var.m(b2, Collections.singletonList(new NewsfeedData.Info(userId2, str, i3, z2, 0L, 16, null)));
                                wmi0Var.m(b, t);
                            }
                            return s3q0.a;
                        }
                    });
                }
                ce60.b.getClass();
                return ((hxq) ce60.c.getValue()).b(i2, str, z, list);
            default:
                com.vk.music.player.playback.c cVar = (com.vk.music.player.playback.c) obj3;
                LinkedHashMap linkedHashMap = cVar.m;
                izs izsVar = (izs) obj2;
                List<xd50> list2 = (List) obj;
                List<xd50> list3 = list2;
                if (!list3.isEmpty()) {
                    List<xd50> list4 = list2;
                    int e = on00.e(c5g.u(list4, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
                    for (Object obj4 : list4) {
                        linkedHashMap2.put(((xd50) obj4).a.Fb(), obj4);
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    cVar.c.e(linkedHashMap);
                    if (cVar.w.j() && cVar.w.l()) {
                        cVar.I(list2);
                    }
                }
                PlayerTrack playerTrack = cVar.i;
                if (playerTrack != null && (musicTrack = playerTrack.b) != null && musicTrack.Wb()) {
                    cVar.G();
                }
                cVar.f(this.c, this.d);
                if (!cVar.t) {
                    PlayerTrack playerTrack2 = cVar.i;
                    izsVar.invoke(playerTrack2 != null ? playerTrack2.f : null);
                }
                if (!list3.isEmpty()) {
                    PlayerTrack last = cVar.getLast();
                    PlayerTrack playerTrack3 = cVar.x;
                    if (!epx.f(playerTrack3 != null ? playerTrack3.f : null, last != null ? last.f : null)) {
                        cVar.x = last;
                        a.C1330a c1330a = cVar.j;
                        if (c1330a != null) {
                            com.vk.music.player.a aVar = com.vk.music.player.a.this;
                            if (!epx.f(aVar.h, last)) {
                                com.vk.music.player.a.a(aVar, last);
                            }
                        }
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ zd60(com.vk.music.player.playback.c cVar, int i, boolean z, izs izsVar) {
        this.e = cVar;
        this.c = i;
        this.d = z;
        this.f = izsVar;
    }
}
