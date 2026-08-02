package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.opengl.GLES20;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.room.a;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.holders.OfflineHeaderRemoveAllVh;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.compose.component.modal.Mode;
import com.vk.core.snackbar.HideReason;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.music.view.vkmix.gl.GLShaderId;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.preview.presentation.view.GalleryPickerPreview;
import com.vk.profile.user.impl.domain.edit.models.ProfileSettingType;
import com.vk.qrcode.QRStatsTracker;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipCoownersItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.update.core.a;
import com.vk.update.core.c;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.mail.libverify.controls.VerificationController;
import xsna.aiq0;
import xsna.b3q0;
import xsna.flv0;
import xsna.gex0;
import xsna.k840;
import xsna.kyg;
import xsna.n030;
import xsna.ur7;
import xsna.xs3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ss3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ss3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        VkModal.Mode mode;
        Boolean lambda$isValidSmsCode$7;
        int i = this.b;
        int i2 = 3;
        int i3 = 16;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((izs) obj2).invoke(new xs3.b(((jt3) obj).b));
                return s3q0.a;
            case 1:
                ((izs) obj2).invoke((biq0) obj);
                return s3q0.a;
            case 2:
                return ((s290) ((tq6) obj2).a.getValue()).a(((VideoFile) obj).w2());
            case 3:
                ((izs) obj2).invoke(((ur7.b) ((ur7) obj)).b.b);
                return s3q0.a;
            case 4:
                nek0 nek0Var = (nek0) obj;
                izs izsVar = (izs) obj2;
                if (nek0Var != null) {
                    nek0Var.hide();
                }
                izsVar.invoke(kyg.b.b);
                return s3q0.a;
            case 5:
                UserId userId = (UserId) obj;
                ClipsRouter.c(g620.f().a(), ((View) obj2).getContext(), Collections.singletonList(new ClipFeedTab.CoauthorInvitations(userId)), null, null, fpf0.a(ClipFeedTab.CoauthorInvitations.class), null, null, true, null, 1900);
                UiTrackingScreen b = UiTracker.j.b();
                if (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) {
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
                }
                new god(mobileOfficialAppsCoreNavStat$EventScreen, new MobileOfficialAppsClipsStat$TypeClipCoownersItem(MobileOfficialAppsClipsStat$TypeClipCoownersItem.Type.OPEN_MODAL_COOWNERS, new MobileOfficialAppsClipsStat$TypeClipsClipItem(0, userId.b, null, 4, null))).q();
                return s3q0.a;
            case 6:
                hyg0 open = ((a.C0084a) obj2).open((String) obj);
                p7i.e(open, "PRAGMA query_only = 1");
                return open;
            case 7:
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) obj2;
                qtd0 qtd0Var = (qtd0) obj;
                ArrayList arrayList = new ArrayList((Collection) bVar.r);
                if (bVar.h(qtd0Var)) {
                    arrayList.remove(qtd0Var);
                } else {
                    arrayList.add(qtd0Var);
                }
                bVar.r = arrayList;
                io.reactivex.rxjava3.subjects.d<s3q0> dVar = bVar.q;
                s3q0 s3q0Var = s3q0.a;
                dVar.onNext(s3q0Var);
                bVar.o.onNext(bVar.i(bVar.d()));
                return s3q0Var;
            case 8:
                xhk xhkVar = (xhk) obj2;
                ImageView imageView = (ImageView) obj;
                xhkVar.setVisibility(0);
                k5h k5hVar = new k5h(xhkVar, 7);
                if (imageView != null) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(xhkVar.getContext().getResources().openRawResource(R.raw.posting_drag_photo), emb.b), 8192);
                    try {
                        String b2 = a0a.b(bufferedReader);
                        bufferedReader.close();
                        RLottieDrawable rLottieDrawable = new RLottieDrawable(b2, "dragging_crop_zoom", iah0.a(150), iah0.a(100), null, false, false, null, 496);
                        ez3 ez3Var = rLottieDrawable.k;
                        ez3Var.q = 1;
                        rLottieDrawable.setCallback(imageView);
                        ez3Var.t = new whk(new b1j(k5hVar, i2));
                        io.reactivex.rxjava3.internal.operators.observable.m1 b3 = sa30.b(new io.reactivex.rxjava3.internal.operators.observable.s0(new uhk(rLottieDrawable, objArr2 == true ? 1 : 0)));
                        x8 x8Var = new x8(new frg(imageView, 5), 15);
                        int i4 = kwg0.a;
                        xhkVar.b.b(b3.subscribe(x8Var, new iwg0()));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ro.e(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
                return s3q0.a;
            case 9:
                a.C1935a c1935a = (a.C1935a) obj2;
                com.vk.update.core.a aVar = (com.vk.update.core.a) obj;
                vrw vrwVar = c1935a.b;
                if (vrwVar.d()) {
                    aVar.b(c1935a);
                } else {
                    gex0.b bVar2 = aVar.h;
                    String a = vrwVar.a();
                    wrw wrwVar = c1935a.a;
                    bVar2.a(a, new c.b(wrwVar.b));
                    int i5 = 22;
                    hg1.a(new io.reactivex.rxjava3.internal.operators.observable.o1(vrwVar.b(wrwVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new pv2(new m4g(aVar, 29), i5)), new nu0(new r9k(c1935a, 19), 27)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ez(new com.vk.libvideo.design.view.video.a(18, aVar, c1935a), 25), new iu1(new k82(11, aVar, c1935a), i5)), aVar.b);
                }
                return s3q0.a;
            case 10:
                ((izs) obj2).invoke(new aiq0.i.f((ProfileSettingType) obj));
                return s3q0.a;
            case 11:
                ((izs) obj2).invoke(((dqj) obj).c);
                return s3q0.a;
            case 12:
                n030 n030Var = (n030) obj2;
                Context context = (Context) obj;
                int i6 = n030.a.$EnumSwitchMapping$0[((Mode) ((zak0) n030Var.c).getValue()).ordinal()];
                if (i6 == 1) {
                    mode = VkModal.Mode.FullScreen;
                } else if (i6 == 2) {
                    mode = VkModal.Mode.DynamicHeight;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mode = VkModal.Mode.Card;
                }
                VkModal vkModal = new VkModal(mode, null, null, false, 30);
                VkTopBar vkTopBar = new VkTopBar(context, objArr == true ? 1 : 0, 6, objArr3 == true ? 1 : 0);
                vkTopBar.setBefore(new VkTopBar.c.d(null, new xrj(vkModal, 21), null, null, 13));
                vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title("Modal Page", (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, 0 == true ? 1 : 0, null, 14));
                VkText vkText = new VkText(context, null, 6, 0);
                vkText.setText(n030Var.d);
                int a2 = iah0.a(16);
                f4m.l(a2, a2, vkText);
                int a3 = iah0.a(12);
                f4m.B(a3, a3, vkText);
                vkModal.b = new b.C0791b(vkText, vkTopBar);
                vkModal.b(context, null);
                return s3q0.a;
            case 13:
                MsgListEmptyViewState.ForDialog forDialog = (MsgListEmptyViewState.ForDialog) obj2;
                com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) obj;
                qtd0 zb = forDialog.b.zb(forDialog.a.Zb());
                if (zb != null) {
                    aVar2.e(new b.o(zb));
                }
                return s3q0.a;
            case 14:
                u440 u440Var = (u440) obj2;
                ((g440) u440Var.s).X0(((w1m0) obj).a);
                u440Var.A0 = null;
                return s3q0.a;
            case 15:
                MusicTrack musicTrack = (MusicTrack) obj2;
                MusicTrack musicTrack2 = (MusicTrack) obj;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new ib50(musicTrack, musicTrack2));
                return s3q0.a;
            case 16:
                io40 io40Var = (io40) obj;
                String value = ((b2t) ((we0) obj2).c).a(GLShaderId.Music).getValue();
                int glCreateShader = GLES20.glCreateShader(35632);
                GLES20.glShaderSource(glCreateShader, value);
                GLES20.glCompileShader(glCreateShader);
                IntBuffer allocate = IntBuffer.allocate(1);
                GLES20.glGetShaderiv(glCreateShader, 35713, allocate);
                if (allocate.get(0) == 0) {
                    Log.e("createShader", GLES20.glGetShaderInfoLog(glCreateShader));
                }
                return new co40(((Number) io40Var.d.getValue()).intValue(), glCreateShader);
            case 17:
                qcy<Object>[] qcyVarArr = OfflineHeaderRemoveAllVh.j;
                jjc.a(new km1(i3, (OfflineHeaderRemoveAllVh) obj2, (UIBlock) obj));
                return s3q0.a;
            case 18:
                PhotoVideoAttachActivity photoVideoAttachActivity = (PhotoVideoAttachActivity) obj2;
                int i7 = PhotoVideoAttachActivity.g0;
                if (!((GalleryFragmentImpl) obj).Wm()) {
                    return s3q0.a;
                }
                Intent w = photoVideoAttachActivity.v.w();
                w.putExtra("FROM_MULTISELECT_MODE_KEY", true);
                View view = photoVideoAttachActivity.Q;
                if (view instanceof GalleryPickerPreview) {
                    w.putExtra("PREVIEW_STATE", ((GalleryPickerPreview) view).getState());
                }
                photoVideoAttachActivity.V2(w);
                return s3q0.a;
            case 19:
                cqc0 cqc0Var = (cqc0) obj;
                ProfileFriendsFragment.a aVar3 = new ProfileFriendsFragment.a(new FriendsListParams.FriendsListsWithFriends((List) obj2), FriendsListPrivacyType.CLIP, cqc0Var.p, cqc0Var.q, false, 36);
                Context context2 = cqc0Var.e;
                Intent n = aVar3.n(context2);
                Activity h = e3m.h(context2);
                if (h != null) {
                    h.startActivityForResult(n, 24);
                }
                return s3q0.a;
            case 20:
                xwk.d().e().a((Activity) obj2, ((com.vk.qrcode.c) obj).r());
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_CLIP);
                return s3q0.a;
            case 21:
                df90 df90Var = (df90) obj;
                HorizontalRecyclerPaginationView a4 = ((znj0) obj2).h().a();
                if (a4 != null) {
                    a4.w(df90Var);
                }
                return s3q0.a;
            case 22:
                b3q0 b3q0Var = (b3q0) obj2;
                b3q0Var.d = b3q0.b.UNDO_HIDE_ENABLED;
                b3q0Var.b((b3q0.a) obj);
                return s3q0.a;
            case 23:
                lambda$isValidSmsCode$7 = ((VerificationController) obj2).lambda$isValidSmsCode$7((CharSequence) obj);
                return lambda$isValidSmsCode$7;
            case 24:
                return Boolean.valueOf(((Number) ((wh50) obj2).getValue()).intValue() > ((rg50) obj).getIntValue());
            case 25:
                ((izs) obj2).invoke((buv0) obj);
                return s3q0.a;
            default:
                ((flv0.a) obj2).a((HideReason) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ ss3(nek0 nek0Var, izs izsVar) {
        this.b = 4;
        this.d = nek0Var;
        this.c = izsVar;
    }
}
