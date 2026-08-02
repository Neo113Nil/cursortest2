package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.ApiApplicationAdType;
import com.vk.dto.common.data.CatalogBanner;
import com.vk.dto.common.data.FriendsUseApp;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebAppPlaceholderInfo;
import com.vk.external.miniapp.net.app.WebAppSplashScreen;
import com.vk.external.miniapp.net.app.WebCatalogBanner;
import com.vk.external.miniapp.net.app.WebFriendsUseApp;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.external.miniapp.net.app.WebLegalInfo;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.external.miniapp.net.app.WebRights;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WebObjectsMapper.kt */
/* loaded from: classes18.dex */
public final class chx0 {

    /* compiled from: WebObjectsMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdvertisementType.values().length];
            try {
                iArr[AdvertisementType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementType.MULTI_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertisementType.REWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiApplicationAdType.values().length];
            try {
                iArr2[ApiApplicationAdType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiApplicationAdType.MULTI_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiApplicationAdType.REWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Image a(WebImage webImage) {
        List<WebImageSize> list = webImage.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (WebImageSize webImageSize : list) {
            arrayList.add(new ImageSize(webImageSize.b, webImageSize.d, webImageSize.c, webImageSize.g, webImageSize.e, webImageSize.f));
        }
        return new Image(arrayList);
    }

    public static final ApiApplication b(WebApiApplication webApiApplication) {
        ArrayList arrayList;
        ApiApplicationAdType apiApplicationAdType;
        ApiApplication apiApplication = new ApiApplication();
        apiApplication.b = new UserId(webApiApplication.b);
        apiApplication.c = webApiApplication.c;
        apiApplication.d = new Photo(a(webApiApplication.d.b));
        apiApplication.e = webApiApplication.e;
        apiApplication.f = webApiApplication.f;
        apiApplication.g = webApiApplication.g;
        apiApplication.h = webApiApplication.h;
        apiApplication.i = webApiApplication.i;
        apiApplication.j = webApiApplication.j;
        apiApplication.k = webApiApplication.k;
        apiApplication.l = webApiApplication.l;
        apiApplication.m = webApiApplication.m;
        apiApplication.n = webApiApplication.n;
        apiApplication.o = webApiApplication.o;
        apiApplication.p = webApiApplication.p;
        apiApplication.u = new UserId(webApiApplication.q);
        apiApplication.v = webApiApplication.r;
        apiApplication.r = webApiApplication.s;
        apiApplication.s = webApiApplication.t;
        apiApplication.x = webApiApplication.u;
        apiApplication.z = webApiApplication.v;
        apiApplication.B = webApiApplication.w;
        apiApplication.C = webApiApplication.x;
        apiApplication.F = webApiApplication.y;
        apiApplication.G = webApiApplication.D;
        apiApplication.I = new UserId(webApiApplication.z);
        apiApplication.K = webApiApplication.B;
        apiApplication.J = webApiApplication.A;
        apiApplication.L = webApiApplication.E;
        WebCatalogBanner webCatalogBanner = webApiApplication.G;
        ArrayList<Photo> arrayList2 = null;
        apiApplication.E = webCatalogBanner != null ? new CatalogBanner(webCatalogBanner.b, webCatalogBanner.c, webCatalogBanner.d, webCatalogBanner.e, webCatalogBanner.f) : null;
        apiApplication.M = webApiApplication.F;
        apiApplication.N = webApiApplication.H;
        apiApplication.A = webApiApplication.I;
        apiApplication.O = webApiApplication.J;
        List<AdvertisementType> list = webApiApplication.K;
        if (list != null) {
            List<AdvertisementType> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                int i = a.$EnumSwitchMapping$0[((AdvertisementType) it.next()).ordinal()];
                if (i == 1) {
                    apiApplicationAdType = ApiApplicationAdType.INTERSTITIAL;
                } else if (i == 2) {
                    apiApplicationAdType = ApiApplicationAdType.MULTI_INTERSTITIAL;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    apiApplicationAdType = ApiApplicationAdType.REWARD;
                }
                arrayList.add(apiApplicationAdType);
            }
        } else {
            arrayList = null;
        }
        apiApplication.P = arrayList;
        WebFriendsUseApp webFriendsUseApp = webApiApplication.L;
        apiApplication.Q = webFriendsUseApp != null ? new FriendsUseApp(webFriendsUseApp.b, webFriendsUseApp.c) : null;
        apiApplication.H = webApiApplication.C;
        apiApplication.R = webApiApplication.M;
        apiApplication.S = webApiApplication.N;
        apiApplication.T = webApiApplication.O;
        apiApplication.U = webApiApplication.P;
        apiApplication.V = webApiApplication.Q;
        apiApplication.W = webApiApplication.R;
        apiApplication.X = webApiApplication.S;
        apiApplication.Y = webApiApplication.T;
        apiApplication.Z = webApiApplication.U;
        apiApplication.a0 = webApiApplication.V;
        apiApplication.b0 = webApiApplication.W;
        apiApplication.c0 = Boolean.valueOf(webApiApplication.X);
        apiApplication.d0 = webApiApplication.Y;
        apiApplication.e0 = Boolean.valueOf(webApiApplication.Z);
        apiApplication.f0 = Boolean.valueOf(webApiApplication.a0);
        apiApplication.g0 = webApiApplication.b0;
        apiApplication.h0 = webApiApplication.c0;
        apiApplication.i0 = webApiApplication.d0;
        List<WebPhoto> list3 = webApiApplication.e0;
        if (list3 != null) {
            List<WebPhoto> list4 = list3;
            ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new Photo(a(((WebPhoto) it2.next()).b)));
            }
            arrayList2 = p4g.q(arrayList3);
        }
        apiApplication.t = arrayList2;
        return apiApplication;
    }

    public static final WebApiApplication c(ApiApplication apiApplication) {
        boolean z;
        WebCatalogBanner webCatalogBanner;
        ArrayList arrayList;
        WebFriendsUseApp webFriendsUseApp;
        AdvertisementType advertisementType;
        long j = apiApplication.b.b;
        String str = apiApplication.c;
        WebPhoto d = d(apiApplication.d);
        String str2 = apiApplication.e;
        String str3 = apiApplication.f;
        String str4 = apiApplication.g;
        String str5 = apiApplication.h;
        int i = apiApplication.i;
        int i2 = apiApplication.j;
        String str6 = apiApplication.k;
        String str7 = apiApplication.l;
        int i3 = apiApplication.m;
        String str8 = apiApplication.n;
        String str9 = apiApplication.o;
        boolean z2 = apiApplication.p;
        long j2 = apiApplication.u.b;
        boolean z3 = apiApplication.v;
        boolean z4 = apiApplication.r;
        boolean z5 = apiApplication.s;
        boolean z6 = apiApplication.x;
        int i4 = apiApplication.z;
        String str10 = apiApplication.B;
        String str11 = apiApplication.C;
        int i5 = apiApplication.F;
        long j3 = apiApplication.I.b;
        boolean z7 = apiApplication.K;
        boolean z8 = apiApplication.J;
        String str12 = apiApplication.G;
        String str13 = apiApplication.H;
        String str14 = apiApplication.L;
        Integer num = apiApplication.M;
        CatalogBanner catalogBanner = apiApplication.E;
        ArrayList arrayList2 = null;
        if (catalogBanner != null) {
            z = z8;
            webCatalogBanner = new WebCatalogBanner(catalogBanner.b, catalogBanner.c, catalogBanner.d, catalogBanner.e, catalogBanner.f);
        } else {
            z = z8;
            webCatalogBanner = null;
        }
        boolean z9 = apiApplication.N;
        int i6 = apiApplication.A;
        boolean z10 = apiApplication.O;
        ArrayList arrayList3 = apiApplication.P;
        if (arrayList3 != null) {
            arrayList = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                int i7 = a.$EnumSwitchMapping$1[((ApiApplicationAdType) it.next()).ordinal()];
                if (i7 == 1) {
                    advertisementType = AdvertisementType.INTERSTITIAL;
                } else if (i7 == 2) {
                    advertisementType = AdvertisementType.MULTI_INTERSTITIAL;
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    advertisementType = AdvertisementType.REWARD;
                }
                arrayList.add(advertisementType);
            }
        } else {
            arrayList = null;
        }
        FriendsUseApp friendsUseApp = apiApplication.Q;
        WebFriendsUseApp webFriendsUseApp2 = friendsUseApp != null ? new WebFriendsUseApp(friendsUseApp.b, friendsUseApp.c) : null;
        boolean z11 = apiApplication.R;
        boolean z12 = apiApplication.S;
        WebAppSplashScreen webAppSplashScreen = apiApplication.T;
        boolean z13 = apiApplication.U;
        boolean z14 = apiApplication.V;
        Boolean bool = apiApplication.W;
        Boolean bool2 = apiApplication.X;
        WebAppPlaceholderInfo webAppPlaceholderInfo = apiApplication.Y;
        boolean z15 = apiApplication.Z;
        WebAdConfig webAdConfig = apiApplication.a0;
        int i8 = apiApplication.b0;
        Boolean bool3 = apiApplication.c0;
        boolean booleanValue = bool3 != null ? bool3.booleanValue() : false;
        String str15 = apiApplication.d0;
        Boolean bool4 = apiApplication.e0;
        boolean booleanValue2 = bool4 != null ? bool4.booleanValue() : false;
        Boolean bool5 = apiApplication.f0;
        boolean booleanValue3 = bool5 != null ? bool5.booleanValue() : false;
        String str16 = apiApplication.g0;
        WebLegalInfo webLegalInfo = apiApplication.h0;
        List<WebRights> list = apiApplication.i0;
        ArrayList<Photo> arrayList4 = apiApplication.t;
        if (arrayList4 != null) {
            webFriendsUseApp = webFriendsUseApp2;
            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
            Iterator<T> it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(d((Photo) it2.next()));
            }
            arrayList2 = arrayList5;
        } else {
            webFriendsUseApp = webFriendsUseApp2;
        }
        return new WebApiApplication(j, str, d, str2, str3, str4, str5, i, i2, str6, str7, i3, str8, str9, z2, j2, z3, z4, z5, z6, i4, str10, str11, i5, j3, z, z7, str13, str12, str14, num, webCatalogBanner, z9, i6, z10, arrayList, webFriendsUseApp, z11, z12, webAppSplashScreen, z13, z14, bool, bool2, webAppPlaceholderInfo, z15, webAdConfig, i8, booleanValue, str15, booleanValue2, booleanValue3, str16, webLegalInfo, list, arrayList2);
    }

    public static final WebPhoto d(Photo photo) {
        ArrayList arrayList = photo.y.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ImageSize imageSize = (ImageSize) it.next();
            com.vk.dto.common.im.Image image = imageSize.d;
            arrayList2.add(new WebImageSize(image.d, image.c, image.b, imageSize.b, imageSize.c, null, 32, null));
        }
        return new WebPhoto(new WebImage(arrayList2));
    }
}
