package xsna;

import android.text.TextUtils;
import android.util.Size;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.coremedia.iso.boxes.MetaBox;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.counter.VkCounter;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.k1u0;
import xsna.ngv0;
import xsna.noa;
import xsna.phw;
import xsna.q630;
import xsna.rco0;
import xsna.tgv0;
import xsna.tlo0;
import xsna.ty6;
import xsna.zr5;

/* compiled from: RichCellScreenContent.kt */
/* loaded from: classes18.dex */
public final class sjg0 implements yah0 {
    public final wh50 A;
    public final Object b = pn00.k(new Pair("none", null), new Pair("text", new sgv0(30, oq.d(tlo0.Companion, "Subtitle"))));
    public final Object c = pn00.k(new Pair("none", null), new Pair("text", new ugv0(new tlo0.h("Subtitle"), (ngv0.a) null, (ngv0.a) null, 0, (fy0) null, 62)), new Pair("before icon", new ugv0(new tlo0.h("Subtitle"), new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14), (ngv0.a) null, 0, (fy0) null, 60)), new Pair("after icon", new ugv0(new tlo0.h("Subtitle"), (ngv0.a) null, new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14), 0, (fy0) null, 58)), new Pair("two icon", new ugv0(new tlo0.h("Subtitle"), new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14), new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14), 0, (fy0) null, 56)));
    public final Object d = pn00.k(new Pair("none", null), new Pair("text", new qgv0(new tlo0.h("Subtitle"), (ngv0.a) null, (ngv0.a) null, 0, 30)), new Pair("before icon", new qgv0(new tlo0.h("Extra Subtitle"), new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14), (ngv0.a) null, 0, 28)), new Pair("after icon", new qgv0(new tlo0.h("Extra Subtitle"), (ngv0.a) null, new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14), 0, 26)), new Pair("two icon", new qgv0(new tlo0.h("Extra Subtitle"), new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14), new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14), 0, 24)));
    public final Object e;
    public final Object f;
    public final ListBuilder g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final zrp l;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;
    public final wh50 u;
    public final wh50 v;
    public final wh50 w;
    public final wh50 x;
    public final wh50 y;
    public final wh50 z;

    /* compiled from: RichCellScreenContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkCell.Left.Main.Size.values().length];
            try {
                iArr[VkCell.Left.Main.Size.ExtraSmall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkCell.Left.Main.Size.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkCell.Left.Main.Size.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkCell.Left.Main.Size.Large.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: RichCellScreenContent.kt */
    public static final class b implements VkCell.f {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sjg0() {
        Pair pair = new Pair("none", null);
        Pair pair2 = new Pair("text", new vgv0(new tlo0.h("Title"), (ngv0.a) null, (ngv0) null, 0, 30));
        Pair pair3 = new Pair("before icon", new vgv0(new tlo0.h("Title"), new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14), (ngv0) null, 0, 28));
        Pair pair4 = new Pair("after icon", new vgv0(new tlo0.h("Title"), (ngv0.a) null, new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14), 0, 26));
        tlo0.h hVar = new tlo0.h("Very looooooooooooooooooooooong title");
        ngv0.a aVar = new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14);
        ngv0.a aVar2 = new ngv0.a(new gko(R.drawable.vk_icon_fire_12), null, null, null, 14);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        this.e = pn00.k(pair, pair2, pair3, pair4, new Pair("two icon", new vgv0(hVar, aVar2, aVar, 0, 8)));
        this.f = pn00.k(new Pair("none", null), new Pair("button", new ogv0(new tlo0.h("Button"), new ob0(27), null, null, VkButton.Mode.Primary, VkButton.Appearance.Accent, false, false, 828)));
        ListBuilder e = e43.e();
        for (int i = 0; i < 3; i++) {
            e.add("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg");
        }
        ListBuilder g = e.g();
        this.g = g;
        Pair pair5 = new Pair("none", null);
        ArrayList arrayList = new ArrayList(c5g.u(new wow(g), 10));
        Iterator<E> it = g.iterator();
        while (it.hasNext()) {
            itj0.d((String) it.next(), arrayList);
        }
        Pair pair6 = new Pair("avatars user stack", new tgv0.a(arrayList, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
        ListBuilder listBuilder = this.g;
        ArrayList arrayList2 = new ArrayList(c5g.u(new wow(listBuilder), 10));
        Iterator<E> it2 = listBuilder.iterator();
        while (it2.hasNext()) {
            itj0.d((String) it2.next(), arrayList2);
        }
        this.h = pn00.k(pair5, pair6, new Pair("counter user stack", new tgv0.a(arrayList2, 9, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)));
        this.i = pn00.k(new Pair("none", null), new Pair(MetaBox.TYPE, new rgv0(oq.d(tlo0.Companion, "Meta"), new tlo0.h("Submeta"))));
        Pair pair7 = new Pair("none", null);
        Pair pair8 = new Pair("icon", VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(new gko(R.drawable.vk_icon_add_circle_outline_24), VkCell.Left.Main.Size.Small, new k1u0.a(new x7g(R.attr.vk_ui_accent_red)), 8)));
        Pair pair9 = new Pair("custom", new VkCell.Left.b(new VkCell.Left.Main.e(new b(), new Size(iah0.a(128), iah0.a(64))), null));
        noa.r rVar = new noa.r(R.drawable.ds_demo_image_2);
        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
        this.j = pn00.k(pair7, pair8, pair9, new Pair("avatar", new VkCell.Left.b(new VkCell.Left.Main.a(rVar, size), null)), new Pair("picture", new VkCell.Left.b(new VkCell.Left.Main.d(new noa.r(R.drawable.ds_demo_image_1), size), null)), new Pair("extra close", new VkCell.Left.b(new VkCell.Left.Main.a(new noa.r(R.drawable.ds_demo_image_2), size.j()), new VkCell.Left.c.b(null, null, 7))), new Pair("extra check", new VkCell.Left.b(new VkCell.Left.Main.a(new noa.r(R.drawable.ds_demo_image_2), size.j()), new VkCell.Left.c.a(6, (gzs) null, true))), new Pair("extra icon", new VkCell.Left.b(new VkCell.Left.Main.a(new noa.r(R.drawable.ds_demo_image_2), size.j()), new VkCell.Left.c.d(new gko(R.drawable.vk_icon_add_outline_28)))));
        Pair pair10 = new Pair("none", null);
        VkCell.Right.c cVar = VkCell.Right.Companion;
        Pair pair11 = new Pair("icon", VkCell.Right.c.a(cVar, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_add_outline_28), (k1u0) null, (Size) null, (tlo0) null, false, (gzs) null, 62), null, null, 29));
        tlo0.h hVar2 = new tlo0.h("Button");
        VkButton.Mode mode = VkButton.Mode.Primary;
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        Pair pair12 = new Pair("button", VkCell.Right.c.a(cVar, new VkCell.Right.a.b(hVar2, new vg0(28), appearance, mode, null, null, null, null, 2032), null, null, null, 30));
        tlo0.h hVar3 = new tlo0.h("Detail");
        this.k = pn00.k(pair10, pair11, pair12, new Pair("detail", VkCell.Right.c.a(cVar, new VkCell.Right.a.e(hVar3, hVar3), null, null, null, 30)), new Pair("counter", VkCell.Right.c.a(cVar, new VkCell.Right.a.d(123, VkCounter.CounterAppearance.Appearance.Accent, 4), null, null, null, 30)), new Pair("badge", VkCell.Right.c.a(cVar, new VkCell.Right.a.C0822a(VkBadge.Appearance.Design.Accent), null, null, null, 30)), new Pair("switch", VkCell.Right.c.a(cVar, new VkCell.Right.a.f(6, (gzs) null, true), null, null, null, 30)), new Pair("dropdown", VkCell.Right.c.a(cVar, null, null, new VkCell.Right.ExtraAction.c(new tlo0.h("Dropdown"), new cu1(28)), null, 27)), new Pair("check", VkCell.Right.c.a(cVar, null, null, new VkCell.Right.ExtraAction.a(6, null, true), null, 27)), new Pair("more", VkCell.Right.c.a(cVar, null, null, new VkCell.Right.ExtraAction.d((gzs) null, (tlo0.f) (null == true ? 1 : 0), 7), null, 27)), new Pair("picture", VkCell.Right.c.a(cVar, null, null, new VkCell.Right.ExtraAction.e(new noa.r(R.drawable.ds_demo_image_1), Integer.valueOf(iah0.a(40))), null, 27)), new Pair("all", VkCell.Right.c.a(cVar, new VkCell.Right.a.b(new tlo0.h("Button"), new sqf0(1), appearance, mode, null, null, null, null, 2032), new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_add_outline_28), (k1u0) null, (Size) null, (tlo0) null, false, (gzs) null, 62), new VkCell.Right.ExtraAction.d((gzs) null, (tlo0.f) (null == true ? 1 : 0), 7), null, 24)));
        this.l = VkCell.Left.Main.Size.i();
        RichCell$Middle.Size.h();
        this.m = androidx.compose.runtime.k.b("text");
        this.n = androidx.compose.runtime.k.b("none");
        Boolean bool = Boolean.FALSE;
        this.o = androidx.compose.runtime.k.b(bool);
        this.p = androidx.compose.runtime.k.b("none");
        this.q = androidx.compose.runtime.k.b("none");
        this.r = androidx.compose.runtime.k.b("none");
        this.s = androidx.compose.runtime.k.b("none");
        this.t = androidx.compose.runtime.k.b("none");
        this.u = androidx.compose.runtime.k.b("none");
        this.v = androidx.compose.runtime.k.b("none");
        this.w = androidx.compose.runtime.k.b("none");
        this.x = androidx.compose.runtime.k.b("none");
        this.y = androidx.compose.runtime.k.b(size);
        this.z = androidx.compose.runtime.k.b(RichCell$Middle.Size.Medium);
        this.A = androidx.compose.runtime.k.b(bool);
    }

    public static com.vk.core.compose.component.cell.content.v f(String str, androidx.compose.runtime.a aVar, int i) {
        com.vk.core.compose.component.cell.content.v vVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-303801930, i, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createMiddleButton (RichCellScreenContent.kt:502)");
        }
        if (epx.f(str, "button")) {
            aVar.K(-1067055218);
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new ia90(5);
                aVar.R(x);
            }
            vVar = RichCell$Middle.a.C0734a.a(buttonStyle, buttonAppearance, null, "Button", null, (gzs) x, aVar, 3078, 221184, 16372);
            aVar.j();
        } else {
            aVar.K(-1066882425);
            aVar.j();
            vVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return vVar;
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1313403721);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1313403721, i2, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.Content (RichCellScreenContent.kt:254)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 f = txj0.f(hr80.m(aVar2, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a), 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jjn0.a("Rich Cell", gzsVar3, x5Var, gzsVar2, null, null, M, ((i2 << 3) & 112) | 6 | (i2 & 896) | ((i2 << 6) & 7168), 48);
            djn0.a(true, true, M, 438, 0);
            int i4 = (i2 >> 15) & 14;
            d(i4, M);
            c(i4, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new azq(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:104:0x0788. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x033a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0458. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x071e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        Cell$Left.Main.Size size;
        q630 q630Var;
        int i3;
        int i4;
        int i5;
        int i6;
        Cell$Left a2;
        Cell$Left cell$Left;
        com.vk.core.compose.component.cell.content.f1 f1Var;
        Object obj;
        Object obj2;
        a.C0011a.C0012a c0012a;
        int i7;
        Object obj3;
        com.vk.core.compose.component.cell.content.f1 a3;
        com.vk.core.compose.component.cell.content.f1 f1Var2;
        Object obj4;
        com.vk.core.compose.component.cell.content.f1 a4;
        int i8;
        Object obj5;
        int i9;
        com.vk.core.compose.component.cell.content.f1 a5;
        com.vk.core.compose.component.cell.content.f1 f1Var3;
        com.vk.core.compose.component.cell.content.f1 a6;
        com.vk.core.compose.component.cell.content.f1 f1Var4;
        com.vk.core.compose.component.cell.content.f1 a7;
        int i10;
        a.C0011a.C0012a c0012a2;
        com.vk.core.compose.component.cell.content.p0 p0Var;
        com.vk.core.compose.component.cell.content.p0 a8;
        String str;
        com.vk.core.compose.component.cell.content.d1 d1Var;
        String str2;
        com.vk.core.compose.component.cell.content.y0 y0Var;
        com.vk.core.compose.component.cell.content.y0 a9;
        int i11;
        sjg0 sjg0Var = this;
        androidx.compose.runtime.a M = aVar.M(803258886);
        if ((i & 6) == 0) {
            i2 = i | (M.J(sjg0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(803258886, i2, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.ComposeRichCell (RichCellScreenContent.kt:324)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            String str3 = (String) ((zak0) sjg0Var.r).getValue();
            int i12 = a.$EnumSwitchMapping$0[((VkCell.Left.Main.Size) ((zak0) sjg0Var.y).getValue()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                size = Cell$Left.Main.Size.Small;
            } else if (i12 == 3) {
                size = Cell$Left.Main.Size.Medium;
            } else {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                size = Cell$Left.Main.Size.Large;
            }
            int i13 = (i2 << 6) & 896;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1181558634, i13, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createLeft (RichCellScreenContent.kt:405)");
            }
            int hashCode = str3.hashCode();
            int i14 = i2;
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            zr5.a aVar2 = zr5.a.a;
            switch (hashCode) {
                case -1405959847:
                    q630Var = f;
                    i3 = i13;
                    i4 = -1;
                    i5 = 0;
                    i6 = 1;
                    if (str3.equals("avatar")) {
                        M.K(1606485816);
                        a2 = com.vk.core.compose.component.cell.content.e.a(rco0.a.a(aVar2, "AV", M, Tensorflow.FRAME_WIDTH), size, null, null, null, null, null, M, 100663296, 252);
                        M = M;
                        M.j();
                        cell$Left = a2;
                        break;
                    }
                    M.K(-1737060557);
                    M.j();
                    cell$Left = null;
                    break;
                case -1349088399:
                    q630Var = f;
                    i3 = i13;
                    i4 = -1;
                    i5 = 0;
                    i6 = 1;
                    if (str3.equals("custom")) {
                        M.K(-1738219213);
                        M.j();
                        cell$Left = null;
                        break;
                    }
                    M.K(-1737060557);
                    M.j();
                    cell$Left = null;
                case -577741570:
                    q630Var = f;
                    Cell$Left.Main.Size size2 = size;
                    i3 = i13;
                    i4 = -1;
                    i5 = 0;
                    i6 = 1;
                    if (str3.equals("picture")) {
                        M.K(1606497969);
                        a2 = com.vk.core.compose.component.cell.content.g.a(phw.a.a(pg90.a(R.drawable.ds_demo_image_1, 0, M), null, null, null, null, M, 196616, 30), size2, null, null, null, M, 12582912, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        M.j();
                        cell$Left = a2;
                        break;
                    }
                    M.K(-1737060557);
                    M.j();
                    cell$Left = null;
                    break;
                case -110411528:
                    q630Var = f;
                    i3 = i13;
                    i4 = -1;
                    i5 = 0;
                    i6 = 1;
                    Cell$Left.Main.Size size3 = size;
                    if (str3.equals("extra check")) {
                        M.K(1606513085);
                        com.vk.core.compose.component.cell.content.t a10 = com.vk.core.compose.component.cell.content.e.a(rco0.a.a(aVar2, "AV", M, Tensorflow.FRAME_WIDTH), size3, null, null, null, null, null, M, 100663296, 252);
                        com.vk.core.compose.component.cell.content.b0 a11 = com.vk.core.compose.component.cell.content.b.a(true, null, false, null, M, 24582, 14);
                        M = M;
                        a2 = Cell$Left.a.a(a10, a11, M, 0);
                        M.j();
                        cell$Left = a2;
                        break;
                    }
                    M.K(-1737060557);
                    M.j();
                    cell$Left = null;
                    break;
                case -110282264:
                    q630Var = f;
                    i3 = i13;
                    i4 = -1;
                    i5 = 0;
                    i6 = 1;
                    if (str3.equals("extra close")) {
                        M.K(1606503537);
                        com.vk.core.compose.component.cell.content.t a12 = com.vk.core.compose.component.cell.content.e.a(rco0.a.a(aVar2, "AV", M, Tensorflow.FRAME_WIDTH), size, null, null, null, null, null, M, 100663296, 252);
                        M = M;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-811261652, 3072, -1, "com.vk.core.compose.component.cell.content.Cell.Left.Extra.Chevron.Companion.invoke (Cell.kt:319)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1530749101, 6, -1, "com.vk.core.compose.component.cell.content.remember (LeftExtraChevronImpl.kt:47)");
                        }
                        Object x = M.x();
                        if (x == c0012a3) {
                            x = new com.vk.core.compose.component.cell.content.g0(0);
                            M.R(x);
                        }
                        com.vk.core.compose.component.cell.content.g0 g0Var = (com.vk.core.compose.component.cell.content.g0) x;
                        ((zak0) g0Var.a).setValue(null);
                        ((zak0) g0Var.b).setValue(null);
                        ((zak0) g0Var.c).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a2 = Cell$Left.a.a(a12, g0Var, M, 0);
                        M.j();
                        cell$Left = a2;
                        break;
                    }
                    M.K(-1737060557);
                    M.j();
                    cell$Left = null;
                    break;
                case 3226745:
                    q630Var = f;
                    Cell$Left.Main.Size size4 = size;
                    i3 = i13;
                    i4 = -1;
                    i5 = 0;
                    i6 = 1;
                    if (str3.equals("icon")) {
                        M.K(1606491564);
                        a2 = com.vk.core.compose.component.cell.content.f.a(pg90.a(R.drawable.vk_icon_add_outline_28, 0, M), size4, 0L, null, null, M, 196616, 28);
                        M = M;
                        M.j();
                        cell$Left = a2;
                        break;
                    }
                    M.K(-1737060557);
                    M.j();
                    cell$Left = null;
                    break;
                case 689349257:
                    if (str3.equals("extra icon")) {
                        M.K(1606523023);
                        q630Var = f;
                        i3 = i13;
                        i4 = -1;
                        i5 = 0;
                        i6 = 1;
                        com.vk.core.compose.component.cell.content.t a13 = com.vk.core.compose.component.cell.content.e.a(rco0.a.a(aVar2, "AV", M, Tensorflow.FRAME_WIDTH), size, null, null, null, null, null, M, 100663296, 252);
                        com.vk.core.compose.component.cell.content.x a14 = com.vk.core.compose.component.cell.content.d.a(pg90.a(R.drawable.vk_icon_add_outline_28, 0, M), 0L, null, M, 62);
                        M = M;
                        a2 = Cell$Left.a.a(a13, a14, M, 0);
                        M.j();
                        cell$Left = a2;
                        break;
                    }
                default:
                    q630Var = f;
                    i3 = i13;
                    i4 = -1;
                    i5 = 0;
                    i6 = 1;
                    M.K(-1737060557);
                    M.j();
                    cell$Left = null;
                    break;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String str4 = (String) ((zak0) this.n).getValue();
            int i15 = i14 << 3;
            int i16 = i15 & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1605778023, i16, i4, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createOvertitle (RichCellScreenContent.kt:348)");
            }
            if (epx.f(str4, "text")) {
                M.K(-1259416690);
                com.vk.core.compose.component.cell.content.f1 a15 = RichCell$Middle.e.a.a("Subtitle", M, 3078);
                M.j();
                f1Var = a15;
            } else {
                M.K(-387170588);
                M.j();
                f1Var = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String str5 = (String) ((zak0) this.m).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1629131239, i16, i4, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createTitle (RichCellScreenContent.kt:355)");
            }
            switch (str5.hashCode()) {
                case -1153383302:
                    obj = "text";
                    obj2 = "icon";
                    c0012a = c0012a3;
                    i7 = R.drawable.vk_icon_fire_12;
                    obj3 = "two icon";
                    if (str5.equals("before icon")) {
                        M.K(2067948148);
                        androidx.compose.runtime.a aVar3 = M;
                        a3 = RichCell$Middle.h.b.a("Title", com.vk.core.compose.component.cell.content.o0.a(pg90.a(i7, i5, M), 0L, M, 14), null, null, aVar3, 196614, 26);
                        M = aVar3;
                        M.j();
                        f1Var2 = a3;
                        break;
                    }
                    M.K(-317470780);
                    M.j();
                    f1Var2 = null;
                    break;
                case 3556653:
                    obj2 = "icon";
                    c0012a = c0012a3;
                    i7 = R.drawable.vk_icon_fire_12;
                    obj3 = "two icon";
                    if (!str5.equals("text")) {
                        obj = "text";
                        M.K(-317470780);
                        M.j();
                        f1Var2 = null;
                        break;
                    } else {
                        M.K(2067946119);
                        androidx.compose.runtime.a aVar4 = M;
                        obj = "text";
                        a3 = RichCell$Middle.h.b.a("Title", null, null, null, aVar4, 196614, 30);
                        M = aVar4;
                        M.j();
                        f1Var2 = a3;
                        break;
                    }
                case 1483894845:
                    obj4 = "text";
                    obj2 = "icon";
                    c0012a = c0012a3;
                    i7 = R.drawable.vk_icon_fire_12;
                    obj3 = "two icon";
                    if (!str5.equals("after icon")) {
                        obj = obj4;
                        M.K(-317470780);
                        M.j();
                        f1Var2 = null;
                        break;
                    } else {
                        M.K(2067953523);
                        androidx.compose.runtime.a aVar5 = M;
                        a4 = RichCell$Middle.h.b.a("Title", null, com.vk.core.compose.component.cell.content.o0.a(pg90.a(i7, i5, M), 0L, M, 14), null, aVar5, 196614, 22);
                        M = aVar5;
                        M.j();
                        f1Var2 = a4;
                        obj = obj4;
                        break;
                    }
                case 1751906765:
                    if (str5.equals("two icon")) {
                        M.K(-317780996);
                        obj2 = "icon";
                        c0012a = c0012a3;
                        com.vk.core.compose.component.cell.content.x a16 = com.vk.core.compose.component.cell.content.o0.a(pg90.a(R.drawable.vk_icon_fire_12, i5, M), 0L, M, 14);
                        com.vk.core.compose.component.cell.content.x a17 = com.vk.core.compose.component.cell.content.o0.a(pg90.a(R.drawable.vk_icon_fire_12, i5, M), 0L, M, 14);
                        androidx.compose.runtime.a aVar6 = M;
                        obj3 = "two icon";
                        obj4 = "text";
                        i7 = R.drawable.vk_icon_fire_12;
                        a4 = RichCell$Middle.h.b.a("Title", a17, a16, null, aVar6, 196614, 18);
                        M = aVar6;
                        M.j();
                        f1Var2 = a4;
                        obj = obj4;
                        break;
                    }
                default:
                    obj = "text";
                    obj2 = "icon";
                    c0012a = c0012a3;
                    i7 = R.drawable.vk_icon_fire_12;
                    obj3 = "two icon";
                    M.K(-317470780);
                    M.j();
                    f1Var2 = null;
                    break;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String str6 = (String) ((zak0) this.p).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-686683159, i16, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createSubtitle (RichCellScreenContent.kt:369)");
            }
            switch (str6.hashCode()) {
                case -1153383302:
                    i8 = i15;
                    obj5 = obj;
                    i9 = i16;
                    if (str6.equals("before icon")) {
                        M.K(1522454061);
                        a5 = RichCell$Middle.g.b.a("Subtitle", false, com.vk.core.compose.component.cell.content.n0.a(pg90.a(i7, i5, M), M), null, null, M, 196614, 26);
                        M.j();
                        f1Var3 = a5;
                        break;
                    }
                    M.K(-47885836);
                    M.j();
                    f1Var3 = null;
                    break;
                case 3556653:
                    i8 = i15;
                    Object obj6 = obj;
                    i9 = i16;
                    if (!str6.equals(obj6)) {
                        obj5 = obj6;
                        M.K(-47885836);
                        M.j();
                        f1Var3 = null;
                        break;
                    } else {
                        M.K(1522451837);
                        obj5 = obj6;
                        a5 = RichCell$Middle.g.b.a("Subtitle", false, null, null, null, M, 196614, 30);
                        M.j();
                        f1Var3 = a5;
                        break;
                    }
                case 1483894845:
                    i8 = i15;
                    i9 = i16;
                    if (!str6.equals("after icon")) {
                        obj5 = obj;
                        M.K(-47885836);
                        M.j();
                        f1Var3 = null;
                        break;
                    } else {
                        M.K(1522459724);
                        a6 = RichCell$Middle.g.b.a("Subtitle", false, null, com.vk.core.compose.component.cell.content.n0.a(pg90.a(i7, i5, M), M), null, M, 196614, 22);
                        M.j();
                        f1Var3 = a6;
                        obj5 = obj;
                        break;
                    }
                case 1751906765:
                    if (str6.equals(obj3)) {
                        M.K(-48210467);
                        i8 = i15;
                        i9 = i16;
                        a6 = RichCell$Middle.g.b.a("Subtitle", false, com.vk.core.compose.component.cell.content.n0.a(pg90.a(i7, i5, M), M), com.vk.core.compose.component.cell.content.n0.a(pg90.a(i7, i5, M), M), null, M, 196614, 18);
                        M.j();
                        f1Var3 = a6;
                        obj5 = obj;
                        break;
                    }
                default:
                    i8 = i15;
                    obj5 = obj;
                    i9 = i16;
                    M.K(-47885836);
                    M.j();
                    f1Var3 = null;
                    break;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String str7 = (String) ((zak0) this.q).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-456665063, i9, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createExtraSubtitle (RichCellScreenContent.kt:383)");
            }
            switch (str7.hashCode()) {
                case -1153383302:
                    if (str7.equals("before icon")) {
                        M.K(-768454459);
                        androidx.compose.runtime.a aVar7 = M;
                        a7 = RichCell$Middle.c.b.a("Extra Subtitle", com.vk.core.compose.component.cell.content.l0.a(pg90.a(i7, i5, M), M), null, null, aVar7, 199686, 18);
                        M = aVar7;
                        M.j();
                        f1Var4 = a7;
                        break;
                    }
                    M.K(1948619012);
                    M.j();
                    f1Var4 = null;
                    break;
                case 3556653:
                    if (str7.equals(obj5)) {
                        M.K(-768457128);
                        androidx.compose.runtime.a aVar8 = M;
                        a7 = RichCell$Middle.c.b.a("Extra Subtitle", null, null, null, aVar8, 196614, 30);
                        M = aVar8;
                        M.j();
                        f1Var4 = a7;
                        break;
                    }
                    M.K(1948619012);
                    M.j();
                    f1Var4 = null;
                    break;
                case 1483894845:
                    if (str7.equals("after icon")) {
                        M.K(-768445467);
                        androidx.compose.runtime.a aVar9 = M;
                        a7 = RichCell$Middle.c.b.a("Extra Subtitle", null, com.vk.core.compose.component.cell.content.l0.a(pg90.a(i7, i5, M), M), null, aVar9, 196998, 18);
                        M = aVar9;
                        M.j();
                        f1Var4 = a7;
                        break;
                    }
                    M.K(1948619012);
                    M.j();
                    f1Var4 = null;
                    break;
                case 1751906765:
                    if (str7.equals(obj3)) {
                        M.K(-768436438);
                        androidx.compose.runtime.a aVar10 = M;
                        a7 = RichCell$Middle.c.b.a("Extra Subtitle", com.vk.core.compose.component.cell.content.l0.a(pg90.a(i7, i5, M), M), com.vk.core.compose.component.cell.content.l0.a(pg90.a(i7, i5, M), M), null, aVar10, 196614, 18);
                        M = aVar10;
                        M.j();
                        f1Var4 = a7;
                        break;
                    }
                    M.K(1948619012);
                    M.j();
                    f1Var4 = null;
                    break;
                default:
                    M.K(1948619012);
                    M.j();
                    f1Var4 = null;
                    break;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String str8 = (String) ((zak0) this.w).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1627237679, i9, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createMiddleSlot (RichCellScreenContent.kt:509)");
            }
            if (epx.f(str8, "avatars user stack")) {
                M.K(407318373);
                int i17 = (((i9 ^ 48) <= 32 || !M.J(this)) && (i8 & 48) != 32) ? i5 : i6;
                Object x2 = M.x();
                c0012a2 = c0012a;
                if (i17 != 0 || x2 == c0012a2) {
                    x2 = new zb60(this, 18);
                    M.R(x2);
                }
                androidx.compose.runtime.a aVar11 = M;
                i10 = i9;
                a8 = com.vk.core.compose.component.cell.content.m0.a((izs) x2, null, null, null, null, null, aVar11, 1572864, 62);
                M = aVar11;
                M.j();
            } else {
                i10 = i9;
                c0012a2 = c0012a;
                if (epx.f(str8, "counter user stack")) {
                    M.K(407325071);
                    int i18 = (((i10 ^ 48) <= 32 || !M.J(this)) && (i8 & 48) != 32) ? i5 : i6;
                    Object x3 = M.x();
                    if (i18 != 0 || x3 == c0012a2) {
                        x3 = new qjg0(this, 0);
                        M.R(x3);
                    }
                    androidx.compose.runtime.a aVar12 = M;
                    a8 = com.vk.core.compose.component.cell.content.m0.a((izs) x3, null, null, null, null, null, aVar12, 1572864, 62);
                    M = aVar12;
                    M.j();
                } else {
                    M.K(-257619218);
                    M.j();
                    p0Var = null;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    str = (String) ((zak0) this.x).getValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(532656952, i10, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createMiddleMeta (RichCellScreenContent.kt:526)");
                    }
                    if (epx.f(str, MetaBox.TYPE)) {
                        M.K(-1520722011);
                        M.j();
                        d1Var = null;
                    } else {
                        M.K(782226528);
                        com.vk.core.compose.component.cell.content.d1 a18 = RichCell$Middle.d.a.a("Meta", null, M, 3126, 4);
                        M.j();
                        d1Var = a18;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int i19 = i3;
                    a.C0011a.C0012a c0012a4 = c0012a2;
                    int i20 = i10;
                    com.vk.core.compose.component.cell.content.f1 f1Var5 = f1Var4;
                    sjg0Var = this;
                    Object obj7 = obj2;
                    androidx.compose.runtime.a aVar13 = M;
                    com.vk.core.compose.component.cell.content.b1 a19 = RichCell$Middle.b.a(f1Var, f1Var2, f1Var3, f1Var5, p0Var, f((String) ((zak0) this.t).getValue(), M, i19), f((String) ((zak0) this.u).getValue(), M, i19), f((String) ((zak0) this.v).getValue(), M, i19), d1Var, aVar13, 0, 1024);
                    M = aVar13;
                    str2 = (String) ((zak0) sjg0Var.s).getValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2120790887, i20, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createRight (RichCellScreenContent.kt:445)");
                    }
                    switch (str2.hashCode()) {
                        case -1377687758:
                            y0Var = null;
                            if (str2.equals("button")) {
                                M.K(2029434383);
                                ButtonStyle buttonStyle = ButtonStyle.Primary;
                                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                                Object x4 = M.x();
                                if (x4 == c0012a4) {
                                    x4 = new zqf0(1);
                                    M.R(x4);
                                }
                                com.vk.core.compose.component.cell.content.v a20 = com.vk.core.compose.component.cell.content.k.a(buttonStyle, buttonAppearance, null, "Button", null, null, null, false, null, null, (gzs) x4, M, 3126, 1769472, 32756);
                                M = M;
                                a9 = o.c.a(a20, null, null, null, null, M, 62);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            M.K(-1510072028);
                            M.j();
                            break;
                        case -1335224239:
                            if (str2.equals("detail")) {
                                M.K(2029444041);
                                a9 = o.c.a(com.vk.core.compose.component.cell.content.m.a("Detail", null, M, 390, 2), null, null, null, null, M, 62);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                        case -889473228:
                            if (str2.equals("switch")) {
                                M.K(2029456175);
                                com.vk.core.compose.component.cell.content.t0 a21 = com.vk.core.compose.component.cell.content.n.a(true, null, false, null, M, 24582, 14);
                                M = M;
                                a9 = o.c.a(a21, null, null, null, null, M, 62);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                        case -577741570:
                            if (str2.equals("picture")) {
                                M.K(2029471558);
                                a9 = o.c.a(null, null, com.vk.core.compose.component.cell.content.s.a(phw.a.a(pg90.a(R.drawable.ds_demo_image_1, 0, M), null, null, null, null, M, 196616, 30), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 59);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                        case -432061423:
                            if (str2.equals("dropdown")) {
                                M.K(2029459963);
                                Object x5 = M.x();
                                if (x5 == c0012a4) {
                                    x5 = new iz3(27);
                                    M.R(x5);
                                }
                                a9 = o.c.a(null, null, com.vk.core.compose.component.cell.content.q.a("Dropdown", (gzs) x5, M, 24630), null, null, M, 59);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                        case 96673:
                            if (str2.equals("all")) {
                                M.K(2029477434);
                                ButtonStyle buttonStyle2 = ButtonStyle.Primary;
                                ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
                                Object x6 = M.x();
                                if (x6 == c0012a4) {
                                    x6 = new mg(28);
                                    M.R(x6);
                                }
                                com.vk.core.compose.component.cell.content.v a22 = com.vk.core.compose.component.cell.content.k.a(buttonStyle2, buttonAppearance2, null, "Button", null, null, null, false, null, null, (gzs) x6, M, 3126, 1769472, 32756);
                                com.vk.core.compose.component.cell.content.x a23 = com.vk.core.compose.component.cell.content.p.a(pg90.a(R.drawable.vk_icon_add_outline_28, 0, M), 0L, 0L, null, null, null, M, 1572872, 62);
                                com.vk.core.compose.component.cell.content.x a24 = com.vk.core.compose.component.cell.content.p.a(pg90.a(R.drawable.vk_icon_add_outline_28, 0, M), 0L, 0L, null, null, null, M, 1572872, 62);
                                M = M;
                                if (androidx.compose.runtime.b.d()) {
                                    i11 = -1;
                                    androidx.compose.runtime.b.f(-550657501, 384, -1, "com.vk.core.compose.component.cell.content.Cell.Right.Extra.Pair.Companion.invoke (Cell.kt:655)");
                                } else {
                                    i11 = -1;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1436872684, 6, i11, "com.vk.core.compose.component.cell.content.remember (RightExtraPairImpl.kt:36)");
                                }
                                Object x7 = M.x();
                                if (x7 == c0012a4) {
                                    x7 = new com.vk.core.compose.component.cell.content.x0(a23, a24);
                                    M.R(x7);
                                }
                                com.vk.core.compose.component.cell.content.x0 x0Var = (com.vk.core.compose.component.cell.content.x0) x7;
                                ((zak0) x0Var.a).setValue(a23);
                                ((zak0) x0Var.b).setValue(a24);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                a9 = o.c.a(a22, x0Var, com.vk.core.compose.component.cell.content.r.a(null, null, 0L, null, M, 24576, 15), null, null, M, 56);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                        case 3226745:
                            if (str2.equals(obj7)) {
                                M.K(2029426790);
                                lg90 a25 = pg90.a(R.drawable.vk_icon_add_outline_28, 0, M);
                                Object x8 = M.x();
                                if (x8 == c0012a4) {
                                    x8 = new rjg0(0);
                                    M.R(x8);
                                }
                                com.vk.core.compose.component.cell.content.x a26 = com.vk.core.compose.component.cell.content.p.a(a25, 0L, 0L, null, (gzs) x8, null, M, 1597448, 46);
                                M = M;
                                a9 = o.c.a(null, a26, null, null, null, M, 61);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                        case 3357525:
                            if (str2.equals("more")) {
                                M.K(2029467945);
                                a9 = o.c.a(null, null, com.vk.core.compose.component.cell.content.r.a(null, null, 0L, null, M, 24576, 15), null, null, M, 59);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                        case 93494179:
                            if (str2.equals("badge")) {
                                M.K(2029452029);
                                a9 = o.c.a(com.vk.core.compose.component.cell.content.j.a(BadgeAppearance.Design.Accent, M), null, null, null, null, M, 62);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                        case 94627080:
                            if (str2.equals("check")) {
                                M.K(2029464024);
                                com.vk.core.compose.component.cell.content.b0 a27 = o.e.a.C0736a.a(true, null, false, null, M, 24582, 14);
                                M = M;
                                a9 = o.c.a(null, null, a27, null, null, M, 59);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                        case 957830652:
                            if (str2.equals("counter")) {
                                M.K(2029447622);
                                a9 = o.c.a(com.vk.core.compose.component.cell.content.l.a(123, CounterAppearance.Design.Accent, M, 24630), null, null, null, null, M, 62);
                                M.j();
                                y0Var = a9;
                                break;
                            }
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                        default:
                            y0Var = null;
                            M.K(-1510072028);
                            M.j();
                            break;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    ygv0.a(q630Var, cell$Left, a19, y0Var, null, M, 6, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            p0Var = a8;
            if (androidx.compose.runtime.b.d()) {
            }
            str = (String) ((zak0) this.x).getValue();
            if (androidx.compose.runtime.b.d()) {
            }
            if (epx.f(str, MetaBox.TYPE)) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            int i192 = i3;
            a.C0011a.C0012a c0012a42 = c0012a2;
            int i202 = i10;
            com.vk.core.compose.component.cell.content.f1 f1Var52 = f1Var4;
            sjg0Var = this;
            Object obj72 = obj2;
            androidx.compose.runtime.a aVar132 = M;
            com.vk.core.compose.component.cell.content.b1 a192 = RichCell$Middle.b.a(f1Var, f1Var2, f1Var3, f1Var52, p0Var, f((String) ((zak0) this.t).getValue(), M, i192), f((String) ((zak0) this.u).getValue(), M, i192), f((String) ((zak0) this.v).getValue(), M, i192), d1Var, aVar132, 0, 1024);
            M = aVar132;
            str2 = (String) ((zak0) sjg0Var.s).getValue();
            if (androidx.compose.runtime.b.d()) {
            }
            switch (str2.hashCode()) {
                case -1377687758:
                    break;
                case -1335224239:
                    break;
                case -889473228:
                    break;
                case -577741570:
                    break;
                case -432061423:
                    break;
                case 96673:
                    break;
                case 3226745:
                    break;
                case 3357525:
                    break;
                case 93494179:
                    break;
                case 94627080:
                    break;
                case 957830652:
                    break;
            }
            if (androidx.compose.runtime.b.d()) {
            }
            ygv0.a(q630Var, cell$Left, a192, y0Var, null, M, 6, 48);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b6d0(sjg0Var, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0184, code lost:
    
        if (r4 == r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a1  */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v63, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v75, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        a.C0011a.C0012a c0012a;
        a.C0011a.C0012a c0012a2;
        ty6.b bVar;
        boolean z;
        Object x;
        LayoutNode.a aVar2;
        q630 q630Var;
        sjg0 sjg0Var = this;
        androidx.compose.runtime.a M = aVar.M(-1026895160);
        if ((i & 6) == 0) {
            i2 = i | (M.J(sjg0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1026895160, i2, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.Controls (RichCellScreenContent.kt:534)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            q630.a aVar4 = q630.a.a;
            q630 H = s200.H(p490.D(hr80.m(aVar4, j, aVar3), p490.x(M), 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 f = txj0.f(aVar4, 1.0f);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean booleanValue = ((Boolean) ((zak0) sjg0Var.A).getValue()).booleanValue();
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (z2 || x2 == c0012a3) {
                x2 = new rf20(sjg0Var, 23);
                M.R(x2);
            }
            eku0.d("Compose", (gzs) x2, null, booleanValue, null, false, false, M, 6, 116);
            boolean g = sjg0Var.g();
            boolean z3 = i3 == 4;
            Object x3 = M.x();
            if (z3) {
                c0012a = c0012a3;
            } else {
                c0012a = c0012a3;
            }
            x3 = new mlf0(sjg0Var, 1);
            M.R(x3);
            a.C0011a.C0012a c0012a4 = c0012a;
            eku0.d("Multiline", (gzs) x3, null, g, null, false, false, M, 6, 116);
            M = M;
            q630 f2 = txj0.f(aVar4, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            ty6.b bVar3 = dt1.a.k;
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(gVar, bVar3, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, f2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar2, M, c2678a);
            k9q0.w(M, c3, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar4, true);
            String str = (String) ((zak0) sjg0Var.m).getValue();
            boolean z4 = i3 == 4;
            Object x4 = M.x();
            if (z4) {
                c0012a2 = c0012a4;
            } else {
                c0012a2 = c0012a4;
                if (x4 != c0012a2) {
                    bVar = bVar3;
                    a.C0011a.C0012a c0012a5 = c0012a2;
                    ty6.b bVar4 = bVar;
                    y9i0.a("Title", sjg0Var.e, str, (izs) x4, b2, M, 6, 0);
                    q630 b3 = tpg0Var.b(1.0f, aVar4, true);
                    String str2 = (String) ((zak0) sjg0Var.p).getValue();
                    z = i3 != 4;
                    x = M.x();
                    if (!z || x == c0012a5) {
                        x = new b140(sjg0Var, 17);
                        M.R(x);
                    }
                    y9i0.a("Subtitle", sjg0Var.c, str2, (izs) x, b3, M, 6, 0);
                    M.G();
                    androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar4, M, 0);
                    int hashCode4 = Long.hashCode(n34.n(M));
                    sy90 D4 = M.D();
                    q630 c4 = qri.c(M, aVar4);
                    if (M.N() != null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a5, cVar);
                    k9q0.w(M, D4, eVar);
                    ur.d(hashCode4, M, bVar2, M, c2678a);
                    k9q0.w(M, c4, dVar);
                    q630 b4 = tpg0Var.b(1.0f, aVar4, true);
                    String str3 = (String) ((zak0) sjg0Var.q).getValue();
                    boolean z5 = i3 == 4;
                    Object x5 = M.x();
                    if (z5 || x5 == c0012a5) {
                        x5 = new fa00(sjg0Var, 20);
                        M.R(x5);
                    }
                    y9i0.a("Extr.Subtl.", sjg0Var.d, str3, (izs) x5, b4, M, 6, 0);
                    q630 b5 = tpg0Var.b(1.0f, aVar4, true);
                    String str4 = (String) ((zak0) sjg0Var.n).getValue();
                    boolean z6 = i3 == 4;
                    Object x6 = M.x();
                    if (z6 || x6 == c0012a5) {
                        x6 = new b810(sjg0Var, 24);
                        M.R(x6);
                    }
                    y9i0.a("Subhead", sjg0Var.b, str4, (izs) x6, b5, M, 6, 0);
                    M.G();
                    q630 f3 = txj0.f(aVar4, 1.0f);
                    androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(gVar, bVar4, M, 6);
                    int hashCode5 = Long.hashCode(n34.n(M));
                    sy90 D5 = M.D();
                    q630 c5 = qri.c(M, f3);
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a6, cVar);
                    k9q0.w(M, D5, eVar);
                    ur.d(hashCode5, M, bVar2, M, c2678a);
                    k9q0.w(M, c5, dVar);
                    q630 b6 = tpg0Var.b(1.0f, aVar4, true);
                    String str5 = (String) ((zak0) sjg0Var.w).getValue();
                    boolean z7 = i3 == 4;
                    Object x7 = M.x();
                    if (z7 || x7 == c0012a5) {
                        x7 = new h440(sjg0Var, 15);
                        M.R(x7);
                    }
                    y9i0.a("Slot", sjg0Var.h, str5, (izs) x7, b6, M, 6, 0);
                    q630 b7 = tpg0Var.b(1.0f, aVar4, true);
                    String str6 = (String) ((zak0) sjg0Var.x).getValue();
                    boolean z8 = i3 == 4;
                    Object x8 = M.x();
                    if (z8 || x8 == c0012a5) {
                        x8 = new ux40(sjg0Var, 23);
                        M.R(x8);
                    }
                    y9i0.a("Meta", sjg0Var.i, str6, (izs) x8, b7, M, 6, 0);
                    M.G();
                    q630 f4 = txj0.f(aVar4, 1.0f);
                    androidx.compose.foundation.layout.k a7 = androidx.compose.foundation.layout.j.a(gVar, bVar4, M, 6);
                    int hashCode6 = Long.hashCode(n34.n(M));
                    sy90 D6 = M.D();
                    q630 c6 = qri.c(M, f4);
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        aVar2 = aVar5;
                        M.I(aVar2);
                    } else {
                        aVar2 = aVar5;
                        M.f();
                    }
                    k9q0.w(M, a7, cVar);
                    k9q0.w(M, D6, eVar);
                    ur.d(hashCode6, M, bVar2, M, c2678a);
                    k9q0.w(M, c6, dVar);
                    LayoutNode.a aVar6 = aVar2;
                    q630 b8 = tpg0Var.b(1.0f, aVar4, true);
                    String str7 = (String) ((zak0) sjg0Var.r).getValue();
                    boolean z9 = i3 == 4;
                    Object x9 = M.x();
                    if (z9 || x9 == c0012a5) {
                        x9 = new xka0(sjg0Var, 6);
                        M.R(x9);
                    }
                    y9i0.a("Left", sjg0Var.j, str7, (izs) x9, b8, M, 6, 0);
                    q630 b9 = tpg0Var.b(1.0f, aVar4, true);
                    String str8 = (String) ((zak0) sjg0Var.s).getValue();
                    boolean z10 = i3 == 4;
                    Object x10 = M.x();
                    if (z10 || x10 == c0012a5) {
                        x10 = new whg0(sjg0Var, 1);
                        M.R(x10);
                    }
                    y9i0.a("Right", sjg0Var.k, str8, (izs) x10, b9, M, 6, 0);
                    M.G();
                    q630 f5 = txj0.f(aVar4, 1.0f);
                    androidx.compose.foundation.layout.k a8 = androidx.compose.foundation.layout.j.a(gVar, bVar4, M, 6);
                    int hashCode7 = Long.hashCode(n34.n(M));
                    sy90 D7 = M.D();
                    q630 c7 = qri.c(M, f5);
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar6);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a8, cVar);
                    k9q0.w(M, D7, eVar);
                    ur.d(hashCode7, M, bVar2, M, c2678a);
                    k9q0.w(M, c7, dVar);
                    q630 b10 = tpg0Var.b(0.5f, aVar4, true);
                    VkCell.Left.Main.Size size = (VkCell.Left.Main.Size) ((zak0) sjg0Var.y).getValue();
                    boolean z11 = i3 == 4;
                    Object x11 = M.x();
                    if (z11 || x11 == c0012a5) {
                        q630Var = b10;
                        x11 = new v4w(sjg0Var, 26);
                        M.R(x11);
                    } else {
                        q630Var = b10;
                    }
                    y9i0.b("Left size", sjg0Var.l, size, (izs) x11, q630Var, M, 6, 0);
                    M.K(28711332);
                    M.j();
                    M.G();
                    q630 f6 = txj0.f(aVar4, 1.0f);
                    androidx.compose.foundation.layout.k a9 = androidx.compose.foundation.layout.j.a(gVar, bVar4, M, 6);
                    int hashCode8 = Long.hashCode(n34.n(M));
                    sy90 D8 = M.D();
                    q630 c8 = qri.c(M, f6);
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar6);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a9, cVar);
                    k9q0.w(M, D8, eVar);
                    ur.d(hashCode8, M, bVar2, M, c2678a);
                    k9q0.w(M, c8, dVar);
                    q630 b11 = tpg0Var.b(1.0f, aVar4, true);
                    sjg0Var = this;
                    String str9 = (String) ((zak0) sjg0Var.t).getValue();
                    boolean z12 = i3 == 4;
                    Object x12 = M.x();
                    if (z12 || x12 == c0012a5) {
                        x12 = new eiz(sjg0Var, 28);
                        M.R(x12);
                    }
                    izs izsVar = (izs) x12;
                    ?? r4 = sjg0Var.f;
                    y9i0.a("Button", r4, str9, izsVar, b11, M, 6, 0);
                    q630 b12 = tpg0Var.b(1.0f, aVar4, true);
                    String str10 = (String) ((zak0) sjg0Var.u).getValue();
                    boolean z13 = i3 == 4;
                    Object x13 = M.x();
                    if (z13 || x13 == c0012a5) {
                        x13 = new hs00(sjg0Var, 26);
                        M.R(x13);
                    }
                    y9i0.a("Button", r4, str10, (izs) x13, b12, M, 6, 0);
                    q630 b13 = tpg0Var.b(1.0f, aVar4, true);
                    String str11 = (String) ((zak0) sjg0Var.v).getValue();
                    boolean z14 = i3 == 4;
                    Object x14 = M.x();
                    if (z14 || x14 == c0012a5) {
                        x14 = new or50(sjg0Var, 19);
                        M.R(x14);
                    }
                    y9i0.a("Button", r4, str11, (izs) x14, b13, M, 6, 0);
                    M.G();
                    M.G();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            bVar = bVar3;
            x4 = new yhu(sjg0Var, 25);
            M.R(x4);
            a.C0011a.C0012a c0012a52 = c0012a2;
            ty6.b bVar42 = bVar;
            y9i0.a("Title", sjg0Var.e, str, (izs) x4, b2, M, 6, 0);
            q630 b32 = tpg0Var.b(1.0f, aVar4, true);
            String str22 = (String) ((zak0) sjg0Var.p).getValue();
            if (i3 != 4) {
            }
            x = M.x();
            if (!z) {
            }
            x = new b140(sjg0Var, 17);
            M.R(x);
            y9i0.a("Subtitle", sjg0Var.c, str22, (izs) x, b32, M, 6, 0);
            M.G();
            androidx.compose.foundation.layout.k a52 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar42, M, 0);
            int hashCode42 = Long.hashCode(n34.n(M));
            sy90 D42 = M.D();
            q630 c42 = qri.c(M, aVar4);
            if (M.N() != null) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new btz(sjg0Var, i, 1);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-304379983);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-304379983, i2, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.RichCellContent (RichCellScreenContent.kt:273)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40, 1, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(F, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (((Boolean) ((zak0) this.A).getValue()).booleanValue()) {
                M.K(1151690426);
                b(i2 & 14, M);
                M.j();
            } else {
                M.K(1151744893);
                e(i2 & 14, M);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ccr(this, i, 1);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1063595957);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1063595957, i2, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.ViewRichCell (RichCellScreenContent.kt:290)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new pey(24);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new qhg0(this, 1);
                M.R(x2);
            }
            ae2.a(54, 0, M, izsVar, (izs) x2, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g1b0(this, i, 1);
        }
    }

    public final boolean g() {
        return ((Boolean) ((zak0) this.o).getValue()).booleanValue();
    }
}
