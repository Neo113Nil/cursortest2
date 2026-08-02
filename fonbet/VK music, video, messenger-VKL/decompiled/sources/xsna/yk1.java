package xsna;

import android.content.Context;
import com.vk.catalog.mvi.block.BlockId;

/* compiled from: AlbumTitleSubtitleAvatar.kt */
/* loaded from: classes16.dex */
public final class yk1 implements q1a {
    public final String b;
    public final Context c;

    public yk1(String str, Context context) {
        this.b = str;
        this.c = context;
    }

    @Override // xsna.q1a
    public final BlockId w() {
        return new BlockId.Simple(this.b);
    }
}
