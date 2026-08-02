package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vkontakte.android.R;
import xsna.k930;

/* compiled from: ConfigureInterests.kt */
/* loaded from: classes17.dex */
public final class hzi extends bne {
    public final xne b;
    public final boolean c;

    public hzi(xne xneVar, boolean z) {
        super(ClipsBottomSheetOptions.CONFIGURE_INTERESTS.ordinal());
        this.b = xneVar;
        this.c = z;
    }

    @Override // xsna.bne
    public final cne a(Context context, ikd ikdVar) {
        if (!ci90.b(ikdVar, this.b)) {
            return null;
        }
        return new cne(this.a, context.getString(R.string.clip_feed_configure_interests), new a74((byte) 0, 3), this.c);
    }

    @Override // xsna.bne
    public final void b(ikd ikdVar, k930.f fVar) {
        fVar.a(ClipsBottomSheetSideEffectOptions.CONFIGURE_INTERESTS, ikdVar.a);
    }
}
