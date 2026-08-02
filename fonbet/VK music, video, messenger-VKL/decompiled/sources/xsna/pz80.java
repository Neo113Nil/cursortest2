package xsna;

import com.vk.knet.core.http.HttpProtocol;
import xsna.zjv;

/* compiled from: OtelHttpInterceptor.kt */
/* loaded from: classes2.dex */
public final class pz80 implements ojv {
    public static final kq b = new kq(26);
    public final wdp0 a;

    /* compiled from: OtelHttpInterceptor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpProtocol.values().length];
            try {
                iArr[HttpProtocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpProtocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpProtocol.HTTP_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HttpProtocol.QUIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HttpProtocol.SPDY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pz80(wdp0 wdp0Var) {
        this.a = wdp0Var;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        ckv ckvVar = aVar.b;
        return (mkv) vhk0.i(this.a, String.valueOf(ckvVar.a), true, new yhu(ckvVar, 16), new com.vk.libvideo.b(ckvVar, aVar, this));
    }
}
