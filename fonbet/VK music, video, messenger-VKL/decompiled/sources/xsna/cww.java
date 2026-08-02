package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.tags.dto.TagsGetListResponseDto;
import com.vk.api.generated.tags.dto.TagsObjectTagDto;
import com.vk.bridges.ImageViewer;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.TintTextView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.ecomm.orders.impl.orderlist.presentation.OrderListFragment;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.ecomm.reviews.api.model.MarketItemReviewRepliesArgs;
import com.vk.ecomm.reviews.api.model.ReviewsActionType;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.CreateMarketItemReviewFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.actionbuilder.ReplyAction;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.ModalPostRepostsTabFragment;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.photos.root.photoflow.presentation.l;
import com.vk.rlottie.RLottieDrawable;
import com.vk.sharing.api.dto.GroupPickerInfo;
import com.vk.sharing.core.picker.PickingImpl;
import com.vk.superapp.multiaccount.api.f;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.hd20;
import xsna.hkq0;
import xsna.o0r0;
import xsna.o410;
import xsna.tj50;
import xsna.vzi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class cww implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cww(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ProfilesSimpleInfo profilesSimpleInfo;
        Object obj2;
        String str;
        Image image;
        ImageSize Cb;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                qgi0.h((tgi0) obj, ((hkq0.a) obj3).b);
                return s3q0.a;
            case 1:
                uw20 uw20Var = (uw20) obj3;
                uw20Var.show();
                return new mix(uw20Var);
            case 2:
                return (FrameLayout) obj3;
            case 3:
                gmz gmzVar = (gmz) obj3;
                Context context = gmzVar.getContext();
                cmf0.d(context, gmzVar.getWindow(), context.getString(R.string.error_hide_from_stories), false, (56 & 16) != 0 ? iah0.a(88) : 0, (56 & 32) != 0);
                return s3q0.a;
            case 4:
                ((com.vk.ecomm.reviews.impl.allreviews.presentation.b) obj3).T(new c.g((Throwable) obj));
                return s3q0.a;
            case 5:
                o410 o410Var = (o410) obj;
                w410 w410Var = (w410) ((MarketItemReviewsFragment) obj3).X.getValue();
                FragmentImpl fragmentImpl = w410Var.a;
                if (o410Var instanceof o410.h) {
                    o410.h hVar = (o410.h) o410Var;
                    f210 f210Var = hVar.a;
                    boolean f = epx.f(f210Var.a, w410Var.e.c());
                    ListBuilder e = e43.e();
                    if (f210Var.g) {
                        e.add(ReviewsActionType.ACTION_REPLY);
                    }
                    if (f210Var.d.length() > 0) {
                        e.add(ReviewsActionType.ACTION_COPY_TEXT);
                    }
                    if (!f) {
                        e.add(ReviewsActionType.ACTION_REPORT);
                    }
                    if (f210Var.e) {
                        e.add(ReviewsActionType.ACTION_EDIT);
                    }
                    if (f210Var.f) {
                        e.add(ReviewsActionType.ACTION_DELETE);
                    }
                    ListBuilder g = e.g();
                    np5 np5Var = new np5(14, w410Var, hVar);
                    if (!g.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = g.listIterator(0);
                        while (true) {
                            ListBuilder.a aVar = (ListBuilder.a) listIterator;
                            if (aVar.hasNext()) {
                                t10 a = cig0.a((ReviewsActionType) aVar.next());
                                if (a != null) {
                                    arrayList.add(a);
                                }
                            } else if (!arrayList.isEmpty()) {
                                new v70(arrayList, np5Var, null).a(fragmentImpl.requireContext());
                            }
                        }
                    }
                } else if (o410Var instanceof o410.c) {
                    new CreateMarketItemReviewFragment.a(((o410.c) o410Var).a).g(111722, fragmentImpl);
                } else if (o410Var instanceof o410.j) {
                    w410Var.c.m(fragmentImpl.requireContext(), ((o410.j) o410Var).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else if (o410Var instanceof o410.b) {
                    maz.c(w410Var.d, fragmentImpl.requireContext(), ((o410.b) o410Var).a, LaunchContext.A, null, null, 24);
                } else if (o410Var instanceof o410.f) {
                    o410.f fVar = (o410.f) o410Var;
                    ImageViewer.b(myc0.d(), fVar.b, fVar.a, fragmentImpl.requireContext(), new v410(), false, null, 496);
                } else if (o410Var instanceof o410.e) {
                    o410.e eVar = (o410.e) o410Var;
                    w410Var.b.b(eVar.a, fragmentImpl.requireContext(), eVar.b);
                } else if (o410Var instanceof o410.g) {
                    o410.g gVar = (o410.g) o410Var;
                    PickingImpl.a a2 = w410Var.g.a(fragmentImpl.requireContext());
                    GroupPickerInfo groupPickerInfo = a2.b;
                    groupPickerInfo.k = 1;
                    groupPickerInfo.j = R.string.review_reply_author;
                    groupPickerInfo.h = fkq0.a(gVar.a);
                    groupPickerInfo.g = gVar.b;
                    groupPickerInfo.b = true;
                    a2.a(4332, fragmentImpl);
                } else if (o410Var instanceof o410.a) {
                    o410.a aVar2 = (o410.a) o410Var;
                    ListBuilder listBuilder = aVar2.e;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = listBuilder.iterator();
                    while (true) {
                        ListBuilder.a aVar3 = (ListBuilder.a) it;
                        if (aVar3.hasNext()) {
                            t10 a3 = cig0.a((ReplyAction) aVar3.next());
                            if (a3 != null) {
                                arrayList2.add(a3);
                            }
                        } else if (!arrayList2.isEmpty()) {
                            new v70(arrayList2, new qt5(13, w410Var, aVar2), null).a(fragmentImpl.requireContext());
                        }
                    }
                } else if (o410Var instanceof o410.d) {
                    o410.d dVar = (o410.d) o410Var;
                    w410Var.h.a(fragmentImpl, new MarketItemReviewRepliesArgs(dVar.a, dVar.c, dVar.b));
                } else {
                    if (!(o410Var instanceof o410.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    maz.c(w410Var.d, fragmentImpl.requireContext(), ((o410.i) o410Var).a, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 6:
                su10 su10Var = (su10) obj3;
                ((zak0) su10Var.n).setValue((VkMediaPicker.CellAspectRation) su10Var.c.get((String) obj));
                return s3q0.a;
            case 7:
                return Boolean.valueOf(epx.f(((PostingAttachment) obj).nb(), (AttachmentWithMedia) obj3));
            case 8:
                Pair pair = (Pair) obj;
                wn7 wn7Var = ((g120) obj3).i;
                if (wn7Var != null) {
                    wn7Var.invoke(pair.i(), pair.j());
                }
                return s3q0.a;
            case 9:
                ic20 ic20Var = (ic20) obj3;
                hd20 g2 = ic20Var.g();
                if (g2 instanceof hd20.b) {
                    ic20Var.q(new x620(1 == true ? 1 : 0));
                } else if (g2 instanceof hd20.c) {
                    ic20Var.i.onNext(-1);
                }
                return s3q0.a;
            case 10:
                int i2 = ModalPostRepostsTabFragment.Y;
                ((ModalPostRepostsTabFragment) obj3).ho();
                return s3q0.a;
            case 11:
                ModernPlaylistModel.M((com.vk.music.playlist.g) obj3, (Playlist) obj, null, 2);
                return s3q0.a;
            case 12:
                ((NestedMsg) obj).c = ((w2w) obj3).d1();
                return s3q0.a;
            case 13:
                com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar4 = (com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) obj3;
                MsgListEmptyViewState msgListEmptyViewState = aVar4.Q;
                MsgListEmptyViewState.ForDialog forDialog = msgListEmptyViewState instanceof MsgListEmptyViewState.ForDialog ? (MsgListEmptyViewState.ForDialog) msgListEmptyViewState : null;
                qtd0 zb = (forDialog == null || (profilesSimpleInfo = forDialog.b) == null) ? null : profilesSimpleInfo.zb(forDialog.a.Zb());
                if (zb != null) {
                    aVar4.e(new b.o(zb));
                }
                return s3q0.a;
            case 14:
                es30 es30Var = (es30) obj3;
                int i3 = es30.p;
                FrescoImageView frescoImageView = es30Var.d;
                if (frescoImageView == null) {
                    frescoImageView = null;
                }
                int measuredWidth = frescoImageView.getMeasuredWidth();
                FrescoImageView frescoImageView2 = es30Var.d;
                if (frescoImageView2 == null) {
                    frescoImageView2 = null;
                }
                ViewGroup.LayoutParams layoutParams = frescoImageView2.getLayoutParams();
                int marginStart = measuredWidth + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
                TintTextView tintTextView = es30Var.g;
                if (tintTextView == null) {
                    tintTextView = null;
                }
                int measuredWidth2 = tintTextView.getMeasuredWidth();
                TintTextView tintTextView2 = es30Var.g;
                if (tintTextView2 == null) {
                    tintTextView2 = null;
                }
                ViewGroup.LayoutParams layoutParams2 = tintTextView2.getLayoutParams();
                int marginStart2 = measuredWidth2 + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0);
                TimeAndStatusView timeAndStatusView = es30Var.h;
                if (timeAndStatusView == null) {
                    timeAndStatusView = null;
                }
                int measuredWidth3 = timeAndStatusView.getMeasuredWidth();
                TimeAndStatusView timeAndStatusView2 = es30Var.h;
                if (timeAndStatusView2 == null) {
                    timeAndStatusView2 = null;
                }
                ViewGroup.LayoutParams layoutParams3 = timeAndStatusView2.getLayoutParams();
                int marginEnd = measuredWidth3 + (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0);
                View view = es30Var.i;
                if (view == null) {
                    view = null;
                }
                int measuredWidth4 = view.getMeasuredWidth();
                View view2 = es30Var.i;
                if (view2 == null) {
                    view2 = null;
                }
                int paddingLeft = measuredWidth4 - view2.getPaddingLeft();
                View view3 = es30Var.i;
                if (view3 == null) {
                    view3 = null;
                }
                if (marginStart + marginStart2 + marginEnd > paddingLeft - view3.getPaddingRight()) {
                    FrescoImageView frescoImageView3 = es30Var.d;
                    if (frescoImageView3 == null) {
                        frescoImageView3 = null;
                    }
                    int i4 = es30.o;
                    TimeAndStatusView timeAndStatusView3 = es30Var.h;
                    if (timeAndStatusView3 == null) {
                        timeAndStatusView3 = null;
                    }
                    f4m.q(timeAndStatusView3.getHeight() + i4 + i3, frescoImageView3);
                } else {
                    FrescoImageView frescoImageView4 = es30Var.d;
                    f4m.q(i3, frescoImageView4 == null ? null : frescoImageView4);
                }
                return s3q0.a;
            case 15:
                int i5 = nvr0.o;
                return new nvr0((DialogItemView) bwt0.I(R.layout.vkim_dialogs_list_item_dialog, (ViewGroup) obj, false), ((rx30) obj3).h);
            case 16:
                j140 j140Var = (j140) obj3;
                Iterator it2 = ((wpp) obj).c.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((Msg) next).d == j140Var.Q.c.d) {
                            obj2 = next;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Msg msg = (Msg) obj2;
                if (msg == null) {
                    return s3q0.a;
                }
                j140Var.Q.c = msg;
                j140Var.g1();
                return s3q0.a;
            case 17:
                i340 i340Var = (i340) obj3;
                Pair pair2 = (Pair) obj;
                f.c cVar = (f.c) pair2.d();
                ArrayList arrayList3 = new ArrayList((List) pair2.g());
                arrayList3.add(0, cVar);
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (hashSet.add(((f.c) next2).a().b)) {
                        arrayList4.add(next2);
                    }
                }
                i340Var.h.b(arrayList4);
                return cVar;
            case 18:
                g960 g960Var = (g960) obj3;
                e960 e960Var = g960Var.l;
                f960 f960Var = g960Var.q;
                e960Var.f((f960Var == null ? null : f960Var).b);
                return s3q0.a;
            case 19:
                sg60 sg60Var = (sg60) obj3;
                x960 x960Var = (x960) obj;
                sg60Var.p = x960Var.a().b;
                o1n o1nVar = sg60Var.f;
                DiscoverId discoverId = ((xf60) sg60Var.b.getCurrentState()).g;
                NewsEntriesContainer newsEntriesContainer = new NewsEntriesContainer(x960Var.a().b, x960Var.a().c);
                o1nVar.getClass();
                n1n.e(discoverId, newsEntriesContainer);
                return s3q0.a;
            case 20:
                ((lfa) obj3).invoke((etv0) obj);
                return s3q0.a;
            case 21:
                ((qe70) obj3).o.b(vzi0.a.a);
                return s3q0.a;
            case 22:
                com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a aVar5 = (com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) obj3;
                Pair pair3 = (Pair) obj;
                String str2 = (String) pair3.d();
                RLottieDrawable rLottieDrawable = (RLottieDrawable) pair3.g();
                aVar5.m = str2;
                rLottieDrawable.i();
                rLottieDrawable.k.q = 2;
                rLottieDrawable.setCallback(aVar5.D);
                aVar5.C = rLottieDrawable;
                return s3q0.a;
            case 23:
                ((yn80) obj3).r = ((Integer) obj).intValue();
                return s3q0.a;
            case 24:
                qcy<Object>[] qcyVarArr = OrderListFragment.Q;
                nzw nzwVar = ((OrderListFragment) obj3).N;
                qcy<Object> qcyVar = OrderListFragment.Q[0];
                ((ew80) bu00.k(nzwVar)).b((OrderListAction) obj);
                return s3q0.a;
            case 25:
                ne7.w((View) obj, (VideoFile) obj3);
                return s3q0.a;
            case 26:
                lm90 lm90Var = (lm90) ((nm90) obj3).a;
                if (lm90Var != null) {
                    lm90Var.J1();
                }
                return s3q0.a;
            case 27:
                ImageCropArea imageCropArea = (ImageCropArea) obj3;
                ImageCropArea imageCropArea2 = (ImageCropArea) obj;
                return Boolean.valueOf(agc0.c(imageCropArea2, imageCropArea) && w65.l(imageCropArea2, imageCropArea));
            case 28:
                com.vk.photos.root.photoflow.presentation.g gVar2 = (com.vk.photos.root.photoflow.presentation.g) obj3;
                tj50.a aVar6 = (tj50.a) obj;
                ow4 ow4Var = new ow4(gVar2, 9);
                ao8 ao8Var = ao8.d;
                return new l.a(aVar6.a(ow4Var, ao8Var), aVar6.a(e8a0.b, ao8Var), aVar6.a(new com.vk.photos.root.photoflow.presentation.e(1, gVar2, com.vk.photos.root.photoflow.presentation.g.class, "buildHeaderState", "buildHeaderState(Lcom/vk/photos/root/photoflow/presentation/PhotoFlowState;)Lcom/vk/photos/root/photoflow/presentation/PhotoFlowViewState$HeaderState;", 0), ao8Var), aVar6.a(new com.vk.photos.root.photoflow.presentation.f(1, gVar2, com.vk.photos.root.photoflow.presentation.g.class, "buildPhotosListState", "buildPhotosListState(Lcom/vk/photos/root/photoflow/presentation/PhotoFlowState;)Lcom/vk/photos/root/photoflow/presentation/PhotoFlowViewState$ListState;", 0), ao8Var), aVar6.a(new pw4(gVar2, 6), ao8Var));
            default:
                xba0 xba0Var = (xba0) obj3;
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList5 = new ArrayList(objArr.length);
                for (Object obj4 : objArr) {
                    arrayList5.add(((TagsGetListResponseDto) obj4).d());
                }
                ArrayList v = c5g.v(arrayList5);
                ArrayList arrayList6 = new ArrayList(c5g.u(v, 10));
                Iterator it4 = v.iterator();
                while (it4.hasNext()) {
                    TagsObjectTagDto tagsObjectTagDto = (TagsObjectTagDto) it4.next();
                    xba0Var.b.getClass();
                    int id = tagsObjectTagDto.getId();
                    UserId q = tagsObjectTagDto.q();
                    Integer x = f870.x(tagsObjectTagDto.f().getUrl());
                    String title = tagsObjectTagDto.f().getTitle();
                    if (title == null) {
                        title = "";
                    }
                    String str3 = title;
                    PhotosPhotoDto i6 = tagsObjectTagDto.f().i();
                    if (i6 != null) {
                        List<PhotosPhotoSizesDto> R = i6.R();
                        if (R == null) {
                            image = Image.d;
                        } else {
                            List<PhotosPhotoSizesDto> list = R;
                            vfa0 vfa0Var = (vfa0) vba0.c.getValue();
                            ArrayList arrayList7 = new ArrayList(c5g.u(list, 10));
                            Iterator<T> it5 = list.iterator();
                            while (it5.hasNext()) {
                                arrayList7.add(vfa0Var.a((PhotosPhotoSizesDto) it5.next()));
                            }
                            image = new Image(arrayList7);
                        }
                        if (image != null && (Cb = image.Cb(vba0.b, true, false)) != null) {
                            str = Cb.d.d;
                            arrayList6.add(new PhotoTag(id, q, x, str3, str, tagsObjectTagDto.e(), tagsObjectTagDto.j(), tagsObjectTagDto.k()));
                        }
                    }
                    str = null;
                    arrayList6.add(new PhotoTag(id, q, x, str3, str, tagsObjectTagDto.e(), tagsObjectTagDto.j(), tagsObjectTagDto.k()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    Object next3 = it6.next();
                    Integer valueOf = Integer.valueOf(((PhotoTag) next3).g);
                    Object obj5 = linkedHashMap.get(valueOf);
                    if (obj5 == null) {
                        obj5 = new ArrayList();
                        linkedHashMap.put(valueOf, obj5);
                    }
                    ((List) obj5).add(next3);
                }
                return linkedHashMap;
        }
    }
}
