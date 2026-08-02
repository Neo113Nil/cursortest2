package xsna;

import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$StoryClickableStickerItem;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$StoryStickerItem;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$StoryTextItem;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import xsna.o1m0;

/* compiled from: StoryEditorMetricCollectorImpl.kt */
/* loaded from: classes18.dex */
public final class n1m0 implements o1m0 {
    public final evl0 b;
    public final nxi0 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new jo60(13));

    /* compiled from: StoryEditorMetricCollectorImpl.kt */
    public final class a implements o1m0.b {
    }

    static {
        zrp<MobileOfficialAppsStoriesStat$StoryTextItem.Align> h = MobileOfficialAppsStoriesStat$StoryTextItem.Align.h();
        int e = on00.e(c5g.u(h, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : h) {
            linkedHashMap.put(((MobileOfficialAppsStoriesStat$StoryTextItem.Align) obj).name().toLowerCase(Locale.ROOT), obj);
        }
        zrp<MobileOfficialAppsStoriesStat$StoryTextItem.Font> h2 = MobileOfficialAppsStoriesStat$StoryTextItem.Font.h();
        int e2 = on00.e(c5g.u(h2, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2);
        for (Object obj2 : h2) {
            linkedHashMap2.put(((MobileOfficialAppsStoriesStat$StoryTextItem.Font) obj2).name().toLowerCase(Locale.ROOT), obj2);
        }
        zrp<MobileOfficialAppsStoriesStat$StoryClickableStickerItem.Style> h3 = MobileOfficialAppsStoriesStat$StoryClickableStickerItem.Style.h();
        int e3 = on00.e(c5g.u(h3, 10));
        if (e3 < 16) {
            e3 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e3);
        for (Object obj3 : h3) {
            linkedHashMap3.put(((MobileOfficialAppsStoriesStat$StoryClickableStickerItem.Style) obj3).name().toLowerCase(Locale.ROOT), obj3);
        }
        zrp<MobileOfficialAppsStoriesStat$StoryClickableStickerItem.StickerType> h4 = MobileOfficialAppsStoriesStat$StoryClickableStickerItem.StickerType.h();
        int e4 = on00.e(c5g.u(h4, 10));
        if (e4 < 16) {
            e4 = 16;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(e4);
        for (Object obj4 : h4) {
            linkedHashMap4.put(((MobileOfficialAppsStoriesStat$StoryClickableStickerItem.StickerType) obj4).name().toLowerCase(Locale.ROOT), obj4);
        }
        zrp<MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint> h5 = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.h();
        int e5 = on00.e(c5g.u(h5, 10));
        if (e5 < 16) {
            e5 = 16;
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(e5);
        for (Object obj5 : h5) {
            linkedHashMap5.put(((MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint) obj5).name().toLowerCase(Locale.ROOT), obj5);
        }
        zrp<MobileOfficialAppsStoriesStat$StoryStickerItem.StickerType> h6 = MobileOfficialAppsStoriesStat$StoryStickerItem.StickerType.h();
        int e6 = on00.e(c5g.u(h6, 10));
        if (e6 < 16) {
            e6 = 16;
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(e6);
        for (Object obj6 : h6) {
            linkedHashMap6.put(((MobileOfficialAppsStoriesStat$StoryStickerItem.StickerType) obj6).name().toLowerCase(Locale.ROOT), obj6);
        }
        zrp<MobileOfficialAppsStoriesStat$StoryStickerItem.Style> h7 = MobileOfficialAppsStoriesStat$StoryStickerItem.Style.h();
        int e7 = on00.e(c5g.u(h7, 10));
        if (e7 < 16) {
            e7 = 16;
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(e7);
        for (Object obj7 : h7) {
            linkedHashMap7.put(((MobileOfficialAppsStoriesStat$StoryStickerItem.Style) obj7).name().toLowerCase(Locale.ROOT), obj7);
        }
        zrp<MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryType> h8 = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryType.h();
        int e8 = on00.e(c5g.u(h8, 10));
        if (e8 < 16) {
            e8 = 16;
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap(e8);
        for (Object obj8 : h8) {
            linkedHashMap8.put(((MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryType) obj8).name().toLowerCase(Locale.ROOT), obj8);
        }
        zrp<MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryMode> h9 = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryMode.h();
        int e9 = on00.e(c5g.u(h9, 10));
        LinkedHashMap linkedHashMap9 = new LinkedHashMap(e9 >= 16 ? e9 : 16);
        for (Object obj9 : h9) {
            linkedHashMap9.put(((MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryMode) obj9).name().toLowerCase(Locale.ROOT), obj9);
        }
    }

    public n1m0(evl0 evl0Var, nxi0 nxi0Var) {
        this.b = evl0Var;
        this.c = nxi0Var;
    }
}
