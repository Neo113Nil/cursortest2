package xsna;

import com.vk.core.compose.component.skeleton.SkeletonType;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: SkeletonDefaults.kt */
/* loaded from: classes17.dex */
public final class fyj0 {
    public static final float a = VersionConstants.PRODUCT_MAJOR_VERSION;
    public static final float b = 80;
    public static final float c = 64;

    /* compiled from: SkeletonDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkeletonType.values().length];
            try {
                iArr[SkeletonType.Block.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SkeletonType.Circle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static uog0 a(SkeletonType skeletonType, float f) {
        int i = a.$EnumSwitchMapping$0[skeletonType.ordinal()];
        if (i == 1) {
            return vog0.b(pco.a(f, 10.0f) <= 0 ? 2.0f : 4.0f);
        }
        if (i == 2) {
            return vog0.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
