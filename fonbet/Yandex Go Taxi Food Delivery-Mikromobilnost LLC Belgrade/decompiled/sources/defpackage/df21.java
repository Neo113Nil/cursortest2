package defpackage;

import android.content.Context;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.urbanads.internal.divkit.video.UrbanAdsDivPlayerView;
import java.util.List;

/* loaded from: classes7.dex */
public final class df21 implements u4l {
    public final ag21 b;

    public df21(ag21 ag21Var) {
        this.b = ag21Var;
    }

    @Override // defpackage.u4l
    public final DivPlayerView a(Context context) {
        return new UrbanAdsDivPlayerView(context, this.b, null, 0, 12, null);
    }

    @Override // defpackage.u4l
    public final r4l b(List list, v4l v4lVar) {
        return new ff21(list, v4lVar, this.b);
    }
}
