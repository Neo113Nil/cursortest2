package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vkontakte.android.R;
import xsna.k930;

/* compiled from: Cancel.kt */
/* loaded from: classes17.dex */
public final class hp9 extends bne {
    @Override // xsna.bne
    public final cne a(Context context, ikd ikdVar) {
        return new cne(this.a, context.getString(R.string.clip_cancel), null, true);
    }

    @Override // xsna.bne
    public final void b(ikd ikdVar, k930.f fVar) {
        fVar.a(ClipsBottomSheetSideEffectOptions.CANCEL, ikdVar.a);
    }
}
