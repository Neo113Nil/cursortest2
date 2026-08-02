package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.dto.profiles.VoipFriendStatus;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.b89;
import xsna.ca9;
import xsna.go0;
import xsna.t0y;

/* compiled from: CallParticipantFeatureStateToViewModelTransformer.kt */
/* loaded from: classes7.dex */
public final class b79 {
    public final CallMemberId a;
    public final com.vk.voip.b b;
    public final gdp c = new gdp();

    public b79(CallMemberId callMemberId, com.vk.voip.b bVar) {
        this.a = callMemberId;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b89 a(s99 s99Var) {
        boolean z;
        boolean z2;
        boolean z3;
        com.vk.voip.b bVar;
        boolean isMeCreatorOrAdmin;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        MediaOptionState mediaOptionState;
        MediaOptionState mediaOptionState2;
        boolean z14;
        String str2;
        MediaOptionState mediaOptionState3;
        boolean z15;
        MediaOptionState mediaOptionState4;
        boolean z16;
        b89.b bVar2;
        b89.h bVar3;
        String str3;
        boolean z17;
        boolean z18;
        Set<UserId> set;
        b89.a c2597a;
        b89.c aVar;
        ca9 ca9Var = s99Var.c;
        if (ca9Var instanceof ca9.b) {
            bVar3 = b89.h.c.a;
        } else if (ca9Var instanceof ca9.d) {
            bVar3 = b89.h.c.a;
        } else if (ca9Var instanceof ca9.a) {
            bVar3 = new b89.h.a(((ca9.a) ca9Var).a);
        } else {
            if (!(ca9Var instanceof ca9.c)) {
                throw new NoWhenBranchMatchedException();
            }
            ca9.c cVar = (ca9.c) ca9Var;
            List<CallMemberId> list = cVar.e;
            CallMemberId callMemberId = this.a;
            boolean contains = list.contains(callMemberId);
            boolean contains2 = cVar.k.contains(callMemberId);
            Map<String, whr0> map = cVar.m;
            whr0 whr0Var = map.get(cVar.b.b);
            whr0 whr0Var2 = map.get(callMemberId.b);
            if ((contains || contains2) && whr0Var != null) {
                String str4 = whr0Var.a;
                boolean z19 = whr0Var.n;
                boolean z20 = whr0Var.e;
                if (whr0Var2 != null) {
                    String str5 = whr0Var2.a;
                    boolean z21 = whr0Var2.n;
                    boolean z22 = whr0Var2.e;
                    boolean z23 = whr0Var2.w;
                    boolean f = epx.f(str4, str5);
                    boolean contains3 = cVar.n.contains(callMemberId);
                    boolean z24 = !f && contains3;
                    if (f || z20 || z22 || z23 || z19 || z21) {
                        z = contains3;
                        z2 = contains2;
                    } else {
                        z = contains3;
                        VoipFriendStatus voipFriendStatus = whr0Var2.g;
                        voipFriendStatus.getClass();
                        z2 = contains2;
                        if (voipFriendStatus == VoipFriendStatus.NOT_FRIENDS || voipFriendStatus == VoipFriendStatus.INCOME_FRIENDSHIP_REQUEST) {
                            z3 = true;
                            boolean z25 = (!z20 || z22 || z23) ? false : true;
                            boolean z26 = (!f || z23 || z20 || z19 || z22 || z21 || z2) ? false : true;
                            boolean z27 = f && !z20 && cVar.y && contains;
                            bVar = this.b;
                            isMeCreatorOrAdmin = bVar.isMeCreatorOrAdmin();
                            boolean z28 = z27;
                            boolean contains4 = cVar.C.contains(callMemberId);
                            boolean contains5 = cVar.D.contains(callMemberId);
                            MediaOptionState mediaOptionState5 = MediaOptionState.UNMUTED;
                            if (bVar.isGroupCall()) {
                                z4 = z20;
                                z5 = contains5;
                                str = str4;
                                z6 = false;
                                z7 = false;
                                z8 = false;
                                z9 = false;
                                z10 = false;
                                z11 = false;
                                z12 = false;
                            } else if (z2) {
                                z4 = z20;
                                z5 = contains5;
                                str = str4;
                                z11 = isMeCreatorOrAdmin;
                                z6 = false;
                                z7 = false;
                                z8 = false;
                                z9 = false;
                                z10 = false;
                                z12 = false;
                            } else {
                                boolean z29 = (f || z22 || z23 || !isMeCreatorOrAdmin || contains4 || z) ? false : true;
                                z14 = (f || !bVar.isMeCreatorOrAdmin() || z || z21 || z23) ? false : true;
                                boolean z30 = isMeCreatorOrAdmin && !z;
                                boolean n = bVar.n(callMemberId);
                                boolean z31 = (!isMeCreatorOrAdmin || f || z) ? false : true;
                                z8 = contains5;
                                MediaOptionState mediaOptionState6 = cVar.t.get(callMemberId);
                                MediaOptionState mediaOptionState7 = mediaOptionState6 == null ? mediaOptionState5 : mediaOptionState6;
                                MediaOptionState mediaOptionState8 = cVar.u.get(callMemberId);
                                if (mediaOptionState8 == null) {
                                    mediaOptionState8 = mediaOptionState5;
                                }
                                if (f || !bVar.isMeCreatorOrAdmin() || contains4 || z8) {
                                    z4 = z20;
                                    str3 = str4;
                                } else {
                                    dhw0 L = com.vk.voip.ui.c.b.L();
                                    if (L == null || (set = L.G) == null) {
                                        z4 = z20;
                                        str3 = str4;
                                        z18 = false;
                                    } else {
                                        Set<UserId> set2 = set;
                                        Long n2 = arm0.n(str5);
                                        z4 = z20;
                                        str3 = str4;
                                        z18 = j5g.P(set2, n2 != null ? new UserId(n2.longValue()) : null);
                                    }
                                    if (!z18) {
                                        z17 = true;
                                        boolean z32 = z17;
                                        mediaOptionState2 = mediaOptionState8;
                                        mediaOptionState = mediaOptionState7;
                                        z9 = z30;
                                        z13 = z32;
                                        z12 = (isMeCreatorOrAdmin || z8 || !cVar.I) ? false : true;
                                        z11 = false;
                                        z6 = z31;
                                        z5 = z8;
                                        str = str3;
                                        z10 = n;
                                        z7 = z29;
                                        sew0 sew0Var = whr0Var2.b;
                                        str2 = whr0Var2.q;
                                        if (str2 == null) {
                                            str2 = whr0Var2.e();
                                        }
                                        this.c.getClass();
                                        CharSequence a = gdp.a(str2);
                                        boolean z33 = whr0Var2.c;
                                        if (z4 && z21 && whr0Var2.p) {
                                            mediaOptionState3 = mediaOptionState5;
                                            z15 = true;
                                        } else {
                                            mediaOptionState3 = mediaOptionState5;
                                            z15 = false;
                                        }
                                        boolean z34 = (!f || isMeCreatorOrAdmin) && cVar.p.contains(callMemberId);
                                        b89.e eVar = new b89.e(z6, mediaOptionState);
                                        b89.f fVar = new b89.f(z6, mediaOptionState2);
                                        mediaOptionState4 = cVar.v.get(callMemberId);
                                        if (mediaOptionState4 == null) {
                                            mediaOptionState4 = mediaOptionState3;
                                        }
                                        if (z6) {
                                            com.vk.voip.ui.c.b.getClass();
                                            if (((Boolean) com.vk.voip.ui.c.k0().b.invoke()).booleanValue() && epx.f(cVar.J, FeatureRoles.EnabledForAll.INSTANCE) && !z22 && !z23 && !contains4 && !z5) {
                                                z16 = true;
                                                b89.g gVar = new b89.g(z16, mediaOptionState4);
                                                b89.d dVar = new b89.d(z6);
                                                boolean z35 = whr0Var2.e;
                                                boolean z36 = whr0Var2.n;
                                                if (z14) {
                                                    bVar2 = new b89.b(cVar.a, whr0Var2.a, whr0Var2.e(), whr0Var2.q, z19 ? fkq0.e(new UserId(Long.parseLong(str))) : null);
                                                } else {
                                                    bVar2 = null;
                                                }
                                                bVar3 = new b89.h.b(sew0Var, a, z33, z24, z25, z3, z15, z26, z13, z34, z7, z8, z9, z10, eVar, fVar, gVar, dVar, z11, z12, z35, z36, bVar2);
                                            }
                                        }
                                        z16 = false;
                                        b89.g gVar2 = new b89.g(z16, mediaOptionState4);
                                        b89.d dVar2 = new b89.d(z6);
                                        boolean z352 = whr0Var2.e;
                                        boolean z362 = whr0Var2.n;
                                        if (z14) {
                                        }
                                        bVar3 = new b89.h.b(sew0Var, a, z33, z24, z25, z3, z15, z26, z13, z34, z7, z8, z9, z10, eVar, fVar, gVar2, dVar2, z11, z12, z352, z362, bVar2);
                                    }
                                }
                                z17 = false;
                                boolean z322 = z17;
                                mediaOptionState2 = mediaOptionState8;
                                mediaOptionState = mediaOptionState7;
                                z9 = z30;
                                z13 = z322;
                                z12 = (isMeCreatorOrAdmin || z8 || !cVar.I) ? false : true;
                                z11 = false;
                                z6 = z31;
                                z5 = z8;
                                str = str3;
                                z10 = n;
                                z7 = z29;
                                sew0 sew0Var2 = whr0Var2.b;
                                str2 = whr0Var2.q;
                                if (str2 == null) {
                                }
                                this.c.getClass();
                                CharSequence a2 = gdp.a(str2);
                                boolean z332 = whr0Var2.c;
                                if (z4) {
                                }
                                mediaOptionState3 = mediaOptionState5;
                                z15 = false;
                                if (f) {
                                }
                                b89.e eVar2 = new b89.e(z6, mediaOptionState);
                                b89.f fVar2 = new b89.f(z6, mediaOptionState2);
                                mediaOptionState4 = cVar.v.get(callMemberId);
                                if (mediaOptionState4 == null) {
                                }
                                if (z6) {
                                }
                                z16 = false;
                                b89.g gVar22 = new b89.g(z16, mediaOptionState4);
                                b89.d dVar22 = new b89.d(z6);
                                boolean z3522 = whr0Var2.e;
                                boolean z3622 = whr0Var2.n;
                                if (z14) {
                                }
                                bVar3 = new b89.h.b(sew0Var2, a2, z332, z24, z25, z3, z15, z26, z13, z34, z7, z8, z9, z10, eVar2, fVar2, gVar22, dVar22, z11, z12, z3522, z3622, bVar2);
                            }
                            z13 = z28;
                            mediaOptionState = mediaOptionState5;
                            mediaOptionState2 = mediaOptionState;
                            z14 = z12;
                            sew0 sew0Var22 = whr0Var2.b;
                            str2 = whr0Var2.q;
                            if (str2 == null) {
                            }
                            this.c.getClass();
                            CharSequence a22 = gdp.a(str2);
                            boolean z3322 = whr0Var2.c;
                            if (z4) {
                            }
                            mediaOptionState3 = mediaOptionState5;
                            z15 = false;
                            if (f) {
                            }
                            b89.e eVar22 = new b89.e(z6, mediaOptionState);
                            b89.f fVar22 = new b89.f(z6, mediaOptionState2);
                            mediaOptionState4 = cVar.v.get(callMemberId);
                            if (mediaOptionState4 == null) {
                            }
                            if (z6) {
                            }
                            z16 = false;
                            b89.g gVar222 = new b89.g(z16, mediaOptionState4);
                            b89.d dVar222 = new b89.d(z6);
                            boolean z35222 = whr0Var2.e;
                            boolean z36222 = whr0Var2.n;
                            if (z14) {
                            }
                            bVar3 = new b89.h.b(sew0Var22, a22, z3322, z24, z25, z3, z15, z26, z13, z34, z7, z8, z9, z10, eVar22, fVar22, gVar222, dVar222, z11, z12, z35222, z36222, bVar2);
                        }
                    }
                    z3 = false;
                    if (!z20) {
                    }
                    if (!f) {
                    }
                    if (f) {
                    }
                    bVar = this.b;
                    isMeCreatorOrAdmin = bVar.isMeCreatorOrAdmin();
                    boolean z282 = z27;
                    boolean contains42 = cVar.C.contains(callMemberId);
                    boolean contains52 = cVar.D.contains(callMemberId);
                    MediaOptionState mediaOptionState52 = MediaOptionState.UNMUTED;
                    if (bVar.isGroupCall()) {
                    }
                    z13 = z282;
                    mediaOptionState = mediaOptionState52;
                    mediaOptionState2 = mediaOptionState;
                    z14 = z12;
                    sew0 sew0Var222 = whr0Var2.b;
                    str2 = whr0Var2.q;
                    if (str2 == null) {
                    }
                    this.c.getClass();
                    CharSequence a222 = gdp.a(str2);
                    boolean z33222 = whr0Var2.c;
                    if (z4) {
                    }
                    mediaOptionState3 = mediaOptionState52;
                    z15 = false;
                    if (f) {
                    }
                    b89.e eVar222 = new b89.e(z6, mediaOptionState);
                    b89.f fVar222 = new b89.f(z6, mediaOptionState2);
                    mediaOptionState4 = cVar.v.get(callMemberId);
                    if (mediaOptionState4 == null) {
                    }
                    if (z6) {
                    }
                    z16 = false;
                    b89.g gVar2222 = new b89.g(z16, mediaOptionState4);
                    b89.d dVar2222 = new b89.d(z6);
                    boolean z352222 = whr0Var2.e;
                    boolean z362222 = whr0Var2.n;
                    if (z14) {
                    }
                    bVar3 = new b89.h.b(sew0Var222, a222, z33222, z24, z25, z3, z15, z26, z13, z34, z7, z8, z9, z10, eVar222, fVar222, gVar2222, dVar2222, z11, z12, z352222, z362222, bVar2);
                }
            }
            bVar3 = new b89.h.a(new IllegalStateException("Profile not found or not present in call"));
        }
        go0 go0Var = s99Var.e;
        if (go0Var instanceof go0.b) {
            c2597a = b89.a.b.a;
        } else if (go0Var instanceof go0.c) {
            c2597a = b89.a.c.a;
        } else if (go0Var instanceof go0.d) {
            c2597a = b89.a.d.a;
        } else {
            if (!(go0Var instanceof go0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c2597a = new b89.a.C2597a(((go0.a) go0Var).a);
        }
        t0y t0yVar = s99Var.f;
        if (t0yVar instanceof t0y.b) {
            aVar = b89.c.b.a;
        } else if (t0yVar instanceof t0y.c) {
            aVar = b89.c.C2598c.a;
        } else if (t0yVar instanceof t0y.d) {
            aVar = b89.c.d.a;
        } else {
            if (!(t0yVar instanceof t0y.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((t0y.a) t0yVar).getClass();
            aVar = new b89.c.a(null);
        }
        return new b89(bVar3, c2597a, aVar);
    }
}
