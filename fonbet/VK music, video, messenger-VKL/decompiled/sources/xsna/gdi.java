package xsna;

import android.content.Context;
import android.location.LocationManager;
import androidx.compose.runtime.a;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import xsna.idi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class gdi implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ gdi(int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                z37 z37Var = (z37) obj;
                CommunityCreationOnboardingFinishState communityCreationOnboardingFinishState = (CommunityCreationOnboardingFinishState) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(communityCreationOnboardingFinishState) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-184545685, i, -1, "com.vk.profile.community.creationonboarding.impl.finish.presentation.compose.ComposableSingletons$CommunityCreationOnboardingFinishScreenKt.lambda$-184545685.<anonymous> (CommunityCreationOnboardingFinishScreen.kt:71)");
                    }
                    boolean z = (i & 14) == 4;
                    Object x = aVar.x();
                    if (z || x == a.C0011a.a) {
                        idi.a aVar2 = new idi.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(aVar2);
                        x = aVar2;
                    }
                    uzg.b(communityCreationOnboardingFinishState, (izs) ((fcy) x), aVar, (i >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                Context context = (Context) obj;
                return new inf0(context, (LocationManager) context.getSystemService("location"), (fnf0) obj2, (hof0) obj3, (b8h0) obj4);
        }
    }
}
