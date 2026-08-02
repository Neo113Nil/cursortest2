package xsna;

import android.content.Context;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.GroupMarketInfo;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.r95;

/* compiled from: CommunityAuthorHeaderConfigMapper.kt */
/* loaded from: classes5.dex */
public final class asg {
    public final Context a;
    public final sdz b;
    public final zrg c;
    public final x7h d;

    /* compiled from: CommunityAuthorHeaderConfigMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.values().length];
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.POPULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.DOCS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.YCLIENTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.OZON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.DELIVERY_FREE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.DELIVERY_SELF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.DELIVERY_INFO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.DELIVERY_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.DATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.NONE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public asg(Context context, sdz sdzVar) {
        zrg zrgVar = new zrg(context);
        x7h x7hVar = new x7h();
        this.a = context;
        this.b = sdzVar;
        this.c = zrgVar;
        this.d = x7hVar;
    }

    public static List a(ExtendedCommunityProfile extendedCommunityProfile, List list) {
        if (!extendedCommunityProfile.n0) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!drm0.N((String) obj)) {
                arrayList.add(obj);
            }
        }
        List R = j5g.R(arrayList);
        if (R.size() <= 1) {
            String str = extendedCommunityProfile.j;
            if (str == null || drm0.N(str)) {
                str = null;
            }
            if (R.isEmpty()) {
                return str != null ? Collections.singletonList(str) : EmptyList.b;
            }
        }
        return R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v2, types: [xsna.r95$b] */
    /* JADX WARN: Type inference failed for: r5v7, types: [xsna.r95$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List b(r8h r8hVar) {
        String str;
        String str2;
        if (r8hVar == null) {
            return EmptyList.b;
        }
        List<gwh<?, ?>> list = r8hVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gwh gwhVar = (gwh) it.next();
            String str3 = null;
            if (gwhVar instanceof sjw) {
                sjw sjwVar = (sjw) gwhVar;
                String a2 = s8h.a(sjwVar);
                if (a2 != null) {
                    if (drm0.N(a2)) {
                        a2 = null;
                    }
                    if (a2 != null) {
                        String b = s8h.b(sjwVar);
                        if (b != null && !drm0.N(b)) {
                            str3 = b;
                        }
                        str2 = new r95.a(a2, str3, sjwVar.a.b);
                    }
                }
                if (str3 == null) {
                    arrayList.add(str3);
                }
            } else {
                if (!(gwhVar instanceof pqs0)) {
                    throw new NoWhenBranchMatchedException();
                }
                VideoFile videoFile = ((pqs0) gwhVar).a.b;
                lls0 lls0Var = new lls0(videoFile);
                ImageSize Cb = videoFile.e1().Cb(iah0.f().widthPixels, true, false);
                if (Cb != null && (str = Cb.d.d) != null && !drm0.N(str)) {
                    str3 = str;
                }
                str2 = new r95.b(lls0Var, str3, r8hVar.g);
            }
            str3 = str2;
            if (str3 == null) {
            }
        }
        return arrayList;
    }
}
