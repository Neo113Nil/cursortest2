package xsna;

import androidx.compose.runtime.a;
import androidx.fragment.app.FragmentActivity;
import xsna.hv70;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nxt implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nxt(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                xxt xxtVar = (xxt) obj5;
                String str = (String) obj4;
                int intValue = ((Integer) obj).intValue();
                String str2 = (String) obj2;
                long longValue = ((Long) obj3).longValue();
                bfm bfmVar = xxtVar.c;
                FragmentActivity fragmentActivity = (FragmentActivity) bfmVar.invoke();
                if (fragmentActivity != null) {
                    m4s.y(fragmentActivity, new rxt(xxtVar, intValue, str2, longValue, str, null));
                    s3q0 s3q0Var = s3q0.a;
                }
                FragmentActivity fragmentActivity2 = (FragmentActivity) bfmVar.invoke();
                if (fragmentActivity2 != null) {
                    myc0.h(g5z.a(fragmentActivity2), dgn0.f().getMain(), null, new abs(new txt(xxtVar, intValue, null), null), 2);
                    s3q0 s3q0Var2 = s3q0.a;
                }
                return s3q0.a;
            case 1:
                hv70 hv70Var = (hv70) obj5;
                izs izsVar = (izs) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(152443010, intValue2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.OfflinePodcastEpisodesScreen.<anonymous> (OfflinePodcastEpisodesMviComposeComponent.kt:132)");
                    }
                    if (hv70Var instanceof hv70.a) {
                        aVar.K(468847254);
                        cv70.d((hv70.a) hv70Var, izsVar, aVar, 0);
                        aVar.j();
                    } else {
                        if (!(hv70Var instanceof hv70.d)) {
                            throw alb0.c(468845097, aVar);
                        }
                        aVar.K(468850791);
                        cv70.e(0, aVar);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                o3j0 o3j0Var = (o3j0) obj5;
                izs izsVar2 = (izs) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(823668518, intValue3, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.itemsOther.<anonymous> (SettingsScreen.kt:165)");
                    }
                    zzi0 zzi0Var = o3j0Var.f;
                    boolean J = aVar2.J(izsVar2);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new x3b0(izsVar2, 1);
                        aVar2.R(x);
                    }
                    yzi0.a(zzi0Var, (izs) x, ahn.E(q630.a.a, "ScreenTags.COMMUNITY_POST"), aVar2, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
