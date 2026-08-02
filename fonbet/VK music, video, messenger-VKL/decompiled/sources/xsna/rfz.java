package xsna;

import com.vk.dto.user.RequestUserProfile;
import xsna.jav;

/* compiled from: ListItemUpdateDelegate.kt */
/* loaded from: classes16.dex */
public interface rfz {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void b(rfz rfzVar, gkq0 gkq0Var, jav javVar, izs izsVar, int i) {
        if ((i & 2) != 0) {
            javVar = jav.c.a;
        }
        if ((i & 4) != 0) {
            izsVar = new sux(1);
        }
        rfzVar.a(gkq0Var, javVar, izsVar);
    }

    void a(gkq0 gkq0Var, jav javVar, izs<? super RequestUserProfile, s3q0> izsVar);
}
