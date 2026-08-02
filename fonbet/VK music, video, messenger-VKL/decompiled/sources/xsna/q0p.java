package xsna;

import android.util.Size;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: MusicEditPlaylistTrackItemsAdapter.kt */
/* loaded from: classes3.dex */
public final class q0p extends cg40<MusicTrack> {
    public static final List<Integer> q = e43.l(Integer.valueOf(R.id.audio_image), Integer.valueOf(R.id.ds_internal_cell_middle_title), Integer.valueOf(R.id.ds_internal_cell_middle_subtitle));
    public final Collection<MusicTrack> o;
    public final VkCell p;

    public q0p(Collection<MusicTrack> collection, se50<MusicTrack> se50Var, VkCell vkCell) {
        super(se50Var);
        this.o = collection;
        this.p = vkCell;
    }

    @Override // xsna.cg40, xsna.se50
    public final void V5(String str, boolean z, int i, Object obj) {
        super.V5(str, z, i, (MusicTrack) obj);
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        MusicTrack musicTrack = (MusicTrack) obj;
        boolean contains = this.o.contains(musicTrack);
        float f = 48;
        VkCell.Right.d a = VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(new s0p(musicTrack, contains), new Size(iah0.a(f), iah0.a(f))), null, null, 29);
        VkCell vkCell = this.p;
        vkCell.setRight(a);
        vkCell.setAlpha(!musicTrack.B() ? 1.0f : 0.64f);
        Iterator<T> it = q.iterator();
        while (it.hasNext()) {
            View findViewById = vkCell.findViewById(((Number) it.next()).intValue());
            if (findViewById != null) {
                findViewById.setAlpha(!contains ? 1.0f : 0.64f);
            }
        }
    }
}
