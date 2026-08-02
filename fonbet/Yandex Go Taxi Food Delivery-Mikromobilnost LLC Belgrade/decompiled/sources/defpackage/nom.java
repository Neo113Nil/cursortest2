package defpackage;

import com.yx360.design.compose.atoms.DsBadge$Size;
import com.yx360.design.compose.atoms.DsBadge$Variant;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class nom {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DsBadge$Size.values().length];
        try {
            iArr[DsBadge$Size.Md.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsBadge$Size.Sm.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DsBadge$Variant.values().length];
        try {
            iArr2[DsBadge$Variant.Primary.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DsBadge$Variant.Secondary.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DsBadge$Variant.Brand.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DsBadge$Variant.Danger.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
