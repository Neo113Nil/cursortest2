package xsna;

import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import xsna.x530;

/* compiled from: ModerationBinder.kt */
/* loaded from: classes18.dex */
public interface d430 {
    ModerationRestriction a(c530 c530Var);

    boolean b(c530 c530Var, ModerationRestriction moderationRestriction, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2);

    default boolean c(c530 c530Var, ModerationRestriction moderationRestriction, x530.a aVar) {
        return b(c530Var, moderationRestriction, aVar, aVar);
    }

    boolean d(c530 c530Var, f530 f530Var, izs<? super ModerationRestriction, s3q0> izsVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2);
}
