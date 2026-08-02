package xsna;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.superapp.api.dto.ad.AdInfo;
import com.vk.tabbar.core.api.domain.TabbarState;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import one.video.gl.EGL14Utils;
import xsna.bjw0;
import xsna.gm50;
import xsna.gyw0;
import xsna.iyw0;
import xsna.zxw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ydn0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ydn0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                zdn0 zdn0Var = (zdn0) this.c;
                AdInfo adInfo = (AdInfo) this.d;
                aoj aojVar = (aoj) obj;
                aojVar.a(aen0.b);
                aojVar.b();
                aojVar.a(new ben0(adInfo, zdn0Var));
                aojVar.a(new cen0(adInfo, zdn0Var));
                return s3q0.a;
            case 1:
                vvn0 vvn0Var = (vvn0) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                wtn0 wtn0Var = vvn0Var.a;
                TabbarState c = wtn0Var.c();
                vvn0Var.k = c;
                if (c != null) {
                    wtn0Var.d(TabbarState.a(c, arrayList), false);
                    vvn0Var.j.onNext(s3q0.a);
                }
                return s3q0.a;
            case 2:
                ((fpq0) this.c).C(new UserProfileAction.DonutBanner.a(!((UserProfileAction.x) this.d).b));
                return s3q0.a;
            case 3:
                abt0 abt0Var = (abt0) this.c;
                MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.d;
                q190 q190Var = abt0Var.l;
                synchronized (q190Var.d) {
                    while (!q190Var.e) {
                        try {
                            q190Var.d.wait(500L);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    q190Var.e = false;
                }
                q190Var.f.getClass();
                joo0.a("before updateTexImage");
                q190Var.b.updateTexImage();
                q190 q190Var2 = abt0Var.l;
                joo0 joo0Var = q190Var2.f;
                SurfaceTexture surfaceTexture = q190Var2.b;
                joo0Var.getClass();
                joo0.a("onDrawFrame start");
                float[] fArr = joo0Var.c;
                surfaceTexture.getTransformMatrix(fArr);
                GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                GLES20.glClear(16640);
                GLES20.glUseProgram(joo0Var.d);
                joo0.a("glUseProgram");
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, joo0Var.e);
                FloatBuffer floatBuffer = joo0Var.a;
                floatBuffer.position(0);
                GLES20.glVertexAttribPointer(joo0Var.h, 3, 5126, false, 20, (Buffer) joo0Var.a);
                joo0.a("glVertexAttribPointer maPosition");
                GLES20.glEnableVertexAttribArray(joo0Var.h);
                joo0.a("glEnableVertexAttribArray maPositionHandle");
                floatBuffer.position(3);
                GLES20.glVertexAttribPointer(joo0Var.i, 2, 5126, false, 20, (Buffer) joo0Var.a);
                joo0.a("glVertexAttribPointer maTextureHandle");
                GLES20.glEnableVertexAttribArray(joo0Var.i);
                joo0.a("glEnableVertexAttribArray maTextureHandle");
                float[] fArr2 = joo0Var.b;
                Matrix.setIdentityM(fArr2, 0);
                GLES20.glUniformMatrix4fv(joo0Var.f, 1, false, fArr2, 0);
                GLES20.glUniformMatrix4fv(joo0Var.g, 1, false, fArr, 0);
                GLES20.glDrawArrays(5, 0, 4);
                joo0.a("glDrawArrays");
                GLES20.glFinish();
                s1t s1tVar = abt0Var.p;
                long j = bufferInfo.presentationTimeUs * 1000;
                if (!epx.f((EGLSurface) s1tVar.d, EGL14.EGL_NO_SURFACE)) {
                    EGLExt.eglPresentationTimeANDROID((EGLDisplay) s1tVar.b, (EGLSurface) s1tVar.d, j);
                    EGL14Utils.a("eglPresentationTimeANDROID", new int[0]);
                }
                abt0Var.p.d();
                return null;
            case 4:
                VoipCallServiceFragment.c cVar = (VoipCallServiceFragment.c) this.c;
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) this.d;
                int i = VoipCallServiceFragment.Y;
                sp.g(cVar.a, 3);
                gm50.a.a(voipCallServiceFragment, ((bjw0.b) obj).a, new aq1(29, voipCallServiceFragment, cVar));
                return s3q0.a;
            case 5:
                gvw0 gvw0Var = (gvw0) this.c;
                wzs wzsVar = (wzs) this.d;
                List list = (List) obj;
                gvw0Var.i = false;
                gvw0Var.h = false;
                boolean contains = list.contains("android.permission.CAMERA");
                boolean contains2 = list.contains("android.permission.RECORD_AUDIO");
                if (wzsVar != null) {
                    wzsVar.invoke(Boolean.valueOf(contains), Boolean.valueOf(contains2));
                }
                return s3q0.a;
            default:
                cyw0 cyw0Var = (cyw0) this.c;
                zxw0.m mVar = (zxw0.m) ((zxw0) this.d);
                cyw0Var.T(new gyw0.f(mVar.b));
                cyw0.V(cyw0Var, null, null, null, mVar.b, null, null, null, null, null, (iyw0.a) obj, 503);
                return s3q0.a;
        }
    }
}
