package defpackage;

import com.yandex.go.flex.main_screen.presentation.controllers.shimmer.OptimizedShimmerContentView;

/* loaded from: classes12.dex */
public final class md70 implements ptr0 {
    public final /* synthetic */ OptimizedShimmerContentView a;

    public md70(OptimizedShimmerContentView optimizedShimmerContentView) {
        this.a = optimizedShimmerContentView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        boolean z = ((jvr0) obj).a;
        OptimizedShimmerContentView optimizedShimmerContentView = this.a;
        OptimizedShimmerContentView.applyShimmeringStateRecursive$default(optimizedShimmerContentView, optimizedShimmerContentView, null, z, 1, null);
    }
}
