package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import io.reactivex.rxjava3.core.x;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionResult;

/* compiled from: Action.kt */
/* loaded from: classes9.dex */
public interface Action<P extends ActionParams, R extends ActionResult> {
    x<R> execute(P p);
}
