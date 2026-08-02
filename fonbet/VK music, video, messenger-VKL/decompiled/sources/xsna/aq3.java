package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.vk.articles.a;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.articles.Article;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vk.qrcode.QRStatsTracker;
import com.vkontakte.android.R;
import org.json.JSONObject;
import xsna.m8v0;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class aq3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aq3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        a.InterfaceC0377a callback;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                bq3 bq3Var = (bq3) obj3;
                JSONObject jSONObject = (JSONObject) obj;
                Article s = bq3Var.s((JSONObject) obj2);
                if (s != null && (callback = bq3Var.f.getCallback()) != null) {
                    callback.uj(s, jSONObject.optBoolean("isSubscribedToOwner", false));
                }
                break;
            case 1:
                final com.vk.clips.entrypoints.ui.d dVar = (com.vk.clips.entrypoints.ui.d) obj3;
                final View view = (View) obj2;
                final lpj lpjVar = (lpj) obj;
                q7v0 q7v0Var = dVar.a;
                final VkOnboardingCampaign e = q7v0Var.e("clips:author_trends_entrypoint");
                if (e != null) {
                    if (q7v0Var.d(e)) {
                        view.post(new Runnable() { // from class: xsna.s1e
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.vk.clips.entrypoints.ui.d dVar2 = com.vk.clips.entrypoints.ui.d.this;
                                VkOnboardingCampaign vkOnboardingCampaign = e;
                                View view2 = view;
                                lpj lpjVar2 = lpjVar;
                                try {
                                    if (dVar2.a.b(vkOnboardingCampaign, false)) {
                                        int i2 = m8v0.M;
                                        m8v0.a.a(view2, view2.getContext().getString(R.string.clips_entry_point_trends_onboarding_text), null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size96, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.TopLeft, null, new x7(dVar2, 28), null, null, null, new hl1(9, dVar2, vkOnboardingCampaign), new sf4(3, dVar2, vkOnboardingCampaign), null, 0, false, null, null, false, lpjVar2, false, 12570244);
                                    }
                                } catch (Throwable th) {
                                    com.vk.metrics.eventtracking.b.a.a(th);
                                }
                            }
                        });
                    }
                    break;
                } else {
                    break;
                }
            case 2:
                ((izs) obj3).invoke(new a.d((qg80) obj2, ((mc90) obj).r()));
                break;
            case 3:
                ((xzb0) obj3).c().x((Context) obj2, (Post) ((NewsEntry) obj));
                break;
            case 4:
                Intent intent = new Intent("android.intent.action.INSERT");
                intent.setType("vnd.android.cursor.dir/raw_contact");
                intent.putExtra("phone", ((ime0) obj).c.getNumber());
                ((Activity) obj3).startActivity(intent);
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.ADD_TO_CONTACTS);
                com.vk.qrcode.d dVar2 = com.vk.qrcode.d.b;
                com.vk.qrcode.d.a((cme0) obj2);
                break;
            default:
                ((bp50) obj3).d((b520) obj2);
                ((skm0.a) obj).l0();
                break;
        }
        return s3q0.a;
    }
}
