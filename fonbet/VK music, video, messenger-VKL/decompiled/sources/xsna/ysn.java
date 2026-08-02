package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vkontakte.android.R;
import xsna.k930;

/* compiled from: DoNotShowSimilar.kt */
/* loaded from: classes17.dex */
public final class ysn extends bne {
    public final xne b;

    public ysn(xne xneVar) {
        super(ClipsBottomSheetOptions.DO_NOT_SHOW_SIMILAR.ordinal());
        this.b = xneVar;
    }

    @Override // xsna.bne
    public final cne a(Context context, ikd ikdVar) {
        if (!ci90.b(ikdVar, this.b)) {
            return null;
        }
        return new cne(this.a, context.getString(R.string.clip_feed_do_not_show_same), new noi((byte) 0, 1), true);
    }

    @Override // xsna.bne
    public final void b(ikd ikdVar, k930.f fVar) {
        fVar.a(ClipsBottomSheetSideEffectOptions.DO_NOT_SHOW_SIMILAR, ikdVar.a);
    }
}
