package defpackage;

import com.yandex.go.morphlex.data.dto.MorphlexScreenInstructionType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class d830 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MorphlexScreenInstructionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
