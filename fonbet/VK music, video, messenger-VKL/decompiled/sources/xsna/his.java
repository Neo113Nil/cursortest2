package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.friends.groupinvite.impl.models.FriendInvitationState;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.his;
import xsna.phw;
import xsna.q630;

/* compiled from: FriendItem.kt */
/* loaded from: classes14.dex */
public final class his {

    /* compiled from: FriendItem.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FriendInvitationState.values().length];
            try {
                iArr[FriendInvitationState.NOT_INVITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FriendInvitationState.INVITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FriendInvitationState.ACCEPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(jis jisVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        final izs izsVar2;
        androidx.compose.runtime.a aVar2;
        final jis jisVar2;
        q630 q630Var2;
        int i2;
        lg90 r;
        int i3;
        FriendInvitationState friendInvitationState = jisVar.d;
        androidx.compose.runtime.a M = aVar.M(-1570503818);
        int i4 = i | (M.J(jisVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1570503818, i4, -1, "com.vk.friends.groupinvite.impl.ui.FriendItem (FriendItem.kt:38)");
            }
            float f = (jisVar.f && jisVar.g) ? 1.0f : 0.6f;
            q630.a aVar3 = q630.a.a;
            q630 f2 = txj0.f(o19.a(ahn.E(aVar3, "FRIEND_ITEM"), f), 1.0f);
            boolean z = friendInvitationState == FriendInvitationState.NOT_INVITED;
            int i5 = i4 & 14;
            boolean z2 = (i5 == 4) | ((i4 & 112) == 32);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new u14(10, izsVar, jisVar);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            if (z) {
                f2 = ojc.c(f2, false, null, null, gzsVar, 15);
            }
            q630 q630Var3 = f2;
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 f3 = txj0.f(s200.E(aVar3, 16, 4), 1.0f);
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 f4 = txj0.f(aVar3, 0.8f);
            ty6 ty6Var2 = dt1.a.e;
            ra8 ra8Var = ra8.a;
            q630 b = ra8Var.b(f4, ty6Var2);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, b);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            float f5 = 40;
            q630 q = txj0.q(ahn.E(aVar3, "FRIEND_ITEM_AVATAR"), f5);
            q630Var2 = aVar3;
            ldu0.b(phw.a.a(xus.s(jisVar.b, 0L, M, 0, 2), null, null, null, null, M, 196616, 30), f5, q, null, null, false, null, null, null, M, Tensorflow.FRAME_WIDTH, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            q630 H = s200.H(ahn.E(q630Var2, "FRIEND_ITEM_USERNAME"), 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            String str = jisVar.c;
            if (androidx.compose.runtime.b.d()) {
                i2 = -1;
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                i2 = -1;
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, i2, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i6 = i2;
            yqv0.c(str, H, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8184);
            M.G();
            q630 f6 = txj0.f(txj0.q(q630Var2, f5), 0.2f);
            ty6 ty6Var3 = dt1.a.g;
            q630 b2 = ra8Var.b(f6, ty6Var3);
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, b2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            q630 b3 = ra8Var.b(q630Var2, ty6Var3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-675594807, i5, i6, "com.vk.friends.groupinvite.impl.ui.getIcon (FriendItem.kt:137)");
            }
            int i7 = a.$EnumSwitchMapping$0[friendInvitationState.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    M.K(-427812316);
                    qzu0.a.getClass();
                    r = qzu0.n(M);
                    M.j();
                } else {
                    if (i7 != 3) {
                        throw alb0.c(-706545240, M);
                    }
                    M.K(-427717301);
                    qzu0.a.getClass();
                    r = qzu0.u(M);
                    M.j();
                }
                jisVar2 = jisVar;
            } else {
                M.K(-428005570);
                jisVar2 = jisVar;
                if (jisVar2.e) {
                    M.K(-427978972);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        i3 = 0;
                        androidx.compose.runtime.b.f(600052212, 0, i6, "com.vk.core.compose.icons.generated.VkIcons.<get-CheckCircle32> (VkIcons.kt:1216)");
                    } else {
                        i3 = 0;
                    }
                    r = pg90.a(R.drawable.vk_icon_check_circle_32, i3, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(-427920351);
                    qzu0.a.getClass();
                    r = qzu0.r(M);
                    M.j();
                }
                M.j();
            }
            lg90 lg90Var = r;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            izsVar2 = izsVar;
            ijk.a(lg90Var, b3, null, null, kai.c(629993154, new yzs() { // from class: xsna.gis
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FriendInvitationState friendInvitationState2;
                    String str2;
                    long j;
                    ColorFilter porterDuffColorFilter;
                    lg90 lg90Var2 = (lg90) obj;
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= (intValue & 8) == 0 ? aVar5.J(lg90Var2) : aVar5.y(lg90Var2) ? 4 : 2;
                    }
                    if (aVar5.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(629993154, intValue, -1, "com.vk.friends.groupinvite.impl.ui.FriendItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FriendItem.kt:101)");
                        }
                        q630 q2 = txj0.q(ahn.E(q630.a.a, "FRIEND_ITEM_STATUS"), 24);
                        jis jisVar3 = jis.this;
                        boolean z3 = jisVar3.f;
                        FriendInvitationState friendInvitationState3 = jisVar3.d;
                        boolean z4 = z3 && friendInvitationState3 == FriendInvitationState.INVITED;
                        izs izsVar3 = izsVar2;
                        boolean J = aVar5.J(izsVar3) | aVar5.J(jisVar3);
                        Object x2 = aVar5.x();
                        if (J || x2 == a.C0011a.a) {
                            x2 = new xk(13, izsVar3, jisVar3);
                            aVar5.R(x2);
                        }
                        gzs gzsVar2 = (gzs) x2;
                        if (z4) {
                            friendInvitationState2 = friendInvitationState3;
                            q2 = ojc.c(q2, false, null, null, gzsVar2, 15);
                        } else {
                            friendInvitationState2 = friendInvitationState3;
                        }
                        dt1.a.getClass();
                        ty6 ty6Var4 = dt1.a.g;
                        q630 b4 = ra8.a.b(q2, ty6Var4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1829887561, 0, -1, "com.vk.friends.groupinvite.impl.ui.getContentDescription (FriendItem.kt:126)");
                        }
                        if (friendInvitationState2 == FriendInvitationState.INVITED) {
                            str2 = zq.a(aVar5, 1839699429, R.string.accessibility_cancel, aVar5, 0);
                        } else {
                            aVar5.K(1839773271);
                            aVar5.j();
                            str2 = null;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1876859746, 0, -1, "com.vk.friends.groupinvite.impl.ui.getIconColorFilter (FriendItem.kt:165)");
                        }
                        int i8 = his.a.$EnumSwitchMapping$0[friendInvitationState2.ordinal()];
                        if (i8 == 1) {
                            aVar5.K(1644583924);
                            if (jisVar3.e) {
                                aVar5.K(1644610274);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) aVar5.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j = ylu0Var2.getIcon().a;
                                aVar5.j();
                            } else {
                                aVar5.K(1644677792);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var3 = (ylu0) aVar5.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j = ylu0Var3.getIcon().n;
                                aVar5.j();
                            }
                            aVar5.j();
                        } else if (i8 == 2) {
                            aVar5.K(1644793608);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var4 = (ylu0) aVar5.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j = ylu0Var4.getIcon().n;
                            aVar5.j();
                        } else {
                            if (i8 != 3) {
                                throw alb0.c(-224045505, aVar5);
                            }
                            aVar5.K(1644891816);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var5 = (ylu0) aVar5.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j = ylu0Var5.getIcon().i;
                            aVar5.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            se7.b();
                            porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                        }
                        vjw.a(lg90Var2, str2, b4, ty6Var4, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), aVar5, 3080 | (intValue & 14), 48);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar5.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 24584, 12);
            aVar2 = M;
            aVar2.G();
            aVar2.G();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            aVar2 = M;
            jisVar2 = jisVar;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new er3(jisVar2, izsVar2, q630Var2, i);
        }
    }
}
