package xsna;

import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.vk.api.comments.CommentsOrder;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: CommentsVideoOrderHolder.kt */
/* loaded from: classes4.dex */
public final class ngg extends qi6<NewsEntry> {
    public final Chip C;
    public final Chip D;
    public final Chip E;
    public yfg F;

    public ngg(ViewGroup viewGroup) {
        super(R.layout.comments_video_order, viewGroup);
        Chip chip = (Chip) this.itemView.findViewById(R.id.interest);
        this.C = chip;
        Chip chip2 = (Chip) this.itemView.findViewById(R.id.desc);
        this.D = chip2;
        Chip chip3 = (Chip) this.itemView.findViewById(R.id.asc);
        this.E = chip3;
        chip.setOnClickListener(new n14(this, 2));
        chip2.setOnClickListener(new og8(this, 1));
        chip3.setOnClickListener(new la(this, 3));
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        yfg yfgVar = this.F;
        if (yfgVar == null) {
            return;
        }
        boolean z = true;
        bwt0.p0(this.itemView, yfgVar.b > 1 && !yfgVar.d.isEmpty());
        Features.Type type = Features.Type.VIDEO_COMMENT_TAB_INTEREST;
        type.getClass();
        boolean a = com.vk.toggle.b.A.a(type);
        Chip chip = this.C;
        if (!a) {
            bwt0.p0(chip, false);
            return;
        }
        List<CommentsOrder.Item> list = yfgVar.d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (epx.f(((CommentsOrder.Item) it.next()).b, VideoGetCommentsExtendedSortDto.MOST_INTERESTING_COMMENTS_FIRST.i())) {
                    break;
                }
            }
        }
        z = false;
        bwt0.p0(chip, z);
        chip.setChecked(epx.f(yfgVar.c, VideoGetCommentsExtendedSortDto.MOST_INTERESTING_COMMENTS_FIRST.i()));
        this.D.setChecked(epx.f(yfgVar.c, VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST.i()));
        this.E.setChecked(epx.f(yfgVar.c, VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST.i()));
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        Object obj = u1c0Var.g;
        this.F = obj instanceof yfg ? (yfg) obj : null;
        super.a6(u1c0Var);
    }
}
