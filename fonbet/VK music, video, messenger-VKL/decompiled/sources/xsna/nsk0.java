package xsna;

import com.vk.dto.common.StatPixel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StatPixelList.kt */
/* loaded from: classes18.dex */
public final class nsk0 {
    public final ArrayList a;

    public nsk0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List<StatPixel> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nsk0) && this.a.equals(((nsk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("StatPixelList(list="), this.a);
    }
}
