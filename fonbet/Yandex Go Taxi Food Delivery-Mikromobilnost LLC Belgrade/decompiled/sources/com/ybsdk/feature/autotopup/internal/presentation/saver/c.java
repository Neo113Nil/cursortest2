package com.ybsdk.feature.autotopup.internal.presentation.saver;

import android.content.Context;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.domain.entities.rounding.RoundingStatusEntity;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingStatus;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingState;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import defpackage.ahq0;
import defpackage.c5z;
import defpackage.ccv;
import defpackage.dcv;
import defpackage.dzh0;
import defpackage.dzk0;
import defpackage.ea4;
import defpackage.ev31;
import defpackage.ezk0;
import defpackage.fa4;
import defpackage.fxy0;
import defpackage.g8e;
import defpackage.h5a0;
import defpackage.jl40;
import defpackage.l24;
import defpackage.nbv;
import defpackage.pbv;
import defpackage.qtz0;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.rbv;
import defpackage.rev;
import defpackage.rr51;
import defpackage.rzk0;
import defpackage.s8j0;
import defpackage.scc;
import defpackage.stz0;
import defpackage.szk0;
import defpackage.t8j0;
import defpackage.tcc;
import defpackage.tsz0;
import defpackage.tzk0;
import defpackage.u8j0;
import defpackage.ung0;
import defpackage.uzk0;
import defpackage.vfv;
import defpackage.w530;
import defpackage.wyk0;
import defpackage.xxg0;
import defpackage.xyk0;
import defpackage.ztv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class c implements ev31 {
    public final Context a;
    public final w530 b;

    public c(Context context, w530 w530Var) {
        this.a = context;
        this.b = w530Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0315  */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ybsdk.core.utils.text.Text$Empty] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [rzk0] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [l24] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3, types: [com.ybsdk.core.utils.text.Text$Constant] */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v35 */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Money money;
        Text resource;
        rbv nbvVar;
        ea4 ea4Var;
        ?? r27;
        ?? r0;
        String str;
        String b;
        dzk0 dzk0Var;
        RoundingState roundingState = (RoundingState) obj;
        u8j0 u8j0Var = roundingState.e;
        u8j0Var.getClass();
        if (u8j0Var instanceof t8j0) {
            return uzk0.a;
        }
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        ezk0 ezk0Var = (ezk0) u8j0Var.a();
        if (th != null || ezk0Var == null) {
            return new tzk0(r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        h5a0 h5a0Var = roundingState.f;
        xyk0 xyk0Var = roundingState.c;
        ezk0 ezk0Var2 = (ezk0) u8j0Var.a();
        String a = (jl40.l((ezk0Var2 == null || (dzk0Var = ezk0Var2.a) == null) ? null : dzk0Var.d, xyk0Var) || xyk0Var == null || (money = xyk0Var.c) == null) ? null : w530.a(this.b, money.getAmount(), money.getCurrency(), false, null, false, 44);
        u8j0 u8j0Var2 = roundingState.a;
        boolean z = u8j0Var2 instanceof r8j0;
        r8j0 r8j0Var = z ? (r8j0) u8j0Var2 : null;
        boolean z2 = (r8j0Var != null ? (RoundingStatusEntity) r8j0Var.a : null) == RoundingStatusEntity.ENABLED;
        r8j0 r8j0Var2 = z ? (r8j0) u8j0Var2 : null;
        boolean z3 = (r8j0Var2 != null ? (RoundingStatusEntity) r8j0Var2.a : null) == RoundingStatusEntity.DISABLED;
        ColorModel.Attr attr = z3 ? new ColorModel.Attr(ung0.ybColor_button_disabled) : new ColorModel.Attr(ung0.ybColor_button_primaryNormal);
        YbButtonViewGroup.Orientation orientation = YbButtonViewGroup.Orientation.HORIZONTAL;
        YbButtonViewGroup.a aVar = new YbButtonViewGroup.a((h5a0Var == null || (b = h5a0Var.b()) == null) ? null : d.e(b), 6);
        com.ybsdk.core.utils.text.b bVar = Text.Companion;
        String str2 = ezk0Var.f;
        tsz0 tsz0Var = ezk0Var.c;
        dzk0 dzk0Var2 = ezk0Var.a;
        YbButtonView.a aVar2 = new YbButtonView.a(g8e.i(bVar, str2), null, null, attr, null, null, null, !z3, z2, null, 2550);
        RoundingStatus roundingStatus = dzk0Var2.a;
        fa4 fa4Var = dzk0Var2.b;
        YbButtonViewGroup.b bVar2 = new YbButtonViewGroup.b(orientation, aVar2, roundingStatus == RoundingStatus.ENABLED ? new YbButtonView.a(new Text.Constant(ezk0Var.g), null, null, new ColorModel.Attr(ung0.ybColor_button_secondaryNormal), null, null, null, !z2, z3, null, 2550) : null, aVar);
        rr51 rr51Var = fa4Var.a;
        c5z c5zVar = a != null ? new c5z("autotopup_widget_amount", a) : null;
        rzk0 rzk0Var = (rr51Var == null || c5zVar == null) ? null : new rzk0(rr51Var, Collections.singletonList(c5zVar));
        ztv ztvVar = ezk0Var.d;
        Text.Constant constant = ztvVar != null ? new Text.Constant(ztvVar.a) : null;
        Text.Constant constant2 = new Text.Constant(tsz0Var.a);
        Text.Constant constant3 = new Text.Constant(tsz0Var.b);
        String str3 = tsz0Var.c;
        Text.Constant constant4 = str3 != null ? new Text.Constant(str3) : null;
        ColorModel.Attr attr2 = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
        fxy0 fxy0Var = tsz0Var.d;
        Context context = this.a;
        stz0 stz0Var = new stz0(constant2, constant3, null, null, null, qtz0.a, false, null, attr2, constant4, new pbv((String) fxy0Var.a(context), (ccv) null, rev.h, (dcv) null, (vfv) null, 58), null, 29148);
        List<xyk0> list = dzk0Var2.e;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (xyk0 xyk0Var2 : list) {
            arrayList.add(new wyk0(xyk0Var2.a, new Text.Constant(xyk0Var2.b), jl40.l(xyk0Var2.a, xyk0Var != null ? xyk0Var.a : null)));
        }
        Text.Resource resource2 = new Text.Resource(dzh0.ybsdk_auto_topup_rounding_payment_method_title);
        if (h5a0Var == null || (resource = h5a0Var.getTitle()) == null) {
            resource = new Text.Resource(dzh0.ybsdk_auto_topup_regular_source_hint);
        }
        Text text = resource;
        ColorModel.Attr attr3 = new ColorModel.Attr(roundingState.d == RoundingState.ValidationError.SOURCE_BUTTON_NOT_FILLED ? ung0.ybColor_textIcon_negative : h5a0Var == null ? ung0.ybColor_textIcon_secondary : ung0.ybColor_textIcon_primary);
        ezk0 ezk0Var3 = (ezk0) u8j0Var.a();
        boolean z4 = (ezk0Var3 != null ? ezk0Var3.e.a.size() : 0) > 1;
        Text.Resource resource3 = h5a0Var == null ? null : resource2;
        if (h5a0Var == null || (nbvVar = h5a0Var.a(context)) == null) {
            ea4Var = null;
            nbvVar = new nbv(xxg0.ybsdk_autotopup_regular_source_icon_default, null);
        } else {
            ea4Var = null;
        }
        ahq0 ahq0Var = new ahq0(z4, nbvVar, text, (Text) null, resource3, (Text.Resource) null, 0, attr3, 232);
        ea4 ea4Var2 = fa4Var.b;
        if (ea4Var2 != null) {
            if (fa4Var.a != null) {
                ea4Var2 = ea4Var;
            }
            if (ea4Var2 != null) {
                ?? format = (a == null || (str = ea4Var2.c) == null) ? ea4Var : String.format(str, Arrays.copyOf(new Object[]{a}, 1));
                pbv pbvVar = new pbv((String) ea4Var2.d.a(context), (ccv) null, rev.m, (dcv) null, (vfv) null, 58);
                ArrayList arrayList2 = ea4Var2.h;
                Text i = format != 0 ? g8e.i(Text.Companion, format) : Text.Empty.INSTANCE;
                Text.Constant i2 = g8e.i(Text.Companion, ea4Var2.a);
                String str4 = ea4Var2.j;
                ?? constant5 = str4 != null ? new Text.Constant(str4) : ea4Var;
                Text.Constant constant6 = new Text.Constant(ea4Var2.b);
                com.ybsdk.core.utils.b bVar3 = ColorModel.Hex.Companion;
                String str5 = (String) ea4Var2.f.a(context);
                ColorModel attr4 = new ColorModel.Attr(ung0.ybColor_fill_color6_400);
                bVar3.getClass();
                ColorModel a2 = com.ybsdk.core.utils.b.a(str5);
                ColorModel colorModel = a2 == null ? attr4 : a2;
                String str6 = (String) ea4Var2.g.a(context);
                ColorModel attr5 = new ColorModel.Attr(ung0.ybColor_fill_color6_100);
                ColorModel a3 = com.ybsdk.core.utils.b.a(str6);
                r27 = new l24(pbvVar, arrayList2, i, i2, constant5, constant6, colorModel, a3 == null ? attr5 : a3);
                ezk0 ezk0Var4 = (ezk0) u8j0Var.a();
                r0 = ezk0Var4 == null ? ezk0Var4.b : ea4Var;
                if (r0 == 0) {
                    r0 = Text.Empty.INSTANCE;
                }
                Text text2 = r0;
                ?? r02 = xyk0Var == null ? xyk0Var.a : ea4Var;
                rr51 rr51Var2 = dzk0Var2.c;
                return new szk0(text2, bVar2, (rr51Var2 != null || r02 == 0) ? ea4Var : new rzk0(rr51Var2, scc.h(r02 == 0 ? new c5z("selected_option_variable", r02) : ea4Var)), rzk0Var, constant, stz0Var, arrayList, ahq0Var, r27);
            }
        }
        r27 = ea4Var;
        ezk0 ezk0Var42 = (ezk0) u8j0Var.a();
        if (ezk0Var42 == null) {
        }
        if (r0 == 0) {
        }
        Text text22 = r0;
        if (xyk0Var == null) {
        }
        rr51 rr51Var22 = dzk0Var2.c;
        return new szk0(text22, bVar2, (rr51Var22 != null || r02 == 0) ? ea4Var : new rzk0(rr51Var22, scc.h(r02 == 0 ? new c5z("selected_option_variable", r02) : ea4Var)), rzk0Var, constant, stz0Var, arrayList, ahq0Var, r27);
    }
}
