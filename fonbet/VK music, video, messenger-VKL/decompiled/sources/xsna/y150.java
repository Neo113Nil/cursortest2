package xsna;

import android.content.Context;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: MusicPlaylistCellVh.kt */
/* loaded from: classes16.dex */
public final class y150 implements VkCell.e {
    public final boolean a;
    public final wt30 b;
    public final hvz c;

    public y150(boolean z, wt30 wt30Var, hvz hvzVar) {
        this.a = z;
        this.b = wt30Var;
        this.c = hvzVar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new z150(context, this.a, this.b, this.c);
    }
}
