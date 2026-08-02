package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.catalog.dto.CatalogCatalogDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.likes.LikesGetList;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryOtherVh;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.msg_list.MsgListOpenAtLatestMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.imageloader.view.VKImageView;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$SubTitleParams;
import com.vk.photos.ui.profile.ProfilePhotoTag;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.pushes.receivers.c;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.type.StartCallType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.avh0;
import xsna.dw20;
import xsna.esj;
import xsna.f0r;
import xsna.f360;
import xsna.iae0;
import xsna.ikv0;
import xsna.k9h;
import xsna.p8a0;
import xsna.w8v;
import xsna.wk50;
import xsna.wqs0;
import xsna.yoz;
import xsna.zl30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z5a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z5a(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r10.equals("main_feat") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        r6 = xsna.drm0.p0(xsna.s490.i(r11) + ' ' + xsna.s490.c(r2.s)).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (r10.equals("collection") == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v49, types: [T, com.vk.dto.common.id.UserId] */
    /* JADX WARN: Type inference failed for: r1v55, types: [T, com.vk.api.likes.LikesGetList$Type] */
    /* JADX WARN: Type inference failed for: r1v62, types: [T, com.vk.dto.common.id.UserId] */
    /* JADX WARN: Type inference failed for: r1v77, types: [T, com.vk.dto.common.id.UserId] */
    /* JADX WARN: Type inference failed for: r2v38, types: [T, com.vk.dto.common.id.UserId] */
    /* JADX WARN: Type inference failed for: r2v39, types: [T, com.vk.api.likes.LikesGetList$Type] */
    /* JADX WARN: Type inference failed for: r2v40, types: [T, com.vk.dto.newsfeed.Counters] */
    /* JADX WARN: Type inference failed for: r2v52, types: [T, com.vk.dto.common.id.UserId] */
    /* JADX WARN: Type inference failed for: r2v54, types: [T, com.vk.dto.newsfeed.Counters] */
    /* JADX WARN: Type inference failed for: r4v15, types: [T, com.vk.api.likes.LikesGetList$Type] */
    /* JADX WARN: Type inference failed for: r4v19, types: [T, com.vk.dto.common.id.UserId] */
    /* JADX WARN: Type inference failed for: r4v20, types: [T, com.vk.api.likes.LikesGetList$Type] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.util.Size, java.lang.Integer, java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        xgy xgyVar;
        k9h k9hVar;
        VideoFile videoFile;
        VideoFile videoFile2;
        boolean g0;
        View findViewById;
        String str;
        String str2;
        String obj2;
        int i = 3;
        int i2 = 6;
        int i3 = 14;
        int i4 = 1;
        r8 = null;
        k9h k9hVar2 = null;
        switch (this.b) {
            case 0:
                CatalogGetAudioSearchRequestFactory catalogGetAudioSearchRequestFactory = (CatalogGetAudioSearchRequestFactory) this.d;
                String str3 = (String) this.c;
                catalogGetAudioSearchRequestFactory.getClass();
                CatalogCatalogDto F = ((CatalogCatalogResponseObjectDto) obj).F();
                r8 = F != null ? F.e() : 0;
                if ((str3 == null || str3.length() == 0) && r8 != 0 && r8.length() != 0) {
                    catalogGetAudioSearchRequestFactory.s.b = r8;
                }
                return s3q0.a;
            case 1:
                return laa.s((laa) this.d, (String) this.c, null, null, null, (List) obj, null, null, null, null, 494);
            case 2:
                ChatClipsReplyFragment chatClipsReplyFragment = (ChatClipsReplyFragment) this.d;
                View view = (View) this.c;
                int i5 = ChatClipsReplyFragment.T;
                int i6 = ify.a;
                if (ify.e(ify.c) || ((xgyVar = chatClipsReplyFragment.go().A) != null && xgyVar.e())) {
                    chatClipsReplyFragment.S = new com.vk.movika.sdk.base.ui.i(5, chatClipsReplyFragment, view);
                    chatClipsReplyFragment.go().h(MsgSendHidePopupsReason.OTHER);
                    mhy.d(view);
                } else {
                    chatClipsReplyFragment.ho(view);
                }
                return s3q0.a;
            case 3:
                r0c r0cVar = (r0c) this.d;
                izs izsVar = (izs) this.c;
                r0cVar.P.c = false;
                izsVar.invoke(obj);
                return s3q0.a;
            case 4:
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) this.d;
                ClipsPlaylistPickerFragment.a aVar = (ClipsPlaylistPickerFragment.a) this.c;
                int i7 = ClipsPlaylistPickerFragment.V;
                clipsPlaylistPickerFragment.fo((f.d) obj, aVar);
                return s3q0.a;
            case 5:
                CommunityProfileState.b bVar = (CommunityProfileState.b) this.d;
                CommunityProfileState communityProfileState = (CommunityProfileState) this.c;
                kn00 kn00Var = (kn00) obj;
                if (bVar.equals(CommunityProfileState.b.a.a)) {
                    k9hVar2 = k9h.a.a;
                } else if (bVar instanceof CommunityProfileState.b.C1623b) {
                    k9h k9hVar3 = k9h.b.a;
                    if (((CommunityProfileState.b.C1623b) bVar).a) {
                        k9hVar = k9hVar3;
                        return kn00.a(kn00Var, null, null, k9hVar, 0, null, null, communityProfileState.x, 1783);
                    }
                } else if (bVar instanceof CommunityProfileState.b.d) {
                    k9hVar2 = new k9h.c(((CommunityProfileState.b.d) bVar).a);
                } else if (!bVar.equals(CommunityProfileState.b.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                k9hVar = k9hVar2;
                return kn00.a(kn00Var, null, null, k9hVar, 0, null, null, communityProfileState.x, 1783);
            case 6:
                nek0 nek0Var = (nek0) this.d;
                vvr vvrVar = (vvr) this.c;
                if (nek0Var != null) {
                    nek0Var.hide();
                }
                vvrVar.y(false);
                return s3q0.a;
            case 7:
                ((m900) ((wak) this.d).c).put((String) this.c, (gcp) obj);
                return s3q0.a;
            case 8:
                gtm gtmVar = (gtm) this.d;
                psm psmVar = (psm) this.c;
                oum oumVar = (oum) obj;
                Collection h = oumVar.c.isEmpty() ? gtmVar.a.Nb().h() : gtmVar.b;
                DialogsHistory dialogsHistory = oumVar.b;
                SetBuilder setBuilder = new SetBuilder();
                Iterator<Dialog> it = dialogsHistory.iterator();
                while (it.hasNext()) {
                    Dialog next = it.next();
                    Msg msg = dialogsHistory.s().get(next.Sb());
                    SetBuilder setBuilder2 = new SetBuilder();
                    setBuilder2.addAll(ijm.a(next).h());
                    if (msg != null) {
                        setBuilder2.addAll(lv30.a(msg).h());
                    }
                    if (p4g.b(h, setBuilder2.d())) {
                        setBuilder.add(next.Sb());
                    }
                }
                return psmVar.w(oum.a(oumVar, null, null, gtmVar.a, null, null, null, null, null, null, null, null, null, 4091), setBuilder.d());
            case 9:
                f0r.k((f0r.c) this.d, (wk50.a) this.c, (qih0) obj, null, null, 6);
                return s3q0.a;
            case 10:
                evs evsVar = (evs) this.d;
                izs izsVar2 = (izs) this.c;
                View view2 = (View) obj;
                evsVar.K.a();
                evsVar.M();
                if (evsVar.l.a.a) {
                    evsVar.E.o.postDelayed(evsVar.N, 3000L);
                }
                izsVar2.invoke(view2);
                return s3q0.a;
            case 11:
                Bundle bundle = (Bundle) this.d;
                tst tstVar = (tst) this.c;
                NewsEntry newsEntry = (NewsEntry) obj;
                Ref$LongRef ref$LongRef = new Ref$LongRef();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r1 = UserId.d;
                ref$ObjectRef.element = r1;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ?? r4 = LikesGetList.Type.POST;
                ref$ObjectRef2.element = r4;
                Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                if (newsEntry instanceof Post) {
                    Post post = (Post) newsEntry;
                    ref$LongRef.element = post.n;
                    ref$ObjectRef.element = post.m;
                    T t = r4;
                    if (post.dc()) {
                        t = LikesGetList.Type.POST_ADS;
                    }
                    ref$ObjectRef2.element = t;
                    ref$ObjectRef3.element = post.E;
                    ref$ObjectRef4.element = post.o.b;
                } else if (newsEntry instanceof PromoPost) {
                    Post post2 = ((PromoPost) newsEntry).n;
                    ref$LongRef.element = post2.n;
                    ref$ObjectRef.element = post2.m;
                    ref$ObjectRef2.element = LikesGetList.Type.POST_ADS;
                    ref$ObjectRef3.element = post2.E;
                    ref$ObjectRef4.element = post2.o.b;
                } else {
                    if (newsEntry instanceof Photos) {
                        Photos photos = (Photos) newsEntry;
                        PhotoAttachment Mb = photos.Mb();
                        Photo photo = Mb != null ? Mb.l : null;
                        ref$LongRef.element = photo != null ? photo.c : 0L;
                        T t2 = r1;
                        if (photo != null) {
                            UserId userId = photo.e;
                            t2 = r1;
                            if (userId != null) {
                                t2 = userId;
                            }
                        }
                        ref$ObjectRef.element = t2;
                        ref$ObjectRef2.element = LikesGetList.Type.PHOTO;
                        Owner owner = photos.o;
                        ref$ObjectRef4.element = owner != null ? owner.b : 0;
                    } else if (newsEntry instanceof Videos) {
                        Videos videos = (Videos) newsEntry;
                        VideoAttachment Nb = videos.Nb();
                        if (Nb != null && (videoFile2 = Nb.k) != null) {
                            r5 = videoFile2.o0();
                        }
                        ref$LongRef.element = r5;
                        ref$ObjectRef.element = k9q0.o(newsEntry);
                        ref$ObjectRef2.element = LikesGetList.Type.VIDEO;
                        VideoAttachment Nb2 = videos.Nb();
                        ref$ObjectRef3.element = (Nb2 == null || (videoFile = Nb2.k) == null) ? 0 : videoFile.H();
                        Owner owner2 = videos.m;
                        ref$ObjectRef4.element = owner2 != null ? owner2.b : 0;
                        String str4 = videos.v.b;
                        if (str4 == null || str4.length() == 0) {
                            videos.v.b = bundle.getString("track_code");
                        }
                    }
                }
                UserId userId2 = (UserId) ref$ObjectRef.element;
                tstVar.getClass();
                UserId c = o25.a().c();
                if (fkq0.d(userId2)) {
                    g0 = epx.f(c, userId2);
                } else {
                    t6g0 t6g0Var = t6g0.b;
                    g0 = t6g0.b().g0(userId2);
                }
                boolean z = g0;
                ttt tttVar = tstVar.b;
                long j = ref$LongRef.element;
                UserId userId3 = (UserId) ref$ObjectRef.element;
                LikesGetList.Type type = (LikesGetList.Type) ref$ObjectRef2.element;
                tttVar.getClass();
                List<String> list = utt.a;
                rsg0 a = utt.a(type, null, userId3, j, 0, null, false, o25.a().b(), 0, z, 0);
                if (!o25.a().b()) {
                    a.d = true;
                    a.c = true;
                }
                return rsg0.W(a, 7).l(new e05(new sst(newsEntry, ref$LongRef, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3, ref$ObjectRef4), 26));
            case 12:
                ((com.vk.attachpicker.stat.data.a) this.d).b.g((hyg0) obj, (ArrayList) this.c);
                return s3q0.a;
            case 13:
                ((l7v) this.d).w(((Hint) this.c).getId(), true);
                return s3q0.a;
            case 14:
                ((brw) this.d).d((InAppReviewConditionKey) this.c, ((hgg0) obj).a);
                return s3q0.a;
            case 15:
                Context context = (Context) this.d;
                hfx hfxVar = (hfx) this.c;
                vbs vbsVar = (vbs) obj;
                Image image = hfxVar.a;
                n3n0 n3n0Var = new n3n0(context, image, hfxVar.b, new no3(hfxVar, i));
                ViewGroup viewGroup = n3n0Var.d;
                lpj lpjVar = n3n0Var.c;
                if (n3n0Var.g == null) {
                    jjc.g(n3n0Var.e, new rtg0(n3n0Var, i2));
                    VKImageView vKImageView = n3n0Var.f;
                    ImageSize Cb = image.Cb(ix3.c, false, false);
                    vKImageView.load(Cb != null ? Cb.d.d : null);
                    int m = krv0.m(R.attr.vk_ui_background_modal, lpjVar);
                    Activity h2 = e3m.h(lpjVar);
                    n3n0Var.h = h2 != null ? rdi.p(h2, new z4d0(n3n0Var, 16)) : null;
                    n3n0Var.g = new dw20.b(lpjVar, null).D0(viewGroup, false).x(0).u(0).l(m).S(m).d0(new tfm0(n3n0Var, i4)).X(new ye80(n3n0Var, 25)).a0(new akd0(n3n0Var, 12)).c(new jgj(viewGroup, 0, 0, 46)).H0(vbsVar.a, "SuggestStartInterestsDialog");
                }
                return s3q0.a;
            case 16:
                bhy bhyVar = (bhy) this.d;
                chy chyVar = (chy) this.c;
                y4l0 y4l0Var = bhyVar.l;
                if (y4l0Var != null) {
                    y4l0Var.e(chyVar.d, chyVar.f, chyVar.c, chyVar.g);
                }
                return s3q0.a;
            case 17:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new yoz.b((eea) this.d, (String) this.c, null), 3));
            case 18:
                com.vk.im.ui.components.msg_list.c cVar = (com.vk.im.ui.components.msg_list.c) this.d;
                final w8v w8vVar = (w8v) this.c;
                final xl30 xl30Var = (xl30) obj;
                final zl30 zl30Var = cVar.o;
                final Dialog f = cVar.f();
                if (f == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                final ProfilesInfo h3 = cVar.h();
                zl30Var.getClass();
                return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.yl30
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0180  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        int i8;
                        boolean z2;
                        boolean z3;
                        MsgListOpenMode msgListOpenMode;
                        MsgListOpenMode msgListOpenAtMsgMode;
                        zl30 zl30Var2 = zl30.this;
                        ProfilesInfo profilesInfo = h3;
                        Dialog dialog = f;
                        xl30 xl30Var2 = xl30Var;
                        w8v w8vVar2 = w8vVar;
                        zl30Var2.d.F(profilesInfo);
                        zl30Var2.d.v(zl30Var2.a.e.a());
                        zl30Var2.a(dialog);
                        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list2 = xl30Var2.c;
                        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list3 = list2 == null ? EmptyList.b : list2;
                        boolean z4 = w8vVar2 instanceof w8v.b;
                        if (z4) {
                            if (list2 == null || list2.isEmpty() || (i8 = xl30Var2.a) == 0) {
                                i8 = dialog.fc();
                            }
                        } else if (!(w8vVar2 instanceof w8v.g)) {
                            i8 = xl30Var2.a;
                        } else if (!((w8v.g) w8vVar2).c || xl30Var2.a >= 0) {
                            i8 = xl30Var2.a;
                        } else {
                            Iterator<Msg> it2 = w8vVar2.b.iterator();
                            Msg msg2 = null;
                            while (it2.hasNext()) {
                                Msg next2 = it2.next();
                                Msg msg3 = next2;
                                if (msg3.d > 0 && msg3.i) {
                                    msg2 = next2;
                                }
                            }
                            Msg msg4 = msg2;
                            i8 = msg4 != null ? msg4.d : -1;
                        }
                        int i9 = i8;
                        tk30 tk30Var = zl30Var2.d;
                        boolean z5 = w8vVar2 instanceof w8v.a;
                        if (z5) {
                            w8v.a aVar2 = (w8v.a) w8vVar2;
                            int i10 = zl30.a.$EnumSwitchMapping$0[aVar2.d.ordinal()];
                            if (i10 == 1) {
                                list3 = zl30Var2.d.h(list3, aVar2.c.k(), w8vVar2.b.e, aVar2.c.c, i9);
                            } else {
                                if (i10 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                list3 = zl30Var2.d.c(list3, aVar2.c.k(), w8vVar2.b.e, aVar2.c.c, i9);
                            }
                        } else if (w8vVar2 instanceof w8v.e) {
                            w8v.e eVar = (w8v.e) w8vVar2;
                            if (eVar.c) {
                                List<Msg> list4 = eVar.d;
                                gj30 gj30Var = w8vVar2.b;
                                list3 = tk30Var.c(list3, list4, gj30Var.e, gj30Var.c, i9);
                            } else {
                                list3 = tk30Var.e(w8vVar2.b, i9);
                            }
                        } else if (w8vVar2 instanceof w8v.d) {
                            list3 = tk30Var.I(list3);
                        } else if (w8vVar2 instanceof w8v.c) {
                            tk30Var.F(profilesInfo);
                            if (list3.isEmpty()) {
                                tk30Var.e = false;
                            } else {
                                ArrayList arrayList = new ArrayList(list3);
                                ListIterator listIterator = arrayList.listIterator();
                                while (listIterator.hasNext()) {
                                    int nextIndex = listIterator.nextIndex();
                                    arrayList.set(nextIndex, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).s(profilesInfo, tk30Var.d));
                                    listIterator.next();
                                }
                                tk30Var.e = false;
                                list3 = arrayList;
                            }
                        } else {
                            list3 = tk30Var.e(w8vVar2.b, i9);
                        }
                        if (z4) {
                            zl30Var2.e = dialog.Vb() ? 0 : i9;
                            de deVar = ((w8v.b) w8vVar2).c;
                            if (deVar instanceof uj30) {
                                msgListOpenAtMsgMode = MsgListOpenAtLatestMode.b;
                            } else if (deVar instanceof sj30) {
                                msgListOpenAtMsgMode = MsgListOpenAtUnreadMode.b;
                            } else {
                                if (!(deVar instanceof rj30)) {
                                    msgListOpenMode = null;
                                    return xl30.a(xl30Var2, i9, 0, list3, msgListOpenMode, msgListOpenMode == null, false, null, 2);
                                }
                                rj30 rj30Var = (rj30) deVar;
                                msgListOpenAtMsgMode = new MsgListOpenAtMsgMode(rj30Var.b, rj30Var.c);
                            }
                            msgListOpenMode = msgListOpenAtMsgMode;
                            return xl30.a(xl30Var2, i9, 0, list3, msgListOpenMode, msgListOpenMode == null, false, null, 2);
                        }
                        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list5 = list3;
                        if (z5 || (w8vVar2 instanceof w8v.h)) {
                            return xl30.a(xl30Var2, 0, 0, list5, null, true, false, null, 3);
                        }
                        if (w8vVar2 instanceof w8v.f) {
                            return xl30.a(xl30Var2, 0, 0, list5, null, true, false, null, 3);
                        }
                        if (w8vVar2 instanceof w8v.e) {
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.d, new Object[]{"ChatScrollIssue: HistorySendMessages"});
                            }
                            return xl30.a(xl30Var2, -1, 0, list5, null, false, true, new li30(((w8v.e) w8vVar2).d), 2);
                        }
                        if (!(w8vVar2 instanceof w8v.g)) {
                            if ((w8vVar2 instanceof w8v.c) || (w8vVar2 instanceof w8v.d)) {
                                return xl30.a(xl30Var2, 0, 0, list5, null, true, false, null, 3);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        gzs<Boolean> gzsVar = ((com.vk.im.ui.components.msg_list.a) zl30Var2.c.c).w;
                        if (gzsVar != null) {
                            vm30 vm30Var = ((com.vk.im.ui.components.msg_list.a) zl30Var2.b.c).o;
                            if ((vm30Var != null ? vm30Var.o(true) : false) && ((w8v.g) w8vVar2).c && gzsVar.invoke().booleanValue()) {
                                z2 = true;
                                z3 = true;
                            } else {
                                z3 = false;
                                z2 = true;
                            }
                        } else {
                            vm30 vm30Var2 = ((com.vk.im.ui.components.msg_list.a) zl30Var2.b.c).o;
                            if (vm30Var2 != null) {
                                z2 = true;
                                z3 = vm30Var2.o(true);
                            } else {
                                z2 = true;
                                z3 = false;
                            }
                        }
                        w8v.g gVar = (w8v.g) w8vVar2;
                        boolean z6 = ((gVar.e && gVar.d) || z3) ? z2 : false;
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{zy60.c("ChatScrollIssue: HistoryUpdatedFromCache shouldScrollNew ", " shouldScrollToLatest ", z3, z6)});
                        }
                        return xl30.a(xl30Var2, i9, 0, list5, null, true, z6, new li30(w8vVar2.b.k()), 2);
                    }
                });
            case 19:
                MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = (MusicClipsSelectorCatalogRootVh) this.d;
                ppk ppkVar = (ppk) this.c;
                MusicClipsSelectorCatalogRootVh.a aVar2 = MusicClipsSelectorCatalogRootVh.J;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ppkVar.findViewById(R.id.coordinator);
                if (coordinatorLayout != null && (findViewById = coordinatorLayout.findViewById(R.id.floating_use_current_track_btn)) != null) {
                    coordinatorLayout.removeView(findViewById);
                }
                musicClipsSelectorCatalogRootVh.m.b.i.stop(32);
                return s3q0.a;
            case 20:
                Context context2 = (Context) this.d;
                Intent intent = (Intent) this.c;
                c.a aVar3 = com.vk.pushes.receivers.c.b;
                c.a.f(context2, intent, false);
                return s3q0.a;
            case 21:
                fqw0 fqw0Var = (fqw0) this.d;
                dhw0 dhw0Var = (dhw0) this.c;
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                String.valueOf(fqw0Var.a.b);
                oKVoipEngine.i(false, false);
                OKVoipEngine.J.a(new esj.a((Throwable) obj, dhw0Var, oKVoipEngine.E(), (StartCallType) OKVoipEngine.C.b, new com.vk.voip.d(1, OKVoipEngine.k.c, usw.class, "onIncomingCallFailed", "onIncomingCallFailed(Lcom/vk/voip/dependencies/EngineCallErrorInfo;)V", 0)));
                return s3q0.a;
            case 22:
                PhotoAlbum photoAlbum = (PhotoAlbum) this.d;
                p8a0.b bVar2 = (p8a0.b) this.c;
                ImageSize Cb2 = photoAlbum.u.Cb(bVar2.o.getWidth(), true, false);
                if (Cb2 == null || (str = Cb2.d.d) == null) {
                    str = photoAlbum.k;
                }
                bVar2.o.load(str);
                return s3q0.a;
            case 23:
                dzd0 dzd0Var = (dzd0) this.d;
                ProfilePhotoTag profilePhotoTag = (ProfilePhotoTag) this.c;
                if (((Boolean) obj).booleanValue()) {
                    FragmentActivity activity = dzd0Var.b.getActivity();
                    if (activity != null) {
                        String e = y8g0.e(R.string.profile_photo_tag_deleted);
                        ikv0.a aVar4 = new ikv0.a(activity);
                        aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) r8, (Size) r8, i3);
                        aVar4.u = new ikv0.d(e, (String) r8, (ikv0.d.a) r8, i2);
                        aVar4.n();
                    }
                    dzd0.a(profilePhotoTag);
                }
                return s3q0.a;
            case 24:
                r9e0 r9e0Var = (r9e0) this.d;
                okhttp3.d dVar = (okhttp3.d) this.c;
                f360.a aVar5 = (f360.a) obj;
                Iterator<f360> it2 = r9e0Var.d.iterator();
                while (it2.hasNext()) {
                    it2.next().m(dVar, aVar5);
                }
                Iterator<iae0.a> it3 = r9e0Var.e.iterator();
                while (it3.hasNext()) {
                    it3.next().a(dVar);
                }
                return s3q0.a;
            case 25:
                ((zak0) ((hi50) this.d).a).setValue(new r2q((zpx0) this.c, (zpx0) obj));
                return s3q0.a;
            case 26:
                Playlist playlist = (Playlist) this.d;
                SearchHistoryOtherVh searchHistoryOtherVh = (SearchHistoryOtherVh) this.c;
                zuh0 zuh0Var = (zuh0) obj;
                avh0.c cVar2 = new avh0.c(null, playlist != null ? playlist.Cb() : null, searchHistoryOtherVh.g.getString(R.string.music_talkback_album_cover), 13);
                bvh0 bvh0Var = new bvh0(playlist != null ? playlist.h : null, playlist != null ? Boolean.valueOf(playlist.k) : null);
                if (playlist != null) {
                    String str5 = playlist.e;
                    List<Artist> list2 = playlist.r;
                    int hashCode = str5.hashCode();
                    str2 = "";
                    if (hashCode == -1741312354) {
                        break;
                    } else {
                        if (hashCode == -251444232) {
                            break;
                        } else if (hashCode == -251167118 && str5.equals("main_only")) {
                            obj2 = s490.i(list2);
                        }
                        obj2 = "";
                    }
                    if (obj2.length() == 0) {
                        String str6 = playlist.o;
                        if (str6 != null) {
                            str2 = str6;
                        }
                    } else {
                        str2 = obj2;
                    }
                } else {
                    str2 = null;
                }
                return zuh0.a(zuh0Var, cVar2, bvh0Var, new SearchHistoryItemViewParams$SubTitleParams(searchHistoryOtherVh.e(R.string.music_search_history_album, str2), null), new SearchHistoryItemViewParams$ActionIconParams(SearchHistoryItemViewParams$ActionIconParams.IconType.Chevron, false, null, 14));
            case 27:
                return ((qgp0) this.d).b.w(String.valueOf(((UserId) this.c).b), (List) obj);
            case 28:
                izs izsVar3 = (izs) this.d;
                lbq0 lbq0Var = (lbq0) this.c;
                izsVar3.invoke((com.vk.ecomm.cart.impl.checkout.feature.state.f) obj);
                lbq0Var.d = false;
                return s3q0.a;
            default:
                ((izs) this.d).invoke(new wqs0.o.a((BlockId.CompositeId) this.c, ((Long) obj).longValue()));
                return s3q0.a;
        }
    }
}
