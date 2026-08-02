package xsna;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.SimpleTimeZone;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ikv0;
import xsna.kmz;

/* compiled from: TopshelfLiveView.kt */
/* loaded from: classes16.dex */
public final class ecp0 extends tcp0 {
    public static final /* synthetic */ qcy<Object>[] y;
    public final b25 s;
    public final zbp0 t;
    public kmz u;
    public boolean v;
    public final fcp0 w;
    public final Object x;

    /* compiled from: TopshelfLiveView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VideoFile videoFile;
            Object akzVar;
            Context context;
            ecp0 ecp0Var = (ecp0) this.receiver;
            fcp0 fcp0Var = ecp0Var.w;
            qcy<?>[] qcyVarArr = ecp0.y;
            if (fcp0Var.getValue(ecp0Var, qcyVarArr[0]) == null && (videoFile = ecp0Var.d.c) != null) {
                if (!videoFile.v() || !((Boolean) ecp0Var.x.getValue()).booleanValue() || videoFile.x0() || videoFile.X2()) {
                    ecp0Var.h(videoFile);
                } else if (videoFile.z0()) {
                    ConstraintLayout constraintLayout = ecp0Var.c;
                    Context h = (constraintLayout == null || (context = constraintLayout.getContext()) == null) ? null : e3m.h(context);
                    FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
                    if (fragmentActivity != null) {
                        ecp0Var.s.getClass();
                        ecp0Var.v = !ecp0Var.v;
                        ecp0Var.i();
                        boolean z = ecp0Var.v;
                        gcp0 gcp0Var = new gcp0(2, ecp0Var, ecp0.class, "handleSubscriptionSuccess", "handleSubscriptionSuccess(ZZ)V", 0);
                        wv2 wv2Var = new wv2(ecp0Var, 10);
                        PermissionHelper permissionHelper = PermissionHelper.a;
                        permissionHelper.getClass();
                        String[] strArr = PermissionHelper.b;
                        if (PermissionHelper.b(fragmentActivity, strArr)) {
                            akzVar = new iq9(rsg0.D0(new r6z(videoFile.o0(), videoFile.I0(), z)).subscribe(new m40(new dkz(videoFile, z, new ifg(gcp0Var, 27), wv2Var), 23)));
                        } else {
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            PermissionHelper.l(permissionHelper, fragmentActivity, strArr, new yjz(ref$ObjectRef, videoFile, z, wv2Var, gcp0Var), new zjz(true, fragmentActivity, ref$ObjectRef, videoFile, z, wv2Var, gcp0Var), 4);
                            akzVar = new akz(ref$ObjectRef);
                        }
                        ecp0Var.w.setValue(ecp0Var, qcyVarArr[0], akzVar);
                    }
                } else {
                    ecp0Var.h(videoFile);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: TopshelfLiveView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<kmz, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(kmz kmzVar) {
            ((mcy) this.receiver).set(kmzVar);
            return s3q0.a;
        }
    }

    /* compiled from: TopshelfLiveView.kt */
    public static final /* synthetic */ class c extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((ecp0) this.receiver).u;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((ecp0) this.receiver).u = (kmz) obj;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ecp0.class, "subscriptionCancelable", "getSubscriptionCancelable()Lcom/vk/catalog2/common/ui/holders/video/topshelf/notification/Cancelable;", 0);
        fpf0.a.getClass();
        y = new qcy[]{mutablePropertyReference1Impl};
    }

    public ecp0(b25 b25Var, g7s0 g7s0Var, zbp0 zbp0Var, tu10 tu10Var, UIBlockTopshelf.TopshelfLive topshelfLive, b990 b990Var, VideoTopshelfVh.d dVar, gzs gzsVar, boolean z) {
        super(topshelfLive, g7s0Var, tu10Var, b990Var, zbp0Var, dVar, gzsVar, z);
        Boolean P8;
        this.s = b25Var;
        this.t = zbp0Var;
        VideoFile videoFile = topshelfLive.c;
        this.v = (videoFile == null || (P8 = videoFile.P8()) == null) ? false : P8.booleanValue();
        this.w = new fcp0(null);
        this.x = msy.a(LazyThreadSafetyMode.NONE, new e1m0(3));
    }

    @Override // xsna.tcp0, xsna.jp6
    public final void d(ConstraintLayout constraintLayout) {
        super.d(constraintLayout);
        Context context = constraintLayout.getContext();
        VideoTextureView videoTextureView = this.q;
        if (videoTextureView != null) {
            videoTextureView.setBackgroundColor(context.getColor(R.color.vk_black));
        }
        c(new w4j0(context), null);
        int a2 = e3m.a(this.t.e ? R.dimen.video_topshelf_tablet_margins_horizontal : R.dimen.video_topshelf_content_margin_horizontal, context);
        kmz kmzVar = new kmz(context, new a(0, this, ecp0.class, "onSubscriptionToggleClick", "onSubscriptionToggleClick()V", 0));
        wbp0.b(kmzVar, new rgm0(context, this, a2, 1));
        c(kmzVar, new b(1, new c(this, ecp0.class, "toggleButton", "getToggleButton()Lcom/vk/catalog2/common/ui/holders/video/topshelf/components/LiveSubscriptionToggleButton;", 0), mcy.class, "set", "set(Ljava/lang/Object;)V", 0));
        UIBlockTopshelf.TopshelfItem topshelfItem = this.d;
        bjz bjzVar = new bjz(context, topshelfItem);
        wbp0.b(bjzVar, new zi7(kmzVar, a2, 2));
        c(bjzVar, null);
        hjz hjzVar = new hjz(context, topshelfItem);
        wbp0.b(hjzVar, new h7a(bjzVar, a2, 3));
        c(hjzVar, null);
        i();
    }

    @Override // xsna.tcp0
    public final yg5 e(UIBlockTopshelf.TopshelfItem topshelfItem) {
        VideoFile videoFile = topshelfItem.c;
        yg5 yg5Var = null;
        if (videoFile != null && videoFile.z0()) {
            return null;
        }
        if (videoFile != null) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            yg5Var = b.C1208b.a().e(videoFile, null);
        }
        if (yg5Var != null) {
            yg5Var.q0(this.t.d);
        }
        return yg5Var;
    }

    public final void g(Boolean bool, Boolean bool2, Throwable th) {
        Context context;
        this.v = bool != null ? bool.booleanValue() : !this.v;
        i();
        if (th != null) {
            L.i(th);
        }
        this.w.setValue(this, y[0], null);
        ConstraintLayout constraintLayout = this.c;
        if (constraintLayout == null || (context = constraintLayout.getContext()) == null || th != null || bool == null) {
            return;
        }
        int i = bool.booleanValue() ? R.drawable.vk_icon_notification_check_outline_28 : R.drawable.vk_icon_notification_outline_20;
        int i2 = !bool.booleanValue() ? R.string.topshelf_snackbar_live_unsubscribe : epx.f(bool2, Boolean.TRUE) ? R.string.topshelf_snackbar_live_subscribed_with_notification : R.string.topshelf_snackbar_live_subscribed_without_notification;
        ikv0.a aVar = new ikv0.a(context);
        float f = 28;
        aVar.t = new ikv0.c.C3058c(i, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), new Size(iah0.a(f), iah0.a(f)), 8);
        aVar.u = new ikv0.d(context.getString(i2), (String) null, (ikv0.d.a) null, 6);
        pkv0.e(aVar);
        pkv0.f(aVar);
    }

    public final void h(VideoFile videoFile) {
        Context context;
        Activity h;
        ConstraintLayout constraintLayout = this.c;
        if (constraintLayout == null || (context = constraintLayout.getContext()) == null || (h = e3m.h(context)) == null) {
            return;
        }
        boolean v = videoFile.v();
        zbp0 zbp0Var = this.t;
        g7s0 g7s0Var = this.e;
        if (!v || videoFile.X2()) {
            g7s0Var.Y().i(h, videoFile, new VideoFeedDialogParams.Discover(zbp0Var.d, videoFile.r(), null, false, null, null, 0L, false, null, null, 1020, null));
        } else {
            ydt0.p(g7s0Var.Y(), h, videoFile, !g7s0Var.o(), true, null, zbp0Var.d, null, videoFile.r(), null, 688);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void i() {
        long j;
        kmz kmzVar = this.u;
        VideoFile videoFile = this.d.c;
        if (kmzVar == null || videoFile == null) {
            return;
        }
        boolean z = this.v;
        kmz.a aVar = kmz.a.b.a;
        kmz.a.C3188a c3188a = kmz.a.C3188a.a;
        if (!videoFile.x0()) {
            if (!videoFile.X2()) {
                if (gpt0.w(videoFile)) {
                    long Na = videoFile.Na() * 1000;
                    SimpleTimeZone simpleTimeZone = pvo0.a;
                    xuo0.a.getClass();
                    j = Na - xuo0.a();
                } else {
                    j = -1;
                }
                if (0 <= j && j < 1800001) {
                    aVar = new kmz.a.d(videoFile.Na() * 1000);
                } else if (videoFile.z0()) {
                    if (((Boolean) this.x.getValue()).booleanValue()) {
                        aVar = new kmz.a.c(z);
                    }
                }
            }
            kmzVar.a(aVar);
        }
        aVar = c3188a;
        kmzVar.a(aVar);
    }

    @Override // xsna.tcp0, xsna.jp6, xsna.vcp0
    public final void onDestroyView() {
        super.onDestroyView();
        this.w.setValue(this, y[0], null);
    }
}
