package defpackage;

import com.yandex.go.shortcuts.dto.response.ShortcutTitleSize;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class l1s0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ShortcutTitleSize.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
