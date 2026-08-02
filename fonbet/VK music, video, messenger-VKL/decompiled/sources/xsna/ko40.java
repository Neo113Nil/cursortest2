package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.UIBlockMusicMixTopshelf;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.transform.TransformController;
import xsna.ye0;

/* compiled from: MusicMixTopshelfFragment.kt */
/* loaded from: classes16.dex */
public final class ko40 extends Fragment {
    public UIBlockMusicMixTopshelf l;
    public VideoTextureView m;
    public ImageView n;
    public View o;
    public Map<Integer, xh5> q;
    public yok0 s;
    public final float h = 1.5625f;
    public final bpn0 i = new bpn0(new cr20(this, 8));
    public final bpn0 j = new bpn0(new l500(this, 13));
    public final g7s0 k = fxc0.B();
    public final ArrayList<Pair<yg5, a>> p = new ArrayList<>();
    public final bpn0 r = new bpn0(new os30(this, 3));
    public final Handler t = new Handler(Looper.getMainLooper());

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VideoTextureView videoTextureView;
        Integer tn;
        List<UIBlockMusicMixTopshelf.Item> list;
        UIBlockMusicMixTopshelf.Item item;
        List<UIBlockMusicMixTopshelf.Item> list2;
        UIBlockMusicMixTopshelf.Item item2;
        List<UIBlockMusicMixTopshelf.Item> list3;
        UIBlockMusicMixTopshelf.Item item3;
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setPadding(0, (int) constraintLayout.getResources().getDimension(R.dimen.video_topshelf_padding_top), 0, 0);
        Integer tn2 = tn();
        UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf = this.l;
        int i = 6;
        if (tn2 != null && uIBlockMusicMixTopshelf != null) {
            int intValue = tn2.intValue();
            UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf2 = this.l;
            String str = (uIBlockMusicMixTopshelf2 == null || (list3 = uIBlockMusicMixTopshelf2.y) == null || (item3 = (UIBlockMusicMixTopshelf.Item) j5g.b0(intValue, list3)) == null) ? null : item3.e;
            VKImageView vKImageView = new VKImageView(constraintLayout.getContext(), null, 6, 0);
            this.n = vKImageView;
            s3q0 s3q0Var = s3q0.a;
            vKImageView.o0(str, null);
            vKImageView.setLayoutParams(new ConstraintLayout.b(-1, -1));
            vKImageView.setId(R.id.video_music_topshelf_preview_image);
            constraintLayout.addView(vKImageView);
            VideoTextureView videoTextureView2 = new VideoTextureView(constraintLayout.getContext(), null, 6, 0);
            videoTextureView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.m = videoTextureView2;
            videoTextureView2.getTransformController().f(TransformController.ScaleType.CROP, false);
            videoTextureView2.setLayoutParams(new ConstraintLayout.b(-1, -1));
            constraintLayout.addView(videoTextureView2);
        }
        View view = new View(layoutInflater.getContext());
        view.setBackgroundResource(R.drawable.music_video_bg_topshelf);
        this.o = view;
        constraintLayout.addView(view);
        Context context = layoutInflater.getContext();
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setId(R.id.video_music_topshelf_watch_button);
        Integer tn3 = tn();
        UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf3 = this.l;
        bpn0 bpn0Var = this.i;
        int i2 = R.dimen.video_topshelf_content_margin_horizontal;
        if (tn3 != null && uIBlockMusicMixTopshelf3 != null) {
            vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_play_24));
            vkButton.setText(R.string.video_music_stream_mix_topshelf_launch);
            vkButton.setAppearance(VkButton.Appearance.Overlay);
            vkButton.setMode(VkButton.Mode.Primary);
            vkButton.setSize(VkButton.Size.Medium);
            ConstraintLayout.b bVar = new ConstraintLayout.b(-1, e3m.a(R.dimen.video_topshelf_button_height, context));
            int a2 = e3m.a(((Boolean) bpn0Var.getValue()).booleanValue() ? R.dimen.video_topshelf_tablet_margins_horizontal : R.dimen.video_topshelf_content_margin_horizontal, context);
            int a3 = e3m.a(R.dimen.video_music_mix_topshelf_content_margin_bottom, context);
            bVar.t = 0;
            bVar.l = 0;
            bVar.setMargins(a2, 0, a2, a3);
            vkButton.setLayoutParams(bVar);
            vkButton.setOnClickListener(new qa6(this, i));
        }
        constraintLayout.addView(vkButton);
        UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf4 = this.l;
        Integer tn4 = tn();
        boolean booleanValue = ((Boolean) bpn0Var.getValue()).booleanValue();
        if (tn4 != null) {
            int intValue2 = tn4.intValue();
            if (uIBlockMusicMixTopshelf4 != null && (list2 = uIBlockMusicMixTopshelf4.y) != null && (item2 = (UIBlockMusicMixTopshelf.Item) j5g.b0(intValue2, list2)) != null) {
                View inflate = layoutInflater.inflate(R.layout.catalog_video_music_topshelf, (ViewGroup) constraintLayout, false);
                ConstraintLayout.b bVar2 = new ConstraintLayout.b(booleanValue ? (int) layoutInflater.getContext().getResources().getDimension(R.dimen.video_topshelf_tablet_texts_width) : -1, -2);
                Context context2 = layoutInflater.getContext();
                if (booleanValue) {
                    i2 = R.dimen.video_topshelf_tablet_margins_horizontal;
                }
                int a4 = e3m.a(i2, context2);
                if (booleanValue) {
                    bVar2.t = 0;
                }
                bVar2.k = R.id.video_music_topshelf_watch_button;
                bVar2.setMargins(a4, 0, a4, 0);
                inflate.setLayoutParams(bVar2);
                ((VkText) inflate.findViewById(R.id.title)).setText(item2.c);
                ((VkText) inflate.findViewById(R.id.subtitle)).setText(item2.d);
                constraintLayout.addView(inflate);
            }
        }
        View view2 = this.o;
        if (view2 != null) {
            ConstraintLayout.b bVar3 = new ConstraintLayout.b(-1, (int) (sqe0.b(view2).widthPixels / this.h));
            bVar3.l = 0;
            view2.setLayoutParams(bVar3);
        }
        if (this.k.o() && (videoTextureView = this.m) != null && (tn = tn()) != null) {
            int intValue3 = tn.intValue();
            com.vk.libvideo.autoplay.a aVar = new com.vk.libvideo.autoplay.a(false, null, null, false, false, false, null, null, null, null, null, null, false, null, 523247);
            UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf5 = this.l;
            List<VideoFile> list4 = (uIBlockMusicMixTopshelf5 == null || (list = uIBlockMusicMixTopshelf5.y) == null || (item = (UIBlockMusicMixTopshelf.Item) j5g.b0(intValue3, list)) == null) ? null : item.g;
            if (list4 == null) {
                list4 = EmptyList.b;
            }
            Iterator it = j5g.H0(list4, 1).iterator();
            int i3 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList<Pair<yg5, a>> arrayList = this.p;
                if (hasNext) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
                    yg5 e = b.C1208b.a().e((VideoFile) next, null);
                    a aVar2 = new a(i3);
                    e.f0(aVar2);
                    e.z0(videoTextureView, aVar, null);
                    arrayList.add(new Pair<>(e, aVar2));
                    Integer tn5 = tn();
                    if (tn5 != null) {
                        int intValue4 = tn5.intValue();
                        Map<Integer, xh5> map = this.q;
                        if (map == null) {
                            map = null;
                        }
                        map.put(Integer.valueOf(intValue4), new xh5(e, aVar, videoTextureView, null, null));
                    }
                    i3 = i4;
                } else {
                    Pair pair = (Pair) j5g.a0(arrayList);
                    yg5 yg5Var = pair != null ? (yg5) pair.i() : null;
                    if (yg5Var != null) {
                        yg5Var.G0(false);
                    }
                }
            }
        }
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ArrayList<Pair<yg5, a>> arrayList = this.p;
        Iterator<Pair<yg5, a>> it = arrayList.iterator();
        while (it.hasNext()) {
            Pair<yg5, a> next = it.next();
            yg5 d = next.d();
            a g = next.g();
            ko40.this.t.removeCallbacks(g.e);
            d.T(g);
            d.b0(this.m);
        }
        arrayList.clear();
        this.m = null;
        this.n = null;
        this.o = null;
    }

    public final Integer tn() {
        return (Integer) this.j.getValue();
    }

    public final void un(UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf, VideoFile videoFile) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        yg5 e = b.C1208b.a().e(videoFile, null);
        e.seek(0L);
        e.f();
        Iterator<Pair<yg5, a>> it = this.p.iterator();
        while (it.hasNext()) {
            Pair<yg5, a> next = it.next();
            yg5 d = next.d();
            a g = next.g();
            ko40.this.t.removeCallbacks(g.e);
            d.seek(0L);
            d.T(g);
            d.b0(this.m);
        }
        ydt0 Y = this.k.Y();
        FragmentActivity kn = kn();
        String str = uIBlockMusicMixTopshelf.f;
        String r = videoFile.r();
        UIBlockMusicMixTopshelf.Item item = (UIBlockMusicMixTopshelf.Item) j5g.a0(uIBlockMusicMixTopshelf.y);
        Y.i(kn, videoFile, new VideoFeedDialogParams.MusicMix(str, r, null, item != null ? item.f : null, 0L, 20, null));
    }

    /* compiled from: MusicMixTopshelfFragment.kt */
    public final class a implements hnt0 {
        public final int b;
        public boolean c;
        public boolean d;
        public final yy4 e;

        public a(int i) {
            this.b = i;
            this.c = i == 0;
            this.d = true;
            this.e = new yy4(5, this, ko40.this);
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator startDelay;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            if (yg5Var.p() && this.d) {
                this.d = false;
                long j = this.c ? 2000L : 0L;
                ko40 ko40Var = ko40.this;
                VideoTextureView videoTextureView = ko40Var.m;
                if (videoTextureView != null) {
                    videoTextureView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                VideoTextureView videoTextureView2 = ko40Var.m;
                if (videoTextureView2 != null && (animate = videoTextureView2.animate()) != null && (startDelay = animate.setStartDelay(j)) != null && (alpha = startDelay.alpha(1.0f)) != null && (duration = alpha.setDuration(1500L)) != null) {
                    duration.start();
                }
                ko40Var.t.postDelayed(this.e, Long.min(yg5Var.getDuration() - 60000, 60000L) - 1500);
            }
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
            if (this.c) {
                this.c = false;
                if (videoAutoPlay.isPlaying()) {
                    return;
                }
                videoAutoPlay.seek(60000L);
            }
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
            ko40 ko40Var = ko40.this;
            ImageView imageView = ko40Var.n;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            ko40Var.t.removeCallbacks(this.e);
        }

        @Override // xsna.hnt0
        public final void E() {
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void h() {
        }

        @Override // xsna.hnt0
        public final void j() {
        }

        @Override // xsna.hnt0
        public final void t2() {
        }

        @Override // xsna.hnt0
        public final void u() {
        }

        @Override // xsna.hnt0
        public final void K2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void O(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        }

        @Override // xsna.hnt0
        public final void S2(long j) {
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        }
    }
}
