package xsna;

import androidx.recyclerview.widget.m;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.AudioAttachListItem;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import java.util.List;

/* compiled from: DiffCallback.kt */
/* loaded from: classes2.dex */
public final class kxm extends m.b {
    public final List<hfz> b;
    public final List<hfz> c;

    /* JADX WARN: Multi-variable type inference failed */
    public kxm(List<? extends hfz> list, List<? extends hfz> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        hfz hfzVar = this.b.get(i);
        hfz hfzVar2 = this.c.get(i2);
        if ((hfzVar instanceof SimpleAttachListItem) && (hfzVar2 instanceof SimpleAttachListItem)) {
            return epx.f(((SimpleAttachListItem) hfzVar).b, ((SimpleAttachListItem) hfzVar2).b);
        }
        if ((hfzVar instanceof etz) && (hfzVar2 instanceof etz)) {
            return true;
        }
        if ((hfzVar instanceof AudioAttachListItem) && (hfzVar2 instanceof AudioAttachListItem)) {
            return epx.f(hfzVar, hfzVar2);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        hfz hfzVar = this.b.get(i);
        hfz hfzVar2 = this.c.get(i2);
        return hfzVar instanceof SimpleAttachListItem ? (hfzVar2 instanceof SimpleAttachListItem) && ((SimpleAttachListItem) hfzVar).b.i == ((SimpleAttachListItem) hfzVar2).b.i : hfzVar instanceof AudioAttachListItem ? (hfzVar2 instanceof AudioAttachListItem) && ((AudioAttachListItem) hfzVar).b.f == ((AudioAttachListItem) hfzVar2).b.f : (hfzVar instanceof etz) && (hfzVar2 instanceof etz);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.b.size();
    }
}
