package xsna;

import com.vk.upload.impl.UploadNotification;
import com.vk.upload.impl.tasks.VmojiPhotoUploadTask;
import java.util.concurrent.ConcurrentHashMap;
import xsna.d9w0;

/* compiled from: VmojiPhotoUploadInteractor.kt */
/* loaded from: classes7.dex */
public final class e9w0 {
    public final String a;
    public d9w0.a b;
    public Integer c;

    /* compiled from: VmojiPhotoUploadInteractor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadNotification.State.values().length];
            try {
                iArr[UploadNotification.State.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadNotification.State.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e9w0(String str) {
        this.a = str;
    }

    public final void a() {
        Integer num = this.c;
        if (num != null) {
            ConcurrentHashMap<Integer, UploadNotification.a> concurrentHashMap = com.vk.upload.impl.a.a;
            if (com.vk.upload.impl.a.a(num.intValue())) {
                com.vk.upload.impl.a.e(num.intValue());
                return;
            }
        }
        this.c = Integer.valueOf(com.vk.upload.impl.a.h(new VmojiPhotoUploadTask(this.a), new c4q0(this, 9)));
    }
}
