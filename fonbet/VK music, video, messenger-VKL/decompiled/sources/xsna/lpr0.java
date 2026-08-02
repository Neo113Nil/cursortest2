package xsna;

import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stories.design.view.editor.verticalization.VerticalizationBannerView;

/* compiled from: VerticalizationDelegate.kt */
/* loaded from: classes16.dex */
public final class lpr0 implements VerticalizationBannerView.a {
    public final /* synthetic */ jpr0 a;

    public lpr0(jpr0 jpr0Var) {
        this.a = jpr0Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.stories.design.view.editor.verticalization.VerticalizationBannerView.a
    public final void a() {
        jpr0 jpr0Var = this.a;
        jpr0Var.c().i(StoryEditorEvents.CLICK_ON_TRY_VERTICALIZATION);
        ((xqj0) jpr0Var.e.getValue()).h();
        jpr0.a(jpr0Var);
        jpr0Var.b();
    }

    @Override // com.vk.stories.design.view.editor.verticalization.VerticalizationBannerView.a
    public final void b() {
        jpr0.a(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.stories.design.view.editor.verticalization.VerticalizationBannerView.a
    public final void dismiss() {
        jpr0 jpr0Var = this.a;
        jpr0Var.c().i(StoryEditorEvents.CLICK_ON_POSTPONE_VERTICALIZATION);
        jpr0.a(jpr0Var);
        ((xqj0) jpr0Var.e.getValue()).f(new ape0(jpr0Var, 22));
    }
}
