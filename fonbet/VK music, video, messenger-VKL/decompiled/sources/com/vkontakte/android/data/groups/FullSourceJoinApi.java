package com.vkontakte.android.data.groups;

import com.google.gson.Gson;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.D1;
import java.util.Iterator;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: FullSourceJoinApi.kt */
/* loaded from: classes7.dex */
public final class FullSourceJoinApi {

    @pmi0("entry_service")
    private final String entryService;

    @pmi0("prev_screen")
    private final String prevScreen;

    @pmi0("prev_source")
    private final String prevSource;

    @pmi0("screen")
    private final String screen;

    @pmi0("source")
    private final String source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FullSourceJoinApi.kt */
    public static final class EntryServiceType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryServiceType[] $VALUES;
        public static final EntryServiceType CLIPS;
        public static final EntryServiceType COMMUNITY;
        public static final a Companion;
        public static final EntryServiceType DISCOVER;
        public static final EntryServiceType EXTERNAL;
        public static final EntryServiceType FEED;
        public static final EntryServiceType MESSAGES;
        public static final EntryServiceType PROFILE;
        public static final EntryServiceType SEARCH;
        public static final EntryServiceType STORIES;
        public static final EntryServiceType SUPER_APP;
        public static final EntryServiceType VIDEO;
        private final String value;

        /* compiled from: FullSourceJoinApi.kt */
        public static final class a {
            public static EntryServiceType a(String str) {
                Object obj;
                Iterator<E> it = EntryServiceType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((EntryServiceType) obj).i(), str)) {
                        break;
                    }
                }
                return (EntryServiceType) obj;
            }
        }

        static {
            EntryServiceType entryServiceType = new EntryServiceType("FEED", 0, "feed");
            FEED = entryServiceType;
            EntryServiceType entryServiceType2 = new EntryServiceType("STORIES", 1, "stories");
            STORIES = entryServiceType2;
            EntryServiceType entryServiceType3 = new EntryServiceType("DISCOVER", 2, "discover");
            DISCOVER = entryServiceType3;
            EntryServiceType entryServiceType4 = new EntryServiceType(SignalingProtocol.MEDIA_OPTION_VIDEO, 3, "video");
            VIDEO = entryServiceType4;
            EntryServiceType entryServiceType5 = new EntryServiceType("CLIPS", 4, "clips");
            CLIPS = entryServiceType5;
            EntryServiceType entryServiceType6 = new EntryServiceType("MESSAGES", 5, "messages");
            MESSAGES = entryServiceType6;
            EntryServiceType entryServiceType7 = new EntryServiceType("SEARCH", 6, "search");
            SEARCH = entryServiceType7;
            EntryServiceType entryServiceType8 = new EntryServiceType("COMMUNITY", 7, "community");
            COMMUNITY = entryServiceType8;
            EntryServiceType entryServiceType9 = new EntryServiceType("PROFILE", 8, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            PROFILE = entryServiceType9;
            EntryServiceType entryServiceType10 = new EntryServiceType("SUPER_APP", 9, "super_app");
            SUPER_APP = entryServiceType10;
            EntryServiceType entryServiceType11 = new EntryServiceType("EXTERNAL", 10, D1.e);
            EXTERNAL = entryServiceType11;
            EntryServiceType[] entryServiceTypeArr = {entryServiceType, entryServiceType2, entryServiceType3, entryServiceType4, entryServiceType5, entryServiceType6, entryServiceType7, entryServiceType8, entryServiceType9, entryServiceType10, entryServiceType11};
            $VALUES = entryServiceTypeArr;
            $ENTRIES = new asp(entryServiceTypeArr);
            Companion = new a();
        }

        public EntryServiceType(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<EntryServiceType> h() {
            return $ENTRIES;
        }

        public static EntryServiceType valueOf(String str) {
            return (EntryServiceType) Enum.valueOf(EntryServiceType.class, str);
        }

        public static EntryServiceType[] values() {
            return (EntryServiceType[]) $VALUES.clone();
        }

        public final String i() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FullSourceJoinApi.kt */
    public static final class SourceType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SourceType[] $VALUES;
        public static final SourceType BLOCK_HEADER_COMMUNITY;
        public static final SourceType CLIP;
        public static final SourceType COMMUNITY_BLOCK_RECOM;
        public static final SourceType COMMUNITY_NAVBAR;
        public static final SourceType COMPILATION_CAROUSEL_FOR_U;
        public static final SourceType COMPILATION_RECOM_RECENTLY_VISITED;
        public static final SourceType DISCOVER_MEDIA_SIMILAR_NEWS;
        public static final SourceType NONE;
        public static final SourceType POST;
        public static final SourceType SIMILAR_GROUPS_BLOCK;
        private final String value;

        static {
            SourceType sourceType = new SourceType("CLIP", 0, "clip");
            CLIP = sourceType;
            SourceType sourceType2 = new SourceType("POST", 1, "post");
            POST = sourceType2;
            SourceType sourceType3 = new SourceType("BLOCK_HEADER_COMMUNITY", 2, "block_header_community");
            BLOCK_HEADER_COMMUNITY = sourceType3;
            SourceType sourceType4 = new SourceType("COMMUNITY_NAVBAR", 3, "community_navbar");
            COMMUNITY_NAVBAR = sourceType4;
            SourceType sourceType5 = new SourceType("COMMUNITY_BLOCK_RECOM", 4, "community_block_recom");
            COMMUNITY_BLOCK_RECOM = sourceType5;
            SourceType sourceType6 = new SourceType("COMPILATION_RECOM_RECENTLY_VISITED", 5, "compilation_recom_recently_visited");
            COMPILATION_RECOM_RECENTLY_VISITED = sourceType6;
            SourceType sourceType7 = new SourceType("SIMILAR_GROUPS_BLOCK", 6, "similar_groups_block");
            SIMILAR_GROUPS_BLOCK = sourceType7;
            SourceType sourceType8 = new SourceType("COMPILATION_CAROUSEL_FOR_U", 7, "compilation_carousel_for_u");
            COMPILATION_CAROUSEL_FOR_U = sourceType8;
            SourceType sourceType9 = new SourceType("DISCOVER_MEDIA_SIMILAR_NEWS", 8, "discover_media_similar_news");
            DISCOVER_MEDIA_SIMILAR_NEWS = sourceType9;
            SourceType sourceType10 = new SourceType("NONE", 9, "-");
            NONE = sourceType10;
            SourceType[] sourceTypeArr = {sourceType, sourceType2, sourceType3, sourceType4, sourceType5, sourceType6, sourceType7, sourceType8, sourceType9, sourceType10};
            $VALUES = sourceTypeArr;
            $ENTRIES = new asp(sourceTypeArr);
        }

        public SourceType(String str, int i, String str2) {
            this.value = str2;
        }

        public static SourceType valueOf(String str) {
            return (SourceType) Enum.valueOf(SourceType.class, str);
        }

        public static SourceType[] values() {
            return (SourceType[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public /* synthetic */ FullSourceJoinApi(String str, String str2, String str3, String str4, String str5, zcl zclVar) {
        this(str, str2, str3, str4, str5);
    }

    public final String a() {
        return new Gson().toJson(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullSourceJoinApi)) {
            return false;
        }
        FullSourceJoinApi fullSourceJoinApi = (FullSourceJoinApi) obj;
        return epx.f(this.screen, fullSourceJoinApi.screen) && epx.f(this.prevScreen, fullSourceJoinApi.prevScreen) && epx.f(this.source, fullSourceJoinApi.source) && epx.f(this.prevSource, fullSourceJoinApi.prevSource) && epx.f(this.entryService, fullSourceJoinApi.entryService);
    }

    public final int hashCode() {
        int hashCode = this.screen.hashCode() * 31;
        String str = this.prevScreen;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.prevSource;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entryService;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullSourceJoinApi(screen=");
        sb.append(this.screen);
        sb.append(", prevScreen=");
        sb.append(this.prevScreen);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", prevSource=");
        sb.append(this.prevSource);
        sb.append(", entryService=");
        return ho8.a(sb, this.entryService, ')');
    }

    private FullSourceJoinApi(String str, String str2, String str3, String str4, String str5) {
        this.screen = str;
        this.prevScreen = str2;
        this.source = str3;
        this.prevSource = str4;
        this.entryService = str5;
    }
}
