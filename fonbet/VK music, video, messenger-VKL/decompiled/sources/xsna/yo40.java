package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: MusicMyAudiosCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class yo40 implements g4a {
    @Override // xsna.g4a
    public final h7u0.a a(Context context, gzs gzsVar) {
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(context);
        c.g0(R.string.music_edit_mode_cancel_dialog_title);
        c.U(R.string.music_edit_mode_cancel_dialog_message);
        c.c0(R.string.music_edit_mode_cancel_dialog_positive_button, new e30(gzsVar, 3));
        c.W(R.string.music_edit_mode_cancel_dialog_negative_button, null);
        return c;
    }
}
