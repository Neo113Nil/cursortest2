package xsna;

import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.contacts.SortOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: ContactsListBuilder.kt */
/* loaded from: classes2.dex */
public final class nbj {
    public static final Object a = pn00.k(new Pair(SortOrder.BY_ONLINE, new oc0(15)), new Pair(SortOrder.BY_NAME, new la2(18)), new Pair(SortOrder.BY_CONTACT_NAME, new bz(16)));

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(((qtd0) t).La(), ((qtd0) t2).La());
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            long j;
            qtd0 qtd0Var = (qtd0) t2;
            long j2 = 0;
            if (qtd0Var instanceof Contact) {
                j = -1;
            } else {
                VisibleStatus zb = qtd0Var.mb().zb();
                j = zb != null ? zb.b : 0L;
            }
            Long valueOf = Long.valueOf(j);
            qtd0 qtd0Var2 = (qtd0) t;
            if (qtd0Var2 instanceof Contact) {
                j2 = -1;
            } else {
                VisibleStatus zb2 = qtd0Var2.mb().zb();
                if (zb2 != null) {
                    j2 = zb2.b;
                }
            }
            return jw5.b(valueOf, Long.valueOf(j2));
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Map] */
    public static List a(ProfilesSimpleInfo profilesSimpleInfo, SortOrder sortOrder) {
        LinkedHashMap linkedHashMap = profilesSimpleInfo.b;
        int size = linkedHashMap.size();
        LinkedHashMap linkedHashMap2 = profilesSimpleInfo.c;
        ArrayList arrayList = new ArrayList(linkedHashMap2.size() + size);
        arrayList.addAll(linkedHashMap.values());
        Collection values = linkedHashMap2.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : values) {
            if (((Contact) obj).j == null) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        return (List) ((izs) a.get(sortOrder)).invoke(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0016 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List b(long j, Collection collection, ProfilesSimpleInfo profilesSimpleInfo) {
        Long valueOf;
        LinkedHashMap linkedHashMap = profilesSimpleInfo.c;
        if (j == 0) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            qtd0 qtd0Var = (qtd0) obj;
            boolean z = qtd0Var instanceof User;
            User user = z ? (User) qtd0Var : null;
            if (user == null || user.z != 3) {
                if (z) {
                    Long l = ((User) qtd0Var).c;
                    Contact contact = l != null ? (Contact) linkedHashMap.get(l) : null;
                    if (contact != null) {
                        valueOf = Long.valueOf(contact.l);
                        boolean z2 = false;
                        if (!z) {
                            Long l2 = ((User) qtd0Var).c;
                            Contact contact2 = l2 != null ? (Contact) linkedHashMap.get(l2) : null;
                            if (contact2 != null) {
                                z2 = contact2.g;
                            }
                        } else if (qtd0Var instanceof Contact) {
                            z2 = ((Contact) qtd0Var).g;
                        }
                        if (valueOf != null && j - valueOf.longValue() < TimeUnit.DAYS.toMillis(2L) && z2) {
                            arrayList.add(obj);
                        }
                    }
                    valueOf = null;
                    boolean z22 = false;
                    if (!z) {
                    }
                    if (valueOf != null) {
                        arrayList.add(obj);
                    }
                } else {
                    if (qtd0Var instanceof Contact) {
                        valueOf = Long.valueOf(((Contact) qtd0Var).l);
                        boolean z222 = false;
                        if (!z) {
                        }
                        if (valueOf != null) {
                        }
                    }
                    valueOf = null;
                    boolean z2222 = false;
                    if (!z) {
                    }
                    if (valueOf != null) {
                    }
                }
            }
        }
        return arrayList;
    }
}
