package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.stories.ImStoryState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.bfz;

/* compiled from: DialogsListViewState.kt */
/* loaded from: classes18.dex */
public final class oum implements ao50 {
    public final List<pgm> a;
    public final DialogsHistory b;
    public final ProfilesInfo c;
    public final Map<Peer, List<vh30>> d;
    public final Set<Peer> e;
    public final Set<Peer> f;
    public final io8 g;
    public final ng20 h;
    public final bfz.a i;
    public final bfz.a j;
    public final Map<Peer, ImStoryState> k;
    public final i5e0 l;

    /* JADX WARN: Multi-variable type inference failed */
    public oum(List<? extends pgm> list, DialogsHistory dialogsHistory, ProfilesInfo profilesInfo, Map<Peer, ? extends List<vh30>> map, Set<? extends Peer> set, Set<? extends Peer> set2, io8 io8Var, ng20 ng20Var, bfz.a aVar, bfz.a aVar2, Map<Peer, ? extends ImStoryState> map2, i5e0 i5e0Var) {
        this.a = list;
        this.b = dialogsHistory;
        this.c = profilesInfo;
        this.d = map;
        this.e = set;
        this.f = set2;
        this.g = io8Var;
        this.h = ng20Var;
        this.i = aVar;
        this.j = aVar2;
        this.k = map2;
        this.l = i5e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static oum a(oum oumVar, ArrayList arrayList, DialogsHistory dialogsHistory, ProfilesInfo profilesInfo, Map map, Set set, Set set2, io8 io8Var, ng20 ng20Var, bfz.a aVar, bfz.a aVar2, Map map2, i5e0 i5e0Var, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = oumVar.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            dialogsHistory = oumVar.b;
        }
        DialogsHistory dialogsHistory2 = dialogsHistory;
        ProfilesInfo profilesInfo2 = (i & 4) != 0 ? oumVar.c : profilesInfo;
        Map map3 = (i & 8) != 0 ? oumVar.d : map;
        Set set3 = (i & 16) != 0 ? oumVar.e : set;
        Set set4 = (i & 32) != 0 ? oumVar.f : set2;
        io8 io8Var2 = (i & 64) != 0 ? oumVar.g : io8Var;
        ng20 ng20Var2 = (i & 128) != 0 ? oumVar.h : ng20Var;
        bfz.a aVar3 = (i & 256) != 0 ? oumVar.i : aVar;
        bfz.a aVar4 = (i & 512) != 0 ? oumVar.j : aVar2;
        Map map4 = (i & 1024) != 0 ? oumVar.k : map2;
        i5e0 i5e0Var2 = (i & 2048) != 0 ? oumVar.l : i5e0Var;
        oumVar.getClass();
        return new oum(list2, dialogsHistory2, profilesInfo2, map3, set3, set4, io8Var2, ng20Var2, aVar3, aVar4, map4, i5e0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oum)) {
            return false;
        }
        oum oumVar = (oum) obj;
        return epx.f(this.a, oumVar.a) && epx.f(this.b, oumVar.b) && epx.f(this.c, oumVar.c) && epx.f(this.d, oumVar.d) && epx.f(this.e, oumVar.e) && epx.f(this.f, oumVar.f) && epx.f(this.g, oumVar.g) && epx.f(this.h, oumVar.h) && epx.f(this.i, oumVar.i) && epx.f(this.j, oumVar.j) && epx.f(this.k, oumVar.k) && epx.f(this.l, oumVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + v11.a((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + fw3.b(fw3.b(v11.a(ur.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31)) * 31)) * 31, 31, this.k);
    }

    public final String toString() {
        return "DialogsListViewState(items=" + this.a + ", dialogsHistory=" + this.b + ", profiles=" + this.c + ", composings=" + this.d + ", sendingMessages=" + this.e + ", failedMessages=" + this.f + ", businessNotifications=" + this.g + ", messagesRequests=" + this.h + ", listHeader=" + this.i + ", middle=" + this.j + ", storiesInfo=" + this.k + ", promoLink=" + this.l + ')';
    }
}
