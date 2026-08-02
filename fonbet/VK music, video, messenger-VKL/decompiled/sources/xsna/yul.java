package xsna;

import android.content.ContentUris;
import android.provider.CalendarContract;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.stories.StoriesFilterListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yul implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yul(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        UserId userId;
        UserId userId2;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qz8 qz8Var = (qz8) ((og0) obj2).b;
                List<hfw0> b = qz8Var.b((String) obj);
                List<hfw0> subList = b.subList(1, b.size());
                ArrayList arrayList = new ArrayList(c5g.u(subList, 10));
                Iterator<T> it = subList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((hfw0) it.next()).a));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        qz8Var.a.delete(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, ((Number) it2.next()).longValue()), null, null);
                    } catch (RuntimeException e) {
                        com.vk.metrics.eventtracking.b.a.a(e);
                    }
                }
                break;
            default:
                StoriesFilterListFragment storiesFilterListFragment = (StoriesFilterListFragment) obj2;
                UserProfile userProfile = (UserProfile) obj;
                int i2 = StoriesFilterListFragment.T0;
                storiesFilterListFragment.getClass();
                int i3 = 0;
                if (fkq0.d(userProfile.c)) {
                    storiesFilterListFragment.O0.size();
                    int size = storiesFilterListFragment.O0.size();
                    while (true) {
                        if (i3 < size) {
                            UserProfile userProfile2 = storiesFilterListFragment.O0.get(i3);
                            if (userProfile2 == null || (userId2 = userProfile2.c) == null || !userId2.equals(userProfile.c)) {
                                i3++;
                            } else {
                                storiesFilterListFragment.O0.remove(userProfile2);
                            }
                        }
                    }
                } else {
                    storiesFilterListFragment.P0.size();
                    int size2 = storiesFilterListFragment.P0.size();
                    while (true) {
                        if (i3 < size2) {
                            UserProfile userProfile3 = storiesFilterListFragment.P0.get(i3);
                            if (userProfile3 == null || (userId = userProfile3.c) == null || !userId.equals(userProfile.c)) {
                                i3++;
                            } else {
                                storiesFilterListFragment.P0.remove(userProfile3);
                            }
                        }
                    }
                }
                storiesFilterListFragment.Oo();
                storiesFilterListFragment.q();
                break;
        }
    }
}
