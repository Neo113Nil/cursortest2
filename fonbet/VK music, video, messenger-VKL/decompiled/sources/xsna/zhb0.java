package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PodcastPageAdapter.kt */
/* loaded from: classes3.dex */
public final class zhb0 extends zoj0<zif0, RecyclerView.e0> implements c.i {
    public final sib0 e;

    public zhb0(sib0 sib0Var) {
        super(sib0Var.n);
        this.e = sib0Var;
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return getItemCount() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((zif0) this.c.c(i)).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        wg40 wg40Var;
        if (!list.contains("payload_download_state") || !(e0Var instanceof rhb0)) {
            super.onBindViewHolder(e0Var, i, list);
            return;
        }
        zif0 c = this.e.n.c(i);
        eib0 eib0Var = c instanceof eib0 ? (eib0) c : null;
        Object obj = eib0Var != null ? eib0Var.a : null;
        MusicTrack musicTrack = obj instanceof MusicTrack ? (MusicTrack) obj : null;
        if (musicTrack != null) {
            rhb0 rhb0Var = (rhb0) e0Var;
            DownloadingState downloadingState = musicTrack.J;
            MusicTrack musicTrack2 = (MusicTrack) rhb0Var.m;
            rhb0Var.m = musicTrack2 != null ? MusicTrack.zb(musicTrack2, 0, null, 0, 0, null, false, null, downloadingState, false, false, null, null, null, -1, 1048571) : 0;
            if (rhb0Var.s6() && (wg40Var = (wg40) rhb0Var.r.getValue()) != null) {
                wg40Var.setDownloadState(di40.a(downloadingState));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        sib0 sib0Var = this.e;
        switch (i) {
            case 0:
                return new tgb0(viewGroup);
            case 1:
                return new sjb0(viewGroup, sib0Var);
            case 2:
                return new khb0(viewGroup, sib0Var);
            case 3:
                return new lhb0(viewGroup, R.layout.music_header_other_episodes, 0);
            case 4:
                return new mhb0(viewGroup);
            case 5:
                return new rhb0(viewGroup, sib0Var);
            case 6:
                return new mjb0(viewGroup, sib0Var);
            case 7:
                return new hjb0(viewGroup, R.layout.music_podcasts_separator, 0);
            case 8:
                return new uhb0(viewGroup);
            default:
                throw new IllegalStateException(lhg.a(i, "Unsupported view type "));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        zif0 zif0Var = (zif0) this.c.c(i);
        if (e0Var instanceof dib0) {
            dib0 dib0Var = (dib0) e0Var;
            if (zif0Var instanceof eib0) {
                dib0Var.V5(((eib0) zif0Var).a);
            }
        }
    }
}
