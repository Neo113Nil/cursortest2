package xsna;

import com.vk.upload.impl.UploadNotification;

/* compiled from: WebInternalDelegate.kt */
/* loaded from: classes7.dex */
public final class qgx0 {
    public final onx a;
    public final fvv0 b;
    public final pnx c;

    /* compiled from: WebInternalDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadNotification.State.values().length];
            try {
                iArr[UploadNotification.State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadNotification.State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qgx0(onx onxVar, fvv0 fvv0Var, pnx pnxVar) {
        this.a = onxVar;
        this.b = fvv0Var;
        this.c = pnxVar;
    }
}
