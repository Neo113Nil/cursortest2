package com.vkontakte.android.api;

import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.Image;
import com.vk.dto.community.ReBookingBannerData;
import com.vk.dto.group.GroupAgeMark;
import com.vk.dto.group.GroupChannelBlock;
import com.vk.dto.group.GroupChannelInfo;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboarding;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockSettings;
import com.vk.dto.music.Artist;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.profile.Donut;
import com.vk.dto.profile.DonutBanner;
import com.vk.dto.stories.model.StoriesContainer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.f370;
import xsna.hbx0;
import xsna.ibq;
import xsna.ja9;
import xsna.mp80;
import xsna.ms9;
import xsna.st50;
import xsna.z4h;
import xsna.zrp;
import xsna.zwg;

/* compiled from: ExtendedCommunityProfile.kt */
/* loaded from: classes7.dex */
public final class ExtendedCommunityProfile extends ExtendedUserProfile {
    public boolean A2;
    public boolean B2;
    public d C2;
    public st50 F2;
    public zwg G2;
    public ReBookingBannerData H2;
    public CatchUpBanner I2;
    public GroupMarketInfo J2;
    public GroupCreationOnboarding K2;
    public GroupsPrimaryBlockSettings L2;
    public GroupLeaveMode N2;
    public boolean P2;
    public ArrayList Q2;
    public g R2;
    public ArrayList S2;
    public List<GroupContentTabSetting> U2;
    public Address V1;
    public GroupContentTabType V2;
    public Address W1;
    public f W2;
    public ja9 X1;
    public GroupChannelBlock X2;
    public int Y1;
    public GroupChannelInfo Y2;
    public int Z1;
    public boolean Z2;
    public boolean a2;
    public boolean a3;
    public c b2;
    public boolean b3;
    public boolean c2;
    public boolean c3;
    public ArrayList<StoriesContainer> d2;
    public e d3;
    public mp80 f2;
    public z4h g2;
    public hbx0 h2;
    public int i2;
    public a j2;
    public boolean k2;
    public ArrayList<Artist> l2;
    public boolean m2;
    public GroupsSuggestions n2;
    public GroupsSuggestions o2;
    public boolean p2;
    public boolean q2;
    public int r2;
    public boolean s2;
    public Donut t2;
    public DonutBanner u2;
    public CatchUpBanner v2;
    public boolean w2;
    public boolean x2;
    public boolean y2;
    public boolean z2;
    public boolean e2 = true;
    public ibq D2 = new ibq(EmptyList.b);
    public Integer E2 = 0;
    public GroupMarketInfo.b M2 = GroupMarketInfo.b.a.f;
    public GroupAgeMark O2 = GroupAgeMark.NO;
    public String T2 = "";

    /* compiled from: ExtendedCommunityProfile.kt */
    public static final class Section {
        public final Image a;
        public final Type b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ExtendedCommunityProfile.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type Articles;
            public static final Type Channel;
            public static final Type Chats;
            public static final Type Discussions;
            public static final Type Events;
            public static final Type Files;
            public static final Type Music;
            public static final Type Narratives;
            public static final Type Photos;
            public static final Type Podcasts;
            public static final Type Products;
            public static final Type Services;

            static {
                Type type = new Type("Photos", 0);
                Photos = type;
                Type type2 = new Type("Products", 1);
                Products = type2;
                Type type3 = new Type("Discussions", 2);
                Discussions = type3;
                Type type4 = new Type("Services", 3);
                Services = type4;
                Type type5 = new Type("Channel", 4);
                Channel = type5;
                Type type6 = new Type("Narratives", 5);
                Narratives = type6;
                Type type7 = new Type("Music", 6);
                Music = type7;
                Type type8 = new Type("Podcasts", 7);
                Podcasts = type8;
                Type type9 = new Type("Articles", 8);
                Articles = type9;
                Type type10 = new Type("Chats", 9);
                Chats = type10;
                Type type11 = new Type("Files", 10);
                Files = type11;
                Type type12 = new Type("Events", 11);
                Events = type12;
                Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Section(Image image, Type type) {
            this.a = image;
            this.b = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return epx.f(this.a, section.a) && this.b == section.b;
        }

        public final int hashCode() {
            Image image = this.a;
            return this.b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
        }

        public final String toString() {
            return "Section(image=" + this.a + ", type=" + this.b + ')';
        }
    }

    /* compiled from: ExtendedCommunityProfile.kt */
    public static final class StrikesRestriction {
        public final StrikeRestrictionType a;
        public final String b;
        public final String c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ExtendedCommunityProfile.kt */
        public static final class StrikeRestrictionType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ StrikeRestrictionType[] $VALUES;
            public static final StrikeRestrictionType ADDRESSES;
            public static final StrikeRestrictionType ARTICLES;
            public static final StrikeRestrictionType AUDIOS;
            public static final StrikeRestrictionType AVATAR;
            public static final StrikeRestrictionType CHATS;
            public static final StrikeRestrictionType DISCUSSIONS;
            public static final StrikeRestrictionType EVENTS;
            public static final StrikeRestrictionType FILES;
            public static final StrikeRestrictionType LIVES;
            public static final StrikeRestrictionType MARKET;
            public static final StrikeRestrictionType NARRATIVES;
            public static final StrikeRestrictionType PHOTOS;
            public static final StrikeRestrictionType PODCASTS;
            public static final StrikeRestrictionType POSTS;
            public static final StrikeRestrictionType ROOMS;
            public static final StrikeRestrictionType SERVICES;
            public static final StrikeRestrictionType SHORT_VIDEOS;
            public static final StrikeRestrictionType STORIES;
            public static final StrikeRestrictionType VIDEOS;

            static {
                StrikeRestrictionType strikeRestrictionType = new StrikeRestrictionType("AVATAR", 0);
                AVATAR = strikeRestrictionType;
                StrikeRestrictionType strikeRestrictionType2 = new StrikeRestrictionType("POSTS", 1);
                POSTS = strikeRestrictionType2;
                StrikeRestrictionType strikeRestrictionType3 = new StrikeRestrictionType("STORIES", 2);
                STORIES = strikeRestrictionType3;
                StrikeRestrictionType strikeRestrictionType4 = new StrikeRestrictionType("LIVES", 3);
                LIVES = strikeRestrictionType4;
                StrikeRestrictionType strikeRestrictionType5 = new StrikeRestrictionType("ADDRESSES", 4);
                ADDRESSES = strikeRestrictionType5;
                StrikeRestrictionType strikeRestrictionType6 = new StrikeRestrictionType("ARTICLES", 5);
                ARTICLES = strikeRestrictionType6;
                StrikeRestrictionType strikeRestrictionType7 = new StrikeRestrictionType("AUDIOS", 6);
                AUDIOS = strikeRestrictionType7;
                StrikeRestrictionType strikeRestrictionType8 = new StrikeRestrictionType("CHATS", 7);
                CHATS = strikeRestrictionType8;
                StrikeRestrictionType strikeRestrictionType9 = new StrikeRestrictionType("DISCUSSIONS", 8);
                DISCUSSIONS = strikeRestrictionType9;
                StrikeRestrictionType strikeRestrictionType10 = new StrikeRestrictionType("EVENTS", 9);
                EVENTS = strikeRestrictionType10;
                StrikeRestrictionType strikeRestrictionType11 = new StrikeRestrictionType("FILES", 10);
                FILES = strikeRestrictionType11;
                StrikeRestrictionType strikeRestrictionType12 = new StrikeRestrictionType("MARKET", 11);
                MARKET = strikeRestrictionType12;
                StrikeRestrictionType strikeRestrictionType13 = new StrikeRestrictionType("NARRATIVES", 12);
                NARRATIVES = strikeRestrictionType13;
                StrikeRestrictionType strikeRestrictionType14 = new StrikeRestrictionType("PHOTOS", 13);
                PHOTOS = strikeRestrictionType14;
                StrikeRestrictionType strikeRestrictionType15 = new StrikeRestrictionType("PODCASTS", 14);
                PODCASTS = strikeRestrictionType15;
                StrikeRestrictionType strikeRestrictionType16 = new StrikeRestrictionType("ROOMS", 15);
                ROOMS = strikeRestrictionType16;
                StrikeRestrictionType strikeRestrictionType17 = new StrikeRestrictionType("SERVICES", 16);
                SERVICES = strikeRestrictionType17;
                StrikeRestrictionType strikeRestrictionType18 = new StrikeRestrictionType("SHORT_VIDEOS", 17);
                SHORT_VIDEOS = strikeRestrictionType18;
                StrikeRestrictionType strikeRestrictionType19 = new StrikeRestrictionType("VIDEOS", 18);
                VIDEOS = strikeRestrictionType19;
                StrikeRestrictionType[] strikeRestrictionTypeArr = {strikeRestrictionType, strikeRestrictionType2, strikeRestrictionType3, strikeRestrictionType4, strikeRestrictionType5, strikeRestrictionType6, strikeRestrictionType7, strikeRestrictionType8, strikeRestrictionType9, strikeRestrictionType10, strikeRestrictionType11, strikeRestrictionType12, strikeRestrictionType13, strikeRestrictionType14, strikeRestrictionType15, strikeRestrictionType16, strikeRestrictionType17, strikeRestrictionType18, strikeRestrictionType19};
                $VALUES = strikeRestrictionTypeArr;
                $ENTRIES = new asp(strikeRestrictionTypeArr);
            }

            public StrikeRestrictionType() {
                throw null;
            }

            public static StrikeRestrictionType valueOf(String str) {
                return (StrikeRestrictionType) Enum.valueOf(StrikeRestrictionType.class, str);
            }

            public static StrikeRestrictionType[] values() {
                return (StrikeRestrictionType[]) $VALUES.clone();
            }
        }

        public StrikesRestriction(StrikeRestrictionType strikeRestrictionType, JSONObject jSONObject) {
            this.a = strikeRestrictionType;
            this.b = jSONObject.optString("title");
            this.c = jSONObject.optString("description");
        }
    }

    /* compiled from: ExtendedCommunityProfile.kt */
    public static final class a {
        public final String a;

        public a(JSONObject jSONObject) {
            jSONObject.optString("link_text");
            this.a = jSONObject.optString("link_url");
            jSONObject.optInt("link_badge", -1);
        }
    }

    /* compiled from: ExtendedCommunityProfile.kt */
    public static final class b {
        public final String a;
        public final String b;

        public b(JSONObject jSONObject) {
            jSONObject.getInt("code");
            this.a = jSONObject.getString("title");
            this.b = jSONObject.getString("description");
        }
    }

    /* compiled from: ExtendedCommunityProfile.kt */
    public static final class c {
        public final Integer a;
        public final String b;

        public c(JSONObject jSONObject) {
            this.a = f370.x(jSONObject, "id");
            this.b = f370.D(jSONObject, "title");
        }
    }

    /* compiled from: ExtendedCommunityProfile.kt */
    public static final class d {
        public final Float a;
        public final Integer b;
        public final boolean c;
        public final boolean d;
        public final b e;

        public d(JSONObject jSONObject) {
            this.a = f370.u("mark", jSONObject);
            this.b = f370.x(jSONObject, "review_cnt");
            this.c = jSONObject.has("can_add_review") ? jSONObject.getBoolean("can_add_review") : false;
            this.d = jSONObject.has("is_add_review_show") ? jSONObject.getBoolean("is_add_review_show") : false;
            JSONObject optJSONObject = jSONObject.optJSONObject("can_add_review_error");
            if (optJSONObject != null) {
                this.e = new b(optJSONObject);
            }
        }
    }

    /* compiled from: ExtendedCommunityProfile.kt */
    public interface e {

        /* compiled from: ExtendedCommunityProfile.kt */
        public static final class a implements e {
            public final List<Section> a;

            public a(List<Section> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Data(section="), this.a);
            }
        }

        /* compiled from: ExtendedCommunityProfile.kt */
        public static final class b implements e {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 147485264;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: ExtendedCommunityProfile.kt */
        public static final class c implements e {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1815056260;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: ExtendedCommunityProfile.kt */
    public static final class f {
        public final String a;
        public final String b;

        public f(JSONObject jSONObject) {
            this.a = f370.D(jSONObject, "title");
            this.b = f370.D(jSONObject, "url");
        }
    }

    /* compiled from: ExtendedCommunityProfile.kt */
    public static final class g {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public g(JSONObject jSONObject) {
            this.a = jSONObject.optString("icon");
            this.b = jSONObject.optString("icon_color");
            this.c = jSONObject.optString("title");
            this.d = jSONObject.optString("description");
            this.e = jSONObject.optString("button_text");
            this.f = jSONObject.optString("button_href");
        }
    }
}
