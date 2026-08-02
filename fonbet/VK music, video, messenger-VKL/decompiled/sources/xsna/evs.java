package xsna;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.api.InteractiveData;
import com.vk.movika.impl.view.full.extend_seekbar.InteractiveExtendSeekBarView;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.movika.tools.controls.seekbar.c;
import com.vk.movika.tools.controls.seekbar.z;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import one.video.player.OneVideoPlayer;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.acx;
import xsna.cbx;
import xsna.f3i0;
import xsna.f3i0.a;
import xsna.ikv0;
import xsna.ocx;
import xsna.rcx;

/* compiled from: FullInteractiveVideoView.kt */
/* loaded from: classes3.dex */
public class evs extends ef6 {
    public static final /* synthetic */ int Y = 0;
    public final boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final c4u0 E;
    public final VkSimpleButton F;
    public final VKImageView G;
    public final View H;
    public final VideoTextureView I;
    public final ViewGroup J;
    public final r6p0 K;
    public final c390 L;
    public final avs M;
    public final qo4 N;
    public final sd O;
    public final o63 P;
    public boolean Q;
    public final bpn0 R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Context w;
    public final com.vk.libvideo.autoplay.a x;
    public final View y;
    public fbs0 z;

    /* compiled from: FullInteractiveVideoView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            evs evsVar = (evs) this.receiver;
            int i = evs.Y;
            evsVar.M();
            if (evsVar.l.a.a) {
                evsVar.E.o.postDelayed(evsVar.N, 3000L);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Collection] */
    public evs(Context context) {
        super(false);
        this.w = context;
        this.x = com.vk.libvideo.autoplay.a.a(com.vk.libvideo.autoplay.a.t, null, null, null, null, PlayerType.CAROUSEL, ScreenType.PORTRAIT, 425982);
        View inflate = LayoutInflater.from(context).inflate(R.layout.full_interactive_player_view, (ViewGroup) null, false);
        this.y = inflate;
        this.A = true;
        c4u0 c4u0Var = new c4u0(inflate);
        this.E = c4u0Var;
        this.F = c4u0Var.q;
        this.G = c4u0Var.r;
        this.H = c4u0Var.s;
        this.I = c4u0Var.D;
        this.J = c4u0Var.E;
        this.K = new r6p0(inflate.getContext(), c4u0Var.J, new qzg(this, 18), new a(0, this, evs.class, "restartHideControlsTimer", "restartHideControlsTimer()V", 0));
        VideoOverlayView videoOverlayView = c4u0Var.F;
        this.L = new c390(videoOverlayView, this);
        this.M = new avs(this);
        this.N = new qo4(this, 4);
        this.O = new sd(this, 5);
        this.P = new o63(this, 4);
        this.R = new bpn0(new akh(this, 18));
        xyh xyhVar = new xyh(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, xyhVar);
        this.T = msy.a(lazyThreadSafetyMode, new b1j(this, 18));
        this.U = msy.a(lazyThreadSafetyMode, new bzj(this, 12));
        this.V = msy.a(lazyThreadSafetyMode, new nuj(this, 9));
        this.W = msy.a(lazyThreadSafetyMode, new v3n(this, 7));
        this.X = msy.a(lazyThreadSafetyMode, new cvs(this, 0));
        c4u0Var.b.setOnTouchListener(new bvs(this, 0));
        R(this, c4u0Var.c, new yad(this, 27));
        if (B()) {
            R(this, c4u0Var.R, new pwk(this, 13));
        }
        f3i0 N = N();
        boolean z = this.c;
        boolean z2 = this.B;
        DefaultSeekBarView defaultSeekBarView = N.k;
        c4u0 c4u0Var2 = N.b;
        boolean z3 = N.g;
        if (z3) {
            c4u0Var2.f.setVisibility(4);
        } else {
            f4m.j(c4u0Var2.g);
        }
        defaultSeekBarView.setDesign2Enabled(z3);
        f3i0.a aVar = N.new a();
        if (!defaultSeekBarView.I.contains(aVar)) {
            defaultSeekBarView.I = j5g.v0(aVar, defaultSeekBarView.I);
        }
        if (z3) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.i(c4u0Var2.p);
            bVar.k(R.id.player_controls, 4, 0, 4);
            bVar.k(R.id.labels_container, 4, 0, 4);
            bVar.k(R.id.seek_full_additional_text, 4, 0, 4);
            bVar.k(R.id.seek_preview_layout, 4, 0, 4);
            bVar.b(c4u0Var2.p);
            f4m.l(0, 0, c4u0Var2.B);
            N.j(z, z2);
        }
        if (N.h) {
            InteractiveExtendSeekBarView interactiveExtendSeekBarView = c4u0Var2.N;
            interactiveExtendSeekBarView.setImageLoader(new jl80());
            interactiveExtendSeekBarView.setActionConsumer(N.a);
            interactiveExtendSeekBarView.setSeekStateListener(new fda0(N, 7));
            c4u0Var2.O.setOnClickListener(new hn2(N, 10));
        }
        R(this, c4u0Var.n, new arf(this, 15));
        R(this, c4u0Var.t, new d9j(this, 10));
        R(this, c4u0Var.v, new z8f(this, 15));
        VideoFeatures videoFeatures = VideoFeatures.PLAYER_TECH_BUGREPORT;
        videoFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(videoFeatures);
        View view = c4u0Var.u;
        if (a2) {
            view.setVisibility(0);
            R(this, view, new f1j(this, 13));
        } else {
            f4m.j(view);
        }
        R(this, c4u0Var.w, new ayo(this, 5));
        R(this, c4u0Var.d, new wcg(this, 16));
        R(this, c4u0Var.e, new qqe(this, 21));
        R(this, videoOverlayView, new dam(7));
        bwt0.i0(c4u0Var.I, new lrk(this, 15));
    }

    public static void R(evs evsVar, View view, izs izsVar) {
        bwt0.i0(view, new z5a(10, evsVar, izsVar));
    }

    @Override // xsna.ef6
    public boolean A() {
        VideoMinifiedPlayerStateHolder.a.getClass();
        return !VideoMinifiedPlayerStateHolder.a();
    }

    @Override // xsna.ef6
    public final void E(boolean z, boolean z2) {
        super.E(z, z2);
        if (!z2) {
            U(null, true);
            this.E.b.setKeepScreenOn(false);
        }
        if (z == z2 || z2 || this.l.u.a) {
            return;
        }
        Q(false);
    }

    @Override // xsna.rcx
    public void E2(boolean z) {
        this.Q = z;
    }

    @Override // xsna.ef6, xsna.mnt0
    public void G2(View view) {
        a(new acx.o(this.w));
    }

    @Override // xsna.ef6
    public final void H(cbx cbxVar) {
        if (cbxVar instanceof cbx.c) {
            N().k.setCurrent(((cbx.c) cbxVar).a);
            return;
        }
        if (!cbxVar.equals(cbx.b.a)) {
            if (!(cbxVar instanceof cbx.a)) {
                throw new NoWhenBranchMatchedException();
            }
            C(new rcx.d.b(((cbx.a) cbxVar).a));
            return;
        }
        S(true);
        r6p0 r6p0Var = this.K;
        r6p0Var.a();
        ikv0 ikv0Var = r6p0Var.e;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        r6p0Var.e = null;
        Context context = r6p0Var.a;
        Window y = s200.y(context);
        View decorView = y != null ? y.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        ikv0.a aVar = new ikv0.a(bwt0.u(context));
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(context.getResources().getString(R.string.interactive_not_available_video_paused)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.h = new i0b0(r6p0Var, 22);
        aVar.l = 80;
        aVar.e = 4000L;
        r6p0Var.e = viewGroup != null ? aVar.o(viewGroup) : aVar.n();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6
    public final void I(ocx ocxVar) {
        super.I(ocxVar);
        if (bwt0.K(this.J)) {
            ((bbx) this.U.getValue()).a(ocxVar.a.a && !this.B, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ca, code lost:
    
        if (xsna.epx.f(r15, r12 != null ? r12.d : null) == false) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x046e  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    @Override // xsna.ef6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(ocx ocxVar) {
        boolean z;
        owo0 owo0Var;
        List<com.vk.movika.sdk.base.model.i> list;
        VideoFile videoFile;
        VideoRestriction O;
        List<com.vk.movika.sdk.base.model.i> list2;
        boolean z2;
        Long l;
        List<com.vk.movika.sdk.base.model.i> list3;
        View view;
        VkImageSimple vkImageSimple;
        long j;
        Object obj;
        c.a aVar;
        Iterator it;
        View view2;
        com.vk.movika.tools.controls.seekbar.z zVar;
        Object obj2;
        AppCompatImageView appCompatImageView;
        ViewGroup.LayoutParams layoutParams;
        Long k;
        Long g;
        owo0 owo0Var2;
        v3d0 v3d0Var;
        Chapter chapter;
        ?? r6;
        int size;
        ArrayList arrayList;
        Pair pair;
        Pair pair2;
        Chapter chapter2;
        boolean z3 = ocxVar.c;
        owo0 owo0Var3 = ocxVar.l;
        ocx.b bVar = ocxVar.a;
        ocx.c cVar = ocxVar.f;
        List<com.vk.movika.sdk.base.model.i> list4 = ocxVar.d;
        Long l2 = ocxVar.k;
        Chapter chapter3 = ocxVar.b;
        super.J(ocxVar);
        VideoFile videoFile2 = ocxVar.s;
        VideoRestriction O2 = videoFile2 != null ? videoFile2.O() : null;
        qo4 qo4Var = this.N;
        c390 c390Var = this.L;
        if (videoFile2 == null || !ocxVar.h) {
            z = z3;
            owo0Var = owo0Var3;
            list = list4;
            videoFile = videoFile2;
            if (O2 == null || !ocxVar.i) {
                f4m.j(c390Var.a);
            } else {
                InteractiveData interactiveData = this.j;
                VideoFile videoFile3 = interactiveData != null ? interactiveData.a : null;
                VideoOverlayView videoOverlayView = c390Var.a;
                if (videoFile3 != null && (O = videoFile3.O()) != null) {
                    gpt0 gpt0Var = gpt0.a;
                    Image image = new Image((List<ImageSize>) e43.m(gpt0.i(null, videoFile3)));
                    videoOverlayView.setVisibility(0);
                    videoOverlayView.Z4((i1t0) c390Var.c.getValue(), new VideoOverlayView.c.i(((a390) c390Var.d.getValue()).a(O), ((s290) c390Var.e.getValue()).a(image), false, new d5(17, videoFile3, c390Var)));
                }
            }
        } else {
            InteractiveData interactiveData2 = this.j;
            VideoFile videoFile4 = interactiveData2 != null ? interactiveData2.a : null;
            VideoOverlayView videoOverlayView2 = c390Var.a;
            if (videoFile4 == null) {
                z = z3;
                owo0Var = owo0Var3;
                list = list4;
                videoFile = videoFile2;
            } else {
                videoOverlayView2.setVisibility(0);
                z = z3;
                videoFile = videoFile2;
                owo0Var = owo0Var3;
                list = list4;
                videoOverlayView2.Z4(new i1t0(true, bo.h()), new VideoOverlayView.c.g(videoOverlayView2.getContext().getString(R.string.video_such_videos_will_be_shown_less), videoOverlayView2.getContext().getString(R.string.video_hide_cancel), new cww(videoFile4, 25)));
                c390Var.b.a(new acx.g(false, false, false));
            }
            qo4Var.run();
        }
        boolean z4 = cVar instanceof ocx.c.b;
        c4u0 c4u0Var = this.E;
        o63 o63Var = this.P;
        if (z4) {
            c4u0Var.x.postDelayed(o63Var, 1000L);
        } else {
            awt0.v(c4u0Var.x, false);
            awt0.v(c4u0Var.c, true);
            c4u0Var.x.removeCallbacks(o63Var);
        }
        boolean z5 = cVar instanceof ocx.c.a;
        boolean z6 = z5 && !((ocx.c.a) cVar).a;
        View view3 = c4u0Var.z;
        View view4 = c4u0Var.I;
        VkImageSimple vkImageSimple2 = c4u0Var.w;
        awt0.u(view3, z6);
        if (z6) {
            if (this.B) {
                Q(false);
            }
            if (!(this.l.f instanceof ocx.c.a)) {
                C(rcx.d.c.a);
            }
        }
        boolean z7 = bVar.a;
        boolean z8 = bVar.a;
        c4u0Var.c.setImageResource(z7 ? R.drawable.vk_icon_pause_button_64 : R.drawable.vk_icon_play_button_64);
        if (this.B && this.l.a.a != z8) {
            U(ocxVar, false);
            if (z8) {
                this.C = true;
                c4u0Var.o.postDelayed(qo4Var, 3000L);
            } else {
                M();
            }
        }
        c4u0Var.b.setKeepScreenOn(z8 && !(z5 && !((ocx.c.a) cVar).a));
        f3i0 N = N();
        com.vk.movika.tools.controls.seekbar.c cVar2 = N.s;
        p3h p3hVar = N.c;
        DefaultSeekBarView defaultSeekBarView = N.k;
        ocx ocxVar2 = N.i;
        if (epx.f(l2, ocxVar2 != null ? ocxVar2.k : null)) {
            String str = chapter3 != null ? chapter3.a : null;
            ocx ocxVar3 = N.i;
            if (epx.f(str, (ocxVar3 == null || (chapter2 = ocxVar3.b) == null) ? null : chapter2.a)) {
                ocx ocxVar4 = N.i;
                list2 = list;
            }
        }
        list2 = list;
        if (chapter3 != null && l2 != null) {
            long longValue = l2.longValue();
            defaultSeekBarView.setMaxCurrent(longValue);
            TreeSet<com.vk.movika.tools.controls.seekbar.a0> treeSet = defaultSeekBarView.e;
            if (!treeSet.isEmpty()) {
                treeSet.clear();
                defaultSeekBarView.invalidate();
                defaultSeekBarView.l();
            }
            z2 = z8;
            ArrayList arrayList2 = chapter3.c;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Long l3 = l2;
                com.vk.movika.sdk.base.model.h hVar = (com.vk.movika.sdk.base.model.h) it2.next();
                long j2 = longValue;
                Long valueOf = Long.valueOf(hVar.c);
                Long l4 = hVar.d;
                List l5 = e43.l(valueOf, Long.valueOf(l4 != null ? l4.longValue() : j2));
                ArrayList arrayList4 = new ArrayList(c5g.u(l5, 10));
                for (Iterator it3 = l5.iterator(); it3.hasNext(); it3 = it3) {
                    arrayList4.add(new com.vk.movika.tools.controls.seekbar.a0(((Number) it3.next()).longValue()));
                    list2 = list2;
                }
                g5g.y(arrayList4, arrayList3);
                l2 = l3;
                longValue = j2;
            }
            l = l2;
            long j3 = longValue;
            list3 = list2;
            Set S0 = j5g.S0(arrayList3);
            if (!S0.isEmpty() && treeSet.addAll(S0)) {
                defaultSeekBarView.invalidate();
                defaultSeekBarView.l();
            }
            cVar2.h = l.longValue();
            HashMap hashMap = cVar2.e;
            c.a aVar2 = cVar2.a;
            cVar2.c();
            FrameLayout frameLayout = aVar2.b;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            hashMap.clear();
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                com.vk.movika.sdk.base.model.i iVar = (com.vk.movika.sdk.base.model.i) it4.next();
                com.vk.movika.sdk.base.model.h hVar2 = iVar.a;
                View view5 = view4;
                VkImageSimple vkImageSimple3 = vkImageSimple2;
                long j4 = hVar2.c;
                Long l6 = hVar2.d;
                if (l6 != null) {
                    if (l6.longValue() == Long.MAX_VALUE) {
                        l6 = null;
                    }
                    if (l6 != null) {
                        j = l6.longValue();
                        long j5 = (j4 + j) / 2;
                        boolean z9 = iVar.b;
                        com.vk.movika.tools.controls.seekbar.z zVar2 = z.b.a;
                        com.vk.movika.tools.controls.seekbar.z zVar3 = !z9 ? z.a.a : zVar2;
                        Long valueOf2 = Long.valueOf(j5);
                        obj = hashMap.get(valueOf2);
                        if (obj != null) {
                            it = it4;
                            view2 = view5;
                            AppCompatImageView appCompatImageView2 = new AppCompatImageView((Context) cVar2.d.b);
                            int a2 = iah0.a(4);
                            appCompatImageView2.setPadding(a2, a2, a2, a2);
                            appCompatImageView2.setId(View.generateViewId());
                            FrameLayout frameLayout2 = aVar2.b;
                            if (frameLayout2 != null) {
                                aVar = aVar2;
                                zVar = zVar3;
                                frameLayout2.addView(appCompatImageView2, new ViewGroup.LayoutParams(-2, -2));
                            } else {
                                aVar = aVar2;
                                zVar = zVar3;
                            }
                            hashMap.put(valueOf2, appCompatImageView2);
                            obj2 = appCompatImageView2;
                        } else {
                            aVar = aVar2;
                            it = it4;
                            view2 = view5;
                            zVar = zVar3;
                            obj2 = obj;
                        }
                        View view6 = (View) obj2;
                        aly alyVar = cVar2.c;
                        Integer valueOf3 = Integer.valueOf(R.color.vk_white);
                        com.vk.movika.tools.controls.seekbar.b bVar2 = alyVar.a;
                        appCompatImageView = !(view6 instanceof AppCompatImageView) ? (AppCompatImageView) view6 : null;
                        HashMap hashMap2 = hashMap;
                        if (appCompatImageView != null) {
                            appCompatImageView.setImageResource(R.drawable.vk_icon_hand_point_up_12);
                            Pair pair3 = zVar.equals(zVar2) ? new Pair(Integer.valueOf(R.color.vk_white_alpha20), valueOf3) : new Pair(valueOf3, Integer.valueOf(R.color.vk_blue_200));
                            int intValue = ((Number) pair3.d()).intValue();
                            int intValue2 = ((Number) pair3.g()).intValue();
                            appCompatImageView.setBackground(new pcc(appCompatImageView.getContext().getColor(intValue)));
                            bwt0.o0(appCompatImageView, appCompatImageView.getContext().getColor(intValue2));
                        }
                        layoutParams = view6.getLayoutParams();
                        if (layoutParams != null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.width = an10.b(bVar2.a);
                        layoutParams.height = an10.b(bVar2.b);
                        view6.setLayoutParams(layoutParams);
                        Integer num = cVar2.g;
                        if (num != null) {
                            cVar2.b(num.intValue(), j5, view6);
                        }
                        vkImageSimple2 = vkImageSimple3;
                        hashMap = hashMap2;
                        it4 = it;
                        view4 = view2;
                        aVar2 = aVar;
                    }
                }
                j = j3;
                long j52 = (j4 + j) / 2;
                boolean z92 = iVar.b;
                com.vk.movika.tools.controls.seekbar.z zVar22 = z.b.a;
                if (!z92) {
                }
                Long valueOf22 = Long.valueOf(j52);
                obj = hashMap.get(valueOf22);
                if (obj != null) {
                }
                View view62 = (View) obj2;
                aly alyVar2 = cVar2.c;
                Integer valueOf32 = Integer.valueOf(R.color.vk_white);
                com.vk.movika.tools.controls.seekbar.b bVar22 = alyVar2.a;
                if (!(view62 instanceof AppCompatImageView)) {
                }
                HashMap hashMap22 = hashMap;
                if (appCompatImageView != null) {
                }
                layoutParams = view62.getLayoutParams();
                if (layoutParams != null) {
                }
            }
            view = view4;
            vkImageSimple = vkImageSimple2;
            lcx lcxVar = ((evs) p3hVar.c).q;
            k = lcxVar == null ? lcxVar.k() : null;
            lcx lcxVar2 = ((evs) p3hVar.c).q;
            g = lcxVar2 == null ? lcxVar2.g() : null;
            if (k != null && g != null) {
                long longValue2 = g.longValue();
                defaultSeekBarView.setMaxCurrent(k.longValue());
                defaultSeekBarView.setCurrent(longValue2);
                defaultSeekBarView.setAlpha(((Number) N.d.invoke(Boolean.valueOf(po10.b(ocxVar.e, longValue2)))).floatValue());
            }
            N.i = ocxVar;
            c4u0Var.d.setImageAlpha(!epx.f(ocxVar.n, ocx.d.a.a) ? 255 : 102);
            c4u0Var.e.setImageAlpha(!epx.f(ocxVar.m, ocx.e.a.a) ? 255 : 102);
            boolean z10 = chapter3 == null && chapter3.g == Chapter.Order.START;
            VkImageSimple vkImageSimple4 = vkImageSimple;
            vkImageSimple4.setEnabled(!z10);
            vkImageSimple4.setImageAlpha(z10 ? 102 : 255);
            owo0Var2 = owo0Var;
            c4u0Var.N.setTimelineImages(owo0Var2);
            v3d0Var = (v3d0) this.V.getValue();
            v3d0Var.getClass();
            if (l != null && v3d0Var.a().i.getDuration() != l.longValue()) {
                v3d0Var.d(l.longValue());
            }
            v3d0Var.g(owo0Var2);
            bwt0.m0(-2, -2, v3d0Var.a().h);
            if (owo0Var2 != null) {
                SeekPreviewImageView seekPreviewImageView = v3d0Var.a().i;
                int i = owo0Var2.a;
                int i2 = owo0Var2.b;
                if (i <= 0 || i2 <= 0) {
                    L l7 = L.a;
                    l7.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l7, L.LogType.w, new Object[]{sl9.c(i, i2, "Wrong args: width = ", ", height = ", ". Skip applySize!")});
                    }
                } else {
                    double d = i / i2;
                    if (d < 1.0d) {
                        pair = new Pair(Integer.valueOf(iah0.a(76)), Integer.valueOf(an10.a(iah0.a(r2) / d)));
                    } else {
                        if (d == 1.0d) {
                            float f = 160;
                            pair2 = new Pair(Integer.valueOf(iah0.a(f)), Integer.valueOf(iah0.a(f)));
                        } else if (d <= 1.34d) {
                            pair2 = new Pair(Integer.valueOf(an10.a(iah0.a(r2) * d)), Integer.valueOf(iah0.a(125)));
                        } else if (d <= 1.78d) {
                            pair2 = new Pair(Integer.valueOf(an10.a(iah0.a(r2) * d)), Integer.valueOf(iah0.a(90)));
                        } else {
                            pair = new Pair(Integer.valueOf(iah0.a(160)), Integer.valueOf(an10.a(iah0.a(r2) / d)));
                        }
                        pair = pair2;
                    }
                    bwt0.m0(((Number) pair.d()).intValue(), ((Number) pair.g()).intValue(), seekPreviewImageView);
                }
            }
            chapter = this.l.b;
            if (!epx.f(chapter == null ? chapter.a : null, chapter3 == null ? chapter3.a : null)) {
                this.K.a();
            }
            if (z || this.l.c || !this.B) {
                r6 = 0;
            } else {
                r6 = 0;
                Q(false);
            }
            if (z || !z2 || this.C) {
                view.setVisibility(4);
            } else {
                view.setVisibility(r6);
                U(ocxVar, r6);
                T(true);
                bwt0.n(c4u0Var.G, new zxo(this, 6));
            }
            List<com.vk.movika.sdk.base.model.i> list5 = this.l.d;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list5) {
                if (((com.vk.movika.sdk.base.model.i) obj3).b) {
                    arrayList5.add(obj3);
                }
            }
            size = arrayList5.size();
            arrayList = new ArrayList();
            for (Object obj4 : list3) {
                if (((com.vk.movika.sdk.base.model.i) obj4).b) {
                    arrayList.add(obj4);
                }
            }
            if (size < arrayList.size()) {
                U(ocxVar, true);
            }
            if (this.e || !this.d) {
            }
            axt0.a(c4u0Var.j, videoFile);
            return;
        }
        z2 = z8;
        l = l2;
        view = view4;
        vkImageSimple = vkImageSimple2;
        list3 = list2;
        lcx lcxVar3 = ((evs) p3hVar.c).q;
        if (lcxVar3 == null) {
        }
        lcx lcxVar22 = ((evs) p3hVar.c).q;
        if (lcxVar22 == null) {
        }
        if (k != null) {
            long longValue22 = g.longValue();
            defaultSeekBarView.setMaxCurrent(k.longValue());
            defaultSeekBarView.setCurrent(longValue22);
            defaultSeekBarView.setAlpha(((Number) N.d.invoke(Boolean.valueOf(po10.b(ocxVar.e, longValue22)))).floatValue());
        }
        N.i = ocxVar;
        c4u0Var.d.setImageAlpha(!epx.f(ocxVar.n, ocx.d.a.a) ? 255 : 102);
        c4u0Var.e.setImageAlpha(!epx.f(ocxVar.m, ocx.e.a.a) ? 255 : 102);
        if (chapter3 == null) {
        }
        VkImageSimple vkImageSimple42 = vkImageSimple;
        vkImageSimple42.setEnabled(!z10);
        vkImageSimple42.setImageAlpha(z10 ? 102 : 255);
        owo0Var2 = owo0Var;
        c4u0Var.N.setTimelineImages(owo0Var2);
        v3d0Var = (v3d0) this.V.getValue();
        v3d0Var.getClass();
        if (l != null) {
            v3d0Var.d(l.longValue());
        }
        v3d0Var.g(owo0Var2);
        bwt0.m0(-2, -2, v3d0Var.a().h);
        if (owo0Var2 != null) {
        }
        chapter = this.l.b;
        if (!epx.f(chapter == null ? chapter.a : null, chapter3 == null ? chapter3.a : null)) {
        }
        if (z) {
        }
        r6 = 0;
        if (z) {
        }
        view.setVisibility(4);
        List<com.vk.movika.sdk.base.model.i> list52 = this.l.d;
        ArrayList arrayList52 = new ArrayList();
        while (r2.hasNext()) {
        }
        size = arrayList52.size();
        arrayList = new ArrayList();
        while (r5.hasNext()) {
        }
        if (size < arrayList.size()) {
        }
        if (this.e) {
        }
    }

    public final void M() {
        this.C = false;
        this.E.o.removeCallbacks(this.N);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f3i0 N() {
        return (f3i0) this.W.getValue();
    }

    public boolean O() {
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6, xsna.rcx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void P(boolean z, boolean z2) {
        boolean z3;
        super.P(z, z2);
        W(z, z2);
        xcx xcxVar = (xcx) this.T.getValue();
        InteractiveData interactiveData = this.j;
        if ((interactiveData != null ? interactiveData.d : null) != InteractiveData.From.FULLSCREEN) {
            if ((interactiveData != null ? interactiveData.d : null) != InteractiveData.From.DISCOVER_VIDEO || !this.c) {
                z3 = false;
                c4u0 c4u0Var = xcxVar.a;
                f4m.t(iah0.a(!z ? 64 : 88), c4u0Var.L);
                xcxVar.b = z3;
                c4u0Var.D.j(new b95(1, xcxVar, xcx.class, "updateZoomValueText", "updateZoomValueText(F)V", 0, 6), new dhh(xcxVar, 27), z3);
                awt0.v(c4u0Var.v, z3);
                N().j(z2, this.B);
            }
        }
        z3 = true;
        c4u0 c4u0Var2 = xcxVar.a;
        f4m.t(iah0.a(!z ? 64 : 88), c4u0Var2.L);
        xcxVar.b = z3;
        c4u0Var2.D.j(new b95(1, xcxVar, xcx.class, "updateZoomValueText", "updateZoomValueText(F)V", 0, 6), new dhh(xcxVar, 27), z3);
        awt0.v(c4u0Var2.v, z3);
        N().j(z2, this.B);
    }

    public final void Q(boolean z) {
        ConstraintLayout constraintLayout = this.E.o;
        M();
        V(false, z);
        C(new rcx.d.e(false, z));
        this.C = false;
    }

    public final void S(boolean z) {
        c4u0 c4u0Var = this.E;
        ConstraintLayout constraintLayout = c4u0Var.o;
        M();
        ocx.c cVar = this.l.f;
        if (!(cVar instanceof ocx.c.a) || ((ocx.c.a) cVar).a) {
            V(true, z);
            if (z && this.l.a.a) {
                c4u0Var.o.postDelayed(this.N, 3000L);
            }
            C(new rcx.d.e(true, z));
        }
    }

    public final void T(boolean z) {
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.E.H.getDrawable();
        if (z) {
            animatedVectorDrawable.setVisible(true, true);
            animatedVectorDrawable.start();
        } else {
            animatedVectorDrawable.setVisible(false, false);
            animatedVectorDrawable.stop();
        }
    }

    public final void U(ocx ocxVar, boolean z) {
        ocx.b bVar;
        ocx.b bVar2;
        View view = this.E.I;
        sd sdVar = this.O;
        if (ocxVar != null && (bVar2 = ocxVar.a) != null && bVar2.a && !this.D) {
            this.D = true;
            view.postDelayed(sdVar, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
        } else {
            if ((ocxVar == null || (bVar = ocxVar.a) == null || bVar.a) && !z) {
                return;
            }
            this.D = false;
            view.removeCallbacks(sdVar);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void V(boolean z, boolean z2) {
        b4i b4iVar = new b4i(this, z, 1 == true ? 1 : 0);
        this.B = z;
        a(new acx.j(z));
        c4u0 c4u0Var = this.E;
        if (bwt0.K(c4u0Var.o) != z) {
            if (z2) {
                int i = 8;
                if (z) {
                    d3m.c(c4u0Var.o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new sm9(b4iVar, 8), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    d3m.e(c4u0Var.o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new tw3(b4iVar, i), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
            } else {
                awt0.u(c4u0Var.o, z);
                b4iVar.invoke();
                s3q0 s3q0Var = s3q0.a;
            }
            f3i0 N = N();
            boolean z3 = this.c;
            c4u0 c4u0Var2 = N.b;
            if (N.g) {
                if (z2) {
                    cdi.u(c4u0Var2.g.getThumb(), 6, z ? 1.0f : 0.0f);
                    if (z3) {
                        if (z) {
                            d3m.c(c4u0Var2.g, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } else {
                            d3m.e(c4u0Var2.g, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                        }
                    }
                } else {
                    c4u0Var2.g.getThumb().setAlpha(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (z3) {
                        awt0.u(c4u0Var2.g, z);
                    }
                }
                if (z3) {
                    N.h(z);
                }
            }
        }
        ((bbx) this.U.getValue()).a(this.l.a.a && !z, z2);
    }

    public final void W(boolean z, boolean z2) {
        c4u0 c4u0Var = this.E;
        if (!z2) {
            f4m.u(c4u0Var.I, 0, 0, 0, 0);
        } else if (z) {
            f4m.u(c4u0Var.I, 0, cn70.b(24), cn70.b(32), 0);
        } else {
            f4m.u(c4u0Var.I, 0, cn70.b(52), cn70.b(20), 0);
        }
    }

    @Override // xsna.ef6, xsna.rcx
    public final void b3(boolean z) {
        ocx.a aVar;
        f3i0 N = N();
        N.q = z;
        DefaultSeekBarView defaultSeekBarView = N.k;
        defaultSeekBarView.getThumb().setEnabled(z && N.p);
        ocx ocxVar = N.i;
        if (ocxVar == null || (aVar = ocxVar.u) == null || !aVar.a || N.q || !N.h) {
            return;
        }
        defaultSeekBarView.getThumb().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        N.a(false);
    }

    @Override // xsna.ef6, xsna.rcx
    public final void destroy() {
        super.destroy();
        this.E.o.removeCallbacks(this.N);
        U(null, true);
        r6p0 r6p0Var = this.K;
        r6p0Var.a();
        ikv0 ikv0Var = r6p0Var.e;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        r6p0Var.e = null;
        this.J.clearAnimation();
    }

    @Override // xsna.mnt0
    public com.vk.libvideo.autoplay.a getVideoConfig() {
        return this.x;
    }

    @Override // xsna.rcx
    public final View getView() {
        return this.y;
    }

    @Override // xsna.ef6, xsna.rcx
    public final void j2(boolean z, boolean z2) {
        if (z) {
            S(z2);
        } else {
            Q(z2);
        }
    }

    @Override // xsna.ef6, xsna.rcx
    public final boolean o4() {
        return this.K.b.c != null;
    }

    @Override // xsna.ef6
    public final af6 q() {
        return this.M;
    }

    @Override // xsna.ef6
    public VKImageView r() {
        return this.G;
    }

    @Override // xsna.ef6
    public final View s() {
        return this.H;
    }

    @Override // xsna.ef6, xsna.rcx
    public final void s2() {
        this.K.a();
    }

    @Override // xsna.ef6
    public final VkSimpleButton t() {
        return this.F;
    }

    @Override // xsna.ef6, xsna.rcx
    public void t1(VideoFile videoFile) {
        super.t1(videoFile);
        VideoEndView.a c = new djs0(videoFile).c();
        VideoEndView videoEndView = this.E.y;
        int i = VideoEndView.z;
        videoEndView.c(c, false);
    }

    @Override // xsna.ef6
    public final ViewGroup u() {
        return this.J;
    }

    @Override // xsna.ef6
    public final InteractiveDurationView v() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6, xsna.rcx
    public void y0(InteractiveData interactiveData) {
        OneVideoPlayer a2;
        VideoFile videoFile = interactiveData.a;
        InteractiveData interactiveData2 = this.j;
        VideoFile videoFile2 = interactiveData2 != null ? interactiveData2.a : null;
        String r1 = videoFile.r1();
        String r12 = videoFile2 != null ? videoFile2.r1() : null;
        boolean z = videoFile2 != null && videoFile.X() == videoFile2.X();
        boolean z2 = videoFile2 != null && videoFile.O9() == videoFile2.O9();
        if ((!z || !z2) && epx.f(r1, r12)) {
            t1(videoFile);
        }
        super.y0(interactiveData);
        ebs0 ebs0Var = interactiveData.g;
        this.z = ebs0Var != null ? new fbs0(ebs0Var) : null;
        VideoEndView videoEndView = this.E.y;
        VideoEndView.a c = new djs0(videoFile).c();
        int i = VideoEndView.z;
        videoEndView.c(c, false);
        fbs0 fbs0Var = this.z;
        if (fbs0Var != null) {
            videoEndView.setButtonsOnClickListener(fbs0Var);
        }
        if (O()) {
            bwt0.S(this.y, new m9(17, this, interactiveData));
        }
        W(this.b, interactiveData.d == InteractiveData.From.FULLSCREEN);
        a(new acx.o(this.w));
        lcx lcxVar = this.q;
        if (lcxVar != null) {
            bmq bmqVar = (bmq) this.X.getValue();
            bmqVar.e = lcxVar;
            d3b0 f = lcxVar.f();
            if (f == null || (a2 = f.a()) == null) {
                return;
            }
            a2.d0(bmqVar.f);
        }
    }

    @Override // xsna.ef6
    public final VideoTextureView z() {
        return this.I;
    }
}
