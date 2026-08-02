package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.repository.HubContentState;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class me31 {
    public boolean a;
    public String b;
    public c1v c = z0v.a;
    public final r0 d;
    public final gci0 e;
    public final n0 f;
    public final eci0 g;
    public final r0 h;
    public final gci0 i;

    public me31() {
        r0 c = bvf0.c(ModalState.Other);
        this.d = c;
        this.e = e.d(c);
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.f = b;
        this.g = e.c(b);
        r0 c2 = bvf0.c(HubContentState.LOADING);
        this.h = c2;
        this.i = e.d(c2);
    }
}
