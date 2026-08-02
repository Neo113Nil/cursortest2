package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import java.io.File;
import java.util.ArrayList;
import ru.ok.android.webrtc.DataChannels;
import ru.ok.android.webrtc.animoji.render.api.AnimojiSvgResource;

/* compiled from: AnimojiSvgResourceAdapter.kt */
/* loaded from: classes7.dex */
public final class rs2 implements AnimojiSvgResource {
    public final UserId b;
    public final CallId c;
    public final ks2 d;
    public volatile io.reactivex.rxjava3.internal.operators.single.a e;
    public volatile boolean f;

    public rs2(UserId userId, CallId callId, ks2 ks2Var) {
        this.b = userId;
        this.c = callId;
        this.d = ks2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiSvgResource
    public final byte[] asData() {
        byte[] bArr;
        io.reactivex.rxjava3.internal.operators.single.a aVar = this.e;
        if (aVar == null || (bArr = (byte[]) aVar.c()) == null) {
            throw new RuntimeException("not prepared");
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiSvgResource
    public final File asFile() {
        this.f = true;
        File m = m();
        io.reactivex.rxjava3.internal.operators.single.a aVar = this.e;
        if (aVar != null) {
            return m.exists() ? m : (File) aVar.m(asu0.a.c()).l(new gv(new com.vk.movika.sdk.base.observable.m(m, 6), 2)).c();
        }
        throw new RuntimeException("not prepared");
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiSvgResource
    public final int bgColorRGB() {
        ArrayList arrayList = ds2.a;
        return ds2.a(brm0.u(asData()), this.c.b);
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiSvgResource, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            m().delete();
        }
        this.e = null;
    }

    public final File m() {
        File file = new File(com.vk.core.files.a.j(), DataChannels.ANIMOJI);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "ani-" + this.b + ".svg");
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiSvgResource
    public final void prepare() {
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new os2(this, 0));
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.single.a aVar = new io.reactivex.rxjava3.internal.operators.single.a(new io.reactivex.rxjava3.internal.operators.single.r(vVar.q(asu0.r()), new ps2(new com.vk.movika.sdk.base.observable.i(2), 0)).h(new qs2(new x4(2), 0)));
        aVar.subscribe();
        this.e = aVar;
    }
}
