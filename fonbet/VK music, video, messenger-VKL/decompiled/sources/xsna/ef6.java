package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ironsource.Z3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.VideoRestrictionView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.interactive.InteractiveInfo;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.api.InteractiveData;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import one.video.player.OneVideoPlayer;
import ru.ok.android.commons.http.Http;
import xsna.acx;
import xsna.f5h0;
import xsna.ocx;
import xsna.rcx;

/* compiled from: BaseInteractiveVideoView.kt */
/* loaded from: classes3.dex */
public abstract class ef6 implements rcx {
    public static final /* synthetic */ qcy<Object>[] u;
    public static final List<OneVideoPlayer.State> v;
    public boolean b;
    public boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public Object h;
    public Object i;
    public InteractiveData j;
    public final Object k;
    public ocx l;
    public final g m;
    public final e n;
    public final bf6 o;
    public final boolean p;
    public lcx q;
    public final Object r;
    public final jcx s;
    public final f t;

    /* compiled from: BaseInteractiveVideoView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InteractiveData.From.values().length];
            try {
                iArr[InteractiveData.From.CATALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InteractiveData.From.FEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InteractiveData.From.MESSENGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InteractiveData.From.DISCOVER_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InteractiveData.From.DISCOVER_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InteractiveData.From.FULLSCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BaseInteractiveVideoView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            VideoFile videoFile;
            String r1;
            lcx lcxVar;
            InteractiveData interactiveData = ((ef6) this.receiver).j;
            return Boolean.valueOf((interactiveData == null || (videoFile = interactiveData.a) == null || (r1 = videoFile.r1()) == null || (lcxVar = (lcx) mcx.a.get(r1)) == null) ? false : epx.f(mcx.b.a, lcxVar));
        }
    }

    /* compiled from: BaseInteractiveVideoView.kt */
    public static final /* synthetic */ class c extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Boolean.valueOf(((ef6) this.receiver).getVideoFocused());
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((ef6) this.receiver).setVideoFocused(((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: BaseInteractiveVideoView.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((ef6) this.receiver).D();
            return s3q0.a;
        }
    }

    /* compiled from: BaseInteractiveVideoView.kt */
    public static final /* synthetic */ class e implements dbx, g0t {
        public e() {
        }

        @Override // xsna.dbx
        public final void a(cbx cbxVar) {
            ef6.this.H(cbxVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof dbx) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ef6.this, ef6.class, "renderEvent", "renderEvent(Lcom/vk/movika/impl/player/InteractiveEvent;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: Delegates.kt */
    public static final class f extends wq70<Boolean> {
        public final /* synthetic */ ef6 b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(ef6 ef6Var) {
            super(r0);
            Boolean bool = Boolean.FALSE;
            this.b = ef6Var;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool2.booleanValue();
            this.b.E(bool.booleanValue(), booleanValue);
        }
    }

    /* compiled from: BaseInteractiveVideoView.kt */
    public static final /* synthetic */ class g implements vbx, g0t {
        public g() {
        }

        @Override // xsna.vbx
        public final void a(ocx ocxVar) {
            ef6 ef6Var = ef6.this;
            ef6Var.J(ocxVar);
            ef6Var.l = ocxVar;
            if (((Collection) ef6Var.i).isEmpty()) {
                return;
            }
            rcx.c b = ocxVar.b();
            Iterator it = ((Iterable) ef6Var.i).iterator();
            while (it.hasNext()) {
                ((rcx.b) it.next()).b(b);
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof vbx) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ef6.this, ef6.class, "onInteractiveStateChanged", "onInteractiveStateChanged(Lcom/vk/movika/impl/player/InteractiveVideoState;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: BaseInteractiveVideoView.kt */
    public static final class h implements ebs0 {
        public h() {
        }

        @Override // xsna.ebs0
        public final void bk(dbs0 dbs0Var) {
            ebs0 ebs0Var;
            ef6 ef6Var = ef6.this;
            InteractiveData interactiveData = ef6Var.j;
            if (interactiveData == null || (ebs0Var = interactiveData.g) == null) {
                return;
            }
            ef6Var.s2();
            ebs0Var.bk(dbs0Var);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ef6.class, "videoFocused", "getVideoFocused()Z", 0);
        fpf0.a.getClass();
        u = new qcy[]{mutablePropertyReference1Impl};
        v = e43.l(OneVideoPlayer.State.IDLE, OneVideoPlayer.State.RELEASED);
    }

    public ef6() {
        this(false);
    }

    public boolean A() {
        InteractiveData interactiveData;
        VideoFile videoFile;
        if (!fxc0.B().o() || (interactiveData = this.j) == null || (videoFile = interactiveData.a) == null || !videoFile.T3() || !videoFile.d8()) {
            return false;
        }
        VideoMinifiedPlayerStateHolder.a.getClass();
        return !VideoMinifiedPlayerStateHolder.a();
    }

    public final boolean B() {
        boolean z;
        return this.f && (z = this.d) && this.e && z && this.g;
    }

    public final void C(rcx.d dVar) {
        Iterator it = ((Iterable) this.h).iterator();
        while (it.hasNext()) {
            ((rcx.e) it.next()).ab(dVar);
        }
    }

    public void D() {
        lcx lcxVar;
        ocx currentState;
        lcx lcxVar2 = this.q;
        boolean z = (lcxVar2 == null || (currentState = lcxVar2.getCurrentState()) == null || currentState.g) ? false : true;
        if (getVideoFocused() && ((!z || (lcxVar = this.q) == null || !lcxVar.h(this)) && A())) {
            o();
            return;
        }
        InteractiveData interactiveData = this.j;
        InteractiveData.From from = interactiveData != null ? interactiveData.d : null;
        if (from == null || from == InteractiveData.From.DISCOVER_VIDEO || from == InteractiveData.From.DISCOVER_APP || from == InteractiveData.From.FULLSCREEN) {
            return;
        }
        G();
    }

    public void E(boolean z, boolean z2) {
        lcx lcxVar;
        if (!z2) {
            s2();
        }
        if (z == z2 && (lcxVar = this.q) != null && lcxVar.h(this)) {
            return;
        }
        F(z2);
    }

    public final void F(boolean z) {
        if (z && A()) {
            o();
        } else {
            lcx lcxVar = this.q;
            if (lcxVar != null && lcxVar.h(this)) {
                a(new acx.g(false, false, false));
            }
            L();
        }
        View x = x();
        if (x != null) {
            x.setVisibility(A() ? 8 : 0);
        }
    }

    public final void G() {
        boolean z;
        Activity b2 = enj.b(getView());
        InteractiveData interactiveData = this.j;
        if (b2 == null || interactiveData == null) {
            return;
        }
        InteractiveData.From from = interactiveData.d;
        if (b2.isFinishing()) {
            return;
        }
        L();
        q().c = true;
        VideoFile videoFile = interactiveData.a;
        switch (a.$EnumSwitchMapping$0[from.ordinal()]) {
            case 1:
                z = true;
                break;
            case 2:
                z = A();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                z = false;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (z && fxc0.B().c0() && gpt0.c(b2.getApplicationContext())) {
            fxc0.B().Y().i(b2, videoFile, new VideoFeedDialogParams.Discover(interactiveData.b, interactiveData.c, interactiveData.e, false, null, null, 0L, false, null, null, Z3.l, null));
        } else {
            ydt0.s(fxc0.B().Y(), b2, videoFile, q(), !A(), null, null, null, Boolean.valueOf(from == InteractiveData.From.MESSENGER), null, 12224);
        }
    }

    @Override // xsna.rcx
    public final void G3(com.vk.video.ui.discovery.minimizable.player.a aVar) {
        this.i = j5g.s0((Iterable) this.i, aVar);
    }

    public void I(ocx ocxVar) {
        d3b0 f2;
        boolean isPrepared;
        d3b0 f3;
        OneVideoPlayer a2;
        if (this.p) {
            List<OneVideoPlayer.State> list = v;
            lcx lcxVar = this.q;
            if (!j5g.P(list, (lcxVar == null || (f3 = lcxVar.f()) == null || (a2 = f3.a()) == null) ? null : a2.getState())) {
                isPrepared = true;
            }
            isPrepared = false;
        } else {
            lcx lcxVar2 = this.q;
            if (lcxVar2 != null && (f2 = lcxVar2.f()) != null) {
                isPrepared = f2.isPrepared();
            }
            isPrepared = false;
        }
        u().setVisibility(isPrepared ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0024  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void J(ocx ocxVar) {
        boolean z;
        boolean booleanValue;
        boolean z2;
        ocx.c cVar = ocxVar.f;
        Throwable th = ocxVar.j;
        if (th != null) {
            VideoFile videoFile = ocxVar.s;
            if ((videoFile != null ? videoFile.O() : null) == null || !ocxVar.i) {
                z = true;
                s().setVisibility(!z ? 0 : 8);
                I(ocxVar);
                i3k i3kVar = (i3k) this.r.getValue();
                i3kVar.getClass();
                boolean z3 = cVar instanceof ocx.c.d;
                boolean z4 = !z3 || (cVar instanceof ocx.c.C3448c) || (cVar instanceof ocx.c.a);
                boolean z5 = cVar instanceof ocx.c.a;
                boolean z6 = (z5 || ((ocx.c.a) cVar).a) ? false : true;
                boolean z7 = th == null;
                booleanValue = ((Boolean) i3kVar.d.invoke()).booleanValue();
                if ((!booleanValue || i3kVar.b.c) && !z6) {
                    if ((booleanValue && z4) || z7) {
                        z2 = false;
                    }
                    if (getVideoFocused()) {
                        InteractiveDurationView v2 = v();
                        if (v2 != null) {
                            v2.a(false, false);
                        }
                    } else if (cVar instanceof ocx.c.b) {
                        InteractiveDurationView v3 = v();
                        if (v3 != null) {
                            v3.setVisibility(0);
                        }
                        InteractiveDurationView v4 = v();
                        if (v4 != null) {
                            v4.a(true, false);
                        }
                    } else if (z3) {
                        InteractiveDurationView v5 = v();
                        if (v5 != null) {
                            v5.setVisibility(0);
                        }
                        InteractiveDurationView v6 = v();
                        if (v6 != null) {
                            v6.a(false, true);
                        }
                    } else if (z5) {
                        InteractiveDurationView v7 = v();
                        if (v7 != null) {
                            v7.setVisibility(4);
                        }
                        InteractiveDurationView v8 = v();
                        if (v8 != null) {
                            v8.a(false, false);
                        }
                    } else {
                        InteractiveDurationView v9 = v();
                        if (v9 != null) {
                            v9.a(false, false);
                        }
                    }
                    VideoTextureView z8 = z();
                    ces0 videoDebugInfo = z().getVideoDebugInfo();
                    Chapter chapter = ocxVar.b;
                    z8.setVideoDebugInfo(ces0.a(videoDebugInfo, null, null, false, chapter != null ? chapter.b : null, 0, 0, 55));
                }
                z2 = true;
                i3kVar.a(z2, !z2 || i3kVar.f);
                if (getVideoFocused()) {
                }
                VideoTextureView z82 = z();
                ces0 videoDebugInfo2 = z().getVideoDebugInfo();
                Chapter chapter2 = ocxVar.b;
                z82.setVideoDebugInfo(ces0.a(videoDebugInfo2, null, null, false, chapter2 != null ? chapter2.b : null, 0, 0, 55));
            }
        }
        z = false;
        s().setVisibility(!z ? 0 : 8);
        I(ocxVar);
        i3k i3kVar2 = (i3k) this.r.getValue();
        i3kVar2.getClass();
        boolean z32 = cVar instanceof ocx.c.d;
        if (z32) {
        }
        boolean z52 = cVar instanceof ocx.c.a;
        if (z52) {
        }
        if (th == null) {
        }
        booleanValue = ((Boolean) i3kVar2.d.invoke()).booleanValue();
        if (booleanValue) {
        }
        if (booleanValue) {
            z2 = false;
            i3kVar2.a(z2, !z2 || i3kVar2.f);
            if (getVideoFocused()) {
            }
            VideoTextureView z822 = z();
            ces0 videoDebugInfo22 = z().getVideoDebugInfo();
            Chapter chapter22 = ocxVar.b;
            z822.setVideoDebugInfo(ces0.a(videoDebugInfo22, null, null, false, chapter22 != null ? chapter22.b : null, 0, 0, 55));
        }
        z2 = false;
        i3kVar2.a(z2, !z2 || i3kVar2.f);
        if (getVideoFocused()) {
        }
        VideoTextureView z8222 = z();
        ces0 videoDebugInfo222 = z().getVideoDebugInfo();
        Chapter chapter222 = ocxVar.b;
        z8222.setVideoDebugInfo(ces0.a(videoDebugInfo222, null, null, false, chapter222 != null ? chapter222.b : null, 0, 0, 55));
    }

    public final void L() {
        lcx lcxVar = this.q;
        if (lcxVar != null) {
            lcxVar.c(this.m);
            lcxVar.m(this.n);
            lcxVar.n(this);
            u().removeAllViews();
        }
        this.q = null;
    }

    @Override // xsna.rcx
    public final void L1(rcx.e eVar) {
        this.h = j5g.v0(eVar, (Collection) this.h);
    }

    @Override // xsna.rcx
    public void P(boolean z, boolean z2) {
        VideoFile videoFile;
        this.b = z;
        this.c = z2;
        InteractiveData interactiveData = this.j;
        if (interactiveData == null || (videoFile = interactiveData.a) == null) {
            return;
        }
        getView().postDelayed(new df6(0, this, videoFile), 250L);
        ViewGroup u2 = u();
        InteractiveData interactiveData2 = this.j;
        axt0.a(u2, interactiveData2 != null ? interactiveData2.a : null);
    }

    @Override // xsna.rcx
    public final void X0(com.vk.video.ui.discovery.minimizable.player.a aVar) {
        this.i = j5g.v0(aVar, (Collection) this.i);
    }

    @Override // xsna.bcx
    public final boolean a(acx acxVar) {
        lcx lcxVar = this.q;
        if (lcxVar != null) {
            return lcxVar.a(acxVar);
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{"VideoInteractiveDelegate is null. Skip action"});
        }
        s3q0 s3q0Var = s3q0.a;
        return false;
    }

    @Override // xsna.rcx
    public final void b() {
        this.j = null;
        L();
        jcx jcxVar = this.s;
        dts0 dts0Var = jcxVar.c;
        if (dts0Var != null) {
            jcxVar.a.e(dts0Var);
        }
        jcxVar.c = null;
        jcxVar.b.a = null;
    }

    @Override // xsna.rcx
    public void destroy() {
        this.h = EmptyList.b;
        z().removeOnLayoutChangeListener(this.o);
        b();
    }

    @Override // xsna.rcx
    public final rcx.c getState() {
        ocx currentState;
        lcx w = w();
        if (w == null || (currentState = w.getCurrentState()) == null) {
            lcx lcxVar = this.q;
            currentState = lcxVar != null ? lcxVar.getCurrentState() : this.l;
        }
        return currentState.b();
    }

    @Override // xsna.dnt0
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    @Override // xsna.dnt0
    public final boolean getVideoFocused() {
        return this.t.getValue(this, u[0]).booleanValue();
    }

    @Override // xsna.mnt0
    /* renamed from: getVideoView */
    public final VideoTextureView mo407getVideoView() {
        return z();
    }

    public final void o() {
        lcx lcxVar = this.q;
        if (lcxVar == null) {
            lcxVar = w();
            this.q = lcxVar;
        }
        if (lcxVar != null) {
            ViewGroup u2 = u();
            VideoTextureView z = z();
            InteractiveData interactiveData = this.j;
            boolean z2 = interactiveData != null ? interactiveData.h : false;
            g7s0 B = fxc0.B();
            InteractiveData interactiveData2 = this.j;
            boolean c2 = B.c(interactiveData2 != null ? interactiveData2.a : null);
            VideoFile videoFile = null;
            com.vk.libvideo.autoplay.a videoConfig = getVideoConfig();
            InteractiveData interactiveData3 = this.j;
            if (interactiveData3 != null) {
                videoFile = interactiveData3.a;
            }
            lcxVar.l(new ncx(this, u2, z, z2, c2, videoConfig, videoFile));
            lcxVar.d(this.m);
            lcxVar.j(this.n);
            if (!this.l.u.a) {
                lcxVar.a(new acx.g(true, getVideoConfig().p != PlayerType.FULLSCREEN, false));
            }
            ocx currentState = lcxVar.getCurrentState();
            J(currentState);
            this.l = currentState;
        }
    }

    @Override // xsna.rcx
    public final View o0() {
        return r();
    }

    @Override // xsna.rcx
    public boolean o4() {
        return false;
    }

    public final void p(acx acxVar) {
        lcx lcxVar = this.q;
        if (lcxVar == null) {
            lcxVar = w();
        }
        if (lcxVar != null) {
            lcxVar.a(acxVar);
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{"VideoInteractiveDelegate is null. Skip action"});
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public abstract af6 q();

    @Override // xsna.rcx
    @ozl
    public final tn10 q3() {
        return z().getMatrixProvider();
    }

    public abstract VKImageView r();

    @Override // xsna.rcx
    public final void r2(rcx.e eVar) {
        this.h = j5g.s0((Iterable) this.h, eVar);
    }

    public abstract View s();

    @Override // xsna.dnt0
    public final void setVideoFocused(boolean z) {
        this.t.setValue(this, u[0], Boolean.valueOf(z));
    }

    public abstract VkSimpleButton t();

    @Override // xsna.rcx
    public void t1(VideoFile videoFile) {
        InteractiveData interactiveData = this.j;
        this.j = interactiveData != null ? new InteractiveData(videoFile, interactiveData.b, interactiveData.c, interactiveData.d, interactiveData.e, interactiveData.f, interactiveData.g, interactiveData.h, interactiveData.i) : null;
    }

    public abstract ViewGroup u();

    public abstract InteractiveDurationView v();

    public final lcx w() {
        String str;
        InteractiveData interactiveData = this.j;
        VideoFile videoFile = interactiveData != null ? interactiveData.a : null;
        if (videoFile == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return null;
            }
            L.u(l, L.LogType.w, new Object[]{"Can not resolve player! videoFile is null. interactiveData = " + this.j});
            return null;
        }
        Context context = z().getContext();
        InteractiveData interactiveData2 = this.j;
        String str2 = interactiveData2 != null ? interactiveData2.b : null;
        boolean z = interactiveData2 != null && interactiveData2.h;
        obx obxVar = mcx.a;
        String r1 = videoFile.r1();
        obx obxVar2 = mcx.a;
        lcx lcxVar = (lcx) obxVar2.get(r1);
        if (lcxVar != null) {
            return lcxVar;
        }
        Context applicationContext = context.getApplicationContext();
        m7q e2 = gpt0.e(gpt0.a, videoFile, -4, str2, false, true, null, videoFile.r(), false, Http.StatusCode.RANGE_NOT_SATISFIABLE);
        String str3 = str2;
        opt0 opt0Var = new opt0(str3);
        wbx wbxVar = new wbx(videoFile, e2, opt0Var);
        InteractiveInfo R7 = videoFile.R7();
        if (R7 == null || (str = R7.b) == null) {
            str = "";
        }
        gbx gbxVar = new gbx(str);
        fbx fbxVar = new fbx(videoFile);
        boolean c2 = fxc0.B().c(videoFile);
        ugl uglVar = new ugl(applicationContext, new ocx(null, (z || c2) ? ocx.c.C3448c.a : ocx.c.b.a, z, c2, 0, null, videoFile, videoFile.X(), e2 != null ? e2.z : null, 1310303), e2, str3, opt0Var, wbxVar, gbxVar, fbxVar, mcx.b);
        obxVar2.put(r1, uglVar);
        return uglVar;
    }

    @Override // xsna.mnt0
    public final void w0(View view) {
        L();
    }

    public View x() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ebs0 y() {
        return (ebs0) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rcx
    public void y0(InteractiveData interactiveData) {
        ats0 ats0Var;
        VideoFile videoFile = interactiveData.a;
        if (interactiveData.equals(this.j)) {
            return;
        }
        b();
        this.j = interactiveData;
        InteractiveDurationView v2 = v();
        if (v2 != null) {
            v2.setVisibility(0);
        }
        InteractiveDurationView v3 = v();
        if (v3 != null) {
            v3.setTextDescriptionVisible(true);
        }
        InteractiveDurationView v4 = v();
        if (v4 != null) {
            v4.setDurationText(gpt0.m(getView().getContext(), videoFile, true, false));
        }
        bwt0.i0(t(), new m7(this, 10));
        VideoTextureView z = z();
        bf6 bf6Var = this.o;
        z.removeOnLayoutChangeListener(bf6Var);
        z().addOnLayoutChangeListener(bf6Var);
        i3k i3kVar = (i3k) this.r.getValue();
        i3kVar.getClass();
        boolean z2 = (((Boolean) i3kVar.c.invoke()).booleanValue() && interactiveData.f) ? false : true;
        VKImageView vKImageView = i3kVar.a;
        vKImageView.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        vKImageView.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        i3kVar.a(z2, false);
        if (!videoFile.Z9() || fxc0.B().c(videoFile)) {
            vKImageView.setPlaceholderImage(m33.a(R.drawable.default_placeholder_8, vKImageView.getContext()));
            vKImageView.F0(m33.a(R.drawable.default_placeholder_8, vKImageView.getContext()), ImageView.ScaleType.FIT_XY);
            vKImageView.setActualScaleType(f5h0.f.a);
            ImageSize Cb = videoFile.getImage().Cb(ImageScreenSize.BIG.h(), true, false);
            vKImageView.load(Cb != null ? Cb.d.d : null);
        } else {
            vKImageView.clear();
            int i = VideoRestrictionView.d;
            vKImageView.setPlaceholderImage(VideoRestrictionView.a.a((int) iah0.b(8.0f), vKImageView.getContext()));
        }
        bwt0.i0(vKImageView, new qpj(i3kVar, 2));
        View x = x();
        if (x != null) {
            x.setVisibility(A() ? 8 : 0);
        }
        F(getVideoFocused());
        jcx jcxVar = this.s;
        cts0 cts0Var = jcxVar.a;
        dts0 dts0Var = jcxVar.c;
        if (dts0Var == null) {
            Context context = e43.a;
            dts0Var = cts0Var.a(context != null ? context : null);
            jcxVar.c = dts0Var;
        }
        if (dts0Var != null) {
            icx icxVar = jcxVar.b;
            icxVar.a = this;
            if (!cts0Var.b(dts0Var) || (ats0Var = cts0Var.d) == null) {
                return;
            }
            ats0Var.a.add(icxVar);
        }
    }

    public abstract VideoTextureView z();

    public ef6(boolean z) {
        this.d = fxc0.B().J().a();
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_SEEK_PREVIEW;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        this.e = bVar.a(videoFeatures);
        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NEW_SEEKBAR;
        videoFeatures2.getClass();
        this.f = bVar.a(videoFeatures2);
        VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_NEW_EXTEND_SEEK;
        videoFeatures3.getClass();
        this.g = bVar.a(videoFeatures3);
        EmptyList emptyList = EmptyList.b;
        this.h = emptyList;
        this.i = emptyList;
        ra raVar = new ra(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, raVar);
        this.l = new ocx(null, null, false, false, 0, null, null, false, null, 4194303);
        this.m = new g();
        this.n = new e();
        this.o = new bf6(this, 0);
        VideoFeatures videoFeatures4 = VideoFeatures.REMOVE_IS_PREPARED;
        videoFeatures4.getClass();
        this.p = bVar.a(videoFeatures4);
        this.r = msy.a(lazyThreadSafetyMode, new cf6(this, z, 0));
        this.s = new jcx();
        this.t = new f(this);
    }

    public void K() {
    }

    @Override // xsna.rcx
    public void s2() {
    }

    @Override // xsna.mnt0
    public void G2(View view) {
    }

    public void H(cbx cbxVar) {
    }

    @Override // xsna.rcx
    public void b3(boolean z) {
    }

    @Override // xsna.mnt0
    public final void setFocusController(cnt0 cnt0Var) {
    }

    @Override // xsna.rcx
    public void j2(boolean z, boolean z2) {
    }
}
