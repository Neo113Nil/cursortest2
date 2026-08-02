package xsna;

import com.vk.ecomm.moderation.api.restrictions.ModerationCheckAdultResult;

/* compiled from: ModerationAdultCheckInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class z330 implements y330 {
    public final b25 a;

    public z330(b25 b25Var) {
        this.a = b25Var;
    }

    @Override // xsna.y330
    public final ModerationCheckAdultResult a(boolean z, boolean z2) {
        if (z || !z2) {
            return ModerationCheckAdultResult.ADULT_NOT_REQUIRED;
        }
        or00 M = this.a.M();
        boolean z3 = false;
        if (M != null && M.b) {
            z3 = true;
        }
        return (M != null && M.c && z3) ? ModerationCheckAdultResult.ADULT_NOT_REQUIRED : !z3 ? ModerationCheckAdultResult.ONLY_FOR_ADULT : ModerationCheckAdultResult.CONFIRM_ADULT_REQUIRED;
    }
}
