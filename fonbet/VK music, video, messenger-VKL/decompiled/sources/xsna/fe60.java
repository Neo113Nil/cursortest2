package xsna;

import android.view.Display;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.UserProfile;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import xsna.o2z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fe60 implements io.reactivex.rxjava3.core.c0, jbg0, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, ptk0, b680, io.reactivex.rxjava3.functions.i, o2z0.b, yads.ti3 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fe60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.o2z0.b
    public void a(boolean z) {
        ((CountDownLatch) this.c).countDown();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 5:
                return (h5c0) ((xka0) this.c).invoke(obj);
            case 6:
            case 9:
            case 11:
            default:
                return (UserProfile) ((bws) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.b0) ((yka0) this.c).invoke(obj);
            case 8:
                return (Pair) ((crx) this.c).invoke(obj);
            case 10:
                return (Boolean) ((p010) this.c).invoke(obj);
            case 12:
                return (MusicTrack) ((bws) this.c).invoke(obj);
            case 13:
                return (String) ((bws) this.c).invoke(obj);
            case 14:
                return (VKList) ((snq0) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.t) ((lq5) this.c).invoke(obj);
            case 16:
                return (Pair) ((bws) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.c0
    public io.reactivex.rxjava3.core.b0 b(io.reactivex.rxjava3.core.x xVar) {
        return (io.reactivex.rxjava3.core.b0) ((piy) this.c).invoke(xVar);
    }

    @Override // xsna.jbg0
    public void c(String str) {
        Objects.toString((zpa0) this.c);
    }

    public void d(Display display) {
        ((yads.yi3) this.c).a(display);
    }

    public void e(le60 le60Var) {
        ge60 ge60Var = (ge60) this.c;
        int i = ge60.l1;
        ge60Var.getFeature().g.b(le60Var);
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (com.vk.voip.ui.sessionrooms.f) ((jxi0) this.c).invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // xsna.b680
    public void onFailure(Throwable th) {
        ((io.reactivex.rxjava3.core.y) this.c).onError(th);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((px30) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ fe60(zpa0 zpa0Var, String str) {
        this.b = 2;
        this.c = zpa0Var;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        ((y8c0) this.c).v.a(s3q0.a, (v9c0) lm50Var);
    }
}
