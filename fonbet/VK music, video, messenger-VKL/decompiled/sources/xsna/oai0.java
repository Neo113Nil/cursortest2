package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import com.vk.music.track.MusicTrackId;
import xsna.t24;

/* compiled from: MusicSelectableAdapter.kt */
/* loaded from: classes3.dex */
public final class oai0 extends cg40<MusicTrack> {
    public final t24.c o;
    public final VkCell p;

    public oai0(se50<MusicTrack> se50Var, t24.c cVar) {
        super(se50Var);
        this.o = cVar;
        this.p = (VkCell) this.itemView;
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        MusicTrack musicTrack = (MusicTrack) obj;
        l6(musicTrack);
        bwt0.i0(this.p, new com.vk.movika.sdk.base.ui.s0(26, this, musicTrack));
    }

    public final void l6(MusicTrack musicTrack) {
        this.p.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(4, new t9b(14, this, musicTrack), this.o.S().contains(new MusicTrackId(musicTrack.c.b, musicTrack.b, musicTrack.r))), null, 27));
    }
}
