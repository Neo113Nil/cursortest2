package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlInfo;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.autoplay.b;
import com.vk.log.L;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.bcp0;
import xsna.ybp0;

/* compiled from: TopshelfMovieView.kt */
/* loaded from: classes16.dex */
public final class hcp0 extends tcp0 {
    public static final /* synthetic */ qcy<Object>[] y;
    public final Context s;
    public final b25 t;
    public final zbp0 u;
    public lf30 v;
    public boolean w;
    public final pgn x;

    /* compiled from: TopshelfMovieView.kt */
    public final class a {
        public a() {
        }
    }

    /* compiled from: TopshelfMovieView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            hcp0 hcp0Var = (hcp0) this.receiver;
            zbp0 zbp0Var = hcp0Var.u;
            g7s0 g7s0Var = hcp0Var.e;
            UIBlockTopshelf.TopshelfItem topshelfItem = hcp0Var.d;
            Context context = hcp0Var.s;
            Activity h = e3m.h(context);
            if (h == null) {
                L.i(new IllegalStateException("Can not resolve activity from context = " + context + ". Ignore primary button click"));
            } else {
                ((bcp0.e) hcp0Var.f.b).invoke(ybp0.e.a);
                if (topshelfItem instanceof UIBlockTopshelf.TopshelfVideo) {
                    VideoFile videoFile = topshelfItem.c;
                    String d = topshelfItem.d.b.d();
                    if (videoFile != null && d != null) {
                        g7s0Var.Y().i(h, videoFile, new VideoFeedDialogParams.Discover(zbp0Var.d, videoFile.r(), null, false, null, null, 0L, false, null, null, 1020, null));
                    }
                } else if (topshelfItem instanceof UIBlockTopshelf.TopshelfPlaylist) {
                    VideoFile videoFile2 = topshelfItem.c;
                    Integer t9 = videoFile2 != null ? videoFile2.t9() : null;
                    VideoFile videoFile3 = topshelfItem.c;
                    Long H1 = videoFile3 != null ? videoFile3.H1() : null;
                    if (videoFile2 != null && t9 != null && H1 != null) {
                        g7s0Var.Y().i(h, videoFile2, new VideoFeedDialogParams.Playlist(zbp0Var.d, videoFile2.r(), t9.intValue(), new UserId(H1.longValue()), EmptyList.b, null, 0, null, 0, null, false, null, 4000, null));
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: TopshelfMovieView.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            hcp0 hcp0Var = (hcp0) this.receiver;
            qcy<Object>[] qcyVarArr = hcp0.y;
            UIBlockTopshelf.TopshelfItem topshelfItem = hcp0Var.d;
            pgn pgnVar = hcp0Var.x;
            b25 b25Var = hcp0Var.t;
            if (topshelfItem instanceof UIBlockTopshelf.TopshelfVideo) {
                VideoFile videoFile = topshelfItem.c;
                String d = topshelfItem.d.b.d();
                if (videoFile != null && d != null) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_ACTION_AFTER_LOGIN;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        b25Var.getClass();
                    } else {
                        b25Var.getClass();
                    }
                    g7s0.X(hcp0Var.e, hcp0Var.s, videoFile, d, null, new dr0(hcp0Var, 10), new f6m0(hcp0Var, 5), 8);
                    lf30 lf30Var = hcp0Var.v;
                    if (lf30Var != null) {
                        lf30Var.a();
                    }
                }
            } else if (topshelfItem instanceof UIBlockTopshelf.TopshelfPlaylist) {
                VideoFile videoFile2 = topshelfItem.c;
                Integer t9 = videoFile2 != null ? videoFile2.t9() : null;
                VideoFile videoFile3 = topshelfItem.c;
                Long H1 = videoFile3 != null ? videoFile3.H1() : null;
                if (t9 != null && H1 != null) {
                    long longValue = H1.longValue();
                    int intValue = t9.intValue();
                    Context context = hcp0Var.s;
                    String str = hcp0Var.u.d;
                    qcy<Object>[] qcyVarArr2 = hcp0.y;
                    int i = 0;
                    qcy<Object> qcyVar = qcyVarArr2[0];
                    if (((io.reactivex.rxjava3.disposables.c) pgnVar.b) == null) {
                        b25Var.getClass();
                        UserId userId = new UserId(longValue);
                        boolean z = hcp0Var.w;
                        boolean z2 = !z;
                        hcp0Var.w = z2;
                        lf30 lf30Var2 = hcp0Var.v;
                        if (lf30Var2 != null) {
                            lf30Var2.a();
                        }
                        VideoAlbum videoAlbum = new VideoAlbum(intValue, userId, null, null, 0, 0, null, false, null, false, false, 0, null, null, false, null, null, null, 262136, null);
                        if (str == null) {
                            str = "";
                        }
                        int i2 = 2;
                        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.l0(rsg0.y0(new a0u(userId, intValue, str, null, z2, 40), null, null, 3), new e05(new he3(4, context, videoAlbum), 7)).subscribe(new tra(new sy0(hcp0Var, context, videoAlbum, i2), i), new da(new g74(new nh1(hcp0Var, z, i2), 1), 6));
                        qcy<Object> qcyVar2 = qcyVarArr2[0];
                        pgnVar.b(subscribe);
                    }
                }
            }
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(hcp0.class, "subscriptionDisposable", "getSubscriptionDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        y = new qcy[]{mutablePropertyReference1Impl};
    }

    public hcp0(Context context, g7s0 g7s0Var, b25 b25Var, UIBlockTopshelf.TopshelfItem topshelfItem, zbp0 zbp0Var, tu10 tu10Var, wmd0 wmd0Var, VideoTopshelfVh.d dVar, gzs gzsVar, boolean z) {
        super(topshelfItem, g7s0Var, tu10Var, wmd0Var, zbp0Var, dVar, gzsVar, z);
        this.s = context;
        this.t = b25Var;
        this.u = zbp0Var;
        Boolean bool = topshelfItem.e;
        this.w = bool != null ? bool.booleanValue() : false;
        this.x = new pgn();
    }

    @Override // xsna.tcp0, xsna.jp6
    public final void d(ConstraintLayout constraintLayout) {
        super.d(constraintLayout);
        c(new w4j0(constraintLayout.getContext()), null);
        df30 df30Var = new df30(constraintLayout.getContext(), new b(0, this, hcp0.class, "onPrimaryClicked", "onPrimaryClicked()V", 0));
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_play_24);
        int[] iArr = VkButton.W;
        VkButton vkButton = df30Var.a;
        vkButton.a5(true, valueOf);
        vkButton.setText(R.string.watch);
        c(df30Var, null);
        lf30 lf30Var = new lf30(constraintLayout.getContext(), this.d, new a(), new c(0, this, hcp0.class, "onSecondaryClicked", "onSecondaryClicked()V", 0));
        wbp0.b(lf30Var, new zsl0(5, this, df30Var));
        ConstraintLayout constraintLayout2 = this.c;
        zbp0 zbp0Var = this.u;
        if (constraintLayout2 == null) {
            L.i(new NullPointerException("container is null. Probably invocation before onCreateView"));
        } else {
            constraintLayout2.addView(lf30Var.getView());
            this.b = j5g.v0(lf30Var, (Collection) this.b);
            lf30Var.d.setVisibility(zbp0Var.f ? 8 : 0);
            this.v = lf30Var;
            s3q0 s3q0Var = s3q0.a;
            s3q0 s3q0Var2 = s3q0.a;
        }
        wbp0.b(df30Var, new k82(26, lf30Var, this));
        vbp0 mf30Var = new mf30(constraintLayout, LayoutInflater.from(this.s), zbp0Var.e, this.d, !zbp0Var.f);
        wbp0.b(mf30Var, new tol(constraintLayout, this, df30Var, 7));
        c(mf30Var, null);
    }

    @Override // xsna.tcp0
    public final yg5 e(UIBlockTopshelf.TopshelfItem topshelfItem) {
        Map<String, String> g = topshelfItem.d.f.g();
        if (g == null || g.isEmpty()) {
            return null;
        }
        VideoFileOld videoFileOld = new VideoFileOld();
        videoFileOld.z = false;
        VideoUrlStorage.a aVar = new VideoUrlStorage.a((HashMap<String, VideoUrlInfo>) new HashMap());
        VideoUrl videoUrl = VideoUrl.URL_240;
        aVar.a(videoUrl, g.get(videoUrl.l()));
        VideoUrl videoUrl2 = VideoUrl.URL_360;
        aVar.a(videoUrl2, g.get(videoUrl2.l()));
        VideoUrl videoUrl3 = VideoUrl.URL_480;
        aVar.a(videoUrl3, g.get(videoUrl3.l()));
        VideoUrl videoUrl4 = VideoUrl.URL_720;
        aVar.a(videoUrl4, g.get(videoUrl4.l()));
        VideoUrl videoUrl5 = VideoUrl.URL_1080;
        aVar.a(videoUrl5, g.get(videoUrl5.l()));
        VideoUrl videoUrl6 = VideoUrl.HLS_URL;
        aVar.a(videoUrl6, g.get(videoUrl6.l()));
        VideoUrl videoUrl7 = VideoUrl.DASH_URL;
        aVar.a(videoUrl7, g.get(videoUrl7.l()));
        videoFileOld.f = aVar.b();
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        return b.C1208b.a().e(videoFileOld, null);
    }

    @Override // xsna.tcp0, xsna.jp6, xsna.vcp0
    public final void onDestroyView() {
        super.onDestroyView();
        qcy<Object> qcyVar = y[0];
        this.x.b(null);
    }
}
