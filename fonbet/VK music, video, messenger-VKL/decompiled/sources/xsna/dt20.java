package xsna;

import com.vk.upload.impl.UploadNotification;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;

/* compiled from: MlEnhanceServerTask.kt */
/* loaded from: classes15.dex */
public final class dt20 {
    public final String a;
    public String b;
    public Integer c;
    public io.reactivex.rxjava3.disposables.c d;
    public final Lazy e;

    /* compiled from: MlEnhanceServerTask.kt */
    public static final class a extends xsg0 {
    }

    /* compiled from: MlEnhanceServerTask.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadNotification.State.values().length];
            try {
                iArr[UploadNotification.State.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadNotification.State.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UploadNotification.State.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UploadNotification.State.DONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dt20(String str, bpn0 bpn0Var) {
        this.a = str;
        this.e = bpn0Var;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        Integer num = this.c;
        if (num != null) {
            ConcurrentHashMap<Integer, UploadNotification.a> concurrentHashMap = com.vk.upload.impl.a.a;
            com.vk.upload.impl.a.b(num.intValue(), null);
        }
        ((vre0) this.e.getValue()).f("enhancephoto_tag");
    }
}
