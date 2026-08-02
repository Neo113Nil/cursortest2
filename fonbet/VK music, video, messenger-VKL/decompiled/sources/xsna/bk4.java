package xsna;

import com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.dz40;
import xsna.gfp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk4 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ bk4(com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.h hVar, us2 us2Var, us2 us2Var2, String str, boolean z, izs izsVar) {
        this.e = hVar;
        this.f = us2Var;
        this.g = us2Var2;
        this.h = str;
        this.c = z;
        this.d = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                gfp0.a aVar = (gfp0.a) this.e;
                wh50 wh50Var = (wh50) this.f;
                pfl0 pfl0Var = (pfl0) this.g;
                mtk0 mtk0Var = (mtk0) this.h;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1715150003, intValue, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous>.<anonymous>.<anonymous> (AudioBookWithBottomPlayer.kt:277)");
                    }
                    zk4.d(this.c, aVar, (dz40.g) mtk0Var.getValue(), wh50Var, pfl0Var, this.d, aVar2, 3072);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 1:
                com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.h hVar = (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.h) this.e;
                us2 us2Var = (us2) this.f;
                us2 us2Var2 = (us2) this.g;
                String str = (String) this.h;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-514256050, intValue2, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.ModerationBlockedItemView.ThemedContentView.<anonymous> (ModerationBlockedItemView.kt:102)");
                    }
                    hVar.h(us2Var, us2Var2, str, this.c, this.d, aVar3, SQLiteDatabase.OPEN_PRIVATECACHE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                gfp0.d dVar = (gfp0.d) this.e;
                dz40.c cVar = (dz40.c) this.f;
                f3b0 f3b0Var = (f3b0) this.g;
                mtk0 mtk0Var2 = (mtk0) this.h;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-956802148, intValue3, -1, "com.vk.music.stickyplayer.presentation.RadioContent.<anonymous>.<anonymous>.<anonymous> (RadioWithBottomPlayer.kt:216)");
                    }
                    nte0.a(dVar, cVar, this.c, f3b0Var.a(), ((OnboardingStrategy) mtk0Var2.getValue()) == OnboardingStrategy.LikeAnimation, this.d, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ bk4(gfp0.d dVar, dz40.c cVar, boolean z, f3b0 f3b0Var, izs izsVar, mtk0 mtk0Var) {
        this.e = dVar;
        this.f = cVar;
        this.c = z;
        this.g = f3b0Var;
        this.d = izsVar;
        this.h = mtk0Var;
    }

    public /* synthetic */ bk4(boolean z, gfp0.a aVar, wh50 wh50Var, pfl0 pfl0Var, izs izsVar, wh50 wh50Var2) {
        this.c = z;
        this.e = aVar;
        this.f = wh50Var;
        this.g = pfl0Var;
        this.d = izsVar;
        this.h = wh50Var2;
    }
}
