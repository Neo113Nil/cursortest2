package xsna;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.MediaRecorder;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.zxing.Result;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ResultParser;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.RecorderBase;
import com.vk.media.render.RenderBase;
import com.vk.media.render.RenderTexture;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import xsna.dr10;
import xsna.kk9;
import xsna.rl9;

/* compiled from: CameraViewHolder.java */
/* loaded from: classes3.dex */
public final class mo9 extends oo9 implements TextureView.SurfaceTextureListener {
    public final mk9 g;
    public final MediaUtils.d h;
    public final eoz i;
    public final a j;
    public final Object k;
    public boolean l;
    public boolean m;
    public jhu0 n;
    public volatile boolean o;
    public boolean p;
    public ii9 q;
    public b r;
    public final WeakReference<soo0> s;

    /* compiled from: CameraViewHolder.java */
    public class a extends ok9 {
        public a(Context context, @NonNull doe0 doe0Var) {
            super(context, doe0Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00aa A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #0 {all -> 0x00bf, blocks: (B:26:0x0061, B:28:0x0069, B:30:0x0094, B:32:0x009c, B:35:0x00aa, B:38:0x00b4, B:40:0x00b8, B:41:0x00dd, B:42:0x00e6, B:44:0x00ec, B:46:0x00fe, B:48:0x0106, B:54:0x0120, B:57:0x00c2, B:58:0x012a, B:60:0x00a2), top: B:25:0x0061 }] */
        @Override // xsna.rl9.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(int i, int i2, int i3, byte[] bArr) {
            nne0 d;
            Point point;
            ArrayList a;
            int i4 = i;
            int i5 = i2;
            int i6 = i3;
            mo9 mo9Var = mo9.this;
            boolean z = mo9Var.n.a() == mo9Var.b.b().intValue();
            ii9 ii9Var = mo9Var.q;
            boolean isEmpty = TextUtils.isEmpty(ii9Var == null ? null : ii9Var.a);
            b bVar = mo9Var.r;
            boolean z2 = bVar != null && (bVar.c != RecorderBase.RecordingType.ORIGINAL || bVar.a());
            if (mo9Var.e == null || !z || !isEmpty || z2) {
                return;
            }
            int i7 = this.b + 1;
            this.b = i7;
            if (i7 >= this.c) {
                this.b = 0;
                if (bArr == null || i4 * i5 == 0) {
                    return;
                }
                try {
                    one0 one0Var = this.f;
                    fy2 e = one0Var.e();
                    if (e != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        y1x y1xVar = new y1x(i4, i5, i6, ByteBuffer.wrap(bArr));
                        zzmu.zza(zzms.zzb("vision-common"), 17, 2, elapsedRealtime, i2, i, bArr.length, i6);
                        i5 = i2;
                        i4 = i;
                        i6 = i6;
                        List h = e.h(y1xVar);
                        if (h != null && (a = tne0.a(h)) != null) {
                            d = new nne0(i4, i5, a, true);
                            Handler handler = this.d;
                            if (d != null) {
                                ArrayList<Result> arrayList = d.a;
                                if (!arrayList.isEmpty()) {
                                    if (d.b) {
                                        point = new Point(0, 0);
                                    } else {
                                        int b = an10.b(Math.min(i, i2) * 0.7f);
                                        point = new Point((i4 - b) / 2, (i5 - b) / 2);
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Result result : arrayList) {
                                        yne0 yne0Var = new yne0(i4, i5, i6, point.x, point.y);
                                        ParsedResult parseResult = result != null ? ResultParser.parseResult(result) : null;
                                        if (parseResult != null) {
                                            arrayList2.add(new rne0(parseResult, result.getResultPoints(), yne0Var, result.getText(), d.b));
                                        }
                                        i4 = i;
                                        i5 = i2;
                                        i6 = i3;
                                    }
                                    handler.post(new h73(1, this, arrayList2));
                                    return;
                                }
                            }
                            handler.post(new qb3(this, 2));
                        }
                    }
                    d = one0Var.d(i4, i5, i6, bArr);
                    Handler handler2 = this.d;
                    if (d != null) {
                    }
                    handler2.post(new qb3(this, 2));
                } catch (Throwable th) {
                    L.E(th, new Object[0]);
                }
            }
        }
    }

    /* compiled from: CameraViewHolder.java */
    public static class b extends rk9 {
        public final sk9 r;
        public final Executor s;
        public boolean t = true;
        public final dr10 u;

        public b(sk9 sk9Var, pj9 pj9Var, Executor executor, RecorderBase.RecordingType recordingType, eoz eozVar, boolean z) {
            JSONObject jSONObject;
            this.r = sk9Var;
            this.s = executor;
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            b.d i = bVar.i(Features.Type.FEATURE_VIDEO_LIVE_NEW_PUBLISHER);
            if (i == null || !i.a) {
                jSONObject = null;
            } else {
                jSONObject = i.g();
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
            }
            JSONObject jSONObject2 = jSONObject;
            this.u = new dr10(io9.c.a.get(), jSONObject2, z, eozVar, bVar.a(VideoFeatures.VIDEO_LIVE_PUBLISHER_LOGS));
            this.e = pj9Var;
            if (recordingType != null) {
                this.c = recordingType;
            }
            f();
        }

        public final void f() {
            com.vk.media.recorder.f fVar;
            Objects.toString(this.c);
            dr10 dr10Var = this.u;
            sk9 sk9Var = this.r;
            RecorderBase.RecordingType recordingType = this.c;
            boolean z = this.t;
            JSONObject jSONObject = dr10Var.b;
            boolean z2 = dr10Var.c;
            boolean z3 = dr10Var.e;
            Context context = dr10Var.a;
            int i = dr10.a.$EnumSwitchMapping$0[recordingType.ordinal()];
            if (i == 1) {
                fVar = new com.vk.media.recorder.d();
            } else if (i == 2) {
                fVar = jSONObject != null ? new sy70(context, jSONObject, dr10Var.d, z3) : new com.vk.media.recorder.e(context, true, z3);
            } else if (i == 3) {
                fVar = new com.vk.media.recorder.h(context, recordingType, z2);
            } else if (z) {
                fVar = new com.vk.media.recorder.h(context, recordingType, z2);
            } else {
                com.vk.media.recorder.g gVar = new com.vk.media.recorder.g();
                gVar.L = null;
                gVar.A = RecorderBase.RecordingType.ORIGINAL;
                fVar = gVar;
            }
            fVar.t(sk9Var);
            this.i = this.s;
            e(true);
            fVar.p(this.g);
            fVar.f = this;
            fVar.g = this;
            fVar.h = this.e;
            fVar.j = this;
            fVar.n(this.h);
            fVar.b(this.n);
            fVar.y(this.m);
            fVar.l = this.f;
            fVar.x(this.q);
            this.a = fVar;
            this.r.k();
        }

        @Override // xsna.rk9, android.media.MediaRecorder.OnErrorListener
        public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
            if (i != 1002) {
                super.onError(mediaRecorder, i, i2);
            } else {
                this.t = false;
                f();
            }
        }
    }

    public mo9(@NonNull aj9 aj9Var, Context context, kk9.e eVar, Point point, doe0 doe0Var, ExecutorService executorService, eoz eozVar, boolean z, boolean z2) {
        super(aj9Var, context, executorService);
        syf0 syf0Var;
        this.h = new MediaUtils.d();
        this.k = new Object();
        this.l = false;
        this.m = false;
        this.o = false;
        this.p = false;
        mk9 mk9Var = new mk9(aj9Var, context, this, point, f9t.p().getAbsolutePath(), z);
        this.g = mk9Var;
        this.i = eozVar;
        SurfaceView surfaceView = new SurfaceView(context);
        this.d = surfaceView;
        surfaceView.setZOrderMediaOverlay(true);
        this.d.getHolder().addCallback(new no9(eVar));
        this.s = new WeakReference<>(eVar);
        SurfaceView surfaceView2 = this.d;
        if (surfaceView2 == null) {
            Matrix.setIdentityM(mk9Var.c, 0);
            RenderBase.g gVar = new RenderBase.g(mk9Var);
            gVar.k = eVar;
            gVar.h = new com.vk.media.render.a(gVar);
            throw null;
        }
        Matrix.setIdentityM(mk9Var.c, 0);
        RenderBase.f fVar = new RenderBase.f(mk9Var);
        surfaceView2.getHolder().addCallback(fVar);
        fVar.j(mk9Var.a.a);
        RenderBase.d dVar = mk9Var.l;
        if (dVar != null && dVar != fVar && (syf0Var = (syf0) dVar.b) != null) {
            syf0Var.sendMessage(syf0Var.obtainMessage(-2));
        }
        mk9Var.l = fVar;
        mk9Var.b.f = fVar;
        if (z2) {
            L.e(h5s.c(com.vk.media.ok.b.W0, ", use texture=false", new StringBuilder("version=")));
            int i = mk9Var.y.a;
            boolean z3 = i > 0 && i / 2 > 921600 && b4k.e.a();
            a aVar = new a(context, doe0Var);
            this.j = aVar;
            aVar.c = z3 ? 15 : 30;
            if (this.n != null && this.o && mk9Var.b.c != null) {
                a aVar2 = this.j;
                ih9 k = mk9Var.g0.a.k();
                if (k != null && k.a()) {
                    k.sendMessage(k.obtainMessage(2, aVar2));
                }
            }
            if (this.m) {
                this.j.e = this.e;
            }
            if (this.l) {
                this.j.c = 5;
                this.l = false;
            }
        }
    }

    @Override // xsna.oo9
    public final void a(@Nullable MediaUtils.g gVar) {
        if (MediaUtils.a.m(gVar, this.g.o0)) {
            return;
        }
        Objects.toString(gVar);
        if (this.n == null || !this.o) {
            this.g.o0 = gVar;
            return;
        }
        if (MediaUtils.a.m(gVar, this.g.j())) {
            this.g.o0 = gVar;
            return;
        }
        mk9 mk9Var = this.g;
        mk9Var.o0 = gVar;
        jhu0 jhu0Var = this.n;
        rl9.c[] cVarArr = new rl9.c[0];
        if (mk9Var.b.c == null) {
            return;
        }
        Objects.toString(mk9Var.n0);
        mk9Var.p(jhu0Var, (rl9.c[]) Arrays.copyOf(cVarArr, 0));
    }

    @Override // xsna.oo9
    public final void b(boolean z) {
        b bVar;
        this.o = false;
        this.p = false;
        if (!z && (bVar = this.r) != null) {
            bVar.e(false);
        }
        mk9 mk9Var = this.g;
        mk9Var.k0 = false;
        ri9 ri9Var = mk9Var.f0;
        synchronized (ri9Var.b) {
            ri9Var.h = false;
        }
        rl9 rl9Var = mk9Var.g0;
        rl9.b bVar2 = rl9Var.a;
        ih9 k = bVar2.k();
        if (k != null) {
            k.removeCallbacks(rl9Var.d);
            k.removeCallbacks(rl9Var.c);
        }
        ih9 k2 = bVar2.k();
        if (k2 != null) {
            k2.sendMessage(k2.obtainMessage(-2));
        }
        rl9Var.b.close();
        RenderBase.RenderingState renderingState = RenderBase.RenderingState.STOP;
        mk9Var.h = renderingState;
        mk9Var.d(new jx8(6, mk9Var, renderingState));
        mk9Var.j0 = false;
        mk9Var.n0 = null;
        a aVar = this.j;
        if (aVar != null) {
            aVar.e = null;
        }
        synchronized (this.k) {
        }
    }

    public final void d() {
        ih9 k;
        ii9 ii9Var;
        Objects.toString(this.q);
        if (this.n == null || this.o) {
            this.p = true;
        } else {
            b bVar = this.r;
            if (bVar.a == null) {
                bVar.f();
            }
            mk9 mk9Var = this.g;
            mk9Var.o(this.n.a());
            Objects.toString(mk9Var.j());
            mk9 mk9Var2 = this.g;
            RenderTexture.b bVar2 = mk9Var2.b.c;
            if (bVar2 != null) {
                if (this.f || (ii9Var = this.q) == null || !ii9Var.b) {
                    mk9Var2.s(this.n, this.q, new rl9.c[0]);
                } else {
                    com.vk.media.ok.a aVar = mk9Var2.G;
                    if (aVar != null) {
                        aVar.w();
                    }
                }
                this.n.h(bVar2);
                this.n.f();
                this.o = true;
            } else {
                this.p = true;
            }
        }
        a aVar2 = this.j;
        if (aVar2 == null) {
            this.m = true;
            return;
        }
        aVar2.e = this.e;
        mk9 mk9Var3 = this.g;
        if (mk9Var3.b.c == null || (k = mk9Var3.g0.a.k()) == null || !k.a()) {
            return;
        }
        k.sendMessage(k.obtainMessage(2, aVar2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Objects.toString(surfaceTexture);
        MediaUtils.d dVar = this.h;
        dVar.a = i;
        dVar.b = i2;
        if (this.p) {
            d();
        }
        soo0 soo0Var = this.s.get();
        if (soo0Var != null) {
            soo0Var.a();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Objects.toString(surfaceTexture);
        b(false);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        surfaceTexture.toString();
        Arrays.toString(fArr);
        MediaUtils.d dVar = this.h;
        dVar.a = i;
        dVar.b = i2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
