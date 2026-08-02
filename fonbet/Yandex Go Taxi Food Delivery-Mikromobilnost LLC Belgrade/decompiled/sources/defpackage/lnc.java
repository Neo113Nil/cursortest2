package defpackage;

import com.yandex.go.requirements.api.domain.model.CompoundSelect$CompoundSelectItemType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class lnc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CompoundSelect$CompoundSelectItemType.values().length];
        try {
            iArr[CompoundSelect$CompoundSelectItemType.CHILD_SEATS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CompoundSelect$CompoundSelectItemType.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
