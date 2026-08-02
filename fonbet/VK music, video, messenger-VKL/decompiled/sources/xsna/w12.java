package xsna;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SyncRequest;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.provider.ContactsContract;
import com.vk.contacts.AndroidContact;
import com.vk.im.engine.external.a.C1112a;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Pair;

/* compiled from: AndroidAddressBookUpdater.kt */
/* loaded from: classes.dex */
public final class w12 implements com.vk.contacts.a {
    public final com.vk.im.engine.external.a b;
    public final apv0 c;
    public final ExecutorService d;
    public final Context e;
    public final u62 f;
    public volatile Future<?> g;
    public final qs0 h;
    public final bpn0 i;
    public final int j;
    public final bpn0 k;
    public final bpn0 l;

    public w12(com.vk.im.engine.external.a aVar, apv0 apv0Var, ExecutorService executorService, Context context) {
        u62 u62Var = new u62(context, apv0Var);
        this.b = aVar;
        this.c = apv0Var;
        this.d = executorService;
        this.e = context;
        this.f = u62Var;
        this.h = new qs0(context);
        this.i = new bpn0(new q12(this, 0));
        this.j = 20;
        this.k = new bpn0(new r12(0));
        this.l = new bpn0(new s12(0));
    }

    public static ContentProviderOperation e(w12 w12Var, gek0 gek0Var, String str, Integer num, String str2, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return w12Var.d(num, str2, str).withValue("data1", gek0Var.c()).withValue("data2", w12Var.e.getString(R.string.contact_profile_title)).withValue("data3", gek0Var.b(str)).build();
    }

    public static ContentProviderOperation f(w12 w12Var, gek0 gek0Var, Integer num, String str, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return w12Var.d(num, str, "vnd.android.cursor.item/name").withValue("data1", gek0Var.a()).withValue("data2", gek0Var.a()).withValue("data3", gek0Var.d()).build();
    }

    @Override // com.vk.contacts.a
    public final synchronized void a() {
        try {
            if (c().isEmpty()) {
                return;
            }
            Future<?> future = this.g;
            if (future != null) {
                future.cancel(true);
            }
            this.g = this.d.submit(new t12(this, 0));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        qs0 qs0Var = this.h;
        synchronized (qs0Var) {
            ((SharedPreferences) qs0Var.b.getValue()).edit().clear().apply();
        }
        boolean l = enj.l(this.e, "android.permission.WRITE_CONTACTS");
        Account a = this.c.a();
        if (!l || a == null) {
            return;
        }
        Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_type", a.type).appendQueryParameter("account_name", a.name).appendQueryParameter("caller_is_syncadapter", "true").build();
        Context context = this.e;
        L.e("VkContactManager", efz.a(context.getContentResolver().delete(build, null, null), context.getContentResolver().delete(ContactsContract.Data.CONTENT_URI, ho8.a(new StringBuilder("mimetype IN ("), j5g.g0(c(), null, null, null, 0, new com.vk.movika.sdk.base.observable.e0(2), 31), ')'), null), "deleteImpl rawResult=", ", dataResult="));
    }

    public final List<String> c() {
        return (List) this.i.getValue();
    }

    public final ContentProviderOperation.Builder d(Integer num, String str, String str2) {
        ContentProviderOperation.Builder withSelection;
        bpn0 bpn0Var = this.l;
        if (num != null) {
            withSelection = ContentProviderOperation.newInsert((Uri) bpn0Var.getValue()).withValueBackReference("raw_contact_id", num.intValue());
        } else {
            if (str == null) {
                throw new UnsupportedOperationException();
            }
            withSelection = ContentProviderOperation.newUpdate((Uri) bpn0Var.getValue()).withSelection(xqm0.g(" \n                        raw_contact_id='" + str + "' AND mimetype='" + str2 + "'\n                    "), null);
        }
        return withSelection.withValue("mimetype", str2);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void g() {
        Map s;
        Integer valueOf;
        ArrayList<ContentProviderOperation> arrayList;
        int i;
        Account a = this.c.a();
        L.e("VkContactManager", "update sysAccount=" + a);
        if (a == null) {
            return;
        }
        ContentResolver.requestSync(new SyncRequest.Builder().setManual(true).syncOnce().setExtras(new Bundle()).setSyncAdapter(a, "com.android.contacts").build());
        LinkedHashMap b = this.f.b();
        com.vk.im.engine.external.a aVar = this.b;
        Collection<AndroidContact> values = b.values();
        if (((b25) aVar.a.getValue()).b()) {
            Map map = (Map) vdg0.a(((a1w) aVar.b.getValue()).n("ImSocialProfilesProvider", new p9j("ImSocialProfilesProvider")), new f1s(4));
            ArrayList arrayList2 = new ArrayList();
            for (AndroidContact androidContact : values) {
                Contact contact = (Contact) map.get(String.valueOf(androidContact.d()));
                Pair pair = contact == null ? null : new Pair(androidContact, aVar.new C1112a(contact));
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            s = pn00.s(arrayList2);
        } else {
            s = jgp.b;
        }
        Collection values2 = s.values();
        HashMap hashMap = new HashMap(values2.size());
        for (Object obj : values2) {
            hashMap.put(((gek0) obj).c(), obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap2 = new HashMap(hashMap);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = hashMap2.values().iterator();
        while (it.hasNext()) {
            L.e("VkContactManager", "profilesToInsert profiles = " + ((gek0) it.next()).c() + ' ');
        }
        Cursor query = this.e.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id", "sync1", "deleted"}, "account_type=? AND account_name=?", new String[]{a.type, a.name}, null);
        if (query != null) {
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (query.moveToFirst()) {
                        while (!query.isAfterLast()) {
                            String E = fl3.E(query, "sync1");
                            String E2 = fl3.E(query, "_id");
                            String F = fl3.F(query, "deleted");
                            boolean z = F != null && F.equals("1");
                            L.e("VkContactManager", "profiles query profileId= " + E + " rawContactId " + E2 + " deleted " + z);
                            if (!hashMap2.containsKey(E) || z) {
                                L.e("VkContactManager", "add deleted profileId = " + E);
                                linkedHashSet.add(E);
                            } else {
                                linkedHashMap.put(E2, hashMap2.remove(E));
                            }
                            query.moveToNext();
                        }
                    }
                    query.close();
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        }
        L.e("VkContactManager", "check hashcode");
        qs0 qs0Var = this.h;
        synchronized (qs0Var) {
            String str = "key_contacts_hash_code_" + a.type + '_' + a.name;
            valueOf = ((SharedPreferences) qs0Var.b.getValue()).contains(str) ? Integer.valueOf(((SharedPreferences) qs0Var.b.getValue()).getInt(str, 0)) : null;
        }
        int i2 = 1;
        for (gek0 gek0Var : j5g.D0(new v12(0), j5g.u0(linkedHashMap.values(), hashMap2.values()))) {
            int i3 = i2 * 31;
            int hashCode = gek0Var.f().hashCode() + ((gek0Var.d().hashCode() + ((gek0Var.a().hashCode() + ((gek0Var.c().hashCode() + 31) * 31)) * 31)) * 31);
            for (String str2 : j5g.C0(c())) {
                hashCode = gek0Var.b(str2).hashCode() + ((Boolean.hashCode(gek0Var.e(str2)) + (hashCode * 31)) * 31);
            }
            i2 = i3 + hashCode;
        }
        if (valueOf != null && valueOf.intValue() == i2) {
            L.e("VkContactManager", "hashcode equals stop sync");
            return;
        }
        L.e("VkContactManager", "profiles to insert=" + hashMap2.size() + ", update=" + linkedHashMap.size() + ", delete=" + linkedHashSet.size());
        ArrayList<ContentProviderOperation> arrayList3 = new ArrayList<>();
        if (!linkedHashSet.isEmpty()) {
            L.e("VkContactManager", "deleted profiles = " + linkedHashSet.size() + ", links=" + this.e.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_type", a.type).appendQueryParameter("account_name", a.name).appendQueryParameter("caller_is_syncadapter", "true").build(), ho8.a(new StringBuilder("sync1 IN ("), j5g.g0(linkedHashSet, StringUtils.COMMA, null, null, 0, null, 62), ')'), null));
        }
        for (List<gek0> list : p4g.p(this.j, hashMap2.values())) {
            if (list.isEmpty()) {
                arrayList = arrayList3;
                i = i2;
            } else {
                arrayList3.clear();
                for (gek0 gek0Var2 : list) {
                    String c = gek0Var2.c();
                    int size = arrayList3.size();
                    arrayList3.add(ContentProviderOperation.newInsert((Uri) this.k.getValue()).withValue("account_name", a.name).withValue("account_type", a.type).withValue("sync1", c).build());
                    arrayList3.add(f(this, gek0Var2, Integer.valueOf(size), null, 4));
                    for (String str3 : c()) {
                        ArrayList<ContentProviderOperation> arrayList4 = arrayList3;
                        p4g.a(e(this, gek0Var2, str3, Integer.valueOf(size), null, 8), arrayList4, gek0Var2.e(str3));
                        i2 = i2;
                        arrayList3 = arrayList4;
                    }
                }
                arrayList = arrayList3;
                i = i2;
                L.e("VkContactManager", "inserted profiles = " + list.size() + ", links=" + this.e.getContentResolver().applyBatch("com.android.contacts", arrayList).length);
            }
            i2 = i;
            arrayList3 = arrayList;
        }
        ArrayList<ContentProviderOperation> arrayList5 = arrayList3;
        int i4 = i2;
        for (List<Map.Entry> list2 : p4g.p(this.j, linkedHashMap.entrySet())) {
            if (!list2.isEmpty()) {
                arrayList5.clear();
                for (Map.Entry entry : list2) {
                    String str4 = (String) entry.getKey();
                    gek0 gek0Var3 = (gek0) entry.getValue();
                    arrayList5.add(f(this, gek0Var3, null, str4, 2));
                    for (String str5 : c()) {
                        p4g.a(e(this, gek0Var3, str5, null, str4, 4), arrayList5, gek0Var3.e(str5));
                    }
                }
                this.e.getContentResolver().applyBatch("com.android.contacts", arrayList5);
                L.e("VkContactManager", "updated profiles = " + list2.size());
            }
        }
        qs0 qs0Var2 = this.h;
        synchronized (qs0Var2) {
            ((SharedPreferences) qs0Var2.b.getValue()).edit().putInt("key_contacts_hash_code_" + a.type + '_' + a.name, i4).apply();
        }
        this.e.getContentResolver().notifyChange(ContactsContract.RawContacts.CONTENT_URI, (ContentObserver) null, true);
    }
}
