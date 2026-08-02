package xsna;

import android.content.Context;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookCellVh;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: AudioBookCellVh.kt */
/* loaded from: classes16.dex */
public final class sa40 implements VkCell.e {
    public final AudioBookCellVh.a a;

    public sa40(AudioBookCellVh.a aVar) {
        this.a = aVar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new ra40(context, this.a);
    }
}
