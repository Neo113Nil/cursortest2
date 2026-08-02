package xsna;

import ru.ok.android.commons.util.Optional;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

/* compiled from: JoinPrepare.kt */
/* loaded from: classes8.dex */
public final class r0y<T, R> implements io.reactivex.rxjava3.functions.l {
    public static final r0y<T, R> b = new r0y<>();

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        return Optional.of((ConversationParams) obj);
    }
}
