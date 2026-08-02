package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes12.dex */
public abstract class z46 implements fg2, ay40 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ z46(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public static PendingIntent Z(Context context, Intent intent) {
        intent.putExtra("music_notification", "notification");
        return t2i0.c(intent, context, false, new fcc0(context, 0, intent, 1));
    }

    public abstract Object B();

    public List F(qty qtyVar, int i, long j) {
        pg50 pg50Var = (pg50) this.c;
        List list = (List) pg50Var.b(i);
        if (list != null) {
            return list;
        }
        List<zo10> c = qtyVar.c(i);
        int size = c.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 0;
        while (i2 < size) {
            i2 = rf3.a(c.get(i2), j, arrayList, i2, 1);
        }
        pg50Var.k(i, arrayList);
        return arrayList;
    }

    public abstract xwv0 L();

    public abstract ApiErrorViewType P(ehg ehgVar, g1x g1xVar);

    public abstract void S(Object obj);

    @Override // xsna.fg2
    public boolean d() {
        List list = (List) this.c;
        return list.isEmpty() || (list.size() == 1 && ((nhy) list.get(0)).c());
    }

    public abstract void f0(wlp0 wlp0Var);

    public abstract void h0();

    @Override // xsna.fg2
    public List l() {
        return (List) this.c;
    }

    public boolean m() {
        xwv0 L = L();
        return L != null && L.o();
    }

    public String toString() {
        switch (this.b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.c;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public abstract rty x(int i, int i2, int i3, long j);

    public z46(int i) {
        this.b = i;
        switch (i) {
            case 5:
                this.c = androidx.compose.runtime.k.b(Boolean.FALSE);
                break;
            default:
                this.c = g9x.a();
                break;
        }
    }
}
