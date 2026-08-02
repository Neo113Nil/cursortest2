package xsna;

import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ubw0;
import xsna.wbw0;

/* compiled from: VoiceMessageFeature.kt */
/* loaded from: classes18.dex */
public final class tbw0 extends di6<zbw0, wbw0, Object, ubw0> {
    public final ir4 h;
    public final u2b0 i;
    public final boolean j;
    public final a k;
    public final c l;
    public final d m;
    public final e n;
    public static final /* synthetic */ qcy<Object>[] p = {new MutablePropertyReference1Impl(tbw0.class, "voiceMessagePlayerHasTracks", "getVoiceMessagePlayerHasTracks()Z", 0), p5j.a(0, tbw0.class, "musicPlayerVisible", "getMusicPlayerVisible()Z", fpf0.a)};
    public static final b o = new b();

    /* compiled from: VoiceMessageFeature.kt */
    public final class a extends o56 {
        public a() {
        }

        @Override // xsna.o56, xsna.kr4
        public final void p(ir4 ir4Var, bgk0 bgk0Var, List<ur4> list) {
            boolean t = ir4Var.t();
            tbw0 tbw0Var = tbw0.this;
            tbw0Var.m.setValue(tbw0Var, tbw0.p[0], Boolean.valueOf(t));
        }

        @Override // xsna.o56, xsna.kr4
        public final void s(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            tbw0 tbw0Var = tbw0.this;
            tbw0Var.m.setValue(tbw0Var, tbw0.p[0], Boolean.FALSE);
        }
    }

    /* compiled from: VoiceMessageFeature.kt */
    public static final class b {
    }

    /* compiled from: VoiceMessageFeature.kt */
    public final class c extends e.a {
        public c() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            if (playState == null) {
                playState = PlayState.IDLE;
            }
            boolean z = (playState == PlayState.IDLE || playState == PlayState.STOPPED) ? false : true;
            tbw0 tbw0Var = tbw0.this;
            tbw0Var.n.setValue(tbw0Var, tbw0.p[1], Boolean.valueOf(z));
        }
    }

    /* compiled from: Delegates.kt */
    public static final class d extends wq70<Boolean> {
        public final /* synthetic */ tbw0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Boolean bool, tbw0 tbw0Var) {
            super(bool);
            this.b = tbw0Var;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
            bool2.getClass();
            bool.getClass();
            tbw0 tbw0Var = this.b;
            tbw0Var.q(new rzl0(tbw0Var, 28));
        }
    }

    /* compiled from: Delegates.kt */
    public static final class e extends wq70<Boolean> {
        public final /* synthetic */ tbw0 b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(tbw0 tbw0Var) {
            super(r0);
            Boolean bool = Boolean.FALSE;
            this.b = tbw0Var;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
            bool2.getClass();
            bool.getClass();
            tbw0 tbw0Var = this.b;
            tbw0Var.q(new rzl0(tbw0Var, 28));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tbw0(ir4 ir4Var, u2b0 u2b0Var, boolean z) {
        super(new zbw0(r3));
        boolean t = ir4Var.t();
        PlayState m0 = u2b0Var.m0();
        m0 = m0 == null ? PlayState.IDLE : m0;
        boolean z2 = false;
        boolean z3 = (m0 == PlayState.IDLE || m0 == PlayState.STOPPED) ? false : true;
        o.getClass();
        if (t && (z || !z3)) {
            z2 = true;
        }
        this.h = ir4Var;
        this.i = u2b0Var;
        this.j = z;
        a aVar = new a();
        this.k = aVar;
        c cVar = new c();
        this.l = cVar;
        this.m = new d(Boolean.valueOf(ir4Var.t()), this);
        this.n = new e(this);
        ir4Var.v(aVar);
        u2b0Var.P0(cVar, true);
    }

    @Override // xsna.di6
    public final void d(wbw0 wbw0Var) {
        wbw0 wbw0Var2 = wbw0Var;
        if (!(wbw0Var2 instanceof wbw0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        wbw0.a aVar = (wbw0.a) wbw0Var2;
        m(new ubw0.a(aVar.b, aVar.c, aVar.d));
    }

    @Override // xsna.di6, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.h.y(this.k);
        this.i.n0(this.l);
    }
}
