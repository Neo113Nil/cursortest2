package defpackage;

import com.yandex.go.order.state.instructions.InstructionItemButtonActionType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class b4w {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = InstructionItemButtonActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
