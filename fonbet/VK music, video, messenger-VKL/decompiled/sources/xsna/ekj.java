package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.jw00;
import xsna.xij;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ekj implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ekj(com.vk.music.player.playback.c cVar, boolean z, izs izsVar) {
        this.d = cVar;
        this.c = z;
        this.e = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MusicTrack musicTrack;
        switch (this.b) {
            case 0:
                jw00.b.a aVar = (jw00.b.a) this.d;
                gkj gkjVar = (gkj) this.e;
                Map map = (Map) obj;
                if (!this.c || aVar == null) {
                    jw00 jw00Var = (jw00) map.get(jw00.a.c);
                    if (jw00Var != null) {
                        gkjVar.p(new xij.c.a(jw00Var.a()));
                    }
                } else {
                    jw00 jw00Var2 = (jw00) map.get(aVar);
                    if (jw00Var2 != null) {
                        gkjVar.p(new xij.c.a(jw00Var2.a()));
                    }
                }
                break;
            default:
                com.vk.music.player.playback.c cVar = (com.vk.music.player.playback.c) this.d;
                LinkedHashMap linkedHashMap = cVar.m;
                izs izsVar = (izs) this.e;
                List<xd50> list = (List) obj;
                int size = list.size();
                if (!list.isEmpty()) {
                    List<xd50> list2 = list;
                    int e = on00.e(c5g.u(list2, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
                    for (Object obj2 : list2) {
                        linkedHashMap2.put(((xd50) obj2).a.Fb(), obj2);
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    cVar.c.e(linkedHashMap);
                    if (cVar.w.j() && cVar.w.l()) {
                        cVar.I(list);
                    }
                }
                PlayerTrack playerTrack = cVar.i;
                if (playerTrack != null && (musicTrack = playerTrack.b) != null && musicTrack.Wb()) {
                    cVar.G();
                }
                cVar.f(size, this.c);
                if (!cVar.t) {
                    PlayerTrack playerTrack2 = cVar.i;
                    izsVar.invoke(playerTrack2 != null ? playerTrack2.f : null);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ekj(boolean z, jw00.b.a aVar, gkj gkjVar) {
        this.c = z;
        this.d = aVar;
        this.e = gkjVar;
    }
}
