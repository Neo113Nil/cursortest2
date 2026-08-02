package xsna;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.compose.foundation.MutatePriority;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetDzenFeedConnectionTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetDzenFeedIntentDto;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.gzw;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes17.dex */
public final class d02 implements yho, vv60, o2u0, i2n0 {
    public static final int[] b = {R.attr.drawable};
    public static final int[] c = {R.attr.name, R.attr.animation};
    public static final int[] d = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] e = {R.attr.ordering};
    public static final int[] f = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] g = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] h = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final int[] i = {R.attr.tension, R.attr.extraTension};
    public static final int[] j = {R.attr.factor};
    public static final int[] k = {R.attr.factor};
    public static final int[] l = {R.attr.cycles};
    public static final int[] m = {R.attr.tension};
    public static final int[] n = {R.attr.controlX1, R.attr.controlY1, R.attr.controlX2, R.attr.controlY2, R.attr.pathData};
    public static final jai o = new jai(-687683584, new vbi(0), false);
    public static final d02 p = new d02();
    public static final aow q = new aow(false);

    public static final m65 g(bpn0 bpn0Var, bpn0 bpn0Var2) {
        return new m65(bpn0Var, bpn0Var2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(gzs gzsVar, wzs wzsVar, ContinuationImpl continuationImpl) {
        wz1 wz1Var;
        int i2;
        if (continuationImpl instanceof wz1) {
            wz1Var = (wz1) continuationImpl;
            int i3 = wz1Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wz1Var.label = i3 - Integer.MIN_VALUE;
                Object obj = wz1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = wz1Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    a02 a02Var = new a02(gzsVar, wzsVar, null);
                    wz1Var.label = 1;
                    if (zvj.d(a02Var, wz1Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }
        wz1Var = new wz1(continuationImpl);
        Object obj2 = wz1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = wz1Var.label;
        if (i2 != 0) {
        }
        return s3q0.a;
    }

    public static final int i(int i2, int i3, int i4) {
        return Math.min(Math.max(0, i4 - i2), i3);
    }

    public static final Object j(e12 e12Var, Object obj, float f2, SuspendLambda suspendLambda) {
        Object b2 = e12Var.b(obj, MutatePriority.Default, new oz1(e12Var, f2, null), suspendLambda);
        return b2 == CoroutineSingletons.COROUTINE_SUSPENDED ? b2 : s3q0.a;
    }

    public static final boolean k(PhotoAlbum photoAlbum) {
        if (photoAlbum.b > 0) {
            return photoAlbum.n || o25.a().a(photoAlbum.c);
        }
        return false;
    }

    public static final void m(int i2, int i3, int i4, int i5, int i6) {
        sex0.c(i5 >= 0, "count (%d) ! >= 0", Integer.valueOf(i5));
        sex0.c(i2 >= 0, "offset (%d) ! >= 0", Integer.valueOf(i2));
        sex0.c(i4 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i4));
        sex0.c(i2 + i5 <= i6, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i6));
        sex0.c(i4 + i5 <= i3, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i3));
    }

    public static int n(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, u73.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static Bundle o(yfc yfcVar) {
        x8a x8aVar = new x8a(0);
        Bundle bundle = (Bundle) x8aVar.b;
        Bundle bundle2 = yfcVar.a;
        Bundle bundle3 = yfcVar.a;
        Long valueOf = bundle2.containsKey("KEY_PRICE_MIN") ? Long.valueOf(bundle2.getLong("KEY_PRICE_MIN")) : null;
        Long valueOf2 = bundle3.containsKey("KEY_PRICE_MAX") ? Long.valueOf(bundle3.getLong("KEY_PRICE_MAX")) : null;
        if (valueOf != null) {
            bundle.putLong("key_filter_price_from", valueOf.longValue());
        }
        if (valueOf2 != null) {
            bundle.putLong("key_filter_price_to", valueOf2.longValue());
        }
        Integer valueOf3 = bundle3.containsKey("KEY_DISTANCE_MAX") ? Integer.valueOf(bundle3.getInt("KEY_DISTANCE_MAX")) : null;
        if (valueOf3 != null) {
            bundle.putInt("key_filter_distance", valueOf3.intValue());
        }
        Double valueOf4 = bundle3.containsKey("KEY_LATITUDE") ? Double.valueOf(bundle3.getDouble("KEY_LATITUDE")) : null;
        Double valueOf5 = bundle3.containsKey("KEY_LONGITUDE") ? Double.valueOf(bundle3.getDouble("KEY_LONGITUDE")) : null;
        String string = bundle3.getString("KEY_LOCATION_NAME");
        Bundle bundle4 = (Bundle) x8aVar.b;
        if (valueOf4 != null) {
            bundle4.putDouble("key_latitude", valueOf4.doubleValue());
        }
        if (valueOf5 != null) {
            bundle4.putDouble("key_longitude", valueOf5.doubleValue());
        }
        if (string != null) {
            bundle4.putString("key_location_name", string);
        }
        bundle4.putBoolean("key_save_geo", false);
        String string2 = bundle3.getString("KEY_SORTING_OPTION_ID");
        if (string2 != null) {
            bundle.putString("key_sorting_option_id", string2);
        }
        Boolean b2 = bo8.b(bundle3, "discount_enabled");
        if (b2 != null) {
            bundle.putBoolean("discount_enabled", b2.booleanValue());
        }
        Boolean b3 = bo8.b(bundle3, "friends_reviews_enabled");
        if (b3 != null) {
            bundle.putBoolean("friends_reviews_enabled", b3.booleanValue());
        }
        Boolean b4 = bo8.b(bundle3, "friends_wishlist_enabled");
        if (b4 != null) {
            bundle.putBoolean("friends_wishlist_enabled", b4.booleanValue());
        }
        String string3 = bundle3.getString("KEY_STATUS_ID");
        if (string3 != null) {
            bundle.putString("key_status_id", string3);
        }
        String string4 = bundle3.getString("KEY_CATALOG_CONTEXT");
        if (string4 != null) {
            bundle.putString("key_catalog_context", string4);
        }
        Integer valueOf6 = bundle3.containsKey("KEY_CATEGORY_ID") ? Integer.valueOf(bundle3.getInt("KEY_CATEGORY_ID")) : null;
        if (valueOf6 != null) {
            List singletonList = Collections.singletonList(new Pair(bundle3.getString("KEY_CATALOG_CONTEXT"), Integer.valueOf(valueOf6.intValue())));
            Bundle bundle5 = (Bundle) x8aVar.b;
            if (singletonList.isEmpty()) {
                bundle5.remove("key_category_ids");
            } else {
                bundle5.putString("key_category_ids", j5g.g0(singletonList, "&", null, null, 0, new od3(3), 30));
            }
        }
        String string5 = bundle3.getString("KEY_ITEM_ID");
        if (string5 != null) {
            bundle.putString("key_item_id", string5);
        }
        UserId c2 = yfcVar.c();
        if (c2 != null) {
            bundle.putParcelable("owner_id", c2);
        }
        Integer a = yfcVar.a();
        if (a != null) {
            bundle.putInt("album_id", a.intValue());
        }
        p(yfcVar, x8aVar);
        return bundle != null ? new Bundle(bundle) : new Bundle();
    }

    public static void p(yfc yfcVar, x8a x8aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        Bundle bundle = (Bundle) x8aVar.b;
        MarketAnalyticsParams b2 = yfcVar.b();
        if (b2 != null) {
            MarketUtmData marketUtmData = b2.b;
            if (marketUtmData != null && (str6 = marketUtmData.h) != null) {
                bundle.putString("traffic_source", str6);
            }
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = b2.d;
            if (commonMarketStat$TypeRefSource != null) {
                bundle.putString("ref_source", commonMarketStat$TypeRefSource.name().toLowerCase(Locale.ROOT));
            }
            if (marketUtmData != null && (str5 = marketUtmData.c) != null) {
                bundle.putString("ad_campaign", str5);
            }
            if (marketUtmData != null && (num = marketUtmData.b) != null) {
                bundle.putInt("ad_campaign_id", num.intValue());
            }
            if (marketUtmData != null && (str4 = marketUtmData.d) != null) {
                bundle.putString("ad_campaign_source", str4);
            }
            if (marketUtmData != null && (str3 = marketUtmData.e) != null) {
                bundle.putString("ad_campaign_content", str3);
            }
            if (marketUtmData != null && (str2 = marketUtmData.f) != null) {
                bundle.putString("ad_campaign_medium", str2);
            }
            if (marketUtmData == null || (str = marketUtmData.g) == null) {
                return;
            }
            bundle.putString("ad_campaign_term", str);
        }
    }

    public static w170 q(w170 w170Var, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = w170Var.a;
        }
        if ((i2 & 2) != 0) {
            z2 = w170Var.b;
        }
        return (z == w170Var.a && z2 == w170Var.b) ? w170Var : new w170(z, z2);
    }

    public static w780 r(int i2, MusicTrack musicTrack) {
        String str = musicTrack.h;
        if (str == null) {
            str = ob50.a(musicTrack);
        }
        String str2 = musicTrack.d;
        if (str.length() > 0 && str2 != null && str2.length() != 0) {
            str = y8g0.f(com.vkontakte.android.R.string.on_media_audio_name_template, str2, str);
        } else if (str.length() <= 0) {
            str = (str2 == null || str2.length() == 0) ? "" : str2;
        }
        int i3 = i2 - 1;
        return new w780(str, y8g0.d(com.vkontakte.android.R.plurals.on_media_tracks_count_plural, i3, Integer.valueOf(i3)));
    }

    public static String s(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i2 = 0; i2 < byteString.size(); i2++) {
            byte c2 = byteString.c(i2);
            if (c2 == 34) {
                sb.append("\\\"");
            } else if (c2 == 39) {
                sb.append("\\'");
            } else if (c2 != 92) {
                switch (c2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (c2 < 32 || c2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c2 >>> 6) & 3) + 48));
                            sb.append((char) (((c2 >>> 3) & 7) + 48));
                            sb.append((char) ((c2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    public static String t(String str, boolean z) {
        String g2 = new Regex((Pattern) eaz.m.getValue()).g(str, "$1");
        if (z) {
            g2 = new Regex((Pattern) eaz.n.getValue()).g(g2, "$2");
        }
        return z23.c("<a href='vkontakte://search/[^']+'>([^<]+)</a>", z23.c("<a href='vklink://view/[^']+'>([^<]+)</a>", z23.c("<a href='vkontakte://profile/-([0-9]+)'>([^<]+)</a>", z23.c("<a href='vkontakte://profile/([0-9]+)'>([^<]+)</a>", g2, "*id$1 ($2)"), "*club$1 ($2)"), "$1"), "$2");
    }

    public static final ArrayList u(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Number) obj).intValue() >= 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean v(ExtendedUserProfile extendedUserProfile) {
        return (extendedUserProfile.m || extendedUserProfile.g() || extendedUserProfile.i0) ? false : true;
    }

    @NonNull
    public static String w(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith(DomExceptionUtils.SEPARATOR) && !str.endsWith(DomExceptionUtils.SEPARATOR) && !str.contains("//")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split(DomExceptionUtils.SEPARATOR, -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb.length() > 0) {
                    sb.append(DomExceptionUtils.SEPARATOR);
                    sb.append(str2);
                } else {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    public static final io.reactivex.rxjava3.core.q x(BaseVkSearchView baseVkSearchView, long j2) {
        gzw.a aVar = new gzw.a(new qno0(baseVkSearchView.getEditView()));
        return j2 > 0 ? aVar.z(j2, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()) : aVar;
    }

    public static /* synthetic */ io.reactivex.rxjava3.core.q y(BaseVkSearchView baseVkSearchView, long j2, int i2) {
        if ((i2 & 1) != 0) {
            j2 = 100;
        }
        return x(baseVkSearchView, j2);
    }

    @Override // xsna.i2n0
    public boolean b() {
        return false;
    }

    @Override // xsna.vv60
    public io.reactivex.rxjava3.internal.operators.observable.j1 c(vg60 vg60Var) {
        Object obj;
        NewsfeedGetDzenFeedIntentDto newsfeedGetDzenFeedIntentDto;
        tfx tfxVar;
        String str;
        int i2;
        String str2;
        Long l2;
        boolean z;
        ArrayList arrayList;
        tfx tfxVar2;
        NewsfeedGetDzenFeedIntentDto newsfeedGetDzenFeedIntentDto2;
        String str3 = vg60Var.d;
        String str4 = vg60Var.a;
        String str5 = vg60Var.b;
        DiscoverCustomIntent discoverCustomIntent = vg60Var.e;
        Integer num = vg60Var.k;
        gk60 gk60Var = new gk60(str3, str4, str5, discoverCustomIntent, num);
        gk60Var.e = vg60Var.h;
        gk60Var.f = vg60Var.i;
        gk60Var.g = vg60Var.j;
        gk60Var.j = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        gk60Var.h = vg60Var.f;
        JSONObject jSONObject = vg60Var.g;
        gk60Var.i = jSONObject != null ? jSONObject.toString() : null;
        xuo0.a.getClass();
        ajb ajbVar = new ajb(gk60Var, xuo0.a(), 1);
        String str6 = gk60Var.e;
        List O0 = str6 != null ? j5g.O0(drm0.c0(str6, new String[]{StringUtils.COMMA}, 0, 6)) : null;
        String str7 = gk60Var.g;
        Iterator<E> it = NewsfeedGetDzenFeedConnectionTypeDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((NewsfeedGetDzenFeedConnectionTypeDto) obj).j(), com.vk.core.utils.newtork.b.c().b())) {
                break;
            }
        }
        NewsfeedGetDzenFeedConnectionTypeDto newsfeedGetDzenFeedConnectionTypeDto = (NewsfeedGetDzenFeedConnectionTypeDto) obj;
        String a = com.vk.core.utils.newtork.b.c().a();
        String str8 = gk60Var.f;
        DiscoverCustomIntent discoverCustomIntent2 = gk60Var.d;
        if (discoverCustomIntent2 != null) {
            int i3 = hk60.$EnumSwitchMapping$0[discoverCustomIntent2.ordinal()];
            if (i3 == 1) {
                newsfeedGetDzenFeedIntentDto2 = NewsfeedGetDzenFeedIntentDto.PRELOAD;
            } else if (i3 == 2) {
                newsfeedGetDzenFeedIntentDto2 = NewsfeedGetDzenFeedIntentDto.INITIAL;
            } else if (i3 == 3) {
                newsfeedGetDzenFeedIntentDto2 = NewsfeedGetDzenFeedIntentDto.PTR;
            } else if (i3 == 4) {
                newsfeedGetDzenFeedIntentDto2 = NewsfeedGetDzenFeedIntentDto.NEXT_PAGE;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                newsfeedGetDzenFeedIntentDto2 = NewsfeedGetDzenFeedIntentDto.FEED_BLOCK;
            }
            newsfeedGetDzenFeedIntentDto = newsfeedGetDzenFeedIntentDto2;
        } else {
            newsfeedGetDzenFeedIntentDto = null;
        }
        List<BaseUserGroupFieldsDto> list = gw60.a;
        String str9 = gk60Var.h;
        Long l3 = gk60Var.j;
        String str10 = gk60Var.i;
        tfx tfxVar3 = new tfx("newsfeed.getDzenFeed", new rr(23), new bo(27));
        if (num != null) {
            tfxVar3.f(num.intValue(), 0, 50, "count");
        }
        if (str3 != null) {
            tfx.o(tfxVar3, "start_from", str3, 0, 0, 12);
        }
        if (O0 != null) {
            tfxVar3.i("filters", O0);
        }
        if (str7 != null) {
            str = str8;
            i2 = 3;
            z = true;
            l2 = l3;
            str2 = str9;
            tfx.o(tfxVar3, "device_info", str7, 0, 0, 12);
            tfxVar = tfxVar3;
        } else {
            tfxVar = tfxVar3;
            str = str8;
            i2 = 3;
            str2 = str9;
            l2 = l3;
            z = true;
        }
        if (newsfeedGetDzenFeedConnectionTypeDto != null) {
            tfx.o(tfxVar, "connection_type", newsfeedGetDzenFeedConnectionTypeDto.j(), 0, 0, 12);
        }
        tfx tfxVar4 = tfxVar;
        tfx.o(tfxVar4, "connection_subtype", a, 0, 0, 12);
        if (str != null) {
            tfx.o(tfxVar4, "user_options", str, 0, 0, 12);
        }
        if (newsfeedGetDzenFeedIntentDto != null) {
            tfx.o(tfxVar4, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, newsfeedGetDzenFeedIntentDto.i(), 0, 0, 12);
        }
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it2.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar4.i("fields", arrayList);
        }
        if (str2 != null) {
            tfxVar2 = tfxVar4;
            tfx.o(tfxVar2, "track_code", str2, 0, 0, 12);
        } else {
            tfxVar2 = tfxVar4;
        }
        if (l2 != null) {
            tfx.m(tfxVar2, CommonUrlParts.REQUEST_ID, l2.longValue(), 0L, 12);
        }
        if (str10 != null) {
            tfx.o(tfxVar2, "geo_data", str10, 0, 0, 12);
        }
        tfx tfxVar5 = tfxVar2;
        tfxVar5.j("extended", z);
        return rsg0.y0(yfb.z(tfxVar5, ajbVar), null, null, i2).U(new w7(new i0r(11), 28));
    }

    @Override // xsna.o2u0
    public void F2(String str) {
    }

    @Override // xsna.o2u0
    public void a(io.reactivex.rxjava3.disposables.c cVar) {
    }

    @Override // xsna.i2n0
    public void e(boolean z) {
    }

    @Override // xsna.i2n0
    public void onError(Throwable th) {
    }

    @Override // xsna.o2u0
    public void fg(NewsEntry newsEntry, NewsEntry newsEntry2, int i2) {
    }
}
