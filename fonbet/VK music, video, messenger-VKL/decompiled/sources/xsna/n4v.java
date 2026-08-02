package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vkontakte.android.R;
import xsna.k930;

/* compiled from: HideThisAuthor.kt */
/* loaded from: classes17.dex */
public final class n4v extends bne {
    public final xne b;

    public n4v(xne xneVar) {
        super(ClipsBottomSheetOptions.HIDE_THIS_AUTHOR.ordinal());
        this.b = xneVar;
    }

    @Override // xsna.bne
    public final cne a(Context context, ikd ikdVar) {
        if (!ci90.b(ikdVar, this.b)) {
            return null;
        }
        return new cne(this.a, context.getString(R.string.clip_feed_hide_author_clips), new qte(5), true);
    }

    @Override // xsna.bne
    public final void b(ikd ikdVar, k930.f fVar) {
        fVar.a(ClipsBottomSheetSideEffectOptions.HIDE_THIS_AUTHOR, ikdVar.a);
    }
}
