package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.bridges.ImageViewer;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.InfoBar;
import com.vk.instantjobs.InstantJob;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.log.L;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.awr0;
import xsna.bq3.a;
import xsna.d8a0;
import xsna.naf;
import xsna.or2;
import xsna.pox0;
import xsna.r7x;
import xsna.sx40;
import xsna.wc30;
import xsna.whg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ks2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ks2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ImageViewer.c<?> g;
        int i = this.b;
        int i2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ms2 ms2Var = (ms2) obj2;
                UserId userId = (UserId) obj;
                or2 or2Var = ms2Var.c;
                or2.a aVar = (or2.a) ms2Var.h.getValue();
                break;
            case 1:
                bq3 bq3Var = (bq3) obj;
                JSONObject jSONObject = new JSONObject((String) obj2);
                JSONArray jSONArray = jSONObject.getJSONArray("photos");
                int optInt = jSONObject.optInt("index");
                k9x q = swe0.q(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(c5g.u(q, 10));
                j9x it = q.iterator();
                while (it.d) {
                    arrayList.add(new Image(jSONArray.getJSONArray(it.nextInt()), objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0));
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Photo((Image) it2.next()));
                }
                Activity activity$app_shared_armRelease = bq3Var.f.getActivity$app_shared_armRelease();
                if (activity$app_shared_armRelease != null && !activity$app_shared_armRelease.isDestroyed() && bq3Var.g == null) {
                    g = myc0.d().g(optInt, arrayList2, activity$app_shared_armRelease, bq3Var.new a(), o25.a().c());
                    bq3Var.g = g;
                }
                break;
            case 2:
                gw3 gw3Var = (gw3) obj2;
                L.e("AsrRecordListenerProxyImpl", fw3.d(gw3Var.a, new StringBuilder("asrRecordListeners: ")));
                gw3Var.a.add((l19) obj);
                break;
            case 3:
                break;
            case 4:
                kk7 kk7Var = (kk7) obj;
                if (((lk7) obj2).d) {
                    kk7Var.itemView.getLayoutParams().width = -1;
                } else {
                    kk7Var.itemView.getLayoutParams().width = (int) (kk7Var.l.getMeasuredWidth() * 0.75f);
                }
                kk7Var.itemView.requestLayout();
                break;
            case 5:
                bzd bzdVar = (bzd) obj2;
                cxd cxdVar = bzdVar.e.k;
                new eml(2, false).a(sxd.a(bzdVar.g()), new ry0((fo50) obj, bzdVar));
                break;
            case 6:
                ((naf) obj2).dismiss();
                ((naf.a) obj).j.invoke();
                break;
            case 7:
                yhg yhgVar = (yhg) obj2;
                whg.j jVar = (whg.j) obj;
                kyv j = yhgVar.c.j();
                Context context = yhgVar.a;
                jVar.getClass();
                j.r(context, null, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST), jVar.a, true);
                break;
            case 8:
                break;
            case 9:
                mh3 mh3Var = (mh3) obj;
                io.reactivex.rxjava3.disposables.c cVar = ((vvh) obj2).u;
                if (cVar != null) {
                    cVar.dispose();
                }
                mh3Var.invoke();
                break;
            case 10:
                wh50 wh50Var = (wh50) obj2;
                wh50 wh50Var2 = (wh50) obj;
                File parentFile = new File((String) wh50Var.getValue()).getParentFile();
                if (parentFile != null) {
                    wh50Var.setValue(parentFile.getAbsolutePath());
                    wh50Var2.setValue(j5g.T(1, (List) wh50Var2.getValue()));
                }
                break;
            case 11:
                izs izsVar = (izs) obj;
                String str = ((pox0.a) obj2).d;
                if (str != null) {
                    izsVar.invoke(str);
                }
                break;
            case 12:
                f6s f6sVar = (f6s) obj2;
                f6sVar.D.sa(new NewsfeedExternalAction.c.c0(f6sVar.u, ((q6s) obj).h0));
                break;
            case 13:
                okt oktVar = (okt) obj2;
                break;
            case 14:
                break;
            case 15:
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("max_ad", MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_ADVERTISER, null, 4, null), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                ((ovw) obj2).l.F(((InfoBar.Payload.MaxAd) obj).d);
                break;
            case 16:
                w6x w6xVar = (w6x) obj2;
                r7x r7xVar = (r7x) obj;
                InstantJob instantJob = w6xVar.e;
                int l = instantJob.l(r7xVar.e);
                r7xVar.j.add(new r7x.a(w6xVar, r7xVar.i(instantJob), InstantJob.a.g.a));
                if (r7xVar.f(l)) {
                    r7xVar.h(l);
                }
                r7xVar.g();
                break;
            case 17:
                a500 a500Var = (a500) obj;
                break;
            case 18:
                ((z520) obj2).f((Photo) obj);
                break;
            case 19:
                ModalAuthHostActivity modalAuthHostActivity = (ModalAuthHostActivity) obj;
                List<String> list = ModalAuthHostActivity.h;
                ((Ref$BooleanRef) obj2).element = false;
                Intent intent = new Intent(modalAuthHostActivity, (Class<?>) ModalAuthHostActivity.class);
                intent.setFlags(603979776);
                intent.putExtra("open_camera", true);
                modalAuthHostActivity.startActivity(intent);
                break;
            case 20:
                ((izs) obj2).invoke(new wc30.b(((fd30) obj).b));
                break;
            case 21:
                cl40.a((View) obj2, MusicHapticEvent.LIGHT);
                ((izs) obj).invoke(new sx40.t(PlayerContext.FULL, null));
                break;
            case 22:
                ((h7f0) obj2).o((yl50) obj);
                break;
            case 23:
                ((c8a0) obj2).f.invoke(new a.s.f(d8a0.b.i.d, (Photo) obj));
                break;
            case 24:
                y6s0 y6s0Var = (y6s0) obj2;
                s6s0 s6s0Var = (s6s0) obj;
                if (y6s0Var != null) {
                    y6s0Var.b(VideoBottomSheetSideEffectOptions.REMOVE_FROM_ALBUM, s6s0Var.a);
                }
                break;
            case 25:
                gzs gzsVar = (gzs) obj;
                if (((zak0) ((f12) obj2).m).getValue() == null) {
                    gzsVar.invoke();
                }
                break;
            case 26:
                UserProfileHeaderView userProfileHeaderView = (UserProfileHeaderView) obj;
                int i3 = UserProfileHeaderView.G;
                aad0 aad0Var = new aad0(userProfileHeaderView, 9);
                RectF o = zjq.o(userProfileHeaderView.A.getRightMainRect());
                Rect rect = new Rect();
                o.roundOut(rect);
                ((slq0) obj2).a(new UserProfileAction.m.e(aad0Var, rect));
                break;
            default:
                ((hqs0) obj2).g(new awr0.b((BlockId.CompositeId) obj));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ks2(c500 c500Var, String str, a500 a500Var) {
        this.b = 17;
        this.c = c500Var;
        this.d = a500Var;
    }
}
