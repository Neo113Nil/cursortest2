package xsna;

import com.vk.knet.core.http.HttpProtocol;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.Protocol;

/* compiled from: HttpExt.kt */
/* loaded from: classes15.dex */
public final class jjv {

    /* compiled from: HttpExt.kt */
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
                iArr[HttpProtocol.SPDY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HttpProtocol.QUIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Protocol a(HttpProtocol httpProtocol) {
        int i = a.$EnumSwitchMapping$0[httpProtocol.ordinal()];
        if (i == 1) {
            return Protocol.HTTP_1_0;
        }
        if (i == 2) {
            return Protocol.HTTP_1_1;
        }
        if (i == 3) {
            return Protocol.HTTP_2;
        }
        if (i == 4) {
            return Protocol.SPDY_3;
        }
        if (i == 5) {
            return Protocol.QUIC;
        }
        throw new NoWhenBranchMatchedException();
    }
}
