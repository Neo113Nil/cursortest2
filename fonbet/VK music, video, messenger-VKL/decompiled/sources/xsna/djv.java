package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import xsna.o260;

/* compiled from: HttpExecutorInitializer.kt */
/* loaded from: classes.dex */
public final class djv implements o260.d {
    public final /* synthetic */ bpn0 a;
    public final /* synthetic */ b260 b;

    /* compiled from: HttpExecutorInitializer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkClient.ClientType.values().length];
            try {
                iArr[NetworkClient.ClientType.CLIENT_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkClient.ClientType.CLIENT_IMAGE_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public djv(bpn0 bpn0Var, b260 b260Var) {
        this.a = bpn0Var;
        this.b = b260Var;
    }
}
