package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.messages.MessagesType;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import xsna.khw0;
import xsna.q7t;
import xsna.xfh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k14 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k14(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 2;
        int i3 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                m14 m14Var = (m14) obj3;
                AttachDoc attachDoc = (AttachDoc) obj2;
                io.reactivex.rxjava3.internal.operators.single.b0 m = hg1.n(m14Var.b.C(m14Var, new e24(attachDoc.b, MessagesType.CHANNEL)), m14Var.a, false, null, 62).m(asu0.a.d());
                l14 l14Var = new l14(m14Var, attachDoc, (MsgFromChannel) obj, i3);
                int i4 = 3;
                m14Var.f.b(m.subscribe(new f50(l14Var, i4), new lf1(new z90(i4), i2)));
                return s3q0.a;
            case 1:
                ynh ynhVar = (ynh) obj3;
                UserProfile userProfile = (UserProfile) obj2;
                qg1 qg1Var = (qg1) obj;
                if (ynhVar.a().a(userProfile.c)) {
                    cvk.u(R.string.community_call_self, false);
                    return s3q0.a;
                }
                qg1Var.invoke();
                ((afw0) ynhVar.O0.getValue()).a().d(new khw0.a(jnw0.a(userProfile, false), new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.COMMUNITY_BUTTON, MobileOfficialAppsCoreNavStat$EventScreen.GROUP), null, null, null, 28));
                return s3q0.a;
            case 2:
                MusicTabsFiltersView.e eVar = (MusicTabsFiltersView.e) obj3;
                MusicTabsFiltersView.f fVar = (MusicTabsFiltersView.f) obj2;
                izs izsVar = (izs) obj;
                if (!eVar.c && !fVar.d) {
                    izsVar.invoke(new MusicTabsFiltersView.b.a(fVar.b, eVar.a));
                }
                return s3q0.a;
            case 3:
                CommunitiesCatalogRootVh communitiesCatalogRootVh = (CommunitiesCatalogRootVh) obj3;
                cv3 cv3Var = new cv3(communitiesCatalogRootVh, (Activity) obj2, (CommunitiesCatalogFragment) obj, 2);
                int i5 = ify.a;
                if (ify.e(ify.c)) {
                    ify.a(new fog(cv3Var));
                    communitiesCatalogRootVh.Q.a();
                } else {
                    cv3Var.invoke();
                }
                return s3q0.a;
            case 4:
                ((e8d) obj3).a(((xfh.a) obj).itemView.getContext(), (VideoFile) obj2);
                return s3q0.a;
            case 5:
                fwm fwmVar = (fwm) obj3;
                View view = (View) obj2;
                gzs gzsVar = (gzs) obj;
                VkOnboardingCampaign e = fwmVar.a.e("im:dialogs_calls_promotion");
                if (e == null) {
                    return s3q0.a;
                }
                if (fwmVar.a.d(e)) {
                    view.post(new ewm(fwmVar, gzsVar, e, view, view.getContext().getString(R.string.vkm_dialogs_toolbar_calls_onboarding_title), null));
                }
                return s3q0.a;
            case 6:
                r7t r7tVar = (r7t) obj2;
                Integer num = (Integer) obj;
                izs<q7t, s3q0> izsVar2 = ((cgt) obj3).d;
                sbt sbtVar = r7tVar.d;
                int i6 = r7tVar.i;
                String str = r7tVar.l;
                if (str == null) {
                    str = "";
                }
                izsVar2.invoke(new q7t.c(i6, sbtVar, num, str));
                return s3q0.a;
            case 7:
                ((com.vk.movika.sdk.base.ui.r) obj3).invoke();
                ((mj80) obj2).n.v((com.vk.movika.sdk.player.base.model.a) obj);
                return s3q0.a;
            default:
                qgp0 qgp0Var = (qgp0) obj3;
                UserId userId = (UserId) obj2;
                String str2 = (String) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", go9.b("mid=", str2)});
                }
                return qgp0Var.b.l(String.valueOf(userId.b), str2);
        }
    }
}
