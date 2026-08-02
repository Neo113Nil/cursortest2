package defpackage;

import com.yandex.plus.pay.data.mb.dto.RichTextDto$Item$Type;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class o3k0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RichTextDto$Item$Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
