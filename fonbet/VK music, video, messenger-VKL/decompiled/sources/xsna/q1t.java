package xsna;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Source;
import java.util.Collections;
import one.video.gl.GLESUtils;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider;

/* compiled from: GLFrame.kt */
/* loaded from: classes8.dex */
public class q1t implements hjx0, rp2, ApplicationNameProvider, bwm, ed01 {
    public static final float[] c = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] d = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f};
    public Object b;

    public /* synthetic */ q1t(Object obj) {
        this.b = obj;
    }

    @Override // xsna.bwm
    public io.reactivex.rxjava3.core.q a() {
        a1w a1wVar = (a1w) this.b;
        io.reactivex.rxjava3.core.q X = io.reactivex.rxjava3.core.q.X(new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a().b0(ka80.class), new aa6(new p4f(this, 20), 16)).U(new ca6(new b5h(this, 11), 12)), new io.reactivex.rxjava3.internal.operators.observable.o0(new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a().b0(p680.class), new z7(new pt(26), 21)), new b8(new nhe(this, 15), 19)).o0(a1wVar.C(this, new tpu(Collections.singletonList(a1wVar.q()), Source.CACHE, false, 12))).U(new c8(new yy(this, 24), 11)));
        X.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(X, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    @Override // xsna.ed01
    public Context c() {
        throw null;
    }

    @Override // xsna.hjx0
    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView) {
        return (WebViewProviderBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // xsna.ed01
    public kb01 d() {
        throw null;
    }

    @Override // xsna.ed01
    public k901 e() {
        throw null;
    }

    @Override // xsna.ed01
    public avf f() {
        throw null;
    }

    @Override // xsna.ed01
    public fai g() {
        throw null;
    }

    @Override // xsna.rp2
    public int getFrameCount() {
        return ((dj2) ((bj2) this.b)).c.getFrameCount();
    }

    @Override // xsna.rp2
    public int getFrameDurationMs(int i) {
        return ((dj2) ((bj2) this.b)).e[i];
    }

    @Override // xsna.rp2
    public int getLoopCount() {
        return ((dj2) ((bj2) this.b)).c.getLoopCount();
    }

    @Override // xsna.rp2
    public int getLoopDurationMs() {
        return ((dj2) ((bj2) this.b)).f;
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider
    public String getName() {
        return BuildInfo.h() ? "debug" : ((rew0) this.b).h() ? "vk_android_messenger_sferum" : BuildInfo.g() ? "" : BuildInfo.t() ? "vk_android_messenger" : BuildInfo.s() ? "vk_android" : "unknown";
    }

    @Override // xsna.hjx0
    @NonNull
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // xsna.hjx0
    @NonNull
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getWebkitToCompatConverter());
    }

    public boolean h() {
        if (((Activity) ((ClipFeedSideControlsView.b) this.b).invoke()) == null) {
            return false;
        }
        return !g620.f().k0().a(r0);
    }

    @Override // xsna.rp2
    public int height() {
        return ((dj2) ((bj2) this.b)).c.getHeight();
    }

    @Override // xsna.hjx0
    @NonNull
    public String[] i() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    public void j(v1t v1tVar) {
        iv8 iv8Var = (iv8) this.b;
        iv8Var.getClass();
        h6g h6gVar = new h6g(iv8Var, 18);
        if (v1tVar.f == null) {
            float[] fArr = new float[16];
            v1tVar.f = fArr;
            Matrix.setIdentityM(fArr, 0);
        }
        if (v1tVar.g == null) {
            float[] fArr2 = new float[16];
            v1tVar.g = fArr2;
            Matrix.setIdentityM(fArr2, 0);
        }
        GLES20.glUseProgram(v1tVar.a);
        GLESUtils.c("glUseProgram", new int[0]);
        GLES20.glUniformMatrix4fv(v1tVar.d, 1, false, v1tVar.f, 0);
        GLESUtils.c("glUniformMatrix4fv", new int[0]);
        GLES20.glUniformMatrix4fv(v1tVar.e, 1, false, v1tVar.g, 0);
        GLESUtils.c("glUniformMatrix4fv", new int[0]);
        GLES20.glUniform1i(v1tVar.h, 0);
        GLESUtils.c("glUniform1i", new int[0]);
        GLES20.glActiveTexture(33984);
        GLESUtils.c("glActiveTexture", new int[0]);
        GLESUtils.b(v1tVar.a(), v1tVar.i);
        h6gVar.invoke(v1tVar);
        GLESUtils.b(v1tVar.a(), 0);
        GLES20.glUseProgram(0);
        GLESUtils.c("glUseProgram", new int[0]);
    }

    public void k() {
        kb01 kb01Var = ((mb01) this.b).k;
        mb01.k(kb01Var);
        kb01Var.k();
    }

    @Override // xsna.rp2
    public int width() {
        return ((dj2) ((bj2) this.b)).c.getWidth();
    }

    public q1t(mb01 mb01Var) {
        exc0.i(mb01Var);
        this.b = mb01Var;
    }

    public q1t() {
        this.b = new iv8(c, d);
    }
}
