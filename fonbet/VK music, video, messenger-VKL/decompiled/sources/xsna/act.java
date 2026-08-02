package xsna;

import com.ironsource.C4504q2;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemHeaderDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseActionDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseActionTypeDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseButtonDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseGamesCatalogSectionDto;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.model.SectionIdType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GamesCatalogHeaderMapper.kt */
/* loaded from: classes17.dex */
public final class act {

    /* compiled from: GamesCatalogHeaderMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExploreWidgetsBaseGamesCatalogSectionDto.TypeSectionDto.values().length];
            try {
                iArr[ExploreWidgetsBaseGamesCatalogSectionDto.TypeSectionDto.SECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExploreWidgetsBaseGamesCatalogSectionDto.TypeSectionDto.GENRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExploreWidgetsBaseGamesCatalogSectionDto.TypeSectionDto.COLLECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r7 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wdt a(AppsMiniappsCatalogItemHeaderDto appsMiniappsCatalogItemHeaderDto, ExploreWidgetsBaseGamesCatalogSectionDto exploreWidgetsBaseGamesCatalogSectionDto) {
        GamesHeaderSectionInfo section;
        SectionIdType custom;
        ExploreWidgetsBaseActionDto d;
        ExploreWidgetsBaseActionDto d2;
        if (appsMiniappsCatalogItemHeaderDto == null) {
            return null;
        }
        wdt wdtVar = new wdt(null, appsMiniappsCatalogItemHeaderDto.f().e(), false);
        if (exploreWidgetsBaseGamesCatalogSectionDto == null) {
            ExploreWidgetsBaseButtonDto d3 = appsMiniappsCatalogItemHeaderDto.d();
            exploreWidgetsBaseGamesCatalogSectionDto = (d3 == null || (d2 = d3.d()) == null) ? null : d2.g();
        }
        ExploreWidgetsBaseButtonDto d4 = appsMiniappsCatalogItemHeaderDto.d();
        if (((d4 == null || (d = d4.d()) == null) ? null : d.o()) == ExploreWidgetsBaseActionTypeDto.OPEN_GAMES_SECTION) {
            String e = appsMiniappsCatalogItemHeaderDto.f().e();
            int i = a.$EnumSwitchMapping$0[exploreWidgetsBaseGamesCatalogSectionDto.i().ordinal()];
            if (i == 1) {
                String g = exploreWidgetsBaseGamesCatalogSectionDto.g();
                if (g != null) {
                    switch (g.hashCode()) {
                        case -1910923313:
                            if (g.equals("screen_categories")) {
                                custom = SectionIdType.CategoriesScreen.c;
                                break;
                            }
                            custom = new SectionIdType.Custom(g);
                            break;
                        case 108960:
                            if (g.equals("new")) {
                                custom = SectionIdType.New.c;
                                break;
                            }
                            custom = new SectionIdType.Custom(g);
                            break;
                        case 29046650:
                            if (g.equals("installed")) {
                                custom = SectionIdType.Installed.c;
                                break;
                            }
                            custom = new SectionIdType.Custom(g);
                            break;
                        case 1272354024:
                            if (g.equals(C4504q2.x)) {
                                custom = SectionIdType.Notifications.c;
                                break;
                            }
                            custom = new SectionIdType.Custom(g);
                            break;
                        case 1437916763:
                            if (g.equals("recommended")) {
                                custom = SectionIdType.Recommended.c;
                                break;
                            }
                            custom = new SectionIdType.Custom(g);
                            break;
                        case 2027344505:
                            if (g.equals("friends_activity")) {
                                custom = SectionIdType.FriendsActivity.c;
                                break;
                            }
                            custom = new SectionIdType.Custom(g);
                            break;
                        default:
                            custom = new SectionIdType.Custom(g);
                            break;
                    }
                    section = new GamesHeaderSectionInfo.Section(custom, e);
                }
                section = null;
            } else if (i == 2) {
                Integer e2 = exploreWidgetsBaseGamesCatalogSectionDto.e();
                if (e2 != null) {
                    section = new GamesHeaderSectionInfo.Genre(e2.intValue(), e);
                }
                section = null;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Integer d5 = exploreWidgetsBaseGamesCatalogSectionDto.d();
                if (d5 != null) {
                    section = new GamesHeaderSectionInfo.Collection(d5.intValue(), e);
                }
                section = null;
            }
            String e3 = appsMiniappsCatalogItemHeaderDto.f().e();
            ExploreWidgetsBaseButtonDto d6 = appsMiniappsCatalogItemHeaderDto.d();
            return new wdt(section, e3, (d6 != null ? d6.d() : null) != null);
        }
        return wdtVar;
    }
}
