package xsna;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.runtime.a;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Peer;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.b78;
import xsna.oup0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ip7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ip7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        Typeface typeface;
        switch (this.b) {
            case 0:
                kp7 kp7Var = (kp7) this.c;
                String str = (String) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1858699766, intValue, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditOneLineInput.MutableContent.<anonymous> (BookingEditOneLineInput.kt:119)");
                }
                q630 q630Var = kp7Var.i;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(str2, q630Var, ylu0Var.getText().k, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar, 0, 0, 16376);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                return ((dva) this.c).a.D0((Peer) this.d, (gkx0) obj, (gkx0) obj2, ((Integer) obj3).intValue());
            case 2:
                b78.d dVar = (b78.d) this.c;
                izs izsVar = (izs) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.l(booleanValue) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1937070811, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.AddRemoveButton.<anonymous> (MusicStandaloneBottomPlayer.kt:512)");
                    }
                    q630.a aVar3 = q630.a.a;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (booleanValue) {
                        aVar2.K(-95886387);
                        q630 E = ahn.E(aVar3, "deleteFromMyMusicBtn");
                        float f = 36;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(983561468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
                        }
                        lg90 a = pg90.a(R.drawable.vk_icon_done_24, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (dVar instanceof b78.g) {
                            i2 = R.string.music_talkback_player_remove_track_from_favorite;
                        } else {
                            if (!(dVar instanceof b78.i)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = R.string.music_talkback_player_remove_radio_from_favorite;
                        }
                        String N = d370.N(i2, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var2.getIcon().j;
                        boolean J = aVar2.J(izsVar);
                        Object x = aVar2.x();
                        if (J || x == c0012a) {
                            x = new cc1(izsVar, 7);
                            aVar2.R(x);
                        }
                        nzu0.c((gzs) x, a, N, E, f, j, false, null, false, null, null, aVar2, 27712, 1984);
                        aVar2.j();
                    } else {
                        aVar2.K(-95198311);
                        q630 E2 = ahn.E(aVar3, "addToMyMusicBtn");
                        float f2 = 36;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                        }
                        lg90 b = or.b(aVar2, -1058716730, R.drawable.vk_icon_add_24, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (dVar instanceof b78.g) {
                            i = R.string.music_talkback_player_add_track_to_favorite;
                        } else {
                            if (!(dVar instanceof b78.i)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R.string.music_talkback_player_add_radio_to_favorite;
                        }
                        String N2 = d370.N(i, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var3.getIcon().j;
                        boolean J2 = aVar2.J(izsVar);
                        Object x2 = aVar2.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new j750(izsVar, 0);
                            aVar2.R(x2);
                        }
                        nzu0.c((gzs) x2, b, N2, E2, f2, j2, false, null, false, null, null, aVar2, 27712, 1984);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                o3j0 o3j0Var = (o3j0) this.c;
                izs izsVar2 = (izs) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1378874709, intValue3, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.itemsClips.<anonymous> (SettingsScreen.kt:105)");
                    }
                    p54.b(o3j0Var.c, izsVar2, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 7), aVar4, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                Spannable spannable = (Spannable) this.c;
                ab2 ab2Var = (ab2) this.d;
                hik0 hik0Var = (hik0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int intValue5 = ((Integer) obj3).intValue();
                v4s v4sVar = hik0Var.f;
                b6s b6sVar = hik0Var.c;
                if (b6sVar == null) {
                    b6sVar = b6s.h;
                }
                u5s u5sVar = hik0Var.d;
                int i3 = u5sVar != null ? u5sVar.a : 0;
                v5s v5sVar = hik0Var.e;
                int i4 = v5sVar != null ? v5sVar.a : MinElf.PN_XNUM;
                bb2 bb2Var = ab2Var.b;
                oup0 a2 = bb2Var.e.a(v4sVar, b6sVar, i3, i4);
                if (a2 instanceof oup0.b) {
                    typeface = (Typeface) ((oup0.b) a2).b;
                } else {
                    ras rasVar = new ras(a2, bb2Var.j);
                    bb2Var.j = rasVar;
                    typeface = (Typeface) rasVar.b;
                }
                spannable.setSpan(new rup0(typeface), intValue4, intValue5, 33);
                return s3q0.a;
        }
    }
}
