package xsna;

import com.vk.api.generated.apps.dto.AppsCatalogBaseActionTypeDto;

/* compiled from: GamesCatalogBannersMapper.kt */
/* loaded from: classes17.dex */
public final class bat {
    public final z9t a;

    /* compiled from: GamesCatalogBannersMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppsCatalogBaseActionTypeDto.values().length];
            try {
                iArr[AppsCatalogBaseActionTypeDto.OPEN_GAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppsCatalogBaseActionTypeDto.OPEN_MINI_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppsCatalogBaseActionTypeDto.OPEN_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bat(z9t z9tVar) {
        this.a = z9tVar;
    }
}
