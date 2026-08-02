package xsna;

import android.content.Context;
import com.vk.dto.stories.entities.StoryCameraTarget;

/* compiled from: StickerDialogsProviderImpl.kt */
/* loaded from: classes16.dex */
public final class x3l0 implements w3l0 {
    public final v3l0 a;

    public x3l0(v3l0 v3l0Var) {
        this.a = v3l0Var;
    }

    @Override // xsna.w3l0
    public final cmo0 a(Context context, boolean z, amo0 amo0Var, hhw hhwVar, xpa0 xpa0Var, boolean z2, CharSequence charSequence, imo0 imo0Var, boolean z3) {
        return new cmo0(context, z, charSequence, imo0Var, amo0Var, hhwVar, z2, xpa0Var, this.a, z3);
    }

    @Override // xsna.w3l0
    public final q6m0 b(Context context, n6m0 n6m0Var, StoryCameraTarget storyCameraTarget, cvu cvuVar, v6m0 v6m0Var, com.vk.stickers.api.styles.b bVar, c7l0 c7l0Var) {
        return new q6m0(context, v6m0Var, n6m0Var, storyCameraTarget, cvuVar, this.a, bVar, c7l0Var);
    }

    @Override // xsna.w3l0
    public final n4m0 c(Context context, l4m0 l4m0Var, StoryCameraTarget storyCameraTarget, cvu cvuVar, t4m0 t4m0Var, com.vk.stickers.api.styles.b bVar, c7l0 c7l0Var) {
        return new n4m0(context, t4m0Var, l4m0Var, storyCameraTarget, cvuVar, this.a, bVar, c7l0Var);
    }
}
