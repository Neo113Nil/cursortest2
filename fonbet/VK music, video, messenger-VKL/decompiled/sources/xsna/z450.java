package xsna;

import android.view.View;
import com.vk.music.view.MusicRoundPlayView;

/* compiled from: ViewExt.kt */
/* loaded from: classes3.dex */
public final class z450 implements View.OnLayoutChangeListener {
    public final /* synthetic */ MusicRoundPlayView b;

    public z450(MusicRoundPlayView musicRoundPlayView) {
        this.b = musicRoundPlayView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        MusicRoundPlayView musicRoundPlayView = this.b;
        int a = an10.a(musicRoundPlayView.getWidth() * 0.25d);
        int a2 = an10.a(musicRoundPlayView.b.getWidth() * 0.04d);
        musicRoundPlayView.b.setPadding(a, a, a, a);
        musicRoundPlayView.b.setThickness(a2);
    }
}
