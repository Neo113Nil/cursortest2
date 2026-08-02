package com.yandex.quark.webchat.filechooser;

import android.content.DialogInterface;
import defpackage.jyj0;
import defpackage.md41;
import defpackage.syj0;
import defpackage.vyq;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebChatFileChooserLauncher$waitForResult$2$1 implements DialogInterface.OnCancelListener {
    final /* synthetic */ Continuation<syj0> $continuation;
    final /* synthetic */ md41 this$0;

    /* JADX WARN: Multi-variable type inference failed */
    public WebChatFileChooserLauncher$waitForResult$2$1(Continuation<? super syj0> continuation, md41 md41Var) {
        this.$continuation = continuation;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.$continuation.resumeWith(new jyj0(vyq.a));
        throw null;
    }
}
