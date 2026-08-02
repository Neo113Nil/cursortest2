package defpackage;

import com.yandex.go.shortcuts.dto.response.ShortcutIconSize;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class izr0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ShortcutIconSize.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
