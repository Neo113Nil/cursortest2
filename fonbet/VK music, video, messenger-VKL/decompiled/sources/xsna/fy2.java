package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Log;
import android.util.LruCache;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Result;

/* compiled from: ApiExt.kt */
/* loaded from: classes18.dex */
public final class fy2 implements hx2, i8l, n6m0 {
    public Object b;

    public /* synthetic */ fy2(Object obj) {
        this.b = obj;
    }

    @Override // xsna.n6m0
    public void Y() {
        ((p6m0) this.b).c.o5().h();
    }

    @Override // xsna.n6m0
    public void a() {
        L.l("Can't removeCurrentHashtag without sticker");
    }

    @Override // xsna.hx2
    public void b(Object obj) {
        ((gzg0) this.b).resumeWith(obj);
    }

    @Override // xsna.i8l
    public void c() {
        qkz qkzVar = (qkz) this.b;
        k kVar = qkzVar.e;
        if (kVar != null) {
            qkzVar.e(kVar.l, kVar.m, kVar.h());
        }
    }

    @Override // xsna.n6m0
    public void d(x6m0 x6m0Var) {
        p6m0 p6m0Var = (p6m0) this.b;
        p6m0Var.a.f(x6m0Var);
        p6m0Var.b.f();
        p6m0Var.c.o5().e();
    }

    @Override // xsna.hx2
    public void e(VKApiExecutionException vKApiExecutionException) {
        ((gzg0) this.b).resumeWith(new Result.Failure(vKApiExecutionException));
    }

    @Override // xsna.i8l
    public void f() {
        MediaCodec mediaCodec;
        qkz qkzVar = (qkz) this.b;
        k kVar = qkzVar.e;
        MediaFormat mediaFormat = null;
        if (kVar != null && (mediaCodec = kVar.b) != null) {
            try {
                mediaFormat = mediaCodec.getOutputFormat();
            } catch (Exception e) {
                Log.e("DecoderBase", "DecoderBase.getOutputMediaFormat() exception caught", e);
            }
        }
        qkzVar.q = mediaFormat;
        qkz.a(qkzVar, mediaFormat);
    }

    @Override // xsna.n6m0
    public void g(v6m0 v6m0Var) {
        L.l("You can't update sticker without sticker");
    }

    public List h(y1x y1xVar) {
        try {
            Task<List<y36>> b = ((a46) this.b).b(y1xVar);
            Tasks.await(b);
            if (b.isSuccessful()) {
                return b.getResult();
            }
            xgx0 xgx0Var = xgx0.a;
            Exception exception = b.getException();
            xgx0Var.getClass();
            xgx0.c("mlkit analyze failure", exception);
            return null;
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.c("mlkit analyze failure", e);
            return null;
        }
    }

    @Override // xsna.i8l
    public void handleDecodedData(ByteBuffer byteBuffer) {
        MediaFormat mediaFormat;
        int remaining = byteBuffer.remaining();
        qkz qkzVar = (qkz) this.b;
        qkzVar.getClass();
        if (qkzVar.f == null && (mediaFormat = qkzVar.q) != null) {
            qkz.a(qkzVar, mediaFormat);
        }
        if (qkzVar.f != null) {
            byteBuffer.rewind();
            qkzVar.f.writeAudioSamples(byteBuffer, remaining);
        }
    }

    public io.reactivex.rxjava3.internal.operators.observable.j1 i(UserId userId) {
        return ((gxh) this.b).N0(fkq0.a(userId)).U(new iwt(jwt.b, 0));
    }

    public fy2(int i) {
        this.b = new Bundle();
    }

    public fy2() {
        this.b = new LruCache(10);
    }

    public fy2(doe0 doe0Var) {
        b46 b46Var = new b46(doe0Var.a());
        w801 w801Var = (w801) qt20.c().a(w801.class);
        w801Var.getClass();
        this.b = new a46(b46Var, (rf01) w801Var.a.get(b46Var), (Executor) w801Var.b.a.get(), zzrw.zzb(c201.b()));
    }
}
