package xsna;

import java.io.InputStream;
import xsna.e8f0.a;

/* compiled from: MsgPackStreamResponseTypeConverter.kt */
/* loaded from: classes11.dex */
public final class on30 implements cpm0 {
    @Override // xsna.cpm0
    public final boolean a(String str) {
        return drm0.D(str, "application/x-msgpack", true);
    }

    @Override // xsna.cpm0
    public final InputStream b(okhttp3.v vVar) {
        return new e8f0(new rn30(vVar.source())).new a();
    }
}
