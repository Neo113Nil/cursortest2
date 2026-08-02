package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.donut.video.model.domain.video.DonutVideoModel;
import com.vk.dto.common.DownloadRestrictionReason;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.offline.ui.VideoAnimatedDownloadingDelegate;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.exo.offline.DownloadInfo;
import xsna.dw20;
import xsna.erv;
import xsna.kv70;
import xsna.s9t0;

/* compiled from: VideoDownloadView.kt */
/* loaded from: classes6.dex */
public final class dis0 extends FrameLayout implements uys0 {
    public static final Object t;
    public static final Object u;
    public static final Object v;
    public VideoAnimatedDownloadingDelegate b;
    public final ImageView c;
    public final VkSpinner d;
    public final ImageView e;
    public VkSpinner f;
    public final Drawable g;
    public VideoFile h;
    public dw20 i;
    public boolean j;
    public gzs<s3q0> k;
    public s9t0 l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public boolean o;
    public boolean p;
    public Integer q;
    public final Object r;
    public final Object s;

    /* compiled from: VideoDownloadView.kt */
    public static final class a {

        /* compiled from: VideoDownloadView.kt */
        /* renamed from: xsna.dis0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2739a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DownloadInfo.State.values().length];
                try {
                    iArr[DownloadInfo.State.STATE_REMOVING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DownloadInfo.State.STATE_FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DownloadInfo.State.STATE_COMPLETED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [T, io.reactivex.rxjava3.disposables.c] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, xsna.dw20] */
        public static dw20 a(VideoFile videoFile, Activity activity, boolean z, final boolean z2, final boolean z3, boolean z4) {
            int i;
            Context context;
            DownloadInfo x;
            final kv70.a aVar = new kv70.a(activity, videoFile);
            final VideoScreenMode videoScreenMode = VideoScreenMode.DISCOVERY;
            boolean z5 = z && fxc0.B().J().I0();
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            VideoFile videoFile2 = aVar.e;
            String a = (!z5 || (x = fxc0.B().s().x(videoFile2)) == null) ? null : lv70.a(x, aVar.f);
            Context context2 = aVar.c;
            boolean A0 = fxc0.B().J().A0();
            ListBuilder e = e43.e();
            if (z4) {
                int ordinal = r720.OpenDownloads.ordinal();
                if (z2) {
                    i = 0;
                    lpj lpjVar = context2 instanceof lpj ? (lpj) context2 : null;
                    Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                    dhr0.a.getClass();
                    int i2 = dhr0.u().c;
                    if (valueOf == null || valueOf.intValue() != i2) {
                        context = new l7s(context2, dhr0.u().c);
                        e.add(new brj0(ordinal, R.drawable.vk_icon_download_check_outline_28, null, R.string.video_open_downloaded, null, false, false, null, 0, Integer.valueOf(dhr0.Y(R.attr.vk_ui_icon_accent_themed, context)), null, null, null, null, 130036));
                    }
                } else {
                    i = 0;
                }
                context = context2;
                e.add(new brj0(ordinal, R.drawable.vk_icon_download_check_outline_28, null, R.string.video_open_downloaded, null, false, false, null, 0, Integer.valueOf(dhr0.Y(R.attr.vk_ui_icon_accent_themed, context)), null, null, null, null, 130036));
            } else {
                i = 0;
            }
            if (A0 && z) {
                int ordinal2 = r720.PauseResume.ordinal();
                int i3 = z3 ? R.string.video_download_pause : R.string.video_download_resume;
                int i4 = z3 ? R.drawable.vk_icon_pause_outline_28 : R.drawable.vk_icon_play_outline_28;
                if (z2) {
                    lpj lpjVar2 = context2 instanceof lpj ? (lpj) context2 : null;
                    Integer valueOf2 = lpjVar2 != null ? Integer.valueOf(lpjVar2.getThemeResId()) : null;
                    dhr0.a.getClass();
                    int i5 = dhr0.u().c;
                    if (valueOf2 == null || valueOf2.intValue() != i5) {
                        context2 = new l7s(context2, dhr0.u().c);
                    }
                }
                e.add(new brj0(ordinal2, i4, null, i3, null, false, false, null, 0, Integer.valueOf(dhr0.Y(R.attr.vk_ui_icon_accent_themed, context2)), null, null, null, null, 130036));
            }
            e.add(new brj0(r720.Remove.ordinal(), z ? R.drawable.vk_icon_cancel_outline_28 : A0 ? R.drawable.vk_icon_delete_saved_outline_28 : R.drawable.vk_icon_download_cancel_outline_28, null, z ? R.string.video_download_cancel : R.string.video_download_item_popup_delete, null, true, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126900));
            ListBuilder g = e.g();
            dw20.b a0 = new dw20.b(aVar.c, null).a0(new iv70(ref$ObjectRef2, 0));
            if (z2) {
                dhr0.a.getClass();
                a0.u0(dhr0.u().c);
            }
            dw20.b bVar = a0;
            bVar.w0(videoFile2.getTitle());
            e.a aVar2 = bVar.d;
            bVar.z0(8388611);
            bVar.A0(Integer.valueOf(R.style.VkUiTypography_FootnoteMedium));
            bVar.B0(Integer.valueOf(cn70.b(12)));
            bVar.x0(Integer.valueOf(z ? cn70.b(8) : cn70.b(16)));
            bVar.y0(e3m.f(R.attr.vk_ui_text_subhead, bVar.c));
            if (z5) {
                if (a == null) {
                    a = "";
                }
                bVar.s0(a);
                aVar2.e0 = 8388611;
                aVar2.d0 = Integer.valueOf(R.style.VkUiTypography_Footnote);
                aVar2.f0 = Integer.valueOf(i);
                aVar2.g0 = Integer.valueOf(cn70.b(16));
                bVar.t0(e3m.f(R.attr.vk_ui_text_subhead, bVar.c));
            }
            ref$ObjectRef.element = bVar.P(g, new izs(videoScreenMode, z2, z3, ref$ObjectRef) { // from class: xsna.jv70
                public final /* synthetic */ VideoScreenMode c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Ref$ObjectRef e;

                {
                    this.d = z3;
                    this.e = ref$ObjectRef;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    kv70.a aVar3 = kv70.a.this;
                    VideoFile videoFile3 = aVar3.e;
                    int i6 = ((brj0) obj).a;
                    int ordinal3 = r720.Remove.ordinal();
                    VideoScreenMode videoScreenMode2 = this.c;
                    if (i6 == ordinal3) {
                        fxc0.B().L(videoFile3, videoScreenMode2);
                    } else if (i6 == r720.PauseResume.ordinal()) {
                        if (this.d) {
                            fxc0.B().s().n(videoFile3, videoScreenMode2);
                        } else {
                            fxc0.B().s().d(videoFile3, videoScreenMode2);
                        }
                    } else if (i6 == r720.OpenDownloads.ordinal()) {
                        fxc0.B().Y().D(aVar3.c, true);
                    }
                    dw20 dw20Var = (dw20) this.e.element;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                    return s3q0.a;
                }
            }).I0(null);
            if (z5) {
                ref$ObjectRef2.element = fxc0.B().s().B().subscribe(new wx00(new ml1(18, aVar, ref$ObjectRef), 6));
            }
            return (dw20) ref$ObjectRef.element;
        }

        public static /* synthetic */ dw20 b(VideoFile videoFile, Activity activity, boolean z, boolean z2, boolean z3, int i) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            if ((i & 16) != 0) {
                z3 = false;
            }
            return a(videoFile, activity, z, z2, z3, (i & 32) == 0);
        }
    }

    /* compiled from: VideoDownloadView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadRestrictionReason.values().length];
            try {
                iArr[DownloadRestrictionReason.AUTHOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadRestrictionReason.LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadRestrictionReason.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DownloadRestrictionReason.TECHNICAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DownloadRestrictionReason.PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        uh80 uh80Var = new uh80(12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        t = msy.a(lazyThreadSafetyMode, uh80Var);
        u = msy.a(lazyThreadSafetyMode, new xbj0(6));
        v = msy.a(lazyThreadSafetyMode, new vo50(22));
    }

    public dis0(Context context) {
        super(context, null, 0);
        this.g = getContext().getDrawable(R.drawable.vk_icon_download_check_outline_24);
        this.l = s9t0.c.a;
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        ejf0 ejf0Var = new ejf0(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, ejf0Var);
        this.s = msy.a(lazyThreadSafetyMode, new fyd0(this, 18));
        LayoutInflater.from(context).inflate(R.layout.video_download_progress_view, (ViewGroup) this, true);
        this.c = (ImageView) findViewById(R.id.action_view);
        this.d = (VkSpinner) findViewById(R.id.download_progress_view);
        this.e = (ImageView) findViewById(R.id.download_progress_action_view);
        g(erv.b.a);
        f4m.j(this);
    }

    public static s3q0 d(dis0 dis0Var, DonutVideoModel donutVideoModel) {
        dis0Var.getAboutVideoActionHandler().a(dis0Var.getContext(), donutVideoModel);
        return s3q0.a;
    }

    public static String e(VideoFile videoFile) {
        return fxc0.B().s().v(videoFile.r1());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final w6 getAboutVideoActionHandler() {
        return (w6) this.r.getValue();
    }

    private final boolean getShouldShowNotDownloadableDrawable() {
        VideoFile videoFile = this.h;
        return (videoFile == null || gpt0.x(videoFile) || !fxc0.B().J().h()) ? false : true;
    }

    @Override // xsna.uys0
    public final void a(VideoFile videoFile) {
        this.h = videoFile;
        if (this.b != null) {
            s9t0 s9t0Var = (s9t0) this.m.get(videoFile.r1());
            if (s9t0Var != null) {
                c(s9t0Var, e(videoFile));
            } else {
                c(this.l, e(videoFile));
            }
        }
    }

    @Override // xsna.uys0
    public final void b(prq0 prq0Var, wmd0 wmd0Var) {
        bwt0.l(this, 500L, new v63(this, prq0Var, wmd0Var, 13), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uys0
    public final void c(s9t0 s9t0Var, String str) {
        int i;
        int i2;
        String str2;
        VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate = this.b;
        LinkedHashMap linkedHashMap = this.m;
        if (videoAnimatedDownloadingDelegate != null) {
            this.l = s9t0Var;
            if (str != null) {
                linkedHashMap.put(str, s9t0Var);
            }
        }
        VideoFile videoFile = this.h;
        if (videoFile == null) {
            return;
        }
        if (this.b != null) {
            linkedHashMap.put(e(videoFile), s9t0Var);
            if (str != null) {
                VideoFile videoFile2 = this.h;
                if (videoFile2 == null) {
                    videoFile2 = null;
                }
                if (!epx.f(e(videoFile2), str)) {
                    return;
                }
            }
        }
        VideoFile videoFile3 = this.h;
        if (videoFile3 == null) {
            videoFile3 = null;
        }
        VideoRestriction O = videoFile3.O();
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = O != null && e5o.b(O) && ((Boolean) this.s.getValue()).booleanValue();
        VideoFile videoFile4 = this.h;
        if (videoFile4 == null) {
            videoFile4 = null;
        }
        if (gpt0.D(videoFile4) || objArr2 == true) {
            zxf0 b0 = fxc0.B().b0();
            VideoFile videoFile5 = this.h;
            if (videoFile5 == null) {
                videoFile5 = null;
            }
            if (b0.e(videoFile5)) {
                return;
            }
            VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate2 = this.b;
            if (videoAnimatedDownloadingDelegate2 != null) {
                videoAnimatedDownloadingDelegate2.a = s9t0Var instanceof s9t0.a;
            }
            if (videoAnimatedDownloadingDelegate2 != null) {
                VideoFile videoFile6 = this.h;
                if (videoFile6 == null) {
                    videoFile6 = null;
                }
                videoAnimatedDownloadingDelegate2.f = videoFile6;
            }
            setVisibility(0);
            if (!(s9t0Var instanceof s9t0.a)) {
                boolean z2 = s9t0Var instanceof s9t0.d;
                g((z2 && ((s9t0.d) s9t0Var).b) ? erv.a.a : (!z2 || ((s9t0.d) s9t0Var).c) ? ((s9t0Var instanceof s9t0.c) && getShouldShowNotDownloadableDrawable()) ? erv.c.a : erv.b.a : erv.d.a);
            }
            VkSpinner vkSpinner = this.f;
            if (vkSpinner != null) {
                vkSpinner.setVisibility(4);
            }
            boolean f = epx.f(s9t0Var, s9t0.c.a);
            int i3 = 12;
            LinkedHashMap linkedHashMap2 = this.n;
            ImageView imageView = this.e;
            VkSpinner vkSpinner2 = this.d;
            ImageView imageView2 = this.c;
            if (f) {
                setClickable(true);
                VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate3 = this.b;
                if (videoAnimatedDownloadingDelegate3 != null) {
                    videoAnimatedDownloadingDelegate3.a();
                }
                vkSpinner2.setVisibility(8);
                imageView.setVisibility(8);
                imageView2.setVisibility(0);
                VideoFile videoFile7 = this.h;
                if (videoFile7 == null) {
                    videoFile7 = null;
                }
                DonutVideoModel a2 = nkt0.a(videoFile7);
                if (getAboutVideoActionHandler().b(a2)) {
                    imageView2.setImageResource(R.drawable.vk_icon_download_cross_badge_outline_24);
                    jjc.g(this, new cis0(objArr == true ? 1 : 0, this, a2));
                } else if (getShouldShowNotDownloadableDrawable()) {
                    imageView2.setImageResource(R.drawable.vk_icon_download_cross_badge_outline_24);
                    jjc.g(this, new ptl0(this, i3));
                } else {
                    imageView2.setImageResource(R.drawable.vk_icon_download_outline_24);
                    jjc.g(this, new pod0(this, 27));
                }
            } else if (epx.f(s9t0Var, s9t0.b.a)) {
                VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate4 = this.b;
                if (videoAnimatedDownloadingDelegate4 != null) {
                    videoAnimatedDownloadingDelegate4.a();
                }
                vkSpinner2.setVisibility(8);
                imageView.setVisibility(8);
                imageView2.setVisibility(0);
                imageView2.setImageDrawable(getContext().getDrawable(R.drawable.vk_icon_replay_24));
                jjc.g(this, new i0b0(this, 26));
            } else if (epx.f(s9t0Var, s9t0.e.a)) {
                VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate5 = this.b;
                if (videoAnimatedDownloadingDelegate5 != null) {
                    videoAnimatedDownloadingDelegate5.a();
                }
                vkSpinner2.setVisibility(8);
                imageView.setVisibility(8);
                imageView2.setVisibility(0);
                imageView2.setImageDrawable(getContext().getDrawable(R.drawable.vk_icon_download_dashed_outline_16));
                jjc.g(this, new mdk0(this, i3));
            } else if (s9t0Var instanceof s9t0.d) {
                s9t0.d dVar = (s9t0.d) s9t0Var;
                int i4 = dVar.a;
                VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate6 = this.b;
                if (videoAnimatedDownloadingDelegate6 != null) {
                    VideoFile videoFile8 = this.h;
                    if (videoFile8 == null) {
                        videoFile8 = null;
                    }
                    VkSpinner vkSpinner3 = videoAnimatedDownloadingDelegate6.k;
                    LottieAnimationView lottieAnimationView = videoAnimatedDownloadingDelegate6.l;
                    String a1 = videoFile8.a1();
                    VideoFile videoFile9 = videoAnimatedDownloadingDelegate6.g;
                    if (videoFile9 == null || (str2 = videoFile9.a1()) == null) {
                        str2 = "";
                    }
                    videoAnimatedDownloadingDelegate6.d = !epx.f(a1, str2);
                    videoAnimatedDownloadingDelegate6.e = videoFile8;
                    videoAnimatedDownloadingDelegate6.c = !(videoAnimatedDownloadingDelegate6.b instanceof s9t0.d);
                    ValueAnimator valueAnimator = videoAnimatedDownloadingDelegate6.i;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (videoAnimatedDownloadingDelegate6.d) {
                        float f2 = i4;
                        videoAnimatedDownloadingDelegate6.h = f2;
                        vkSpinner3.setProgress((int) f2);
                    } else if (videoAnimatedDownloadingDelegate6.c) {
                        videoAnimatedDownloadingDelegate6.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        vkSpinner3.setProgress((int) UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        lottieAnimationView.invalidate();
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(videoAnimatedDownloadingDelegate6.h, i4);
                        videoAnimatedDownloadingDelegate6.i = ofFloat;
                        if (ofFloat != null) {
                            ofFloat.setDuration(1000L);
                        }
                        ValueAnimator valueAnimator2 = videoAnimatedDownloadingDelegate6.i;
                        if (valueAnimator2 != null) {
                            valueAnimator2.setInterpolator(new LinearInterpolator());
                        }
                        ValueAnimator valueAnimator3 = videoAnimatedDownloadingDelegate6.i;
                        if (valueAnimator3 != null) {
                            valueAnimator3.addUpdateListener(new uaa0(videoAnimatedDownloadingDelegate6, 1));
                        }
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(videoAnimatedDownloadingDelegate6.h, i4);
                        videoAnimatedDownloadingDelegate6.i = ofFloat2;
                        if (ofFloat2 != null) {
                            ofFloat2.setDuration(1000L);
                        }
                        ValueAnimator valueAnimator4 = videoAnimatedDownloadingDelegate6.i;
                        if (valueAnimator4 != null) {
                            valueAnimator4.setInterpolator(new LinearInterpolator());
                        }
                        ValueAnimator valueAnimator5 = videoAnimatedDownloadingDelegate6.i;
                        if (valueAnimator5 != null) {
                            valueAnimator5.addUpdateListener(new vaa0(videoAnimatedDownloadingDelegate6, 1));
                        }
                        ValueAnimator valueAnimator6 = videoAnimatedDownloadingDelegate6.i;
                        if (valueAnimator6 != null) {
                            valueAnimator6.start();
                        }
                    }
                    z = false;
                    vkSpinner3.setVisibility(0);
                    videoAnimatedDownloadingDelegate6.j.setVisibility(8);
                    if (dVar.b) {
                        lottieAnimationView.setRepeatCount(-1);
                        lottieAnimationView.p0();
                    } else {
                        lottieAnimationView.setRepeatCount(0);
                    }
                    lottieAnimationView.setVisibility(0);
                    i2 = 8;
                } else {
                    i2 = 8;
                }
                imageView2.setVisibility(i2);
                vkSpinner2.setIndeterminate(z);
                vkSpinner2.setProgress(i4);
                int i5 = ((Boolean) t.getValue()).booleanValue() ? R.drawable.vk_icon_arrow_down_12 : R.drawable.vk_icon_cancel_16;
                if (this.b == null) {
                    imageView.setVisibility(0);
                    vkSpinner2.setVisibility(0);
                    imageView.setImageDrawable(getContext().getDrawable(i5));
                } else {
                    vkSpinner2.setVisibility(8);
                    imageView.setVisibility(8);
                }
                jjc.g(this, new yl0(28, this, dVar));
            } else {
                if (!epx.f(s9t0Var, s9t0.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate7 = this.b;
                if (videoAnimatedDownloadingDelegate7 != null) {
                    ValueAnimator valueAnimator7 = videoAnimatedDownloadingDelegate7.i;
                    if (valueAnimator7 != null) {
                        valueAnimator7.cancel();
                    }
                    videoAnimatedDownloadingDelegate7.i = ValueAnimator.ofFloat(videoAnimatedDownloadingDelegate7.h, 100.0f);
                    float progress = videoAnimatedDownloadingDelegate7.l.getProgress() * 1500;
                    ValueAnimator valueAnimator8 = videoAnimatedDownloadingDelegate7.i;
                    if (valueAnimator8 != null) {
                        long c = 1400 - an10.c(progress);
                        if (c < 0) {
                            c = 0;
                        }
                        valueAnimator8.setDuration(c);
                    }
                    ValueAnimator valueAnimator9 = videoAnimatedDownloadingDelegate7.i;
                    if (valueAnimator9 != null) {
                        valueAnimator9.setInterpolator(new LinearInterpolator());
                    }
                    ValueAnimator valueAnimator10 = videoAnimatedDownloadingDelegate7.i;
                    if (valueAnimator10 != null) {
                        valueAnimator10.addUpdateListener(new osv(videoAnimatedDownloadingDelegate7, 2));
                    }
                    ValueAnimator valueAnimator11 = videoAnimatedDownloadingDelegate7.i;
                    if (valueAnimator11 != null) {
                        valueAnimator11.start();
                    }
                }
                VideoFile videoFile10 = this.h;
                if (videoFile10 == null) {
                    videoFile10 = null;
                }
                if (((s9t0) linkedHashMap2.get(e(videoFile10))) instanceof s9t0.d) {
                    VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate8 = this.b;
                    if (videoAnimatedDownloadingDelegate8 != null) {
                        videoAnimatedDownloadingDelegate8.l.setRepeatCount(0);
                    }
                    i = 8;
                    imageView2.setVisibility(8);
                } else {
                    VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate9 = this.b;
                    if (videoAnimatedDownloadingDelegate9 != null) {
                        videoAnimatedDownloadingDelegate9.a();
                    }
                    g(erv.b.a);
                    imageView2.setVisibility(0);
                    imageView2.setImageDrawable(this.g);
                    i = 8;
                }
                vkSpinner2.setVisibility(i);
                imageView.setVisibility(i);
                jjc.g(this, new u2k0(this, 20));
            }
            VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate10 = this.b;
            if (videoAnimatedDownloadingDelegate10 != null) {
                videoAnimatedDownloadingDelegate10.b = s9t0Var;
            }
            if (videoAnimatedDownloadingDelegate10 != null) {
                VideoFile videoFile11 = this.h;
                if (videoFile11 == null) {
                    videoFile11 = null;
                }
                videoAnimatedDownloadingDelegate10.g = videoFile11;
            }
            VideoFile videoFile12 = this.h;
            linkedHashMap2.put(e(videoFile12 == null ? null : videoFile12), s9t0Var);
        }
    }

    public final int f(erv ervVar) {
        if (epx.f(ervVar, erv.a.a)) {
            Integer num = this.q;
            if (num != null) {
                return num.intValue();
            }
            dhr0 dhr0Var = dhr0.a;
            Context context = getContext();
            dhr0Var.getClass();
            return dhr0.Y(R.attr.vk_ui_icon_accent_themed, dhr0.t(context));
        }
        if (epx.f(ervVar, erv.c.a)) {
            dhr0 dhr0Var2 = dhr0.a;
            Context context2 = getContext();
            dhr0Var2.getClass();
            return dhr0.Y(R.attr.vk_ui_icon_tertiary, dhr0.t(context2));
        }
        if (epx.f(ervVar, erv.d.a)) {
            dhr0 dhr0Var3 = dhr0.a;
            Context context3 = getContext();
            dhr0Var3.getClass();
            return dhr0.Y(R.attr.vk_ui_icon_medium, dhr0.t(context3));
        }
        if (!epx.f(ervVar, erv.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Integer num2 = this.q;
        if (num2 != null) {
            return num2.intValue();
        }
        dhr0 dhr0Var4 = dhr0.a;
        Context context4 = getContext();
        dhr0Var4.getClass();
        return dhr0.Y(R.attr.vk_ui_icon_medium, dhr0.t(context4));
    }

    public final void g(erv ervVar) {
        int f = f(ervVar);
        this.c.setColorFilter(f);
        ColorStateList valueOf = ColorStateList.valueOf(f);
        VkSpinner vkSpinner = this.d;
        vkSpinner.setIndeterminateTintList(valueOf);
        vkSpinner.setProgressTintList(ColorStateList.valueOf(f));
        this.e.setColorFilter(f);
        VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate = this.b;
        if (videoAnimatedDownloadingDelegate != null) {
            videoAnimatedDownloadingDelegate.b(f, Collections.singleton(VideoAnimatedDownloadingDelegate.AnimationType.PROGRESS));
        }
    }

    public final void h(gzs<s3q0> gzsVar) {
        Context b2 = enj.b(this);
        if (b2 == null) {
            b2 = getContext();
        }
        Context context = b2;
        gzs<s3q0> gzsVar2 = this.k;
        if (gzsVar2 != null) {
            gzsVar2.invoke();
        }
        VideoFile videoFile = this.h;
        if (videoFile == null) {
            videoFile = null;
        }
        if (gpt0.x(videoFile)) {
            g7s0 B = fxc0.B();
            VideoFile videoFile2 = this.h;
            if (videoFile2 == null) {
                videoFile2 = null;
            }
            g7s0.e(B, context, videoFile2, VideoScreenMode.DISCOVERY, this.j, gzsVar, 48);
            return;
        }
        if (e3m.h(context) == null) {
            c63 c63Var = c63.a;
            context = c63.b();
        }
        if (context != null) {
            VideoFile videoFile3 = this.h;
            if (videoFile3 == null) {
                videoFile3 = null;
            }
            bfs0.b(context, videoFile3, null);
        }
    }

    @Override // xsna.uys0
    public final boolean isVisible() {
        return getVisibility() == 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (((Boolean) u.getValue()).booleanValue() && !this.o) {
            this.o = true;
            VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate = new VideoAnimatedDownloadingDelegate(((ViewStub) findViewById(R.id.animated_downloads_view_stub)).inflate());
            this.b = videoAnimatedDownloadingDelegate;
            videoAnimatedDownloadingDelegate.b(f(erv.b.a), Collections.singleton(VideoAnimatedDownloadingDelegate.AnimationType.PROGRESS));
        }
        if (!((Boolean) v.getValue()).booleanValue() || this.p) {
            return;
        }
        this.p = true;
        View inflate = ((ViewStub) findViewById(R.id.getting_qualities_view_stub)).inflate();
        VkSpinner vkSpinner = inflate instanceof VkSpinner ? (VkSpinner) inflate : null;
        this.f = vkSpinner;
        if (vkSpinner != null) {
            dhr0 dhr0Var = dhr0.a;
            Context context = getContext();
            dhr0Var.getClass();
            vkSpinner.setIndeterminateTintList(ColorStateList.valueOf(dhr0.Y(R.attr.vk_ui_icon_accent_themed, dhr0.t(context))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dw20 dw20Var = this.i;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    @Override // xsna.uys0
    public void setDarkContextMenus(boolean z) {
        this.j = z;
    }

    @Override // xsna.uys0
    public void setOnDownloadVideoClicked(gzs<s3q0> gzsVar) {
        this.k = gzsVar;
    }

    @Override // xsna.uys0
    public void setTint(int i) {
        this.q = Integer.valueOf(i);
        g(erv.b.a);
        VideoAnimatedDownloadingDelegate videoAnimatedDownloadingDelegate = this.b;
        if (videoAnimatedDownloadingDelegate != null) {
            videoAnimatedDownloadingDelegate.b(i, j5g.S0(VideoAnimatedDownloadingDelegate.AnimationType.h()));
        }
    }

    @Override // xsna.uys0
    public void setVisible(boolean z) {
        awt0.v(this, z);
    }
}
