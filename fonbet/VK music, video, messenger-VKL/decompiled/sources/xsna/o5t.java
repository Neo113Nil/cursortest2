package xsna;

import com.vk.core.tool.view.galvitalayout.GalvitaLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GalvitaAdapter.kt */
/* loaded from: classes17.dex */
public abstract class o5t<T> {
    public final ArrayList<T> a = new ArrayList<>();
    public GalvitaLayout b;

    public abstract float a(int i);

    public abstract int b(int i);

    public abstract void c(d6t d6tVar, int i);

    public abstract d6t d(GalvitaLayout galvitaLayout, int i);

    public void e(List<? extends T> list) {
        ArrayList<T> arrayList = this.a;
        arrayList.clear();
        List<? extends T> list2 = list;
        if (!list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        GalvitaLayout galvitaLayout = this.b;
        if (galvitaLayout != null) {
            galvitaLayout.a();
        }
    }
}
