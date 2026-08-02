package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: MusicRestrictionModelImpl.kt */
/* loaded from: classes.dex */
public final class s450 implements o450 {
    public final com.vk.music.notifications.restriction.a a;
    public final bpn0 b;
    public io.reactivex.rxjava3.disposables.c c;

    public s450(com.vk.music.notifications.restriction.a aVar, bpn0 bpn0Var) {
        this.a = aVar;
        this.b = bpn0Var;
    }

    @Override // xsna.o450
    public final void a() {
        long currentTimeMillis = System.currentTimeMillis();
        Long[] Z = f().Z();
        ArrayList arrayList = new ArrayList();
        for (Long l : Z) {
            if (currentTimeMillis - 3600000 < l.longValue()) {
                arrayList.add(l);
            }
        }
        arrayList.add(Long.valueOf(currentTimeMillis));
        f().w((Long[]) arrayList.toArray(new Long[0]));
    }

    @Override // xsna.o450
    public final int b() {
        long currentTimeMillis = System.currentTimeMillis();
        Long[] p0 = f().p0();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.i;
            StringBuilder b = fp.b(currentTimeMillis, "currentTime = ", ", times = ");
            b.append(Arrays.toString(p0));
            L.u(l, logType, new Object[]{b.toString()});
        }
        int i = 0;
        for (Long l2 : p0) {
            if (currentTimeMillis - 86400000 < l2.longValue()) {
                i++;
            }
        }
        return i;
    }

    @Override // xsna.o450
    public final void c(MusicTrack musicTrack) {
        bn40.f("MusicMessageQueue", "sendAudioStartEvent()");
        io.reactivex.rxjava3.disposables.c cVar = this.c;
        if (cVar != null) {
            cVar.dispose();
        }
        this.c = rsg0.y0(new gx4(musicTrack.Fb(), vx2.d.getDeviceId()), null, null, 3).subscribe(new zyu(new fo20(this, 4), 9), new st0(new k220(7), 29));
    }

    @Override // xsna.o450
    public final void d() {
        long currentTimeMillis = System.currentTimeMillis();
        Long[] p0 = f().p0();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.i;
            StringBuilder b = fp.b(currentTimeMillis, "currentTime = ", ", times = ");
            b.append(Arrays.toString(p0));
            L.u(l, logType, new Object[]{b.toString()});
        }
        ArrayList arrayList = new ArrayList();
        for (Long l2 : p0) {
            if (currentTimeMillis - 86400000 < l2.longValue()) {
                arrayList.add(l2);
            }
        }
        arrayList.add(Long.valueOf(currentTimeMillis));
        f().P((Long[]) arrayList.toArray(new Long[0]));
    }

    @Override // xsna.o450
    public final void e() {
        k840.a.a(null);
    }

    public final com.vk.music.pref.a f() {
        return (com.vk.music.pref.a) this.b.getValue();
    }
}
