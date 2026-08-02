package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.efu;
import xsna.q630;
import xsna.z1f0;

/* compiled from: ReactionPickerContent.kt */
/* loaded from: classes2.dex */
public final class p1f0 {
    public static final void a(final List list, final z1f0.b bVar, final Integer num, final boolean z, final com.vk.im.reactions.impl.assets.a aVar, final zjo zjoVar, final boolean z2, final izs izsVar, final gzs gzsVar, final izs izsVar2, q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a aVar3;
        final q630 q630Var2;
        int i2;
        aia0 aia0Var;
        androidx.compose.runtime.a M = aVar2.M(991487502);
        int i3 = i | (M.J(list) ? 4 : 2) | (M.J(bVar) ? 32 : 16) | (M.J(num) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.J(aVar) ? 16384 : 8192) | (M.J(zjoVar) ? 131072 : 65536) | (M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(izsVar) ? 8388608 : 4194304) | (M.y(gzsVar) ? 67108864 : 33554432) | (M.y(izsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (M.t(i3 & 1, (306783379 & i3) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(991487502, i3, 6, "com.vk.im.design.view.ReactionPickerContent (ReactionPickerContent.kt:37)");
            }
            iyk0 iyk0Var = uvi.h;
            final azl azlVar = (azl) M.r(iyk0Var);
            int i4 = (i3 >> 3) & 14;
            if (androidx.compose.runtime.b.d()) {
                i2 = i3;
                androidx.compose.runtime.b.f(-808169727, i4, -1, "com.vk.im.design.view.resolvePickerLayoutParams (ReactionPickerContent.kt:100)");
            } else {
                i2 = i3;
            }
            azl azlVar2 = (azl) M.r(iyk0Var);
            if (bVar instanceof z1f0.b.a) {
                M.K(737981058);
                M.j();
                z1f0.b.a aVar4 = (z1f0.b.a) bVar;
                aia0Var = new aia0(azlVar2.j1(aVar4.b), azlVar2.j1(aVar4.c), azlVar2.j1(aVar4.d), new pco(azlVar2.j1(aVar4.a)), true, azlVar2.j1(0));
            } else {
                M.K(737994975);
                aia0Var = new aia0(r490.d(R.dimen.vkim_reactions_item_size, M), r490.d(R.dimen.vkim_reactions_item_padding, M), r490.d(R.dimen.vkim_reactions_items_list_padding, M), null, false, r490.d(R.dimen.vkim_reactions_item_internal_padding, M));
                M.j();
            }
            final aia0 aia0Var2 = aia0Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar5 = q630.a.a;
            pco pcoVar = aia0Var2.d;
            q630 h = pcoVar != null ? txj0.h(aVar5, pcoVar.b) : aVar5;
            boolean z3 = (i2 & 1879048192) == 536870912;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new p0(izsVar2, 6);
                M.R(x);
            }
            aVar3 = M;
            ua8.a(sv1.z(h, (izs) x), null, false, kai.c(-1193036808, new yzs() { // from class: xsna.i1f0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar6.J(va8Var) ? 4 : 2;
                    }
                    if (aVar6.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1193036808, intValue, -1, "com.vk.im.design.view.ReactionPickerContent.<anonymous> (ReactionPickerContent.kt:46)");
                        }
                        final aia0 aia0Var3 = aia0Var2;
                        float f = aia0Var3.a;
                        float f2 = aia0Var3.c;
                        float f3 = aia0Var3.b;
                        azl azlVar3 = azl.this;
                        int r0 = azlVar3.r0(f);
                        int r02 = azlVar3.r0(f3);
                        int i6 = o6j.i(va8Var.f()) - (azlVar3.r0(f2) * 2);
                        int i7 = r0 + r02;
                        int i8 = (i6 + r02) / i7;
                        if (i8 < 1) {
                            i8 = 1;
                        }
                        List list2 = list;
                        boolean z4 = z;
                        List wowVar = (!z4 || list2.size() <= i8) ? new wow(list2) : j5g.H0(new wow(list2), i8 - 1);
                        boolean z5 = z4 && list2.size() > i8;
                        if (z5 || wowVar.size() >= i8) {
                            i5 = 0;
                        } else {
                            int size = i6 - ((wowVar.size() * i7) - r02);
                            if (size < 0) {
                                size = 0;
                            }
                            i5 = size / 2;
                        }
                        final xfu xfuVar = new xfu(i8, i5, z5, wowVar);
                        float j1 = azlVar3.j1(i5);
                        efu.b bVar2 = new efu.b(i8);
                        boolean z6 = (z4 || (bVar instanceof z1f0.b.a)) ? false : true;
                        a.j g = androidx.compose.foundation.layout.a.g(f3);
                        a.j g2 = androidx.compose.foundation.layout.a.g(f3);
                        u890 u890Var = new u890(j1 + f2, f2, f2, f2);
                        boolean y = aVar6.y(xfuVar);
                        final Integer num2 = num;
                        boolean J = y | aVar6.J(num2) | aVar6.J(aia0Var3);
                        final com.vk.im.reactions.impl.assets.a aVar7 = aVar;
                        boolean J2 = J | aVar6.J(aVar7);
                        final boolean z7 = z2;
                        boolean l = J2 | aVar6.l(z7);
                        final izs izsVar3 = izsVar;
                        boolean J3 = l | aVar6.J(izsVar3);
                        final zjo zjoVar2 = zjoVar;
                        boolean J4 = J3 | aVar6.J(zjoVar2);
                        final gzs gzsVar2 = gzsVar;
                        boolean J5 = J4 | aVar6.J(gzsVar2);
                        Object x2 = aVar6.x();
                        if (J5 || x2 == a.C0011a.a) {
                            izs izsVar4 = new izs() { // from class: xsna.k1f0
                                @Override // xsna.izs
                                public final Object invoke(Object obj4) {
                                    rry rryVar = (rry) obj4;
                                    xfu xfuVar2 = xfu.this;
                                    List<yaw> list3 = xfuVar2.b;
                                    y160 y160Var = new y160(7);
                                    int size2 = list3.size();
                                    n1f0 n1f0Var = new n1f0(y160Var, list3);
                                    fzj fzjVar = new fzj(list3, 2);
                                    Integer num3 = num2;
                                    aia0 aia0Var4 = aia0Var3;
                                    rryVar.a(size2, n1f0Var, fzjVar, new jai(-1117249557, new o1f0(list3, num3, aia0Var4, aVar7, z7, izsVar3), true));
                                    if (xfuVar2.c) {
                                        rry.j(rryVar, null, new jai(1681903111, new l1f0(aia0Var4, zjoVar2, gzsVar2, 0), true), 6);
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar6.R(izsVar4);
                            x2 = izsVar4;
                        }
                        uqy.b(bVar2, null, null, u890Var, g2, g, null, z6, null, (izs) x2, aVar6, 0, 0, 662);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar6.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar3, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar5;
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs(list, bVar, num, z, aVar, zjoVar, z2, izsVar, gzsVar, izsVar2, q630Var2, i) { // from class: xsna.j1f0
                public final /* synthetic */ List b;
                public final /* synthetic */ z1f0.b c;
                public final /* synthetic */ Integer d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ com.vk.im.reactions.impl.assets.a f;
                public final /* synthetic */ zjo g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ izs i;
                public final /* synthetic */ gzs j;
                public final /* synthetic */ izs k;
                public final /* synthetic */ q630 l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    p1f0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
