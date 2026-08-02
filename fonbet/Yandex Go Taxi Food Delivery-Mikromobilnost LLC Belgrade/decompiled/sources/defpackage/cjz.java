package defpackage;

import com.yandex.delivery.mapper.model.CancelType;
import com.yandex.delivery.mapper.model.Expansion;
import com.yandex.delivery.mapper.model.ForwardingId;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class cjz {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ForwardingId.values().length];
        try {
            iArr[ForwardingId.PERFORMER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ForwardingId.INAPP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[CancelType.values().length];
        try {
            iArr2[CancelType.FREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CancelType.PAID.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[Expansion.values().length];
        try {
            iArr3[Expansion.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[Expansion.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[Expansion.ANCHORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
    }
}
