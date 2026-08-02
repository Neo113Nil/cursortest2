package ru.ok.android.webrtc.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class f {
    public static final Pattern e = Pattern.compile("^a=(?:rtcp-fb|fmtp):(\\d+) (apt=(\\d+))?.*$");
    public static final Pattern f = Pattern.compile("^a=rtpmap:(\\d+) ([a-zA-Z0-9-]+)(/\\d+)+[\r]?$");
    public final HashSet a;
    public final String b;
    public final int c;
    public final LinkedHashMap d;

    public f(String str, int i, LinkedHashMap linkedHashMap) {
        this.b = str;
        this.c = i;
        this.d = linkedHashMap;
        this.a = new HashSet(linkedHashMap.size() * 7);
    }

    public static f a(String str, int i) {
        List asList = Arrays.asList(str.split(" "));
        if (asList.size() <= 3) {
            return null;
        }
        int i2 = 0;
        asList.subList(0, 3);
        ArrayList arrayList = new ArrayList(asList.subList(3, asList.size()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size(), 2.0f);
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = (String) obj;
            linkedHashMap.put(str2, new e(str2));
        }
        return new f(str, i, linkedHashMap);
    }

    public final void b(StringBuilder sb, List list, boolean z) {
        if (!a(list) && !z) {
            sb.append(this.b);
            sb.append("\r\n");
            return;
        }
        List subList = Arrays.asList(this.b.split(" ")).subList(0, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(' ');
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArrayList a = a((String) it2.next());
            int size = a.size();
            int i = 0;
            while (i < size) {
                Object obj = a.get(i);
                i++;
                e eVar = (e) obj;
                sb.append(eVar.a);
                sb.append(' ');
                ArrayList arrayList2 = eVar.d;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    String str = (String) obj2;
                    sb.append(str);
                    sb.append(' ');
                    arrayList.add(str);
                }
            }
        }
        if (!z) {
            for (e eVar2 : this.d.values()) {
                if (!list.contains(eVar2.b) && !arrayList.contains(eVar2.a)) {
                    sb.append(eVar2.a);
                    sb.append(' ');
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("\r\n");
    }

    public final void a(StringBuilder sb, List list, boolean z) {
        if (!a(list) && !z) {
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((e) it.next()).c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    sb.append((String) obj);
                    sb.append("\r\n");
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArrayList a = a((String) it2.next());
            int size2 = a.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = a.get(i2);
                i2++;
                e eVar = (e) obj2;
                ArrayList arrayList3 = eVar.c;
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    sb.append((String) obj3);
                    sb.append("\r\n");
                }
                ArrayList arrayList4 = eVar.d;
                int size4 = arrayList4.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj4 = arrayList4.get(i4);
                    i4++;
                    String str = (String) obj4;
                    e eVar2 = (e) this.d.get(str);
                    if (eVar2 != null) {
                        ArrayList arrayList5 = eVar2.c;
                        int size5 = arrayList5.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            Object obj5 = arrayList5.get(i5);
                            sb.append((String) obj5);
                            sb.append("\r\n");
                        }
                        arrayList2.add(str);
                    }
                }
            }
        }
        if (z) {
            return;
        }
        for (e eVar3 : this.d.values()) {
            if (!list.contains(eVar3.b) && !arrayList2.contains(eVar3.a)) {
                ArrayList arrayList6 = eVar3.c;
                int size6 = arrayList6.size();
                int i6 = 0;
                while (i6 < size6) {
                    Object obj6 = arrayList6.get(i6);
                    i6++;
                    sb.append((String) obj6);
                    sb.append("\r\n");
                }
            }
        }
    }

    public final void b(String str, int i) {
        e eVar;
        e eVar2;
        e eVar3;
        if (str.startsWith("a=")) {
            Matcher matcher = e.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(3);
                if (group2 != null && (eVar3 = (e) this.d.get(group2)) != null) {
                    eVar3.d.add(group);
                }
                if (group == null || (eVar2 = (e) this.d.get(group)) == null) {
                    return;
                }
                eVar2.c.add(str);
                this.a.add(Integer.valueOf(i));
                return;
            }
            Matcher matcher2 = f.matcher(str);
            if (matcher2.matches()) {
                String group3 = matcher2.group(1);
                String group4 = matcher2.group(2);
                if (group4 == null || group3 == null || (eVar = (e) this.d.get(group3)) == null) {
                    return;
                }
                eVar.b = group4;
                e eVar4 = (e) this.d.get(group3);
                if (eVar4 == null) {
                    return;
                }
                eVar4.c.add(str);
                this.a.add(Integer.valueOf(i));
            }
        }
    }

    public final boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!a((String) it.next()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.d.values()) {
            if (Objects.equals(str, eVar.b)) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }
}
