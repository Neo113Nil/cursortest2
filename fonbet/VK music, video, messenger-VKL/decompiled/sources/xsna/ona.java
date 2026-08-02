package xsna;

import android.content.Context;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;

/* compiled from: CellMusicTrackLeftViewControllerFactory.kt */
/* loaded from: classes3.dex */
public final class ona implements VkCell.e {
    public final izs<MusicTrack, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ona(izs<? super MusicTrack, s3q0> izsVar) {
        this.a = izsVar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new nna(context, this.a);
    }
}
