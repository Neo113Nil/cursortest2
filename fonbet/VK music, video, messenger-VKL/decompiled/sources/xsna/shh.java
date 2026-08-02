package xsna;

import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsTabContentEventsDto;
import com.vk.dto.photo.Photo;
import com.vk.feed.settings.impl.presentation.filtered.tab.b;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class shh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ shh(Photo photo, boolean z, yzs yzsVar) {
        this.b = 2;
        this.d = photo;
        this.c = z;
        this.e = yzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                thh thhVar = (thh) this.d;
                y0q y0qVar = (y0q) this.e;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentEventsDto i = groupsGetContentForTabsResponseDto.i();
                List<GroupsGroupFullDto> d = i != null ? i.d() : null;
                if (d == null) {
                    d = EmptyList.b;
                }
                boolean z = this.c;
                if (z && d.isEmpty()) {
                    thh.v(thhVar, y0qVar, CommunityProfileContentItem.State.EMPTY, null, 4);
                } else {
                    new dqu();
                    Collection collection = y0qVar.j;
                    if (collection == null) {
                        collection = EmptyList.b;
                    }
                    Collection collection2 = collection;
                    List<GroupsGroupFullDto> list = d;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(dqu.a((GroupsGroupFullDto) it.next()));
                    }
                    ArrayList u0 = j5g.u0(arrayList, collection2);
                    GroupsTabContentEventsDto i2 = groupsGetContentForTabsResponseDto.i();
                    boolean f = myc0.f(i2 != null ? i2.e() : null);
                    CommunityProfileContentItem.State state = z ? CommunityProfileContentItem.State.LOADED : y0qVar.o;
                    CommunityProfileContentItem.State state2 = z ? y0qVar.q : CommunityProfileContentItem.State.LOADED;
                    GroupsTabContentEventsDto i3 = groupsGetContentForTabsResponseDto.i();
                    thhVar.q(y0q.i(y0qVar, u0, f, i3 != null ? i3.e() : null, state, state2, 88));
                }
                break;
            case 1:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                ui60 ui60Var = (ui60) this.e;
                cfr cfrVar = (cfr) obj;
                cVar.s(cfrVar.b);
                String str = cfrVar.b;
                cVar.r(!(str == null || str.length() == 0));
                ui60Var.c.a(new b.a(cfrVar, this.c));
                break;
            case 2:
                Photo photo = (Photo) this.d;
                yzs yzsVar = (yzs) this.e;
                zjt<?> zjtVar = (zjt) obj;
                odg0 odg0Var = odg0.a;
                if (photo == null || !photo.Ib()) {
                    odg0Var.getClass();
                    odg0.l(zjtVar);
                    zjtVar.load((String) yzsVar.invoke(photo, Integer.valueOf(zjtVar.getWidth()), Integer.valueOf(zjtVar.getHeight())));
                } else {
                    odg0Var.getClass();
                    odg0Var.k(zjtVar, photo.L, this.c, false, new gd70(photo.y, 22));
                }
                break;
            default:
                final u9j0 u9j0Var = (u9j0) this.d;
                final izs izsVar = (izs) this.e;
                nvy nvyVar = (nvy) obj;
                nvy.c(nvyVar, u9j0Var.a.size(), null, new jai(2092919160, new zzs() { // from class: xsna.c7j0
                    @Override // xsna.zzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int intValue = ((Integer) obj3).intValue();
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                        int intValue2 = ((Integer) obj5).intValue();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= aVar.o(intValue) ? 32 : 16;
                        }
                        if (aVar.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(2092919160, intValue2, -1, "com.vk.video.ui.share.impl.presentation.views.ShareBottomSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShareBottomSheetContent.kt:72)");
                            }
                            d7j0.a(u9j0.this.a.get(intValue), intValue, izsVar, aVar, intValue2 & 112);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true), 6);
                final boolean z2 = this.c;
                nvy.g(nvyVar, null, null, new jai(64664431, new h150(izsVar, z2), true), 3);
                nvy.g(nvyVar, null, null, new jai(103054566, new yzs() { // from class: xsna.x6j0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(103054566, intValue, -1, "com.vk.video.ui.share.impl.presentation.views.ShareBottomSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShareBottomSheetContent.kt:79)");
                            }
                            d7j0.c(0, aVar, izsVar, z2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true), 3);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ shh(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }
}
