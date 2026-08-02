package xsna;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vkontakte.android.R;

/* compiled from: MusicStickerHeaderMetaView.kt */
/* loaded from: classes6.dex */
public final class z750 extends LinearLayout implements f850 {
    public final z750 b;

    public z750(Context context) {
        super(context, null, 0);
        this.b = this;
        View.inflate(context, R.layout.sticker_music_header_meta, this);
    }

    @Override // xsna.f850
    public final void c(StoryMusicInfo storyMusicInfo) {
        if (storyMusicInfo == null) {
            setContentDescription(null);
        } else {
            setContentDescription(pdq.b(getContext(), storyMusicInfo, MusicStickerStyle.HeaderMeta));
        }
    }

    @Override // xsna.f850
    public z750 getView() {
        return this.b;
    }
}
