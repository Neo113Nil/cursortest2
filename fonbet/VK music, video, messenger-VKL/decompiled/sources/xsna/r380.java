package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: OnConversationDoesNotExistEvent.kt */
/* loaded from: classes2.dex */
public final class r380 extends sxp {
    public final List<Long> b;

    /* compiled from: OnConversationDoesNotExistEvent.kt */
    public static final class a {
        public static r380 a(VKApiExecutionException vKApiExecutionException) {
            String str;
            if (vKApiExecutionException == null || !vKApiExecutionException.Q()) {
                return new r380(EmptyList.b);
            }
            Map<String, String> z = vKApiExecutionException.z();
            if (z == null || (str = z.get("peer_ids")) == null) {
                str = "";
            }
            List b0 = drm0.b0(str, new char[]{','}, 0, 6);
            ArrayList arrayList = new ArrayList(c5g.u(b0, 10));
            Iterator it = b0.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(cqm0.l((String) it.next())));
            }
            return new r380(arrayList);
        }
    }

    public r380(List<Long> list) {
        this.b = list;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r380) && epx.f(this.b, ((r380) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("OnConversationDoesNotExistEvent(conversationIds="), this.b);
    }
}
