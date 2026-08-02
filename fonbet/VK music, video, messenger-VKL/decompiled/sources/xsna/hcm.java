package xsna;

import com.vk.im.engine.models.typing.ComposingType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: DialogComposing.kt */
/* loaded from: classes2.dex */
public final class hcm {
    public final long a;
    public List<vh30> b;

    public hcm(long j, List<vh30> list) {
        this.a = j;
        this.b = j5g.O0(list);
    }

    public final boolean a(List<vh30> list) {
        if (this.b.size() != list.size()) {
            return false;
        }
        int i = 0;
        for (Object obj : this.b) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            vh30 vh30Var = (vh30) obj;
            vh30 vh30Var2 = (vh30) j5g.b0(i, list);
            if (vh30Var2 == null || vh30Var2.b != vh30Var.b) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public final ComposingType b() {
        if (this.b.isEmpty()) {
            return ComposingType.TEXT;
        }
        List<vh30> list = this.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ComposingType composingType = ((vh30) it.next()).b;
                ComposingType composingType2 = ComposingType.TEXT;
                if (composingType == composingType2) {
                    return composingType2;
                }
            }
        }
        List<vh30> list2 = this.b;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                ComposingType composingType3 = ((vh30) it2.next()).b;
                ComposingType composingType4 = ComposingType.AUDIO;
                if (composingType3 == composingType4) {
                    return composingType4;
                }
            }
        }
        List<vh30> list3 = this.b;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                ComposingType composingType5 = ((vh30) it3.next()).b;
                ComposingType composingType6 = ComposingType.PHOTO;
                if (composingType5 == composingType6) {
                    return composingType6;
                }
            }
        }
        List<vh30> list4 = this.b;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                ComposingType composingType7 = ((vh30) it4.next()).b;
                ComposingType composingType8 = ComposingType.VIDEO;
                if (composingType7 == composingType8) {
                    return composingType8;
                }
            }
        }
        List<vh30> list5 = this.b;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator<T> it5 = list5.iterator();
            while (it5.hasNext()) {
                ComposingType composingType9 = ((vh30) it5.next()).b;
                ComposingType composingType10 = ComposingType.FILE;
                if (composingType9 == composingType10) {
                    return composingType10;
                }
            }
        }
        List<vh30> list6 = this.b;
        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
            Iterator<T> it6 = list6.iterator();
            while (it6.hasNext()) {
                ComposingType composingType11 = ((vh30) it6.next()).b;
                ComposingType composingType12 = ComposingType.VIDEO_MSG;
                if (composingType11 == composingType12) {
                    return composingType12;
                }
            }
        }
        return ComposingType.TEXT;
    }

    public final boolean c() {
        return !this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hcm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hcm hcmVar = (hcm) obj;
        if (this.a != hcmVar.a) {
            return false;
        }
        return a(hcmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogComposing(id=");
        sb.append(this.a);
        sb.append(", composings=");
        return ms9.a(')', sb, this.b);
    }
}
