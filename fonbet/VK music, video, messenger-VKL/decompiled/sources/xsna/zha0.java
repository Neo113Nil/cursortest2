package xsna;

import com.vk.translate.impl.models.LanguageModel;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SelectLanguageScreenState.kt */
/* loaded from: classes6.dex */
public final class zha0 {
    public final LanguageModel a;
    public final ArrayList b;
    public final int c;

    public zha0(LanguageModel languageModel, ArrayList arrayList) {
        this.a = languageModel;
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mai0) it.next()).a);
        }
        this.c = arrayList2.indexOf(languageModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zha0)) {
            return false;
        }
        zha0 zha0Var = (zha0) obj;
        return epx.f(this.a, zha0Var.a) && this.b.equals(zha0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickerLanguageState(language=");
        sb.append(this.a);
        sb.append(", languagesForSelect=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
