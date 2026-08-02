package xsna;

import java.util.Collections;
import java.util.Set;
import xsna.gvp;

/* compiled from: AdsItemOverlayVisibilityMapper.kt */
/* loaded from: classes17.dex */
public final class fz0 {
    public p390 a;
    public Set<? extends a> b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemOverlayVisibilityMapper.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a EndOverlay;
        public static final a ErrorOverlay;
        public static final a MainOverlay;
        public static final a RestrictionOverlay;
        public static final a UnfocusedBlackout;

        static {
            a aVar = new a("MainOverlay", 0);
            MainOverlay = aVar;
            a aVar2 = new a("RestrictionOverlay", 1);
            RestrictionOverlay = aVar2;
            a aVar3 = new a("EndOverlay", 2);
            EndOverlay = aVar3;
            a aVar4 = new a("ErrorOverlay", 3);
            ErrorOverlay = aVar4;
            a aVar5 = new a("UnfocusedBlackout", 4);
            UnfocusedBlackout = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public final boolean a(a aVar, p390 p390Var) {
        if (p390Var.equals(this.a)) {
            return this.b.contains(aVar);
        }
        this.a = p390Var;
        boolean z = p390Var.c.c;
        j4b0 j4b0Var = p390Var.b;
        boolean z2 = j4b0Var.e;
        boolean z3 = j4b0Var.f && (p390Var.d instanceof gvp.a);
        boolean z4 = j4b0Var.g;
        Set<? extends a> y0 = (z2 && z) ? rl3.y0(new a[]{a.RestrictionOverlay, a.UnfocusedBlackout}) : z2 ? Collections.singleton(a.RestrictionOverlay) : (z4 && z) ? rl3.y0(new a[]{a.EndOverlay, a.UnfocusedBlackout}) : z4 ? Collections.singleton(a.EndOverlay) : z ? rl3.y0(new a[]{a.MainOverlay, a.UnfocusedBlackout}) : z3 ? rl3.y0(new a[]{a.MainOverlay, a.ErrorOverlay}) : Collections.singleton(a.MainOverlay);
        this.b = y0;
        return y0.contains(aVar);
    }
}
