package xsna;

import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasTeaserEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: IdeasStoryAnalytics.kt */
/* loaded from: classes6.dex */
public final class itv {
    public final anm0 a;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint b;
    public final q5f c;
    public final enh d;

    /* compiled from: IdeasStoryAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdeasTeaserEvent.values().length];
            try {
                iArr[IdeasTeaserEvent.VIEW_STORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdeasTeaserEvent.CLICK_TO_PUBLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdeasTeaserEvent.CLICK_TO_EDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdeasTeaserEvent.CLICK_TO_HIDE_TEASER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public itv(anm0 anm0Var, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, q5f q5fVar, enh enhVar) {
        this.a = anm0Var;
        this.b = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.c = q5fVar;
        this.d = enhVar;
    }

    public final void a(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType, Map<String, ? extends Object> map) {
        String str = (String) this.c.invoke();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("story_index", this.d.invoke());
        linkedHashMap.putAll(map);
        this.a.p(eventType, str, this.b, null, null, new b5h(linkedHashMap, 20));
    }
}
