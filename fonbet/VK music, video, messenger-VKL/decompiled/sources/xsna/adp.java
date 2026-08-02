package xsna;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.Lifecycle;

/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes12.dex */
public final class adp implements nhl {
    public final /* synthetic */ Lifecycle b;

    public adp(EmojiCompatInitializer emojiCompatInitializer, Lifecycle lifecycle) {
        this.b = lifecycle;
    }

    @Override // xsna.nhl
    public final void onResume(@NonNull f5z f5zVar) {
        mwi.a(Looper.getMainLooper()).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.b.removeObserver(this);
    }
}
