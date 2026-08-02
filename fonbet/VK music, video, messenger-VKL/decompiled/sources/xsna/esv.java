package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.SourceType;

/* compiled from: IdApiParser.java */
/* loaded from: classes2.dex */
public final class esv {

    /* compiled from: IdApiParser.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SourceType.values().length];
            a = iArr;
            try {
                iArr[SourceType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static UserId a(UserId userId) {
        return a.a[b(userId).ordinal()] != 1 ? userId : fkq0.e(userId);
    }

    public static SourceType b(UserId userId) {
        long j = userId.b;
        return j < 0 ? SourceType.GROUP : j > 0 ? SourceType.USER : SourceType.UNKNOWN;
    }
}
