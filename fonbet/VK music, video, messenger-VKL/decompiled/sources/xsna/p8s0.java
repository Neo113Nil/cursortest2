package xsna;

import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoCardsStatHelper.kt */
/* loaded from: classes2.dex */
public final class p8s0 {
    public final MobileOfficialAppsCoreNavStat$EventScreen a;
    public final HashMap<String, Long> b = new HashMap<>();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();

    public p8s0(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public final void a(Set<String> set, Set<String> set2) {
        HashMap<String, Long> hashMap;
        HashMap<String, Long> hashMap2;
        long currentTimeMillis = System.currentTimeMillis();
        Set<String> set3 = set2;
        boolean z = set3 instanceof List;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.a;
        HashMap<String, Long> hashMap3 = this.b;
        if (z && (set3 instanceof RandomAccess)) {
            List list = (List) set3;
            int size = list.size();
            int i = 0;
            while (i < size) {
                String str = (String) list.get(i);
                Long l = hashMap3.get(str);
                if (l != null) {
                    long longValue = l.longValue();
                    hashMap2 = hashMap3;
                    SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, str, null, 46, null);
                    CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent = new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.SHOW, CommonVideoStat$TypeScreenMode.PREVIEW);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    new bvt0(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeView.a.b(schemeStat$EventItem, String.valueOf(timeUnit.toMicros(longValue)), String.valueOf(timeUnit.toMicros(currentTimeMillis)), null, commonVideoStat$TypeVideoCardEvent, 8)).q();
                } else {
                    hashMap2 = hashMap3;
                }
                hashMap2.remove(str);
                i++;
                hashMap3 = hashMap2;
            }
            hashMap = hashMap3;
        } else {
            hashMap = hashMap3;
            for (String str2 : set3) {
                Long l2 = hashMap.get(str2);
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, str2, null, 46, null);
                    CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent2 = new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.SHOW, CommonVideoStat$TypeScreenMode.PREVIEW);
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    new bvt0(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeView.a.b(schemeStat$EventItem2, String.valueOf(timeUnit2.toMicros(longValue2)), String.valueOf(timeUnit2.toMicros(currentTimeMillis)), null, commonVideoStat$TypeVideoCardEvent2, 8)).q();
                }
                hashMap.remove(str2);
            }
        }
        Set<String> set4 = set;
        if ((set4 instanceof List) && (set4 instanceof RandomAccess)) {
            List list2 = (List) set4;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashMap.putIfAbsent((String) list2.get(i2), Long.valueOf(currentTimeMillis));
            }
        } else {
            Iterator<T> it = set4.iterator();
            while (it.hasNext()) {
                hashMap.putIfAbsent((String) it.next(), Long.valueOf(currentTimeMillis));
            }
        }
    }
}
