package xsna;

import android.widget.ImageView;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import xsna.r5b0;

/* compiled from: MusicPlayingTrackHolder.kt */
/* loaded from: classes3.dex */
public final class kz40 extends cg40<MusicTrack> {
    public final u2b0 o;
    public final wzs<Integer, MusicTrack, Boolean> p;
    public int q;
    public final ImageView r;

    /* JADX WARN: Multi-variable type inference failed */
    public kz40(se50<MusicTrack> se50Var, u2b0 u2b0Var, int i, wzs<? super Integer, ? super MusicTrack, Boolean> wzsVar) {
        super(se50Var);
        this.o = u2b0Var;
        this.p = wzsVar;
        this.q = -1;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.audio_playing_indicator);
        float b = iah0.b(10.0f);
        r5b0.b bVar = new r5b0.b(this.itemView.getContext());
        bVar.a(R.integer.music_playing_drawable_rect_count);
        bVar.g(R.dimen.music_playing_drawable_rect_width);
        bVar.d(R.dimen.music_playing_drawable_rect_corners);
        bVar.e(R.dimen.music_playing_drawable_rect_height);
        bVar.f(R.dimen.music_playing_drawable_rect_min_height);
        bVar.c(i);
        bVar.b(R.dimen.music_playing_drawable_gap);
        bVar.j = new float[]{b, iah0.b(16.0f), iah0.b(18.0f), b};
        imageView.setImageDrawable(new r5b0(bVar));
        this.r = imageView;
    }

    @Override // xsna.cg40, xsna.se50
    public final void V5(String str, boolean z, int i, Object obj) {
        this.q = i;
        super.V5(str, z, i, (MusicTrack) obj);
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        i6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.cg40, xsna.se50
    public final void i6() {
        super.i6();
        MusicTrack musicTrack = (MusicTrack) this.l;
        if (musicTrack != null) {
            boolean booleanValue = this.p.invoke(Integer.valueOf(this.q), musicTrack).booleanValue();
            ImageView imageView = this.r;
            if (booleanValue) {
                imageView.setVisibility(0);
                imageView.setActivated(this.o.h());
            } else {
                imageView.setVisibility(8);
                imageView.setActivated(false);
            }
        }
    }
}
