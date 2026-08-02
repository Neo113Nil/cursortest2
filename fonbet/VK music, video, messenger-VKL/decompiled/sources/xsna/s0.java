package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoAlbumActionItem;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import com.vk.core.serialize.Serializer;
import com.vk.dto.video.VideoAlbum;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.eda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class s0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        eda.b bVar;
        b0a0 q;
        int i = this.b;
        int i2 = 0;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                t0.a((vh8) obj6, (izs) obj4, (q630) obj5, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                p54.b((b64) obj6, (izs) obj4, (q630) obj5, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 2:
                String str = (String) obj6;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj4;
                CatalogReplacementResponse catalogReplacementResponse = (CatalogReplacementResponse) obj5;
                UIBlockList uIBlockList = (UIBlockList) obj;
                com.vk.lists.c cVar = (com.vk.lists.c) obj2;
                if (drm0.D(str, "/#", false)) {
                    String str2 = (String) drm0.c0(str, new String[]{"/#"}, 0, 6).get(1);
                    Serializer.c<UIBlockList> cVar2 = UIBlockList.CREATOR;
                    uIBlockList = uIBlockList.Qb(str2, null);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((UIBlock) it.next()).b);
                }
                Set S0 = j5g.S0(arrayList2);
                Iterator<T> it2 = uIBlockList.y.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (((UIBlock) obj3) instanceof UIBlockVideo) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                UIBlock uIBlock = (UIBlock) obj3;
                String str3 = uIBlock != null ? uIBlock.b : null;
                if (str3 != null && !linkedHashMap2.containsKey(str3)) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        String str4 = (String) entry.getKey();
                        eda.b bVar2 = (eda.b) entry.getValue();
                        if (!S0.contains(str4)) {
                            ArrayList arrayList3 = bVar2.a;
                            if (!arrayList3.isEmpty()) {
                                Iterator it3 = arrayList3.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    if (((UIBlock) it3.next()) instanceof UIBlockVideo) {
                                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                                    }
                                }
                            }
                        }
                    }
                    Set keySet = linkedHashMap3.keySet();
                    if (keySet.size() == 1 && (bVar = (eda.b) linkedHashMap2.get((String) j5g.X(keySet))) != null) {
                        linkedHashMap2.put(str3, bVar);
                    }
                }
                ArrayList<UIBlock> arrayList4 = new ArrayList<>(uIBlockList.y.size());
                HashSet hashSet = new HashSet(linkedHashMap2.size());
                while (i2 < uIBlockList.y.size()) {
                    String str5 = uIBlockList.y.get(i2).b;
                    if (linkedHashMap2.containsKey(str5)) {
                        while (i2 < uIBlockList.y.size() && epx.f(uIBlockList.y.get(i2).b, str5)) {
                            i2++;
                        }
                        eda.b bVar3 = (eda.b) linkedHashMap2.get(str5);
                        if (bVar3 != null && !hashSet.contains(bVar3)) {
                            arrayList4.addAll(bVar3.a);
                            hashSet.add(bVar3);
                        }
                    } else {
                        arrayList4.add(uIBlockList.y.get(i2));
                        i2++;
                    }
                }
                uIBlockList.y = arrayList4;
                String str6 = catalogReplacementResponse.d;
                uIBlockList.A = str6;
                if (cVar != null) {
                    cVar.s(str6);
                    break;
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((k3c) obj6).i((o9c) obj5, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((qre) obj6).g((gzs) obj4, (gzs) obj5, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((com.vk.profile.community.details.impl.contacts.h) obj6).h((CommunityAddContactsState.ContactField) obj4, (gzs) obj5, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 6:
                ((Integer) obj2).getClass();
                com.vk.profile.community.impl.ui.events.d.c((CommunityEventsState.Content.Items) obj6, (izs) obj4, (q630) obj5, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                VideoCatalogAlbumBottomSheetRedesign.a aVar = (VideoCatalogAlbumBottomSheetRedesign.a) obj6;
                izs izsVar = (izs) obj4;
                gzs gzsVar = (gzs) obj5;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1308676113, intValue, -1, "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign.VideoAlbumBottomSheetScreen.<anonymous>.<anonymous> (VideoCatalogAlbumBottomSheetRedesign.kt:98)");
                    }
                    VideoAlbum videoAlbum = aVar.a;
                    if (aVar.b) {
                        q = hg10.q(VideoAlbumActionItem.COPY_LINK);
                    } else {
                        bpn0 bpn0Var = xg5.a;
                        q = ((cpu) (bpn0Var != null ? bpn0Var : null).getValue()).d(videoAlbum.c) ? sua.p(videoAlbum) ? hg10.q(VideoAlbumActionItem.PLAYLIST_ADD_VIDEO, VideoAlbumActionItem.EDIT_PLAYLIST, VideoAlbumActionItem.SHARE_PLAYLIST, VideoAlbumActionItem.COPY_PLAYLIST_LINK, VideoAlbumActionItem.REMOVE_PLAYLIST) : hg10.q(VideoAlbumActionItem.EDIT_PLAYLIST, VideoAlbumActionItem.SHARE, VideoAlbumActionItem.COPY_LINK, VideoAlbumActionItem.REMOVE_PLAYLIST) : hg10.q(VideoAlbumActionItem.GO_TO_AUTHOR, VideoAlbumActionItem.COPY_LINK, VideoAlbumActionItem.SHARE, videoAlbum.l ? VideoAlbumActionItem.UNSUBSCRIBE : VideoAlbumActionItem.SUBSCRIBE);
                    }
                    String str7 = aVar.d;
                    boolean J = aVar2.J(izsVar) | aVar2.J(gzsVar);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new r5i0(9, izsVar, gzsVar);
                        aVar2.R(x);
                    }
                    t0s0.b(q, str7, (izs) x, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((vmx0) obj6).E(ne7.I(513), (androidx.compose.runtime.a) obj, (List) obj5, (izs) obj4);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ s0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.e = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ s0(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.d = obj2;
        this.c = izsVar;
    }
}
