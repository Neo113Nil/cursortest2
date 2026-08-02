package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.preview.ClipsVideoAndPhotoView;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.clips.upload.edit.api.preview.PreviewThumbs;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.media.filters.model.FilterItem;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$IntRef;
import one.video.player.OneVideoPlayer;
import xsna.tlo0;
import xsna.x4d0;

/* compiled from: ClipsChoosePreviewViewImpl.kt */
/* loaded from: classes16.dex */
public final class cmd extends ConstraintLayout implements amd {
    public final Object A;
    public final Object B;
    public zld C;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: ClipsChoosePreviewViewImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<ArrayList<Bitmap>> {
        @Override // xsna.gzs
        public final ArrayList<Bitmap> invoke() {
            return ((cmd) this.receiver).getPreviewsFromVideo();
        }
    }

    public cmd(lpj lpjVar) {
        super(lpjVar);
        g5 g5Var = new g5(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, g5Var);
        this.u = msy.a(lazyThreadSafetyMode, new ic(this, 24));
        this.v = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 26));
        this.w = msy.a(lazyThreadSafetyMode, new h9(this, 20));
        this.x = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.presenter.b(this, 13));
        this.y = msy.a(lazyThreadSafetyMode, new defpackage.j(this, 18));
        this.z = msy.a(lazyThreadSafetyMode, new defpackage.k(this, 14));
        this.A = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 18));
        this.B = msy.a(lazyThreadSafetyMode, new ac(this, 17));
        LayoutInflater.from(lpjVar).inflate(R.layout.clips_choosee_preview_with_gallery_layout, this);
        setBackgroundResource(R.color.vk_black);
        int a2 = e3m.a(R.dimen.clips_choose_cover_hor_padding, lpjVar);
        f4m.l(a2, a2, this);
        MultiVideoTimelineView timelineView = getTimelineView();
        timelineView.setUseMiddleKeyframe(true);
        timelineView.setUseKeepFrameRatio(true);
        timelineView.setUseSeparatedFragmentsDesign(false);
        timelineView.m0 = MultiVideoTimelineView.z0;
        timelineView.n0 = false;
        timelineView.setMoveProgressByTap(false);
        timelineView.x0 = false;
        timelineView.e0 = false;
        timelineView.setMinProgressRangeMs(0L);
        timelineView.setMoveProgressByTap(true);
        timelineView.e0 = true;
        timelineView.setProgressLeft(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        timelineView.setProgressRight(1.0f);
        timelineView.setHorizontalOffset(0);
        timelineView.setMaxBoundWidth(0);
        timelineView.setLeftClipHorizontalOffset(0);
        timelineView.setRightClipHorizontalOffset(Math.max(0, timelineView.getHorizontalOffset() * 2));
        getTimelineView().setExternalFilterToBitmapProvider(new dmd(3, this, cmd.class, "applyFilterToBitmap", "applyFilterToBitmap(Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/vk/editor/filters/correction/model/FilterType;)Landroid/graphics/Bitmap;", 0));
        jjc.g(getChoosePreviewFromGallery(), new pz(this, 17));
        getPhotoThumbView().setClipToOutline(true);
        getPhotoThumbView().setOutlineProvider(new t0w0(6, iah0.b(8.0f), false, false));
        jjc.g(getPhotoThumbView(), new yad(this, 1));
        jjc.g(getCancelBtn(), new sz(this, 19));
        jjc.g(getDoneBtn(), new iz0(this, 10));
        VkPlaceholder errorPlaceholder = getErrorPlaceholder();
        errorPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_globe_cross_outline_56), new x7g(R.attr.vk_ui_icon_secondary), null, 4));
        errorPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.clips_choose_preview_no_network_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.clips_choose_preview_no_network_description))));
        VkPlaceholder.a.C0857a.C0858a c0858a = null;
        VkPlaceholder.a.C0857a.C0858a c0858a2 = null;
        VkButton.Size size = null;
        VkPlaceholder.a.C0857a c0857a = null;
        errorPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.clips_choose_preview_no_network_retry_action), (gzs) new yh(this, 24), c0858a, c0858a2, size, VkButton.Mode.Tertiary, (VkButton.Appearance) null, false, 444), c0857a, c0857a, null, 8));
    }

    public static s3q0 P4(cmd cmdVar) {
        OneVideoPlayer oneVideoPlayer;
        cmdVar.getErrorPlaceholder().setVisibility(4);
        cmdVar.getContentBlock().setVisibility(0);
        zld zldVar = cmdVar.C;
        if (zldVar != null && (zldVar.e instanceof x4d0.b) && (oneVideoPlayer = zldVar.p) != null) {
            oneVideoPlayer.e();
        }
        return s3q0.a;
    }

    public static s3q0 Q4(cmd cmdVar, long j) {
        cmdVar.getTimelineView().setProgressMs(j);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkButton getCancelBtn() {
        return (VkButton) this.y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkButton getChoosePreviewFromGallery() {
        return (VkButton) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Group getContentBlock() {
        return (Group) this.A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkButton getDoneBtn() {
        return (VkButton) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkPlaceholder getErrorPlaceholder() {
        return (VkPlaceholder) this.B.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getPhotoThumbView() {
        return (VkImageSimple) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipsVideoAndPhotoView getPreview() {
        return (ClipsVideoAndPhotoView) this.u.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<Bitmap> getPreviewsFromVideo() {
        ArrayList arrayList;
        zld zldVar = this.C;
        if (zldVar != null) {
            arrayList = new ArrayList();
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            PreviewThumbs previewThumbs = zldVar.c.h;
            if (previewThumbs != null) {
                Iterator<T> it = previewThumbs.g.iterator();
                while (it.hasNext()) {
                    zldVar.f.a().c().a(Uri.parse((String) it.next())).d(new qs2(new xld(previewThumbs, ref$IntRef, arrayList, 0), 8), io.reactivex.rxjava3.internal.functions.a.e);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        int frameHeight = (int) (getTimelineView().getFrameHeight() * 0.5625f);
        int frameHeight2 = getTimelineView().getFrameHeight();
        if (arrayList.size() < getTimelineView().getMaxFramesCount()) {
            int ceil = (int) Math.ceil(getTimelineView().getMaxFramesCount() / arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                for (int i2 = 0; i2 < ceil; i2++) {
                    arrayList2.add(Bitmap.createScaledBitmap((Bitmap) arrayList.get(i), frameHeight, frameHeight2, false));
                }
            }
        } else {
            float size2 = arrayList.size() / getTimelineView().getMaxFramesCount();
            int maxFramesCount = getTimelineView().getMaxFramesCount();
            for (int i3 = 0; i3 < maxFramesCount; i3++) {
                arrayList2.add(Bitmap.createScaledBitmap((Bitmap) arrayList.get((int) Math.rint(i3 * size2)), frameHeight, frameHeight2, false));
            }
        }
        return p4g.q(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkScreenSpinner getProgressBar() {
        return (VkScreenSpinner) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final MultiVideoTimelineView getTimelineView() {
        return (MultiVideoTimelineView) this.x.getValue();
    }

    public final void U4(zld zldVar) {
        this.C = zldVar;
        getTimelineView().i0 = new a(zldVar);
    }

    public final void V4(k8 k8Var) {
        getPreview().a(k8Var);
    }

    public final void X4() {
        f4m.j(getProgressBar());
    }

    public final void Y4() {
        f4m.j(getProgressBar());
        getPhotoThumbView().setVisibility(4);
        getContentBlock().setVisibility(4);
        getErrorPlaceholder().setVisibility(0);
    }

    public final void Z4(int i) {
        getTimelineView().l(i);
        MultiVideoTimelineView timelineView = getTimelineView();
        timelineView.g();
        timelineView.setForceRedraw(true);
        getTimelineView().setExternalFrameProvider(new b(0, this, cmd.class, "getPreviewsFromVideo", "getPreviewsFromVideo()Ljava/util/ArrayList;", 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        if (r1 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a5(OneVideoPlayer oneVideoPlayer, x4d0.a aVar) {
        FilterType filterType;
        com.vk.media.filters.model.FilterType filterType2;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        Timeline timeline = aVar.a;
        long millis = timeUnit.toMillis(timeline.d);
        getPreview().c(oneVideoPlayer, aVar);
        zld zldVar = this.C;
        if (zldVar != null) {
            zldVar.m = millis;
        }
        MultiVideoTimelineView timelineView = getTimelineView();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = timeline.b.iterator();
        while (it.hasNext()) {
            VideoItem videoItem = ((VideoFragment) it.next()).b;
            MultiVideoTimelineView.e eVar = null;
            VideoEncodedItem videoEncodedItem = videoItem instanceof VideoEncodedItem ? (VideoEncodedItem) videoItem : null;
            if (videoEncodedItem != null) {
                String path = videoEncodedItem.b.b.getPath();
                if (path != null) {
                    TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                    long millis2 = timeUnit2.toMillis(videoEncodedItem.c);
                    long millis3 = timeUnit2.toMillis(videoEncodedItem.d);
                    FilterItem filterItem = videoEncodedItem.f.c;
                    if (filterItem != null && (filterType2 = filterItem.b) != null) {
                        switch (mer.$EnumSwitchMapping$1[filterType2.ordinal()]) {
                            case 1:
                                filterType = FilterType.NONE;
                                break;
                            case 2:
                                filterType = FilterType.NATURAL_02;
                                break;
                            case 3:
                                filterType = FilterType.NATURAL_04;
                                break;
                            case 4:
                                filterType = FilterType.VINTAGE_NATURAL_06;
                                break;
                            case 5:
                                filterType = FilterType.NATURAL_05;
                                break;
                            case 6:
                                filterType = FilterType.VINTAGE_LMP;
                                break;
                            case 7:
                                filterType = FilterType.LUT_02;
                                break;
                            case 8:
                                filterType = FilterType.LUT_01;
                                break;
                            case 9:
                                filterType = FilterType.LUT_03;
                                break;
                            case 10:
                                filterType = FilterType.LUT_04;
                                break;
                            case 11:
                                filterType = FilterType.LUT_05;
                                break;
                            case 12:
                                filterType = FilterType.FREAKY_GF_01;
                                break;
                            case 13:
                                filterType = FilterType.RGB_02;
                                break;
                            case 14:
                                filterType = FilterType.RGB_03;
                                break;
                            case 15:
                                filterType = FilterType.RGB_05;
                                break;
                            case 16:
                                filterType = FilterType.RGB_01;
                                break;
                            case 17:
                                filterType = FilterType.B_W_01;
                                break;
                            case 18:
                                filterType = FilterType.VINTAGE_01;
                                break;
                            case 19:
                                filterType = FilterType.VINTAGE_02;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    filterType = FilterType.NONE;
                    eVar = new MultiVideoTimelineView.e(path, millis2, millis3, filterType);
                }
                if (eVar != null) {
                    arrayList.add(eVar);
                }
            }
        }
        timelineView.setVideoData(arrayList);
        getTimelineView().l((int) millis);
        MultiVideoTimelineView timelineView2 = getTimelineView();
        timelineView2.g();
        timelineView2.setForceRedraw(true);
    }

    public final void b5() {
        getPhotoThumbView().setVisibility(0);
    }

    public final void c5(xk80 xk80Var, x4d0.b bVar) {
        getProgressBar().setVisibility(0);
        getProgressBar().bringToFront();
        getPreview().c(xk80Var, bVar);
    }

    public final void d5(int i, int i2, cv10 cv10Var, Timeline timeline, long j) {
        ClipsVideoAndPhotoView preview = getPreview();
        float f = i / i2;
        if (!preview.isLaidOut() || preview.isLayoutRequested()) {
            preview.addOnLayoutChangeListener(new fmf(preview, f, cv10Var, timeline, j));
            return;
        }
        int measuredHeight = preview.getMeasuredHeight();
        int i3 = (int) (measuredHeight * f);
        if ((preview.d instanceof x4d0.a) && timeline != null) {
            cv10Var.e(new g0b0(timeline, i3, measuredHeight), j);
        }
        f4m.z(i3, measuredHeight, preview);
    }

    @Override // xsna.amd
    public Size getPlayerViewSize() {
        return getPreview().getPlayerViewSize();
    }

    public final zld getPresenter() {
        return this.C;
    }

    public final void release() {
        getPreview().b();
    }

    @Override // xsna.amd
    public void setPhotoSelected(boolean z) {
        getPhotoThumbView().setSelected(z);
        getPreview().setPhotoSelected(z);
    }

    @Override // xsna.amd
    public void setPhotoUri(Uri uri) {
        getPreview().setPhotoUri(uri);
        getPhotoThumbView().setImageURI(uri);
    }

    public final void setPresenter(zld zldVar) {
        this.C = zldVar;
    }

    @Override // xsna.amd
    public void setScheduler(io.reactivex.rxjava3.core.w wVar) {
        getTimelineView().setRxScheduler(wVar);
    }

    @Override // xsna.amd
    public void setTimestamp(final long j) {
        awt0.s(this, new gzs() { // from class: xsna.bmd
            @Override // xsna.gzs
            public final Object invoke() {
                return cmd.Q4(cmd.this, j);
            }
        });
    }

    @Override // xsna.amd
    public void setVideoSelected(boolean z) {
        getTimelineView().setSelected(z);
    }

    /* compiled from: ClipsChoosePreviewViewImpl.kt */
    public static final class a implements fkt0 {
        public final /* synthetic */ zld a;

        public a(zld zldVar) {
            this.a = zldVar;
        }

        @Override // xsna.fkt0
        public final void l(float f) {
            zld zldVar = this.a;
            long j = (long) (zldVar.m * f);
            zldVar.n = j;
            OneVideoPlayer oneVideoPlayer = zldVar.p;
            if (oneVideoPlayer != null) {
                oneVideoPlayer.seekTo(j);
            }
            zldVar.j = false;
            zldVar.d();
        }

        @Override // xsna.fkt0
        public final void b() {
        }
    }
}
