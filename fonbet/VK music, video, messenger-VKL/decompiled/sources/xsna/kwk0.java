package xsna;

import java.util.Collections;
import java.util.Set;

/* compiled from: StaticAdsItemOverlayVisibilityMapper.kt */
/* loaded from: classes17.dex */
public final class kwk0 {
    public o390 a;
    public Set<? extends a> b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StaticAdsItemOverlayVisibilityMapper.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ErrorOverlay;
        public static final a MainOverlay;
        public static final a UnfocusedBlackout;

        static {
            a aVar = new a("MainOverlay", 0);
            MainOverlay = aVar;
            a aVar2 = new a("ErrorOverlay", 1);
            ErrorOverlay = aVar2;
            a aVar3 = new a("UnfocusedBlackout", 2);
            UnfocusedBlackout = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
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

    public final boolean a(a aVar, o390 o390Var) {
        if (o390Var.equals(this.a)) {
            return this.b.contains(aVar);
        }
        this.a = o390Var;
        Set<? extends a> y0 = o390Var.b.c ? rl3.y0(new a[]{a.MainOverlay, a.UnfocusedBlackout}) : Collections.singleton(a.MainOverlay);
        this.b = y0;
        return y0.contains(aVar);
    }
}
