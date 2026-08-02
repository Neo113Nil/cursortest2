package xsna;

import android.text.TextUtils;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vk.voip.b;
import com.vk.voip.ui.VoipViewModelState;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.gleffects.EffectRegistry;
import xsna.k5x0;
import xsna.kg10;

/* compiled from: VoipVisualEffectsDelegate.kt */
/* loaded from: classes7.dex */
public final class l5x0 {
    public final com.vk.voip.ui.c a;
    public final io.reactivex.rxjava3.subjects.d<b> b = io.reactivex.rxjava3.subjects.d.O0(new b(k5x0.a.c, k5x0.b.c));
    public final io.reactivex.rxjava3.subjects.f<k5x0> c;
    public String d;
    public CallId e;
    public final bpn0 f;
    public final bpn0 g;
    public final kg10 h;

    /* compiled from: VoipVisualEffectsDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<k5x0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(k5x0 k5x0Var) {
            k5x0 k5x0Var2 = k5x0Var;
            l5x0 l5x0Var = (l5x0) this.receiver;
            io.reactivex.rxjava3.subjects.d<b> dVar = l5x0Var.b;
            io.reactivex.rxjava3.subjects.d<b> dVar2 = l5x0Var.b;
            b P0 = dVar.P0();
            if (k5x0Var2 instanceof k5x0.a) {
                k5x0.a aVar = (k5x0.a) k5x0Var2;
                if (!epx.f(P0.a, aVar)) {
                    if (epx.f(aVar, k5x0.a.c)) {
                        l5x0Var.h.e.onNext(kg10.b.a.a);
                    }
                    dVar2.onNext(new b(aVar, P0.b));
                }
            } else {
                if (!(k5x0Var2 instanceof k5x0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                k5x0.b bVar = (k5x0.b) k5x0Var2;
                if (!epx.f(P0.b, bVar)) {
                    dVar2.onNext(new b(P0.a, bVar));
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipVisualEffectsDelegate.kt */
    public static final class b {
        public final k5x0.a a;
        public final k5x0.b b;

        public b(k5x0.a aVar, k5x0.b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "State(mask=" + this.a + ", background=" + this.b + ')';
        }
    }

    /* compiled from: VoipVisualEffectsDelegate.kt */
    public static final class c {
        public c() {
        }

        public final void a(Mask mask, String str) {
            l5x0.this.b(mask, str);
        }
    }

    /* compiled from: VoipVisualEffectsDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<UserId> {
        @Override // xsna.gzs
        public final UserId invoke() {
            return ((rew0) this.receiver).f();
        }
    }

    public l5x0(com.vk.voip.ui.c cVar) {
        this.a = cVar;
        io.reactivex.rxjava3.subjects.f<k5x0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.c = fVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.f = new bpn0(new egu0(this, 6));
        this.g = new bpn0(new v5n0(this, 28));
        this.h = new kg10();
        bVar.b(fVar.a0(asu0.a.d()).subscribe(new q9w0(new a(1, this, l5x0.class, "applyRequest", "applyRequest(Lcom/vk/voip/ui/delegate/camera/VoipVisualEffect;)V", 0), 2)));
    }

    public static String g(Mask mask) {
        NotificationImage notificationImage = mask.l;
        if (notificationImage == null) {
            L.e("VoipVisualEffectsDelegate", "Preview object missing");
            return "";
        }
        int b2 = cn70.b(28);
        String Cb = notificationImage.Cb(b2);
        if (Cb != null) {
            return Cb;
        }
        String Db = NotificationImage.Db(notificationImage, b2);
        if (Db != null) {
            return Db;
        }
        L.e("VoipVisualEffectsDelegate", j5g.g0(notificationImage.Ab(), ", ", h5s.c(mask.d, ", available sizes are ", ji.b(b2, "No image found for size ", " at ")), null, 0, new h2h0(18), 28));
        return "";
    }

    public final void a(String str) {
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: all -> 0x0006, TryCatch #0 {all -> 0x0006, blocks: (B:29:0x0002, B:2:0x0008, B:4:0x0013, B:10:0x0032, B:12:0x0036, B:13:0x0045, B:21:0x0039, B:22:0x0021, B:25:0x002f, B:26:0x0027), top: B:28:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[Catch: all -> 0x0006, TryCatch #0 {all -> 0x0006, blocks: (B:29:0x0002, B:2:0x0008, B:4:0x0013, B:10:0x0032, B:12:0x0036, B:13:0x0045, B:21:0x0039, B:22:0x0021, B:25:0x002f, B:26:0x0027), top: B:28:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0027 A[Catch: all -> 0x0006, TryCatch #0 {all -> 0x0006, blocks: (B:29:0x0002, B:2:0x0008, B:4:0x0013, B:10:0x0032, B:12:0x0036, B:13:0x0045, B:21:0x0039, B:22:0x0021, B:25:0x002f, B:26:0x0027), top: B:28:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Mask mask, String str) {
        boolean z;
        if (mask != null) {
            try {
                mask.Db();
            } catch (Throwable th) {
                L.i(th);
                return;
            }
        }
        this.a.getClass();
        if (!com.vk.voip.ui.c.v0() && com.vk.voip.ui.c.K0 != VoipViewModelState.Idle) {
            z = false;
            if (z || str == null) {
                com.vk.voip.ui.c.r.u(str != null ? null : f9t.m(str).getPath());
            }
            this.c.onNext(mask != null ? k5x0.a.c : new k5x0.a(mask.d, g(mask)));
        }
        z = true;
        if (z) {
        }
        com.vk.voip.ui.c.r.u(str != null ? null : f9t.m(str).getPath());
        this.c.onNext(mask != null ? k5x0.a.c : new k5x0.a(mask.d, g(mask)));
    }

    public final void c(Mask mask) {
        k5x0.b bVar = k5x0.b.c;
        io.reactivex.rxjava3.subjects.f<k5x0> fVar = this.c;
        try {
            if (mask == null) {
                e(null);
                fVar.onNext(bVar);
                return;
            }
            List<k9x> list = pw70.a;
            EffectRegistry.EffectId b2 = pw70.b(mask.d);
            String Db = mask.Db();
            File n = !TextUtils.isEmpty(Db) ? f9t.n(Db) : null;
            if (b2 != null && n != null) {
                d(new b.a(b2, n, g(mask)));
            } else {
                e(null);
                fVar.onNext(bVar);
            }
        } catch (Throwable th) {
            L.i(th);
        }
    }

    public final void d(b.a aVar) {
        io.reactivex.rxjava3.subjects.f<k5x0> fVar = this.c;
        if (aVar == null) {
            e(null);
            fVar.onNext(k5x0.b.c);
            return;
        }
        e(aVar);
        int i = aVar.a.id;
        String str = aVar.c;
        if (str == null) {
            str = "";
        }
        fVar.onNext(new k5x0.b(i, str));
    }

    public final void e(b.a aVar) {
        this.a.getClass();
        v2x0 v2x0Var = com.vk.voip.ui.c.r0;
        if (v2x0Var == null) {
            v2x0Var = null;
        }
        v2x0Var.g.d.invoke();
        com.vk.voip.ui.c.r.getClass();
        dfs dfsVar = OKVoipEngine.i;
        if (dfsVar != null) {
            dfsVar.d(aVar);
        }
        com.vk.voip.ui.c.C = b39.a(com.vk.voip.ui.c.C, aVar, null, 2);
    }

    public final void f() {
        this.b.onNext(new b(k5x0.a.c, k5x0.b.c));
    }

    public final void h() {
        String str;
        String str2;
        wnw0 wnw0Var = (wnw0) this.f.getValue();
        this.a.getClass();
        if (com.vk.voip.ui.c.T0.d) {
            this.a.getClass();
            if (!epx.f(com.vk.voip.ui.c.T0, this.e) && (str2 = this.d) != null && str2.length() != 0) {
                this.a.getClass();
                this.e = com.vk.voip.ui.c.T0;
                str = this.d;
                wnw0Var.a(str);
            }
        }
        str = null;
        wnw0Var.a(str);
    }
}
