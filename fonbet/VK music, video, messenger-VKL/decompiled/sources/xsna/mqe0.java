package xsna;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.donut.design.view.badge.SmallOneTimeDonutBadge;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesFragment;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.music.player.StandalonePlayerFragment;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.profile.questions.impl.QuestionsUsableRecyclerPaginatedView;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.scheduled_clips.UserScheduledClipsGridFragment;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.sharing.core.SharingActivity;
import com.vk.story.archive.impl.di.StoryArchiveComponentImpl;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Pair;
import xsna.c9p0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mqe0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mqe0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerView recyclerView;
        tny tnyVar;
        zhf0 zhf0Var;
        int i;
        int i2;
        tny a;
        int[] iArr;
        boolean z;
        Window window;
        int i3 = this.b;
        int i4 = 1;
        Object obj = this.c;
        switch (i3) {
            case 0:
                QuestionsUsableRecyclerPaginatedView questionsUsableRecyclerPaginatedView = ((QuestionsListFragment) obj).T;
                if (questionsUsableRecyclerPaginatedView != null && (recyclerView = questionsUsableRecyclerPaginatedView.getRecyclerView()) != null) {
                    recyclerView.smoothScrollToPosition(0);
                }
                return s3q0.a;
            case 1:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.setStartDelay(b3f0.o);
                ofFloat.setDuration(b3f0.n);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new fsb((b3f0) obj, 2));
                return ofFloat;
            case 2:
                int i5 = RestoreSearchFragment.h0;
                ((RestoreSearchFragment) obj).jo();
                return s3q0.a;
            case 3:
                ((owh0) obj).getClass();
                return s3q0.a;
            case 4:
                ((e0i0) obj).d = null;
                return s3q0.a;
            case 5:
                ((i9i0) obj).b.j.onDismiss();
                return s3q0.a;
            case 6:
                bei0 bei0Var = (bei0) obj;
                oei0 oei0Var = bei0Var.a;
                ((zak0) bei0Var.n).getValue();
                s3q0 s3q0Var = s3q0.a;
                if (bei0Var.f() != null && (tnyVar = bei0Var.m) != null && tnyVar.e()) {
                    ArrayList j = oei0Var.j(bei0Var.j());
                    ArrayList arrayList = new ArrayList(j.size());
                    int size = j.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        cai0 cai0Var = (cai0) j.get(i6);
                        obi0 b = oei0Var.i().b(cai0Var.e());
                        Pair pair = b != null ? new Pair(cai0Var, b) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    int size2 = arrayList.size();
                    ArrayList arrayList2 = arrayList;
                    arrayList2 = arrayList;
                    if (size2 != 0 && size2 != 1) {
                        arrayList2 = e43.l(j5g.Y(arrayList), j5g.i0(arrayList));
                    }
                    if (!arrayList2.isEmpty()) {
                        boolean isEmpty = arrayList2.isEmpty();
                        zhf0 zhf0Var2 = cei0.a;
                        if (isEmpty) {
                            zhf0Var = zhf0Var2;
                        } else {
                            int size3 = arrayList2.size();
                            int i7 = 0;
                            float f = Float.POSITIVE_INFINITY;
                            float f2 = Float.POSITIVE_INFINITY;
                            float f3 = Float.NEGATIVE_INFINITY;
                            float f4 = Float.NEGATIVE_INFINITY;
                            while (i7 < size3) {
                                Pair pair2 = (Pair) arrayList2.get(i7);
                                cai0 cai0Var2 = (cai0) pair2.d();
                                obi0 obi0Var = (obi0) pair2.g();
                                int i8 = obi0Var.a.b;
                                int i9 = obi0Var.b.b;
                                if (i8 == i9 || (a = cai0Var2.a()) == null) {
                                    i = size3;
                                    i2 = i4;
                                } else {
                                    int min = Math.min(i8, i9);
                                    int max = Math.max(i8, i9) - i4;
                                    if (min == max) {
                                        iArr = new int[i4];
                                        iArr[0] = min;
                                        i2 = i4;
                                    } else {
                                        i2 = i4;
                                        int[] iArr2 = new int[2];
                                        iArr2[0] = min;
                                        iArr2[i2] = max;
                                        iArr = iArr2;
                                    }
                                    int length = iArr.length;
                                    i = size3;
                                    int[] iArr3 = iArr;
                                    int i10 = 0;
                                    float f5 = Float.POSITIVE_INFINITY;
                                    float f6 = Float.NEGATIVE_INFINITY;
                                    float f7 = Float.NEGATIVE_INFINITY;
                                    float f8 = Float.POSITIVE_INFINITY;
                                    while (i10 < length) {
                                        int i11 = length;
                                        zhf0 d = cai0Var2.d(iArr3[i10]);
                                        f8 = Math.min(f8, d.a);
                                        f5 = Math.min(f5, d.b);
                                        f6 = Math.max(f6, d.c);
                                        f7 = Math.max(f7, d.d);
                                        i10++;
                                        length = i11;
                                    }
                                    long floatToRawIntBits = Float.floatToRawIntBits(f6);
                                    long w = tnyVar.w(a, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
                                    long w2 = tnyVar.w(a, (Float.floatToRawIntBits(f7) & 4294967295L) | (floatToRawIntBits << 32));
                                    f = Math.min(f, Float.intBitsToFloat((int) (w >> 32)));
                                    f2 = Math.min(f2, Float.intBitsToFloat((int) (w & 4294967295L)));
                                    f3 = Math.max(f3, Float.intBitsToFloat((int) (w2 >> 32)));
                                    f4 = Math.max(f4, Float.intBitsToFloat((int) (w2 & 4294967295L)));
                                }
                                i7++;
                                i4 = i2;
                                size3 = i;
                            }
                            zhf0Var = new zhf0(f, f2, f3, f4);
                        }
                        if (!zhf0Var.equals(zhf0Var2)) {
                            zhf0 f9 = cei0.c(tnyVar).f(zhf0Var);
                            if (f9.c - f9.a >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f9.d - f9.b >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                zhf0 j2 = f9.j(tnyVar.D(0L));
                                return zhf0.b(j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (kdi0.b * 4) + j2.d, 7);
                            }
                        }
                    }
                }
                return null;
            case 7:
                Bundle bundle = SharingActivity.n0;
                return (VideoShareComponent) j6i.b(m7m.a((SharingActivity) obj), VideoShareComponent.class);
            case 8:
                Boolean bool = ((com.vk.sharing.core.view.f) obj).C;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    b4w b2 = com.vk.toggle.d.o0.b();
                    if (b2 == null) {
                        b4w.c.getClass();
                        b2 = b4w.d;
                    }
                    z = b2.a;
                }
                return Boolean.valueOf(z);
            case 9:
                int i12 = SmallOneTimeDonutBadge.d;
                return (VkText) ((SmallOneTimeDonutBadge) obj).findViewById(R.id.donut_one_time_badge_small_text);
            case 10:
                return ((eck0) obj).q();
            case 11:
                Paint paint = new Paint();
                paint.setShader(efa.a(((amk0) obj).d.getValue()));
                return paint;
            case 12:
                int i13 = StandalonePlayerFragment.a0;
                Dialog dialog = ((StandalonePlayerFragment) obj).s;
                if (dialog == null || (window = dialog.getWindow()) == null) {
                    return null;
                }
                return window.getDecorView();
            case 13:
                fwk0 fwk0Var = (fwk0) obj;
                return new pvk0(fwk0Var.b, fwk0Var.c, ((awk0) fwk0Var.a.getValue()).c);
            case 14:
                ((StickerCatalogRootVh) obj).C.d();
                return s3q0.a;
            case 15:
                StorefrontServicesFragment storefrontServicesFragment = (StorefrontServicesFragment) obj;
                qcy<Object>[] qcyVarArr = StorefrontServicesFragment.R;
                return new jnl0(storefrontServicesFragment.requireContext(), storefrontServicesFragment, m7m.d(storefrontServicesFragment));
            case 16:
                StoryArchiveComponentImpl storyArchiveComponentImpl = (StoryArchiveComponentImpl) obj;
                return new vpl0(storyArchiveComponentImpl.a.c6(), (xpl0) storyArchiveComponentImpl.b.getValue());
            case 17:
                int i14 = SuperAppFragment.o0;
                jjc.a(new iri0((SuperAppFragment) obj, 8));
                return s3q0.a;
            case 18:
                ((u7o0) obj).e.invoke("tech_bug_report");
                return s3q0.a;
            case 19:
                return Preference.g(((d2p0) obj).a);
            case 20:
                ((izs) ((zak0) ((c9p0.a) obj).b).getValue()).invoke(new sx40.o0(PlayerContext.TOP));
                return s3q0.a;
            case 21:
                slq0 slq0Var = ((pmq0) obj).b;
                if (slq0Var != null) {
                    slq0Var.a(UserProfileAction.s.e.c.b);
                }
                return s3q0.a;
            case 22:
                int i15 = UserScheduledClipsGridFragment.W;
                return Boolean.valueOf(((UserScheduledClipsGridFragment) obj).requireArguments().getBoolean("UserScheduledClipsGridFragment.force_dark_theme", true));
            case 23:
                lxr0 lxr0Var = (lxr0) obj;
                lxr0Var.d.Qc("video_actions_link_details_bottom_sheet");
                lxr0Var.b = null;
                return s3q0.a;
            case 24:
                int i16 = VideoEditTimelineView.H;
                return (VkImageSimple) ((VideoEditTimelineView) obj).findViewById(R.id.timeline_play_btn);
            case 25:
                int i17 = VideoMinimizableDiscoveryFragment.p1;
                return Integer.valueOf(((VideoMinimizableDiscoveryFragment) obj).getResources().getDimensionPixelSize(R.dimen.video_minimized_player_height));
            case 26:
                fxc0.B().d((VideoFileOld) obj);
                return s3q0.a;
            case 27:
                return VideoOverlayView.U4((VideoOverlayView) obj);
            case 28:
                VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) obj;
                int i18 = VideoProfileFragmentOld.p0;
                return new lzh0(((SearchUiComponent) ((k7m) m7m.f(videoProfileFragmentOld)).a(fpf0.a(SearchUiComponent.class))).Ga(), (SearchStatsLoggingInfo) videoProfileFragmentOld.V.getValue());
            default:
                ((yit0) obj).f.Ff("video_subtitles");
                return s3q0.a;
        }
    }
}
