package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapGotoEventItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.LazyThreadSafetyMode;
import xsna.ad40;

/* compiled from: MusicCatalogUIClickTracker.kt */
/* loaded from: classes16.dex */
public class zd40 extends uha {
    public final w950 b;
    public final Object c;
    public final ad40 d;

    public /* synthetic */ zd40(b5a b5aVar, w950 w950Var, gzs gzsVar, int i) {
        this(b5aVar, (i & 2) != 0 ? null : w950Var, new s1v(), (gzs<String>) gzsVar);
    }

    @Override // xsna.uha
    public final void a() {
        this.d.b.dispose();
    }

    @Override // xsna.uha
    public final void b(UIBlock uIBlock) {
        SchemeStat$TypeClick b;
        super.b(uIBlock);
        ad40 ad40Var = this.d;
        ad40Var.getClass();
        if ((uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryPlaylist) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryVideo) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryArtist) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryPodcast) || (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryAudioBook)) {
            b = ad40Var.b(uIBlock, null);
        } else if (uIBlock instanceof UIBlockLink) {
            b = ad40Var.b(uIBlock, CommonAudioStat$TypeAudioTapGotoEventItem.Source.MY_TRACKS_NAV);
        } else if (uIBlock instanceof UIBlockActionOpenSection) {
            b = ad40Var.b(uIBlock, null);
        } else {
            if (!(uIBlock instanceof UIBlockList)) {
                return;
            }
            if (ad40.a.$EnumSwitchMapping$0[uIBlock.e.ordinal()] != 1) {
                return;
            } else {
                b = ad40Var.b(uIBlock, CommonAudioStat$TypeAudioTapGotoEventItem.Source.TAB_BAR);
            }
        }
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uha
    public void c(UIBlock uIBlock, Object obj) {
        b(uIBlock);
        wd40 wd40Var = (wd40) this.c.getValue();
        if (wd40Var != null) {
            wd40Var.a(uIBlock, obj);
        }
    }

    public zd40(b5a b5aVar, w950 w950Var, s1v s1vVar, gzs<String> gzsVar) {
        super(s1vVar);
        this.b = w950Var;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.ui.k(15, this, gzsVar));
        this.d = new ad40(s1vVar, b5aVar, gzsVar);
    }
}
