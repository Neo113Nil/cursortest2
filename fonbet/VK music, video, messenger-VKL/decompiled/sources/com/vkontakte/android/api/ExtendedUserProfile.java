package com.vkontakte.android.api;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.base.Document;
import com.vk.api.generated.users.dto.UsersContentTypeDto;
import com.vk.api.generated.users.dto.UsersTabCollectionDto;
import com.vk.api.generated.users.dto.UsersTabSpecialValuesDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.community.entries.widget.Widget;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.FriendsBlock;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.photo.Photo;
import com.vk.dto.profile.FollowersBlock;
import com.vk.dto.profile.MutualFriendsBlock;
import com.vk.dto.profile.Occupation;
import com.vk.dto.profile.RequestsBlock;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.RelativeProfile;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.deactivation.Deactivation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ad0;
import xsna.f370;
import xsna.ii7;
import xsna.t230;
import xsna.wvd0;
import xsna.xtd0;

/* loaded from: classes7.dex */
public class ExtendedUserProfile {
    public Photo A;
    public String A0;
    public String C0;
    public int C1;
    public ArrayList<k> D0;
    public ArrayList<l> E0;
    public ArrayList<i> F0;
    public ArrayList<Link> G;
    public String G0;
    public ArrayList<Contact> H;
    public String H0;
    public ArrayList<UserProfile> I;
    public String I0;
    public ArrayList<g> J;
    public String J0;

    @Nullable
    public ArrayList<Group> K;
    public String K0;

    @Nullable
    public Occupation L;
    public String L0;

    @Nullable
    public ProfilesRecommendations M;
    public String M0;

    @Nullable
    public ArrayList M1;

    @Nullable
    public MutualFriendsBlock N;
    public String N0;

    @Nullable
    public xtd0 N1;

    @Nullable
    public FriendsBlock O;
    public String O0;

    @Nullable
    public FollowersBlock P;
    public String P0;

    @Nullable
    public RequestsBlock Q;
    public String Q0;

    @Nullable
    public b R;
    public String R0;

    @Nullable
    public j R1;

    @Nullable
    public b S;
    public int S0;

    @Nullable
    public a S1;
    public int T;
    public int T0;

    @Nullable
    public wvd0 T1;
    public int U;
    public int U0;
    public String V;
    public int V0;
    public double W;
    public int W0;
    public double X;
    public CharSequence X0;
    public int Y;
    public CharSequence Y0;
    public int Z;
    public UserProfile a;
    public int a0;
    public int a1;
    public String b;
    public String b0;
    public String c;
    public String c0;

    @Nullable
    public h c1;
    public String d;
    public int d0;
    public String e;
    public boolean e0;
    public String f;
    public boolean f0;
    public MusicTrack f1;
    public String g;
    public boolean g0;
    public String g1;
    public String h;
    public boolean h0;
    public boolean h1;
    public String i;
    public boolean i0;
    public boolean i1;

    @Deprecated
    public String j;
    public boolean j0;
    public boolean j1;
    public String k;
    public boolean k0;
    public e k1;
    public boolean l;
    public boolean l0;
    public VKList l1;
    public boolean m;
    public boolean m0;
    public VKList<Good> m1;

    @Nullable
    public String n;
    public boolean n0;
    public ArrayList<MusicTrack> n1;

    @Nullable
    public String o;
    public boolean o0;
    public ArrayList<Playlist> o1;
    public ArrayList<c> p;
    public boolean p0;
    public ArrayList<VideoFile> p1;
    public Deactivation q;
    public String q0;
    public ArrayList<Document> q1;
    public int r;
    public String r0;
    public ArrayList<UserProfile> r1;
    public int s;
    public String s0;
    public ArrayList<ii7> s1;
    public int t;
    public String t0;
    public ArrayList<String> t1;
    public int u;
    public String u0;
    public ArrayList<Group> u1;
    public int v;
    public String v0;
    public String w;
    public String w0;
    public Widget w1;
    public boolean x;
    public String x0;
    public f[] x1;
    public boolean y;
    public String y0;
    public boolean y1;
    public long z0;
    public t230 z1;
    public boolean z = false;

    @Nullable
    public RelativeProfile[] B = null;

    @Nullable
    public RelativeProfile[] C = null;

    @Nullable
    public RelativeProfile[] D = null;

    @Nullable
    public RelativeProfile[] E = null;

    @Nullable
    public RelativeProfile[] F = null;
    public boolean B0 = false;
    public final HashMap<String, Integer> Z0 = new HashMap<>();
    public boolean b1 = false;
    public boolean d1 = false;
    public boolean e1 = false;
    public ArrayList<StoriesContainer> v1 = new ArrayList<>();
    public boolean A1 = false;
    public boolean B1 = false;
    public boolean D1 = true;
    public boolean E1 = false;
    public boolean F1 = false;
    public boolean G1 = true;
    public boolean H1 = false;
    public boolean I1 = false;
    public boolean J1 = false;

    @Deprecated
    public boolean K1 = false;
    public boolean L1 = false;
    public ArrayList O1 = new ArrayList();
    public Object P1 = new ArrayList();
    public boolean Q1 = false;

    @Nullable
    public Pair<String, String> U1 = null;

    public static class Contact extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Contact> CREATOR = new a();
        public UserProfile b;
        public String c;
        public String d;
        public String e;

        public class a extends Serializer.c<Contact> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Contact a(Serializer serializer) {
                Contact contact = new Contact();
                contact.b = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
                contact.c = serializer.H();
                contact.d = serializer.H();
                contact.e = serializer.H();
                return contact;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Contact[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
        }
    }

    public static class Link extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Link> CREATOR = new a();
        public String b;
        public String c;
        public String d;
        public String e;

        public class a extends Serializer.c<Link> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Link a(Serializer serializer) {
                Link link = new Link();
                link.b = serializer.H();
                link.c = serializer.H();
                link.d = serializer.H();
                link.e = serializer.H();
                return link;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Link[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
        }
    }

    public static class a {
        public String a;

        public static a a(@NonNull JSONObject jSONObject) {
            String A = f370.A("rkn_url", jSONObject);
            if (TextUtils.isEmpty(A)) {
                return null;
            }
            a aVar = new a();
            aVar.a = A;
            return aVar;
        }
    }

    public static class b {
        public final String a;
        public final String b;
        public final String c;

        public b(JSONObject jSONObject) {
            this.a = jSONObject.optString("button_text");
            this.b = jSONObject.optString("text");
            this.c = jSONObject.optString("url");
        }
    }

    public static class c {
        public UserId a = UserId.d;
        public String b;
        public ArrayList<d> c;
    }

    public static class d {
        public String a;
        public int b;
    }

    public static class e {
        public String a;
        public int b;
        public int c;
    }

    public static class f {
        public String a;
        public Action b;
        public Image c;
        public String d;
        public int e;
        public ApiApplication f;

        public static f a(JSONObject jSONObject) {
            f fVar = new f();
            fVar.a = jSONObject.optString("title");
            try {
                fVar.c = new Image(jSONObject.optJSONArray("icons"));
            } catch (Exception unused) {
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("action");
            Action.b bVar = Action.b;
            fVar.b = Action.a.a(optJSONObject);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            if (optJSONObject2 != null) {
                fVar.f = new ApiApplication(optJSONObject2);
            }
            fVar.d = jSONObject.optString("url");
            try {
                fVar.e = Color.parseColor("#" + jSONObject.optString("text_color"));
            } catch (Exception unused2) {
                fVar.e = -16777216;
            }
            return fVar;
        }
    }

    public static class g {
        public Group a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
    }

    public static class h {
        public String a;
        public String b;
        public String c;
        public String d;
    }

    public static class i {
        public String a;
        public String b;
        public int c;
        public int d;
    }

    public static class j {
        public int a;
        public boolean b;
        public ArrayList c;

        @Nullable
        public String d;

        @Nullable
        public String e;

        @Nullable
        public String f;

        @Nullable
        public String g;

        @Nullable
        public String h;

        @Nullable
        public String i;

        @Nullable
        public String j;

        @Nullable
        public String k;

        public static class a {
            public String a;
            public Long b;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && a.class == obj.getClass()) {
                    a aVar = (a) obj;
                    if (Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b)) {
                        return true;
                    }
                }
                return false;
            }

            public final int hashCode() {
                return Objects.hash(this.a, this.b);
            }
        }

        public static j a(@Nullable JSONObject jSONObject) throws JSONException {
            if (jSONObject == null) {
                return null;
            }
            j jVar = new j();
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("user_assets");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    a aVar = new a();
                    aVar.a = jSONObject2.optString("remote_asset_name");
                    aVar.b = Long.valueOf(jSONObject2.optLong("user_id"));
                    arrayList.add(aVar);
                }
            }
            jVar.c = arrayList;
            jVar.a = jSONObject.optInt("count");
            jVar.b = jSONObject.optBoolean("ignore_touch");
            jVar.d = f370.A("popup_title", jSONObject);
            jVar.e = f370.A("popup_description", jSONObject);
            jVar.f = f370.A("popup_button_title", jSONObject);
            jVar.g = f370.A("popup_action_url", jSONObject);
            jVar.h = f370.A("popup_icon_local_asset_name", jSONObject);
            jVar.i = f370.A("popup_icon_remote_asset_name", jSONObject);
            jVar.j = f370.A("popup_secondary_button_title", jSONObject);
            jVar.k = f370.A("popup_secondary_action_url", jSONObject);
            return jVar;
        }
    }

    public static class k {
        public String a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
        public int g;
    }

    public static class l {
        public String a;
        public String b;
        public String c;
        public int d;
    }

    public static class m {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final List<UsersContentTypeDto> e;
        public final List<String> f;
        public final List<UsersTabCollectionDto> g;
        public final UsersTabSpecialValuesDto h;

        public m(String str, boolean z, boolean z2, boolean z3, List<UsersContentTypeDto> list, List<String> list2, List<UsersTabCollectionDto> list3, UsersTabSpecialValuesDto usersTabSpecialValuesDto) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = list;
            this.f = list2;
            this.g = list3;
            this.h = usersTabSpecialValuesDto;
        }
    }

    public final boolean a() {
        return !this.A1 || this.D1;
    }

    public final int b(String str) {
        if (!"stories".equals(str)) {
            HashMap<String, Integer> hashMap = this.Z0;
            if (hashMap.containsKey(str)) {
                return hashMap.get(str).intValue();
            }
        } else if (f()) {
            return this.v1.get(0).g.size();
        }
        return 0;
    }

    public final int c() {
        if (ad0.u(this.v1)) {
            return 0;
        }
        return this.v1.get(0).g.size();
    }

    public final boolean d() {
        String str = this.b0;
        return (str == null || str.isEmpty()) ? false : true;
    }

    public final boolean e() {
        return this.z || g();
    }

    public final boolean f() {
        return ad0.y(this.v1) && this.v1.get(0).Eb();
    }

    public final boolean g() {
        Deactivation deactivation = this.q;
        return (deactivation == null || deactivation.getReason() == Deactivation.Reason.Hidden) ? false : true;
    }

    public final void h(boolean z) {
        this.z = z;
    }
}
