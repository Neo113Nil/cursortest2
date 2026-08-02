package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import com.vkontakte.android.R;

/* compiled from: ReplyImageStickerRedesign.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class g4g0 extends lba0 {
    public g4g0(Context context, kba0 kba0Var) {
        super(context, kba0Var, false);
        setId(R.id.story_photo_sticker);
    }

    @Override // xsna.lba0, xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new g4g0(getContext(), getInfo()));
    }

    @Override // xsna.nxt0, xsna.nov
    public PointF[] getFillPoints() {
        return getInfo().f ? super.getFillPoints() : new PointF[0];
    }
}
