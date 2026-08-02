package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfilesList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: UserBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class lgq0 {

    /* compiled from: UserBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEARCH_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_UNREAD_REQUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_REQUESTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_REQUESTS_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_SUGGEST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_BIRTHDAYS_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_REQUEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UIBlockProfile a(CatalogBlock catalogBlock, CatalogUserMeta catalogUserMeta, CatalogExtendedData catalogExtendedData, CatalogViewType catalogViewType, nq8 nq8Var) {
        int i;
        UserProfile userProfile = catalogExtendedData.Gb(catalogUserMeta.c).a;
        ArrayList arrayList = null;
        if (userProfile == null) {
            return null;
        }
        bi20 a2 = wh20.a(catalogBlock, catalogExtendedData, nq8Var);
        List<UserId> list = catalogUserMeta.f;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                UserProfile userProfile2 = catalogExtendedData.Gb((UserId) it.next()).a;
                if (userProfile2 != null) {
                    arrayList.add(userProfile2);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList a3 = nq8Var.a(catalogExtendedData, catalogUserMeta.e, a2);
        String str = catalogBlock.k;
        int i2 = catalogUserMeta.g;
        int i3 = 1;
        boolean z = catalogViewType == CatalogViewType.LIST && epx.f(a2.p.getString(TtmlNode.TAG_STYLE), "followers");
        if (z) {
            int i4 = userProfile.v;
            if (i4 == 2) {
                i3 = 0;
            } else if (i4 != 3) {
                i3 = 2;
            }
            i = i3;
        } else {
            i = 0;
        }
        return new UIBlockProfile(a2.a, z ? CatalogViewType.SYNTHETIC_LIST_FOLLOWERS : catalogViewType, a2.c, a2.k, a2.e, a2.j, a2.m, a2.o, catalogUserMeta, userProfile, str, arrayList2, i2, a3, i, null, 32768, null);
    }

    public static final List b(CatalogBlock catalogBlock, ArrayList arrayList, CatalogExtendedData catalogExtendedData, nq8 nq8Var) {
        if (arrayList.isEmpty()) {
            return EmptyList.b;
        }
        if (arrayList.size() == 1) {
            UIBlockProfile a2 = a(catalogBlock, (CatalogUserMeta) arrayList.get(0), catalogExtendedData, CatalogViewType.LIST, nq8Var);
            return a2 != null ? Collections.singletonList(a2) : EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UserProfile userProfile = catalogExtendedData.Gb(((CatalogUserMeta) it.next()).c).a;
            if (userProfile != null) {
                arrayList2.add(userProfile);
            }
        }
        bi20 a3 = wh20.a(catalogBlock, catalogExtendedData, nq8Var);
        return Collections.singletonList(new UIBlockProfilesList(a3.a, a3.d, a3.c, a3.k, a3.e, a3.j, a3.m, a3.o, arrayList, arrayList2, catalogBlock.k, null));
    }
}
