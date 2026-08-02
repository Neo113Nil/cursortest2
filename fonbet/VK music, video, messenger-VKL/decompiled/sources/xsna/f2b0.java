package xsna;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.vk.dto.stickers.StickerPackPreviewModel;
import com.vk.music.player.LoopMode;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;

/* compiled from: PlayerImpl.java */
/* loaded from: classes3.dex */
public final class f2b0 implements nya0, c680, u4u0, vut0 {
    public final Object b;

    public /* synthetic */ f2b0(Object obj) {
        this.b = obj;
    }

    @Override // xsna.nya0
    @NonNull
    public LoopMode a() {
        return ((e2b0) this.b).q.n0();
    }

    @Override // xsna.nya0
    public void b(@NonNull LoopMode loopMode) {
        ((e2b0) this.b).q.b(loopMode);
    }

    @Override // xsna.nya0
    public void d(boolean z) {
        e2b0 e2b0Var = (e2b0) this.b;
        e2b0Var.q.d(z);
        e2b0Var.q.M0(z);
    }

    @Override // xsna.u4u0
    public void e(int i, Object obj, boolean z) {
        hfz hfzVar = (hfz) obj;
        sal0 sal0Var = (sal0) this.b;
        if (sal0Var.b.isAttachedToWindow() && (hfzVar instanceof dhy)) {
            dhy dhyVar = (dhy) hfzVar;
            if (dhyVar.c) {
                int a = dhyVar.a();
                t6g0 t6g0Var = t6g0.b;
                Iterator<T> it = t6g0.d().X0().a().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (((StickerPackPreviewModel) next).e() == a) {
                        break;
                    } else {
                        i2++;
                    }
                }
                Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                y4l0 y4l0Var = sal0Var.g;
                if (y4l0Var != null) {
                    y4l0Var.o(dhyVar.a(), z, valueOf);
                }
            }
        }
    }

    public void f() {
        gzs<s3q0> onLowMemoryError = ((k3g) this.b).getOnLowMemoryError();
        if (onLowMemoryError != null) {
            onLowMemoryError.invoke();
        }
    }

    public void g(Map map) {
        Handler mainHandler;
        k3g k3gVar = (k3g) this.b;
        mainHandler = k3gVar.getMainHandler();
        mainHandler.post(new rm3(1, k3gVar, map));
    }

    @Override // xsna.vut0
    public View getView() {
        return (ImageView) this.b;
    }

    public void h(Map map) {
        Handler mainHandler;
        k3g k3gVar = (k3g) this.b;
        mainHandler = k3gVar.getMainHandler();
        mainHandler.post(new w63(3, k3gVar, map));
    }

    @Override // xsna.c680
    public void onFailure(Exception exc) {
        ((lq9) this.b).resumeWith(new Result.Failure(exc));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f2b0(cno cnoVar) {
        this.b = (ImageView) cnoVar.getView();
    }

    @Override // xsna.vut0
    public void c(rzt0 rzt0Var) {
    }
}
