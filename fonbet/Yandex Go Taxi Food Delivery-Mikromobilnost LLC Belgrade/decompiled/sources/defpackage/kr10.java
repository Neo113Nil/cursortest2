package defpackage;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.model.content.MergePaths$MergePathsMode;

/* loaded from: classes10.dex */
public final class kr10 implements ehe {
    public final MergePaths$MergePathsMode a;
    public final boolean b;

    public kr10(String str, MergePaths$MergePathsMode mergePaths$MergePathsMode, boolean z) {
        this.a = mergePaths$MergePathsMode;
        this.b = z;
    }

    @Override // defpackage.ehe
    public final uee a(LottieDrawable lottieDrawable, nsz nszVar, l35 l35Var) {
        if (lottieDrawable.isFeatureFlagEnabled(LottieFeatureFlag.MergePathsApi19)) {
            return new mr10(this);
        }
        lgz.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.a + '}';
    }
}
