package xsna;

import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: VkRawError.kt */
/* loaded from: classes15.dex */
public final class cfv0 extends wz2 {
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    /* compiled from: VkRawError.kt */
    public static final class a {
        public static cfv0 a(VKApiExecutionException vKApiExecutionException) {
            ApiErrorViewType G = vKApiExecutionException.G();
            if (G == null) {
                G = ApiErrorViewType.CUSTOM;
            }
            return new cfv0(vKApiExecutionException.g(), G, vKApiExecutionException.t(), vKApiExecutionException.s(), vKApiExecutionException.C(), vKApiExecutionException.u());
        }
    }

    public cfv0(String str, ApiErrorViewType apiErrorViewType, String str2, int i, int i2, String str3) {
        super(str, apiErrorViewType);
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = str3;
    }
}
