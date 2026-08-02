package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.dh6;

/* compiled from: MusicPromoModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final class o250 implements dh6.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public o250(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.dh6.a
    public final void a() {
        String valueOf = String.valueOf(System.currentTimeMillis());
        new bvt0(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, SchemeStat$TypeView.a(SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.EVENT, Long.valueOf(this.b), null, null, this.c, null, 44, null), valueOf, valueOf, null, null, 24), SchemeStat$TypeView.Type.TYPE_CATALOG_SPECIAL_PROJECT_ITEM)).q();
    }

    @Override // xsna.dh6.a
    public final void b() {
    }
}
