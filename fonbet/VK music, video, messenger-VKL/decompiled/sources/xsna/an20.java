package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.p5g;

/* compiled from: MilkshakeAvatarScreenBorderContent.kt */
/* loaded from: classes18.dex */
public final class an20 implements ds5 {
    public final LinkedHashMap a;
    public final wh50 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeAvatarScreenBorderContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Color;
        public static final a Live;
        public static final a None;
        public static final a Story;

        static {
            a aVar = new a("None", 0);
            None = aVar;
            a aVar2 = new a("Story", 1);
            Story = aVar2;
            a aVar3 = new a("Live", 2);
            Live = aVar3;
            a aVar4 = new a("Color", 3);
            Color = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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

    /* compiled from: MilkshakeAvatarScreenBorderContent.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Story.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Live.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.Color.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public an20() {
        zrp<a> h = a.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            linkedHashMap.put(((a) obj).name(), obj);
        }
        this.a = linkedHashMap;
        this.b = androidx.compose.runtime.k.b(a.None);
    }

    @Override // xsna.ds5
    public final hdu0 a(int i, androidx.compose.runtime.a aVar) {
        hdu0 hdu0Var;
        aVar.K(-2020545050);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2020545050, i, -1, "com.vk.design.demo.presentation.screens.avatar.MilkshakeAvatarScreenBorderContent.createViewBorder (MilkshakeAvatarScreenBorderContent.kt:47)");
        }
        int i2 = b.$EnumSwitchMapping$0[((a) ((zak0) this.b).getValue()).ordinal()];
        if (i2 == 1) {
            hdu0Var = null;
        } else if (i2 == 2) {
            hdu0Var = new odu0();
        } else if (i2 == 3) {
            hdu0Var = new ndu0();
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            hdu0Var = new idu0(f870.H(l5g.h), 6);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return hdu0Var;
    }

    @Override // xsna.ds5
    public final k18 b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        k18 k18Var;
        aVar.K(599704315);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(599704315, i, -1, "com.vk.design.demo.presentation.screens.avatar.MilkshakeAvatarScreenBorderContent.createComposeBorder (MilkshakeAvatarScreenBorderContent.kt:37)");
        }
        int i2 = b.$EnumSwitchMapping$0[((a) ((zak0) this.b).getValue()).ordinal()];
        if (i2 == 1) {
            aVar2 = aVar;
            aVar2.K(790233126);
            aVar2.j();
            k18Var = wep.a;
        } else if (i2 == 2) {
            aVar2 = aVar;
            aVar2.K(790234536);
            k18Var = czl0.a(aVar2);
            aVar2.j();
        } else if (i2 == 3) {
            aVar2 = aVar;
            aVar2.K(790235975);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1868758024, 0, -1, "com.vk.core.compose.component.image.border.LiveBorder (LiveBorder.kt:7)");
            }
            k18Var = p5g.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 196662, 12, f870.d(4293281146L), aVar2, true);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.j();
        } else {
            if (i2 != 4) {
                throw alb0.c(790231711, aVar);
            }
            aVar.K(790237436);
            aVar2 = aVar;
            k18Var = p5g.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 196614, 30, l5g.h, aVar2, false);
            aVar2.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return k18Var;
    }

    @Override // xsna.ds5
    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1337359338);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1337359338, i2, -1, "com.vk.design.demo.presentation.screens.avatar.MilkshakeAvatarScreenBorderContent.Controls (MilkshakeAvatarScreenBorderContent.kt:27)");
            }
            String name = ((a) ((zak0) this.b).getValue()).name();
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new vfk(this, 28);
                M.R(x);
            }
            q630Var2 = q630Var;
            y9i0.a("Border", this.a, name, (izs) x, q630Var2, M, ((i2 << 12) & 57344) | 6, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sag(this, q630Var2, i, 3);
        }
    }
}
