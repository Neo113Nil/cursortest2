package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.music.stats.CoachMarkAction;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioDomainEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapGotoEventItem;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.MusicFeatures;

/* compiled from: MusicCatalogClickAnalyticsHandler.kt */
/* loaded from: classes16.dex */
public final class ad40 {
    public final gzs<String> a;
    public final io.reactivex.rxjava3.disposables.c b;
    public UIBlockHint c;
    public final boolean d = MusicFeatures.COACHMARK_ANALYTICS.h();

    /* compiled from: MusicCatalogClickAnalyticsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CoachMarkAction.values().length];
            try {
                iArr2[CoachMarkAction.CLICK_TARGET_AREA.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CoachMarkAction.CLICK_OUTER_AREA.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CoachMarkAction.CLICK_CROSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CoachMarkAction.CLICK_CONTAINER_AREA.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ad40(s1v s1vVar, b5a b5aVar, gzs<String> gzsVar) {
        this.a = gzsVar;
        this.b = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        this.b = b5aVar.a.b0(n680.class).subscribe(new jv(new o010(this, 10), 28));
    }

    public final CommonAudioStat$TypeAudioDomainEventItem a(UIBlock uIBlock) {
        String invoke = ((uIBlock instanceof UIBlockList) || (uIBlock instanceof UIBlockHint)) ? this.a.invoke() : uIBlock.c;
        UIBlockHint uIBlockHint = uIBlock.j;
        String str = null;
        if (uIBlockHint != null) {
            if (!uIBlockHint.equals(this.c)) {
                uIBlockHint = null;
            }
            if (uIBlockHint != null) {
                str = uIBlockHint.y;
            }
        }
        return new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), new CommonStat$TypeCommonEventItem(null, null, null, invoke, 7, null), new CommonStat$TypeCommonEventItem(null, null, null, uIBlock.b, 7, null), null, null, str, null, null, null, 472, null);
    }

    public final SchemeStat$TypeClick b(UIBlock uIBlock, CommonAudioStat$TypeAudioTapGotoEventItem.Source source) {
        return SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, uIBlock.c, null, 46, null), new CommonAudioStat$TypeAudioTapGotoEventItem(a(uIBlock), new CommonStat$TypeCommonEventItem(null, null, s1v.f(uIBlock), uIBlock instanceof UIBlockList ? uIBlock.b : uIBlock instanceof UIBlockActionOpenSection ? ((UIBlockActionOpenSection) uIBlock).B : null, 3, null), null, source, 4, null), 2);
    }
}
