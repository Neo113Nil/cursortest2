package xsna;

import java.util.ArrayList;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class wgt implements jmu {
    public ArrayList<Object> a;

    @Override // xsna.jmu
    public final ArrayList<Object> a() {
        return this.a;
    }

    @Override // xsna.jmu
    public final String b() {
        return null;
    }

    @Override // xsna.jmu
    public final int c() {
        return 0;
    }

    @Override // xsna.jmu
    public final boolean d() {
        return false;
    }

    @Override // xsna.jmu
    public final int e() {
        return 0;
    }

    public final boolean f(rgt rgtVar) {
        ArrayList<Object> arrayList = this.a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (epx.f(obj, rgtVar)) {
                    return true;
                }
                if ((obj instanceof wgt) && ((wgt) obj).f(rgtVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final wgt g() {
        Object obj;
        ArrayList<Object> arrayList = this.a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if (obj instanceof wgt) {
                    ((wgt) obj).getClass();
                    break;
                }
            }
        }
        obj = null;
        wgt wgtVar = obj instanceof wgt ? (wgt) obj : null;
        return wgtVar != null ? wgtVar.g() : this;
    }

    @Override // xsna.jmu
    public final int getKey() {
        return 0;
    }

    public final boolean h(rgt rgtVar) {
        ArrayList<Object> arrayList = this.a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof rgt) {
                    if (epx.f(obj, rgtVar)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof wgt) && !((wgt) obj).h(rgtVar)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.a = null;
                return false;
            }
        }
        return true;
    }
}
