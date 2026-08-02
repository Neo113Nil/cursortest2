package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.us2;

/* compiled from: ClipsMenu.kt */
/* loaded from: classes17.dex */
public final class hle {

    /* compiled from: ClipsMenu.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ModalActionSheetListItem.IconSize.values().length];
            try {
                iArr[ModalActionSheetListItem.IconSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModalActionSheetListItem.IconSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModalActionSheetListItem.IconSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ModalActionSheetListItem.Appearance.values().length];
            try {
                iArr2[ModalActionSheetListItem.Appearance.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ModalActionSheetListItem.Appearance.Negative.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ModalActionSheetListItem.Appearance.Disabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ModalActionSheetListItem.Appearance.TintedDisable.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        Iterator it;
        int i2;
        int i3;
        us2.b bVar;
        int m;
        xu20 xu20Var;
        String str;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        com.vk.core.compose.component.cell.content.h1 h1Var2;
        com.vk.core.compose.component.cell.content.k0 k0Var;
        Cell$Left.Main.Size size;
        char c;
        long j;
        String str2;
        ModalActionSheetListItem modalActionSheetListItem;
        yu20 yu20Var;
        com.vk.core.compose.component.cell.content.x xVar;
        String str3;
        int i4;
        char c2;
        long j2;
        int i5;
        com.vk.core.compose.component.cell.content.h1 h1Var3;
        androidx.compose.runtime.a M = aVar.M(-1589722494);
        int i6 = -1;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1589722494, i, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.ClipsMenu (ClipsMenu.kt:22)");
        }
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        int i7 = 0;
        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
        int hashCode = Long.hashCode(n34.n(M));
        sy90 D = M.D();
        q630 c3 = qri.c(M, q630.a.a);
        cri.h7.getClass();
        LayoutNode.a aVar2 = cri.a.b;
        if (M.N() == null) {
            n34.r();
            throw null;
        }
        M.H();
        if (M.L()) {
            M.I(aVar2);
        } else {
            M.f();
        }
        k9q0.w(M, a2, cri.a.f);
        k9q0.w(M, D, cri.a.e);
        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(M, cri.a.h);
        k9q0.w(M, c3, cri.a.d);
        M.K(-1543621181);
        Iterator it2 = list.iterator();
        while (true) {
            int i8 = 1;
            if (!it2.hasNext()) {
                if (gp.d(M)) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new qm7(list, izsVar, i, i8);
                    return;
                }
                return;
            }
            yu20 yu20Var2 = (yu20) it2.next();
            if (yu20Var2 instanceof ModalActionSheetListItem) {
                M.K(22294260);
                ModalActionSheetListItem modalActionSheetListItem2 = (ModalActionSheetListItem) yu20Var2;
                M.K(-1358295757);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1358295757, i7, i6, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.toCellLeft (ClipsMenu.kt:45)");
                }
                int i9 = modalActionSheetListItem2.f;
                ModalActionSheetListItem.Appearance appearance = modalActionSheetListItem2.b;
                if (i9 == 0) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    yu20Var = yu20Var2;
                    modalActionSheetListItem = modalActionSheetListItem2;
                    str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    xVar = null;
                } else {
                    lg90 a3 = pg90.a(i9, i7, M);
                    int i10 = a.$EnumSwitchMapping$0[modalActionSheetListItem2.g.ordinal()];
                    if (i10 == 1) {
                        size = Cell$Left.Main.Size.Small;
                    } else if (i10 == 2) {
                        size = Cell$Left.Main.Size.Medium;
                    } else {
                        if (i10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        size = Cell$Left.Main.Size.Large;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1902255797, i7, i6, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.toIconTint (ClipsMenu.kt:109)");
                    }
                    int i11 = a.$EnumSwitchMapping$1[appearance.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3 && i11 != 4) {
                                throw alb0.c(1588250075, M);
                            }
                            M.K(1991539654);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, i7, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j = ylu0Var.getIcon().l;
                            M.j();
                        } else {
                            M.K(1991384871);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, i7, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j = ylu0Var2.getIcon().h;
                            M.j();
                        }
                        c = 41192;
                    } else {
                        M.K(1991166476);
                        M.K(1991272961);
                        if (androidx.compose.runtime.b.d()) {
                            c = 41192;
                            androidx.compose.runtime.b.f(1040687336, i7, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        } else {
                            c = 41192;
                        }
                        ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var3.getIcon().a;
                        M.j();
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j3 = j;
                    androidx.compose.runtime.a aVar3 = M;
                    str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    modalActionSheetListItem = modalActionSheetListItem2;
                    yu20Var = yu20Var2;
                    com.vk.core.compose.component.cell.content.x a4 = com.vk.core.compose.component.cell.content.f.a(a3, size, j3, null, null, aVar3, 196616, 24);
                    M = aVar3;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    xVar = a4;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-661676209, i7, i6, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.toCellMiddle (ClipsMenu.kt:60)");
                }
                us2.b b = xga0.b(-215671813, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(681347732, i7, i6, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.toTitleColor (ClipsMenu.kt:127)");
                }
                int i12 = a.$EnumSwitchMapping$1[appearance.ordinal()];
                if (i12 == 1) {
                    str3 = str2;
                    i4 = 1040687336;
                    c2 = 3;
                    M.K(1940146655);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i7, i6, str3);
                    }
                    ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var4.getText().m;
                    M.j();
                } else if (i12 != 2) {
                    c2 = 3;
                    if (i12 == 3) {
                        str3 = str2;
                        i4 = 1040687336;
                        M.K(1940152065);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i7, i6, str3);
                        }
                        ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var5.getText().p;
                        M.j();
                    } else {
                        if (i12 != 4) {
                            throw alb0.c(1940144283, M);
                        }
                        M.K(1940154976);
                        str3 = str2;
                        if (androidx.compose.runtime.b.d()) {
                            i4 = 1040687336;
                            androidx.compose.runtime.b.f(1040687336, i7, i6, str3);
                        } else {
                            i4 = 1040687336;
                        }
                        ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var6.getText().s;
                        M.j();
                    }
                } else {
                    str3 = str2;
                    i4 = 1040687336;
                    c2 = 3;
                    M.K(1940149344);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i7, i6, str3);
                    }
                    ylu0 ylu0Var7 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var7.getText().k;
                    M.j();
                }
                long j4 = j2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int m2 = b.m(new hik0(j4, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                ModalActionSheetListItem modalActionSheetListItem3 = modalActionSheetListItem;
                try {
                    String str4 = modalActionSheetListItem3.c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    b.g(str4);
                    s3q0 s3q0Var = s3q0.a;
                    b.k(m2);
                    us2 n = b.n();
                    M.j();
                    int i13 = i4;
                    String str5 = str3;
                    int i14 = i6;
                    androidx.compose.runtime.a aVar4 = M;
                    it = it2;
                    i2 = i14;
                    com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.d.b.b(n, null, null, null, 0, 0, null, null, null, aVar4, 0, 6, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                    String str6 = modalActionSheetListItem3.e;
                    if (str6 == null) {
                        aVar4.K(1904327157);
                        aVar4.j();
                        h1Var3 = null;
                        i3 = 0;
                    } else {
                        aVar4.K(1904327158);
                        aVar4.K(-215662456);
                        bVar = new us2.b();
                        if (androidx.compose.runtime.b.d()) {
                            i5 = 0;
                            androidx.compose.runtime.b.f(i13, 0, i2, str5);
                        } else {
                            i5 = 0;
                        }
                        ylu0 ylu0Var8 = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        m = bVar.m(new hik0(ylu0Var8.getText().p, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            bVar.g(str6);
                            bVar.k(m);
                            us2 n2 = bVar.n();
                            aVar4.j();
                            i3 = i5;
                            com.vk.core.compose.component.cell.content.h1 a5 = Cell$Middle.c.b.a(n2, null, 0, 0, null, null, null, null, aVar4, 805306368, 510);
                            aVar4.j();
                            h1Var3 = a5;
                        } finally {
                        }
                    }
                    com.vk.core.compose.component.cell.content.k0 a6 = Cell$Middle.a.a(b2, h1Var3, null, null, aVar4, 196608, 28);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yu20 yu20Var3 = yu20Var;
                    boolean J = aVar4.J(izsVar) | aVar4.y(yu20Var3);
                    Object x = aVar4.x();
                    if (J || x == a.C0011a.a) {
                        x = new com.vk.movika.sdk.base.ui.r(3, izsVar, (ModalActionSheetListItem) yu20Var3);
                        aVar4.R(x);
                    }
                    wiu0.b(null, false, xVar, a6, null, (gzs) x, null, aVar4, 0, 83);
                    M = aVar4;
                    M.j();
                } catch (Throwable th) {
                    b.k(m2);
                    throw th;
                }
            } else {
                it = it2;
                i2 = i6;
                i3 = i7;
                if (!(yu20Var2 instanceof xu20)) {
                    throw alb0.c(416359399, M);
                }
                M.K(22567711);
                xu20 xu20Var2 = (xu20) yu20Var2;
                M.K(-2021895789);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2021895789, i3, i2, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.toCellMiddle (ClipsMenu.kt:82)");
                }
                String str7 = xu20Var2.a;
                String str8 = xu20Var2.b;
                if (str7 == null && str8 == null) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    k0Var = null;
                } else {
                    if (str7 == null) {
                        M.K(-1675899879);
                        M.j();
                        xu20Var = xu20Var2;
                        str = str8;
                        h1Var = null;
                    } else {
                        M.K(-1675899878);
                        M.K(-1716627158);
                        bVar = new us2.b();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i3, i2, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var9 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        m = bVar.m(new hik0(ylu0Var9.getText().r, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            bVar.g(str7);
                            s3q0 s3q0Var2 = s3q0.a;
                            bVar.k(m);
                            us2 n3 = bVar.n();
                            M.j();
                            androidx.compose.runtime.a aVar5 = M;
                            xu20Var = xu20Var2;
                            str = str8;
                            com.vk.core.compose.component.cell.content.h1 b3 = Cell$Middle.d.b.b(n3, null, null, null, 0, 0, null, null, null, aVar5, 0, 6, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                            M = aVar5;
                            M.j();
                            h1Var = b3;
                        } finally {
                        }
                    }
                    if (str == null) {
                        M.K(-1675589662);
                        M.j();
                        h1Var2 = null;
                    } else {
                        M.K(-1675589661);
                        M.K(-1716617014);
                        bVar = new us2.b();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i3, i2, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var10 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        m = bVar.m(new hik0(ylu0Var10.getText().r, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            bVar.g(str);
                            s3q0 s3q0Var3 = s3q0.a;
                            bVar.k(m);
                            us2 n4 = bVar.n();
                            M.j();
                            com.vk.core.compose.component.cell.content.h1 a7 = Cell$Middle.c.b.a(n4, null, xu20Var.c, 0, null, null, null, null, M, 805306368, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
                            M.j();
                            h1Var2 = a7;
                        } finally {
                        }
                    }
                    com.vk.core.compose.component.cell.content.k0 a8 = Cell$Middle.a.a(h1Var, h1Var2, null, null, M, 196608, 28);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    k0Var = a8;
                }
                androidx.compose.runtime.a aVar6 = M;
                wiu0.b(null, false, null, k0Var, null, null, null, aVar6, 0, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                M = aVar6;
                M.j();
            }
            i6 = i2;
            i7 = i3;
            it2 = it;
        }
    }
}
