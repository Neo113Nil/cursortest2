package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.contacts.AndroidContact;
import com.vk.contacts.ContactApiException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.g1e0;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ContactImportCmd.kt */
/* loaded from: classes2.dex */
public final class q8j extends xl6<List<? extends Long>> {
    public final Collection<AndroidContact> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* compiled from: ContactImportCmd.kt */
    public static final class a implements k7r0<b> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            JSONObject optJSONObject = jSONObject2.optJSONObject("items");
            if (optJSONObject == null) {
                return b.f;
            }
            ArrayList L = f370.L(optJSONObject.getJSONArray("synced"));
            ArrayList L2 = f370.L(optJSONObject.getJSONArray("deleted"));
            JSONArray optJSONArray = optJSONObject.optJSONArray("existing");
            return new b(L, L2, optJSONArray != null ? f370.L(optJSONArray) : EmptyList.b, optJSONObject.has("has_my_phone_number") ? optJSONObject.getBoolean("has_my_phone_number") : false, i1e0.b(jSONObject2));
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* compiled from: ContactImportCmd.kt */
    public static final class b {
        public static final b f;
        public final List<Long> a;
        public final List<Long> b;
        public final List<Long> c;
        public final boolean d;
        public final ProfilesSimpleInfo e;

        static {
            EmptyList emptyList = EmptyList.b;
            f = new b(emptyList, emptyList, emptyList, false, new ProfilesSimpleInfo());
        }

        public b(List<Long> list, List<Long> list2, List<Long> list3, boolean z, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = list;
            this.b = list2;
            this.c = list3;
            this.d = z;
            this.e = profilesSimpleInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(fw3.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "Response(syncedIds=" + this.a + ", deletedIds=" + this.b + ", existingIds=" + this.c + ", hasMyPhoneNumber=" + this.d + ", profiles=" + this.e + ')';
        }
    }

    public /* synthetic */ q8j(Collection collection, boolean z) {
        this(collection, z, true, true, false);
    }

    public static String f(Collection collection, boolean z) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AndroidContact androidContact = (AndroidContact) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_local_id", androidContact.h);
            jSONObject.put("name", androidContact.c);
            jSONObject.put("is_favorite", androidContact.d);
            Set<String> set = androidContact.e;
            JSONArray jSONArray2 = new JSONArray();
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject.put("phones", jSONArray2);
            Set<String> set2 = androidContact.g;
            JSONArray jSONArray3 = new JSONArray();
            Iterator<T> it3 = set2.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(it3.next());
            }
            jSONObject.put("emails", jSONArray3);
            if (z) {
                jSONObject.put("deleted", true);
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString();
    }

    @Override // xsna.m2w
    public final String a() {
        if (this.e) {
            return "im-contacts-sync";
        }
        return null;
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        if (this.b.isEmpty()) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (List list : p4g.p(500, j5g.H0(this.b, 5000))) {
            vua0.c("ContactImportCmd");
            if (!list.isEmpty()) {
                try {
                    ij20.a aVar = new ij20.a();
                    aVar.d = bz2.m();
                    aVar.i = this.d;
                    aVar.c = "account.importMessagesContacts";
                    aVar.b("contacts", f(list, this.c));
                    aVar.b("device_id", w2wVar.getDeviceId());
                    if (this.f) {
                        Integer num = 1;
                        aVar.f.put("with_existing", num.toString());
                    }
                    b bVar = (b) bz2.f(new ij20(aVar), new a());
                    ProfilesSimpleInfo profilesSimpleInfo = bVar.e;
                    long j = w2wVar.H0().d;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = profilesSimpleInfo.c.entrySet().iterator();
                    while (it.hasNext()) {
                        Contact contact = (Contact) ((Map.Entry) it.next()).getValue();
                        Long l = contact.j;
                        if (l != null && l.longValue() == j) {
                            arrayList2.add(Long.valueOf(contact.b));
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        profilesSimpleInfo.c.remove(Long.valueOf(((Number) it2.next()).longValue()));
                    }
                    ProfilesSimpleInfo profilesSimpleInfo2 = bVar.e;
                    ProfilesSimpleInfo profilesSimpleInfo3 = profilesSimpleInfo2.Gb() ? profilesSimpleInfo2 : null;
                    if (profilesSimpleInfo3 == null) {
                        List<Long> list2 = bVar.a;
                        g1e0.a aVar2 = new g1e0.a();
                        List<Long> list3 = list2;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                        Iterator<T> it3 = list3.iterator();
                        while (it3.hasNext()) {
                            long longValue = ((Number) it3.next()).longValue();
                            Serializer.c<Peer> cVar = Peer.CREATOR;
                            arrayList3.add(Peer.a.a(longValue, Peer.Type.CONTACT));
                        }
                        aVar2.h(arrayList3);
                        aVar2.b = Source.ACTUAL;
                        profilesSimpleInfo3 = ((ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar2)))).Ob();
                    }
                    LinkedHashMap linkedHashMap = profilesSimpleInfo3.c;
                    ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                    Iterator it4 = linkedHashMap.entrySet().iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(Contact.zb((Contact) ((Map.Entry) it4.next()).getValue(), null, true, null, null, 0L, w2wVar.f1(), 31711));
                    }
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        Contact contact2 = (Contact) it5.next();
                        linkedHashMap.put(Long.valueOf(contact2.b), contact2);
                    }
                    w2wVar.e1(this, new ka80(this, new ProfilesInfo((ProfilesSimpleInfo) new h1e0(profilesSimpleInfo3, w2wVar.f1(), false).o(w2wVar))));
                    LinkedHashMap linkedHashMap2 = profilesSimpleInfo3.c;
                    if (!linkedHashMap2.isEmpty()) {
                        Iterator it6 = linkedHashMap2.entrySet().iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            if (drm0.N(((Contact) ((Map.Entry) it6.next()).getValue()).i)) {
                                w2wVar.I0().w().m(false);
                                break;
                            }
                        }
                    }
                    arrayList.addAll(this.c ? bVar.b : this.f ? j5g.u0(bVar.c, bVar.a) : bVar.a);
                    if (bVar.d) {
                        arrayList.add(-1000L);
                    }
                } catch (VKApiExecutionException e) {
                    com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                    StringBuilder sb = new StringBuilder("Error while syncing (delete:");
                    sb.append(this.c);
                    sb.append(") ");
                    sb.append(this.b.size());
                    sb.append(" contacts, cause: ");
                    mla mlaVar = this.a;
                    sb.append(mlaVar != null ? mlaVar : null);
                    bVar2.a(new ContactApiException(sb.toString(), e));
                    throw e;
                }
            }
        }
        w2wVar.e1(this, k380.b);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8j)) {
            return false;
        }
        q8j q8jVar = (q8j) obj;
        return epx.f(this.b, q8jVar.b) && this.c == q8jVar.c && this.d == q8jVar.d && this.e == q8jVar.e && this.f == q8jVar.f;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactImportCmd(androidContacts=");
        sb.append(this.b);
        sb.append(", contactsToDelete=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        sb.append(this.d);
        sb.append(", isInCommonQueue=");
        sb.append(this.e);
        sb.append(", isLoadWithExisting=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    public q8j(Collection<AndroidContact> collection, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = collection;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }
}
