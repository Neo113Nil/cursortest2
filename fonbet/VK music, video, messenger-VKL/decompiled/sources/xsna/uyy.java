package xsna;

import com.vk.api.generated.leadForms.dto.LeadFormsLeadFormLeadAnswerDto;
import com.vk.internal.api.GsonHolder;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: LeadFormRepositoryImpl.kt */
/* loaded from: classes14.dex */
public final class uyy implements tyy {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public String e;
    public String f;
    public String g;
    public String h;

    @Override // xsna.tyy
    public final boolean a(String str, String str2) {
        Map map = (Map) this.a.get(str);
        Map map2 = (Map) this.b.get(str);
        ArrayList arrayList = map != null ? (ArrayList) map.get(str2) : null;
        if (arrayList == null || arrayList.isEmpty()) {
            return myc0.f(map2 != null ? (String) map2.get(str2) : null);
        }
        return true;
    }

    @Override // xsna.tyy
    public final String b(String str, String str2) {
        Map map = (Map) this.b.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // xsna.tyy
    public final void c(int i, String str) {
        this.c.put(str, Integer.valueOf(i));
    }

    @Override // xsna.tyy
    public final void d(String str) {
        this.f = str;
    }

    @Override // xsna.tyy
    public final void e(String str) {
        this.e = str;
    }

    @Override // xsna.tyy
    public final void f(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = this.b;
        Map map = (Map) linkedHashMap.get(str);
        if (map == null) {
            map = new LinkedHashMap();
            linkedHashMap.put(str, map);
        }
        map.put(str2, str3);
    }

    @Override // xsna.tyy
    public final boolean g(String str, String str2, String str3) {
        ArrayList arrayList;
        Map map = (Map) this.a.get(str);
        return (map == null || (arrayList = (ArrayList) map.get(str2)) == null || !arrayList.contains(str3)) ? false : true;
    }

    @Override // xsna.tyy
    public final void h(String str, String str2, String str3) {
        ArrayList arrayList;
        Map map = (Map) this.a.get(str);
        if (map == null || (arrayList = (ArrayList) map.get(str2)) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str3)) {
                it.remove();
            }
        }
    }

    @Override // xsna.tyy
    public final void i(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = this.a;
        Map map = (Map) linkedHashMap.get(str);
        if (map == null) {
            map = new LinkedHashMap();
            linkedHashMap.put(str, map);
        }
        ArrayList arrayList = (ArrayList) map.get(str2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str2, arrayList);
        }
        arrayList.add(str3);
    }

    @Override // xsna.tyy
    public final int j(String str) {
        Integer num = (Integer) this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // xsna.tyy
    public final void k(String str) {
        this.g = str;
    }

    @Override // xsna.tyy
    public final void l(String str) {
        this.h = str;
    }

    @Override // xsna.tyy
    public final void m(String str, String str2) {
        this.d.put(str, str2);
    }

    @Override // xsna.tyy
    public final io.reactivex.rxjava3.internal.operators.observable.f0 n(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        Set<Map.Entry> entrySet;
        Set<Map.Entry> entrySet2;
        ArrayList arrayList = new ArrayList();
        Map map = (Map) this.a.get(str);
        if (map != null && (entrySet2 = map.entrySet()) != null) {
            for (Map.Entry entry : entrySet2) {
                arrayList.add(new LeadFormsLeadFormLeadAnswerDto((String) entry.getKey(), (List) entry.getValue(), null, 4, null));
            }
        }
        Map map2 = (Map) this.b.get(str);
        if (map2 != null && (entrySet = map2.entrySet()) != null) {
            for (Map.Entry entry2 : entrySet) {
                arrayList.add(new LeadFormsLeadFormLeadAnswerDto((String) entry2.getKey(), null, (String) entry2.getValue(), 2, null));
            }
        }
        String h = ShitAttachment.LeadForm.ContactField.PHONE.h();
        LinkedHashMap linkedHashMap = this.d;
        String str7 = (String) linkedHashMap.get(h);
        String str8 = (String) linkedHashMap.get(ShitAttachment.LeadForm.ContactField.EMAIL.h());
        if (str7 == null || !str7.equals(this.h)) {
            str3 = str7;
            str4 = null;
        } else {
            str4 = this.f;
            str3 = null;
        }
        if (str8 == null || !str8.equals(this.g)) {
            str5 = str8;
            str6 = null;
        } else {
            str6 = this.e;
            str5 = null;
        }
        String str9 = (String) linkedHashMap.get(ShitAttachment.LeadForm.ContactField.FIRST_NAME.h());
        String str10 = (String) linkedHashMap.get(ShitAttachment.LeadForm.ContactField.BIRTH_DATE.h());
        String str11 = (String) linkedHashMap.get(ShitAttachment.LeadForm.ContactField.CITY.h());
        String str12 = (String) linkedHashMap.get(ShitAttachment.LeadForm.ContactField.SOCIAL_MEDIA_PROFILE.h());
        tfx tfxVar = new tfx("leadForms.saveLeadFormLead", new uq(16), new vq(19));
        tfx.o(tfxVar, "lead_form_data", str2, 0, 0, 12);
        tfx.o(tfxVar, "form_id", str, 0, 0, 12);
        if (str9 != null) {
            tfx.o(tfxVar, "first_name", str9, 0, 0, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "email", str5, 0, 0, 12);
        }
        if (str6 != null) {
            tfx.o(tfxVar, "email_hash", str6, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "phone", str3, 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "phone_hash", str4, 0, 0, 12);
        }
        if (str10 != null) {
            tfx.o(tfxVar, "birth_date", str10, 0, 0, 12);
        }
        if (str11 != null) {
            tfx.o(tfxVar, "city", str11, 0, 0, 12);
        }
        if (str12 != null) {
            tfx.o(tfxVar, "social_media_profile", str12, 0, 0, 12);
        }
        tfx.o(tfxVar, "answers", GsonHolder.a().toJson(arrayList), 0, 0, 12);
        return rsg0.D0(yfb.x(tfxVar));
    }
}
