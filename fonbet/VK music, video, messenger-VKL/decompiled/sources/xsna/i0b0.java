package xsna;

import android.content.Intent;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.libvideo.ui.VideoHideView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.posting.settings.mvi.e;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.posting.presentation.video.VideoPickerFragment;
import com.vk.posting.presentation.video.e;
import com.vk.posting.presentation.video.model.VideoAlbumParams;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersViewState;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.dialog.about.c;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.awn0;
import xsna.bwq0;
import xsna.c99;
import xsna.doh0;
import xsna.evd0;
import xsna.gm50;
import xsna.ifb0;
import xsna.kmh0;
import xsna.n6n0;
import xsna.svq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0b0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i0b0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.vk.catalog2.common.ui.holders.header.TopBarVh$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [com.vk.catalog2.common.ui.holders.header.TopBarVh$a, java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupsGroupFullDto groupsGroupFullDto;
        GroupsGroupFullDto.WallDto h3;
        ww50<?> Y;
        ww50<?> Y2;
        int i = this.b;
        int i2 = 4;
        int i3 = 7;
        r4 = null;
        FragmentImpl fragmentImpl = null;
        r4 = null;
        FragmentImpl fragmentImpl2 = null;
        int i4 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((kg50) obj2).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj;
                ifb0.d dVar = ((ifb0) obj2).S;
                View b = tf3.b(viewGroup, R.layout.music_ui_action_btn, viewGroup, false);
                l840 l840Var = new l840(b);
                TextView textView = (TextView) b.findViewById(R.id.music_action_btn);
                bwt0.i0(textView, new qw30(dVar, 1 == true ? 1 : 0));
                textView.setText(R.string.music_button_create_playlist);
                his0.w(textView, R.drawable.vk_icon_list_add_24, R.attr.vk_ui_icon_accent);
                float f = 13;
                bwt0.t0(textView, iah0.a(f), 0, 0, 0, 14);
                textView.setCompoundDrawablePadding(iah0.a(f));
                return l840Var;
            case 2:
                p8c0 p8c0Var = (p8c0) obj2;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Story upload task is running " + p8c0Var.e});
                }
                return s3q0.a;
            case 3:
                return ((AudienceResearchComponent) obj2).b().d((List) obj);
            case 4:
                com.vk.newsfeed.impl.posting.settings.mvi.b bVar = (com.vk.newsfeed.impl.posting.settings.mvi.b) obj2;
                bVar.getClass();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) != null && (h3 = groupsGroupFullDto.h3()) != null) {
                    bVar.T(new e.h(h3.i(), Integer.valueOf(((h3 == GroupsGroupFullDto.WallDto.OPEN || h3 == GroupsGroupFullDto.WallDto.LIMITED) ? BaseBoolIntDto.YES : BaseBoolIntDto.NO).i())));
                }
                return s3q0.a;
            case 5:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) obj2;
                RecyclerView recyclerView = productsSelectionBottomSheet.i1;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.setVisibility(8);
                VkSpinner vkSpinner = productsSelectionBottomSheet.n1;
                if (vkSpinner == null) {
                    vkSpinner = null;
                }
                vkSpinner.setVisibility(0);
                ComposeView composeView = productsSelectionBottomSheet.m1;
                (composeView != null ? composeView : null).setVisibility(8);
                return s3q0.a;
            case 6:
                VkAvatar vkAvatar = (VkAvatar) obj;
                evd0.c cVar = (evd0.c) ((VkTile.h) obj2);
                String str = (String) cVar.a.invoke(Integer.valueOf(vkAvatar.getWidth()));
                vkAvatar.setContent(new c.d(str != null ? str : "", new eko(cVar.b)));
                return s3q0.a;
            case 7:
                io.reactivex.rxjava3.core.w wVar = (io.reactivex.rxjava3.core.w) obj2;
                io.reactivex.rxjava3.core.q T = io.reactivex.rxjava3.core.q.T((io.reactivex.rxjava3.core.p) obj);
                if (!epx.f(Looper.getMainLooper(), Looper.myLooper())) {
                    T = T.a0(wVar);
                }
                return new io.reactivex.rxjava3.internal.operators.observable.w(T, new a690(new nyq(24), 3));
            case 8:
                ((dmh0) obj2).T(new kmh0.c(n6n0.a.a));
                return s3q0.a;
            case 9:
                ((boh0) obj2).T(new doh0.b((SubscribeStatus) obj));
                return s3q0.a;
            case 10:
                ((idi0) obj2).b(false);
                return s3q0.a;
            case 11:
                p7j0 p7j0Var = (p7j0) obj2;
                m99 m99Var = (m99) obj;
                m99Var.b(c99.n.a);
                p7j0Var.b = io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.i0(m99Var.f.U(new sni0(new o7j0(i4), 1)), new f0j0(new ebx(p7j0Var, 25), 2)).t0(1L), new h4f0(new gqe0(p7j0Var, i2), 1 == true ? 1 : 0), io.reactivex.rxjava3.internal.functions.a.c), null, new j6e0(9), new yl0(23, p7j0Var, m99Var));
                return s3q0.a;
            case 12:
                return SignalingTransport.a((SignalingTransport) obj2, (String) obj);
            case 13:
                ((b3k0) obj2).b().invoke();
                return s3q0.a;
            case 14:
                ((zak0) obj2).setValue(obj);
                return s3q0.a;
            case 15:
                StoryEntry storyEntry = (StoryEntry) obj2;
                StoryOwner storyOwner = ((StoriesContainer) obj).b;
                return Boolean.valueOf(storyOwner != null && storyOwner.Ib(storyEntry.d));
            case 16:
                com.vk.stories.design.view.stats.tabs.stickers.mvi.c cVar2 = (com.vk.stories.design.view.stats.tabs.stickers.mvi.c) obj2;
                StoryStatisticsStickersViewState.a aVar = (StoryStatisticsStickersViewState.a) obj;
                gm50.a.a(cVar2, aVar.a, new ehm0(cVar2, i4));
                gm50.a.a(cVar2, aVar.b, new emh0(cVar2, i3));
                gm50.a.a(cVar2, aVar.c, new z8l0(cVar2, i2));
                return s3q0.a;
            case 17:
                it80 it80Var = (it80) obj;
                int i5 = StreamInfoFragment.S;
                eh8 fo = ((StreamInfoFragment) obj2).fo();
                if (fo != null) {
                    fo.a((fh8) it80Var.a);
                }
                return s3q0.a;
            case 18:
                int i6 = SuperAppFragment.o0;
                ((ikv0) obj).a();
                v7n0 v7n0Var = (v7n0) ((SuperAppFragment) obj2).S;
                if (v7n0Var != null) {
                    v7n0Var.A();
                }
                return s3q0.a;
            case 19:
                ((nvn0) obj2).T(awn0.b.b);
                return s3q0.a;
            case 20:
                g0o0 g0o0Var = (g0o0) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.i(g0o0Var.itemView.getContext(), (VKApiExecutionException) th);
                }
                return s3q0.a;
            case 21:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) obj2;
                UIBlockActionSearchMode uIBlockActionSearchMode = (UIBlockActionSearchMode) obj;
                ?? r0 = toolbarRedesignVh.n;
                if (r0 != 0) {
                    r0.B(uIBlockActionSearchMode.z);
                }
                ?? r02 = toolbarRedesignVh.n;
                if (r02 != 0) {
                    r02.o(uIBlockActionSearchMode.c);
                }
                return s3q0.a;
            case 22:
                ((r6p0) obj2).e = null;
                return s3q0.a;
            case 23:
                ((rpq0) obj2).n.a(new UserProfileAction.l(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 24:
                zvq0 zvq0Var = (zvq0) obj2;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                zvq0Var.w(wallWithCounters, true);
                zvq0Var.e(new bwq0.a.m(wallWithCounters.m()));
                zvq0Var.e(new bwq0.a.k(wallWithCounters.k()));
                zvq0Var.e(new bwq0.a.f(wallWithCounters.j()));
                zvq0Var.c(new svq0.b.r(wallWithCounters.k(), wallWithCounters.l()));
                return s3q0.a;
            case 25:
                ((com.vk.video.ui.discovery.minimizable.dialog.about.b) obj2).T(new c.a((List) obj));
                return s3q0.a;
            case 26:
                dis0 dis0Var = (dis0) obj2;
                if (dis0Var.f != null) {
                    dis0Var.h(new ghn0(dis0Var, i3));
                } else {
                    dis0Var.h(null);
                }
                return s3q0.a;
            case 27:
                int i7 = VideoHideView.A;
                wjs0.a(new oxr0((VideoFile) obj2, false));
                return s3q0.a;
            case 28:
                ((com.vk.video.ui.discovery.minimizable.g) obj2).C((c.o0) obj);
                return s3q0.a;
            default:
                VideoPickerFragment videoPickerFragment = (VideoPickerFragment) obj2;
                com.vk.posting.presentation.video.e eVar = (com.vk.posting.presentation.video.e) obj;
                int i8 = VideoPickerFragment.V;
                FragmentActivity activity = videoPickerFragment.getActivity();
                if (activity == 0) {
                    return s3q0.a;
                }
                if (eVar instanceof e.a) {
                    e.a aVar2 = (e.a) eVar;
                    videoPickerFragment.R.getClass();
                    if (aVar2.equals(e.a.C1541a.a)) {
                        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                        if (ey50Var != null && (Y2 = ey50Var.Y()) != null) {
                            fragmentImpl = Y2.u();
                        }
                        if (fragmentImpl != null) {
                            h3p0.b(fragmentImpl);
                        }
                    } else if (aVar2 instanceof e.a.c) {
                        e.a.c cVar3 = (e.a.c) aVar2;
                        VideoFile videoFile = cVar3.a;
                        am50 am50Var = cVar3.b;
                        Intent intent = new Intent();
                        intent.putExtra("video_vk_attach", videoFile);
                        am50Var.a(intent);
                        ey50 ey50Var2 = activity instanceof ey50 ? (ey50) activity : null;
                        if (ey50Var2 != null && (Y = ey50Var2.Y()) != null) {
                            fragmentImpl2 = Y.u();
                        }
                        if (fragmentImpl2 != null) {
                            fragmentImpl2.Mf(-1, intent);
                        }
                    } else {
                        if (!(aVar2 instanceof e.a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e.a.b bVar2 = (e.a.b) aVar2;
                        VideoAlbum videoAlbum = bVar2.a;
                        UserId userId = bVar2.b;
                        int i9 = videoAlbum.b;
                        String str2 = videoAlbum.d;
                        new VideoPickerFragment.a(userId, null, false, new VideoAlbumParams(i9, str2 != null ? str2 : ""), 4).h(activity, 45);
                    }
                } else {
                    if (!(eVar instanceof e.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.posting.presentation.video.f fVar = videoPickerFragment.Q;
                    com.vk.posting.presentation.video.f fVar2 = fVar != null ? fVar : null;
                    ((e.b.a) eVar).a.a(fVar2.f, new ff90(fVar2.b.getString(R.string.video_list_empty), 30, 50));
                }
                return s3q0.a;
        }
    }
}
