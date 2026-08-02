package defpackage;

import io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class l9s implements h9s, qty {
    public boolean a;
    public boolean b;
    public final Object c;

    public l9s(List list, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.c = arrayList;
        if (z) {
            c();
        }
    }

    public void a(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        while (i < arrayList.size()) {
            arrayList.set(i, apu.a((apu) arrayList.get(i), null, 30));
            i++;
        }
    }

    public String b() {
        ArrayList arrayList = (ArrayList) this.c;
        if (!g()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size() && ((apu) arrayList.get(i)).a != null; i++) {
            sb.append(((apu) arrayList.get(i)).a);
        }
        return sb.toString();
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i = 0; i >= 0 && i < arrayList.size() && !((apu) arrayList.get(i)).b; i++) {
            apu apuVar = (apu) arrayList.get(i);
            arrayList.set(i, apu.a(apuVar, apuVar.c, 14));
        }
    }

    public int d(int i, String str) {
        Iterator it;
        j9s j9sVar = j9s.b;
        j9s j9sVar2 = j9s.a;
        ArrayList arrayList = (ArrayList) this.c;
        if (!f(i)) {
            return b().length();
        }
        List C0 = gvu0.C0(str);
        StringBuilder sb = new StringBuilder();
        int i2 = i;
        for (int i3 = i2; i2 <= i3 && i3 < arrayList.size() && ((apu) arrayList.get(i3)).a != null; i3++) {
            apu apuVar = (apu) arrayList.get(i3);
            if (!apuVar.e && apuVar.b) {
                sb.append(apuVar.a);
            }
        }
        String sb2 = sb.toString();
        a(i);
        Iterator it2 = C0.iterator();
        while (it2.hasNext()) {
            Character ch = (Character) it2.next();
            char charValue = ch.charValue();
            int i4 = 1;
            Object obj = j9sVar2;
            int i5 = i2;
            while (i5 < arrayList.size() && obj.equals(j9sVar2)) {
                apu apuVar2 = (apu) arrayList.get(i5);
                boolean z = apuVar2.b;
                Character ch2 = apuVar2.c;
                if (z && apuVar2.a == null) {
                    Iterator it3 = apuVar2.d.iterator();
                    while (it3.hasNext()) {
                        ((pjj) it3.next()).getClass();
                        if (!Character.isDigit(charValue)) {
                        }
                    }
                    it = it2;
                    arrayList.set(i5, apu.a(apuVar2, ch, 30));
                    obj = new k9s(i4);
                    i4++;
                    i5++;
                    it2 = it;
                }
                it = it2;
                if (this.b && !z && ch2 != null && charValue == ch2.charValue()) {
                    arrayList.set(i5, apu.a(apuVar2, ch2, 30));
                    obj = new k9s(i4);
                } else if (z) {
                    obj = j9sVar;
                } else {
                    arrayList.set(i5, apu.a(apuVar2, ch2, 30));
                }
                i4++;
                i5++;
                it2 = it;
            }
            Iterator it4 = it2;
            if (obj.equals(j9sVar2)) {
                break;
            }
            if (!obj.equals(j9sVar)) {
                if (!(obj instanceof k9s)) {
                    w511.b();
                    return 0;
                }
                i2 += ((k9s) obj).a;
            }
            it2 = it4;
        }
        if (i2 >= 0 && i2 < arrayList.size() && !((apu) arrayList.get(i2)).b) {
            while (i2 < arrayList.size() && !((apu) arrayList.get(i2)).b) {
                arrayList.set(i2, apu.a((apu) arrayList.get(i2), ((apu) arrayList.get(i2)).c, 30));
                i2++;
            }
        }
        e(i2, sb2);
        return i2;
    }

    public int e(int i, String str) {
        i9s i9sVar;
        ArrayList arrayList = (ArrayList) this.c;
        List<Character> C0 = gvu0.C0(str);
        if (C0.isEmpty() && this.a) {
            c();
            return b().length();
        }
        int i2 = i;
        for (Character ch : C0) {
            char charValue = ch.charValue();
            int size = arrayList.size();
            int i3 = 1;
            int i4 = i2;
            while (true) {
                if (i4 >= size) {
                    i9sVar = null;
                    break;
                }
                apu apuVar = (apu) arrayList.get(i4);
                boolean z = apuVar.b;
                if (z && apuVar.a == null) {
                    i9sVar = new i9s(apuVar, i3);
                    break;
                }
                if (!z) {
                    arrayList.set(i4, apu.a(apuVar, apuVar.c, 30));
                }
                i3++;
                i4++;
            }
            if (i9sVar == null) {
                break;
            }
            apu apuVar2 = i9sVar.a;
            Iterator it = apuVar2.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 += i9sVar.b;
                    arrayList.set(i2 - 1, apu.a(apuVar2, ch, 30));
                    break;
                }
                ((pjj) it.next()).getClass();
                if (!Character.isDigit(charValue)) {
                    break;
                }
            }
        }
        return i;
    }

    public boolean f(int i) {
        return i >= 0 && i <= ((ArrayList) this.c).size() && i <= b().length() && g();
    }

    public boolean g() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((apu) it.next()).b) {
                return true;
            }
        }
        return false;
    }

    public int h(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        if (!f(i) || i2 < 1 || i2 > b().length()) {
            return b().length();
        }
        int i3 = i2 + i;
        int i4 = i3 - 1;
        if (((apu) arrayList.get(i4)).e) {
            return i3;
        }
        boolean z = ((apu) arrayList.get(i4)).b;
        String b = b();
        String substring = b.substring(0, i).concat(b.substring(i3)).substring(i);
        a(i);
        while (i > 0 && !((apu) arrayList.get(i)).b) {
            arrayList.set(i, apu.a((apu) arrayList.get(i), null, 30));
            i--;
            if (i <= 0 || ((apu) arrayList.get(i)).b) {
                break;
            }
        }
        if (!z) {
            arrayList.set(i, apu.a((apu) arrayList.get(i), null, 30));
        }
        int i5 = i - 1;
        if (i5 >= 0 && i5 < arrayList.size() && !((apu) arrayList.get(i5)).b && !((apu) arrayList.get(i5)).e) {
            while (i5 >= 0 && !((apu) arrayList.get(i5)).b) {
                arrayList.set(i5, apu.a((apu) arrayList.get(i5), null, 30));
                i5--;
                i--;
            }
        }
        return e(i, substring);
    }

    @Override // defpackage.qty
    public void onChanged(int i, int i2, Object obj) {
        ((hs10) this.c).notifyItemRangeChanged(i, i2, obj);
    }

    @Override // defpackage.qty
    public void onInserted(int i, int i2) {
        ((hs10) this.c).notifyItemRangeInserted(i, i2);
        if (i == 0) {
            this.a = true;
        }
    }

    @Override // defpackage.qty
    public void onMoved(int i, int i2) {
        ((hs10) this.c).notifyItemMoved(i, i2);
        if (i == 0 || i2 == 0) {
            this.b = true;
        }
    }

    @Override // defpackage.qty
    public void onRemoved(int i, int i2) {
        ((hs10) this.c).notifyItemRangeRemoved(i, i2);
    }

    public l9s(boolean z, boolean z2, Double d) {
        this.a = z;
        this.b = z2;
        this.c = d;
    }

    public l9s(boolean z, boolean z2) {
        this.c = new kk8(0);
        this.a = z;
        this.b = z2;
    }

    public l9s(TextInputChannel$TextInputType textInputChannel$TextInputType, boolean z, boolean z2) {
        this.c = textInputChannel$TextInputType;
        this.a = z;
        this.b = z2;
    }
}
