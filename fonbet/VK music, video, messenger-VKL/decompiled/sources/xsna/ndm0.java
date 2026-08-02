package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.StorySettingsActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ndm0 implements gzs {
    public final /* synthetic */ StorySettingsActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ndm0(StorySettingsActivity storySettingsActivity, boolean z) {
        this.b = storySettingsActivity;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = StorySettingsActivity.P;
        StorySettingsActivity storySettingsActivity = this.b;
        bsl0 bsl0Var = (bsl0) storySettingsActivity.x.getValue();
        boolean z = !this.c;
        io.reactivex.rxjava3.internal.operators.single.b0 m = bsl0Var.c(z).m(io.reactivex.rxjava3.android.schedulers.a.b());
        int i2 = kwg0.a;
        m.subscribe(new iwg0(), new xk30(new u19(L.a, 8), 23));
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = storySettingsActivity.N;
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint != null) {
            ((anm0) storySettingsActivity.y.getValue()).x(z, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_SETTINGS), mobileOfficialAppsConStoriesStat$ViewEntryPoint);
        }
        boolean z2 = !storySettingsActivity.K;
        storySettingsActivity.K = z2;
        VkCell vkCell = storySettingsActivity.J;
        if (vkCell == null) {
            vkCell = null;
        }
        vkCell.setRight(StorySettingsActivity.T1(z2, new ndm0(storySettingsActivity, z2)));
        return s3q0.a;
    }
}
