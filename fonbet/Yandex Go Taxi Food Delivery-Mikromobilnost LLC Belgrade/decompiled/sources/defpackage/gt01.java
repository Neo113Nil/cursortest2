package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import com.ybsdk.core.utils.text.Text;

/* loaded from: classes3.dex */
public abstract class gt01 {
    public static final Text.Resource a(TransferStatus transferStatus) {
        int i = ft01.a[transferStatus.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? unr0.h(Text.Companion, dzh0.ybsdk_transfer_transfer_delay_title) : unr0.h(Text.Companion, dzh0.ybsdk_transfer_default_error) : unr0.h(Text.Companion, dzh0.ybsdk_transfer_accessibility_loading_text) : unr0.h(Text.Companion, dzh0.ybsdk_transfer_accessibility_transfer_success);
    }
}
