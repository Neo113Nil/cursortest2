package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.video.b;
import com.yandex.fintechsdk.core.telemetry.api.SpanKind;
import java.util.LinkedHashMap;
import kotlin.random.Random;

/* loaded from: classes12.dex */
public final class glt0 {
    public long a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public glt0(xjg xjgVar, b bVar) {
        this.c = xjgVar;
        this.d = bVar;
        this.e = new yl31();
        this.f = new w8z0();
        this.g = new w8z0();
        this.h = new slz();
        this.a = -9223372036854775807L;
        this.i = do31.d;
    }

    public void a() {
        this.b = System.currentTimeMillis() * 1000000;
        String str = (String) this.d;
        String str2 = (String) this.c;
        String str3 = (String) this.e;
        if (str3 == null) {
            str3 = bgu.e(Random.a.j(8));
        }
        ((tls) this.g).invoke(new klt0(str, str2, str3, (SpanKind) this.h, (String) this.f, (LinkedHashMap) this.i, this.a, this.b));
    }

    public void b(long j, long j2) {
        int a;
        xjg xjgVar = (xjg) this.c;
        mnh mnhVar = (mnh) xjgVar.c;
        Object obj = this.d;
        b bVar = (b) obj;
        slz slzVar = (slz) this.h;
        do {
            int i = slzVar.b;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                ny61.p();
                return;
            }
            long j3 = slzVar.c[slzVar.a];
            Long l = (Long) ((w8z0) this.g).f(j3);
            if (l != null && l.longValue() != this.b) {
                this.b = l.longValue();
                bVar.d(2);
            }
            a = ((b) obj).a(j3, j, j2, this.b, false, false, (yl31) this.e);
            if (a == 0 || a == 1) {
                r8 = a != 0 ? 0 : 1;
                long a2 = slzVar.a();
                do31 do31Var = (do31) ((w8z0) this.f).f(a2);
                if (do31Var != null && !do31Var.equals(do31.d) && !do31Var.equals((do31) this.i)) {
                    this.i = do31Var;
                    f7s f7sVar = new f7s();
                    f7sVar.t = do31Var.a;
                    f7sVar.u = do31Var.b;
                    f7sVar.m = eh20.q("video/raw");
                    xjgVar.b = new a(f7sVar);
                    mnhVar.h.execute(new lnh(xjgVar, do31Var));
                }
                if (r8 == 0) {
                    long j4 = ((yl31) this.e).b;
                }
                bVar.e();
                a aVar = (a) xjgVar.b;
                a aVar2 = aVar == null ? new a(new f7s()) : aVar;
                xl31 xl31Var = mnhVar.i;
                ((o2x0) mnhVar.b).getClass();
                xl31Var.c(a2, System.nanoTime(), aVar2, null);
                mnhVar.d.remove().getClass();
                ny61.u();
                return;
            }
            if (a == 2 || a == 3) {
                slzVar.a();
                mnhVar.h.execute(new lnh(xjgVar, r8));
                mnhVar.d.remove().getClass();
                ny61.u();
                return;
            }
        } while (a == 4);
        if (a == 5) {
            return;
        }
        ny61.r(String.valueOf(a));
    }

    public glt0(String str, String str2, tls tlsVar) {
        this.c = str;
        this.d = str2;
        this.g = tlsVar;
        this.h = SpanKind.SPAN_KIND_INTERNAL;
        this.i = new LinkedHashMap();
    }
}
