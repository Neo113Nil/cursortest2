package defpackage;

import com.yandex.go.zone.dto.objects.ButtonStyle;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class l37 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ButtonStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
