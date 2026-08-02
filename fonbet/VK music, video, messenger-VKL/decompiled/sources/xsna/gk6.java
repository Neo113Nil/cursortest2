package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import one.video.player.OneVideoPlayer;
import xsna.g9m;
import xsna.g9m.a;
import xsna.xtt0;

/* compiled from: BasePlayerDialog.kt */
/* loaded from: classes8.dex */
public abstract class gk6<ViewBindingType extends xtt0, ItemType extends g9m.a> extends tc6<ViewBindingType, ItemType> {
    public final OneVideoPlayer v;

    public gk6(Context context, OneVideoPlayer oneVideoPlayer) {
        super(context, R.style.one_video_DialogTheme);
        this.v = oneVideoPlayer;
    }

    @Override // xsna.tc6, com.google.android.material.bottomsheet.b, xsna.y8i, android.app.Dialog
    public final void onStart() {
        super.onStart();
        this.v.d0(v());
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public void onStop() {
        super.onStop();
        this.v.c0(v());
    }

    public abstract OneVideoPlayer.c v();
}
