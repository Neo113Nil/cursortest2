package xsna;

import android.content.Context;
import android.graphics.Path;
import com.fyber.inneractive.sdk.util.IAlog;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.media.pipeline.bitrate.EncoderBitrateProvider$Companion$VideoEncoderMotionFactor;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;

/* loaded from: classes12.dex */
public final class ofy0 implements a300, eq90, bjp {
    public static final ofy0 d = new ofy0(0);
    public final /* synthetic */ int b;
    public Object c;

    public /* synthetic */ ofy0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public static void f(com.digitalturbine.ignite.authenticator.events.d dVar, Exception exc) {
        g(dVar, be.J(exc, null));
    }

    public static void g(com.digitalturbine.ignite.authenticator.events.d dVar, Object... objArr) {
        vay0.a("%s : dispatching event", "IgniteEventDispatcher");
        if (((may0) d.c) != null) {
            com.fyber.inneractive.sdk.network.t a = com.fyber.inneractive.sdk.network.t.a(dVar);
            if (a == null) {
                IAlog.f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", dVar);
            } else {
                new com.fyber.inneractive.sdk.network.w(a).a(objArr).a((String) null);
            }
        }
    }

    @Override // xsna.bjp
    public int a(int i, int i2, int i3) {
        return (int) (((EncoderBitrateProvider$Companion$VideoEncoderMotionFactor) this.c).h() * i * i2 * i3);
    }

    @Override // xsna.a300
    public void add(long j) {
        long j2;
        AtomicLong atomicLong = (AtomicLong) this.c;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, j2 + j));
    }

    @Override // xsna.a300
    public long b() {
        long j;
        AtomicLong atomicLong = (AtomicLong) this.c;
        do {
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, 0L));
        return j;
    }

    @Override // xsna.bjp
    public int c(int i, int i2, int i3) {
        Integer num;
        int i4 = 16;
        if (i3 != 1) {
            if (i3 == 2) {
                i4 = 15;
            } else if (i3 != 3 && i3 != 4 && i3 == 5) {
                i4 = 17;
            }
        }
        float f = ((i * 16.0f) * i2) / i4;
        int[] iArr = {8000, 16000, 18000, 20000, 24000, 32000, 40000, 48000, 56000, RtpSenderHelper.AUDIO_BITRATE_MAX, 80000, 96000, 112000, 128000, 160000, 192000, 256000, 320000};
        int i5 = 0;
        while (true) {
            if (i5 >= 18) {
                num = null;
                break;
            }
            int i6 = iArr[i5];
            if (i6 >= f) {
                num = Integer.valueOf(i6);
                break;
            }
            i5++;
        }
        return num != null ? num.intValue() : rl3.a0(iArr);
    }

    @Override // xsna.eq90
    public void e(List list, Path path, boolean z, boolean z2) {
        path.rewind();
        eq90[] eq90VarArr = (eq90[]) this.c;
        for (int i = 0; i < 2; i++) {
            eq90VarArr[i].e(list, path, z, false);
        }
    }

    public io.reactivex.rxjava3.internal.operators.single.b0 h() {
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new jw6(this, 0));
        asu0 asu0Var = asu0.a;
        return vVar.q(asu0Var.c()).m(asu0Var.d());
    }

    public Locale i() {
        return ((Context) this.c).getApplicationContext().getResources().getConfiguration().locale;
    }

    public mmq0 j() {
        return new mmq0(((je0) this.c).d());
    }

    public void k(boolean z) {
        ((je0) this.c).a(z);
    }

    public void l(float f) {
        ((je0) this.c).g(f);
    }

    @Override // xsna.a300
    public void reset() {
        ((AtomicLong) this.c).set(0L);
    }

    @Override // xsna.a300
    public long sum() {
        return ((AtomicLong) this.c).get();
    }

    public String toString() {
        switch (this.b) {
            case 2:
                return Long.toString(((AtomicLong) this.c).get());
            default:
                return super.toString();
        }
    }

    public ofy0(int i) {
        this.b = i;
        switch (i) {
            case 2:
                this.c = new AtomicLong();
                break;
            case 4:
                this.c = e43.l(UsersFieldsDto.CAREER, UsersFieldsDto.CITY, UsersFieldsDto.COUNTRY, UsersFieldsDto.EDUCATION, UsersFieldsDto.SEX, UsersFieldsDto.DESCRIPTION, UsersFieldsDto.DESCRIPTIONS, UsersFieldsDto.ACTIVITY, UsersFieldsDto.VERIFIED, UsersFieldsDto.TRENDING, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE);
                break;
            case 9:
                this.c = new bpn0(new ufm0(13));
                break;
        }
    }

    public ofy0(je0 je0Var, mzr0 mzr0Var) {
        this.b = 8;
        this.c = je0Var;
    }
}
