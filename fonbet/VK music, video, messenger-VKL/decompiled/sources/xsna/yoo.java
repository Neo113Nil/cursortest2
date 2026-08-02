package xsna;

import com.vk.toggle.data.AdsBtnAlgorithmStyle;
import java.util.ArrayList;

/* compiled from: AdsButtonConfig.kt */
/* loaded from: classes6.dex */
public final class yoo {
    public final AdsBtnAlgorithmStyle a;
    public final ArrayList b;
    public final ArrayList c;

    public yoo(AdsBtnAlgorithmStyle adsBtnAlgorithmStyle, ArrayList arrayList, ArrayList arrayList2) {
        this.a = adsBtnAlgorithmStyle;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoo)) {
            return false;
        }
        yoo yooVar = (yoo) obj;
        return this.a == yooVar.a && this.b.equals(yooVar.b) && this.c.equals(yooVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qr.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicColorButtonConfig(algorithmStyle=");
        sb.append(this.a);
        sb.append(", animations=");
        sb.append(this.b);
        sb.append(", palette=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
    }
}
