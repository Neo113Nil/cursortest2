package xsna;

import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MessagesGetIncognitoMembersByIdsApiCmd.kt */
/* loaded from: classes2.dex */
public final class bf20 extends nx2<Map<Integer, ? extends DialogMember>> {
    public final long b;
    public final Collection<Integer> c;
    public final boolean d;

    public bf20(long j, Collection<Integer> collection, boolean z) {
        this.b = j;
        this.c = collection;
        this.d = z;
    }

    @Override // xsna.nx2
    public final Map<Integer, ? extends DialogMember> f(l7r0 l7r0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j5g.V0(this.c, 300, 300, true, new wh9(this, l7r0Var, linkedHashMap, 4));
        return linkedHashMap;
    }
}
