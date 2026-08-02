package xsna;

import java.util.Set;
import ru.ok.android.commons.util.Optional;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import xsna.y1d0;

/* compiled from: PrepareBase.kt */
/* loaded from: classes8.dex */
public final class a2d0<T1, T2, T3, R> implements io.reactivex.rxjava3.functions.g {
    public static final a2d0<T1, T2, T3, R> b = new a2d0<>();

    @Override // io.reactivex.rxjava3.functions.g
    public final Object d(Object obj, Object obj2, Object obj3) {
        Optional optional = (Optional) obj;
        return new y1d0.b(optional.isPresent() ? (ConversationParams) optional.get() : null, j5g.S0(j5g.V((Set) obj2)));
    }
}
