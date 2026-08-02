package xsna;

import android.content.Context;
import android.os.ConditionVariable;
import android.view.View;
import com.vk.api.generated.vmoji.dto.VmojiGetCharacterByIdResponseDto;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;
import java.util.Collection;
import ru.ok.tracer.base.http.HttpRequest;
import ru.ok.tracer.crash.report.SessionStateUploader;
import xsna.m8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l5p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l5p(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        ?? r2 = this.f;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                m5p m5pVar = (m5p) obj3;
                View view = (View) obj2;
                q7v0 q7v0Var = (q7v0) obj;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) r2;
                m5pVar.getClass();
                if (m5p.b(view)) {
                    int i2 = m8v0.M;
                    m8v0.a.a(view, m5pVar.b.getRequireContext().getString(R.string.reaction_sticker_onboarding), null, null, VkTooltip$MarkerSize.Size64, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new pz(view, 28), new qm(20), null, null, new r97(m5pVar, view, q7v0Var, vkOnboardingCampaign, 2), null, null, 0, false, null, null, false, null, false, 8383532);
                    break;
                }
                break;
            case 1:
                SessionStateUploader.upload$lambda$4((HttpRequest) obj3, (SessionStateUploader) obj2, (Collection) obj, (ConditionVariable) r2);
                break;
            case 2:
                VmojiProductModel vmojiProductModel = (VmojiProductModel) obj2;
                new msp0().a(((aaw0) obj3).b, vmojiProductModel, (VmojiGetCharacterByIdResponseDto) obj, new yu1(27, (n9m0) r2, vmojiProductModel));
                break;
            default:
                com.vungle.ads.internal.w2.a((com.vungle.ads.internal.w2) obj3, (Context) obj2, (String) obj, r2);
                break;
        }
    }
}
