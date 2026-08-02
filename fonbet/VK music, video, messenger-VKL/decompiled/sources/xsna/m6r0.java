package xsna;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.android.billingclient.api.BillingClient;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.ironsource.C4641xe;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.core.apps.BuildInfo;
import com.vk.core.bundle.Descriptor;
import com.vk.core.serialize.Serializer;
import com.vk.core.util.JSONSerializeStringList;
import com.vk.dto.account.a;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.common.account.ProfilerConfig;
import com.vk.dto.common.account.VideoConfig;
import com.vk.dto.common.id.UserId;
import com.vk.dto.menu.SideMenuItems;
import com.vk.dto.menu.TabBarItems;
import com.vk.dto.menu.a;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.dto.user.UserNameType;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ba90;
import xsna.or00;
import xsna.pv8;
import xsna.s2r;

/* compiled from: VKAccount.kt */
/* loaded from: classes.dex */
public final class m6r0 extends xej {
    public static final i7r A;
    public static final i7r A0;
    public static final i7r B;
    public static final i7r B0;
    public static final d7r C;
    public static final d7r C0;
    public static final d7r D;
    public static final l7r D0;
    public static final d7r E;
    public static final l7r E0;
    public static final d7r F;
    public static final n7r F0;
    public static final n7r G;
    public static final n7r G0;
    public static final d7r H;
    public static final n7r H0;
    public static final i7r I;
    public static final HashSet<c7r> I0;
    public static final i7r J;
    public static final HashSet<c7r> J0;
    public static final d7r K;
    public static final i7r K0;
    public static final d7r L;
    public static final d7r L0;
    public static final d7r M;
    public static final i7r M0;
    public static final d7r N;
    public static final i7r N0;
    public static final d7r O;
    public static final d7r O0;
    public static final d7r P;
    public static final n7r P0;
    public static final d7r Q;
    public static final i7r Q0;
    public static final d7r R;
    public static final i7r R0;
    public static final i7r S;
    public static final m7r S0;
    public static final d7r T;
    public static final m7r T0;
    public static final d7r U;
    public static final m7r U0;
    public static final d7r V;
    public static final m7r V0;
    public static final n7r W;
    public static final m7r W0;
    public static final n7r X;
    public static final l7r X0;
    public static final i7r Y;
    public static final d7r Y0;
    public static final d7r Z;
    public static final l7r Z0;
    public static final n7r a0;
    public static final l7r a1;
    public static final int b;
    public static final d7r b0;
    public static final i7r b1;
    public static final i7r c;
    public static final d7r c0;
    public static final h7r c1;
    public static final m7r d;
    public static final d7r d0;
    public static final i7r d1;
    public static final n7r e;
    public static final d7r e0;
    public static final i7r e1;
    public static final n7r f;
    public static final d7r f0;
    public static final h7r f1;
    public static final i7r g;
    public static final d7r g0;
    public static final n7r g1;
    public static final m7r h;
    public static final d7r h0;
    public static final n7r h1;
    public static final n7r i;
    public static final i7r i0;
    public static final m7r i1;
    public static final n7r j;
    public static final l7r j0;
    public static final n7r j1;
    public static final n7r k;
    public static final l7r k0;
    public static final l7r k1;
    public static final n7r l;
    public static final d7r l0;
    public static final l7r l1;
    public static final i7r m;
    public static final l7r m0;
    public static final l7r m1;
    public static final i7r n;
    public static final l7r n0;
    public static final l7r n1;
    public static final n7r o;
    public static final l7r o0;
    public static final l7r o1;
    public static final i7r p;
    public static final l7r p0;
    public static final l7r p1;
    public static final n7r q;
    public static final l7r q0;
    public static final d7r q1;
    public static final i7r r;
    public static final l7r r0;
    public static final l7r r1;
    public static final d7r s;
    public static final d7r s0;
    public static final d7r s1;
    public static final d7r t;
    public static final d7r t0;
    public static final d7r t1;
    public static final d7r u;
    public static final d7r u0;
    public static final d7r u1;
    public static final d7r v;
    public static final i7r v0;
    public static final l7r v1;
    public static final n7r w;
    public static final d7r w0;
    public static final d7r x;
    public static final d7r x0;
    public static final m7r y;
    public static final i7r y0;
    public static final d7r z;
    public static final i7r z0;

    static {
        b = BuildInfo.m() ? 600 : 60;
        c = new i7r("uid");
        m7r m7rVar = new m7r("long_uid");
        d = m7rVar;
        n7r n7rVar = new n7r(CommonConstant.KEY_ACCESS_TOKEN);
        e = n7rVar;
        n7r n7rVar2 = new n7r("secret");
        f = n7rVar2;
        g = new i7r("expiresInSec");
        h = new m7r("tokenCreatedMs");
        i = new n7r("name");
        j = new n7r(X3.j.D);
        k = new n7r("photo");
        l = new n7r("status");
        m = new i7r("country");
        n = new i7r("sex");
        o = new n7r("birthDate");
        p = new i7r("birthDateVisibility");
        q = new n7r("role");
        r = new i7r("intro");
        s = new d7r("exportTwitterAvail");
        t = new d7r("exportFacebookAvail");
        u = new d7r("allowBuyVotes");
        v = new d7r("trackInstalledApps");
        w = new n7r("supportUrl");
        x = new d7r("hasMusicSubscription");
        y = new m7r("musicSubscriptionExpiresDate");
        z = new d7r("isMusicRestricted");
        A = new i7r("discoverPreloadTimeSec");
        B = new i7r("discoverPreloadNotSeenTimeSec");
        C = new d7r("storiesAvailable");
        D = new d7r("masksAvailable");
        E = new d7r("moneyTransfersAvailable");
        F = new d7r("moneyTransfersCanSend");
        G = new n7r("moneyTransfersCurrency");
        H = new d7r("moneyTransfersCanSendToCommunities");
        I = new i7r("moneyTransfersMinAmount");
        J = new i7r("moneyTransfersMaxAmount");
        K = new d7r("htmlGamesEnabled");
        L = new d7r("useWebAppForReportContent");
        M = new d7r("communityComments");
        N = new d7r("webViewAuthorizationAllowed");
        O = new d7r("callsAvailable");
        P = new d7r("storyRepliesAvailable");
        Q = new d7r("animatedStickersAvailable");
        R = new d7r("playlistsDownloadEnabled");
        S = new i7r("audioBackgroundLimit");
        T = new d7r("riseToRecordAvailable");
        U = new d7r("vkLiveStreamAvailable");
        V = new d7r("vkPayAvailable");
        W = new n7r("vkPayEndpoint");
        X = new n7r("vkPayEndpointV2");
        Y = new i7r("vkPayAppId");
        Z = new d7r("audioAdAvailable");
        a0 = new n7r("inviteLink");
        b0 = new d7r("liveSectionAvailable");
        c0 = new d7r("liveSectionNewBadge");
        d0 = new d7r("live_streaming");
        e0 = new d7r("live_masks");
        f0 = new d7r("camera_pingpong");
        g0 = new d7r("isEuUser");
        h0 = new d7r("podcastsSectionAvailable");
        i0 = new i7r("discoverDesignVersion");
        j0 = new l7r("menu_ads_easy_promote");
        k0 = new l7r("audioAdConfig");
        l0 = new d7r("subscription_combo_allowed");
        m0 = new l7r("profilerConfig");
        n0 = new l7r("videoConfig");
        o0 = new l7r("verifyInfo");
        p0 = new l7r(C4641xe.d);
        q0 = new l7r("hints");
        r0 = new l7r("specialEvents");
        s0 = new d7r("vkuiCommunityCreation");
        t0 = new d7r("vkuiEditProfile");
        u0 = new d7r("fieldInlineComments");
        v0 = new i7r("storyPhotoDuration");
        w0 = new d7r("storiesReposts");
        x0 = new d7r("vk_identity");
        y0 = new i7r("hashtag");
        z0 = new i7r("mention");
        A0 = new i7r("musicStickers");
        B0 = new i7r("marketItem");
        C0 = new d7r("isClosed");
        D0 = new l7r("photo_image");
        l7r l7rVar = new l7r("imageStatus");
        E0 = l7rVar;
        n7r n7rVar3 = new n7r("feed_applovin_unit_id");
        F0 = n7rVar3;
        n7r n7rVar4 = new n7r("user_id_hash");
        G0 = n7rVar4;
        n7r n7rVar5 = new n7r("feed_yandex_ads_unit_id");
        H0 = n7rVar5;
        I0 = izi0.d(m7rVar, n7rVar, n7rVar2);
        J0 = izi0.d(l7rVar, n7rVar3, n7rVar4, n7rVar5);
        K0 = new i7r("musicIntroVersion");
        L0 = new d7r("bugsVkUiAvailable");
        M0 = new i7r("shopping_intro");
        N0 = new i7r("show_wishlist_onboarding");
        O0 = new d7r("market_orders");
        P0 = new n7r("redirectLinks");
        Q0 = new i7r("maxHtmlAds");
        R0 = new i7r("followersCount");
        S0 = new m7r("discoverCategoriesCacheValidFrom");
        T0 = new m7r("discoverPostsCacheValidFrom");
        U0 = new m7r("sendNetworkStatUntil");
        V0 = new m7r("sendImagesNetworkStatsUntil");
        W0 = new m7r("sendAudioNetworkStatsUntil");
        X0 = new l7r("commentRestriction");
        Y0 = new d7r("isTopicExpert");
        Z0 = new l7r("cacheConfig");
        a1 = new l7r("pageSizeConfig");
        b1 = new i7r("newsfeedUpdatePeriod");
        c1 = new h7r("newsfeedUpdateRatio");
        d1 = new i7r("newsfeedInactiveTimeToReset");
        e1 = new i7r("storiesUpdatePeriod");
        f1 = new h7r("storiesUpdateRatio");
        g1 = new n7r("vkcRulesAcceptHash");
        h1 = new n7r("phone");
        i1 = new m7r("joined");
        j1 = new n7r("imUserNameType");
        k1 = new l7r("imCountersSettings");
        l1 = new l7r("sideMenuItems");
        m1 = new l7r("sideMenuSections");
        n1 = new l7r("navigationSuperAppFeatures");
        o1 = new l7r("navigationTabBar");
        p1 = new l7r(NotificationCompat.CATEGORY_NAVIGATION);
        q1 = new d7r("obsceneTextFilter");
        r1 = new l7r("marketAdult18plus");
        s1 = new d7r("isNft");
        Descriptor descriptor = Descriptor.Boolean;
        t1 = new d7r("isFollowersModeOn");
        u1 = new d7r("canChangePassword");
        v1 = new l7r("feed_preloading");
    }

    public m6r0() {
        super(null);
    }

    public final boolean A() {
        return fkq0.c(y());
    }

    public final boolean B() {
        return TextUtils.equals((String) a(q), "worker");
    }

    public final void C(String str) {
        f(e, str);
    }

    public final void D(int i2) {
        f(g, Integer.valueOf(i2));
    }

    public final void E(String str) {
        f(f, str);
    }

    public final void F(long j2) {
        f(h, Long.valueOf(j2));
    }

    public final void G(UserId userId) {
        f(d, Long.valueOf(userId.b));
    }

    public final UserProfile H() {
        ArrayList arrayList;
        Object obj;
        UserProfile userProfile = new UserProfile();
        userProfile.c = y();
        String r2 = r();
        String str = null;
        if (!TextUtils.isEmpty(r2)) {
            String[] strArr = (String[]) n6j.a(2, " ", r2).toArray(new String[0]);
            userProfile.d = strArr.length == 0 ? null : strArr[0];
            userProfile.f = strArr.length > 1 ? strArr[1] : null;
        }
        userProfile.e = r2;
        userProfile.M = (String) a(l);
        userProfile.h = u();
        l7r l7rVar = D0;
        Image image = (Image) ((bxx) a(l7rVar));
        if (image != null && (arrayList = image.b) != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ImageSize) obj).c7()) {
                    break;
                }
            }
            ImageSize imageSize = (ImageSize) obj;
            if (imageSize != null) {
                str = imageSize.getUrl();
            }
        }
        userProfile.g = str;
        userProfile.O = (Image) ((bxx) a(l7rVar));
        userProfile.q = (String) a(j);
        userProfile.N = UserProfile.ObjectType.USER;
        userProfile.p = (String) b(o, "");
        userProfile.R = (ImageStatus) ((bxx) a(E0));
        userProfile.Y = e(s1);
        return userProfile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    @Override // xsna.xej
    public final bxx g(String str, JSONObject jSONObject) {
        ?? r12 = 0;
        if (str.equals(k0.a)) {
            if (jSONObject != null) {
                Serializer.c<AudioAdConfig> cVar = AudioAdConfig.CREATOR;
                return AudioAdConfig.a.a(jSONObject);
            }
        } else if (str.equals(m0.a)) {
            if (jSONObject != null) {
                return new ProfilerConfig(jSONObject, (zcl) null);
            }
        } else if (!str.equals(n0.a)) {
            int i2 = 0;
            if (str.equals(o0.a)) {
                if (jSONObject != null) {
                    int i3 = VerifyInfo.VerifyInfoJSONSerialize.h;
                    boolean z2 = jSONObject.optInt("verified", 0) == 1;
                    boolean z3 = jSONObject.optInt("trending", 0) == 1;
                    boolean optBoolean = jSONObject.optBoolean("is_oauth_verified", false);
                    int optInt = jSONObject.optInt("trust_mark", 0);
                    boolean z4 = optInt == 2;
                    boolean z5 = optInt == 3;
                    boolean z6 = optInt == 4 || optInt == 5;
                    Serializer.c<VerifyInfo> cVar2 = VerifyInfo.CREATOR;
                    if (VerifyInfo.a.b(z2, z3, optBoolean, z4, z5, z6)) {
                        return new VerifyInfo.VerifyInfoJSONSerialize(z2, z3, optBoolean, z4, z5, z6);
                    }
                }
            } else if (str.equals(p0.a)) {
                if (jSONObject != null) {
                    return a.C0901a.b(jSONObject);
                }
            } else if (str.equals(q0.a)) {
                if (jSONObject != null) {
                    return new com.vk.dto.hints.a(jSONObject);
                }
            } else if (!str.equals(r0.a)) {
                if (str.equals(D0.a)) {
                    if (jSONObject != null) {
                        Serializer.c<Image> cVar3 = Image.CREATOR;
                        return Image.b.b(jSONObject);
                    }
                } else if (str.equals(X0.a)) {
                    if (jSONObject != null) {
                        return new fcg(jSONObject);
                    }
                } else if (str.equals(Z0.a)) {
                    if (jSONObject != null) {
                        int i4 = pv8.k;
                        return pv8.a.c(jSONObject);
                    }
                } else if (str.equals(a1.a)) {
                    if (jSONObject != null) {
                        return ba90.a.a(jSONObject);
                    }
                } else if (str.equals(j0.a)) {
                    if (jSONObject != null) {
                        return new c520(jSONObject);
                    }
                } else if (str.equals(E0.a)) {
                    if (jSONObject != null) {
                        Serializer.c<ImageStatus> cVar4 = ImageStatus.CREATOR;
                        return ImageStatus.a.a(jSONObject);
                    }
                } else if (!str.equals(l1.a)) {
                    if (str.equals(m1.a)) {
                        if (jSONObject != null) {
                            JSONArray optJSONArray = jSONObject.optJSONArray("sections");
                            if (optJSONArray != null) {
                                r12 = new ArrayList(optJSONArray.length());
                                int length = optJSONArray.length();
                                while (i2 < length) {
                                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                                    if (optJSONObject != null) {
                                        int i5 = SideMenuItems.b;
                                        r12.add(SideMenuItems.a.a(optJSONObject.getJSONArray("items")));
                                    }
                                    i2++;
                                }
                            }
                            if (r12 == 0) {
                                r12 = EmptyList.b;
                            }
                            return new dlj0((List<SideMenuItems>) r12);
                        }
                    } else if (str.equals(n1.a)) {
                        if (jSONObject != null) {
                            JSONSerializeStringList jSONSerializeStringList = new JSONSerializeStringList();
                            JSONArray jSONArray = jSONObject.getJSONArray("items");
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            int length2 = jSONArray.length();
                            while (i2 < length2) {
                                i2 = wq.b(jSONArray, i2, arrayList, i2, 1);
                            }
                            jSONSerializeStringList.addAll(arrayList);
                            return jSONSerializeStringList;
                        }
                    } else if (str.equals(o1.a)) {
                        if (jSONObject != null) {
                            int i6 = TabBarItems.b;
                            return TabBarItems.a.a(jSONObject);
                        }
                    } else if (str.equals(p1.a)) {
                        if (jSONObject != null) {
                            int i7 = com.vk.dto.menu.a.d;
                            return a.b.a(jSONObject);
                        }
                    } else if (str.equals(r1.a)) {
                        if (jSONObject != null) {
                            return or00.a.a(jSONObject);
                        }
                    } else if (str.equals(v1.a)) {
                        if (jSONObject != null) {
                            return s2r.a.b(jSONObject);
                        }
                    } else if (str.equals(k1.a) && jSONObject != null) {
                        return new md20(jSONObject.getBoolean("include_muted"), jSONObject.getBoolean("include_group_dialogs"), jSONObject.getBoolean("include_channels"));
                    }
                }
            }
        } else if (jSONObject != null) {
            Serializer.c<VideoConfig> cVar5 = VideoConfig.CREATOR;
            return VideoConfig.a.a(jSONObject);
        }
        return null;
    }

    public final void i(m6r0 m6r0Var) {
        ConcurrentHashMap<c7r, Object> concurrentHashMap = m6r0Var.a;
        for (Map.Entry<c7r, Object> entry : concurrentHashMap.entrySet()) {
            c7r key = entry.getKey();
            Object value = entry.getValue();
            if (!I0.contains(key)) {
                f(key, value);
            }
        }
        Iterator<c7r> it = J0.iterator();
        while (it.hasNext()) {
            c7r next = it.next();
            if (!concurrentHashMap.containsKey(next)) {
                this.a.remove(next);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void j(JSONObject jSONObject) throws JSONException {
        com.vk.dto.menu.a aVar;
        pv8 pv8Var;
        int i2;
        JSONObject optJSONObject;
        int i3;
        int i4;
        JSONObject jSONObject2;
        ImageStatus imageStatus;
        Float valueOf = Float.valueOf(1.0f);
        JSONObject jSONObject3 = jSONObject.getJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        if (jSONObject3 != null) {
            G(new UserId(jSONObject3.optLong("id", 0L)));
            f(i, jSONObject3.getString("first_name") + ' ' + jSONObject3.getString("last_name"));
            f(k, jSONObject3.optString("photo_base"));
            Serializer.c<Image> cVar = Image.CREATOR;
            f(D0, Image.b.b(jSONObject3));
            f(l, jSONObject3.optString("status"));
            JSONObject optJSONObject2 = jSONObject3.optJSONObject("country");
            f(m, Integer.valueOf(optJSONObject2 != null ? optJSONObject2.optInt("id", 0) : 0));
            UserSex.a aVar2 = UserSex.Companion;
            Integer valueOf2 = Integer.valueOf(jSONObject3.optInt("sex"));
            aVar2.getClass();
            f(n, Integer.valueOf(UserSex.a.a(valueOf2).h()));
            d7r d7rVar = C0;
            Boolean bool = (Boolean) a(d7rVar);
            f(d7rVar, Boolean.valueOf(jSONObject3.optBoolean("is_closed", bool != null ? bool.booleanValue() : false)));
            z().Bb(jSONObject3);
            f(j, jSONObject3.optString(X3.j.D));
            f(R0, Integer.valueOf(jSONObject3.optInt("followers_count")));
            JSONObject optJSONObject3 = jSONObject3.optJSONObject("image_status");
            if (optJSONObject3 != null) {
                Serializer.c<ImageStatus> cVar2 = ImageStatus.CREATOR;
                imageStatus = ImageStatus.a.a(optJSONObject3);
            } else {
                imageStatus = null;
            }
            f(E0, imageStatus);
            f(s1, Boolean.valueOf(jSONObject3.optBoolean("is_nft")));
            JSONObject optJSONObject4 = jSONObject3.optJSONObject("exports");
            if (optJSONObject4 != null) {
                f(s, Boolean.valueOf(optJSONObject4.optInt("twitter") == 1));
                f(t, Boolean.valueOf(optJSONObject4.optInt("facebook") == 1));
                s3q0 s3q0Var = s3q0.a;
            }
            f(t1, f370.q(jSONObject3, "is_followers_mode_on"));
            s3q0 s3q0Var2 = s3q0.a;
        }
        VideoConfig videoConfig = new VideoConfig(0, null, 0L, false, false, 31, null);
        l7r l7rVar = n0;
        f(l7rVar, videoConfig);
        JSONObject jSONObject4 = jSONObject.getJSONObject("info");
        if (jSONObject4 != null) {
            f(r, Integer.valueOf(jSONObject4.getInt("intro")));
            f(K0, Integer.valueOf(jSONObject4.optInt("music_intro")));
            f(T, Boolean.valueOf(jSONObject4.optBoolean("raise_to_record_enabled", true)));
            f(M, Boolean.valueOf(jSONObject4.optBoolean("community_comments", false)));
            f(v, Boolean.valueOf(jSONObject4.optBoolean("track_installed_apps")));
            f(w, jSONObject4.optString("support_url"));
            f(a0, jSONObject4.optString("invite_link", "https://" + a0a.d + "/join"));
            JSONObject optJSONObject5 = jSONObject4.optJSONObject("audio_ads");
            if (optJSONObject5 != null) {
                Serializer.c<AudioAdConfig> cVar3 = AudioAdConfig.CREATOR;
                f(k0, AudioAdConfig.a.a(optJSONObject5));
                s3q0 s3q0Var3 = s3q0.a;
            }
            JSONObject optJSONObject6 = jSONObject4.optJSONObject("video_player");
            if (optJSONObject6 != null) {
                f(l7rVar, VideoConfig.a.a(optJSONObject6));
                s3q0 s3q0Var4 = s3q0.a;
            }
            JSONArray optJSONArray = jSONObject4.optJSONArray(BillingClient.FeatureType.SUBSCRIPTIONS);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        jSONObject2 = null;
                        break;
                    }
                    jSONObject2 = optJSONArray.getJSONObject(i5);
                    if (jSONObject2.getInt("id") == 1) {
                        break;
                    } else {
                        i5++;
                    }
                }
                f(x, Boolean.valueOf(jSONObject2 != null));
                f(y, Long.valueOf((jSONObject2 != null ? jSONObject2.getLong("expires_date") : 0L) * 1000));
                s3q0 s3q0Var5 = s3q0.a;
            }
            JSONObject optJSONObject7 = jSONObject4.optJSONObject("profiler_settings");
            if (optJSONObject7 != null) {
                f(m0, new ProfilerConfig(optJSONObject7, (zcl) null));
                s3q0 s3q0Var6 = s3q0.a;
            }
            JSONObject optJSONObject8 = jSONObject4.optJSONObject("money_p2p_params");
            if (optJSONObject8 != null) {
                f(I, Integer.valueOf(optJSONObject8.optInt("min_amount", 0)));
                f(J, Integer.valueOf(optJSONObject8.optInt("max_amount", 0)));
                f(G, optJSONObject8.optString(InAppPurchaseMetaData.KEY_CURRENCY));
                s3q0 s3q0Var7 = s3q0.a;
            }
            JSONObject optJSONObject9 = jSONObject4.optJSONObject("shopping_params");
            if (optJSONObject9 != null) {
                f(M0, Integer.valueOf(optJSONObject9.optBoolean("show_intro", false) ? 1 : 0));
                f(N0, Integer.valueOf(optJSONObject9.optBoolean("show_wishlist_onboarding", false) ? 1 : 0));
                s3q0 s3q0Var8 = s3q0.a;
            }
            f(l0, Boolean.valueOf(jSONObject4.optBoolean("subscription_combo_allowed")));
            f(p0, a.C0901a.a(jSONObject4.optJSONArray(C4641xe.d), true));
            f(g0, Boolean.valueOf(jSONObject4.optBoolean("eu_user")));
            f(q, jSONObject4.optString("role"));
            f(W, jSONObject4.optString("vk_pay_endpoint"));
            f(X, jSONObject4.optString("vk_pay_endpoint_v2"));
            f(Y, Integer.valueOf(jSONObject4.optInt("vk_pay_app_id")));
            f(P0, new JSONObject(jSONObject4.optString("link_redirects", "{}")).toString());
            JSONObject optJSONObject10 = jSONObject4.optJSONObject("menu_ads_easy_promote");
            f(j0, optJSONObject10 == null ? new c520(0) : new c520(optJSONObject10));
            if (jSONObject4.optJSONObject("valid_from") != null) {
                f(T0, Long.valueOf(r4.optInt("discover_posts") * 1000));
                f(S0, Long.valueOf(r4.optInt("discover_categories") * 1000));
            } else {
                f(T0, 0L);
                f(S0, 0L);
            }
            f(U0, Long.valueOf(jSONObject4.optLong("send_common_network_stats_until")));
            f(V0, Long.valueOf(jSONObject4.optLong("send_images_network_stats_until")));
            f(W0, Long.valueOf(jSONObject4.optLong("send_audio_network_stats_until")));
            JSONObject optJSONObject11 = jSONObject4.optJSONObject("messages_counter_settings");
            f(k1, optJSONObject11 != null ? new md20(optJSONObject11.getBoolean("include_muted"), optJSONObject11.getBoolean("include_group_dialogs"), optJSONObject11.getBoolean("include_channels")) : md20.e.getSTUB());
            JSONArray jSONArray = jSONObject4.getJSONArray("settings");
            if (jSONArray != null) {
                k9x q2 = swe0.q(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(c5g.u(q2, 10));
                j9x it = q2.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArray.getJSONObject(it.nextInt()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    JSONObject jSONObject5 = (JSONObject) it2.next();
                    String string = jSONObject5.getString("name");
                    if (string != null) {
                        switch (string.hashCode()) {
                            case -2084662349:
                                if (!string.equals("discover_preload")) {
                                    break;
                                } else {
                                    if (jSONObject5.optBoolean("available", false)) {
                                        int i6 = b;
                                        i3 = Math.max(jSONObject5.optInt("value", i6), i6);
                                    } else {
                                        i3 = -1;
                                    }
                                    f(A, Integer.valueOf(i3));
                                    break;
                                }
                            case -1884266413:
                                if (!string.equals("stories")) {
                                    break;
                                } else {
                                    d7r d7rVar2 = C;
                                    f(d7rVar2, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar2))));
                                    break;
                                }
                            case -1713202449:
                                if (!string.equals("money_p2p")) {
                                    break;
                                } else {
                                    f(E, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    f(F, Boolean.valueOf(epx.f(jSONObject5.optString("value", ""), "can_send")));
                                    break;
                                }
                            case -1323471059:
                                if (!string.equals("video_discover")) {
                                    break;
                                } else {
                                    l7r l7rVar2 = n0;
                                    VideoConfig videoConfig2 = (VideoConfig) ((bxx) a(l7rVar2));
                                    boolean optBoolean = jSONObject5.optBoolean("available", videoConfig2 != null ? videoConfig2.Ab() : false);
                                    VideoConfig videoConfig3 = (VideoConfig) ((bxx) a(l7rVar2));
                                    if (videoConfig3 == null) {
                                        break;
                                    } else {
                                        videoConfig3.Cb(optBoolean);
                                        break;
                                    }
                                }
                            case -1252313020:
                                if (!string.equals("camera_pingpong")) {
                                    break;
                                } else {
                                    f(f0, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    break;
                                }
                            case -1184215288:
                                if (!string.equals("vk_identity")) {
                                    break;
                                } else {
                                    f(x0, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    break;
                                }
                            case -1027706515:
                                if (!string.equals("money_clubs_p2p")) {
                                    break;
                                } else {
                                    d7r d7rVar3 = H;
                                    f(d7rVar3, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar3))));
                                    break;
                                }
                            case -795192327:
                                if (!string.equals("wallet")) {
                                    break;
                                } else {
                                    d7r d7rVar4 = V;
                                    f(d7rVar4, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar4))));
                                    break;
                                }
                            case -688205752:
                                if (!string.equals("market_orders")) {
                                    break;
                                } else {
                                    f(O0, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    break;
                                }
                            case -614618178:
                                if (!string.equals("story_replies")) {
                                    break;
                                } else {
                                    d7r d7rVar5 = P;
                                    f(d7rVar5, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar5))));
                                    break;
                                }
                            case -419852797:
                                if (!string.equals("vklive_app")) {
                                    break;
                                } else {
                                    d7r d7rVar6 = U;
                                    f(d7rVar6, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar6))));
                                    break;
                                }
                            case -348631566:
                                if (!string.equals("animated_stickers")) {
                                    break;
                                } else {
                                    d7r d7rVar7 = Q;
                                    f(d7rVar7, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar7))));
                                    break;
                                }
                            case -332773158:
                                if (!string.equals("inline_comments")) {
                                    break;
                                } else {
                                    f(u0, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    break;
                                }
                            case -329644365:
                                if (!string.equals("webview_authorization")) {
                                    break;
                                } else {
                                    d7r d7rVar8 = N;
                                    f(d7rVar8, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar8))));
                                    break;
                                }
                            case -157093721:
                                if (!string.equals("video_autoplay")) {
                                    break;
                                } else {
                                    l7r l7rVar3 = n0;
                                    VideoConfig videoConfig4 = (VideoConfig) ((bxx) a(l7rVar3));
                                    boolean optBoolean2 = jSONObject5.optBoolean("available", videoConfig4 != null ? videoConfig4.zb() : false);
                                    VideoConfig videoConfig5 = (VideoConfig) ((bxx) a(l7rVar3));
                                    if (videoConfig5 == null) {
                                        break;
                                    } else {
                                        videoConfig5.Bb(optBoolean2);
                                        break;
                                    }
                                }
                            case -150013098:
                                if (!string.equals("vkui_profile_edit")) {
                                    break;
                                } else {
                                    f(t0, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    break;
                                }
                            case -69432113:
                                if (!string.equals("live_streaming")) {
                                    break;
                                } else {
                                    f(d0, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    break;
                                }
                            case 3035263:
                                if (!string.equals("bugs")) {
                                    break;
                                } else {
                                    f(L0, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    break;
                                }
                            case 94425557:
                                if (!string.equals("calls")) {
                                    break;
                                } else {
                                    d7r d7rVar9 = O;
                                    f(d7rVar9, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar9))));
                                    break;
                                }
                            case 103667463:
                                if (!string.equals("masks")) {
                                    break;
                                } else {
                                    d7r d7rVar10 = D;
                                    f(d7rVar10, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar10))));
                                    break;
                                }
                            case 188508359:
                                if (!string.equals("audio_ads")) {
                                    break;
                                } else {
                                    d7r d7rVar11 = Z;
                                    f(d7rVar11, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar11))));
                                    l7r l7rVar4 = k0;
                                    AudioAdConfig audioAdConfig = (AudioAdConfig) ((bxx) a(l7rVar4));
                                    f(l7rVar4, audioAdConfig != null ? AudioAdConfig.zb(audioAdConfig, e(d7rVar11)) : null);
                                    break;
                                }
                            case 431074854:
                                if (!string.equals("playlists_download")) {
                                    break;
                                } else {
                                    d7r d7rVar12 = R;
                                    f(d7rVar12, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar12))));
                                    break;
                                }
                            case 539460981:
                                if (!string.equals("im_user_name_type")) {
                                    break;
                                } else {
                                    UserNameType.a aVar3 = UserNameType.Companion;
                                    String optString = jSONObject5.optString("value");
                                    aVar3.getClass();
                                    UserNameType a = UserNameType.a.a(optString);
                                    if (a == null) {
                                        a = UserNameType.VK;
                                    }
                                    f(j1, a.h());
                                    break;
                                }
                            case 816693107:
                                if (!string.equals("discover_preload_not_seen")) {
                                    break;
                                } else {
                                    if (jSONObject5.optBoolean("available", false)) {
                                        int i7 = b;
                                        i4 = Math.max(jSONObject5.optInt("value", i7), i7);
                                    } else {
                                        i4 = -1;
                                    }
                                    f(B, Integer.valueOf(i4));
                                    break;
                                }
                            case 886773427:
                                if (!string.equals("audio_background_limit")) {
                                    break;
                                } else {
                                    f(S, Integer.valueOf(jSONObject5.optBoolean("available", false) ? jSONObject5.optInt("value", 0) : -1));
                                    break;
                                }
                            case 944940181:
                                if (!string.equals("podcasts_section")) {
                                    break;
                                } else {
                                    d7r d7rVar13 = h0;
                                    f(d7rVar13, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar13))));
                                    break;
                                }
                            case 1181871725:
                                if (!string.equals("discover_design_version")) {
                                    break;
                                } else {
                                    f(i0, Integer.valueOf(jSONObject5.optBoolean("available", false) ? jSONObject5.optInt("value", 0) : 0));
                                    break;
                                }
                            case 1185355373:
                                if (!string.equals("stories_photo_duration")) {
                                    break;
                                } else {
                                    f(v0, Integer.valueOf(f370.w(jSONObject5, 0, "value")));
                                    break;
                                }
                            case 1207405044:
                                if (!string.equals("live_masks")) {
                                    break;
                                } else {
                                    f(e0, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    break;
                                }
                            case 1635973000:
                                if (!string.equals("vkui_community_create")) {
                                    break;
                                } else {
                                    f(s0, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    break;
                                }
                            case 1766742420:
                                if (!string.equals("stories_reposts")) {
                                    break;
                                } else {
                                    f(w0, Boolean.valueOf(jSONObject5.optBoolean("available", false)));
                                    break;
                                }
                            case 1805134482:
                                if (!string.equals("live_section")) {
                                    break;
                                } else {
                                    d7r d7rVar14 = b0;
                                    f(d7rVar14, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar14))));
                                    f(c0, Boolean.valueOf(epx.f(jSONObject5.optString("value", ""), "highlight_section")));
                                    break;
                                }
                            case 2117771248:
                                if (!string.equals("audio_restrictions")) {
                                    break;
                                } else {
                                    d7r d7rVar15 = z;
                                    f(d7rVar15, Boolean.valueOf(jSONObject5.optBoolean("available", e(d7rVar15))));
                                    break;
                                }
                        }
                    }
                }
                s3q0 s3q0Var9 = s3q0.a;
            }
            JSONObject optJSONObject12 = jSONObject4.optJSONObject("clickable_stickers");
            if (optJSONObject12 != null && (optJSONObject = optJSONObject12.optJSONObject("max_stickers")) != null) {
                f(y0, Integer.valueOf(optJSONObject.optInt("hashtag", 3)));
                f(z0, Integer.valueOf(optJSONObject.optInt("mention", 10)));
                f(A0, Integer.valueOf(optJSONObject.optInt("music", 1)));
                f(B0, Integer.valueOf(optJSONObject.optInt("market_item", 10)));
                s3q0 s3q0Var10 = s3q0.a;
            }
            JSONObject optJSONObject13 = jSONObject4.optJSONObject("comment_restriction");
            f(X0, optJSONObject13 != null ? new fcg(optJSONObject13) : null);
            f(Y0, Boolean.valueOf(jSONObject4.optBoolean("is_topic_expert")));
            JSONObject optJSONObject14 = jSONObject4.optJSONObject("cache");
            if (optJSONObject14 != null) {
                int i8 = pv8.k;
                pv8Var = pv8.a.c(optJSONObject14);
            } else {
                pv8Var = null;
            }
            f(Z0, pv8Var);
            JSONObject optJSONObject15 = jSONObject4.optJSONObject("page_size");
            f(a1, optJSONObject15 != null ? ba90.a.a(optJSONObject15) : null);
            JSONObject optJSONObject16 = jSONObject4.optJSONObject("newsfeed");
            if (optJSONObject16 != null) {
                JSONObject optJSONObject17 = optJSONObject16.optJSONObject("update_settings");
                if (optJSONObject17 != null) {
                    f(b1, Integer.valueOf(optJSONObject17.optInt("base_period", -1)));
                    f(c1, Float.valueOf((float) optJSONObject17.optDouble("inactive_progression_common_ratio", 1.0d)));
                    i2 = -1;
                } else {
                    i2 = -1;
                    f(b1, Integer.valueOf(optJSONObject16.optInt("update_period", -1)));
                    f(c1, valueOf);
                }
                f(d1, Integer.valueOf(optJSONObject16.optInt("inactive_time_to_reset", i2)));
            } else {
                f(b1, -1);
                f(c1, valueOf);
                f(d1, -1);
            }
            JSONObject optJSONObject18 = jSONObject4.optJSONObject("stories");
            JSONObject optJSONObject19 = optJSONObject18 != null ? optJSONObject18.optJSONObject("update_settings") : null;
            if (optJSONObject19 != null) {
                f(e1, Integer.valueOf(optJSONObject19.optInt("base_period", -1)));
                f(f1, Float.valueOf((float) optJSONObject19.optDouble("inactive_progression_common_ratio", 1.0d)));
            } else {
                f(e1, Integer.valueOf(optJSONObject16 != null ? optJSONObject16.optInt("update_period", -1) : -1));
                f(f1, valueOf);
            }
            f(g1, jSONObject4.optString("rules_accept_hash"));
            f(h1, jSONObject4.optString("phone"));
            ObsceneTextFilter.a aVar4 = ObsceneTextFilter.Companion;
            Boolean q3 = f370.q(jSONObject4, "obscene_text_filter");
            aVar4.getClass();
            ObsceneTextFilter a2 = ObsceneTextFilter.a.a(q3);
            d7r d7rVar16 = q1;
            int i9 = ObsceneTextFilter.b.$EnumSwitchMapping$0[a2.ordinal()];
            f(d7rVar16, i9 != 1 ? i9 != 2 ? null : Boolean.FALSE : Boolean.TRUE);
            JSONObject optJSONObject20 = jSONObject4.optJSONObject("market_adult_18plus");
            f(r1, optJSONObject20 != null ? or00.a.a(optJSONObject20) : null);
            f(u1, Boolean.valueOf(jSONObject4.optBoolean("can_change_password")));
            JSONObject optJSONObject21 = jSONObject4.optJSONObject("feed_preloading");
            f(v1, optJSONObject21 != null ? s2r.a.b(optJSONObject21) : null);
            f(F0, f370.D(jSONObject4, "feed_applovin_unit_id"));
            f(G0, f370.D(jSONObject4, "user_id_hash"));
            f(H0, f370.D(jSONObject4, "feed_yandex_ads_unit_id"));
            s3q0 s3q0Var11 = s3q0.a;
        }
        f(u, Boolean.valueOf(jSONObject.optBoolean("allow_buy_votes")));
        f(K, Boolean.valueOf(jSONObject.optInt("html_games_supported") == 1));
        f(L, Boolean.FALSE);
        JSONObject optJSONObject22 = jSONObject.optJSONObject("help_hints");
        if (optJSONObject22 != null) {
            f(q0, new com.vk.dto.hints.a(optJSONObject22));
            s3q0 s3q0Var12 = s3q0.a;
        }
        if (jSONObject.has(NotificationCompat.CATEGORY_NAVIGATION)) {
            int i10 = com.vk.dto.menu.a.d;
            aVar = a.b.a(jSONObject.getJSONObject(NotificationCompat.CATEGORY_NAVIGATION));
        } else {
            aVar = new com.vk.dto.menu.a((a.d) null, 3);
        }
        f(p1, aVar);
        f(Q0, Integer.valueOf(jSONObject.optInt("max_html_ads", p())));
    }

    public final String k() {
        return (String) a(e);
    }

    public final int l() {
        Integer num = (Integer) a(g);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String m() {
        return (String) a(F0);
    }

    public final String n() {
        return drm0.L(r(), ' ', 0, 6) > -1 ? r().substring(0, drm0.L(r(), ' ', 0, 6)) : r();
    }

    public final String o() {
        return (String) b(a0, "");
    }

    public final int p() {
        return c(Q0, 2);
    }

    public final c520 q() {
        return (c520) ((bxx) b(j0, new c520(0)));
    }

    public final String r() {
        return (String) b(i, "DELETED");
    }

    public final com.vk.dto.menu.a s() {
        return (com.vk.dto.menu.a) ((bxx) b(p1, new com.vk.dto.menu.a(new a.d((TabBarItems) ((bxx) b(o1, new TabBarItems(true))), (JSONSerializeStringList) ((bxx) b(n1, new JSONSerializeStringList())), (dlj0) ((bxx) b(m1, new dlj0(0)))), 2)));
    }

    public final ObsceneTextFilter t() {
        ObsceneTextFilter.a aVar = ObsceneTextFilter.Companion;
        Boolean bool = (Boolean) a(q1);
        aVar.getClass();
        return ObsceneTextFilter.a.a(bool);
    }

    public final String u() {
        return (String) a(k);
    }

    public final String v() {
        return (String) a(f);
    }

    public final UserSex w() {
        UserSex.a aVar = UserSex.Companion;
        Integer num = (Integer) a(n);
        aVar.getClass();
        return UserSex.a.a(num);
    }

    public final long x() {
        Long l2 = (Long) a(h);
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public final UserId y() {
        Long l2 = (Long) a(d);
        if (l2 == null) {
            l2 = ((Integer) a(c)) != null ? Long.valueOf(r0.intValue()) : null;
        }
        return l2 != null ? new UserId(l2.longValue()) : UserId.d;
    }

    public final VerifyInfo.VerifyInfoJSONSerialize z() {
        l7r l7rVar = o0;
        VerifyInfo.VerifyInfoJSONSerialize verifyInfoJSONSerialize = (VerifyInfo.VerifyInfoJSONSerialize) ((bxx) a(l7rVar));
        if (verifyInfoJSONSerialize != null) {
            return verifyInfoJSONSerialize;
        }
        VerifyInfo.VerifyInfoJSONSerialize verifyInfoJSONSerialize2 = new VerifyInfo.VerifyInfoJSONSerialize(false, false, false, false, false, false, 63, null);
        f(l7rVar, verifyInfoJSONSerialize2);
        return verifyInfoJSONSerialize2;
    }

    public m6r0(m6r0 m6r0Var) {
        super(null);
        G(m6r0Var.y());
        C(m6r0Var.k());
        E(m6r0Var.v());
        D(m6r0Var.l());
        F(m6r0Var.x());
        i(m6r0Var);
    }
}
