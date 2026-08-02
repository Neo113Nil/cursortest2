package defpackage;

import com.yandex.go.overdraft.data.model.DebtUiOpenSource;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class iug {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DebtUiOpenSource.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
