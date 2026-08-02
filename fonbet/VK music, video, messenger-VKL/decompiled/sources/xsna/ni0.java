package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.clips.SdkNewsMonotheme;
import com.vk.clips.sdk.stats.pixels.impl.di.AdStatPixelsComponentImpl;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.contacts.ContactSyncState;
import com.vk.core.ui.VkFabBehaviour;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dialogsscreen.impl.GroupDialogsScreenFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photoviewer.PhotoViewer;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.superapp.api.dto.ad.AdInfo;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.browser.internal.ui.menu.action.OtherAction;
import com.vk.superapp.permission.js.bridge.api.events.GetGrantedPermissions$Response;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.update.core.a;
import com.vk.update.core.c;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.NarrativeAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.InitializedLazyImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.error.OneVideoPlaybackException;
import org.json.JSONObject;
import xsna.b4;
import xsna.djc;
import xsna.mnb;
import xsna.nxz;
import xsna.o9t;
import xsna.q97;
import xsna.qfs;
import xsna.r4q0;
import xsna.sx40;
import xsna.ug5;
import xsna.wmi0;
import xsna.wxi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ni0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ni0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        Activity h;
        ClipVideoFile clipVideoFile;
        ClipFeedTab singleClip;
        WebApiApplication v;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                oi0 oi0Var = (oi0) obj2;
                com.vk.movika.sdk.base.logic.interactor.g gVar = (com.vk.movika.sdk.base.logic.interactor.g) obj;
                qcy<Object>[] qcyVarArr = AdStatPixelsComponentImpl.b;
                if (oi0Var == null) {
                    oi0Var = new u9l();
                }
                break;
            case 1:
                com.vk.biometrics.lock.impl.presentation.base.mvi.pin.b bVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.pin.b) obj2;
                com.vk.biometrics.lock.impl.presentation.base.mvi.pin.h hVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.pin.h) obj;
                io.reactivex.rxjava3.subjects.d<q97> dVar = bVar.i;
                p97 p97Var = bVar.f;
                f4z f4zVar = bVar.j;
                com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c cVar = bVar.g;
                if (cVar instanceof c.e) {
                    if (hVar.b.d.a != 0) {
                        p97Var.j(new ux5(0, -1L));
                    }
                    d77 d77Var = hVar.b;
                    f4zVar.b(new g.C0428g(new r4q0.b(d77Var.d.a, d77Var.e)));
                    f4zVar.b(new g.b(false));
                } else if (cVar instanceof c.b) {
                    f4zVar.b(new g.e(epx.f(cVar, c.b.a)));
                } else if (cVar instanceof c.g) {
                    f4zVar.b(g.c.a);
                } else if (cVar instanceof c.d) {
                    p97Var.e();
                    f4zVar.b(new g.b(true));
                } else {
                    long a = ug5.a.b.a();
                    dVar.onNext(q97.d.a);
                    dVar.onNext(new q97.f(a));
                    p97Var.o(a);
                    f4zVar.b(g.d.a);
                }
                break;
            case 2:
                ymb ymbVar = (ymb) obj;
                Object obj3 = ((r480) obj2).c.c.get(Long.valueOf(ymbVar.h));
                DialogExt dialogExt = ymbVar.i;
                if (obj3 != null && dialogExt != null) {
                    dialogExt.Hb(new xpp<>((Dialog) obj3, false));
                    ymbVar.T(new mnb.h(dialogExt));
                }
                break;
            case 3:
                com.vk.contacts.c cVar2 = com.vk.contacts.c.b;
                com.vk.contacts.c.g((FragmentActivity) obj2);
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            case 4:
                qfs.a aVar = ((ufs) obj2).e;
                qfs.this.l.q(new OneVideoPlaybackException("Init FrameProvider failed"), (fgs) obj, aVar.a);
                break;
            case 5:
                ArrayList<Integer> arrayList = h6t.a;
                ((izs) obj2).invoke(new o9t.m(new djc.a(((g6t) obj).c)));
                break;
            case 6:
                int i2 = GroupDialogsScreenFragment.e0;
                ((GroupDialogsScreenFragment) obj2).getClass();
                View findViewById = ((View) obj).findViewById(R.id.vkim_fab);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
                if (fVar != null) {
                    CoordinatorLayout.f fVar2 = new CoordinatorLayout.f(fVar);
                    fVar2.c(new VkFabBehaviour());
                    fVar2.d = fVar.d;
                    fVar2.b(fVar.f);
                    fVar2.c = fVar.c;
                    findViewById.setLayoutParams(fVar2);
                }
                break;
            case 7:
                uxz uxzVar = (uxz) obj;
                nxz.d dVar2 = ((c9w) obj2).e;
                if (dVar2 != null) {
                    dVar2.h(uxzVar.b);
                }
                break;
            case 8:
                com.vk.update.core.a aVar2 = (com.vk.update.core.a) obj2;
                a.C1935a c1935a = (a.C1935a) obj;
                aVar2.h.a(c1935a.b.a(), new c.a(c1935a.a.b));
                aVar2.a(io.reactivex.rxjava3.core.x.k(Boolean.TRUE));
                break;
            case 9:
                u5y u5yVar = (u5y) obj2;
                String str = (String) obj;
                Context context = ((r6y) u5yVar.b.c).l;
                if (context != null) {
                    com.vk.superapp.base.js.bridge.b.p(((s1n0) u5yVar.d.getValue()).a, new JsMethod("VKWebAppGetGrantedPermissions"), new GetGrantedPermissions$Response(null, new GetGrantedPermissions$Response.Data(u5yVar.a(context), str), str, 1, null), null, null, false, null, 60);
                } else {
                    ((nvp) u5yVar.e.getValue()).a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), str, 1, null));
                }
                break;
            case 10:
                ((izs) obj2).invoke(cs40.b);
                ((sg50) obj).c(rgh0.a);
                break;
            case 11:
                com.vk.superapp.browser.internal.ui.menu.action.e eVar = (com.vk.superapp.browser.internal.ui.menu.action.e) obj2;
                OtherAction otherAction = (OtherAction) obj;
                if (!eVar.p) {
                    eVar.p = true;
                    eVar.itemView.postDelayed(new i0(8, eVar, otherAction), 400L);
                }
                break;
            case 12:
                ((izs) obj2).invoke(new sx40.t(PlayerContext.FULL, ((kib0) obj).c().a));
                break;
            case 13:
                otb0 otb0Var = (otb0) obj2;
                ((com.vk.movika.sdk.base.observable.g) otb0Var.c).invoke(otb0Var.a(new JSONObject((String) obj).getJSONObject("poll")));
                break;
            case 14:
                ((v16) obj2).onClick(((com.vk.attachpicker.screen.k) obj).x);
                break;
            case 15:
                kyc0 kyc0Var = (kyc0) obj;
                wxi0 a2 = new vxi0((uxi0) obj2).a();
                if (a2 instanceof wxi0.a) {
                    wmi0 wmi0Var = wmi0.a;
                    wmi0.j = new InitializedLazyImpl(Long.valueOf(((wxi0.a) a2).a.b));
                } else if (a2 instanceof wxi0.d) {
                    wmi0 wmi0Var2 = wmi0.a;
                    wmi0.j = new InitializedLazyImpl(Long.valueOf(((wxi0.d) a2).b.c().a.b));
                } else if (a2 instanceof wxi0.c) {
                    t6g0 t6g0Var = t6g0.b;
                    kcl0 d = t6g0.d();
                    wxi0.c cVar3 = (wxi0.c) a2;
                    UserId userId = cVar3.a;
                    UserId userId2 = cVar3.a;
                    d.Y(userId.b);
                    ((NewsFeedComponent) kyc0Var.c().a(fpf0.a(NewsFeedComponent.class))).Y2().a(userId2).subscribe();
                    wmi0 wmi0Var3 = wmi0.a;
                    long j = userId2.b;
                    wmi0Var3.getClass();
                    if (wmi0.i) {
                        String a3 = defpackage.k0.a(j, BundleUtil.UNDERLINE_TAG);
                        ArrayList arrayList2 = new ArrayList();
                        ConcurrentHashMap concurrentHashMap = wmi0.e;
                        if (concurrentHashMap == null) {
                            concurrentHashMap = null;
                        }
                        Iterator it = concurrentHashMap.keySet().iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (brm0.v(str2, a3, false)) {
                                it.remove();
                                arrayList2.add(str2);
                            }
                        }
                        wmi0.a aVar3 = wmi0.d;
                        (aVar3 != null ? aVar3 : null).b(arrayList2);
                    }
                }
                break;
            case 16:
                break;
            case 17:
                y6s0 y6s0Var = (y6s0) obj2;
                s6s0 s6s0Var = (s6s0) obj;
                if (y6s0Var != null) {
                    y6s0Var.b(VideoBottomSheetSideEffectOptions.REMOVE_FROM_ALBUM, s6s0Var.a);
                }
                break;
            case 18:
                g8g0 g8g0Var = (g8g0) obj;
                if (((f8g0) obj2).b != ContactSyncState.SYNCING) {
                    g8g0Var.l.b();
                }
                break;
            case 19:
                gzs<s3q0> gzsVar = (gzs) obj;
                HorizontalRecyclerPaginationView a4 = ((znj0) obj2).h().a();
                if (a4 != null) {
                    a4.setDataObserver(gzsVar);
                }
                break;
            case 20:
                yck0 yck0Var = (yck0) obj2;
                wck0 wck0Var = ((adk0) obj).o;
                boolean z = yck0Var.d;
                MusicTrack musicTrack = yck0Var.c;
                String str3 = yck0Var.b;
                if (z) {
                    wck0Var.a(musicTrack, str3);
                } else {
                    MusicTrack musicTrack2 = yck0Var.e;
                    if (musicTrack2 != null) {
                        musicTrack = musicTrack2;
                    }
                    wck0Var.a(musicTrack, str3);
                }
                break;
            case 21:
                ((myl0) obj2).c((t2l0) obj);
                break;
            case 22:
                zdn0 zdn0Var = (zdn0) obj2;
                zdn0Var.p.g(((AdInfo) obj).b, zdn0Var.itemView.getContext().getString(R.string.ad_marker_copied));
                break;
            case 23:
                icp0 icp0Var = (icp0) obj;
                Context context2 = ((ConstraintLayout) obj2).getContext();
                if (context2 != null && (h = e3m.h(context2)) != null) {
                    UIBlockTopshelf.TopshelfItem topshelfItem = icp0Var.d;
                    UIBlockTopshelf.TopshelfNews topshelfNews = topshelfItem instanceof UIBlockTopshelf.TopshelfNews ? (UIBlockTopshelf.TopshelfNews) topshelfItem : null;
                    if (topshelfNews != null && (clipVideoFile = topshelfNews.h) != null) {
                        SdkClipVideoFile e = icp0Var.t.e(clipVideoFile);
                        SdkNewsMonotheme v1 = e.v1();
                        if (v1 != null) {
                            ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_NEWS_MONOTHEME;
                            clipsFeatures.getClass();
                            SdkNewsMonotheme sdkNewsMonotheme = com.vk.toggle.b.A.a(clipsFeatures) ? v1 : null;
                            if (sdkNewsMonotheme != null) {
                                UiTracker uiTracker = UiTracker.a;
                                new iof(UiTracker.c(), new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.CLIPS_MONOTOPIC, SchemeStat$TypeClipViewerItem.EventType.GO_TO_MONOTOPIC_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsClipItem(clipVideoFile.c, clipVideoFile.b.b, clipVideoFile.W), null, null, 939524092, null)).q();
                                singleClip = new ClipFeedTab.NewsMonotheme(sdkNewsMonotheme.b, sdkNewsMonotheme.c, e, null, 8, 0 == true ? 1 : 0);
                                ClipsRouter.b(icp0Var.u, h, singleClip, null, null, null, null, false, 252);
                            }
                        }
                        singleClip = new ClipFeedTab.SingleClip(e, null, null, false, false, null, null, null, 254, null);
                        ClipsRouter.b(icp0Var.u, h, singleClip, null, null, null, null, false, 252);
                    }
                }
                break;
            case 24:
                ((wh50) obj).setValue((String) obj2);
                break;
            case 25:
                kbj0.e(nr4.b(), (Context) obj2, new NarrativeAttachment((Narrative) obj), false, null, false, null, 60);
                break;
            case 26:
                ((c4) obj2).d(new b4.b((Long) obj));
                break;
            case 27:
                nht0 nht0Var = (nht0) obj;
                if (((lht0) obj2).a.e()) {
                    nht0Var.a();
                }
                break;
            case 28:
                bst0 bst0Var = (bst0) obj2;
                PhotoViewer.g gVar2 = (PhotoViewer.g) obj;
                TextView textView = bst0Var.l;
                vqt0 vqt0Var = bst0Var.g;
                if (textView == null) {
                    textView = null;
                }
                StringBuilder sb = bst0Var.n;
                bst0Var.f(vqt0Var.a(), sb);
                textView.setText(sb);
                SeekBar seekBar = bst0Var.j;
                (seekBar != null ? seekBar : null).setMax((int) vqt0Var.a());
                gVar2.getWidth();
                gVar2.getHeight();
                break;
            default:
                ggu0 ggu0Var = (ggu0) obj2;
                gzs gzsVar2 = (gzs) obj;
                if (ggu0Var.v() && (v = ggu0Var.e.v()) != null && v.f()) {
                    ggu0Var.l().a();
                }
                gzsVar2.invoke();
                break;
        }
        return s3q0.a;
    }
}
