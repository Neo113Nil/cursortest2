package xsna;

import android.content.SharedPreferences;
import android.view.View;
import com.vk.clips.viewer.api.domain.subs.ClipsSubsSetting;
import com.vk.clips.viewer.impl.feed.view.subs.selector.ClipsAutoSubtitlesBottomSheet;
import com.vk.clips.viewer.impl.feed.view.subs.selector.b;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cjd implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cjd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ClipsSubsSetting clipsSubsSetting;
        switch (this.b) {
            case 0:
                ClipsAutoSubtitlesBottomSheet clipsAutoSubtitlesBottomSheet = (ClipsAutoSubtitlesBottomSheet) this.c;
                View view = (View) obj;
                ((Integer) obj3).getClass();
                an6 an6Var = clipsAutoSubtitlesBottomSheet.e;
                ClipsAutoSubtitlesBottomSheet.ClipsAutoSubsSetting clipsAutoSubsSetting = ((ClipsAutoSubtitlesBottomSheet.a) obj2).a;
                com.vk.clips.viewer.impl.feed.view.subs.selector.b bVar = (com.vk.clips.viewer.impl.feed.view.subs.selector.b) an6Var.b;
                m1d m1dVar = (m1d) an6Var.c;
                int i = b.a.$EnumSwitchMapping$1[clipsAutoSubsSetting.ordinal()];
                if (i == 1) {
                    clipsSubsSetting = ClipsSubsSetting.ALWAYS;
                } else if (i == 2) {
                    clipsSubsSetting = ClipsSubsSetting.NEVER;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    clipsSubsSetting = ClipsSubsSetting.SOUND_OFF;
                }
                qaj0.c((SharedPreferences) ((l5f) bVar.b.getValue()).a.getValue(), "subs-setting", clipsSubsSetting.toString());
                m1dVar.invoke(clipsSubsSetting);
                clipsAutoSubtitlesBottomSheet.b(view);
                return s3q0.a;
            case 1:
                wvq wvqVar = (wvq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-356103542, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.ButtonsList.<anonymous>.<anonymous>.<anonymous> (FeedActionButtonsScreenContent.kt:92)");
                    }
                    wvqVar.g(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                jai jaiVar = (jai) this.c;
                anx anxVar = (anx) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(anxVar) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-748027338, intValue2, -1, "com.vk.core.compose.component.VkAccentTabRow.<anonymous>.<anonymous> (VkAccentTabRow.kt:145)");
                    }
                    jaiVar.invoke(u6u0.g(anxVar, aVar2, intValue2 & 14), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
