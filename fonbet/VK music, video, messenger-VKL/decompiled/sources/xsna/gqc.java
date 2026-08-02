package xsna;

import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import java.util.List;
import xsna.mih0;

/* compiled from: ClipDescriptionBadgesAdapter.kt */
/* loaded from: classes17.dex */
public final class gqc extends qul {
    public final yof h;
    public yy5 i;

    public gqc(yof yofVar) {
        super(true);
        this.h = yofVar;
        x0(mih0.d.class, new gt(8));
        x0(mih0.i.class, new gr3(this, 11));
        x0(mih0.l.a.class, new qm0(9));
        x0(mih0.q.class, new sf1(this, 22));
        x0(mih0.p.class, new jt(11));
        x0(mih0.k.class, new r7(this, 23));
        x0(mih0.class, new e60(11));
    }

    @Override // xsna.qul
    public final void D0(vfz<hfz> vfzVar, int i, List<Object> list) {
        super.D0(vfzVar, i, list);
        if (vfzVar instanceof BaseBadgeHolder) {
            ((BaseBadgeHolder) vfzVar).m = this.i;
        }
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: G0 */
    public final void onViewRecycled(vfz<hfz> vfzVar) {
        vfzVar.g6();
        if (vfzVar instanceof BaseBadgeHolder) {
            ((BaseBadgeHolder) vfzVar).m = null;
        }
    }
}
