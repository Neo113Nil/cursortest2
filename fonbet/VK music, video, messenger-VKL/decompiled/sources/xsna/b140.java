package xsna;

import android.animation.LayoutTransition;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineWrapperVh;
import com.vk.clips.design.view.timeline.TimelineEditingActionsView;
import com.vk.core.utils.newtork.d;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.VideoFile;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.notifications.NotificationsGetResponse$NotificationsResponseItem;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.feedlikes.FeedLikesPhotoFragment;
import com.vk.newsfeed.impl.presentation.holders.ReactionsFeedPhotosBlockHolder;
import com.vk.newsfeed.posting.geo_picker.presentation.c;
import com.vk.preview.presentation.view.StoryGalleryPickerPreviewViewNew;
import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mfg0;
import xsna.mwk0;
import xsna.nsh0;
import xsna.tj50;
import xsna.tra0;
import xsna.u850;
import xsna.uhj0;
import xsna.uhj0.b;
import xsna.vzi0;
import xsna.ywi0;
import xsna.zzd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b140 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b140(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NotificationItem notificationItem;
        switch (this.b) {
            case 0:
                e140 e140Var = (e140) this.c;
                ((d98) e140Var.l.getValue()).g.X(5);
                e140Var.d();
                return s3q0.a;
            case 1:
                MusicOfflineWrapperVh musicOfflineWrapperVh = (MusicOfflineWrapperVh) this.c;
                Set<String> set = MusicOfflineWrapperVh.f;
                musicOfflineWrapperVh.a(((com.vk.core.utils.newtork.d) obj) instanceof d.a);
                return s3q0.a;
            case 2:
                ListDataSet listDataSet = (ListDataSet) this.c;
                SparseArray sparseArray = (SparseArray) obj;
                int size = sparseArray.size();
                while (r3 < size) {
                    listDataSet.F(sparseArray.keyAt(r3), (u1c0) sparseArray.valueAt(r3));
                    r3++;
                }
                return s3q0.a;
            case 3:
                return (NewsEntry) ((FunctionReferenceImpl) this.c).invoke(obj);
            case 4:
                return ((zk60) this.c).b((t460) obj);
            case 5:
                VideoFile videoFile = (VideoFile) this.c;
                wjs0.a(videoFile.O9() ? new hxr0(videoFile, false) : new dyr0(videoFile));
                return s3q0.a;
            case 6:
                qe70 qe70Var = (qe70) this.c;
                dm10.e().d();
                qe70Var.o.b(vzi0.a.a);
                return s3q0.a;
            case 7:
                NotificationsGetResponse$NotificationsResponseItem notificationsGetResponse$NotificationsResponseItem = (NotificationsGetResponse$NotificationsResponseItem) obj;
                return Boolean.valueOf((notificationsGetResponse$NotificationsResponseItem == null || (notificationItem = notificationsGetResponse$NotificationsResponseItem.b) == null || !notificationItem.zb((NotificationItem) this.c)) ? false : true);
            case 8:
                sra0 sra0Var = (sra0) this.c;
                com.vk.newsfeed.posting.geo_picker.presentation.c cVar = (com.vk.newsfeed.posting.geo_picker.presentation.c) obj;
                if (cVar instanceof c.d) {
                    bwt0.p0(sra0Var.g, false);
                    bwt0.p0(sra0Var.h, false);
                    bwt0.p0(sra0Var.j, false);
                    bwt0.p0(sra0Var.i, false);
                    bwt0.p0(sra0Var.k, false);
                    bwt0.p0(sra0Var.l, true);
                    sra0Var.d.submitList(((c.d) cVar).a);
                } else if (cVar instanceof c.a) {
                    ViewGroup viewGroup = sra0Var.g;
                    VkText vkText = sra0Var.j;
                    bwt0.p0(viewGroup, true);
                    bwt0.p0(sra0Var.h, false);
                    bwt0.p0(vkText, true);
                    bwt0.p0(sra0Var.i, false);
                    bwt0.p0(sra0Var.k, false);
                    bwt0.p0(sra0Var.l, true);
                    sra0Var.d.submitList(Collections.singletonList(new lra0()));
                    vkText.setText(R.string.geo_picker_list_empty_list);
                } else if (cVar instanceof c.e) {
                    bwt0.p0(sra0Var.g, true);
                    bwt0.p0(sra0Var.h, true);
                    bwt0.p0(sra0Var.j, false);
                    bwt0.p0(sra0Var.i, false);
                    bwt0.p0(sra0Var.k, false);
                    sra0Var.d.submitList(Collections.singletonList(new lra0()));
                } else if (cVar instanceof c.C1414c) {
                    bwt0.p0(sra0Var.g, true);
                    bwt0.p0(sra0Var.h, false);
                    bwt0.p0(sra0Var.j, false);
                    bwt0.p0(sra0Var.i, true);
                    bwt0.p0(sra0Var.k, false);
                    sra0Var.d.submitList(Collections.singletonList(new lra0()));
                } else if (cVar instanceof c.f) {
                    ViewGroup viewGroup2 = sra0Var.g;
                    VkErrorView vkErrorView = sra0Var.k;
                    bwt0.p0(viewGroup2, true);
                    bwt0.p0(sra0Var.h, false);
                    bwt0.p0(sra0Var.j, false);
                    bwt0.p0(sra0Var.i, false);
                    bwt0.p0(vkErrorView, true);
                    vkErrorView.c(sra0.a(((c.f) cVar).a, new pp00(sra0Var, 15)));
                    sra0Var.d.submitList(Collections.singletonList(new lra0()));
                } else if (cVar instanceof c.g) {
                    bwt0.p0(sra0Var.g, false);
                    bwt0.p0(sra0Var.h, false);
                    bwt0.p0(sra0Var.j, false);
                    bwt0.p0(sra0Var.i, false);
                    bwt0.p0(sra0Var.k, false);
                    c.g gVar = (c.g) cVar;
                    sra0Var.d.submitList(gVar.b);
                    if (gVar.a) {
                        sra0Var.l.scrollToPosition(0);
                    }
                } else {
                    if (!(cVar instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewGroup viewGroup3 = sra0Var.g;
                    VkText vkText2 = sra0Var.j;
                    bwt0.p0(viewGroup3, true);
                    bwt0.p0(sra0Var.h, false);
                    bwt0.p0(vkText2, true);
                    bwt0.p0(sra0Var.i, false);
                    bwt0.p0(sra0Var.k, false);
                    sra0Var.d.submitList(Collections.singletonList(new lra0()));
                    vkText2.setText(R.string.geo_picker_search_empty_list);
                }
                return s3q0.a;
            case 9:
                ((com.vk.music.player.playback.c) this.c).p.addAll((List) obj);
                return s3q0.a;
            case 10:
                hib0 hib0Var = (hib0) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VkButton vkButton = hib0Var.h;
                ViewGroup viewGroup4 = hib0Var.j;
                vkButton.setEnabled(true);
                hib0Var.d(booleanValue);
                ViewGroup viewGroup5 = hib0Var.g;
                LayoutTransition layoutTransition = hib0Var.r;
                NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) hib0Var.p.getValue();
                viewGroup5.setLayoutTransition((nonBouncedAppBarLayout == null || nonBouncedAppBarLayout.f()) ? layoutTransition : null);
                hib0Var.c(hib0Var.c.r7());
                if (booleanValue) {
                    bwt0.p0(viewGroup4, false);
                } else {
                    CharSequence text = hib0Var.k.getText();
                    bwt0.p0(viewGroup4, ((text == null || text.length() == 0) ? 1 : 0) ^ 1);
                }
                return s3q0.a;
            case 11:
                ((i0e0) this.c).b.invoke(new zzd0.e((ProfileTabOptions) obj));
                return s3q0.a;
            case 12:
                ise0 ise0Var = (ise0) this.c;
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(((xqe0) entry.getKey()).a, entry.getValue());
                }
                qre0 qre0Var = ise0Var.b;
                synchronized (qre0Var) {
                    qre0Var.a.putAll(linkedHashMap);
                }
                return s3q0.a;
            case 13:
                new FeedLikesPhotoFragment.a().k(((ReactionsFeedPhotosBlockHolder) this.c).itemView.getContext());
                return s3q0.a;
            case 14:
                abf0 abf0Var = (abf0) this.c;
                if (epx.f(((dcg0) obj).a, abf0Var.e)) {
                    lqk0 lqk0Var = abf0Var.c;
                    if (lqk0Var != null) {
                        abf0Var.a.N0(lqk0Var);
                    }
                    abf0Var.c = null;
                }
                return s3q0.a;
            case 15:
                AttachWithId attachWithId = (AttachWithId) this.c;
                Attach attach = (Attach) obj;
                return Boolean.valueOf(attach.getClass().equals(attachWithId.getClass()) && ((AttachWithId) attach).getId() == attachWithId.getId());
            case 16:
                return (mfg0.a) this.c;
            case 17:
                ((zak0) ((sjg0) this.c).p).setValue((String) obj);
                return s3q0.a;
            case 18:
                csh0 csh0Var = (csh0) this.c;
                tj50.a aVar = (tj50.a) obj;
                bsh0 bsh0Var = bsh0.b;
                ao8 ao8Var = ao8.d;
                return new nsh0.b(aVar.a(bsh0Var, ao8Var), aVar.a(new fa00(csh0Var, 23), ao8Var), aVar.a(new svz(28), ao8Var), aVar.a(new azt(24), ao8Var));
            case 19:
                yhi0 yhi0Var = (yhi0) this.c;
                int i = yhi0.f1;
                yhi0Var.tn();
                return s3q0.a;
            case 20:
                return new ywi0.g(((tj50.a) obj).a(new e9i0((hxi0) this.c, 2), ao8.d));
            case 21:
                xhj0 xhj0Var = (xhj0) this.c;
                uhj0 uhj0Var = xhj0Var.c;
                if (uhj0Var != null) {
                    RecyclerPaginatedView recyclerPaginatedView = xhj0Var.g;
                    if (recyclerPaginatedView == null) {
                        recyclerPaginatedView = null;
                    }
                    String str = uhj0Var.n;
                    if (str == null || str.length() == 0) {
                        uhj0Var.d0(recyclerPaginatedView);
                    } else {
                        uhj0.b bVar = uhj0Var.r;
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new u20(uhj0Var.n), null, null, 3);
                        uhj0.b bVar2 = uhj0Var.new b(recyclerPaginatedView);
                        y0.subscribe(bVar2);
                        uhj0Var.r = bVar2;
                    }
                }
                return s3q0.a;
            case 22:
                return ((lwk0) this.c).a.a((mwk0.a) obj);
            case 23:
                StickersRouletteFragment stickersRouletteFragment = ((rcl0) this.c).b;
                stickersRouletteFragment.no(false);
                stickersRouletteFragment.mo(false);
                stickersRouletteFragment.po(false);
                stickersRouletteFragment.oo(true);
                return s3q0.a;
            case 24:
                ((nrl0) this.c).d = (GetStoriesResponse) obj;
                return s3q0.a;
            case 25:
                gzs<s3q0> gzsVar = ((StoryGalleryPickerPreviewViewNew) this.c).e;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 26:
                n7m0 n7m0Var = (n7m0) this.c;
                c7m0 c7m0Var = n7m0Var.e;
                KeyEvent.Callback callback = n7m0Var.b;
                u850 u850Var = (u850) obj;
                if (epx.f(u850Var, u850.e.a) || epx.f(u850Var, u850.f.a)) {
                    if (!n7m0Var.n) {
                        c7m0Var.K();
                    }
                    d7m0 d7m0Var = (d7m0) callback;
                    d7m0Var.mg(false);
                    d7m0Var.jb(false);
                    n7m0Var.m = true;
                } else {
                    u850.d dVar = u850.d.a;
                    if (epx.f(u850Var, dVar) || epx.f(u850Var, u850.i.a) || epx.f(u850Var, u850.a.a)) {
                        c7m0Var.pauseVideo();
                        ((d7m0) callback).mg(true);
                        if (n7m0Var.m) {
                            ((d7m0) callback).jb(true);
                            n7m0Var.m = false;
                        }
                        if (epx.f(c7m0Var.b(), dVar)) {
                            n7m0Var.n = true;
                        }
                    } else if (u850Var instanceof u850.g) {
                        float f = ((u850.g) u850Var).a;
                        if (n7m0Var.m) {
                            ((d7m0) callback).jb(true);
                            n7m0Var.m = false;
                        }
                        ((d7m0) callback).gn(an10.b((n7m0Var.j != null ? r0.c0 : 0) * f));
                    } else if (!epx.f(u850Var, u850.b.a) && !epx.f(u850Var, u850.c.a) && !epx.f(u850Var, u850.h.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return s3q0.a;
            case 27:
                j58 j58Var = (j58) this.c;
                ((etv0) obj).b(false);
                j58Var.performClick();
                return s3q0.a;
            case 28:
                gzs<s3q0> gzsVar2 = ((TimelineEditingActionsView) this.c).u;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
            default:
                tra0.a.x((tra0.a) obj, (tra0) this.c, 0, 0);
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b140(izs izsVar) {
        this.b = 3;
        this.c = (FunctionReferenceImpl) izsVar;
    }
}
