package xsna;

import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemHeaderDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseGamesCatalogSectionDto;
import com.vk.games.model.GamesCatalogSection;

/* compiled from: GamesCatalogRandomGameMapper.kt */
/* loaded from: classes17.dex */
public final class fdt {
    public final act a;
    public final z9t b;

    public fdt(z9t z9tVar, act actVar) {
        this.a = actVar;
        this.b = z9tVar;
    }

    public final GamesCatalogSection.e a(AppsMiniappsCatalogItemHeaderDto appsMiniappsCatalogItemHeaderDto, ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto, AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesListWithActionDto appsMiniappsCatalogItemPayloadGamesListWithActionDto, String str, int i) {
        sbt b;
        if (appsMiniappsCatalogItemPayloadGamesListWithActionDto == null || (b = this.b.b(appsMiniappsCatalogItemPayloadGamesListWithActionDto.e(), str)) == null) {
            return null;
        }
        this.a.getClass();
        return new GamesCatalogSection.e(i, str, act.a(appsMiniappsCatalogItemHeaderDto, exploreWidgetsBaseGamesCatalogSectionDto), b, new GamesCatalogSection.e.a(appsMiniappsCatalogItemPayloadGamesListWithActionDto.d()));
    }
}
