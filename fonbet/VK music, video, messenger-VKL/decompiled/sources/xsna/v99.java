package xsna;

import com.vkontakte.android.R;
import xsna.t99;

/* compiled from: CallSoundsImpl.kt */
/* loaded from: classes7.dex */
public final class v99 implements t99 {
    public final t99.a a;

    public v99(t99.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.t99
    public final t99.b a() {
        this.a.getClass();
        return new t99.b.a(R.raw.call_incoming_new);
    }

    @Override // xsna.t99
    public final t99.b b() {
        this.a.getClass();
        return new t99.b.a(R.raw.call_connecting_060818_01);
    }

    @Override // xsna.t99
    public final t99.b c() {
        this.a.getClass();
        return new t99.b.a(R.raw.call_end_250418_01);
    }

    @Override // xsna.t99
    public final t99.b d() {
        this.a.getClass();
        return new t99.b.a(R.raw.call_connected_070518_01);
    }

    @Override // xsna.t99
    public final t99.b e() {
        this.a.getClass();
        return new t99.b.a(R.raw.call_waiting_accept_060818_01);
    }
}
