package xsna;

import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.List;
import org.chromium.net.NetError;

/* compiled from: VkMixFetchController.kt */
/* loaded from: classes3.dex */
public final class h4v0 extends wn4 {
    public final u940 a;
    public final com.vk.music.player.playback.e b;
    public final ix4 c = new ix4();
    public final io.reactivex.rxjava3.disposables.g d = new io.reactivex.rxjava3.disposables.g();
    public final j6v0 e = new j6v0();
    public final StartPlayVkMixSource f;
    public boolean g;

    /* compiled from: VkMixFetchController.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StreamMixAudiosRequest(selectedOptionsJson=");
            sb.append(this.a);
            sb.append(", analyticsChunkJson=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public h4v0(u940 u940Var, com.vk.music.player.playback.e eVar) {
        this.a = u940Var;
        this.b = eVar;
        this.f = (StartPlayVkMixSource) eVar.a;
    }

    @Override // xsna.wn4
    public final void g() {
        this.d.b(null);
    }

    @Override // xsna.wn4
    public final boolean l() {
        return hg1.d(this.d.a());
    }

    @Override // xsna.wn4
    public final void m(int i, izs<? super List<xd50>, s3q0> izsVar, izs<? super List<String>, s3q0> izsVar2) {
        long a2 = qni0.a();
        my1.a(a2);
        io.reactivex.rxjava3.internal.operators.single.y l = new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.b(new bzc0(this, new s940(new i7z(a2, -1, -1), 16))), new fhb0(new qjg0(this, 21), 15)).l(new uxb0(new cbt0(this, 4), 16));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.d.b(l.q(asu0.r()).m(asu0Var.d()).subscribe(new d120(new uyn0(4, this, izsVar), 27), new ksb0(new g6m0(6, this, izsVar), 16)));
    }

    @Override // xsna.wn4
    public final int o() {
        return 2;
    }

    @Override // xsna.wn4
    public final void p(izs<? super List<xd50>, s3q0> izsVar) {
        m(0, izsVar, new tc(2));
    }

    public final void s(Throwable th) {
        l5m l5mVar = new l5m(null, null, 3);
        String h = DevNullEventKey.MUSIC_EMPTY_MIX_ERROR.h();
        StringBuilder sb = new StringBuilder("mixId = ");
        StartPlayVkMixSource startPlayVkMixSource = this.f;
        sb.append(startPlayVkMixSource.e);
        String sb2 = sb.toString();
        String str = "entityId = " + startPlayVkMixSource.i;
        StringBuilder sb3 = new StringBuilder("selected options = ");
        MixSettingsEntity mixSettingsEntity = startPlayVkMixSource.h;
        sb3.append(mixSettingsEntity != null ? mixSettingsEntity.e() : null);
        l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, sb2, null, str, null, sb3.toString(), null, ms9.b("error = ", th), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS, 3, null);
        l5mVar.q();
    }
}
