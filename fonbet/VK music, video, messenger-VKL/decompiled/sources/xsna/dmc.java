package xsna;

import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.List;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;

/* compiled from: ClipAutoPlayPerformanceScrollListener.kt */
/* loaded from: classes17.dex */
public final class dmc extends RecyclerView.t {
    public final y5e b;
    public final okh0 c;
    public final te0 d;
    public RecyclerView.e0 e;
    public RecyclerView.e0 f;
    public kih0 g;
    public a h;
    public Long i;
    public Long j;
    public Long k;
    public Integer l;
    public boolean m;

    public dmc(y5e y5eVar, okh0 okh0Var, te0 te0Var) {
        this.b = y5eVar;
        this.c = okh0Var;
        this.d = te0Var;
    }

    public final void l() {
        Long l = this.i;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.j;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                Long l3 = this.k;
                if (l3 == null || longValue2 <= l3.longValue()) {
                    return;
                }
                long j = longValue2 - longValue;
                this.c.i(longValue2, longValue);
                this.d.getClass();
                int i = ClipFeedListFragment.a2;
                fsk0 fsk0Var = qsk0.a;
                if (fsk0Var == null) {
                    return;
                }
                l5m l5mVar = new l5m(fsk0Var, null, 2);
                l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIPS_AUTO_PLAY_AFTER_SCROLL.h(), null, String.valueOf(j), Integer.valueOf((int) j), this.b.a, Integer.valueOf(this.m ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -62, 3, null);
                l5mVar.q();
                L l4 = L.a;
                l4.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l4, L.LogType.d, new Object[]{qlb0.a(j, "(playback started) - (scroll idle) = ", " ms")});
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = false;
        boolean z2 = recyclerView.getScrollState() == 2;
        Integer num = this.l;
        boolean z3 = num != null && num.intValue() == 0;
        if (z2 && z3) {
            return;
        }
        this.l = Integer.valueOf(recyclerView.getScrollState());
        int scrollState = recyclerView.getScrollState();
        if (scrollState == 0) {
            RecyclerView.e0 e0Var = this.f;
            if ((e0Var instanceof pi5) && !epx.f(e0Var, this.e)) {
                this.i = Long.valueOf(SystemClock.elapsedRealtime());
                l();
            }
            this.e = this.f;
            this.f = null;
            this.g = null;
            return;
        }
        if (scrollState == 1) {
            this.k = null;
            this.m = false;
        } else {
            if (scrollState != 2) {
                return;
            }
            this.k = Long.valueOf(SystemClock.elapsedRealtime());
            kih0 kih0Var = this.g;
            if (kih0Var != null && kih0Var.isPrepared()) {
                z = true;
            }
            this.m = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z = recyclerView.getScrollState() == 2;
        Integer num = this.l;
        boolean z2 = num != null && num.intValue() == 0;
        if (z && z2) {
            return;
        }
        boolean z3 = i2 > 0;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(z3 ? linearLayoutManager.x() : linearLayoutManager.v());
        if (epx.f(findViewHolderForAdapterPosition, this.f)) {
            return;
        }
        a aVar = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.m = false;
        this.f = findViewHolderForAdapterPosition;
        if (!(findViewHolderForAdapterPosition instanceof pi5)) {
            this.g = null;
            a aVar2 = this.h;
            if (aVar2 != null) {
                aVar2.a.o(aVar2);
            }
            this.h = null;
            return;
        }
        this.g = ((pi5) findViewHolderForAdapterPosition).j();
        a aVar3 = this.h;
        if (aVar3 != null) {
            aVar3.a.o(aVar3);
        }
        kih0 kih0Var = this.g;
        if (kih0Var != null) {
            aVar = new a(kih0Var);
            kih0Var.p(aVar);
        }
        this.h = aVar;
    }

    /* compiled from: ClipAutoPlayPerformanceScrollListener.kt */
    public final class a implements lih0 {
        public final kih0 a;

        public a(kih0 kih0Var) {
            this.a = kih0Var;
        }

        @Override // xsna.lih0
        public final void onIsPlayingChanged(boolean z) {
            if (z) {
                Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
                dmc dmcVar = dmc.this;
                dmcVar.j = valueOf;
                dmcVar.l();
            }
            this.a.o(this);
        }

        @Override // xsna.lih0
        public final void c() {
        }

        @Override // xsna.lih0
        public final void u() {
        }

        @Override // xsna.lih0
        public final void x0() {
        }

        @Override // xsna.lih0
        public final void L(qi5 qi5Var) {
        }

        @Override // xsna.lih0
        public final void M(qi5 qi5Var) {
        }

        @Override // xsna.lih0
        public final void a(boolean z) {
        }

        @Override // xsna.lih0
        public final void b(qi5 qi5Var) {
        }

        @Override // xsna.lih0
        public final void d(qi5 qi5Var) {
        }

        @Override // xsna.lih0
        public final void e(qi5 qi5Var) {
        }

        @Override // xsna.lih0
        public final void f(qi5 qi5Var) {
        }

        @Override // xsna.lih0
        public final void g(qi5 qi5Var) {
        }

        @Override // xsna.lih0
        public final void h(qi5 qi5Var) {
        }

        @Override // xsna.lih0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.lih0
        public final void H(long j, long j2) {
        }

        @Override // xsna.lih0
        public final void K(int i, int i2) {
        }

        @Override // xsna.lih0
        public final void I(qi5 qi5Var, long j, long j2) {
        }

        @Override // xsna.lih0
        public final void J(qi5 qi5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        }
    }
}
