package xsna;

import com.vk.libvideo.ui.tooltip.types.TooltipType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: VideoTooltipManager.kt */
/* loaded from: classes3.dex */
public final class alt0 {
    public final List<zkt0> a;
    public boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public alt0(List<? extends zkt0> list) {
        this.a = list;
    }

    public final void a(List<? extends TooltipType> list, yg5 yg5Var) {
        Object obj;
        if (this.b) {
            return;
        }
        List<zkt0> list2 = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (list.contains(((zkt0) obj2).getType())) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((zkt0) obj).a(yg5Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zkt0 zkt0Var = (zkt0) obj;
        if (zkt0Var != null) {
            zkt0Var.b(new prq0(this, 17), new wmd0(this, 23));
        }
    }
}
