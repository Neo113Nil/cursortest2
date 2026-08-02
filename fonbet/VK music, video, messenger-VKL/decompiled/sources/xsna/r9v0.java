package xsna;

import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkOnboardingTooltipWrapper.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipWrapperKt$onboardingTooltip$1$3$1", f = "VkOnboardingTooltipWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class r9v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<tny> $anchorLayoutCoordinates$delegate;
    final /* synthetic */ wh50<z4p0> $balloonLayoutParams$delegate;
    final /* synthetic */ float $density;
    final /* synthetic */ boolean $isAutoPositionEnabled;
    final /* synthetic */ VkTooltip$MarkerSize $markerSize;
    final /* synthetic */ VkTooltip$MarkerStyle $markerStyle;
    final /* synthetic */ VkTooltip$BalloonPosition $originalBalloonPosition;
    final /* synthetic */ wh50<VkTooltip$BalloonPosition> $overridedBalloonPosition$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9v0(boolean z, VkTooltip$BalloonPosition vkTooltip$BalloonPosition, float f, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, wh50<z4p0> wh50Var, wh50<tny> wh50Var2, wh50<VkTooltip$BalloonPosition> wh50Var3, spj<? super r9v0> spjVar) {
        super(2, spjVar);
        this.$isAutoPositionEnabled = z;
        this.$originalBalloonPosition = vkTooltip$BalloonPosition;
        this.$density = f;
        this.$markerStyle = vkTooltip$MarkerStyle;
        this.$markerSize = vkTooltip$MarkerSize;
        this.$balloonLayoutParams$delegate = wh50Var;
        this.$anchorLayoutCoordinates$delegate = wh50Var2;
        this.$overridedBalloonPosition$delegate = wh50Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new r9v0(this.$isAutoPositionEnabled, this.$originalBalloonPosition, this.$density, this.$markerStyle, this.$markerSize, this.$balloonLayoutParams$delegate, this.$anchorLayoutCoordinates$delegate, this.$overridedBalloonPosition$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((r9v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v54 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal, still in use, count: 2, list:
          (r3v54 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal) from 0x00da: IF  (r3v54 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal) == (null com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal)  -> B:83:0x016e A[HIDDEN] (LINE:219)
          (r3v54 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal) from 0x00ca: PHI (r3v40 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal) = 
          (r3v11 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal)
          (r3v12 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal)
          (r3v45 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal)
          (r3v49 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal)
          (r3v54 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal)
          (r3v55 com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal)
         binds: [B:103:0x016c, B:101:0x015c, B:96:0x0130, B:91:0x010d, B:82:0x00da, B:25:0x00c8] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.r9v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
