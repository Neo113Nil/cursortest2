package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.utils.ClipFeedTooltip$ClipFeedTooltipType;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.im.MsgType;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.pending.PendingAudioMessageAttachment;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.data.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.eeu0;
import xsna.psf;
import xsna.rn4;
import xsna.s89;
import xsna.syc;
import xsna.uuf;
import xsna.wzd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class nn4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nn4(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        float f;
        q8e Bo;
        gzs<? extends s3q0> h;
        wzs<? super DialogInterface, ? super CharSequence, s3q0> wzsVar;
        File file = null;
        switch (this.b) {
            case 0:
                on4 on4Var = (on4) this.c;
                ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) this.d;
                io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.e;
                rn4 rn4Var = (rn4) obj;
                if (rn4Var instanceof rn4.b) {
                    file = ((rn4.b) rn4Var).a;
                    f = 1.0f;
                } else {
                    if (!(rn4Var instanceof rn4.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = ((rn4.a) rn4Var).a;
                }
                if (file != null) {
                    com.vk.movika.sdk.base.asset.b bVar = on4Var.b;
                    ClipsEditorMusicInfo zb = ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, null, "file://" + file.getPath(), 0, 0, 0, file.getAbsolutePath(), 0, 2013);
                    bzd bzdVar = bzd.this;
                    long n = bzdVar.n.n();
                    szd szdVar = bzdVar.p;
                    long e = szdVar.o.a.e();
                    int min = (int) Math.min(n, e - bzd.z);
                    ClipsEditorMusicInfo zb2 = ClipsEditorMusicInfo.zb(zb, null, null, 0, Math.min(bzdVar.e.k.a(zb.j), Math.min((int) (e - min), zb.b.e - zb.d)), min, null, 0, 2023);
                    wzd.a aVar = new wzd.a(muc.a, 1);
                    ClipsEditorAudioItem clipsEditorAudioItem = new ClipsEditorAudioItem(zb2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 30);
                    List<? extends wzd> singletonList = Collections.singletonList(aVar);
                    com.vk.clips.editor.state.model.a aVar2 = szdVar.o.a;
                    ArrayList arrayList = new ArrayList(aVar2.e);
                    arrayList.add(Collections.singletonList(clipsEditorAudioItem));
                    szdVar.c(com.vk.clips.editor.state.model.a.c(aVar2, null, null, null, arrayList, null, null, 111), singletonList);
                    fVar.onComplete();
                } else {
                    fVar.onNext(Integer.valueOf((int) (f * 100)));
                }
                return s3q0.a;
            case 1:
                Object obj2 = this.c;
                wh50 wh50Var = (wh50) this.d;
                izs izsVar = (izs) this.e;
                tho0 tho0Var = (tho0) obj;
                wh50Var.setValue(tho0Var);
                owi.a(obj2, 300L, new ig1(4, izsVar, tho0Var));
                return s3q0.a;
            case 2:
                s89.a aVar3 = (s89.a) this.c;
                s89 s89Var = (s89) this.d;
                String str = (String) this.e;
                dz2 x = yfb.x(((sg20) obj).o(aVar3.a.b, str, s89Var.c, aVar3.b));
                x.c = true;
                x.h = true;
                return rsg0.w0(x).l(new x34(new wz(aVar3, str, s89Var, 2), 3));
            case 3:
                uuf.h hVar = (uuf.h) this.c;
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.d;
                q8e q8eVar = (q8e) this.e;
                int i = ClipsWrapperFragment.Q0;
                psf a = hVar.a();
                if (a instanceof psf.b) {
                    ((syc) clipsWrapperFragment.r0.getValue()).e((ViewGroup) clipsWrapperFragment.getView(), q8eVar, syc.a.d.c);
                } else if (a instanceof psf.a) {
                    syc sycVar = (syc) clipsWrapperFragment.r0.getValue();
                    ClipFeedListFragment lo = clipsWrapperFragment.lo();
                    ViewGroup viewGroup = (ViewGroup) clipsWrapperFragment.getView();
                    hjj0 hjj0Var = ((psf.a) a).a;
                    FeedItem.d dVar = sycVar.h;
                    if (dVar != null && lo != null && (Bo = lo.Bo()) != null && viewGroup != null) {
                        hjj0Var.getClass();
                        syc.a.e eVar = new syc.a.e();
                        if (!sycVar.f) {
                            SdkVideoFile k = dVar.k();
                            ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType = ClipFeedTooltip$ClipFeedTooltipType.DECORATION_ONBOARDING;
                            if (lo.Ue(k, clipFeedTooltip$ClipFeedTooltipType).a) {
                                lo.X6(dVar.k(), clipFeedTooltip$ClipFeedTooltipType, hjj0Var);
                                sycVar.e(viewGroup, Bo, eVar);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 4:
                ((FriendsItemListVh) this.c).b((Context) this.d, (UIBlockProfile) this.e, CatalogViewType.SYNTHETIC_ACTION_ADD_FRIEND);
                ((ikv0) obj).a();
                return s3q0.a;
            case 5:
                kz30 kz30Var = (kz30) this.c;
                AttachAudioMsg attachAudioMsg = (AttachAudioMsg) this.d;
                qc qcVar = (qc) this.e;
                MsgType msgType = (MsgType) obj;
                if (msgType != null) {
                    kz30Var.V((PendingAudioMessageAttachment) wdw.b(attachAudioMsg, null, false, 6), kz30.c0(msgType));
                    qcVar.invoke();
                }
                return s3q0.a;
            case 6:
                JSONObject jSONObject = (JSONObject) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                b.d dVar2 = (b.d) obj;
                dVar2.b(jSONObject, "gallery_state");
                dVar2.b(str2, "creation_entry_point");
                dVar2.b(str3, "nav_screen");
                return s3q0.a;
            case 7:
                izs izsVar2 = (izs) this.c;
                UserId userId = (UserId) this.d;
                Context context = (Context) this.e;
                if (izsVar2 != null) {
                    izsVar2.invoke(userId);
                }
                xwk.e().h0().h(1, context, fkq0.e(userId));
                xwk.e().T().m().b(new kym0(SubscribeStatus.MEMBER_STATUS_MEMBER, fkq0.e(userId), null, null, 12));
                return s3q0.a;
            case 8:
                com.vk.core.view.components.spinner.c cVar = (com.vk.core.view.components.spinner.c) this.c;
                yk ykVar = (yk) this.d;
                m84 m84Var = (m84) this.e;
                cVar.hide();
                if (((Boolean) obj).booleanValue()) {
                    ykVar.invoke();
                } else {
                    m84Var.invoke();
                }
                return s3q0.a;
            case 9:
                wh50 wh50Var2 = (wh50) this.c;
                TimelineViewState timelineViewState = (TimelineViewState) this.d;
                wh50 wh50Var3 = (wh50) this.e;
                float floatValue = ((Float) obj).floatValue();
                if (wh50Var2.getValue() == 0 && (h = timelineViewState.b().h()) != null) {
                    h.invoke();
                }
                wh50Var2.setValue(Long.valueOf(com.vk.libvideo.design.compose.base.timeline.a.e((long) floatValue, timelineViewState.c)));
                wh50Var3.setValue(qgo.FullOverlay);
                return s3q0.a;
            case 10:
                ToolbarVh toolbarVh = (ToolbarVh) this.c;
                View view = (View) this.d;
                UIBlockList uIBlockList = (UIBlockList) this.e;
                String str4 = (String) obj;
                VkContextMenu vkContextMenu = toolbarVh.y;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                eda edaVar = toolbarVh.i;
                if (edaVar != null) {
                    Context context2 = view.getContext();
                    String str5 = uIBlockList.b;
                    bpn0 bpn0Var = cqm0.a;
                    if (str5 == null) {
                        str5 = "";
                    }
                    edaVar.e(context2, str5, str4, toolbarVh);
                }
                return s3q0.a;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                eeu0.a.C2801a c2801a = (eeu0.a.C2801a) this.d;
                n3x n3xVar = (n3x) this.e;
                androidx.appcompat.app.d dVar3 = (androidx.appcompat.app.d) ref$ObjectRef.element;
                if (dVar3 != null && (wzsVar = c2801a.u) != null) {
                    wzsVar.invoke(dVar3, n3xVar.getEtInput().getText());
                }
                return s3q0.a;
        }
    }
}
