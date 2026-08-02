package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.ImageCropData;
import com.vk.dto.photo.Photo;
import com.vk.internal.api.GsonHolder;
import com.vk.newsfeed.api.posting.dto.PostingPrimaryMode;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.data.AdvertisingOrd;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: PublishRepository.kt */
/* loaded from: classes4.dex */
public final class fee0 {
    public final Integer a;

    /* compiled from: PublishRepository.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhotoVideoDisplayMode.values().length];
            try {
                iArr[PhotoVideoDisplayMode.Carousel.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoVideoDisplayMode.Grid.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fee0(Integer num) {
        this.a = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.internal.operators.observable.f0 a(pbe0 pbe0Var) {
        Boolean valueOf;
        Boolean bool;
        PhotoVideoDisplayMode photoVideoDisplayMode;
        String str;
        PostingPrimaryMode postingPrimaryMode;
        List list;
        boolean z;
        Integer num;
        int valueOf2;
        Date date;
        boolean z2;
        boolean z3;
        long j;
        Long valueOf3;
        Integer num2;
        long j2;
        Photo photo;
        PostingPrimaryMode postingPrimaryMode2;
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData;
        List<ImageCropArea> list2;
        u0p u0pVar = pbe0Var.d;
        PhotoVideoDisplayMode photoVideoDisplayMode2 = pbe0Var.m;
        UserId userId = pbe0Var.a;
        boolean z4 = pbe0Var.t;
        boolean z5 = pbe0Var.s;
        boolean z6 = pbe0Var.u;
        u0p u0pVar2 = (u0pVar == null || u0pVar.a <= 0 || (z4 && z6)) ? null : u0pVar;
        boolean z7 = u0pVar2 != null;
        AdditionalSettingsConfiguration additionalSettingsConfiguration = pbe0Var.h;
        boolean b = fkq0.b(userId);
        boolean f = epx.f(pbe0Var.b, userId);
        Boolean bool2 = !b ? null : f ? Boolean.TRUE : Boolean.FALSE;
        if (z7) {
            if (!epx.f(bool2, Boolean.TRUE) || !z6) {
                if (!z6) {
                    valueOf = Boolean.valueOf(z5);
                } else if (additionalSettingsConfiguration != null && additionalSettingsConfiguration.f) {
                    valueOf = Boolean.valueOf(z5);
                }
                bool = valueOf;
            }
            bool = null;
        } else {
            if (b && f) {
                valueOf = Boolean.valueOf(z5);
            } else if (z6) {
                if (additionalSettingsConfiguration != null && additionalSettingsConfiguration.f) {
                    valueOf = Boolean.valueOf(z5);
                }
                bool = null;
            } else {
                valueOf = Boolean.valueOf(z5);
            }
            bool = valueOf;
        }
        AdvertisingOrd advertisingOrd = additionalSettingsConfiguration != null ? additionalSettingsConfiguration.e : null;
        Boolean bool3 = advertisingOrd != null ? advertisingOrd.c : null;
        boolean z8 = u0pVar2 != null && u0pVar2.b && epx.f(bool3, Boolean.TRUE) && !(advertisingOrd != null ? advertisingOrd.e : false);
        boolean z9 = (z7 || bool3 == null) ? false : true;
        if (photoVideoDisplayMode2 == PhotoVideoDisplayMode.Grid || (photoVideoAttachmentsCropData = pbe0Var.n) == null || (list2 = photoVideoAttachmentsCropData.b) == null) {
            photoVideoDisplayMode = photoVideoDisplayMode2;
            str = null;
        } else {
            List<ImageCropArea> list3 = list2;
            photoVideoDisplayMode = photoVideoDisplayMode2;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
                ImageCropArea imageCropArea = (ImageCropArea) it.next();
                arrayList.add(new ImageCropData(imageCropArea.b, imageCropArea.d, imageCropArea.e, imageCropArea.f, imageCropArea.g));
            }
            str = GsonHolder.a().toJson(arrayList);
        }
        int i = photoVideoDisplayMode == null ? -1 : a.$EnumSwitchMapping$0[photoVideoDisplayMode.ordinal()];
        if (i != -1) {
            if (i == 1) {
                postingPrimaryMode2 = PostingPrimaryMode.CAROUSEL;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                postingPrimaryMode2 = PostingPrimaryMode.GRID;
            }
            postingPrimaryMode = postingPrimaryMode2;
        } else {
            postingPrimaryMode = null;
        }
        String str2 = pbe0Var.e;
        if (str2 != null) {
            List c0 = drm0.c0(str2, new String[]{StringUtils.COMMA}, 0, 6);
            list = new ArrayList();
            for (Object obj : c0) {
                if (((String) obj).length() > 0) {
                    list.add(obj);
                }
            }
        } else {
            list = EmptyList.b;
        }
        List<CoauthorDto> list4 = pbe0Var.v;
        ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CoauthorDto) it2.next()).b.b);
        }
        ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
        PrivacyPostType privacyPostType = pbe0Var.l;
        PrivacyPostType.AllDonuts allDonuts = PrivacyPostType.AllDonuts.b;
        if (epx.f(privacyPostType, allDonuts)) {
            z = false;
            valueOf2 = 0;
        } else {
            z = false;
            if (!(privacyPostType instanceof PrivacyPostType.SingleDonutLevel)) {
                num = null;
                if (!epx.f(privacyPostType, allDonuts) || (privacyPostType instanceof PrivacyPostType.SingleDonutLevel)) {
                    date = pbe0Var.r;
                    if (date == null) {
                        z2 = z4;
                        z3 = z5;
                        j = date.getTime() / 1000;
                    } else {
                        z2 = z4;
                        z3 = z5;
                        j = -1;
                    }
                    valueOf3 = Long.valueOf(j);
                } else {
                    z2 = z4;
                    z3 = z5;
                    valueOf3 = null;
                }
                String str3 = (!epx.f(privacyPostType, allDonuts) || (privacyPostType instanceof PrivacyPostType.SingleDonutLevel)) ? pbe0Var.w : null;
                if (u0pVar != null) {
                    int i2 = u0pVar.a;
                    Integer valueOf4 = Integer.valueOf(i2);
                    if (i2 <= 0) {
                        valueOf4 = null;
                    }
                    if (valueOf4 != null && z2 && z6) {
                        num2 = valueOf4;
                        UserId userId2 = pbe0Var.a;
                        String str4 = pbe0Var.c;
                        boolean z10 = (z6 && z3) ? true : z;
                        boolean f2 = epx.f(privacyPostType, PrivacyPostType.FriendsOnly.b);
                        boolean f3 = epx.f(privacyPostType, PrivacyPostType.BestFriends.b);
                        boolean z11 = (additionalSettingsConfiguration != null || additionalSettingsConfiguration.b) ? z : true;
                        boolean z12 = (additionalSettingsConfiguration != null || additionalSettingsConfiguration.d) ? z : true;
                        boolean z13 = pbe0Var.y;
                        j2 = pbe0Var.g;
                        Long valueOf5 = Long.valueOf(j2);
                        if (j2 <= 0) {
                            valueOf5 = null;
                        }
                        Integer valueOf6 = valueOf5 != null ? Integer.valueOf((int) valueOf5.longValue()) : null;
                        int i3 = pbe0Var.f;
                        Integer valueOf7 = i3 > 0 ? Integer.valueOf(i3) : null;
                        PostingLinkDto postingLinkDto = pbe0Var.o;
                        String str5 = postingLinkDto != null ? postingLinkDto.b.g : null;
                        String Cb = (postingLinkDto != null || (photo = postingLinkDto.b.p) == null) ? null : photo.Cb();
                        String str6 = pbe0Var.i;
                        String str7 = pbe0Var.k;
                        String str8 = ((!z9 || z8) && advertisingOrd != null) ? advertisingOrd.b : null;
                        String str9 = ((!z9 || z8) && advertisingOrd != null) ? advertisingOrd.d : null;
                        Boolean valueOf8 = Boolean.valueOf(pbe0Var.q);
                        Integer valueOf9 = u0pVar2 != null ? Integer.valueOf(u0pVar2.a) : null;
                        boolean z14 = pbe0Var.s;
                        boolean z15 = pbe0Var.x;
                        Integer num3 = pbe0Var.j;
                        Boolean bool4 = (!z9 || z8) ? bool3 : null;
                        String str10 = pbe0Var.p;
                        bax0 bax0Var = new bax0(userId2, str4, list, bool2, bool, z10, f2, f3, z11, z12, true, z13, valueOf6, null, null, valueOf7, null, null, str, null, postingPrimaryMode, arrayList3, str5, null, null, Cb, null, str6, str7, null, str8, str9, valueOf8, this.a, valueOf9, z14, null, false, false, z15, num3, num2, bool4, valueOf3, num, str3, null, str10 != null ? (List) GsonHolder.a().fromJson(str10, new gee0().getType()) : null, null, null, null, 629891072, 475248);
                        return rsg0.W(bax0Var.I != null ? new j9x0(bax0Var) : new v9x0(bax0Var), 7);
                    }
                }
                num2 = null;
                UserId userId22 = pbe0Var.a;
                String str42 = pbe0Var.c;
                if (z6) {
                }
                boolean f22 = epx.f(privacyPostType, PrivacyPostType.FriendsOnly.b);
                boolean f32 = epx.f(privacyPostType, PrivacyPostType.BestFriends.b);
                if (additionalSettingsConfiguration != null) {
                }
                if (additionalSettingsConfiguration != null) {
                }
                boolean z132 = pbe0Var.y;
                j2 = pbe0Var.g;
                Long valueOf52 = Long.valueOf(j2);
                if (j2 <= 0) {
                }
                if (valueOf52 != null) {
                }
                int i32 = pbe0Var.f;
                if (i32 > 0) {
                }
                PostingLinkDto postingLinkDto2 = pbe0Var.o;
                if (postingLinkDto2 != null) {
                }
                if (postingLinkDto2 != null) {
                }
                String str62 = pbe0Var.i;
                String str72 = pbe0Var.k;
                if (z9) {
                }
                if (z9) {
                }
                Boolean valueOf82 = Boolean.valueOf(pbe0Var.q);
                if (u0pVar2 != null) {
                }
                boolean z142 = pbe0Var.s;
                boolean z152 = pbe0Var.x;
                Integer num32 = pbe0Var.j;
                if (z9) {
                }
                String str102 = pbe0Var.p;
                bax0 bax0Var2 = new bax0(userId22, str42, list, bool2, bool, z10, f22, f32, z11, z12, true, z132, valueOf6, null, null, valueOf7, null, null, str, null, postingPrimaryMode, arrayList3, str5, null, null, Cb, null, str62, str72, null, str8, str9, valueOf82, this.a, valueOf9, z142, null, false, false, z152, num32, num2, bool4, valueOf3, num, str3, null, str102 != null ? (List) GsonHolder.a().fromJson(str102, new gee0().getType()) : null, null, null, null, 629891072, 475248);
                return rsg0.W(bax0Var2.I != null ? new j9x0(bax0Var2) : new v9x0(bax0Var2), 7);
            }
            DonutLevel donutLevel = ((PrivacyPostType.SingleDonutLevel) privacyPostType).b;
            valueOf2 = Integer.valueOf(donutLevel != null ? donutLevel.b : 0);
        }
        num = valueOf2;
        if (epx.f(privacyPostType, allDonuts)) {
        }
        date = pbe0Var.r;
        if (date == null) {
        }
        valueOf3 = Long.valueOf(j);
        if (epx.f(privacyPostType, allDonuts)) {
        }
        if (u0pVar != null) {
        }
        num2 = null;
        UserId userId222 = pbe0Var.a;
        String str422 = pbe0Var.c;
        if (z6) {
        }
        boolean f222 = epx.f(privacyPostType, PrivacyPostType.FriendsOnly.b);
        boolean f322 = epx.f(privacyPostType, PrivacyPostType.BestFriends.b);
        if (additionalSettingsConfiguration != null) {
        }
        if (additionalSettingsConfiguration != null) {
        }
        boolean z1322 = pbe0Var.y;
        j2 = pbe0Var.g;
        Long valueOf522 = Long.valueOf(j2);
        if (j2 <= 0) {
        }
        if (valueOf522 != null) {
        }
        int i322 = pbe0Var.f;
        if (i322 > 0) {
        }
        PostingLinkDto postingLinkDto22 = pbe0Var.o;
        if (postingLinkDto22 != null) {
        }
        if (postingLinkDto22 != null) {
        }
        String str622 = pbe0Var.i;
        String str722 = pbe0Var.k;
        if (z9) {
        }
        if (z9) {
        }
        Boolean valueOf822 = Boolean.valueOf(pbe0Var.q);
        if (u0pVar2 != null) {
        }
        boolean z1422 = pbe0Var.s;
        boolean z1522 = pbe0Var.x;
        Integer num322 = pbe0Var.j;
        if (z9) {
        }
        String str1022 = pbe0Var.p;
        bax0 bax0Var22 = new bax0(userId222, str422, list, bool2, bool, z10, f222, f322, z11, z12, true, z1322, valueOf6, null, null, valueOf7, null, null, str, null, postingPrimaryMode, arrayList3, str5, null, null, Cb, null, str622, str722, null, str8, str9, valueOf822, this.a, valueOf9, z1422, null, false, false, z1522, num322, num2, bool4, valueOf3, num, str3, null, str1022 != null ? (List) GsonHolder.a().fromJson(str1022, new gee0().getType()) : null, null, null, null, 629891072, 475248);
        return rsg0.W(bax0Var22.I != null ? new j9x0(bax0Var22) : new v9x0(bax0Var22), 7);
    }
}
