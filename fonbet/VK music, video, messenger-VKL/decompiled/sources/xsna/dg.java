package xsna;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.channels.api.Channel;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.clips.favorites.impl.ui.folders.renaming.b;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.users.User;
import com.vk.newsfeed.impl.fragments.BaseCommentsFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.bre;
import xsna.dob;
import xsna.ea6;
import xsna.end;
import xsna.h7u0;
import xsna.hnd;
import xsna.me8;
import xsna.ore;
import xsna.wub;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class dg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 4;
        int i3 = 3;
        int i4 = 5;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Collection) obj2).contains(obj));
            case 1:
                return com.vk.clips.sdk.shared.item.ads.c.t((com.vk.clips.sdk.shared.item.ads.c) obj2, ((Boolean) obj).booleanValue());
            case 2:
                ((gg1) obj2).q = true;
                return s3q0.a;
            case 3:
                PhotoAlbum photoAlbum = (PhotoAlbum) obj2;
                PhotoAlbum photoAlbum2 = (PhotoAlbum) obj;
                return Boolean.valueOf(photoAlbum2.b == photoAlbum.b && epx.f(photoAlbum2.c, photoAlbum.c));
            case 4:
                int i5 = ArticleAuthorPageFragment.f0;
                ((ArticleAuthorPageFragment) obj2).no();
                return s3q0.a;
            case 5:
                List<nck0> list = (List) obj;
                Iterator it = ((tx4) obj2).c.iterator();
                while (it.hasNext()) {
                    ((lck0) it.next()).n(list);
                }
                return s3q0.a;
            case 6:
                ((Ref$BooleanRef) obj2).element = ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 7:
                ((u440) obj2).Q = k86.v7(((Integer) obj).intValue());
                return s3q0.a;
            case 8:
                ea6.b bVar = (ea6.b) obj2;
                e1b e1bVar = bVar.c;
                ea6.d dVar = (ea6.d) obj;
                if (epx.f(dVar, ea6.d.a.a)) {
                    e1bVar.h(bVar.b);
                } else if (dVar instanceof ea6.d.b) {
                    e1bVar.i(((ea6.d.b) dVar).a);
                } else {
                    if (!(dVar instanceof ea6.d.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e1bVar.e(((ea6.d.c) dVar).a);
                }
                return s3q0.a;
            case 9:
                int i6 = BaseCommentsFragment.l0;
                ((BaseCommentsFragment) obj2).s();
                return s3q0.a;
            case 10:
                ke8 ke8Var = (ke8) obj2;
                me8 me8Var = (me8) obj;
                bwt0.p0(ke8Var.g, me8Var instanceof me8.c);
                bwt0.p0(ke8Var.h, me8Var instanceof me8.b);
                bwt0.p0(ke8Var.j, me8Var instanceof me8.a);
                return s3q0.a;
            case 11:
                sg8 sg8Var = (sg8) obj2;
                io.reactivex.rxjava3.disposables.b bVar2 = sg8Var.f;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ViewGroup viewGroup = sg8Var.a;
                ViewParent parent = viewGroup.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 == null) {
                    viewGroup2 = viewGroup;
                }
                biq biqVar = new biq();
                biqVar.addTarget(viewGroup);
                zmp0.a(viewGroup2, biqVar);
                bwt0.p0(viewGroup, booleanValue);
                sg8Var.c.invoke(bool);
                if (booleanValue) {
                    xg8 xg8Var = new xg8(viewGroup.getContext());
                    sg8Var.d = xg8Var;
                    viewGroup.addView(xg8Var.a);
                    bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.i0(sg8Var.b.c().a0(asu0.a.d()).U(new p7(new gt(sg8Var), i4)), new tt0(new jt(6), i3)).subscribe(new sf(new com.vk.movika.sdk.base.logic.interactor.p(sg8Var, 10), 8)));
                    xg8 xg8Var2 = sg8Var.d;
                    if (!xg8Var2.k) {
                        throw new IllegalStateException("Instance is destroyed");
                    }
                    io.reactivex.rxjava3.internal.operators.observable.j1 U = xg8Var2.i.U(new pa(new ay0(sg8Var, 11), i2));
                    int i7 = 7;
                    bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.i0(U, new j7(new qt0(i7), i7)).subscribe(new b60(new gr3(sg8Var, i4), i7)));
                } else {
                    bVar2.e();
                    xg8 xg8Var3 = sg8Var.d;
                    if (xg8Var3 != null) {
                        xg8Var3.k = false;
                    }
                    sg8Var.d = null;
                    bwt0.p0(viewGroup, false);
                    viewGroup.removeAllViews();
                }
                return s3q0.a;
            case 12:
                hda hdaVar = (hda) obj;
                ListIterator listIterator = ((r9a) obj2).a.listIterator(0);
                while (true) {
                    ListBuilder.a aVar = (ListBuilder.a) listIterator;
                    if (!aVar.hasNext()) {
                        return hdaVar;
                    }
                    hdaVar = ((ida) aVar.next()).a(hdaVar);
                }
            case 13:
                wxa wxaVar = (wxa) obj2;
                Pair pair = (Pair) obj;
                DonutGroupSettingsDto donutGroupSettingsDto = (DonutGroupSettingsDto) pair.d();
                Boolean bool2 = (Boolean) pair.g();
                Channel b = wxaVar.a.b();
                if (b != null) {
                    a1w a1wVar = wxaVar.d;
                    Long valueOf = Long.valueOf(b.b);
                    boolean l = donutGroupSettingsDto.l();
                    Boolean f = donutGroupSettingsDto.f();
                    a1wVar.x(new r280(null, new wpp(on00.f(new Pair(valueOf, new Channel(b.b, b.c, b.d, b.e, b.f, b.g, b.h, b.i, b.j, b.k, b.l, b.m, b.n, b.o, b.p, b.q, b.r, b.s, b.t, b.u, b.v, b.w, b.x, b.y, b.z, b.A, b.B, b.C, b.D, l, b.F, b.G, b.H, b.I, b.J, b.K, f != null ? f.booleanValue() : false, bool2.booleanValue(), b.N, b.O))))));
                }
                return s3q0.a;
            case 14:
                com.vk.channels.impl.channel_screen.send_msg.a aVar2 = (com.vk.channels.impl.channel_screen.send_msg.a) obj2;
                Channel channel = (Channel) obj;
                Boolean bool3 = channel.H;
                aVar2.p = ChannelMsgSendConfig.a(aVar2.p, null, false, bool3 != null ? bool3.booleanValue() : true, false, false, null, null, null, null, false, false, false, false, null, 32763);
                aVar2.h = channel.E;
                Peer peer = channel.A;
                if (channel.z != ChannelType.COMMUNITY_CHANNEL) {
                    peer = null;
                }
                aVar2.O = peer != null ? Long.valueOf(peer.d) : null;
                WriteBar writeBar = aVar2.x;
                if (writeBar != null) {
                    writeBar.setCanPostDonut(aVar2.h);
                    WriteBar writeBar2 = aVar2.x;
                    (writeBar2 != null ? writeBar2 : null).setGroupId(aVar2.O);
                }
                return s3q0.a;
            case 15:
                ynb ynbVar = (ynb) obj2;
                dob.h hVar = (dob.h) obj;
                DialogExt dialogExt = hVar.a;
                View view = ynbVar.r;
                if (view != null) {
                    Dialog Cb = dialogExt.Cb();
                    String str = "";
                    if (Cb != null) {
                        if (Cb.t1()) {
                            qtd0 Cb2 = dialogExt.b.Cb(Cb.Sb());
                            User user = Cb2 instanceof User ? (User) Cb2 : null;
                            String str2 = user != null ? user.u : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (str2.length() > 0) {
                                str = view.getContext().getString(R.string.im_chat_clips_writebar_reply_to_user_chat_accessibility, str2);
                            }
                        } else if (Cb.uc()) {
                            str = view.getContext().getString(R.string.im_chat_clips_writebar_reply_to_user_chat_accessibility, dialogExt.getTitle());
                        } else if (Cb.Va()) {
                            str = view.getContext().getString(R.string.im_chat_clips_writebar_reply_to_group_accessibility, dialogExt.getTitle());
                        }
                    }
                    view.setContentDescription(str);
                }
                if (hVar.b) {
                    oob oobVar = ynbVar.l;
                    if (oobVar != null) {
                        oobVar.u(dialogExt);
                    }
                    d3m.c(ynbVar, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    d3m.e(ynbVar, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new hc3(i4, ynbVar, hVar), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
                return s3q0.a;
            case 16:
                isb Y0 = ((bsb) obj2).Y0();
                View view2 = Y0.f;
                if (view2 == null) {
                    view2 = null;
                }
                view2.setVisibility(4);
                View view3 = Y0.g;
                (view3 != null ? view3 : null).setVisibility(0);
                return s3q0.a;
            case 17:
                ((wub.a) obj2).q.e(null);
                return s3q0.a;
            case 18:
                ((mbc) obj2).dismiss();
                kbc.a.a((Country) obj);
                return s3q0.a;
            case 19:
                Throwable th = (Throwable) obj;
                VideoFile A = k15.A(((nlh0) obj2).k());
                ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
                if (clipVideoFile != null) {
                    axc.a(clipVideoFile);
                }
                j03.l(th);
                return s3q0.a;
            case 20:
                nad nadVar = (nad) obj2;
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
                if (vKApiExecutionException != null) {
                    j03.i(nadVar.c, vKApiExecutionException);
                } else {
                    cvk.u(R.string.error, false);
                }
                return s3q0.a;
            case 21:
                ((ClipSearchRootVh) obj2).u.b();
                return s3q0.a;
            case 22:
                wmd wmdVar = (wmd) obj2;
                ?? r2 = wmdVar.j1;
                end endVar = (end) obj;
                qcy<Object>[] qcyVarArr = wmd.l1;
                if (endVar.equals(end.c.a)) {
                    ((ind) wmdVar.k1.getValue()).c(hnd.c.a, ((ClipsCoauthorsSelectorInputParams) r2.getValue()).b);
                } else if (endVar instanceof end.b) {
                    wmdVar.getParentFragmentManager().k0(yfb.b(new Pair(((ClipsCoauthorsSelectorInputParams) r2.getValue()).e, p4g.q(((end.b) endVar).a))), ((ClipsCoauthorsSelectorInputParams) r2.getValue()).d);
                    wmdVar.hide();
                } else {
                    if (!endVar.equals(end.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wmdVar.hide();
                }
                return s3q0.a;
            case 23:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                b.C0616b c0616b = ((com.vk.clips.favorites.impl.ui.folders.renaming.b) obj2).l1;
                (c0616b != null ? c0616b : null).b.setEnabled(booleanValue2);
                return s3q0.a;
            case 24:
                bre breVar = (bre) obj2;
                ore oreVar = (ore) obj;
                bre.b bVar3 = bre.s1;
                if (oreVar instanceof ore.a) {
                    breVar.bo();
                } else if (oreVar instanceof ore.b) {
                    breVar.bo();
                    ClipsPlaylist clipsPlaylist = ((ore.b) oreVar).a;
                    c63 c63Var = c63.a;
                    c63.a(new dre(breVar, clipsPlaylist));
                } else if (oreVar instanceof ore.c) {
                    breVar.fo().e().d(breVar.requireContext(), new ClipsPlaylistPickerParams.AddClips(breVar.eo().b, breVar.co()));
                } else if (oreVar instanceof ore.d) {
                    breVar.fo().e().d(breVar.requireContext(), new ClipsPlaylistPickerParams.RemoveClips(breVar.eo().b, breVar.co()));
                } else {
                    if (!(oreVar instanceof ore.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    breVar.fo().e().a(breVar.requireContext(), ((ore.e) oreVar).a, breVar.kn().getSupportFragmentManager(), null);
                    breVar.bo();
                }
                return s3q0.a;
            case 25:
                return new l1f((ViewGroup) obj, ((d1f) obj2).i);
            case 26:
                ((hjc) obj2).onClick();
                return s3q0.a;
            case 27:
                o9f o9fVar = (o9f) obj2;
                jpd.r(o9fVar.b, 1);
                kme.a("clips_cancel_timer_settings");
                o9fVar.d = 0;
                o9fVar.e = 3;
                dw20 dw20Var = o9fVar.c;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 28:
                return new wwg((ViewGroup) obj, ((tvg) obj2).i);
            default:
                c2h c2hVar = (c2h) obj2;
                VkInputSelect vkInputSelect = c2hVar.l1;
                if (vkInputSelect == null) {
                    vkInputSelect = null;
                }
                Editable text = vkInputSelect.getText();
                String obj3 = text != null ? text.toString() : null;
                if (obj3 == null || obj3.length() == 0) {
                    c2hVar.dismiss();
                } else {
                    int i8 = h7u0.p;
                    h7u0.a c = h7u0.b.c(c2hVar.requireContext());
                    c.g0(R.string.community_edit_description_exit_dialog_title);
                    c.U(R.string.community_edit_description_exit_dialog_message);
                    c.W(R.string.community_edit_description_exit_dialog_cancel, new b2h());
                    c.c0(R.string.community_edit_description_exit_dialog_close, new gj3(c2hVar, r6 ? 1 : 0));
                    c.m();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ dg(nlh0 nlh0Var, axc axcVar) {
        this.b = 19;
        this.c = nlh0Var;
    }
}
