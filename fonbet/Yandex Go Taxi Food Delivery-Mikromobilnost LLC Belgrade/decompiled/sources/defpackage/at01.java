package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.api.TransferSelectedTargetEntity;

/* loaded from: classes3.dex */
public abstract class at01 {
    public static final e5a0 a(TransferSelectedTargetEntity transferSelectedTargetEntity) {
        return new e5a0(g8e.i(Text.Companion, transferSelectedTargetEntity.getTitle()), null, new d5a0(transferSelectedTargetEntity.getThemedImageEntity(), false), new d5a0(transferSelectedTargetEntity.getThemedImageEntity(), true), null, transferSelectedTargetEntity.getYbId(), null, null, null, null, null);
    }
}
