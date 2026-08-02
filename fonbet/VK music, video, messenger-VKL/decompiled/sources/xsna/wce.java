package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.dto.shortvideo.ClipGridParams;
import java.util.List;

/* compiled from: ClipsGridDraftsDelegate.kt */
/* loaded from: classes17.dex */
public final class wce implements sde {
    public AbstractClipsGridListFragment a;
    public List<tce> b;

    @Override // xsna.sde
    public final boolean c() {
        return false;
    }

    @Override // xsna.sde
    public final void e(AbstractClipsGridListFragment abstractClipsGridListFragment) {
        this.a = abstractClipsGridListFragment;
        List<tce> list = this.b;
        if (list != null) {
            abstractClipsGridListFragment.po(list, true);
        }
    }

    @Override // xsna.sde
    public final ClipGridParams f() {
        return null;
    }

    @Override // xsna.sde
    public final void g() {
        this.a = null;
    }

    @Override // xsna.sde
    public final PaginationKey h() {
        return PaginationKey.LoadedFull.b;
    }

    @Override // xsna.sde
    public final void a() {
    }

    @Override // xsna.sde
    public final void d() {
    }
}
