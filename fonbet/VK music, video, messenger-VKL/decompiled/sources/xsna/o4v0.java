package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: VkMixSettingsAdapter.kt */
/* loaded from: classes3.dex */
public abstract class o4v0<T extends RecyclerView.e0> extends RecyclerView.Adapter<T> {
    public final ArrayList c = new ArrayList();
    public int d = -1;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r0 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r3 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r2 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        r4.d = r2;
        notifyDataSetChanged();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setItems(List<MixOption> list) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        List<MixOption> list2 = list;
        arrayList.addAll(list2);
        Iterator<T> it = list2.iterator();
        int i = 0;
        while (true) {
            int i2 = -1;
            Integer num = null;
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (((MixOption) next).f) {
                break;
            } else {
                i++;
            }
        }
    }
}
