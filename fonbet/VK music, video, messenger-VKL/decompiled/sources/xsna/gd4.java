package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockShimmer;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToAuthor;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ddh;
import xsna.ush;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gd4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.b;
        int i3 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                ((kd4) obj3).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                Clips clips = (Clips) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1395810371, intValue, -1, "com.vk.profile.core.tabs.ui.clips.CommunityProfileContentClipsViewHolder.setupShimmers.<anonymous> (CommunityProfileContentClipsViewHolder.kt:270)");
                    }
                    rrv0.d(null, null, null, null, kai.c(740102968, new yg7(clips, 4), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                ush ushVar = (ush) obj3;
                ush.a aVar2 = (ush.a) obj;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj2;
                l3f l3fVar = ushVar.f;
                List list = aVar2.a;
                if (list == null) {
                    list = EmptyList.b;
                }
                List list2 = list;
                String str = aVar2.c;
                ExtendedUserProfile.b bVar = extendedCommunityProfile.S;
                l3fVar.invoke(new d.n.c.b.a(new ddh.b(list2, bVar != null ? new e11(bVar.a, bVar.b, bVar.c) : null, str, aVar2.d, 6)));
                ushVar.h.invoke(CommunityProfileAction.n.e.f.b);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((f1i) obj3).eo(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                UIBlockList uIBlockList = (UIBlockList) obj;
                boolean z = !((UIBlockGroupFilter) obj3).z.e && fxc0.B().J().L();
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList();
                for (UIBlock uIBlock : arrayList) {
                    if ((uIBlock instanceof UIBlockVideo) || (uIBlock instanceof UIBlockPlaceholder)) {
                        uIBlock = new UIBlockShimmer(com.vk.catalog2.common.dto.api.ui.a.a(sua.l(uIBlock), null, null, CatalogViewType.SYNTHETIC_PLACEHOLDER, CatalogDataType.DATA_SYNTHETIC_LOADING, null, null, 8179), objArr6 == true ? 1 : 0, i3, objArr5 == true ? 1 : 0);
                    } else if (uIBlock instanceof UIBlockActionGoToAuthor) {
                        uIBlock = null;
                    }
                    if (uIBlock != null) {
                        arrayList2.add(uIBlock);
                    }
                }
                if (arrayList2.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = arrayList2.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if ((((UIBlock) it.next()) instanceof UIBlockShimmer) && (i = i + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                if (z) {
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    Iterator it2 = arrayList3.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (i4 < 0) {
                                e43.t();
                                throw null;
                            }
                            if (!(((UIBlock) next) instanceof UIBlockShimmer)) {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                        }
                    }
                    Integer valueOf = i4 == -1 ? null : Integer.valueOf(i4);
                    if (valueOf != null) {
                        int intValue2 = valueOf.intValue();
                        UIBlock uIBlock2 = (UIBlock) arrayList3.get(intValue2);
                        arrayList3.set(intValue2, new UIBlockList(uIBlock2.b, CatalogViewType.LARGE_LIST, CatalogDataType.DATA_SYNTHETIC_SECTION, uIBlock2.f, uIBlock2.g, uIBlock2.h, uIBlock2.Db(), uIBlock2.j, null, null, j5g.u0(j5g.S(arrayList3, intValue2), Collections.singletonList(new UIBlockShimmer(com.vk.catalog2.common.dto.api.ui.a.a(sua.l(uIBlock2), i5s.a(new StringBuilder(), uIBlock2.b, "_goto"), null, CatalogViewType.VIDEO_GO_TO_AUTHOR, CatalogDataType.DATA_SYNTHETIC_LOADING, null, null, 8178), objArr4 == true ? 1 : 0, i3, objArr3 == true ? 1 : 0))), null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, 1071644672, null));
                    }
                    arrayList2 = arrayList3;
                }
                if (i < 5) {
                    ArrayList arrayList4 = new ArrayList(arrayList2);
                    Iterator it3 = arrayList4.iterator();
                    int i5 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (i5 < 0) {
                                e43.t();
                                throw null;
                            }
                            if (!(((UIBlock) next2) instanceof UIBlockShimmer)) {
                                i5++;
                            }
                        } else {
                            i5 = -1;
                        }
                    }
                    Integer valueOf2 = i5 == -1 ? null : Integer.valueOf(i5);
                    if (valueOf2 != null) {
                        int intValue3 = valueOf2.intValue();
                        UIBlock uIBlock3 = (UIBlock) arrayList4.get(intValue3);
                        ArrayList arrayList5 = new ArrayList(5);
                        for (int i6 = 0; i6 < 5; i6++) {
                            arrayList5.add(new UIBlockShimmer(com.vk.catalog2.common.dto.api.ui.a.a(sua.l(uIBlock3), uIBlock3.b + '_' + i6, null, CatalogViewType.SYNTHETIC_PLACEHOLDER, CatalogDataType.DATA_SYNTHETIC_LOADING, null, null, 8178), objArr2 == true ? 1 : 0, i3, objArr == true ? 1 : 0));
                        }
                        arrayList4.set(intValue3, new UIBlockList(uIBlock3.b, CatalogViewType.LARGE_LIST, CatalogDataType.DATA_SYNTHETIC_SECTION, uIBlock3.f, uIBlock3.g, uIBlock3.h, uIBlock3.Db(), uIBlock3.j, null, null, arrayList5, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, 1071644672, null));
                    }
                    arrayList2 = arrayList4;
                }
                return new UIBlockList(uIBlockList, arrayList2);
            case 5:
                ((Integer) obj2).getClass();
                int i7 = InfoModalBottomSheet.g1;
                ((InfoModalBottomSheet) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                vma0.i((rkn0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ gd4(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
