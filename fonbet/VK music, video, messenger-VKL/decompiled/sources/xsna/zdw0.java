package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VoipApiRequestUtil.kt */
/* loaded from: classes7.dex */
public final class zdw0 {
    public static final void a(rsg0 rsg0Var, gzs gzsVar) {
        String s;
        UserId userId = (UserId) gzsVar.invoke();
        if (!fkq0.c(userId) || o25.a().a(userId) || (s = o25.a().s(userId)) == null) {
            return;
        }
        rsg0Var.B(s, null);
    }
}
