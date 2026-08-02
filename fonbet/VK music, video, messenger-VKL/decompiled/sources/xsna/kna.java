package xsna;

import android.content.Context;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;

/* compiled from: CellMusicRightViewControllerFactory.kt */
/* loaded from: classes3.dex */
public final class kna implements VkCell.e {
    public final VkCell a;
    public final boolean b;
    public final izs<MusicTrack, s3q0> c;
    public final izs<MusicTrack, s3q0> d;
    public final izs<MusicTrack, s3q0> e;
    public final b9f0<qna> f;

    /* JADX WARN: Multi-variable type inference failed */
    public kna(VkCell vkCell, boolean z, izs<? super MusicTrack, s3q0> izsVar, izs<? super MusicTrack, s3q0> izsVar2, izs<? super MusicTrack, s3q0> izsVar3, b9f0<qna> b9f0Var) {
        this.a = vkCell;
        this.b = z;
        this.c = izsVar;
        this.d = izsVar2;
        this.e = izsVar3;
        this.f = b9f0Var;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new jna(this.a, context, this.b, this.c, this.d, this.e, this.f);
    }
}
