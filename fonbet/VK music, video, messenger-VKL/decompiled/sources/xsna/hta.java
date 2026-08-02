package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.stories.ImStoryState;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: ChangeStoryStateCmd.kt */
/* loaded from: classes2.dex */
public final class hta extends le6<Map<Peer, ? extends ImStoryState>> {
    public final Peer b;
    public final ImStoryState c;

    public hta(Peer peer, ImStoryState imStoryState) {
        this.b = peer;
        this.c = imStoryState;
    }

    @Override // xsna.le6
    public final Map<Peer, ? extends ImStoryState> e(w2w w2wVar) {
        List<z4m0> singletonList = Collections.singletonList(new z4m0(this.b, this.c, w2wVar.f1()));
        w2wVar.I0().p().a(singletonList);
        List<z4m0> list = singletonList;
        int e = on00.e(c5g.u(list, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (z4m0 z4m0Var : list) {
            Pair pair = new Pair(z4m0Var.a, z4m0Var.b);
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hta)) {
            return false;
        }
        hta htaVar = (hta) obj;
        return epx.f(this.b, htaVar.b) && this.c == htaVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChangeStoryStateCmd(peer=" + this.b + ", newStoryState=" + this.c + ')';
    }
}
