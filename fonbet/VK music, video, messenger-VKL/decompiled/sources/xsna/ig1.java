package xsna;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Log;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.core.view.tools.VkViewStub;
import com.vk.dto.articles.Article;
import com.vk.dto.hints.HintId;
import com.vk.dto.messages.MsgIdType;
import com.vk.ecomm.design.compose.gallery.ProductGalleryItem;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.utils.recyclerview.LinearLayoutManagerScrollHelper;
import com.vk.log.L;
import com.vk.music.view.vkmix.gl.GLShaderId;
import com.vk.newsfeed.common.recycler.holders.donut.DonutPostClickSource;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.albums.presentation.a;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.profile.user.api.di.UserProfileParamsComponent;
import com.vk.qrcode.QRStatsTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vkontakte.android.R;
import java.nio.IntBuffer;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.BaseVideoPlayer;
import xsna.e8v0;
import xsna.ee60;
import xsna.ejd0;
import xsna.kh1;
import xsna.nqd0;
import xsna.nyd0;
import xsna.o9t;
import xsna.osf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ig1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ig1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        nyd0.d f;
        ovv0 J;
        dvv0 a;
        Dialog f2;
        int i = this.b;
        ?? r5 = this.d;
        Object obj = this.c;
        switch (i) {
            case 0:
                PhotoAlbumWrapper photoAlbumWrapper = (PhotoAlbumWrapper) r5;
                f4z f4zVar = ((gg1) obj).p;
                if (photoAlbumWrapper instanceof PhotoAlbumWrapper.CommonPhotoAlbum) {
                    f4zVar.b(new i.k(new kh1.b(((PhotoAlbumWrapper.CommonPhotoAlbum) photoAlbumWrapper).e)));
                } else {
                    if (!(photoAlbumWrapper instanceof PhotoAlbumWrapper.SpecialPhotoAlbum)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((PhotoAlbumWrapper.SpecialPhotoAlbum) photoAlbumWrapper).e == -183) {
                        f4zVar.b(new i.k(kh1.d.a));
                    }
                }
                return s3q0.a;
            case 1:
                ((com.vk.photos.root.albums.presentation.b) obj).C((a.C1492a) r5);
                return s3q0.a;
            case 2:
                vw3 vw3Var = BaseVideoPlayer.H;
                return ss9.a("Player is accessed on the wrong thread.\nCurrent thread: '", ((Thread) obj).getName(), "'\nExpected thread: '", ((BaseVideoPlayer) r5).c.getName(), "'");
            case 3:
                fh7 fh7Var = (fh7) r5;
                String value = ((b2t) ((we0) obj).c).a(GLShaderId.Blur).getValue();
                int glCreateShader = GLES20.glCreateShader(35632);
                GLES20.glShaderSource(glCreateShader, value);
                GLES20.glCompileShader(glCreateShader);
                IntBuffer allocate = IntBuffer.allocate(1);
                GLES20.glGetShaderiv(glCreateShader, 35713, allocate);
                if (allocate.get(0) == 0) {
                    Log.e("createShader", GLES20.glGetShaderInfoLog(glCreateShader));
                }
                return new ch7(((Number) fh7Var.d.getValue()).intValue(), glCreateShader);
            case 4:
                ((izs) obj).invoke(((tho0) r5).a.c);
                return s3q0.a;
            case 5:
                return o1d.G((o1d) obj, r5);
            case 6:
                qad qadVar = (qad) r5;
                izs<MarketProductTileConfig, s3q0> izsVar = ((cbd) obj).l;
                if (izsVar != null) {
                    izsVar.invoke(qadVar.b);
                }
                return s3q0.a;
            case 7:
                q7v0 q7v0Var = (q7v0) obj;
                jlf jlfVar = (jlf) r5;
                VkOnboardingCampaign e = q7v0Var.e(HintId.CLIPS_NEW_BC_POSTING_ONBOARDING.getId());
                if (e != null) {
                    q7v0Var.a(e, VkOnboardingType.Tooltip, e8v0.m.b);
                    jlfVar.e(new vgf(false));
                }
                return s3q0.a;
            case 8:
                ((osf.a) obj).e.invoke(Integer.valueOf(((wrf) r5).e()));
                return s3q0.a;
            case 9:
                return ((UserProfileParamsComponent) ((h7m) obj).b(fpf0.a(UserProfileParamsComponent.class), (qmq0) ((ynh) r5).N.getValue())).xd();
            case 10:
                lyd0 lyd0Var = (lyd0) r5;
                ((izs) obj).invoke(1);
                if (lyd0Var != null && (f = lyd0Var.f()) != null) {
                    f.d(false);
                }
                return s3q0.a;
            case 11:
                b0o b0oVar = (b0o) obj;
                j1o.a(b0oVar, b0oVar.itemView.getContext(), ((d0o) r5).l, (p4r) b0oVar.H.getValue(), DonutPostClickSource.Button);
                return s3q0.a;
            case 12:
                Throwable th = (Throwable) obj;
                vop vopVar = (vop) r5;
                Context context = vopVar.b;
                boolean z = th instanceof VKApiExecutionException;
                if (z && ((VKApiExecutionException) th).s() == 104) {
                    com.vk.registration.funnels.b.a.getClass();
                    com.vk.registration.funnels.b.w();
                    cop copVar = (cop) vopVar.a;
                    if (copVar != null) {
                        copVar.v4();
                    }
                } else if (z && f35.c((VKApiExecutionException) th)) {
                    i270.a(vopVar.a, drm0.p0(vopVar.N).toString(), context, null);
                } else if (z && f35.d((VKApiExecutionException) th)) {
                    sp.v(vopVar.a, context, null);
                } else if (z) {
                    cop copVar2 = (cop) vopVar.a;
                    if (copVar2 != null) {
                        copVar2.wa(((VKApiExecutionException) th).t(), null, null);
                    }
                } else {
                    cop copVar3 = (cop) vopVar.a;
                    if (copVar3 != null) {
                        copVar3.wa(context.getString(R.string.vk_auth_internal_server_error_text), null, null);
                    }
                }
                return s3q0.a;
            case 13:
                FriendsItemListVh friendsItemListVh = (FriendsItemListVh) obj;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) r5;
                q3a q3aVar = friendsItemListVh.c;
                CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
                q3aVar.b(new xxf0(catalogUserMeta.b), false);
                jps jpsVar = new jps(uIBlockProfile.A.c);
                String a2 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS);
                if (!TextUtils.isEmpty(a2)) {
                    jpsVar.K("ref", a2);
                }
                String str = catalogUserMeta.d;
                if (!TextUtils.isEmpty(str)) {
                    jpsVar.K("track_code", str);
                }
                friendsItemListVh.i.b(jpsVar.p());
                return s3q0.a;
            case 14:
                ((izs) obj).invoke(new o9t.b((h8t) r5));
                return s3q0.a;
            case 15:
                ((izs) obj).invoke(new o9t.b((l6t) r5));
                return s3q0.a;
            case 16:
                String str2 = (String) r5;
                fvv0 M = ((r6y) obj).M();
                if (M != null && (J = M.J()) != null && (a = J.a(VkUiCommand.KEEP_SCREEN_ON)) != null) {
                    a.a(str2);
                }
                return s3q0.a;
            case 17:
                ClipActionButton clipActionButton = new ClipActionButton(((VkViewStub) obj).getContext());
                jjc.g(clipActionButton, new lwh((cq00) r5, 22));
                return clipActionButton;
            case 18:
                return new SimpleDateFormat(((Context) obj).getString(R.string.vkim_msg_list_time_etc), ((ci30) r5).f);
            case 19:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) obj;
                MsgReadAsLastData msgReadAsLastData = (MsgReadAsLastData) r5;
                final vm30 vm30Var = aVar.o;
                com.vk.im.ui.components.msg_list.c cVar = aVar.O0;
                if (vm30Var != null) {
                    final MsgIdType msgIdType = MsgIdType.CNV_ID;
                    final int i2 = msgReadAsLastData.a;
                    ok30 ok30Var = vm30Var.H;
                    int a3 = qk30.a(ok30Var, msgIdType, i2);
                    Integer valueOf = Integer.valueOf(a3);
                    if (a3 == -1) {
                        valueOf = null;
                    }
                    final int intValue = valueOf != null ? valueOf.intValue() : 0;
                    vm30Var.V = new bvx(intValue, "instantScrollToMsgBottom", qk30.c(intValue, ok30Var), 0, false);
                    L.d(new gzs() { // from class: xsna.mm30
                        @Override // xsna.gzs
                        public final Object invoke() {
                            StringBuilder a4 = vq.a("ChatScrollIssue: instantScrollToMsg position=", intValue, '/');
                            a4.append(vm30Var.H.f.size() - 1);
                            a4.append(", msgIdType=");
                            a4.append(msgIdType.h());
                            a4.append(", msgId=");
                            a4.append(i2);
                            a4.append(", chain=scrollToClipMsgForReactionSuggest");
                            return a4.toString();
                        }
                    });
                    LinearLayoutManagerScrollHelper linearLayoutManagerScrollHelper = vm30Var.Y;
                    LinearLayoutManagerScrollHelper.d(linearLayoutManagerScrollHelper, Math.max(0, linearLayoutManagerScrollHelper.b().getItemCount() - 1), 0, 4);
                }
                Msg d = cVar.d(msgReadAsLastData.a);
                if (d != null && (f2 = cVar.f()) != null && f2.Gb()) {
                    MsgFromUser msgFromUser = d instanceof MsgFromUser ? (MsgFromUser) d : null;
                    if (msgFromUser != null) {
                        vm30 vm30Var2 = aVar.o;
                        if (vm30Var2 != null) {
                            vm30.D(vm30Var2, msgFromUser, null, 48);
                        }
                        Dialog f3 = cVar.f();
                        if (f3 != null) {
                            aVar.r2(f3, d, true);
                        }
                    }
                }
                return s3q0.a;
            case 20:
                rg50 rg50Var = (rg50) r5;
                rg50Var.C(rg50Var.getIntValue() + 1);
                ((gzs) obj).invoke();
                return s3q0.a;
            case 21:
                ((ne60) obj).g.invoke(new ee60.c(((ie60) r5).a));
                return s3q0.a;
            case 22:
                ((izs) obj).invoke((tgp0) r5);
                return s3q0.a;
            case 23:
                kg80 kg80Var = (kg80) r5;
                OnboardingPromoState onboardingPromoState = (OnboardingPromoState) ((gzs) obj).invoke();
                return onboardingPromoState == null ? new OnboardingPromoState(null, kg80Var.d().b, null, false, 13, null) : onboardingPromoState;
            case 24:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) r5;
                ((k6a0) obj).d = null;
                izs izsVar2 = (izs) ref$ObjectRef.element;
                if (izsVar2 != null) {
                    izsVar2.invoke(Boolean.FALSE);
                }
                ref$ObjectRef.element = null;
                return s3q0.a;
            case 25:
                ((com.vk.photos.root.photoflow.presentation.b) obj).C((a.f) r5);
                return s3q0.a;
            case 26:
                ((gzs) obj).invoke();
                ((ujd0) r5).dismiss();
                return s3q0.a;
            case 27:
                eld0 eld0Var = (eld0) r5;
                izs<ejd0, s3q0> izsVar3 = ((dld0) obj).n;
                List<ProductGalleryItem> list = eld0Var.a;
                int i3 = eld0Var.b;
                izsVar3.invoke(new ejd0.d.C2818d(list.get(i3).b, i3));
                return s3q0.a;
            case 28:
                ((izs) obj).invoke(new nqd0.b(((usd0) r5).c));
                return s3q0.a;
            default:
                Activity activity = (Activity) obj;
                Article article = (Article) r5;
                bpn0 bpn0Var = vtk0.c;
                ((gq3) (bpn0Var != null ? bpn0Var : null).getValue()).b(activity, article);
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_ARTICLE);
                return s3q0.a;
        }
    }
}
