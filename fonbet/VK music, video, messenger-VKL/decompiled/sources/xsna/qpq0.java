package xsna;

import com.vk.dto.newsfeed.TrackableOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: UserProfileFriendsAndFollowersInfoFactoryDelegate.kt */
/* loaded from: classes5.dex */
public final class qpq0 {
    public final dvq0 a;

    public qpq0(dvq0 dvq0Var) {
        this.a = dvq0Var;
    }

    public static List a(int i, List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((TrackableOwner) it.next()).b.d;
                String a = str != null ? js5.a(200, str) : null;
                if (a != null) {
                    arrayList.add(a);
                }
            }
            List H0 = j5g.H0(arrayList, i);
            if (H0 != null) {
                return H0;
            }
        }
        return EmptyList.b;
    }
}
