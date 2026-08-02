package defpackage;

import com.yandex.go.zone.dto.objects.SuffixSpanType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class e4v0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuffixSpanType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
