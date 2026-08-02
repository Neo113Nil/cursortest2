package defpackage;

import com.yandex.go.places.models.data.entities.network.ActionDto$OpenNavigatorActionSubtypeDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class i670 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActionDto$OpenNavigatorActionSubtypeDto.values().length];
        try {
            iArr[ActionDto$OpenNavigatorActionSubtypeDto.GO_VIA_ACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionDto$OpenNavigatorActionSubtypeDto.GO_TO_ACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
