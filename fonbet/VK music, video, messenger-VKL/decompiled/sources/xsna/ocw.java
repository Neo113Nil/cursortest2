package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ImSendHelper.kt */
/* loaded from: classes2.dex */
public final class ocw {
    public static final ocw a = new ocw();
    public static final a1w b = i2w.a();

    public static boolean a(long j, Object obj, String str, String str2, List list) {
        if (!c(j, list)) {
            return false;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        pz30 pz30Var = new pz30(Peer.a.b(j), str, null, null, null, null, null, str2, list, null, null, null, null, 15996);
        itg0.n(b.E(qjg.a(obj), pz30Var));
        return true;
    }

    public static void b(Object obj, long j, String str, Collection collection, int i) {
        if ((i & 8) != 0) {
            collection = EmptyList.b;
        }
        String str2 = (i & 16) != 0 ? "unknown" : "assistant_text_message";
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Attach b2 = ca3.b((Attachment) it.next());
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        a(j, obj, str, str2, arrayList);
    }

    public static boolean c(long j, List list) {
        if (Long.valueOf(j).compareTo((Long) 0L) != 0) {
            try {
                zir0.a(list);
                return true;
            } catch (Exception unused) {
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(go9.c("Failed to share attaches ", list)));
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                enj.q(R.string.vkim_respost_error, 0, context);
            }
        }
        return false;
    }
}
