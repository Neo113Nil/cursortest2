package xsna;

import android.content.Context;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.modal.Mode;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.Tensorflow;
import xsna.ayv0;
import xsna.c5v0;
import xsna.cri;
import xsna.dt1;
import xsna.oy20;
import xsna.phw;
import xsna.py20;
import xsna.q630;
import xsna.qy20;
import xsna.tlo0;
import xsna.ty6;

/* compiled from: ModalCardScreenContent.kt */
/* loaded from: classes18.dex */
public final class az20 implements yah0 {
    public final zrp b = d.h();
    public final zrp c = b.h();
    public final zrp d = c.h();
    public final zrp e = e.h();
    public final zrp f = a.h();
    public final String g = "https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg";
    public final String h = "https://pp.userapi.com/c639222/v639222699/5e1d8/2wtUaVn4Pho.jpg";
    public final wh50 i = androidx.compose.runtime.k.b(d.Icon);
    public final wh50 j = androidx.compose.runtime.k.b(c.TitleAndSubtitle);
    public final wh50 k = androidx.compose.runtime.k.b(e.None);
    public final wh50 l = androidx.compose.runtime.k.b(b.SingleButton);
    public final wh50 m = androidx.compose.runtime.k.b(a.Vertical);
    public final wh50 n = androidx.compose.runtime.k.b(Boolean.TRUE);
    public final wh50 o;
    public final wh50 p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModalCardScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Horizontal;
        public static final a Vertical;

        static {
            a aVar = new a("Vertical", 0);
            Vertical = aVar;
            a aVar2 = new a("Horizontal", 1);
            Horizontal = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModalCardScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b None;
        public static final b SingleButton;
        public static final b TwoButtons;

        static {
            b bVar = new b("None", 0);
            None = bVar;
            b bVar2 = new b("SingleButton", 1);
            SingleButton = bVar2;
            b bVar3 = new b("TwoButtons", 2);
            TwoButtons = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static zrp<b> h() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModalCardScreenContent.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c None;
        public static final c Subtitle;
        public static final c Title;
        public static final c TitleAndSubtitle;

        static {
            c cVar = new c("None", 0);
            None = cVar;
            c cVar2 = new c("Title", 1);
            Title = cVar2;
            c cVar3 = new c("Subtitle", 2);
            Subtitle = cVar3;
            c cVar4 = new c("TitleAndSubtitle", 3);
            TitleAndSubtitle = cVar4;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c() {
            throw null;
        }

        public static zrp<c> h() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModalCardScreenContent.kt */
    public static final class d {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d Avatar;
        public static final d Icon;
        public static final d Image;
        public static final d ImageWithoutPaddings;
        public static final d None;
        public static final d Picture;

        static {
            d dVar = new d("None", 0);
            None = dVar;
            d dVar2 = new d("Image", 1);
            Image = dVar2;
            d dVar3 = new d("ImageWithoutPaddings", 2);
            ImageWithoutPaddings = dVar3;
            d dVar4 = new d("Icon", 3);
            Icon = dVar4;
            d dVar5 = new d("Avatar", 4);
            Avatar = dVar5;
            d dVar6 = new d("Picture", 5);
            Picture = dVar6;
            d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
            $VALUES = dVarArr;
            $ENTRIES = new asp(dVarArr);
        }

        public d() {
            throw null;
        }

        public static zrp<d> h() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModalCardScreenContent.kt */
    public static final class e {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e Button;
        public static final e FormInput;
        public static final e None;
        public static final e UserStack;

        static {
            e eVar = new e("None", 0);
            None = eVar;
            e eVar2 = new e("UserStack", 1);
            UserStack = eVar2;
            e eVar3 = new e("FormInput", 2);
            FormInput = eVar3;
            e eVar4 = new e("Button", 3);
            Button = eVar4;
            e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
            $VALUES = eVarArr;
            $ENTRIES = new asp(eVarArr);
        }

        public e() {
            throw null;
        }

        public static zrp<e> h() {
            return $ENTRIES;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* compiled from: ModalCardScreenContent.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SingleButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.TwoButtons.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[c.Title.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[c.Subtitle.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[c.TitleAndSubtitle.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[e.values().length];
            try {
                iArr3[e.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[e.UserStack.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[e.FormInput.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[e.Button.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[d.values().length];
            try {
                iArr4[d.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[d.Icon.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[d.Picture.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[d.Image.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[d.ImageWithoutPaddings.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[d.Avatar.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public az20() {
        Boolean bool = Boolean.FALSE;
        this.o = androidx.compose.runtime.k.b(bool);
        this.p = androidx.compose.runtime.k.b(bool);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-482012751);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-482012751, i2, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.Content (ModalCardScreenContent.kt:88)");
            }
            q630 f2 = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
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
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Modal Card", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b2, null, gzsVar, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            aVar2 = M;
            djn0.a(true, true, aVar2, 438, 0);
            q630 a4 = q9g.a(txj0.f(s200.F(kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 1.0f), 1.0f);
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, aVar4, aVar2, 0);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D2 = aVar2.D();
            q630 c3 = qri.c(aVar2, a4);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar5);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a5, cVar);
            k9q0.w(aVar2, D2, eVar);
            ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c3, dVar);
            int i5 = (i4 >> 15) & 14;
            c(i5, aVar2);
            d(((i4 >> 12) & 112) | 6, aVar2);
            aVar2.G();
            aVar2.G();
            b(i5, aVar2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new szn(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        int i3;
        int i4;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(1917442870);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1917442870, i2, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.ComposeModals (ModalCardScreenContent.kt:159)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.o).getValue()).booleanValue();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (booleanValue) {
                M.K(-524395134);
                Mode mode = Mode.Card;
                boolean z = (i2 & 14) == 4;
                Object x = M.x();
                if (z || x == c0012a2) {
                    x = new ubw(this, 10);
                    M.R(x);
                }
                i3 = i2;
                c0012a = c0012a2;
                i4 = -531047796;
                a030.b(mode, (gzs) x, null, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(-406192209, new zy20(this, 0), M), M, 6, 100663296, 262140);
                M = M;
            } else {
                i3 = i2;
                i4 = -531047796;
                c0012a = c0012a2;
                M.K(-531047796);
            }
            M.j();
            if (((Boolean) ((zak0) this.p).getValue()).booleanValue()) {
                M.K(-523734834);
                Mode mode2 = Mode.Card;
                boolean z2 = (i3 & 14) == 4;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new t2l(this, 20);
                    M.R(x2);
                }
                androidx.compose.runtime.a aVar2 = M;
                a030.b(mode2, (gzs) x2, null, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(1243354342, new cs7(this, 2), M), aVar2, 6, 100663680, 258044);
                M = aVar2;
            } else {
                M.K(i4);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ds7(this, i, 3);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1053625712);
        if ((i & 6) == 0) {
            i2 = i | (M.J(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1053625712, i2, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.Controls (ModalCardScreenContent.kt:408)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.d, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            q630 f3 = txj0.f(aVar2, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            int i4 = i2;
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, f3);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar2, true);
            d dVar2 = (d) ((zak0) this.i).getValue();
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                i3 = i5;
                x = new cws(this, 22);
                M.R(x);
            } else {
                i3 = i5;
            }
            int i6 = i3;
            y9i0.b("Top", this.b, dVar2, (izs) x, b2, M, 6, 0);
            q630 b3 = tpg0Var.b(1.0f, aVar2, true);
            c cVar2 = (c) ((zak0) this.j).getValue();
            boolean z2 = i6 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new f410(this, 5);
                M.R(x2);
            }
            y9i0.b("Middle", this.d, cVar2, (izs) x2, b3, M, 6, 0);
            M.G();
            q630 f4 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, f4);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            q630 b4 = tpg0Var.b(1.0f, aVar2, true);
            b bVar3 = (b) ((zak0) this.l).getValue();
            boolean z3 = i6 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new zxo(this, 29);
                M.R(x3);
            }
            y9i0.b("Bottom", this.c, bVar3, (izs) x3, b4, M, 6, 0);
            q630 b5 = tpg0Var.b(1.0f, aVar2, true);
            e eVar2 = (e) ((zak0) this.k).getValue();
            boolean z4 = i6 == 4;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new d9j(this, 29);
                M.R(x4);
            }
            y9i0.b("Dynamic Content", this.e, eVar2, (izs) x4, b5, M, 6, 0);
            M.G();
            q630 f5 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(gVar, dt1.a.l, M, 54);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c5 = qri.c(M, f5);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 b6 = tpg0Var.b(1.0f, aVar2, true);
            a aVar4 = (a) ((zak0) this.m).getValue();
            boolean z5 = i6 == 4;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new ayo(this, 19);
                M.R(x5);
            }
            y9i0.b("Button Orientation", this.f, aVar4, (izs) x5, b6, M, 6, 0);
            q630 b7 = tpg0Var.b(1.0f, aVar2, true);
            boolean i7 = i();
            boolean z6 = i6 == 4;
            Object x6 = M.x();
            if (z6 || x6 == c0012a) {
                x6 = new ldl(this, 26);
                M.R(x6);
            }
            eku0.d("With Paddings", (gzs) x6, b7, i7, null, false, false, M, 6, 112);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new at3(this, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0304 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, androidx.compose.runtime.a aVar) {
        c5v0.c cVar;
        c5v0.c bVar;
        int i2;
        c5v0.b bVar2;
        int i3;
        View view;
        int i4;
        c5v0.a aVar2;
        boolean y;
        boolean y2;
        boolean z;
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(966869438);
        int i5 = i & 6;
        r9g r9gVar = r9g.a;
        int i6 = i5 == 0 ? (M.J(r9gVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= M.J(this) ? 32 : 16;
        }
        int i7 = i6;
        if (M.t(i7 & 1, (i7 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(966869438, i7, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.ModalButtons (ModalCardScreenContent.kt:115)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            wh50 wh50Var = this.i;
            int i8 = f.$EnumSwitchMapping$3[((d) ((zak0) wh50Var).getValue()).ordinal()];
            int i9 = 12;
            c5v0.a aVar3 = null;
            String str = this.g;
            String str2 = this.h;
            switch (i8) {
                case 1:
                    cVar = null;
                    i2 = f.$EnumSwitchMapping$1[((c) ((zak0) this.j).getValue()).ordinal()];
                    if (i2 == 1) {
                        bVar2 = null;
                    } else if (i2 == 2) {
                        bVar2 = new c5v0.b(14, oq.d(tlo0.Companion, "Lorem ipsum"), false ? 1 : 0);
                    } else if (i2 == 3) {
                        bVar2 = new c5v0.b(13, false ? 1 : 0, oq.d(tlo0.Companion, "Lorem ipsum dolor sit amet, consectetur adipiscing elit"));
                    } else {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar2 = new c5v0.b(i9, oq.d(tlo0.Companion, "Lorem ipsum"), new tlo0.h("Lorem ipsum dolor sit amet, consectetur adipiscing elit"));
                    }
                    i3 = f.$EnumSwitchMapping$2[((e) ((zak0) this.k).getValue()).ordinal()];
                    if (i3 == 1) {
                        view = null;
                    } else if (i3 == 2) {
                        VkUserStack vkUserStack = new VkUserStack(context, null, 6);
                        vkUserStack.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        vkUserStack.setAvatarsPosition(VkUserStack.AvatarsPosition.Top);
                        vkUserStack.setSize(VkUserStack.Size.Large);
                        vkUserStack.setCounter(9);
                        tlo0.Companion.getClass();
                        vkUserStack.setText(new tlo0.h("Анна, Маргарита, Елизавета и ещё 5 человек"));
                        ArrayList arrayList = new ArrayList(3);
                        for (int i10 = 0; i10 < 3; i10++) {
                            arrayList.add(new ayv0.c(str));
                        }
                        vkUserStack.setAvatars(arrayList);
                        view = vkUserStack;
                    } else if (i3 == 3) {
                        view = LayoutInflater.from(context).inflate(R.layout.ds_demo_form_input_layout, (ViewGroup) null);
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        VkButton vkButton = new VkButton(context, null, 6, 0);
                        vkButton.setMode(VkButton.Mode.Tertiary);
                        vkButton.setAppearance(VkButton.Appearance.Accent);
                        vkButton.setText("Подробнее");
                        view = vkButton;
                    }
                    i4 = f.$EnumSwitchMapping$0[((b) ((zak0) this.l).getValue()).ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            aVar2 = new c5v0.a(new c5v0.a.C2643a(oq.d(tlo0.Companion, "Button"), new i13(18), null, VkButton.Mode.Secondary, VkButton.Appearance.Accent, false, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE), (c5v0.a.C2643a) (false ? 1 : 0), 6);
                            b.a.C0790b c0790b = new b.a.C0790b(cVar, bVar2, view, aVar2, i(), true);
                            q630.a aVar4 = q630.a.a;
                            q630 f2 = txj0.f(aVar4, 1.0f);
                            dt1.a.getClass();
                            ty6.a aVar5 = dt1.a.o;
                            q630 b2 = r9gVar.b(f2, aVar5);
                            y = M.y(c0790b) | M.y(context);
                            Object x = M.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            Object obj = x;
                            if (!y || x == c0012a) {
                                zv zvVar = new zv(14, c0790b, context);
                                M.R(zvVar);
                                obj = zvVar;
                            }
                            mpj0.a(6, 0, M, "Show View Modal Card", (gzs) obj, b2);
                            q630 b3 = r9gVar.b(txj0.f(aVar4, 1.0f), aVar5);
                            y2 = M.y(c0790b) | M.y(context);
                            Object x2 = M.x();
                            Object obj2 = x2;
                            if (!y2 || x2 == c0012a) {
                                ge0 ge0Var = new ge0(11, c0790b, context);
                                M.R(ge0Var);
                                obj2 = ge0Var;
                            }
                            mpj0.a(6, 0, M, "Show View Modal Card without swipe", (gzs) obj2, b3);
                            q630 f3 = txj0.f(aVar4, 1.0f);
                            int i11 = i7 & 112;
                            z = i11 != 32;
                            Object x3 = M.x();
                            Object obj3 = x3;
                            if (!z || x3 == c0012a) {
                                s1x s1xVar = new s1x(this, 12);
                                M.R(s1xVar);
                                obj3 = s1xVar;
                            }
                            mpj0.a(54, 0, M, "Show Compose Modal Card", (gzs) obj3, f3);
                            q630 f4 = txj0.f(aVar4, 1.0f);
                            z2 = i11 != 32;
                            Object x4 = M.x();
                            Object obj4 = x4;
                            if (!z2 || x4 == c0012a) {
                                tzv tzvVar = new tzv(this, 10);
                                M.R(tzvVar);
                                obj4 = tzvVar;
                            }
                            mpj0.a(54, 0, M, "Show Compose Modal Card without swipe", (gzs) obj4, f4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                                break;
                            }
                        } else {
                            if (i4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar3 = new c5v0.a(new c5v0.a.C2643a(oq.d(tlo0.Companion, "Button"), new qo0(23), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), new c5v0.a.C2643a(new tlo0.h("Button"), new z34(20), null, VkButton.Mode.Secondary, null, false, 444), ((a) ((zak0) this.m).getValue()) == a.Vertical);
                        }
                    }
                    aVar2 = aVar3;
                    b.a.C0790b c0790b2 = new b.a.C0790b(cVar, bVar2, view, aVar2, i(), true);
                    q630.a aVar42 = q630.a.a;
                    q630 f22 = txj0.f(aVar42, 1.0f);
                    dt1.a.getClass();
                    ty6.a aVar52 = dt1.a.o;
                    q630 b22 = r9gVar.b(f22, aVar52);
                    y = M.y(c0790b2) | M.y(context);
                    Object x5 = M.x();
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    Object obj5 = x5;
                    if (!y) {
                    }
                    zv zvVar2 = new zv(14, c0790b2, context);
                    M.R(zvVar2);
                    obj5 = zvVar2;
                    mpj0.a(6, 0, M, "Show View Modal Card", (gzs) obj5, b22);
                    q630 b32 = r9gVar.b(txj0.f(aVar42, 1.0f), aVar52);
                    y2 = M.y(c0790b2) | M.y(context);
                    Object x22 = M.x();
                    Object obj22 = x22;
                    if (!y2) {
                    }
                    ge0 ge0Var2 = new ge0(11, c0790b2, context);
                    M.R(ge0Var2);
                    obj22 = ge0Var2;
                    mpj0.a(6, 0, M, "Show View Modal Card without swipe", (gzs) obj22, b32);
                    q630 f32 = txj0.f(aVar42, 1.0f);
                    int i112 = i7 & 112;
                    if (i112 != 32) {
                    }
                    Object x32 = M.x();
                    Object obj32 = x32;
                    if (!z) {
                    }
                    s1x s1xVar2 = new s1x(this, 12);
                    M.R(s1xVar2);
                    obj32 = s1xVar2;
                    mpj0.a(54, 0, M, "Show Compose Modal Card", (gzs) obj32, f32);
                    q630 f42 = txj0.f(aVar42, 1.0f);
                    if (i112 != 32) {
                    }
                    Object x42 = M.x();
                    Object obj42 = x42;
                    if (!z2) {
                    }
                    tzv tzvVar2 = new tzv(this, 10);
                    M.R(tzvVar2);
                    obj42 = tzvVar2;
                    mpj0.a(54, 0, M, "Show Compose Modal Card without swipe", (gzs) obj42, f42);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    break;
                case 2:
                    bVar = new c5v0.c.b(new gko(R.drawable.vk_icon_game_outline_56), null, null, 14);
                    cVar = bVar;
                    i2 = f.$EnumSwitchMapping$1[((c) ((zak0) this.j).getValue()).ordinal()];
                    if (i2 == 1) {
                    }
                    i3 = f.$EnumSwitchMapping$2[((e) ((zak0) this.k).getValue()).ordinal()];
                    if (i3 == 1) {
                    }
                    i4 = f.$EnumSwitchMapping$0[((b) ((zak0) this.l).getValue()).ordinal()];
                    if (i4 != 1) {
                    }
                    aVar2 = aVar3;
                    b.a.C0790b c0790b22 = new b.a.C0790b(cVar, bVar2, view, aVar2, i(), true);
                    q630.a aVar422 = q630.a.a;
                    q630 f222 = txj0.f(aVar422, 1.0f);
                    dt1.a.getClass();
                    ty6.a aVar522 = dt1.a.o;
                    q630 b222 = r9gVar.b(f222, aVar522);
                    y = M.y(c0790b22) | M.y(context);
                    Object x52 = M.x();
                    a.C0011a.C0012a c0012a22 = a.C0011a.a;
                    Object obj52 = x52;
                    if (!y) {
                    }
                    zv zvVar22 = new zv(14, c0790b22, context);
                    M.R(zvVar22);
                    obj52 = zvVar22;
                    mpj0.a(6, 0, M, "Show View Modal Card", (gzs) obj52, b222);
                    q630 b322 = r9gVar.b(txj0.f(aVar422, 1.0f), aVar522);
                    y2 = M.y(c0790b22) | M.y(context);
                    Object x222 = M.x();
                    Object obj222 = x222;
                    if (!y2) {
                    }
                    ge0 ge0Var22 = new ge0(11, c0790b22, context);
                    M.R(ge0Var22);
                    obj222 = ge0Var22;
                    mpj0.a(6, 0, M, "Show View Modal Card without swipe", (gzs) obj222, b322);
                    q630 f322 = txj0.f(aVar422, 1.0f);
                    int i1122 = i7 & 112;
                    if (i1122 != 32) {
                    }
                    Object x322 = M.x();
                    Object obj322 = x322;
                    if (!z) {
                    }
                    s1x s1xVar22 = new s1x(this, 12);
                    M.R(s1xVar22);
                    obj322 = s1xVar22;
                    mpj0.a(54, 0, M, "Show Compose Modal Card", (gzs) obj322, f322);
                    q630 f422 = txj0.f(aVar422, 1.0f);
                    if (i1122 != 32) {
                    }
                    Object x422 = M.x();
                    Object obj422 = x422;
                    if (!z2) {
                    }
                    tzv tzvVar22 = new tzv(this, 10);
                    M.R(tzvVar22);
                    obj422 = tzvVar22;
                    mpj0.a(54, 0, M, "Show Compose Modal Card without swipe", (gzs) obj422, f422);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    break;
                case 3:
                    bVar = new c5v0.c.d(new c.d(str2, null), 0, 6);
                    cVar = bVar;
                    i2 = f.$EnumSwitchMapping$1[((c) ((zak0) this.j).getValue()).ordinal()];
                    if (i2 == 1) {
                    }
                    i3 = f.$EnumSwitchMapping$2[((e) ((zak0) this.k).getValue()).ordinal()];
                    if (i3 == 1) {
                    }
                    i4 = f.$EnumSwitchMapping$0[((b) ((zak0) this.l).getValue()).ordinal()];
                    if (i4 != 1) {
                    }
                    aVar2 = aVar3;
                    b.a.C0790b c0790b222 = new b.a.C0790b(cVar, bVar2, view, aVar2, i(), true);
                    q630.a aVar4222 = q630.a.a;
                    q630 f2222 = txj0.f(aVar4222, 1.0f);
                    dt1.a.getClass();
                    ty6.a aVar5222 = dt1.a.o;
                    q630 b2222 = r9gVar.b(f2222, aVar5222);
                    y = M.y(c0790b222) | M.y(context);
                    Object x522 = M.x();
                    a.C0011a.C0012a c0012a222 = a.C0011a.a;
                    Object obj522 = x522;
                    if (!y) {
                    }
                    zv zvVar222 = new zv(14, c0790b222, context);
                    M.R(zvVar222);
                    obj522 = zvVar222;
                    mpj0.a(6, 0, M, "Show View Modal Card", (gzs) obj522, b2222);
                    q630 b3222 = r9gVar.b(txj0.f(aVar4222, 1.0f), aVar5222);
                    y2 = M.y(c0790b222) | M.y(context);
                    Object x2222 = M.x();
                    Object obj2222 = x2222;
                    if (!y2) {
                    }
                    ge0 ge0Var222 = new ge0(11, c0790b222, context);
                    M.R(ge0Var222);
                    obj2222 = ge0Var222;
                    mpj0.a(6, 0, M, "Show View Modal Card without swipe", (gzs) obj2222, b3222);
                    q630 f3222 = txj0.f(aVar4222, 1.0f);
                    int i11222 = i7 & 112;
                    if (i11222 != 32) {
                    }
                    Object x3222 = M.x();
                    Object obj3222 = x3222;
                    if (!z) {
                    }
                    s1x s1xVar222 = new s1x(this, 12);
                    M.R(s1xVar222);
                    obj3222 = s1xVar222;
                    mpj0.a(54, 0, M, "Show Compose Modal Card", (gzs) obj3222, f3222);
                    q630 f4222 = txj0.f(aVar4222, 1.0f);
                    if (i11222 != 32) {
                    }
                    Object x4222 = M.x();
                    Object obj4222 = x4222;
                    if (!z2) {
                    }
                    tzv tzvVar222 = new tzv(this, 10);
                    M.R(tzvVar222);
                    obj4222 = tzvVar222;
                    mpj0.a(54, 0, M, "Show Compose Modal Card without swipe", (gzs) obj4222, f4222);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    break;
                case 4:
                case 5:
                    cVar = new c5v0.c.C2644c(new vlw(str2, null), new Size(-1, iah0.a(160)), ((d) ((zak0) wh50Var).getValue()) == d.Image, 12);
                    i2 = f.$EnumSwitchMapping$1[((c) ((zak0) this.j).getValue()).ordinal()];
                    if (i2 == 1) {
                    }
                    i3 = f.$EnumSwitchMapping$2[((e) ((zak0) this.k).getValue()).ordinal()];
                    if (i3 == 1) {
                    }
                    i4 = f.$EnumSwitchMapping$0[((b) ((zak0) this.l).getValue()).ordinal()];
                    if (i4 != 1) {
                    }
                    aVar2 = aVar3;
                    b.a.C0790b c0790b2222 = new b.a.C0790b(cVar, bVar2, view, aVar2, i(), true);
                    q630.a aVar42222 = q630.a.a;
                    q630 f22222 = txj0.f(aVar42222, 1.0f);
                    dt1.a.getClass();
                    ty6.a aVar52222 = dt1.a.o;
                    q630 b22222 = r9gVar.b(f22222, aVar52222);
                    y = M.y(c0790b2222) | M.y(context);
                    Object x5222 = M.x();
                    a.C0011a.C0012a c0012a2222 = a.C0011a.a;
                    Object obj5222 = x5222;
                    if (!y) {
                    }
                    zv zvVar2222 = new zv(14, c0790b2222, context);
                    M.R(zvVar2222);
                    obj5222 = zvVar2222;
                    mpj0.a(6, 0, M, "Show View Modal Card", (gzs) obj5222, b22222);
                    q630 b32222 = r9gVar.b(txj0.f(aVar42222, 1.0f), aVar52222);
                    y2 = M.y(c0790b2222) | M.y(context);
                    Object x22222 = M.x();
                    Object obj22222 = x22222;
                    if (!y2) {
                    }
                    ge0 ge0Var2222 = new ge0(11, c0790b2222, context);
                    M.R(ge0Var2222);
                    obj22222 = ge0Var2222;
                    mpj0.a(6, 0, M, "Show View Modal Card without swipe", (gzs) obj22222, b32222);
                    q630 f32222 = txj0.f(aVar42222, 1.0f);
                    int i112222 = i7 & 112;
                    if (i112222 != 32) {
                    }
                    Object x32222 = M.x();
                    Object obj32222 = x32222;
                    if (!z) {
                    }
                    s1x s1xVar2222 = new s1x(this, 12);
                    M.R(s1xVar2222);
                    obj32222 = s1xVar2222;
                    mpj0.a(54, 0, M, "Show Compose Modal Card", (gzs) obj32222, f32222);
                    q630 f42222 = txj0.f(aVar42222, 1.0f);
                    if (i112222 != 32) {
                    }
                    Object x42222 = M.x();
                    Object obj42222 = x42222;
                    if (!z2) {
                    }
                    tzv tzvVar2222 = new tzv(this, 10);
                    M.R(tzvVar2222);
                    obj42222 = tzvVar2222;
                    mpj0.a(54, 0, M, "Show Compose Modal Card without swipe", (gzs) obj42222, f42222);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    break;
                case 6:
                    bVar = new c5v0.c.a(new c.d(str, null));
                    cVar = bVar;
                    i2 = f.$EnumSwitchMapping$1[((c) ((zak0) this.j).getValue()).ordinal()];
                    if (i2 == 1) {
                    }
                    i3 = f.$EnumSwitchMapping$2[((e) ((zak0) this.k).getValue()).ordinal()];
                    if (i3 == 1) {
                    }
                    i4 = f.$EnumSwitchMapping$0[((b) ((zak0) this.l).getValue()).ordinal()];
                    if (i4 != 1) {
                    }
                    aVar2 = aVar3;
                    b.a.C0790b c0790b22222 = new b.a.C0790b(cVar, bVar2, view, aVar2, i(), true);
                    q630.a aVar422222 = q630.a.a;
                    q630 f222222 = txj0.f(aVar422222, 1.0f);
                    dt1.a.getClass();
                    ty6.a aVar522222 = dt1.a.o;
                    q630 b222222 = r9gVar.b(f222222, aVar522222);
                    y = M.y(c0790b22222) | M.y(context);
                    Object x52222 = M.x();
                    a.C0011a.C0012a c0012a22222 = a.C0011a.a;
                    Object obj52222 = x52222;
                    if (!y) {
                    }
                    zv zvVar22222 = new zv(14, c0790b22222, context);
                    M.R(zvVar22222);
                    obj52222 = zvVar22222;
                    mpj0.a(6, 0, M, "Show View Modal Card", (gzs) obj52222, b222222);
                    q630 b322222 = r9gVar.b(txj0.f(aVar422222, 1.0f), aVar522222);
                    y2 = M.y(c0790b22222) | M.y(context);
                    Object x222222 = M.x();
                    Object obj222222 = x222222;
                    if (!y2) {
                    }
                    ge0 ge0Var22222 = new ge0(11, c0790b22222, context);
                    M.R(ge0Var22222);
                    obj222222 = ge0Var22222;
                    mpj0.a(6, 0, M, "Show View Modal Card without swipe", (gzs) obj222222, b322222);
                    q630 f322222 = txj0.f(aVar422222, 1.0f);
                    int i1122222 = i7 & 112;
                    if (i1122222 != 32) {
                    }
                    Object x322222 = M.x();
                    Object obj322222 = x322222;
                    if (!z) {
                    }
                    s1x s1xVar22222 = new s1x(this, 12);
                    M.R(s1xVar22222);
                    obj322222 = s1xVar22222;
                    mpj0.a(54, 0, M, "Show Compose Modal Card", (gzs) obj322222, f322222);
                    q630 f422222 = txj0.f(aVar422222, 1.0f);
                    if (i1122222 != 32) {
                    }
                    Object x422222 = M.x();
                    Object obj422222 = x422222;
                    if (!z2) {
                    }
                    tzv tzvVar22222 = new tzv(this, 10);
                    M.R(tzvVar22222);
                    obj422222 = tzvVar22222;
                    mpj0.a(54, 0, M, "Show Compose Modal Card without swipe", (gzs) obj422222, f422222);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hev(this, i, 1);
        }
    }

    public final jai e(androidx.compose.runtime.a aVar) {
        jai jaiVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(427255021, 0, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.getComposeBottomContent (ModalCardScreenContent.kt:314)");
        }
        int i = f.$EnumSwitchMapping$2[((e) ((zak0) this.k).getValue()).ordinal()];
        if (i == 1) {
            aVar.K(-1928597712);
            aVar.j();
            jaiVar = null;
        } else if (i == 2) {
            aVar.K(-1724779150);
            jai c2 = kai.c(65288713, new s77(this, 6), aVar);
            aVar.j();
            jaiVar = c2;
        } else if (i == 3) {
            aVar.K(-1725184595);
            aVar.j();
            jaiVar = qhi.a;
        } else {
            if (i != 4) {
                throw alb0.c(-1724781468, aVar);
            }
            aVar.K(-1725184595);
            aVar.j();
            jaiVar = qhi.b;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return jaiVar;
    }

    public final ty20 f(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(686237264, 0, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.getComposeButtons (ModalCardScreenContent.kt:229)");
        }
        int i = f.$EnumSwitchMapping$0[((b) ((zak0) this.l).getValue()).ordinal()];
        ty20 ty20Var = null;
        if (i != 1) {
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i == 2) {
                aVar.K(-1950947577);
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                Object x = aVar.x();
                if (x == c0012a) {
                    x = new de4(23);
                    aVar.R(x);
                }
                ty20Var = oy20.b.a(oy20.a.C3478a.a("Button", (gzs) x, null, buttonStyle, buttonAppearance, null, aVar, 27702, 8164), null, false, aVar, 6);
                aVar.j();
            } else {
                if (i != 3) {
                    throw alb0.c(-1950950462, aVar);
                }
                aVar.K(-1950937944);
                Object x2 = aVar.x();
                if (x2 == c0012a) {
                    x2 = new ee4(23);
                    aVar.R(x2);
                }
                sy20 a2 = oy20.a.C3478a.a("Button", (gzs) x2, null, null, null, null, aVar, 54, 8188);
                ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
                Object x3 = aVar.x();
                if (x3 == c0012a) {
                    x3 = new l63(22);
                    aVar.R(x3);
                }
                ty20Var = oy20.b.a(a2, oy20.a.C3478a.a("Button", (gzs) x3, null, buttonStyle2, null, null, aVar, 3126, 8180), ((a) ((zak0) this.m).getValue()) == a.Vertical, aVar, 0);
                aVar.j();
            }
        } else {
            aVar.K(-349893843);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return ty20Var;
    }

    public final xy20 g(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-961361545, 0, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.getComposeMainContent (ModalCardScreenContent.kt:271)");
        }
        int i = f.$EnumSwitchMapping$1[((c) ((zak0) this.j).getValue()).ordinal()];
        xy20 xy20Var = null;
        if (i == 1) {
            aVar.K(-1079750106);
            aVar.j();
        } else if (i == 2) {
            aVar.K(-450471096);
            xy20Var = py20.a.a(390, 2, aVar, "Lorem ipsum", null);
            aVar.j();
        } else if (i == 3) {
            aVar.K(-450467974);
            xy20Var = py20.a.a(Tensorflow.FRAME_WIDTH, 1, aVar, null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit");
            aVar.j();
        } else {
            if (i != 4) {
                throw alb0.c(-450473886, aVar);
            }
            aVar.K(-450463011);
            xy20Var = py20.a.a(438, 0, aVar, "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit");
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return xy20Var;
    }

    public final qy20 h(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1320322099, 0, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.getComposeTopContent (ModalCardScreenContent.kt:380)");
        }
        qy20 qy20Var = null;
        switch (f.$EnumSwitchMapping$3[((d) ((zak0) this.i).getValue()).ordinal()]) {
            case 1:
                aVar.K(-405054224);
                aVar.j();
                break;
            case 2:
                aVar.K(-1814179988);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1897876670, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-GameOutline56> (VkSdkIcons.kt:960)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_game_outline_56, 0, aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                qy20Var = qy20.c.a.a(a2, 0L, null, aVar, 6);
                aVar.j();
                break;
            case 3:
                aVar.K(-1814171395);
                phw a3 = phw.a.a(fwu0.l(this.h, null, null, null, aVar, 0, 62), null, null, null, null, aVar, 196616, 30);
                float f2 = 56;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1422118792, 3120, -1, "com.vk.core.compose.component.modal.card.ModalCard.Top.Picture.Companion.invoke (ModalCard.kt:79)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new yy20(a3, f2);
                    aVar.R(x);
                }
                yy20 yy20Var = (yy20) x;
                ((zak0) yy20Var.a).setValue(a3);
                ((zak0) yy20Var.b).setValue(new pco(f2));
                ((zak0) yy20Var.c).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                qy20Var = yy20Var;
                break;
            case 4:
                aVar.K(-1814166413);
                qy20Var = qy20.d.a.a(fwu0.l(this.h, null, null, null, aVar, 0, 62), aVar, 3080, 6);
                aVar.j();
                break;
            case 5:
                aVar.K(-1814162217);
                qy20Var = qy20.d.a.a(fwu0.l(this.h, null, null, null, aVar, 0, 62), aVar, 3128, 4);
                aVar.j();
                break;
            case 6:
                aVar.K(-1814176452);
                qy20Var = qy20.a.C3580a.a(phw.a.a(fwu0.l(this.h, null, null, null, aVar, 0, 62), null, null, null, null, aVar, 196616, 30), 56, null, null, null, aVar, 28);
                aVar.j();
                break;
            default:
                throw alb0.c(-1814182361, aVar);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return qy20Var;
    }

    public final boolean i() {
        return ((Boolean) ((zak0) this.n).getValue()).booleanValue();
    }
}
