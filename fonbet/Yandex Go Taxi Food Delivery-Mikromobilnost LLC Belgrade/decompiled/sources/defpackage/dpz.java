package defpackage;

import com.yandex.go.lootbox.api.domain.entities.lootbox.animation_type.LootBoxAnimationType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class dpz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LootBoxAnimationType.values().length];
        try {
            iArr[LootBoxAnimationType.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LootBoxAnimationType.OPENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LootBoxAnimationType.COMPLETION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
