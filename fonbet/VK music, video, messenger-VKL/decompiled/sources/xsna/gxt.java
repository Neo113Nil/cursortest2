package xsna;

import com.ironsource.T3;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.wall.dto.WallGetExtendedConnectionTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;

/* compiled from: GetWallWithCountersRequest.kt */
/* loaded from: classes4.dex */
public final class gxt {
    public static final List<BaseUserGroupFieldsDto> g = e43.l(BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.FIRST_NAME_DAT, BaseUserGroupFieldsDto.LAST_NAME_DAT, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.FRIEND_STATUS, BaseUserGroupFieldsDto.FIRST_NAME_GEN, BaseUserGroupFieldsDto.FIRST_NAME_ACC, BaseUserGroupFieldsDto.EMOJI_STATUS, BaseUserGroupFieldsDto.IMAGE_STATUS, BaseUserGroupFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, BaseUserGroupFieldsDto.CAN_MESSAGE, BaseUserGroupFieldsDto.HAS_UNSEEN_STORIES, BaseUserGroupFieldsDto.IS_GOVERNMENT_ORGANIZATION, BaseUserGroupFieldsDto.IS_VERIFIED, BaseUserGroupFieldsDto.LAST_NAME_GEN, BaseUserGroupFieldsDto.DEACTIVATED, BaseUserGroupFieldsDto.URL, BaseUserGroupFieldsDto.TRUST_MARK);
    public final UserId a;
    public final String b;
    public final int c;
    public final WallGetMode d;
    public final String e;
    public final boolean f;

    /* compiled from: GetWallWithCountersRequest.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WallGetMode.values().length];
            try {
                iArr[WallGetMode.OWNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WallGetMode.ARCHIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WallGetMode.DONUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WallGetMode.MAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WallGetMode.ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gxt(UserId userId, String str, int i, WallGetMode wallGetMode, String str2, boolean z) {
        this.a = userId;
        this.b = str;
        this.c = i;
        this.d = wallGetMode;
        this.e = str2;
        this.f = z;
    }

    public final rsg0<WallWithCounters> a(boolean z) {
        return z ? new fxt(yfb.z(c(), new y8(22)), null, b("postponed"), b("drafts"), 2) : yfb.z(c(), new com.vk.movika.sdk.base.logic.interactor.f(28));
    }

    public final hz2 b(String str) {
        return yfb.z(lax0.j(new max0(), this.a, str, 65504), new d4r(4));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tfx c() {
        String str;
        String str2;
        String b;
        WallGetExtendedConnectionTypeDto wallGetExtendedConnectionTypeDto;
        String e;
        String a2;
        UserId userId;
        tfx tfxVar;
        tfx tfxVar2;
        List<BaseUserGroupFieldsDto> list;
        String str3;
        tfx tfxVar3;
        String str4;
        String m;
        boolean z = (!ce60.b.c() || (m = hd60.a().a().m()) == null || m.length() == 0) ? false : true;
        ListBuilder e2 = e43.e();
        if (z) {
            e2.add("ads_applovin");
        }
        if (this.f) {
            e2.add("ads_yandex");
        }
        String[] strArr = (String[]) e2.g().toArray(new String[0]);
        List c0 = drm0.c0(zeq0.d(hd60.a().a1(), (String[]) Arrays.copyOf(strArr, strArr.length)), new String[]{StringUtils.COMMA}, 0, 6);
        int i = a.$EnumSwitchMapping$0[this.d.ordinal()];
        ArrayList arrayList = null;
        if (i == 1) {
            str = "owner";
        } else if (i == 2) {
            str = "archived";
        } else {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = null;
                b = com.vk.core.utils.newtork.b.c().b();
                switch (b.hashCode()) {
                    case -1419358249:
                        if (b.equals(T3.e)) {
                            wallGetExtendedConnectionTypeDto = WallGetExtendedConnectionTypeDto.ETHERNET;
                            break;
                        }
                        wallGetExtendedConnectionTypeDto = WallGetExtendedConnectionTypeDto.OTHER;
                        break;
                    case -1068855134:
                        if (b.equals("mobile")) {
                            wallGetExtendedConnectionTypeDto = WallGetExtendedConnectionTypeDto.MOBILE;
                            break;
                        }
                        wallGetExtendedConnectionTypeDto = WallGetExtendedConnectionTypeDto.OTHER;
                        break;
                    case -284840886:
                        if (b.equals("unknown")) {
                            wallGetExtendedConnectionTypeDto = WallGetExtendedConnectionTypeDto.UNKNOWN;
                            break;
                        }
                        wallGetExtendedConnectionTypeDto = WallGetExtendedConnectionTypeDto.OTHER;
                        break;
                    case 3649301:
                        if (b.equals("wifi")) {
                            wallGetExtendedConnectionTypeDto = WallGetExtendedConnectionTypeDto.WIFI;
                            break;
                        }
                        wallGetExtendedConnectionTypeDto = WallGetExtendedConnectionTypeDto.OTHER;
                        break;
                    default:
                        wallGetExtendedConnectionTypeDto = WallGetExtendedConnectionTypeDto.OTHER;
                        break;
                }
                String a3 = com.vk.core.utils.newtork.b.c().a();
                e = zeq0.e();
                a2 = zeq0.a();
                tfx tfxVar4 = new tfx("wall.get", new yu50(15), new fhv0());
                userId = this.a;
                if (userId == null) {
                    tfxVar = tfxVar4;
                    tfx.n(tfxVar, X3.j.D, userId, 0L, 0L, 12);
                } else {
                    tfxVar = tfxVar4;
                }
                tfx.l(tfxVar, "count", this.c, 0, 0, 8);
                if (str2 == null) {
                    tfx tfxVar5 = tfxVar;
                    tfx.o(tfxVar5, "filter", str2, 0, 0, 12);
                    tfxVar2 = tfxVar5;
                } else {
                    tfxVar2 = tfxVar;
                }
                tfxVar2.j("extended", true);
                list = g;
                if (list != null) {
                    List<BaseUserGroupFieldsDto> list2 = list;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
                    }
                }
                if (arrayList != null) {
                    tfxVar2.i("fields", arrayList);
                }
                str3 = this.e;
                if (str3 == null) {
                    tfxVar3 = tfxVar2;
                    tfx.o(tfxVar3, "ref", str3, 0, 0, 12);
                } else {
                    tfxVar3 = tfxVar2;
                }
                str4 = this.b;
                if (str4 != null) {
                    tfx.o(tfxVar3, "start_from", str4, 0, 0, 12);
                }
                tfx tfxVar6 = tfxVar3;
                tfxVar6.i("filters", c0);
                if (a2 != null) {
                    tfx.o(tfxVar6, "device_info", a2, 0, 0, 12);
                }
                if (wallGetExtendedConnectionTypeDto != null) {
                    tfx.o(tfxVar6, "connection_type", wallGetExtendedConnectionTypeDto.i(), 0, 0, 12);
                }
                tfx.o(tfxVar6, "connection_subtype", a3, 0, 0, 12);
                if (e != null) {
                    tfx.o(tfxVar6, "user_options", e, 0, 0, 12);
                }
                return tfxVar6;
            }
            str = "donut";
        }
        str2 = str;
        b = com.vk.core.utils.newtork.b.c().b();
        switch (b.hashCode()) {
            case -1419358249:
                break;
            case -1068855134:
                break;
            case -284840886:
                break;
            case 3649301:
                break;
        }
        String a32 = com.vk.core.utils.newtork.b.c().a();
        e = zeq0.e();
        a2 = zeq0.a();
        tfx tfxVar42 = new tfx("wall.get", new yu50(15), new fhv0());
        userId = this.a;
        if (userId == null) {
        }
        tfx.l(tfxVar, "count", this.c, 0, 0, 8);
        if (str2 == null) {
        }
        tfxVar2.j("extended", true);
        list = g;
        if (list != null) {
        }
        if (arrayList != null) {
        }
        str3 = this.e;
        if (str3 == null) {
        }
        str4 = this.b;
        if (str4 != null) {
        }
        tfx tfxVar62 = tfxVar3;
        tfxVar62.i("filters", c0);
        if (a2 != null) {
        }
        if (wallGetExtendedConnectionTypeDto != null) {
        }
        tfx.o(tfxVar62, "connection_subtype", a32, 0, 0, 12);
        if (e != null) {
        }
        return tfxVar62;
    }
}
