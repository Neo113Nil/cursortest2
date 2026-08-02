package xsna;

import com.vk.games.model.GamesHeaderSectionInfo;
import xsna.djc;

/* compiled from: GamesCatalogSectionHeaderInfoModel.kt */
/* loaded from: classes17.dex */
public final class ydt {
    public static final xdt a(wdt wdtVar, String str) {
        return new xdt(str, wdtVar.a, wdtVar.b, wdtVar.c);
    }

    public static final djc b(xdt xdtVar) {
        GamesHeaderSectionInfo gamesHeaderSectionInfo = xdtVar.b;
        return gamesHeaderSectionInfo != null ? new djc.c(gamesHeaderSectionInfo, xdtVar.a) : djc.d.a;
    }
}
