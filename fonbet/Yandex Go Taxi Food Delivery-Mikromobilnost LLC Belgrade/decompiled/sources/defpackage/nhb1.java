package defpackage;

import android.text.Spanned;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.emoji2.text.EmojiSpan;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.text.BreakIterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class nhb1 {
    public static final void a(final vv9 vv9Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(363697179);
        int i2 = (btsVar.k(vv9Var) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            uo5 uo5Var = x4c.y;
            c530 c530Var = c530.a;
            f530 g = ljs0.g(bzk0.c(an91.o(ljs0.c(c530Var, 1.0f), 12.0f, 0.0f, 12.0f, 8.0f, 2), new up2(rzo.d(vv9Var.d)), cyk0.c(20.0f)), 64.0f, 0.0f, 2);
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, g);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            ydb1.a(ljs0.c(c530Var, 1.0f), wwg.S(-1422343425, true, new zls() { // from class: js9
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    c530 c530Var2 = c530.a;
                    vv9 vv9Var2 = vv9Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                btsVar2.Y();
                            } else if (vv9Var2.c != null) {
                                btsVar2.e0(1114429574);
                                nvi0 nvi0Var = vv9Var2.c;
                                f530 k = an91.k(ljs0.m(c530Var2, 56.0f), 16.0f);
                                o4d.a.getClass();
                                v0b1.a(nvi0Var, k, null, null, o4d.b, null, null, null, 0.0f, 0, btsVar2, 24624, 1004);
                                btsVar2.t(false);
                            } else {
                                btsVar2.e0(1114690501);
                                oeb1.c(btsVar2, ljs0.q(c530Var2, 16.0f));
                                btsVar2.t(false);
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                sic a = qic.a(lr20.e, x4c.G, btsVar3, 6);
                                int hashCode2 = Long.hashCode(btsVar3.T);
                                r1b0 o2 = btsVar3.o();
                                f530 d3 = b.d(btsVar3, c530Var2);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a);
                                qje.W(btsVar3, d.e, o2);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d3);
                                qgy.b(vv9Var2.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.b, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                qgy.b(vv9Var2.b, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(2083031076, true, new zls() { // from class: js9
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    c530 c530Var2 = c530.a;
                    vv9 vv9Var2 = vv9Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                btsVar2.Y();
                            } else if (vv9Var2.c != null) {
                                btsVar2.e0(1114429574);
                                nvi0 nvi0Var = vv9Var2.c;
                                f530 k = an91.k(ljs0.m(c530Var2, 56.0f), 16.0f);
                                o4d.a.getClass();
                                v0b1.a(nvi0Var, k, null, null, o4d.b, null, null, null, 0.0f, 0, btsVar2, 24624, 1004);
                                btsVar2.t(false);
                            } else {
                                btsVar2.e0(1114690501);
                                oeb1.c(btsVar2, ljs0.q(c530Var2, 16.0f));
                                btsVar2.t(false);
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                sic a = qic.a(lr20.e, x4c.G, btsVar3, 6);
                                int hashCode2 = Long.hashCode(btsVar3.T);
                                r1b0 o2 = btsVar3.o();
                                f530 d3 = b.d(btsVar3, c530Var2);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a);
                                qje.W(btsVar3, d.e, o2);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d3);
                                qgy.b(vv9Var2.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.b, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                qgy.b(vv9Var2.b, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, null, null, SlotSize.L, false, btsVar, 1573302, 184);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(vv9Var, i, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(int i, String str) {
        String str2;
        int i2;
        ftn d = d();
        Integer num = null;
        if (d != null) {
            d6z.y("Not initialized yet", d.f());
            d6z.v(str, "charSequence cannot be null");
            androidx.emoji2.text.b bVar = (androidx.emoji2.text.b) d.d.a;
            bVar.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i, i + 1, EmojiSpan.class);
                    if (emojiSpanArr.length > 0) {
                        i2 = spanned.getSpanEnd(emojiSpanArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((kun) bVar.g(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new kun(i))).c;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int c(int i, String str) {
        ftn d = d();
        Integer num = null;
        if (d != null) {
            Integer valueOf = Integer.valueOf(d.b(Math.max(0, i - 1), str));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final ftn d() {
        if (!ftn.e()) {
            return null;
        }
        ftn a = ftn.a();
        if (a.c() == 1) {
            return a;
        }
        return null;
    }
}
