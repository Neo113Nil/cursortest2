package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.ExternalAdsInfo;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.dto.stories.model.clickable.ClickableMusicPlaylist;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.player.video.view.PlaylistPlayerVideoView;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.design.view.viewer.StoryUploadIndicatorView;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vk.story.viewer.impl.presentation.stories.view.ads.html5.Html5LoadState;
import com.vk.toggle.features.ContentFeatures;
import com.vkontakte.android.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.OneVideoPlayer;
import xsna.f5h0;
import xsna.hso0;

/* compiled from: ActionStoryViewDelegate.kt */
/* loaded from: classes6.dex */
public final class q50 {
    public final q7r a;
    public final kl20 b;
    public final om3 c;
    public final f0q0 d;
    public final eza0 e;
    public final a3s f;
    public final boolean g;

    public q50(q7r q7rVar, kl20 kl20Var, om3 om3Var, f0q0 f0q0Var, eza0 eza0Var, a3s a3sVar) {
        this.a = q7rVar;
        this.b = kl20Var;
        this.c = om3Var;
        this.d = f0q0Var;
        this.e = eza0Var;
        this.f = a3sVar;
        ContentFeatures contentFeatures = ContentFeatures.STORY_VIEWER_SKIP_PREVIEW;
        contentFeatures.getClass();
        this.g = com.vk.toggle.b.A.a(contentFeatures);
    }

    public static final int a(q50 q50Var) {
        StoryEntry currentStory = q50Var.a.i0.getCurrentStory();
        if (currentStory == null) {
            return -1;
        }
        String id = currentStory.getId();
        String str = c4g0.k;
        if (str != null && !id.equals(str)) {
            return -1;
        }
        c4g0.k = id;
        Long l = c4g0.l;
        if (l == null) {
            return -1;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - l.longValue());
        L.e("time from open:", Integer.valueOf(elapsedRealtime));
        return elapsedRealtime;
    }

    public static Size d(View view) {
        Size size = view != null ? new Size(view.getWidth(), view.getHeight()) : new Size(0, 0);
        return (size.getWidth() == 0 || size.getHeight() == 0) ? new Size(iah0.v(), iah0.u()) : size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d7  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, com.vk.dto.stories.model.StoryEntry] */
    /* JADX WARN: Type inference failed for: r12v10, types: [T, com.vk.dto.stories.model.StoryEntry, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(q50 q50Var, int i, int i2) {
        boolean z;
        boolean z2;
        VKImageView vKImageView;
        View view;
        View view2;
        StoryViewHeader storyViewHeader;
        Ref$ObjectRef ref$ObjectRef;
        com.vk.story.api.a aVar;
        StoryUploadIndicatorView storyUploadIndicatorView;
        mkm0 mkm0Var;
        f0q0 f0q0Var;
        View view3;
        View view4;
        com.vk.story.api.a aVar2;
        fmm0 fmm0Var;
        gmm0 gmm0Var;
        jmm0 jmm0Var;
        jmm0 jmm0Var2;
        q7r q7rVar;
        StoryEntry currentStory;
        yxt yxtVar;
        StoryBottomViewGroup storyBottomViewGroup;
        ClickableMusicPlaylist clickableMusicPlaylist;
        elm0 callback;
        elm0 callback2;
        MusicTrack musicTrack;
        boolean z3;
        VKImageView vKImageView2;
        StoryEntry currentStory2;
        f5h0.d dVar;
        boolean z4;
        boolean z5;
        String Db;
        String d;
        boolean z6;
        boolean z7;
        f0q0 f0q0Var2;
        VKImageView vKImageView3;
        boolean z8;
        njt hierarchy;
        VKImageView vKImageView4;
        f5h0.d dVar2;
        f5h0.d dVar3;
        VKImageView vKImageView5;
        boolean z9;
        Image image;
        boolean z10;
        boolean z11;
        ep50 ep50Var;
        njt hierarchy2;
        njt hierarchy3;
        o3e0 o3e0Var;
        VKImageView vKImageView6;
        VKImageView vKImageView7;
        VideoFile videoFile;
        boolean z12 = (i2 & 2) != 0;
        boolean z13 = (i2 & 4) == 0;
        om3 om3Var = q50Var.c;
        f0q0 f0q0Var3 = q50Var.d;
        q7r q7rVar2 = q50Var.a;
        mkm0 mkm0Var2 = q7rVar2.j0;
        mkm0 mkm0Var3 = q7rVar2.i0;
        com.vk.story.api.a aVar3 = q7rVar2.p;
        mkm0Var2.getClass();
        zbx zbxVar = q7rVar2.l0;
        if (zbxVar != null) {
            zbxVar.a().removeAllViews();
        }
        if (mkm0Var3.n) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = mkm0Var3.getCurrentStory();
        StoryEntry Bb = mkm0Var3.getStoriesContainer().Bb();
        if (Bb == null || (mkm0Var3.getStoriesContainer().b == null && !Bb.F)) {
            f0q0Var3.a();
            f0q0Var3.f(null, null);
            mkm0Var3.Z0();
            return;
        }
        if (i < 0 || i >= mkm0Var3.getStoriesContainer().g.size()) {
            return;
        }
        if (ref$ObjectRef2.element != 0) {
            mkm0Var3.getDependencies().e.f((StoryEntry) ref$ObjectRef2.element, mkm0Var3.getViewEntryPoint());
        }
        StoryEntry storyEntry = mkm0Var3.getStoriesContainer().g.get(i);
        vrl0 a2 = q7rVar2.a();
        if (a2 != 0) {
            a2.b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.OPEN_STORY_VIEW, storyEntry, mkm0Var3.f, q7rVar2.b());
        }
        asu0.a.getClass();
        asu0.n().execute(new k50(0, q50Var, storyEntry));
        mkm0Var3.setCurrentStory(storyEntry);
        ref$ObjectRef2.element = storyEntry;
        q7rVar2.f0 = storyEntry.c;
        q7rVar2.g0 = storyEntry.b;
        mkm0Var3.setCurrentIndex(i);
        mkm0Var3.setIsCurrentStoryPhoto(storyEntry.Sb());
        o3e0 a3 = mkm0Var3.getStoryViewProgressStrategyFactory().a(mkm0Var3, q7rVar2.v);
        umm0 umm0Var = mkm0Var3.b;
        if (umm0Var != null) {
            umm0Var.b(a3);
        }
        if (!mkm0Var3.f && mkm0Var3.R0()) {
            q50Var.h((StoryEntry) ref$ObjectRef2.element, mkm0Var3.getViewEntryPoint());
        }
        VideoFile videoFile2 = storyEntry.n;
        StoryEntry storyEntry2 = (StoryEntry) ref$ObjectRef2.element;
        boolean z14 = (storyEntry2 == null || (videoFile = storyEntry2.n) == null || videoFile.getWidth() == 0 || (videoFile.getWidth() < videoFile.getHeight() && !storyEntry2.Lb())) ? false : true;
        f5h0.d dVar4 = f5h0.i.a;
        if (videoFile2 != null) {
            VKImageView vKImageView8 = q7rVar2.x;
            if (vKImageView8 != null) {
                vKImageView8.setActualScaleType(dVar4);
            }
            xaj0 xaj0Var = q7rVar2.v;
            PlaylistPlayerVideoView playlistPlayerVideoView = xaj0Var != null ? xaj0Var.a : null;
            if ((playlistPlayerVideoView != null ? playlistPlayerVideoView.getLayoutParams() : null) instanceof ConstraintLayout.b) {
                ViewGroup.LayoutParams layoutParams = playlistPlayerVideoView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                StringBuilder sb = new StringBuilder();
                z = z14;
                sb.append(videoFile2.getWidth());
                sb.append(':');
                sb.append(videoFile2.getHeight());
                bVar.G = sb.toString();
                playlistPlayerVideoView.setLayoutParams(bVar);
                z2 = !z || storyEntry.Pb();
                vKImageView = q7rVar2.y;
                if (vKImageView != null) {
                    vKImageView.setVisibility(z2 ? 0 : 8);
                }
                if (z2 && (vKImageView7 = q7rVar2.y) != null) {
                    vKImageView7.setPostprocessor(q7rVar2.b);
                }
                if (storyEntry.Pb() && (vKImageView6 = q7rVar2.y) != null) {
                    vKImageView6.setPlaceholderColor(mkm0Var3.getContext().getColor(R.color.vk_gray_850));
                }
                view = q7rVar2.L;
                if (view != null) {
                    view.setVisibility(((StoryEntry) ref$ObjectRef2.element).B ? 0 : 8);
                }
                view2 = q7rVar2.M;
                if (view2 != null) {
                    StoryEntry storyEntry3 = (StoryEntry) ref$ObjectRef2.element;
                    view2.setVisibility((storyEntry3.C || storyEntry3.B) ? 8 : 0);
                }
                q50Var.f.c();
                storyViewHeader = q7rVar2.P;
                if (storyViewHeader != 0) {
                    storyViewHeader.a(storyEntry);
                }
                if (storyEntry.B && storyEntry.C) {
                    umm0 umm0Var2 = mkm0Var3.b;
                    boolean z15 = mkm0Var3.f;
                    if (umm0Var2 != null && (o3e0Var = umm0Var2.c) != null) {
                        o3e0Var.g(i, umm0Var2.b);
                    }
                    q7rVar2.q = 0L;
                    boolean f = myc0.f(storyEntry.B0);
                    VKImageView vKImageView9 = q7rVar2.x;
                    if (vKImageView9 != null && (hierarchy2 = vKImageView9.getHierarchy()) != null) {
                        if (f) {
                            hierarchy2.q(0);
                            hierarchy2.d.setVisible(true, true);
                            vKImageView9.setVisibility(0);
                            try {
                                z3 = k(storyEntry, vKImageView9);
                            } catch (Throwable unused) {
                            }
                            vKImageView2 = q7rVar2.x;
                            if (vKImageView2 != null) {
                                vKImageView2.clear();
                            }
                            boolean z16 = q50Var.g;
                            currentStory2 = mkm0Var3.getCurrentStory();
                            if (currentStory2 != null && ((currentStory2.Sb() || q7rVar2.e() || !currentStory2.i0 || currentStory2.i <= 0) && !(storyEntry.Tb() && z16 && z3))) {
                                Size d2 = d(q7rVar2.x);
                                VKImageView vKImageView10 = q7rVar2.y;
                                if (z) {
                                    dVar = dVar4;
                                    z4 = z3;
                                    z5 = z16;
                                    Db = storyEntry.Db(false, ImageQuality.FIT, q7rVar2.e());
                                } else {
                                    dVar = dVar4;
                                    VideoFile videoFile3 = storyEntry.n;
                                    if (videoFile3 != null && (image = videoFile3.getImage()) != null) {
                                        ArrayList arrayList = image.Db() ? image.c : image.b;
                                        if (arrayList != null) {
                                            Db = ixj0.n(arrayList);
                                            z4 = z3;
                                            z5 = z16;
                                        }
                                    }
                                    z4 = z3;
                                    z5 = z16;
                                    Db = null;
                                }
                                ref$ObjectRef = ref$ObjectRef2;
                                d = wlb0.d(storyEntry, q7rVar2.e(), d2.getWidth(), d2.getHeight());
                                boolean z17 = !mcr0.p(Db) || mcr0.o(Db);
                                boolean z18 = !mcr0.p(d) || mcr0.o(d);
                                if (myc0.f(Db) || !(d == null || d.length() == 0)) {
                                    if (d != null || d.length() == 0) {
                                        z6 = z12;
                                        z7 = z13;
                                        f0q0Var2 = f0q0Var3;
                                        aVar = aVar3;
                                        vKImageView3 = q7rVar2.x;
                                        if (vKImageView3 != null) {
                                            vKImageView3.clear();
                                        }
                                        q50Var.l();
                                    } else {
                                        if (storyEntry.Sb()) {
                                            aVar = aVar3;
                                            q7r q7rVar3 = f0q0Var3.a;
                                            f0q0Var2 = f0q0Var3;
                                            mkm0 mkm0Var4 = q7rVar3.i0;
                                            StoryEntry currentStory3 = mkm0Var4.getCurrentStory();
                                            if (currentStory3 == null) {
                                                z6 = z12;
                                                z7 = z13;
                                            } else {
                                                z6 = z12;
                                                VideoFile videoFile4 = currentStory3.n;
                                                f5h0.d dVar5 = (videoFile4 == null || videoFile4.getWidth() == 0 || (videoFile4.getWidth() < videoFile4.getHeight() && !currentStory3.Lb())) ? dVar : f5h0.f.a;
                                                StoryEntry currentStory4 = mkm0Var4.getCurrentStory();
                                                ExternalAdsInfo externalAdsInfo = currentStory4 != null ? currentStory4.m0 : null;
                                                if (externalAdsInfo != null) {
                                                    dVar2 = dVar5;
                                                    if (externalAdsInfo.g == ExternalAdsInfo.ScaleType.FIT) {
                                                        VKImageView vKImageView11 = q7rVar3.x;
                                                        if (vKImageView11 != null) {
                                                            z7 = z13;
                                                            vKImageView11.setBackgroundColor(mkm0Var4.getContext().getColor(R.color.vk_black));
                                                        } else {
                                                            z7 = z13;
                                                        }
                                                        dVar3 = dVar;
                                                        vKImageView5 = q7rVar3.x;
                                                        if (vKImageView5 != null) {
                                                            vKImageView5.setActualScaleType(dVar3);
                                                        }
                                                    }
                                                } else {
                                                    dVar2 = dVar5;
                                                }
                                                z7 = z13;
                                                dVar3 = dVar2;
                                                vKImageView5 = q7rVar3.x;
                                                if (vKImageView5 != null) {
                                                }
                                            }
                                            mkm0Var3.q = false;
                                            q7rVar2.o0 = true;
                                            VKImageView vKImageView12 = q7rVar2.x;
                                            if (vKImageView12 != null) {
                                                vKImageView12.setOnLoadCallback(new n50(d, q50Var, z18));
                                            }
                                        } else {
                                            z6 = z12;
                                            z7 = z13;
                                            f0q0Var2 = f0q0Var3;
                                            aVar = aVar3;
                                            q7rVar2.o0 = false;
                                            VKImageView vKImageView13 = q7rVar2.x;
                                            if (vKImageView13 != null) {
                                                vKImageView13.setOnLoadCallback(null);
                                            }
                                            if (z5) {
                                                q50Var.l();
                                            } else {
                                                VKImageView vKImageView14 = q7rVar2.x;
                                                if (vKImageView14 != null) {
                                                    vKImageView14.setOnLoadCallback(new o50(q50Var));
                                                }
                                            }
                                        }
                                        if (!myc0.f(Db) || z18 || z4) {
                                            boolean z19 = (z5 && z4) ? false : true;
                                            if (storyEntry.Pb() || (z && z19)) {
                                                q50Var.e(vKImageView10, d, true);
                                            }
                                            if (!z5 || storyEntry.Sb() || !z4) {
                                                vrl0 a4 = q7rVar2.a();
                                                VKImageView vKImageView15 = q7rVar2.x;
                                                if (vKImageView15 != null) {
                                                    vKImageView15.setPostprocessor(null);
                                                }
                                                if (a4 != null) {
                                                    z8 = true;
                                                    a4.c(mkm0Var3.getCurrentStory(), z15, z18, true);
                                                } else {
                                                    z8 = true;
                                                }
                                                VKImageView vKImageView16 = q7rVar2.x;
                                                if (vKImageView16 != null) {
                                                    vKImageView16.setDontLoadAgainIfSameResource(z8);
                                                }
                                                VKImageView vKImageView17 = q7rVar2.x;
                                                if (vKImageView17 != null && (hierarchy = vKImageView17.getHierarchy()) != null) {
                                                    hierarchy.q(0);
                                                }
                                                VKImageView vKImageView18 = q7rVar2.x;
                                                if (vKImageView18 != null) {
                                                    vKImageView18.o0(d, d2);
                                                }
                                            }
                                        } else {
                                            boolean z20 = z || storyEntry.Pb();
                                            z8m0 z8m0Var = z8m0.e;
                                            vrl0 a5 = q7rVar2.a();
                                            if (z20) {
                                                if (a5 != null) {
                                                    a5.c(mkm0Var3.getCurrentStory(), z15, z17, false);
                                                }
                                                q50Var.e(q7rVar2.y, Db, true);
                                            }
                                            if (!q7rVar2.o0 && (vKImageView4 = q7rVar2.x) != null) {
                                                vKImageView4.setOnLoadCallback(new s50(q50Var));
                                            }
                                            VKImageView vKImageView19 = q7rVar2.x;
                                            if (vKImageView19 != null) {
                                                vKImageView19.S0(z8m0Var);
                                            }
                                            if (a5 != null) {
                                                a5.c(mkm0Var3.getCurrentStory(), z15, false, true);
                                            }
                                            Size d3 = d(q7rVar2.x);
                                            VKImageView vKImageView20 = q7rVar2.x;
                                            if (vKImageView20 != null) {
                                                Uri parse = Uri.parse(Db);
                                                Uri parse2 = Uri.parse(d);
                                                sa30.K(vKImageView20, parse);
                                                sa30.K(vKImageView20, parse2);
                                                vKImageView20.getBackend().p(parse, parse2, d3);
                                            }
                                        }
                                    }
                                    if (!z15 && (q7rVar2.v != null || q7rVar2.z == null)) {
                                        if (!om3Var.f(storyEntry, mkm0Var3.getStoriesContainer().g, z6, z7)) {
                                            z10 = true;
                                            if (storyEntry.Ob() && q7rVar2.u0.d == Html5LoadState.ERROR) {
                                                mkm0 mkm0Var5 = q7rVar2.j0;
                                                ep50Var = !(mkm0Var5 instanceof ep50) ? (ep50) mkm0Var5 : null;
                                                if (ep50Var != null) {
                                                    z11 = true;
                                                    ep50Var.v1(true);
                                                    f0q0 f0q0Var4 = f0q0Var2;
                                                    f0q0Var4.d(storyEntry);
                                                    f0q0Var = f0q0Var4;
                                                    if (!z15) {
                                                        mkm0Var3.R();
                                                        mkm0Var3.c1(z11);
                                                        q50Var.j();
                                                        StoryEntry currentStory5 = mkm0Var3.getCurrentStory();
                                                        mcr0.s(currentStory5 != null ? currentStory5.Cb(z11) : null).subscribe();
                                                        if (z10) {
                                                            f0q0Var4.f(null, null);
                                                            mkm0Var3.Z0();
                                                            f0q0Var = f0q0Var4;
                                                        } else {
                                                            StoryEntry currentStory6 = mkm0Var3.getCurrentStory();
                                                            if (currentStory6 == null || currentStory6.b) {
                                                                f0q0Var4.b();
                                                                f0q0Var = f0q0Var4;
                                                            } else {
                                                                f0q0Var4.b();
                                                                f0q0Var = f0q0Var4;
                                                                if (mkm0Var3.R0()) {
                                                                    mkm0Var3.a1();
                                                                    f0q0Var = f0q0Var4;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z11 = true;
                                            f0q0 f0q0Var42 = f0q0Var2;
                                            f0q0Var42.d(storyEntry);
                                            f0q0Var = f0q0Var42;
                                            if (!z15) {
                                            }
                                        }
                                    }
                                    z10 = false;
                                    if (storyEntry.Ob()) {
                                        mkm0 mkm0Var52 = q7rVar2.j0;
                                        if (!(mkm0Var52 instanceof ep50)) {
                                        }
                                        if (ep50Var != null) {
                                        }
                                    }
                                    z11 = true;
                                    f0q0 f0q0Var422 = f0q0Var2;
                                    f0q0Var422.d(storyEntry);
                                    f0q0Var = f0q0Var422;
                                    if (!z15) {
                                    }
                                } else {
                                    z8m0 z8m0Var2 = z8m0.e;
                                    q7rVar2.o0 = true;
                                    VKImageView vKImageView21 = q7rVar2.x;
                                    if (vKImageView21 != null) {
                                        vKImageView21.setOnLoadCallback(new p50(Db, q50Var, z17));
                                    }
                                    VKImageView vKImageView22 = q7rVar2.x;
                                    if (vKImageView22 != null) {
                                        vKImageView22.setPostprocessor(z8m0Var2);
                                    }
                                    vrl0 a6 = q7rVar2.a();
                                    if (a6 != null) {
                                        z9 = false;
                                        a6.c(mkm0Var3.getCurrentStory(), z15, z17, false);
                                    } else {
                                        z9 = false;
                                    }
                                    q50Var.e(q7rVar2.x, Db, z9);
                                    z6 = z12;
                                    z7 = z13;
                                    f0q0Var2 = f0q0Var3;
                                }
                            } else {
                                z6 = z12;
                                z7 = z13;
                                f0q0Var2 = f0q0Var3;
                                ref$ObjectRef = ref$ObjectRef2;
                            }
                            aVar = aVar3;
                            if (!z15) {
                                if (!om3Var.f(storyEntry, mkm0Var3.getStoriesContainer().g, z6, z7)) {
                                }
                            }
                            z10 = false;
                            if (storyEntry.Ob()) {
                            }
                            z11 = true;
                            f0q0 f0q0Var4222 = f0q0Var2;
                            f0q0Var4222.d(storyEntry);
                            f0q0Var = f0q0Var4222;
                            if (!z15) {
                            }
                        } else if (hierarchy2.e.m == 0) {
                            VKImageView vKImageView23 = q7rVar2.y;
                            hierarchy2.q((vKImageView23 == null || (hierarchy3 = vKImageView23.getHierarchy()) == null) ? 0 : hierarchy3.e.m);
                            vKImageView9.setPlaceholderColor(-16777216);
                        }
                    }
                    z3 = false;
                    vKImageView2 = q7rVar2.x;
                    if (vKImageView2 != null) {
                    }
                    boolean z162 = q50Var.g;
                    currentStory2 = mkm0Var3.getCurrentStory();
                    if (currentStory2 != null) {
                        Size d22 = d(q7rVar2.x);
                        VKImageView vKImageView102 = q7rVar2.y;
                        if (z) {
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                        d = wlb0.d(storyEntry, q7rVar2.e(), d22.getWidth(), d22.getHeight());
                        if (mcr0.p(Db)) {
                        }
                        if (mcr0.p(d)) {
                        }
                        if (myc0.f(Db)) {
                        }
                        if (d != null) {
                        }
                        z6 = z12;
                        z7 = z13;
                        f0q0Var2 = f0q0Var3;
                        aVar = aVar3;
                        vKImageView3 = q7rVar2.x;
                        if (vKImageView3 != null) {
                        }
                        q50Var.l();
                        if (!z15) {
                        }
                        z10 = false;
                        if (storyEntry.Ob()) {
                        }
                        z11 = true;
                        f0q0 f0q0Var42222 = f0q0Var2;
                        f0q0Var42222.d(storyEntry);
                        f0q0Var = f0q0Var42222;
                        if (!z15) {
                        }
                    }
                    z6 = z12;
                    z7 = z13;
                    f0q0Var2 = f0q0Var3;
                    ref$ObjectRef = ref$ObjectRef2;
                    aVar = aVar3;
                    if (!z15) {
                    }
                    z10 = false;
                    if (storyEntry.Ob()) {
                    }
                    z11 = true;
                    f0q0 f0q0Var422222 = f0q0Var2;
                    f0q0Var422222.d(storyEntry);
                    f0q0Var = f0q0Var422222;
                    if (!z15) {
                    }
                } else {
                    f0q0 f0q0Var5 = f0q0Var3;
                    ref$ObjectRef = ref$ObjectRef2;
                    aVar = aVar3;
                    q7r q7rVar4 = f0q0Var5.a;
                    storyUploadIndicatorView = q7rVar4.H;
                    mkm0Var = q7rVar4.i0;
                    if (storyUploadIndicatorView != null) {
                        storyUploadIndicatorView.setVisibility(8);
                    }
                    mkm0Var.setIsCurrentStoryPhoto(true);
                    mkm0Var.q = true;
                    f0q0Var = f0q0Var5;
                    if (!mkm0Var.f) {
                        mkm0Var.R();
                        mkm0Var.c1(true);
                        f0q0Var = f0q0Var5;
                    }
                }
                view3 = q7rVar2.E;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                view4 = q7rVar2.F;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                aVar2 = aVar;
                if ("open_replies".equals(aVar2.a)) {
                    xmm0 xmm0Var = q7rVar2.V;
                    if (xmm0Var != null) {
                        xmm0Var.a(true);
                    }
                    aVar2.a = "";
                }
                fmm0Var = q7rVar2.R;
                if (fmm0Var != null) {
                    TextView textView = fmm0Var.f;
                    ClickableMusic Ab = storyEntry.Ab();
                    fmm0Var.e = Ab;
                    Integer valueOf = (Ab == null || (musicTrack = Ab.e) == null) ? null : Integer.valueOf(musicTrack.g);
                    fmm0Var.h = (valueOf != null && valueOf.intValue() == 0) || (valueOf != null && 3 == valueOf.intValue()) || ((valueOf != null && 6 == valueOf.intValue()) || (valueOf != null && 8 == valueOf.intValue()));
                    ClickableMusic clickableMusic = fmm0Var.e;
                    if (clickableMusic != null) {
                        MusicTrack musicTrack2 = clickableMusic.e;
                        Integer valueOf2 = musicTrack2 != null ? Integer.valueOf(musicTrack2.g) : null;
                        ClickableMusic Ab2 = storyEntry.Ab();
                        MusicDynamicRestriction musicDynamicRestriction = Ab2 == null ? null : Ab2.f;
                        if (musicDynamicRestriction == null || (valueOf2 != null && valueOf2.intValue() == 0)) {
                            if (textView != null) {
                                bwt0.p0(textView, false);
                            }
                            if (textView != null) {
                                textView.setText("");
                            }
                        } else {
                            if (textView != null) {
                                bwt0.p0(textView, true);
                            }
                            if (textView != null) {
                                textView.setText(musicDynamicRestriction.b);
                            }
                        }
                        boolean z21 = storyEntry.J;
                        fmm0Var.i = z21;
                        uov uovVar = fmm0Var.b;
                        uovVar.setAudioMuted(z21 || ((callback2 = uovVar.getCallback()) != null && callback2.a()));
                    }
                }
                gmm0Var = q7rVar2.S;
                if (gmm0Var != null) {
                    TextView textView2 = gmm0Var.c;
                    ClickableStickers clickableStickers = storyEntry.X;
                    if (clickableStickers != null) {
                        for (ClickableSticker clickableSticker : clickableStickers.d) {
                            if (clickableSticker instanceof ClickableMusicPlaylist) {
                                clickableMusicPlaylist = (ClickableMusicPlaylist) clickableSticker;
                                break;
                            }
                        }
                    }
                    clickableMusicPlaylist = null;
                    if (clickableMusicPlaylist != null) {
                        if (textView2 != null) {
                            bwt0.p0(textView2, false);
                        }
                        if (textView2 != null) {
                            textView2.setText("");
                        }
                        boolean z22 = storyEntry.J;
                        gmm0Var.d = z22;
                        uov uovVar2 = gmm0Var.b;
                        uovVar2.setAudioMuted(z22 || ((callback = uovVar2.getCallback()) != null && callback.a()));
                    }
                }
                if (storyEntry.J) {
                    ((q7r) om3Var.b).Y = true;
                    om3Var.e(true);
                }
                jmm0Var = q7rVar2.T;
                if (jmm0Var != null) {
                    jmm0Var.b = storyEntry.Kb();
                }
                jmm0Var2 = q7rVar2.T;
                if (jmm0Var2 != null) {
                    jmm0Var2.c = storyEntry.u;
                }
                q7rVar = f0q0Var.a;
                currentStory = q7rVar.i0.getCurrentStory();
                if (currentStory != null && (yxtVar = q7rVar.e0) != null && (storyBottomViewGroup = q7rVar.G) != null) {
                    storyBottomViewGroup.U4(yxtVar, currentStory, q7rVar);
                }
                if (mkm0Var3.f) {
                    L l = L.a;
                    l.getClass();
                    if (L.m(LoggerOutputTarget.NONE)) {
                        return;
                    }
                    L.u(l, L.LogType.v, new Object[]{"StoryView", "openStory storyId = " + ((StoryEntry) ref$ObjectRef.element).Yb() + ", videoUniqueIndex = " + q50Var.hashCode()});
                    return;
                }
                return;
            }
        }
        z = z14;
        if (z) {
        }
        vKImageView = q7rVar2.y;
        if (vKImageView != null) {
        }
        if (z2) {
            vKImageView7.setPostprocessor(q7rVar2.b);
        }
        if (storyEntry.Pb()) {
            vKImageView6.setPlaceholderColor(mkm0Var3.getContext().getColor(R.color.vk_gray_850));
        }
        view = q7rVar2.L;
        if (view != null) {
        }
        view2 = q7rVar2.M;
        if (view2 != null) {
        }
        q50Var.f.c();
        storyViewHeader = q7rVar2.P;
        if (storyViewHeader != 0) {
        }
        if (storyEntry.B) {
        }
        f0q0 f0q0Var52 = f0q0Var3;
        ref$ObjectRef = ref$ObjectRef2;
        aVar = aVar3;
        q7r q7rVar42 = f0q0Var52.a;
        storyUploadIndicatorView = q7rVar42.H;
        mkm0Var = q7rVar42.i0;
        if (storyUploadIndicatorView != null) {
        }
        mkm0Var.setIsCurrentStoryPhoto(true);
        mkm0Var.q = true;
        f0q0Var = f0q0Var52;
        if (!mkm0Var.f) {
        }
        view3 = q7rVar2.E;
        if (view3 != null) {
        }
        view4 = q7rVar2.F;
        if (view4 != null) {
        }
        aVar2 = aVar;
        if ("open_replies".equals(aVar2.a)) {
        }
        fmm0Var = q7rVar2.R;
        if (fmm0Var != null) {
        }
        gmm0Var = q7rVar2.S;
        if (gmm0Var != null) {
        }
        if (storyEntry.J) {
        }
        jmm0Var = q7rVar2.T;
        if (jmm0Var != null) {
        }
        jmm0Var2 = q7rVar2.T;
        if (jmm0Var2 != null) {
        }
        q7rVar = f0q0Var.a;
        currentStory = q7rVar.i0.getCurrentStory();
        if (currentStory != null) {
            storyBottomViewGroup.U4(yxtVar, currentStory, q7rVar);
        }
        if (mkm0Var3.f) {
        }
    }

    public static boolean k(StoryEntry storyEntry, VKImageView vKImageView) {
        gmg0 gmg0Var;
        String Bb = storyEntry.Bb(iah0.v());
        if (!mcr0.p(Bb) && !mcr0.o(Bb)) {
            hso0.b a2 = hso0.a(Base64.decode(storyEntry.B0, 3));
            Bitmap createBitmap = Bitmap.createBitmap(a2.a, a2.b, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(a2.c));
            vKImageView.setPlaceholderImage(new BitmapDrawable(vKImageView.getContext().getResources(), createBitmap));
            return true;
        }
        if (vKImageView.getImageWidth() <= 0 || vKImageView.getImageHeight() <= 0 || (gmg0Var = vKImageView.getHierarchy().d) == null) {
            return false;
        }
        vKImageView.Q0(new BitmapDrawable(vKImageView.getContext().getResources(), xjo.b(gmg0Var, vKImageView.getImageWidth(), vKImageView.getImageHeight(), 4)), f5h0.i.a);
        return false;
    }

    public final void b() {
        q7r q7rVar = this.a;
        int currentIndex = q7rVar.i0.getCurrentIndex();
        mkm0 mkm0Var = q7rVar.i0;
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        if (currentStory != null) {
            if (!mkm0Var.getDependencies().o.j(currentStory.c)) {
                i0q0.d(50L, new e50(0, currentStory, this));
                return;
            }
            mkm0Var.getDependencies().o.c(currentStory.c);
            c(currentIndex);
            Context context = mkm0Var.getContext();
            cmf0.d(context, mkm0Var.getWindow(), context.getString(R.string.story_deleted), false, (56 & 16) != 0 ? iah0.a(88) : 0, (56 & 32) != 0);
        }
    }

    public final void c(int i) {
        q7r q7rVar = this.a;
        mkm0 mkm0Var = q7rVar.i0;
        mkm0 mkm0Var2 = q7rVar.i0;
        int i2 = 0;
        if (!mkm0Var.getStoriesContainer().Eb() || mkm0Var2.getStoriesContainer().g.size() == 1 || i == -1) {
            if (i == 0 && mkm0Var2.getStoriesContainer().g.size() > 0) {
                mkm0Var2.getStoriesContainer().g.get(i).B = true;
                mkm0Var2.getStoriesContainer().g.remove(0);
            }
            if (mkm0Var2.c != null) {
                mkm0Var2.setPosition(-1);
                this.e.b();
                elm0 elm0Var = mkm0Var2.c;
                if (elm0Var != null) {
                    elm0Var.q(mkm0Var2.getStoriesContainer());
                }
            }
        } else if (i < mkm0Var2.getStoriesContainer().g.size() - 1) {
            mkm0Var2.getStoriesContainer().g.get(i).B = true;
            f(SourceTransitionStory.AUTO_AFTER_DELETE_STORY);
            mkm0Var2.getStoriesContainer().g.remove(i);
            i2 = -1;
        } else {
            if (i < mkm0Var2.getStoriesContainer().g.size()) {
                mkm0Var2.getStoriesContainer().g.get(i).B = true;
            }
            g(SourceTransitionStory.AUTO_AFTER_DELETE_STORY);
            if (i < mkm0Var2.getStoriesContainer().g.size()) {
                mkm0Var2.getStoriesContainer().g.remove(i);
            }
        }
        mkm0Var2.setCurrentIndex(mkm0Var2.getCurrentIndex() + i2);
        umm0 umm0Var = mkm0Var2.b;
        if (umm0Var != null) {
            int currentIndex = mkm0Var2.getCurrentIndex();
            o3e0 o3e0Var = umm0Var.c;
            if (o3e0Var != null) {
                o3e0Var.g(currentIndex, umm0Var.b);
            }
        }
    }

    public final void e(VKImageView vKImageView, String str, boolean z) {
        if (vKImageView != null) {
            vKImageView.o0(str, d(vKImageView));
        }
        if (z && vKImageView != null) {
            vKImageView.setOnLoadCallback(new a(vKImageView));
        }
    }

    public final void f(SourceTransitionStory sourceTransitionStory) {
        q7r q7rVar = this.a;
        q7rVar.i0.getDependencies().s.d();
        q7rVar.q = 0L;
        xjt0 xjt0Var = q7rVar.o;
        if (xjt0Var != null) {
            q7rVar.i0.removeView(xjt0Var);
            q7rVar.o = null;
        }
        this.b.d();
        q7rVar.j0.k1(sourceTransitionStory);
    }

    public final void g(SourceTransitionStory sourceTransitionStory) {
        q7r q7rVar = this.a;
        q7rVar.q = 0L;
        xjt0 xjt0Var = q7rVar.o;
        if (xjt0Var != null) {
            q7rVar.i0.removeView(xjt0Var);
            q7rVar.o = null;
        }
        this.b.d();
        q7rVar.j0.m1(sourceTransitionStory);
    }

    public final void h(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        if (storyEntry == null) {
            return;
        }
        q7r q7rVar = this.a;
        mkm0 mkm0Var = q7rVar.i0;
        mkm0 mkm0Var2 = q7rVar.i0;
        mkm0Var.getDependencies().e.a(storyEntry, mobileOfficialAppsConStoriesStat$ViewEntryPoint);
        umm0 umm0Var = mkm0Var2.b;
        if (umm0Var != null) {
            umm0Var.e = false;
        }
        mkm0Var2.setStartTime(System.currentTimeMillis());
        ClickableStickers clickableStickers = storyEntry.X;
        if (clickableStickers == null || !((Boolean) clickableStickers.f.getValue()).booleanValue()) {
            return;
        }
        ClickableMarketItem Bb = clickableStickers.Bb();
        if ((Bb != null ? Bb.f : null) == null) {
            return;
        }
        Long l = Bb.e;
        UserId userId = Bb.f;
        Long valueOf = userId != null ? Long.valueOf(userId.b) : null;
        if (l == null) {
            return;
        }
        lt00.h(mkm0Var2.getDependencies().w, l, valueOf, null, CommonMarketStat$TypeRefSource.STORIES, storyEntry.u, null, null, null, 224);
    }

    public final void j() {
        final Pair pair;
        q7r q7rVar = this.a;
        mkm0 mkm0Var = q7rVar.i0;
        mkm0 mkm0Var2 = q7rVar.i0;
        if (mkm0Var.R0()) {
            elm0 elm0Var = mkm0Var2.c;
            Pair pair2 = null;
            StoriesContainer n = elm0Var != null ? elm0Var.n(true) : null;
            if (n != null) {
                elm0 elm0Var2 = mkm0Var2.c;
                pair = new Pair(n, Integer.valueOf(elm0Var2 != null ? elm0Var2.c(n) : 0));
            } else {
                pair = null;
            }
            elm0 elm0Var3 = mkm0Var2.c;
            StoriesContainer n2 = elm0Var3 != null ? elm0Var3.n(false) : null;
            if (n2 != null) {
                elm0 elm0Var4 = mkm0Var2.c;
                pair2 = new Pair(n2, Integer.valueOf(elm0Var4 != null ? elm0Var4.c(n2) : 0));
            }
            final Pair pair3 = pair2;
            final smm0 smm0Var = mkm0Var2.getDependencies().t;
            final StoriesContainer storiesContainer = mkm0Var2.getStoriesContainer();
            final int currentIndex = mkm0Var2.getCurrentIndex();
            final boolean z = mkm0Var2.f;
            smm0Var.e.dispose();
            io.reactivex.rxjava3.internal.operators.completable.m mVar = new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.nmm0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    smm0 smm0Var2 = smm0.this;
                    CopyOnWriteArrayList<otz> copyOnWriteArrayList = smm0Var2.i;
                    L l = L.a;
                    l.getClass();
                    boolean m = L.m(LoggerOutputTarget.NONE);
                    StoriesContainer storiesContainer2 = storiesContainer;
                    if (!m) {
                        L.LogType logType = L.LogType.d;
                        StringBuilder sb = new StringBuilder("start add preload | currAuthor=");
                        StoryOwner storyOwner = storiesContainer2.b;
                        L.u(l, logType, new Object[]{ho8.a(sb, storyOwner != null ? storyOwner.Db() : null, ' ')});
                    }
                    Pair pair4 = pair;
                    Pair pair5 = pair3;
                    L.d(new com.vk.movika.sdk.base.ui.r(19, pair4, pair5));
                    copyOnWriteArrayList.clear();
                    int i = smm0Var2.g;
                    int i2 = 1;
                    if (1 <= i) {
                        while (true) {
                            int i3 = currentIndex + i2;
                            if (i3 >= 0 && i3 < storiesContainer2.g.size()) {
                                x1d0 x1d0Var = new x1d0(storiesContainer2.g.get(i3), Boolean.valueOf(z), smm0Var2.a.b(), storiesContainer2);
                                smm0Var2.d(x1d0Var);
                                copyOnWriteArrayList.add(x1d0Var);
                            }
                            if (i2 == i) {
                                break;
                            }
                            i2++;
                        }
                    }
                    L l2 = L.a;
                    l2.getClass();
                    LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l2, L.LogType.d, new Object[]{"addedCurAuthor " + copyOnWriteArrayList.size() + " stories"});
                    }
                    x1d0 a2 = smm0Var2.a(pair4 != null ? (StoriesContainer) pair4.i() : null, pair4 != null ? (Integer) pair4.j() : null);
                    if (a2 != null) {
                        copyOnWriteArrayList.add(a2);
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l2, L.LogType.d, new Object[]{"added next author stories = " + a2.a});
                        }
                    }
                    x1d0 a3 = smm0Var2.a(pair5 != null ? (StoriesContainer) pair5.i() : null, pair5 != null ? (Integer) pair5.j() : null);
                    if (a3 != null) {
                        copyOnWriteArrayList.add(a3);
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l2, L.LogType.d, new Object[]{"added prev author stories = " + a3.a});
                        }
                    }
                    ArrayList arrayList = new ArrayList(copyOnWriteArrayList);
                    g5g.L(arrayList, new tmm0(smm0Var2));
                    copyOnWriteArrayList.clear();
                    copyOnWriteArrayList.addAll(arrayList);
                    return s3q0.a;
                }
            });
            asu0.a.getClass();
            smm0Var.e = mVar.q(asu0.i()).subscribe(new va4(0), new aa7(new zzl0(3), 1));
        }
    }

    public final void l() {
        i0q0.i(0L, new m50(this, 0));
    }

    /* compiled from: ActionStoryViewDelegate.kt */
    public static final class a implements b780 {
        public final /* synthetic */ VKImageView c;

        public a(VKImageView vKImageView) {
            this.c = vKImageView;
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            OneVideoPlayer player;
            xaj0 xaj0Var = q50.this.a.v;
            OneVideoPlayer.State state = null;
            PlaylistPlayerVideoView playlistPlayerVideoView = xaj0Var != null ? xaj0Var.a : null;
            if (playlistPlayerVideoView == null) {
                playlistPlayerVideoView = null;
            }
            if (playlistPlayerVideoView != null && (player = playlistPlayerVideoView.getPlayer()) != null) {
                state = player.getState();
            }
            if (state == OneVideoPlayer.State.PLAYING) {
                this.c.clear();
            }
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }
    }
}
