package xsna;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.messages.dto.MessagesGetAnonymCallTokenResponseDto;
import com.vk.articles.ArticleFragment;
import com.vk.dto.articles.Article;
import com.vk.dto.newsfeed.Owner;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.libvideo.design.view.timer.LiveTimerView;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import com.vk.superapp.browser.internal.ui.shortcats.ShortcutPendingData;
import com.vk.superapp.browser.internal.ui.shortcats.ShortcutSuccessReceiver;
import com.vk.voip.api.join.JoinData;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.dji0;
import xsna.s89;
import xsna.wt2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wz(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar = (com.vk.superapp.browser.internal.ui.shortcats.a) this.c;
                ShortcutPendingData.ShortcutSource shortcutSource = (ShortcutPendingData.ShortcutSource) this.d;
                Activity activity = (Activity) this.e;
                xgj0 xgj0Var = (xgj0) obj;
                aVar.f = new AddActionSuggestion(false, false, 0L, AddActionSuggestion.Action.ADD_TO_MAIN_SCREEN, "", null, null);
                String uuid = UUID.randomUUID().toString();
                aVar.k = new ShortcutPendingData(uuid, shortcutSource);
                WebApiApplication webApiApplication = xgj0Var.a;
                String str = "web_app_" + webApiApplication.b + '_' + uuid;
                tyx tyxVar = e370.p;
                if (tyxVar == null) {
                    tyxVar = null;
                }
                long j = webApiApplication.b;
                tyxVar.getClass();
                Intent addFlags = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://" + a0a.d + "/app" + j)).setPackage(activity.getPackageName()).addFlags(268435456);
                addFlags.putExtra("ref", "home_screen");
                zgj0 zgj0Var = new zgj0();
                zgj0Var.a = activity;
                zgj0Var.b = str;
                String str2 = webApiApplication.c;
                zgj0Var.e = str2;
                zgj0Var.f = str2;
                zgj0Var.h = xgj0Var.b;
                zgj0Var.c = new Intent[]{addFlags};
                if (TextUtils.isEmpty(str2)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr = zgj0Var.c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                Intent intent = new Intent(activity, (Class<?>) ShortcutSuccessReceiver.class);
                intent.setPackage(activity.getApplicationContext().getPackageName());
                bhj0.l(activity, zgj0Var, PendingIntent.getBroadcast(activity, 1, intent, 201326592).getIntentSender());
                return s3q0.a;
            case 1:
                ArticleFragment articleFragment = (ArticleFragment) this.c;
                defpackage.r rVar = (defpackage.r) this.d;
                yh yhVar = (yh) this.e;
                View view = (View) obj;
                int i = ArticleFragment.E0;
                Owner oo = articleFragment.oo();
                if (oo != null) {
                    Article article = articleFragment.T;
                    int i2 = 0;
                    xwk.e().T().j(view, oo.b, oo.i(4), "article", null, (r22 & 32) != 0 ? false : !oo.i(16), (r22 & 128) != 0 ? null : new go3(oo, articleFragment, article, rVar, i2), (r22 & 256) != 0 ? null : new ho3(oo, articleFragment, article, yhVar, i2), (r22 & 512) != 0 ? null : articleFragment.requireContext(), null);
                }
                return s3q0.a;
            case 2:
                s89.a aVar2 = (s89.a) this.c;
                String str3 = (String) this.d;
                s89 s89Var = (s89) this.e;
                MessagesGetAnonymCallTokenResponseDto messagesGetAnonymCallTokenResponseDto = (MessagesGetAnonymCallTokenResponseDto) obj;
                wt2.c cVar = new wt2.c(String.valueOf(aVar2.a.b), String.valueOf(messagesGetAnonymCallTokenResponseDto.e().b), str3, aVar2.c);
                JoinData joinData = s89Var.e;
                wt2.b bVar = new wt2.b(joinData.c, joinData.d);
                String f = messagesGetAnonymCallTokenResponseDto.f();
                if (f == null) {
                    f = "";
                }
                return new wt2(cVar, bVar, new wt2.a(f, messagesGetAnonymCallTokenResponseDto.g(), messagesGetAnonymCallTokenResponseDto.d(), s89Var.e.b));
            case 3:
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.c;
                t2l t2lVar = (t2l) this.d;
                LiveTimerView liveTimerView = (LiveTimerView) this.e;
                int i3 = LiveTimerView.y;
                if (ref$LongRef.element <= 0) {
                    t2lVar.invoke();
                    io.reactivex.rxjava3.disposables.c cVar2 = liveTimerView.t;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                }
                return s3q0.a;
            default:
                pii0 pii0Var = (pii0) this.c;
                xii0 xii0Var = (xii0) this.d;
                aji0 aji0Var = (aji0) this.e;
                dji0 dji0Var = (dji0) obj;
                if (dji0Var.equals(dji0.b.a)) {
                    pii0Var.On(3);
                } else if (dji0Var instanceof dji0.c) {
                    pii0Var.k1.invoke(Long.valueOf(((dji0.c) dji0Var).a));
                } else if (dji0Var instanceof dji0.e) {
                    dji0.e eVar = (dji0.e) dji0Var;
                    StoryMultiData storyMultiData = eVar.a;
                    if (storyMultiData != null) {
                        pii0Var.l1.invoke(storyMultiData, Long.valueOf(eVar.b));
                    }
                } else if (dji0Var instanceof dji0.d) {
                    xii0Var.c = new b6f0(dji0Var, 5);
                    com.vk.lists.c cVar3 = aji0Var.d;
                    cVar3.o();
                    cVar3.r(true);
                    cVar3.p(false);
                } else {
                    if (!(dji0Var instanceof dji0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pii0Var.m1.invoke(new bc6(pii0Var.i1, new th3(pii0Var, 9)), Integer.valueOf(CommonConstant.RETCODE.NEED_UPDATE_STATICKIT));
                }
                return s3q0.a;
        }
    }
}
