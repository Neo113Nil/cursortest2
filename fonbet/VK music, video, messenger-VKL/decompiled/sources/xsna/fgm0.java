package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.api.models.AuthResult;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.d;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoSeason;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.VideoRelatedVideosAdapter;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.j;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.recycler.RelatedVideosRecyclerView;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.or8;
import xsna.yiw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fgm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fgm0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkButton vkButton;
        VideoRelatedVideosFragment.b bVar;
        bct0 bct0Var;
        VkButton vkButton2;
        bct0 bct0Var2;
        VkButton vkButton3;
        bct0 bct0Var3;
        VkButton vkButton4;
        int i;
        int i2;
        bct0 bct0Var4;
        VkButton vkButton5;
        bct0 bct0Var5;
        VkTabs vkTabs;
        wmr wmrVar;
        View view;
        long l;
        int i3 = this.b;
        int i4 = 3;
        int i5 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                ((ggm0) obj3).b.h((hyg0) obj, (hgm0) obj2);
                return s3q0.a;
            case 1:
                zeo0 zeo0Var = (zeo0) obj3;
                gfo0 gfo0Var = (gfo0) obj;
                zeo0Var.c = gfo0Var.b;
                zeo0Var.i();
                zeo0Var.d = gfo0Var.a;
                zeo0Var.i();
                zeo0Var.a = com.vk.photo.editor.features.markup.text.a.L(gfo0Var);
                ((com.vk.photo.editor.features.markup.text.a) obj2).H(zeo0Var);
                return s3q0.a;
            case 2:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) obj3;
                VideoRelatedVideosFragment.b bVar2 = (VideoRelatedVideosFragment.b) obj2;
                bct0 bct0Var6 = bVar2.a;
                com.vk.video.ui.discovery.minimizable.dialog.related_videos.j jVar = (com.vk.video.ui.discovery.minimizable.dialog.related_videos.j) obj;
                int i6 = VideoRelatedVideosFragment.n0;
                if (jVar instanceof j.a) {
                    j.a aVar = (j.a) jVar;
                    VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = aVar.b;
                    int i7 = aVar.d;
                    if (videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist) {
                        VideoDiscoveryRelatedVideosSource.Playlist playlist = (VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource;
                        TextView textView = bct0Var6.b;
                        VideoAlbum videoAlbum = playlist.b;
                        int i8 = videoAlbum.b;
                        String str = videoAlbum.d;
                        List<VideoSeason> list = videoAlbum.q;
                        textView.setText(str);
                        bct0Var6.c.setText(videoRelatedVideosFragment.po(playlist, i7));
                        if (videoRelatedVideosFragment.i0 && (view = bct0Var6.h) != null) {
                            awt0.v(view, iah0.s(videoRelatedVideosFragment.requireContext()));
                        }
                        List<VideoSeason> list2 = list;
                        if (list2.isEmpty()) {
                            boolean L0 = ((VideoPlaylistReversionComponent) videoRelatedVideosFragment.T.getValue()).L0(i8, videoAlbum.c.b);
                            VideoRelatedVideosFragment.b bVar3 = videoRelatedVideosFragment.Q;
                            int i9 = R.string.playlist_sort_inverse_description;
                            if (bVar3 != null && (bct0Var4 = bVar3.a) != null && (vkButton5 = bct0Var4.d) != null) {
                                bwt0.p0(vkButton5, fxc0.B().J().k());
                                vkButton5.setOnClickListener(new qj8(videoRelatedVideosFragment, 10));
                                VideoRelatedVideosFragment.to(vkButton5, L0);
                                vkButton5.setContentDescription(videoRelatedVideosFragment.getString(L0 ? R.string.playlist_sort_description : R.string.playlist_sort_inverse_description));
                            }
                            VideoRelatedVideosLoopMode videoRelatedVideosLoopMode = aVar.g;
                            VideoRelatedVideosFragment.b bVar4 = videoRelatedVideosFragment.Q;
                            if (bVar4 != null && (bct0Var3 = bVar4.a) != null && (vkButton4 = bct0Var3.f) != null) {
                                bwt0.p0(vkButton4, fxc0.B().J().q1());
                                vkButton4.setOnClickListener(new pj8(videoRelatedVideosFragment, 12));
                                int[] iArr = VideoRelatedVideosFragment.c.$EnumSwitchMapping$0;
                                int i10 = iArr[videoRelatedVideosLoopMode.ordinal()];
                                if (i10 == 1 || i10 == 2) {
                                    i = R.drawable.vk_icon_repeat_outline_24;
                                } else {
                                    if (i10 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i = R.drawable.vk_icon_repeat_1_outline_24;
                                }
                                Integer valueOf = Integer.valueOf(i);
                                int[] iArr2 = VkButton.W;
                                vkButton4.a5(true, valueOf);
                                VideoRelatedVideosFragment.to(vkButton4, videoRelatedVideosLoopMode != VideoRelatedVideosLoopMode.DISABLED);
                                int i11 = iArr[u3r0.a(videoRelatedVideosLoopMode).ordinal()];
                                if (i11 == 1) {
                                    i2 = R.string.playlist_loop_disable;
                                } else if (i11 == 2) {
                                    i2 = R.string.playlist_loop;
                                } else {
                                    if (i11 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i2 = R.string.playlist_loop_single_video;
                                }
                                vkButton4.setContentDescription(videoRelatedVideosFragment.getString(i2));
                            }
                            boolean z = aVar.h;
                            VideoRelatedVideosFragment.b bVar5 = videoRelatedVideosFragment.Q;
                            if (bVar5 != null && (bct0Var2 = bVar5.a) != null && (vkButton3 = bct0Var2.e) != null) {
                                bwt0.p0(vkButton3, true);
                                vkButton3.setOnClickListener(new naj(videoRelatedVideosFragment, 8));
                                VideoRelatedVideosFragment.to(vkButton3, z);
                                if (!z) {
                                    i9 = R.string.playlist_shuffle;
                                }
                                vkButton3.setContentDescription(videoRelatedVideosFragment.getString(i9));
                            }
                            if (!gpt0.c.contains(Integer.valueOf(i8)) && (bVar = videoRelatedVideosFragment.Q) != null && (bct0Var = bVar.a) != null && (vkButton2 = bct0Var.g) != null) {
                                bwt0.p0(vkButton2, true);
                                vkButton2.setOnClickListener(new zh0(videoRelatedVideosFragment, 8));
                            }
                        } else {
                            VideoRelatedVideosFragment.b bVar6 = videoRelatedVideosFragment.Q;
                            if (bVar6 != null && (bct0Var5 = bVar6.a) != null && (vkTabs = bct0Var5.i) != null) {
                                ArrayList arrayList = vkTabs.e;
                                bwt0.p0(vkTabs, true);
                                if (list2.size() != vkTabs.getTabsCount()) {
                                    vkTabs.h(true);
                                    Drawable drawable = videoRelatedVideosFragment.requireContext().getDrawable(R.drawable.vk_icon_more_vertical_24);
                                    if (drawable != null) {
                                        drawable.setTint(videoRelatedVideosFragment.requireContext().getColor(R.color.vk_white));
                                        wmrVar = new wmr(drawable, videoRelatedVideosFragment.getString(R.string.playlist_menu_description), new tvs0(videoRelatedVideosFragment, i4));
                                    } else {
                                        wmrVar = null;
                                    }
                                    vkTabs.setFixedIcon(wmrVar);
                                    vkTabs.setTabLayoutMode(VkTabs.TabLayoutMode.SCROLLABLE);
                                    for (VideoSeason videoSeason : list) {
                                        int i12 = com.vk.core.view.components.tabs.d.G;
                                        Context requireContext = videoRelatedVideosFragment.requireContext();
                                        lpj lpjVar = requireContext instanceof lpj ? (lpj) requireContext : null;
                                        Integer valueOf2 = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                                        dhr0.a.getClass();
                                        int i13 = dhr0.u().c;
                                        if (valueOf2 == null || valueOf2.intValue() != i13) {
                                            requireContext = new l7s(requireContext, dhr0.u().c);
                                        }
                                        nxv0 a = d.a.a(requireContext);
                                        a.setText(videoSeason.c);
                                        vkTabs.b(new VkTabs.c(a), videoSeason.e);
                                        a.setTextSelectedColorAttr(R.attr.vk_ui_text_primary);
                                        a.setTextUnselectedColorAttr(R.attr.vk_ui_text_secondary);
                                    }
                                    arrayList.clear();
                                    vkTabs.a(new com.vk.video.ui.discovery.minimizable.dialog.related_videos.e(videoRelatedVideosFragment, list));
                                } else {
                                    arrayList.clear();
                                    int i14 = 0;
                                    for (Object obj4 : vkTabs.getTabs()) {
                                        int i15 = i14 + 1;
                                        if (i14 < 0) {
                                            e43.t();
                                            throw null;
                                        }
                                        VkTabs.c.a((VkTabs.c) obj4, list.get(i14).c);
                                        if (list.get(i14).e) {
                                            vkTabs.l(i14, true);
                                        }
                                        i14 = i15;
                                    }
                                    vkTabs.a(new com.vk.video.ui.discovery.minimizable.dialog.related_videos.f(videoRelatedVideosFragment, list));
                                }
                            }
                        }
                        videoRelatedVideosFragment.oo(bVar2, aVar);
                    } else {
                        if (!(videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.TemporaryPlaylist)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        VideoDiscoveryRelatedVideosSource.TemporaryPlaylist temporaryPlaylist = (VideoDiscoveryRelatedVideosSource.TemporaryPlaylist) videoDiscoveryRelatedVideosSource;
                        bct0Var6.b.setText(temporaryPlaylist.c.d);
                        bct0Var6.c.setText(videoRelatedVideosFragment.po(temporaryPlaylist, i7));
                        if (((b25) videoRelatedVideosFragment.S.getValue()).b()) {
                            bVar2.e.setVisibility(0);
                            RelatedVideosRecyclerView relatedVideosRecyclerView = bVar2.b;
                            f4m.v(cn70.b(92), relatedVideosRecyclerView);
                            relatedVideosRecyclerView.setClipToPadding(false);
                            VideoRelatedVideosFragment.b bVar7 = videoRelatedVideosFragment.Q;
                            if (bVar7 != null && (vkButton = bVar7.e) != null) {
                                vkButton.setOnClickListener(new k6p(videoRelatedVideosFragment, 7));
                            }
                        } else {
                            videoRelatedVideosFragment.so();
                        }
                        videoRelatedVideosFragment.g0 = temporaryPlaylist.b;
                        videoRelatedVideosFragment.oo(bVar2, aVar);
                    }
                } else {
                    if (!epx.f(jVar, j.b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VideoRelatedVideosAdapter qo = videoRelatedVideosFragment.qo();
                    qo.L0(VideoRelatedVideosAdapter.State.a(qo.p, true, false, null, null, 12));
                }
                return s3q0.a;
            case 3:
                pcu0 pcu0Var = (pcu0) obj3;
                AuthResult authResult = (AuthResult) obj2;
                xbu0 xbu0Var = (xbu0) obj;
                io.reactivex.rxjava3.core.q p = pcu0.p(authResult, false);
                asu0.a.getClass();
                io.reactivex.rxjava3.internal.operators.observable.m1 a0 = p.a0(asu0.i());
                bpt0 bpt0Var = new bpt0(new w95(pcu0Var, authResult, xbu0Var, 11), i5);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return new io.reactivex.rxjava3.internal.operators.observable.o1(bxp0.c(a0.E(bpt0Var, lVar, kVar, kVar), authResult, true).U(new adz(new ujm0(xbu0Var, 12), 18)), new je40(new z5b(pcu0Var, authResult, xbu0Var, 6), 20));
            case 4:
                s890 s890Var = (s890) obj3;
                ButtonSize buttonSize = (ButtonSize) obj2;
                kw8 kw8Var = (kw8) obj;
                pco pcoVar = new pco(((Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) / kw8Var.getDensity()) - s890Var.c(kw8Var.b.getLayoutDirection())) - s890Var.a(kw8Var.b.getLayoutDirection()));
                pco pcoVar2 = new pco(or8.a);
                if (pcoVar.compareTo(pcoVar2) > 0) {
                    pcoVar = pcoVar2;
                }
                float density = kw8Var.getDensity() * pcoVar.b;
                if (density < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    density = 0.0f;
                }
                int i16 = or8.a.$EnumSwitchMapping$0[buttonSize.ordinal()];
                if (i16 == 1) {
                    l = l2l0.l(8);
                } else {
                    if (i16 != 2 && i16 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l = l2l0.l(12);
                }
                float u0 = kw8Var.u0(l);
                float f = 2;
                float intBitsToFloat = (Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) - density) / f;
                long floatToRawIntBits = (Float.floatToRawIntBits(density) << 32) | (Float.floatToRawIntBits(u0) & 4294967295L);
                return kw8Var.e(new fhu0(fyj0.a(SkeletonType.Block, Math.min(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) / kw8Var.getDensity()).a(floatToRawIntBits, kw8Var.b.getLayoutDirection(), kw8Var), intBitsToFloat, (Float.intBitsToFloat((int) (kw8Var.b.d() & 4294967295L)) - u0) / f));
            case 5:
                ljo0 ljo0Var = (ljo0) obj;
                ((wh50) obj3).setValue(ljo0Var);
                ((izs) obj2).invoke(ljo0Var);
                return s3q0.a;
            default:
                zhw0 zhw0Var = (zhw0) obj2;
                xiw0 xiw0Var = (xiw0) obj;
                List<low0> list3 = ((yiw0.e.b.C4104b) obj3).c;
                cjw0 cjw0Var = zhw0Var.i;
                ArrayList arrayList2 = xiw0Var.c;
                cjw0Var.getClass();
                zhw0Var.T(new kiw0(xiw0Var.a, xiw0Var.b, j5g.u0(cjw0.d(arrayList2), list3)));
                return s3q0.a;
        }
    }
}
