package xsna;

import android.content.DialogInterface;

/* compiled from: MusicStoryRenderer.kt */
/* loaded from: classes6.dex */
public final class w850 implements DialogInterface.OnDismissListener {
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.b.dispose();
    }
}
