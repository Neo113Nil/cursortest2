package xsna;

import com.vk.newsfeed.api.posting.author.PostingAuthor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: AdminCommunitiesDataSource.kt */
/* loaded from: classes4.dex */
public final class ut0 {
    public static final ArrayList a(List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((PostingAuthor.Community) obj).b)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
