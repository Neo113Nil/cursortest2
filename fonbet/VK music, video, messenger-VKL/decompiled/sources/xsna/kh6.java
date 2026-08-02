package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import xsna.e7m0;

/* compiled from: BaseMusicDelegate.kt */
/* loaded from: classes16.dex */
public abstract class kh6 extends wyl0 implements b7m0 {
    public final u76 f;
    public final v3l0 g;
    public h7m0 h;
    public MusicTrack i;
    public boolean j;
    public iz8 k;

    public kh6(StickersDrawingViewGroup stickersDrawingViewGroup, b96 b96Var, u76 u76Var, v3l0 v3l0Var) {
        super(stickersDrawingViewGroup, b96Var);
        this.f = u76Var;
        this.g = v3l0Var;
    }

    public abstract void c();

    public abstract void d(StoryMusicInfo storyMusicInfo, MusicStickerStyle musicStickerStyle, boolean z);

    @Override // xsna.wyl0
    public final tyl0 f() {
        Context context = this.b.getContext();
        MusicTrack musicTrack = this.i;
        e7m0.a i = i();
        iz8 iz8Var = this.k;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = iz8Var != null ? iz8Var.d : 0.0f;
        if (iz8Var != null) {
            f = iz8Var.c;
        }
        f7m0 f7m0Var = new f7m0(context, this, musicTrack, i, this.g, f2, f);
        iz8 iz8Var2 = this.k;
        if (iz8Var2 != null) {
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
            storiesFeatures.getClass();
            if (com.vk.toggle.b.A.a(storiesFeatures)) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = f7m0Var.getWindow();
                layoutParams.copyFrom(window != null ? window.getAttributes() : null);
                Float f3 = iz8Var2.g;
                if (f3 == null) {
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.gravity = 48;
                    layoutParams.y = (int) f3.floatValue();
                }
                layoutParams.width = -1;
                layoutParams.height = iz8Var2.b;
                Window window2 = f7m0Var.getWindow();
                if (window2 != null) {
                    window2.setAttributes(layoutParams);
                }
            }
        }
        return f7m0Var;
    }

    public abstract e7m0.a i();

    public final void j() {
        c();
        cvk.u(R.string.error, false);
    }

    public abstract void k(h7m0 h7m0Var);

    public final void l(MusicTrack musicTrack) {
        n7m0 n7m0Var;
        this.i = musicTrack;
        if (musicTrack != null) {
            tyl0<?> tyl0Var = this.d;
            f7m0 f7m0Var = tyl0Var instanceof f7m0 ? (f7m0) tyl0Var : null;
            if (f7m0Var == null || (n7m0Var = f7m0Var.x) == null) {
                return;
            }
            n7m0Var.e0(musicTrack);
        }
    }

    @Override // xsna.wyl0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f.X2();
        super.onDismiss(dialogInterface);
    }
}
