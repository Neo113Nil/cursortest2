package xsna;

import kotlin.collections.EmptySet;
import ru.ok.android.commons.util.Optional;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import xsna.y1d0;

/* compiled from: PrepareBase.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class d2d0 implements io.reactivex.rxjava3.functions.l {
    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        return new y1d0.b(optional.isPresent() ? (ConversationParams) optional.get() : null, EmptySet.b);
    }
}
