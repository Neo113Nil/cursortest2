package xsna;

import android.view.View;
import com.vk.dto.music.MusicTrack;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: MusicTrackHolderBuilder.kt */
/* loaded from: classes3.dex */
public final class ow2<T> extends se50<T> {
    public final mn40 n;
    public final izs<T, MusicTrack> o;
    public final View p;
    public final ThumbsImageView q;

    public ow2(mn40 mn40Var, izs izsVar) {
        super(mn40Var.itemView);
        this.n = mn40Var;
        this.o = izsVar;
        this.p = this.itemView.findViewById(R.id.audio_menu);
        this.q = (ThumbsImageView) this.itemView.findViewById(R.id.audio_image);
    }

    @Override // xsna.se50
    public final void V5(String str, boolean z, int i, Object obj) {
        this.n.V5(str, z, i, this.o.invoke(obj));
        super.V5(str, z, i, obj);
    }

    @Override // xsna.se50
    public final void a6() {
        this.n.a6();
    }

    @Override // xsna.se50
    public final void h6() {
        this.n.h6();
    }

    @Override // xsna.se50
    public final void i6() {
        this.n.i6();
    }

    @Override // xsna.se50
    public final void b6(T t) {
    }
}
