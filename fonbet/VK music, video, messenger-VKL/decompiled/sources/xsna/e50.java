package xsna;

import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4254c3;
import com.ironsource.sdk.controller.v;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import xsna.crl;
import xsna.hul;
import xsna.jms0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class e50 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e50(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                final StoryEntry storyEntry = (StoryEntry) obj2;
                final q50 q50Var = (q50) obj;
                int i2 = storyEntry.Mb() ? R.string.deleting_live_finished_story : R.string.deleting_story;
                q7r q7rVar = q50Var.a;
                final com.vk.core.view.components.spinner.c e = qv20.e(q7rVar.i0.getContext(), Integer.valueOf(i2));
                int i3 = 0;
                e.setCancelable(false);
                q50Var.d.e(e, null);
                mkm0 mkm0Var = q7rVar.i0;
                mkm0Var.a(mkm0Var.getDependencies().a.c(Collections.singletonList(storyEntry)).j(new g50(e, i3)).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.h50
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        int i4 = StoryEntry.this.Mb() ? R.string.story_live_finished_deleted : R.string.story_deleted;
                        q50 q50Var2 = q50Var;
                        Context context = q50Var2.a.i0.getContext();
                        cmf0.d(context, q50Var2.a.i0.getWindow(), context.getString(i4), false, (56 & 16) != 0 ? iah0.a(88) : 0, (56 & 32) != 0);
                        qv20.b(e);
                    }
                }, new j50(new i50(q50Var, i3), i3)));
                mkm0Var.f1(StoryViewAction.DELETE, null);
                break;
            case 1:
                BaseIPCClient baseIPCClient = (BaseIPCClient) obj2;
                BaseIPCClient.b bVar = (BaseIPCClient.b) obj;
                BaseIPCClient.Companion companion = BaseIPCClient.Companion;
                Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Sleeping 1000 ms before next bind attempt", null, 2, null);
                SystemClock.sleep(1000L);
                AppInfo appInfo = bVar.a;
                boolean f = epx.f(baseIPCClient.h(appInfo, bVar.b), BaseIPCClient.BindingResult.Ok.INSTANCE);
                Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "bindService to " + appInfo.getPackageName() + " result: " + f, null, 2, null);
                if (!f) {
                    Logger.DefaultImpls.warn$default(baseIPCClient.getLogger(), "Failed to bind again. Giving up.", null, 2, null);
                    ke6 ke6Var = new ke6(baseIPCClient);
                    if (!baseIPCClient.k.isEmpty()) {
                        baseIPCClient.j.submit(new he6(baseIPCClient, ke6Var));
                        break;
                    }
                }
                break;
            case 2:
                ((crl) obj2).h.b(((crl.c) obj).b.y);
                break;
            case 3:
                hul.a aVar = (hul.a) obj;
                try {
                    aVar.a(((Callable) obj2).call());
                    break;
                } catch (Exception e2) {
                    aVar.b(e2);
                    return;
                }
            case 4:
                u2b0 u2b0Var = ((rw40) obj2).y;
                if (epx.f(u2b0Var.b(), (MusicTrack) obj)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action", "dislike");
                    u2b0Var.setPayload(jSONObject.toString());
                    u2b0Var.s0(new PlaybackActionMeta(7, 0L, 2, null));
                    u2b0Var.setPayload(null);
                    break;
                }
                break;
            case 5:
                ((x8i0) obj2).e((ic80) obj, s3q0.a);
                break;
            case 6:
                wjf0.c((RecyclerView) obj2, (gzs) obj);
                break;
            case 7:
                ((lq9) obj2).A((f8h0) obj, s3q0.a);
                break;
            case 8:
                v3l0 v3l0Var = (v3l0) obj2;
                q6m0 q6m0Var = (q6m0) obj;
                ViewGroup viewGroup = q6m0Var.k;
                v3l0Var.a(viewGroup != null ? viewGroup : null);
                u6m0 u6m0Var = q6m0Var.p;
                if (u6m0Var != null) {
                    u6m0Var.b();
                    break;
                }
                break;
            case 9:
                jms0 jms0Var = (jms0) obj2;
                jms0.b bVar2 = (jms0.b) obj;
                jms0Var.getClass();
                try {
                    bVar2.run();
                    break;
                } catch (Exception e3) {
                    jms0Var.b(e3);
                    return;
                }
            case 10:
                C4254c3.a((BannerAdView) obj2, (C4254c3) obj);
                break;
            case 11:
                ((yads.cl) obj2).b((String) obj);
                break;
            case 12:
                ((yads.gk3) obj2).d((yads.pa0) obj);
                break;
            default:
                ((v.s) obj2).j((String) obj);
                break;
        }
    }
}
