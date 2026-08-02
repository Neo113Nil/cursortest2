package defpackage;

import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class n331 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = VaultRarity.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
