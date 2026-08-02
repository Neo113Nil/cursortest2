package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.jbp0;
import xsna.q630;
import xsna.rmw;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class eoi implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eoi(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                k1i0 k1i0Var = (k1i0) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(k1i0Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1581272148, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkSecondaryTabRowKt.lambda$-275512799.<anonymous>.<anonymous> (VkSecondaryTabRow.kt:599)");
                    }
                    if (((Number) wh50Var.getValue()).intValue() == 0) {
                        i = intValue;
                        z = true;
                    } else {
                        i = intValue;
                        z = false;
                    }
                    Object x = aVar.x();
                    Object obj4 = a.C0011a.a;
                    if (x == obj4) {
                        x = new foi(wh50Var, 0);
                        aVar.R(x);
                    }
                    int i2 = ((i << 12) & 57344) | Tensorflow.FRAME_WIDTH;
                    k1i0Var.b(z, (gzs) x, joi.g, null, aVar, i2, 8);
                    boolean z2 = ((Number) wh50Var.getValue()).intValue() == 1;
                    Object x2 = aVar.x();
                    if (x2 == obj4) {
                        x2 = new ar8(1, wh50Var);
                        aVar.R(x2);
                    }
                    k1i0Var.b(z2, (gzs) x2, joi.h, null, aVar, i2, 8);
                    boolean z3 = ((Number) wh50Var.getValue()).intValue() == 2;
                    Object x3 = aVar.x();
                    if (x3 == obj4) {
                        x3 = new vmi(1, wh50Var);
                        aVar.R(x3);
                    }
                    k1i0Var.b(z3, (gzs) x3, joi.i, null, aVar, i2, 8);
                    boolean z4 = ((Number) wh50Var.getValue()).intValue() == 3;
                    Object x4 = aVar.x();
                    if (x4 == obj4) {
                        x4 = new wmi(1, wh50Var);
                        aVar.R(x4);
                    }
                    k1i0Var.b(z4, (gzs) x4, joi.j, null, aVar, i2, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                com.vk.voip.ui.groupcalls.grid.a aVar2 = (com.vk.voip.ui.groupcalls.grid.a) this.c;
                View view = (View) obj;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                float c = aVar2.F.c();
                if (c == 90.0f) {
                    float h = w65.h(view);
                    view.setTranslationX(-h);
                    view.setTranslationY(aVar2.getTopOffset() + h);
                } else if (c == 270.0f) {
                    float h2 = w65.h(view);
                    view.setTranslationX(h2);
                    view.setTranslationY(-(aVar2.getBottomOffset() + h2));
                } else {
                    view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                break;
            case 2:
                izs izsVar = (izs) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar3.l(booleanValue) ? 4 : 2;
                }
                if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-100485576, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.KidsAddRemoveButton.<anonymous> (MusicStandaloneBottomPlayer.kt:558)");
                    }
                    q630.a aVar4 = q630.a.a;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (booleanValue) {
                        aVar3.K(26466932);
                        q630 E = ahn.E(aVar4, "deleteFromMyKidsCollectionBtn");
                        float f = 36;
                        qzu0.a.getClass();
                        lg90 x0 = qzu0.x0(aVar3);
                        String N = d370.N(R.string.music_kids_talkback_player_remove_track_from_favorite, 0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().j;
                        boolean J = aVar3.J(izsVar);
                        Object x5 = aVar3.x();
                        if (J || x5 == c0012a) {
                            x5 = new nse(izsVar, 5);
                            aVar3.R(x5);
                        }
                        nzu0.c((gzs) x5, x0, N, E, f, j, false, null, false, null, null, aVar3, 27712, 1984);
                        aVar3.j();
                    } else {
                        aVar3.K(27192952);
                        q630 E2 = ahn.E(aVar4, "addToMyKidsCollectionBtn");
                        float f2 = 36;
                        qzu0.a.getClass();
                        lg90 y0 = qzu0.y0(aVar3);
                        String N2 = d370.N(R.string.music_kids_talkback_player_add_track_to_favorite, 0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getIcon().j;
                        boolean J2 = aVar3.J(izsVar);
                        Object x6 = aVar3.x();
                        if (J2 || x6 == c0012a) {
                            x6 = new ln7(izsVar, 7);
                            aVar3.R(x6);
                        }
                        nzu0.c((gzs) x6, y0, N2, E2, f2, j2, false, null, false, null, null, aVar3, 27712, 1984);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                jbp0 jbp0Var = (jbp0) this.c;
                va8 va8Var = (va8) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar5.J(va8Var) ? 4 : 2;
                }
                if (aVar5.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(903821883, intValue3, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.card.TopshelfCardScrollPlaceholder.<anonymous> (TopshelfCardScrollPlaceholder.kt:26)");
                    }
                    lg90 lg90Var = null;
                    rmw.d dVar = ((jbp0.a) jbp0Var).a.a;
                    if (dVar == null) {
                        aVar5.K(607843385);
                    } else {
                        aVar5.K(989439176);
                        lg90Var = rmw.b.a(new uco(byc0.b(va8Var.j(), va8Var.g())), dVar, aVar5, 0, 2);
                    }
                    aVar5.j();
                    if (lg90Var != null) {
                        aVar5.K(607931395);
                        r0v0.a(lg90Var, txj0.d(q630.a.a, 1.0f), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar5, 3128, 244);
                    } else {
                        aVar5.K(606688295);
                    }
                    aVar5.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
        }
        return s3q0.a;
    }
}
