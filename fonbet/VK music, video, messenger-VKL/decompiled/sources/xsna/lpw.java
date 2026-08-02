package xsna;

import io.opentelemetry.api.trace.StatusCode;

/* compiled from: ImmutableStatusData.java */
/* loaded from: classes8.dex */
public abstract class lpw implements izk0 {
    public static final tm5 a = new tm5(StatusCode.OK, "");
    public static final tm5 b = new tm5(StatusCode.UNSET, "");
    public static final tm5 c = new tm5(StatusCode.ERROR, "");

    /* compiled from: ImmutableStatusData.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[StatusCode.values().length];
            a = iArr;
            try {
                iArr[StatusCode.UNSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[StatusCode.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[StatusCode.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
