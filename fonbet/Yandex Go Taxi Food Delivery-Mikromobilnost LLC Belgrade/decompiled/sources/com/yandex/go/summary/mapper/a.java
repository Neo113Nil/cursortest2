package com.yandex.go.summary.mapper;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.divider.DividerUiState$CustomGroupTitleUiState$TextStyleUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import defpackage.aij0;
import defpackage.alj0;
import defpackage.amj0;
import defpackage.anx0;
import defpackage.apj0;
import defpackage.avj0;
import defpackage.bij0;
import defpackage.cw70;
import defpackage.d4h0;
import defpackage.dij0;
import defpackage.eij0;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fef;
import defpackage.fij0;
import defpackage.fkj0;
import defpackage.g9w;
import defpackage.gkj0;
import defpackage.glj0;
import defpackage.hij0;
import defpackage.hkj0;
import defpackage.hlj0;
import defpackage.iij0;
import defpackage.ilj0;
import defpackage.ioj0;
import defpackage.irl;
import defpackage.jci;
import defpackage.jdj0;
import defpackage.jij0;
import defpackage.jl40;
import defpackage.jlj0;
import defpackage.kci;
import defpackage.kij0;
import defpackage.kkj0;
import defpackage.klj0;
import defpackage.kyh0;
import defpackage.lkj0;
import defpackage.llj0;
import defpackage.mja1;
import defpackage.mlj0;
import defpackage.n470;
import defpackage.nlj0;
import defpackage.nu1;
import defpackage.ny61;
import defpackage.okj0;
import defpackage.ovi0;
import defpackage.oyr;
import defpackage.p0h0;
import defpackage.pkj0;
import defpackage.plj0;
import defpackage.ppi;
import defpackage.qkj0;
import defpackage.qlj0;
import defpackage.rcc;
import defpackage.rkj0;
import defpackage.rlj0;
import defpackage.ru1;
import defpackage.saj0;
import defpackage.skj0;
import defpackage.slj0;
import defpackage.su1;
import defpackage.tcc;
import defpackage.tkj0;
import defpackage.tlj0;
import defpackage.uhj0;
import defpackage.uij0;
import defpackage.ukj0;
import defpackage.up2;
import defpackage.vhj0;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.whj0;
import defpackage.wlj0;
import defpackage.wp2;
import defpackage.x4c;
import defpackage.xdf;
import defpackage.xhj0;
import defpackage.xkj0;
import defpackage.xoj0;
import defpackage.xtb1;
import defpackage.y4p;
import defpackage.y6i0;
import defpackage.yhj0;
import defpackage.yoj0;
import defpackage.z5s0;
import defpackage.zhj0;
import defpackage.zmx0;
import defpackage.zoj0;
import defpackage.zuj0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a {
    public final zuj0 a;
    public final xdf b;
    public final c c;

    public a(xdf xdfVar, zuj0 zuj0Var, c cVar) {
        this.a = zuj0Var;
        this.b = xdfVar;
        this.c = cVar;
    }

    public static String a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        if (charSequence2 != null && !evu0.J(charSequence2)) {
            sb.append(Extension.FIX_SPACE + ((Object) charSequence2));
        }
        if (charSequence3 != null && !evu0.J(charSequence3)) {
            sb.append(Extension.FIX_SPACE + ((Object) charSequence3));
        }
        if (charSequence4 != null && !evu0.J(charSequence4)) {
            sb.append(Extension.FIX_SPACE + ((Object) charSequence4));
        }
        return sb.toString();
    }

    public static /* synthetic */ String b(a aVar, CharSequence charSequence, CharSequence charSequence2, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        aVar.getClass();
        return a(charSequence, charSequence2, str, null);
    }

    public static wp2 c(boolean z) {
        return z ? AppColor$Palette.BgMinor : new up2(up2.b);
    }

    public static int d(boolean z) {
        return z ? 16 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [gkj0] */
    public final amj0 e(kij0 kij0Var, boolean z) {
        String str;
        String b;
        fkj0 gkj0Var;
        qkj0 qkj0Var;
        boolean z2 = kij0Var instanceof vhj0;
        qkj0 qkj0Var2 = kkj0.a;
        fkj0 fkj0Var = null;
        if (z2) {
            z5s0 z5s0Var = ((vhj0) kij0Var).a;
            if (z5s0Var.a.length() <= 0) {
                return null;
            }
            uij0 uij0Var = z ? new uij0(mja1.b("", null, 6), Integer.valueOf(p0h0.ic_chat_outline_24), null) : null;
            String str2 = z5s0Var.a;
            String str3 = z5s0Var.b;
            jdj0 jdj0Var = new jdj0(str2, str3);
            String b2 = b(this, str2, str3, null, 12);
            ukj0 ukj0Var = new ukj0(HapticEffect.ClickMedium);
            String str4 = z5s0Var.a;
            return new amj0(str4, str4, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var, jdj0Var, null, qkj0Var2, ukj0Var, b2, RequirementTypeUiState.DEFAULT);
        }
        if (kij0Var instanceof whj0) {
            n470 n470Var = ((whj0) kij0Var).a;
            uij0 uij0Var2 = z ? new uij0(mja1.b("", null, 6), Integer.valueOf(p0h0.ic_coins_outline_24), null) : null;
            String str5 = n470Var.a;
            String str6 = n470Var.b;
            jdj0 jdj0Var2 = new jdj0(str5, str6 != null ? str6 : "");
            String b3 = b(this, str5, str6, null, 12);
            xkj0 xkj0Var = new xkj0(HapticEffect.ClickMedium);
            String str7 = n470Var.a;
            return new amj0(str7, str7, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var2, jdj0Var2, null, qkj0Var2, xkj0Var, b3, RequirementTypeUiState.DEFAULT);
        }
        boolean z3 = kij0Var instanceof xhj0;
        zuj0 zuj0Var = this.a;
        if (z3) {
            xhj0 xhj0Var = (xhj0) kij0Var;
            y4p y4pVar = xhj0Var.a;
            String str8 = y4pVar.a;
            String str9 = y4pVar.b;
            if (str8.length() <= 0) {
                return null;
            }
            uij0 uij0Var3 = z ? new uij0(mja1.b("", null, 6), null, null) : null;
            String str10 = y4pVar.a;
            jdj0 jdj0Var3 = new jdj0(str10, str9 != null ? str9 : "");
            String b4 = b(this, str10, str9, null, 12);
            if (!(str9 == null || str9.length() == 0)) {
                qkj0Var2 = new lkj0(xtb1.c(), new hlj0(HapticEffect.Tick), ((avj0) zuj0Var).h(kyh0.common_remove));
            }
            glj0 glj0Var = new glj0(HapticEffect.ClickMedium);
            String str11 = xhj0Var.e;
            return new amj0(str11, str11, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var3, jdj0Var3, null, qkj0Var2, glj0Var, b4, RequirementTypeUiState.DEFAULT);
        }
        if (kij0Var instanceof yhj0) {
            String str12 = ((yhj0) kij0Var).a;
            return new amj0(str12, str12, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), null, new jdj0(str12, ""), null, null, null, str12, RequirementTypeUiState.DEFAULT);
        }
        if (kij0Var instanceof zhj0) {
            zhj0 zhj0Var = (zhj0) kij0Var;
            g9w g9wVar = zhj0Var.a;
            String str13 = g9wVar.c;
            str = str13 != null ? str13 : "";
            uij0 uij0Var4 = (!evu0.J(str) || z) ? new uij0(mja1.a(str, null, 6), Integer.valueOf(p0h0.ic_baggage_help_outline), null) : null;
            String str14 = g9wVar.a;
            String str15 = g9wVar.b;
            jdj0 jdj0Var4 = new jdj0(str14, str15);
            String b5 = b(this, str14, str15, null, 12);
            if (g9wVar.d) {
                qkj0Var2 = new lkj0(xtb1.c(), new jlj0(HapticEffect.Tick), ((avj0) zuj0Var).h(kyh0.common_remove));
            }
            ilj0 ilj0Var = new ilj0(HapticEffect.ClickMedium);
            String str16 = zhj0Var.e;
            return new amj0(str16, str16, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var4, jdj0Var4, null, qkj0Var2, ilj0Var, b5, RequirementTypeUiState.DEFAULT);
        }
        if (kij0Var instanceof aij0) {
            return f(((aij0) kij0Var).a, z);
        }
        if (kij0Var instanceof bij0) {
            bij0 bij0Var = (bij0) kij0Var;
            uij0 uij0Var5 = z ? new uij0(mja1.b("", null, 6), Integer.valueOf(p0h0.ic_user_add_outline_24), null) : null;
            cw70 cw70Var = bij0Var.a;
            String str17 = cw70Var.a;
            String str18 = cw70Var.b;
            jdj0 jdj0Var5 = new jdj0(str17, str18);
            String b6 = b(this, str17, str18, null, 12);
            if (str18.length() > 0) {
                qkj0Var2 = new lkj0(xtb1.c(), new nlj0(HapticEffect.Tick), ((avj0) zuj0Var).h(kyh0.common_remove));
            }
            mlj0 mlj0Var = new mlj0(HapticEffect.ClickMedium);
            String str19 = cw70Var.a;
            return new amj0(str19, str19, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var5, jdj0Var5, null, qkj0Var2, mlj0Var, b6, RequirementTypeUiState.DEFAULT);
        }
        if (kij0Var instanceof dij0) {
            anx0 anx0Var = ((dij0) kij0Var).a;
            String str20 = anx0Var.d;
            CharSequence charSequence = anx0Var.b;
            CharSequence charSequence2 = anx0Var.a;
            str = str20 != null ? str20 : "";
            uij0 uij0Var6 = (!evu0.J(str) || z) ? new uij0(mja1.a(str, null, 6), null, null) : null;
            jdj0 jdj0Var6 = new jdj0(charSequence2, charSequence);
            String b7 = b(this, charSequence2, charSequence, null, 12);
            zmx0 zmx0Var = anx0Var.e;
            if (zmx0Var instanceof zmx0) {
                qkj0Var = qkj0Var2;
            } else {
                if (zmx0Var != null) {
                    w511.b();
                    return null;
                }
                qkj0Var = null;
            }
            qlj0 qlj0Var = zmx0Var != null ? new qlj0(zmx0Var.a, HapticEffect.ClickMedium) : null;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence2);
            sb.append((Object) charSequence);
            String sb2 = sb.toString();
            return new amj0(sb2, sb2, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var6, jdj0Var6, null, qkj0Var, qlj0Var, b7, RequirementTypeUiState.DEFAULT);
        }
        if (kij0Var instanceof fij0) {
            return new amj0("Testing commands 🔧", "Testing commands 🔧", true, c(z), RequirementRoundedCornersUiState.NONE, d(z), z ? new uij0(mja1.b("", null, 6), null, null) : null, new jdj0("Testing commands 🔧", ""), null, qkj0Var2, new rlj0(HapticEffect.ClickMedium), b(this, "Testing commands 🔧", null, null, 12), RequirementTypeUiState.DEFAULT);
        }
        if (kij0Var instanceof hij0) {
            hij0 hij0Var = (hij0) kij0Var;
            apj0 apj0Var = hij0Var.a;
            String str21 = apj0Var.d;
            if (str21 == null) {
                str21 = "";
            }
            uij0 uij0Var7 = (!evu0.J(str21) || z) ? new uij0(mja1.a(str21, null, 6), null, null) : null;
            String str22 = apj0Var.b;
            String str23 = apj0Var.c;
            jdj0 jdj0Var7 = new jdj0(str22, str23);
            String b8 = b(this, str22, str23, null, 12);
            pkj0 pkj0Var = new pkj0(apj0Var.e, null, "");
            return new amj0(hij0Var.getId(), apj0Var.a, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var7, jdj0Var7, null, pkj0Var, new plj0(apj0Var.a, pkj0Var, HapticEffect.Tick), b8, RequirementTypeUiState.DEFAULT);
        }
        if (kij0Var instanceof iij0) {
            iij0 iij0Var = (iij0) kij0Var;
            String str24 = iij0Var.c;
            if (str24 == null) {
                str24 = "";
            }
            uij0 uij0Var8 = (!evu0.J(str24) || z) ? new uij0(mja1.a(str24, null, 6), null, null) : null;
            String str25 = iij0Var.a;
            String str26 = iij0Var.b;
            jdj0 jdj0Var8 = new jdj0(str25, str26 != null ? str26 : "");
            String b9 = b(this, str25, str26, null, 12);
            if (iij0Var.d) {
                qkj0Var2 = new lkj0(xtb1.c(), new tlj0(HapticEffect.Tick), ((avj0) zuj0Var).h(kyh0.common_remove));
            }
            slj0 slj0Var = new slj0(HapticEffect.ClickMedium);
            String str27 = iij0Var.h;
            return new amj0(str27, str27, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var8, jdj0Var8, null, qkj0Var2, slj0Var, b9, RequirementTypeUiState.DEFAULT);
        }
        if (!(kij0Var instanceof jij0)) {
            if ((kij0Var instanceof uhj0) || (kij0Var instanceof eij0)) {
                return null;
            }
            w511.b();
            return null;
        }
        apj0 apj0Var2 = ((jij0) kij0Var).a;
        String str28 = apj0Var2.d;
        str = str28 != null ? str28 : "";
        uij0 uij0Var9 = (!evu0.J(str) || z) ? new uij0(mja1.a(str, null, 6), null, null) : null;
        String str29 = apj0Var2.b;
        String str30 = apj0Var2.c;
        jdj0 jdj0Var9 = new jdj0(str29, str30);
        zoj0 zoj0Var = apj0Var2.i;
        boolean z4 = zoj0Var instanceof xoj0;
        if (z4) {
            String str31 = ((xoj0) zoj0Var).a.a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append((CharSequence) str29);
            if (!evu0.J(str30) || !evu0.J(str31)) {
                sb3.append(Extension.FIX_SPACE + ((avj0) zuj0Var).h(kyh0.content_description_selected) + " " + ((Object) str31) + Extension.COLON_SPACE + ((Object) str30));
            }
            b = sb3.toString();
        } else {
            b = b(this, str29, str30, null, 12);
        }
        String str32 = b;
        if (z4) {
            fkj0Var = new fkj0(((xoj0) zoj0Var).a.a);
        } else {
            if (zoj0Var instanceof yoj0) {
                gkj0Var = new gkj0(mja1.b(((yoj0) zoj0Var).a, null, 6), null);
                String str33 = apj0Var2.a;
                return new amj0(str33, str33, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var9, jdj0Var9, gkj0Var, qkj0Var2, new wlj0(str33, HapticEffect.ClickMedium), str32, RequirementTypeUiState.DEFAULT);
            }
            if (!zoj0Var.equals(vvb1.N)) {
                w511.b();
                return null;
            }
        }
        gkj0Var = fkj0Var;
        String str332 = apj0Var2.a;
        return new amj0(str332, str332, true, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var9, jdj0Var9, gkj0Var, qkj0Var2, new wlj0(str332, HapticEffect.ClickMedium), str32, RequirementTypeUiState.DEFAULT);
    }

    public final amj0 f(ioj0 ioj0Var, boolean z) {
        boolean z2 = ioj0Var.a.length() > 0;
        boolean z3 = ioj0Var.d;
        boolean z4 = ioj0Var.c;
        qkj0 qkj0Var = null;
        if (!z2) {
            return null;
        }
        String str = ioj0Var.f;
        if (str == null) {
            str = "";
        }
        uij0 uij0Var = (!evu0.J(str) || z) ? new uij0(mja1.a(str, null, 6), Integer.valueOf(p0h0.ic_time_outline_24), null) : null;
        String str2 = ioj0Var.a;
        String str3 = ioj0Var.b;
        jdj0 jdj0Var = new jdj0(str2, str3);
        String b = b(this, str2, str3, null, 12);
        gkj0 gkj0Var = (z4 || evu0.J(str) || !z3) ? null : new gkj0(mja1.b("", null, 6), Integer.valueOf(f1h0.ic_schedule_clock));
        if (z4) {
            qkj0Var = new lkj0(xtb1.c(), new llj0(HapticEffect.Tick), ((avj0) this.a).h(kyh0.common_remove));
        } else if (evu0.J(str) || !z3) {
            qkj0Var = kkj0.a;
        }
        qkj0 qkj0Var2 = qkj0Var;
        klj0 klj0Var = new klj0(HapticEffect.ClickMedium);
        String str4 = ioj0Var.a;
        return new amj0(str4, str4, !ioj0Var.e, c(z), RequirementRoundedCornersUiState.NONE, d(z), uij0Var, jdj0Var, gkj0Var, qkj0Var2, klj0Var, b, RequirementTypeUiState.DEFAULT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0113 -> B:10:0x0118). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(saj0 saj0Var, String str, String str2, int i, boolean z, ContinuationImpl continuationImpl) {
        RequirementUiStateMapper$map$2 requirementUiStateMapper$map$2;
        int i2;
        ListBuilder a;
        String str3;
        int i3;
        boolean z2;
        saj0 saj0Var2;
        RequirementUiStateMapper$map$2 requirementUiStateMapper$map$22;
        Iterator it;
        ArrayList arrayList;
        String str4;
        String str5;
        Collection collection;
        Object obj;
        String str6;
        String str7;
        ppi ppiVar;
        ppi ppiVar2;
        a aVar = this;
        if (continuationImpl instanceof RequirementUiStateMapper$map$2) {
            requirementUiStateMapper$map$2 = (RequirementUiStateMapper$map$2) continuationImpl;
            int i4 = requirementUiStateMapper$map$2.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                requirementUiStateMapper$map$2.label = i4 - Integer.MIN_VALUE;
                Object obj2 = requirementUiStateMapper$map$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = requirementUiStateMapper$map$2.label;
                if (i2 != 0) {
                    b.b(obj2);
                    a = rcc.a();
                    String str8 = saj0Var.a;
                    if (str8 != null && str8.length() != 0) {
                        a.add(new irl(str8, str8, str8, AppColor$Palette.TextMinor, DividerUiState$CustomGroupTitleUiState$TextStyleUiState.GLUED_REQUIREMENTS_TEXT_STYLE, z ? x4c.E : x4c.F, SlotSize.XS));
                    }
                    List list = saj0Var.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                    str3 = str2;
                    i3 = i;
                    z2 = z;
                    saj0Var2 = saj0Var;
                    requirementUiStateMapper$map$22 = requirementUiStateMapper$map$2;
                    it = list.iterator();
                    arrayList = arrayList2;
                    str4 = str8;
                    str5 = str;
                    collection = a;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = requirementUiStateMapper$map$2.Z$0;
                    int i5 = requirementUiStateMapper$map$2.I$0;
                    Collection collection2 = (Collection) requirementUiStateMapper$map$2.L$12;
                    Iterator it2 = (Iterator) requirementUiStateMapper$map$2.L$9;
                    ?? r7 = (Collection) requirementUiStateMapper$map$2.L$8;
                    String str9 = (String) requirementUiStateMapper$map$2.L$5;
                    ?? r12 = (List) requirementUiStateMapper$map$2.L$4;
                    Collection collection3 = (List) requirementUiStateMapper$map$2.L$3;
                    String str10 = (String) requirementUiStateMapper$map$2.L$2;
                    String str11 = (String) requirementUiStateMapper$map$2.L$1;
                    saj0Var2 = (saj0) requirementUiStateMapper$map$2.L$0;
                    b.b(obj2);
                    z2 = z3;
                    str4 = str9;
                    str5 = str11;
                    it = it2;
                    ListBuilder listBuilder = r12;
                    str3 = str10;
                    arrayList = r7;
                    requirementUiStateMapper$map$22 = requirementUiStateMapper$map$2;
                    collection = collection3;
                    i3 = i5;
                    collection2.add((amj0) obj2);
                    a = listBuilder;
                    if (it.hasNext()) {
                        nu1 nu1Var = (nu1) it.next();
                        boolean l = jl40.l(nu1Var.b, str5);
                        String str12 = saj0Var2.d;
                        String str13 = saj0Var2.e;
                        fef fefVar = saj0Var2.c;
                        requirementUiStateMapper$map$22.L$0 = saj0Var2;
                        requirementUiStateMapper$map$22.L$1 = str5;
                        requirementUiStateMapper$map$22.L$2 = str3;
                        requirementUiStateMapper$map$22.L$3 = collection;
                        requirementUiStateMapper$map$22.L$4 = a;
                        requirementUiStateMapper$map$22.L$5 = str4;
                        requirementUiStateMapper$map$22.L$6 = null;
                        requirementUiStateMapper$map$22.L$7 = null;
                        requirementUiStateMapper$map$22.L$8 = arrayList;
                        requirementUiStateMapper$map$22.L$9 = it;
                        requirementUiStateMapper$map$22.L$10 = null;
                        requirementUiStateMapper$map$22.L$11 = null;
                        requirementUiStateMapper$map$22.L$12 = arrayList;
                        requirementUiStateMapper$map$22.I$0 = i3;
                        requirementUiStateMapper$map$22.Z$0 = z2;
                        requirementUiStateMapper$map$22.label = 1;
                        String str14 = str4;
                        Collection collection4 = collection;
                        listBuilder = a;
                        aVar = this;
                        obj2 = aVar.h(nu1Var, l, str12, str13, fefVar, z2, requirementUiStateMapper$map$22);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection2 = arrayList;
                        collection = collection4;
                        str4 = str14;
                        collection2.add((amj0) obj2);
                        a = listBuilder;
                        if (it.hasNext()) {
                            String str15 = str4;
                            ListBuilder listBuilder2 = a;
                            Collection collection5 = collection;
                            listBuilder2.addAll(arrayList);
                            kci kciVar = saj0Var2.f;
                            if (kciVar != null) {
                                fef fefVar2 = saj0Var2.c;
                                String str16 = saj0Var2.d;
                                String str17 = saj0Var2.e;
                                List list2 = kciVar.d;
                                jci jciVar = kciVar.b;
                                Iterator it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it3.next();
                                    if (jl40.l(((nu1) obj).b, str3)) {
                                        break;
                                    }
                                }
                                nu1 nu1Var2 = (nu1) obj;
                                boolean z4 = str5 != null && jl40.l(str3, str5);
                                String str18 = jciVar.f;
                                if (str18 == null) {
                                    str18 = "";
                                }
                                uij0 uij0Var = (!evu0.J(str18) || z2) ? new uij0(mja1.a(str18, null, 6), Integer.valueOf(d4h0.ic_delivery_interval), null) : null;
                                String str19 = jciVar.a;
                                if ((nu1Var2 == null || (ppiVar2 = nu1Var2.f) == null || (str6 = ppiVar2.f) == null) && (str6 = jciVar.b) == null) {
                                    str6 = "";
                                }
                                jdj0 jdj0Var = new jdj0(str19, str6);
                                if (nu1Var2 == null || (ppiVar = nu1Var2.f) == null || (str7 = ppiVar.e) == null) {
                                    str7 = jciVar.c;
                                }
                                boolean z5 = z2;
                                String a2 = aVar.b.a(fefVar2, str7, false, true);
                                hkj0 hkj0Var = !evu0.J(a2) ? new hkj0(null, a2, "") : null;
                                qkj0 okj0Var = nu1Var2 == null ? kkj0.a : new okj0(z4);
                                alj0 alj0Var = new alj0(str16, str17, HapticEffect.ClickMedium);
                                String b = b(aVar, str19, str6, a2, 8);
                                String i6 = oyr.i(i3, "delivery_intervals_");
                                listBuilder2.add(y6i0.d(kciVar.a + (((str15 == null || str15.length() == 0) ? 1 : 0) ^ 1), 0, listBuilder2.size()), new amj0(i6, i6, true, c(z5), RequirementRoundedCornersUiState.NONE, d(z5), uij0Var, jdj0Var, hkj0Var, okj0Var, alj0Var, b, RequirementTypeUiState.DEFAULT));
                            }
                            return ((ListBuilder) collection5).j();
                        }
                    }
                }
            }
        }
        requirementUiStateMapper$map$2 = new RequirementUiStateMapper$map$2(aVar, continuationImpl);
        Object obj22 = requirementUiStateMapper$map$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = requirementUiStateMapper$map$2.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [xlj0] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(nu1 nu1Var, boolean z, String str, String str2, fef fefVar, boolean z2, ContinuationImpl continuationImpl) {
        RequirementUiStateMapper$toRequirementUiState$1 requirementUiStateMapper$toRequirementUiState$1;
        int i;
        su1 su1Var;
        uij0 uij0Var;
        jdj0 jdj0Var;
        ovi0 a;
        hkj0 hkj0Var;
        boolean z3;
        nu1 nu1Var2;
        boolean z4;
        String str3;
        String str4;
        String str5;
        ovi0 ovi0Var;
        uij0 uij0Var2;
        jdj0 jdj0Var2;
        uij0 uij0Var3;
        String str6;
        hkj0 hkj0Var2;
        ?? r28;
        ?? r3;
        if (continuationImpl instanceof RequirementUiStateMapper$toRequirementUiState$1) {
            requirementUiStateMapper$toRequirementUiState$1 = (RequirementUiStateMapper$toRequirementUiState$1) continuationImpl;
            int i2 = requirementUiStateMapper$toRequirementUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementUiStateMapper$toRequirementUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementUiStateMapper$toRequirementUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementUiStateMapper$toRequirementUiState$1.label;
                if (i != 0) {
                    b.b(obj);
                    su1Var = nu1Var.e;
                    String str7 = su1Var.i;
                    if (str7 == null) {
                        str7 = "";
                    }
                    uij0Var = (!evu0.J(str7) || z2) ? new uij0(mja1.a(str7, null, 6), new Integer(d4h0.ic_delivery_alt_option), null) : null;
                    String str8 = su1Var.b;
                    String str9 = su1Var.c;
                    if (str9 == null) {
                        str9 = "";
                    }
                    jdj0Var = new jdj0(str8, str9);
                    String str10 = su1Var.k;
                    a = (str10 == null || evu0.J(str10)) ? null : mja1.a(str10, null, 6);
                    String str11 = su1Var.d;
                    String a2 = str11 != null ? this.b.a(fefVar, str11, false, true) : null;
                    FormattedText formattedText = su1Var.f;
                    if (formattedText == null) {
                        hkj0Var = null;
                        z3 = z;
                        nu1Var2 = nu1Var;
                        z4 = z2;
                        str3 = a2;
                        str4 = str;
                        str5 = str2;
                        uij0Var3 = uij0Var;
                        jdj0Var2 = jdj0Var;
                        str6 = su1Var.e;
                        ovi0Var = a;
                        if (ovi0Var == null || !((str3 == null || evu0.J(str3)) && (str6 == null || evu0.J(str6)))) {
                            hkj0Var2 = new hkj0(ovi0Var, str3 == null ? "" : str3, str6 != null ? str6 : "");
                        } else {
                            hkj0Var2 = hkj0Var;
                        }
                        String str12 = su1Var.m;
                        ru1 ru1Var = su1Var.l;
                        boolean z5 = ru1Var != null;
                        boolean z6 = str12 != null;
                        qkj0 okj0Var = (!z5 || z6) ? kkj0.a : new okj0(z3);
                        if (nu1Var2.d) {
                            r28 = z6 ? new skj0(str12, str4, str5, HapticEffect.ClickMedium) : z5 ? new tkj0(ru1Var.a, ru1Var.b, str4, str5, HapticEffect.ClickMedium) : new rkj0(nu1Var2.a.b, nu1Var2.b, str5, HapticEffect.ClickMedium);
                        } else {
                            r28 = hkj0Var;
                        }
                        String a3 = a(jdj0Var2.a, jdj0Var2.b, str3, str6);
                        String str13 = nu1Var2.b;
                        return new amj0(str13, str13, nu1Var2.d, c(z4), RequirementRoundedCornersUiState.NONE, d(z4), uij0Var3, jdj0Var2, hkj0Var2, okj0Var, r28, a3, RequirementTypeUiState.DEFAULT);
                    }
                    requirementUiStateMapper$toRequirementUiState$1.L$0 = nu1Var;
                    requirementUiStateMapper$toRequirementUiState$1.L$1 = str;
                    requirementUiStateMapper$toRequirementUiState$1.L$2 = str2;
                    requirementUiStateMapper$toRequirementUiState$1.L$3 = null;
                    requirementUiStateMapper$toRequirementUiState$1.L$4 = su1Var;
                    requirementUiStateMapper$toRequirementUiState$1.L$5 = null;
                    requirementUiStateMapper$toRequirementUiState$1.L$6 = uij0Var;
                    requirementUiStateMapper$toRequirementUiState$1.L$7 = jdj0Var;
                    requirementUiStateMapper$toRequirementUiState$1.L$8 = null;
                    requirementUiStateMapper$toRequirementUiState$1.L$9 = a;
                    requirementUiStateMapper$toRequirementUiState$1.L$10 = a2;
                    requirementUiStateMapper$toRequirementUiState$1.L$11 = null;
                    z3 = z;
                    requirementUiStateMapper$toRequirementUiState$1.Z$0 = z3;
                    requirementUiStateMapper$toRequirementUiState$1.Z$1 = z2;
                    requirementUiStateMapper$toRequirementUiState$1.label = 1;
                    hkj0Var = null;
                    Object i3 = c.i(this.c, formattedText, null, requirementUiStateMapper$toRequirementUiState$1, 30);
                    if (i3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    nu1Var2 = nu1Var;
                    ovi0Var = a;
                    str4 = str;
                    uij0Var2 = uij0Var;
                    jdj0Var2 = jdj0Var;
                    obj = i3;
                    z4 = z2;
                    str3 = a2;
                    str5 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z4 = requirementUiStateMapper$toRequirementUiState$1.Z$1;
                    boolean z7 = requirementUiStateMapper$toRequirementUiState$1.Z$0;
                    str3 = (String) requirementUiStateMapper$toRequirementUiState$1.L$10;
                    ovi0Var = (ovi0) requirementUiStateMapper$toRequirementUiState$1.L$9;
                    jdj0Var2 = (jdj0) requirementUiStateMapper$toRequirementUiState$1.L$7;
                    uij0Var2 = (uij0) requirementUiStateMapper$toRequirementUiState$1.L$6;
                    su1Var = (su1) requirementUiStateMapper$toRequirementUiState$1.L$4;
                    str5 = (String) requirementUiStateMapper$toRequirementUiState$1.L$2;
                    str4 = (String) requirementUiStateMapper$toRequirementUiState$1.L$1;
                    nu1Var2 = (nu1) requirementUiStateMapper$toRequirementUiState$1.L$0;
                    b.b(obj);
                    z3 = z7;
                    hkj0Var = null;
                }
                r3 = (CharSequence) obj;
                if (r3 == 0) {
                    uij0Var3 = uij0Var2;
                    str6 = r3;
                    if (ovi0Var == null) {
                    }
                    hkj0Var2 = new hkj0(ovi0Var, str3 == null ? "" : str3, str6 != null ? str6 : "");
                    String str122 = su1Var.m;
                    ru1 ru1Var2 = su1Var.l;
                    if (ru1Var2 != null) {
                    }
                    if (str122 != null) {
                    }
                    qkj0 okj0Var2 = (!z5 || z6) ? kkj0.a : new okj0(z3);
                    if (nu1Var2.d) {
                    }
                    String a32 = a(jdj0Var2.a, jdj0Var2.b, str3, str6);
                    String str132 = nu1Var2.b;
                    return new amj0(str132, str132, nu1Var2.d, c(z4), RequirementRoundedCornersUiState.NONE, d(z4), uij0Var3, jdj0Var2, hkj0Var2, okj0Var2, r28, a32, RequirementTypeUiState.DEFAULT);
                }
                jdj0Var = jdj0Var2;
                uij0Var = uij0Var2;
                a = ovi0Var;
                uij0Var3 = uij0Var;
                jdj0Var2 = jdj0Var;
                str6 = su1Var.e;
                ovi0Var = a;
                if (ovi0Var == null) {
                }
                hkj0Var2 = new hkj0(ovi0Var, str3 == null ? "" : str3, str6 != null ? str6 : "");
                String str1222 = su1Var.m;
                ru1 ru1Var22 = su1Var.l;
                if (ru1Var22 != null) {
                }
                if (str1222 != null) {
                }
                qkj0 okj0Var22 = (!z5 || z6) ? kkj0.a : new okj0(z3);
                if (nu1Var2.d) {
                }
                String a322 = a(jdj0Var2.a, jdj0Var2.b, str3, str6);
                String str1322 = nu1Var2.b;
                return new amj0(str1322, str1322, nu1Var2.d, c(z4), RequirementRoundedCornersUiState.NONE, d(z4), uij0Var3, jdj0Var2, hkj0Var2, okj0Var22, r28, a322, RequirementTypeUiState.DEFAULT);
            }
        }
        requirementUiStateMapper$toRequirementUiState$1 = new RequirementUiStateMapper$toRequirementUiState$1(this, continuationImpl);
        Object obj2 = requirementUiStateMapper$toRequirementUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementUiStateMapper$toRequirementUiState$1.label;
        if (i != 0) {
        }
        r3 = (CharSequence) obj2;
        if (r3 == 0) {
        }
    }
}
