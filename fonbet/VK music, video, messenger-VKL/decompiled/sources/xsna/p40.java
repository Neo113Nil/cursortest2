package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.soloader.MinElf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.articles.ArticleFragment;
import com.vk.audio.AudioMessageSource;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.channels.api.Channel;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.fragments.ImChatSettingsFragment;
import com.vk.media.pipeline.codec.CodecDrainer;
import com.vk.metrics.eventtracking.Event;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.stickers.ContextUser;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import com.vk.voip.ui.call_effects.beauty.ui.BeautyVideoFragment;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.du;
import xsna.emc;
import xsna.ew6;
import xsna.fmc0;
import xsna.fzw0;
import xsna.ikv0;
import xsna.is5;
import xsna.n7b;
import xsna.o0r0;
import xsna.o34;
import xsna.qbe;
import xsna.qv4;
import xsna.sza;
import xsna.uv4;
import xsna.vu4;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class p40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.vk.dto.common.Attachment] */
    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.o34$a] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        Attach attach;
        ?? b;
        Uri fromFile;
        int i = this.b;
        int i2 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                LikesDeleteResponseDto likesDeleteResponseDto = (LikesDeleteResponseDto) obj;
                return new du.b((x60) obj3, r40.b(likesDeleteResponseDto.d(), likesDeleteResponseDto.l1(), false));
            case 1:
                xk0 xk0Var = (xk0) obj3;
                izs<String, s3q0> izsVar = xk0Var.l;
                wk0 wk0Var = xk0Var.n;
                izsVar.invoke((wk0Var != null ? wk0Var : null).b);
                return s3q0.a;
            case 2:
                hp0 hp0Var = (hp0) obj3;
                new dfy(hp0Var.a, new dp0(i2, hp0Var, (Throwable) obj));
                hp0Var.f.cancel();
                return s3q0.a;
            case 3:
                gzs gzsVar = (gzs) obj;
                View view = ((uc2) obj3).a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    gzsVar.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new sc2(gzsVar, i2));
                    }
                }
                return s3q0.a;
            case 4:
                ArticleFragment articleFragment = (ArticleFragment) obj3;
                int i3 = ArticleFragment.E0;
                Owner oo = articleFragment.oo();
                if (oo != null) {
                    xwk.e().m(articleFragment.kn(), oo.b, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                }
                return s3q0.a;
            case 5:
                vu4 vu4Var = (vu4) obj3;
                uv4.b bVar = (uv4.b) obj;
                vu4.a aVar = vu4Var.l;
                av4 av4Var = vu4Var.D;
                vu4Var.E.b("onRecordSucceed");
                boolean z = bVar.h;
                long j = bVar.e;
                File file = bVar.a;
                if (z) {
                    av4Var.a();
                    aVar.p0();
                } else {
                    AudioMessageSource audioMessageSource = bVar.g;
                    long j2 = vu4Var.n;
                    int i4 = audioMessageSource == null ? -1 : zu4.$EnumSwitchMapping$0[audioMessageSource.ordinal()];
                    String str = i4 != 1 ? i4 != 2 ? i4 != 3 ? "unknown" : "hands-free" : "raise-to-talk" : "push-to-talk";
                    el3 el3Var = Event.b;
                    Event.a aVar2 = new Event.a();
                    aVar2.g("messages_audio_message_send_way");
                    aVar2.c("source", str);
                    aVar2.b("peer_id", Long.valueOf(j2));
                    aVar2.j(thp0.c);
                    com.vk.metrics.eventtracking.b.a.k(aVar2.e());
                    AttachAudioMsg attachAudioMsg = new AttachAudioMsg();
                    attachAudioMsg.j = Uri.fromFile(file).toString();
                    long j3 = 1000;
                    attachAudioMsg.C0((int) (j / j3));
                    attachAudioMsg.g = bVar.f;
                    Uri fromFile2 = Uri.fromFile(file);
                    if (j < 1000) {
                        j = 1000;
                    }
                    av4Var.a.onNext(new qv4.b(fromFile2, bVar.f, j / j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false));
                    if (bVar.c) {
                        vu4Var.a1(attachAudioMsg, bVar.d);
                    } else {
                        aVar.r1(attachAudioMsg);
                    }
                }
                return s3q0.a;
            case 6:
                ((dz4) obj3).a((CodecDrainer) obj);
                return s3q0.a;
            case 7:
                ((fh5) obj3).R0();
                return s3q0.a;
            case 8:
                AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = (AutoSuggestStickersPopupWindow) obj3;
                List list = (List) obj;
                ContextUser e = autoSuggestStickersPopupWindow.e.e();
                autoSuggestStickersPopupWindow.q = e;
                if (e != null) {
                    e.e = list;
                }
                autoSuggestStickersPopupWindow.C().b.setContextUser(autoSuggestStickersPopupWindow.q);
                return s3q0.a;
            case 9:
                ((zak0) ((is5) obj3).l).setValue((is5.c) obj);
                return s3q0.a;
            case 10:
                VerificationMethodTypes verificationMethodTypes = (VerificationMethodTypes) obj;
                Object obj4 = ((wa6) obj3).o;
                ((p0c) (obj4 != null ? obj4 : null)).b(verificationMethodTypes);
                return s3q0.a;
            case 11:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj3;
                Photo photo = (Photo) obj;
                int i5 = BasePhotoListFragment.l0;
                List<ucv0> y0 = basePhotoListFragment.lo().y0();
                ArrayList arrayList = new ArrayList(c5g.u(y0, 10));
                ArrayList arrayList2 = (ArrayList) y0;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ucv0) it.next()).a);
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(y0, 10));
                Iterator it2 = arrayList2.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        e43.t();
                        throw null;
                    }
                    ucv0 ucv0Var = (ucv0) next;
                    arrayList3.add(ucv0Var.b ? new Pair(Integer.valueOf(i6), ucv0Var.a) : null);
                    i6 = i7;
                }
                int indexOf = arrayList.indexOf(photo);
                if (indexOf >= 0) {
                    efc0 mo = basePhotoListFragment.mo();
                    if (mo != null) {
                        mo.j0(new fmc0.i.b(basePhotoListFragment.k9(indexOf)));
                    }
                    efc0 mo2 = basePhotoListFragment.mo();
                    if (mo2 != null) {
                        mo2.C(new PostingAction.Navigation.OpenVkPhotoViewer(photo, indexOf, arrayList, j5g.V(arrayList3)));
                    }
                }
                return s3q0.a;
            case 12:
                int i8 = us6.p1;
                xn50.a.c((us6) obj3, new fzw0.a((set0) obj));
                return s3q0.a;
            case 13:
                BeautyVideoFragment beautyVideoFragment = (BeautyVideoFragment) obj3;
                int i9 = BeautyVideoFragment.S;
                if (epx.f((ew6) obj, ew6.a.a)) {
                    beautyVideoFragment.tn();
                }
                return s3q0.a;
            case 14:
                return new xk7((ViewGroup) obj, (BonusCatalogFragment) obj3);
            case 15:
                ((izs) ((zak0) ((vo7) obj3).b).getValue()).invoke(new a.f.d((String) obj));
                return s3q0.a;
            case 16:
                return new s68((ViewGroup) obj, ((com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.a) obj3).h);
            case 17:
                it80 it80Var = (it80) obj;
                hi8 hi8Var = ((BroadcastScheduledFragment) obj3).P;
                if (hi8Var != null) {
                    ji8 ji8Var = (ji8) it80Var.a;
                    hi8Var.a();
                    hi8Var.e = ji8Var.a;
                    hi8Var.b();
                }
                return s3q0.a;
            case 18:
                kua kuaVar = (kua) obj3;
                b180 b180Var = (b180) obj;
                Attach attach2 = b180Var.b;
                ftx0 ftx0Var = attach2 instanceof ftx0 ? (ftx0) attach2 : null;
                File i1 = ftx0Var != null ? ftx0Var.i1() : null;
                Iterator it3 = kuaVar.a().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (epx.f(Uri.parse(((ju90) obj2).getUri()).getPath(), i1 != null ? i1.getPath() : null)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ju90 ju90Var = (ju90) obj2;
                if (ju90Var != null && (b180Var instanceof a180) && (b = wdw.b((attach = ((a180) b180Var).b), null, false, 6)) != 0) {
                    if ((b instanceof x74) && (ju90Var instanceof x74)) {
                        x74 x74Var = (x74) b;
                        x74 x74Var2 = (x74) ju90Var;
                        x74Var.i5(x74Var2.B1());
                        x74Var.A9(x74Var2.o1());
                    }
                    Iterator<o34.a> it4 = kuaVar.b.iterator();
                    while (it4.hasNext()) {
                        it4.next().c(ju90Var, b);
                    }
                    boolean z2 = attach instanceof AttachImage;
                    AttachImage attachImage = z2 ? (AttachImage) attach : null;
                    File file2 = attachImage != null ? attachImage.l : null;
                    String uri = (file2 == null || (fromFile = Uri.fromFile(file2)) == null) ? null : fromFile.toString();
                    if (uri != null) {
                        AttachImage attachImage2 = z2 ? (AttachImage) attach : null;
                        kuaVar.d.a(uri).a(new nt8(attachImage2 != null ? Long.valueOf(attachImage2.e) : null));
                    }
                }
                return s3q0.a;
            case 19:
                ((com.vk.im.channelcreation.impl.h) obj3).O(g.b.b);
                return s3q0.a;
            case 20:
                sza szaVar = (sza) obj3;
                Channel channel = (Channel) obj;
                if (channel.z != ChannelType.COMMUNITY_CHANNEL) {
                    return io.reactivex.rxjava3.core.q.T(new sza.a.b(channel.J));
                }
                io.reactivex.rxjava3.subjects.d a = szaVar.a.b.a();
                a.getClass();
                int i10 = 5;
                return new io.reactivex.rxjava3.internal.operators.observable.y(a, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new m40(new oj(i10), i10));
            case 21:
                ((ikv0) obj).a();
                ((a8b) obj3).c.invoke(n7b.h.b);
                return s3q0.a;
            case 22:
                ((i9b) obj3).p();
                return s3q0.a;
            case 23:
                ((orb) obj3).a.b();
                return s3q0.a;
            case 24:
                DialogExt dialogExt = (DialogExt) obj;
                ImChatSettingsFragment.a aVar3 = ((xyb) obj3).B;
                if (aVar3 != null) {
                    ImChatSettingsFragment imChatSettingsFragment = ImChatSettingsFragment.this;
                    o0w.x(imChatSettingsFragment.O.b(), imChatSettingsFragment.kn(), null, dialogExt.e, dialogExt, null, null, false, null, null, null, null, null, null, "create_conversation", null, null, null, false, null, null, null, null, null, 1073733618);
                }
                return s3q0.a;
            case 25:
                sgc sgcVar = (sgc) obj3;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = sgcVar.l1;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                sgcVar.l1 = cVar;
                return s3q0.a;
            case 26:
                return new emc.g((emc) obj3, (ViewGroup) obj);
            case 27:
                return o1d.H((o1d) obj3, (t1d) obj);
            case 28:
                io.reactivex.rxjava3.schedulers.b bVar2 = (io.reactivex.rxjava3.schedulers.b) obj;
                a1e a1eVar = ((com.vk.clips.editor.voiceover.impl.a) obj3).l;
                if (!(a1eVar == null ? null : a1eVar).a) {
                    (a1eVar != null ? a1eVar : null).getClass();
                }
                return io.reactivex.rxjava3.core.q.T(bVar2);
            default:
                com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b bVar3 = (com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) obj3;
                qbe qbeVar = (qbe) obj;
                if (qbeVar instanceof qbe.a) {
                    afj0 callback = bVar3.h.getCallback();
                    qbe.a aVar4 = (qbe.a) qbeVar;
                    kih0 kih0Var = aVar4.a;
                    int i11 = aVar4.b;
                    callback.getClass();
                    ClipsRouter.c(callback.a.x().a(), bVar3.g(), Collections.singletonList(new ClipFeedTab.ClipsFromShopsSource.WithVideo(kih0Var.A(), ClipFeedTab.ClipsFromShopsSource.SourceType.SHOPS_GRID_BLOCK)), new wej0(kih0Var, i11, bVar3), null, null, null, null, false, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                } else {
                    if (!(qbeVar instanceof qbe.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context = bVar3.getContentView().getContext();
                    ikv0.a aVar5 = new ikv0.a(bVar3.getContentView().getContext());
                    aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                    aVar5.u = new ikv0.d(context.getString(R.string.clips_grid_block_default_error_text), (String) null, (ikv0.d.a) null, 6);
                    aVar5.n();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ p40(x60 x60Var, r40 r40Var) {
        this.b = 0;
        this.c = x60Var;
    }
}
