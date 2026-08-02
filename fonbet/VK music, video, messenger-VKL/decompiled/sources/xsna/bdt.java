package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsCatalogBaseActionTypeDto;
import com.vk.api.generated.apps.dto.AppsCatalogListDto;

/* compiled from: GamesCatalogPageMapper.kt */
/* loaded from: classes17.dex */
public final class bdt {
    public final wct a;
    public final l9t b;
    public final het c;

    /* compiled from: GamesCatalogPageMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppsCatalogBaseActionTypeDto.values().length];
            try {
                iArr[AppsCatalogBaseActionTypeDto.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppsCatalogBaseActionTypeDto.OPEN_MINI_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppsCatalogBaseActionTypeDto.OPEN_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppsCatalogBaseActionTypeDto.OPEN_ACHIEVEMENT_MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bdt(wct wctVar, l9t l9tVar, het hetVar) {
        this.a = wctVar;
        this.b = l9tVar;
        this.c = hetVar;
    }

    public final uat a(AppsCatalogListDto appsCatalogListDto) {
        String title = appsCatalogListDto.getTitle();
        if (title == null) {
            AppsAppDto appsAppDto = (AppsAppDto) j5g.a0(appsCatalogListDto.e());
            title = appsAppDto != null ? appsAppDto.B() : null;
        }
        return new uat(title, het.a(this.c, appsCatalogListDto.e()), !appsCatalogListDto.e().isEmpty());
    }
}
