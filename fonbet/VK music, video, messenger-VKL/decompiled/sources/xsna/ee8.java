package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateVideosResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.clips.favorites.impl.ui.folders.renaming.ClipsFavoritesFolderRenamingState;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.log.L;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.wih0;
import xsna.xn50;
import xsna.yj20;

/* compiled from: BroadcastConfigView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ee8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        yj20.c cVar;
        boolean z;
        switch (this.b) {
            case 0:
                Pair pair = (Pair) obj;
                ke8 ke8Var = (ke8) this.receiver;
                View view = ke8Var.n;
                TextView textView = ke8Var.l;
                RecyclerView recyclerView = ke8Var.m;
                Collection collection = (Collection) pair.i();
                String str = (String) pair.j();
                if (collection.size() > 1) {
                    Collection<qvw0> collection2 = collection;
                    ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
                    for (qvw0 qvw0Var : collection2) {
                        arrayList.add(new z590(qvw0Var, epx.f(qvw0Var.getId(), str)));
                    }
                    boolean c = ke8Var.d.c();
                    bwt0.p0(textView, c);
                    bwt0.p0(recyclerView, c);
                    bwt0.p0(view, c);
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    if (adapter == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.vk.voip.ui.broadcast.views.config.OwnerAdapter");
                    }
                    ((n490) adapter).submitList(arrayList);
                } else {
                    bwt0.p0(textView, false);
                    bwt0.p0(recyclerView, false);
                    bwt0.p0(view, false);
                    RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                    if (adapter2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.vk.voip.ui.broadcast.views.config.OwnerAdapter");
                    }
                    ((n490) adapter2).submitList(EmptyList.b);
                }
                return s3q0.a;
            case 1:
                ((e3a) this.receiver).getClass();
                return e3a.c((CatalogCatalogResponseObjectDto) obj);
            case 2:
                ShortVideoGetTemplateVideosResponseDto shortVideoGetTemplateVideosResponseDto = (ShortVideoGetTemplateVideosResponseDto) obj;
                j8d j8dVar = (j8d) this.receiver;
                j8dVar.getClass();
                List<UsersUserFullDto> g = shortVideoGetTemplateVideosResponseDto.g();
                Map map5 = jgp.b;
                if (g != null) {
                    List<UsersUserFullDto> list = g;
                    k2r0 k2r0Var = j8dVar.b;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(k2r0Var.a((UsersUserFullDto) it.next()));
                    }
                    int e = on00.e(c5g.u(arrayList2, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    map = new LinkedHashMap(e);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        map.put(((Owner) next).b, next);
                    }
                } else {
                    map = map5;
                }
                List<GroupsGroupFullDto> d = shortVideoGetTemplateVideosResponseDto.d();
                if (d != null) {
                    List<GroupsGroupFullDto> list2 = d;
                    equ equVar = j8dVar.d;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                    for (GroupsGroupFullDto groupsGroupFullDto : list2) {
                        equVar.getClass();
                        arrayList3.add(equ.a(groupsGroupFullDto));
                    }
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Owner owner = (Owner) it3.next();
                        if (!fkq0.b(owner.b)) {
                            owner = Owner.e(owner, fkq0.e(owner.b), 4194302);
                        }
                        arrayList4.add(owner);
                    }
                    int e2 = on00.e(c5g.u(arrayList4, 10));
                    if (e2 < 16) {
                        e2 = 16;
                    }
                    map2 = new LinkedHashMap(e2);
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        map2.put(((Owner) next2).b, next2);
                    }
                } else {
                    map2 = map5;
                }
                LinkedHashMap n = pn00.n(map, map2);
                List<UsersUserFullDto> g2 = shortVideoGetTemplateVideosResponseDto.g();
                if (g2 != null) {
                    j8dVar.a.getClass();
                    map3 = j2r0.b(g2);
                } else {
                    map3 = map5;
                }
                List<GroupsGroupFullDto> d2 = shortVideoGetTemplateVideosResponseDto.d();
                if (d2 != null) {
                    List<GroupsGroupFullDto> list3 = d2;
                    dqu dquVar = j8dVar.c;
                    ArrayList arrayList5 = new ArrayList(c5g.u(list3, 10));
                    for (GroupsGroupFullDto groupsGroupFullDto2 : list3) {
                        dquVar.getClass();
                        arrayList5.add(dqu.a(groupsGroupFullDto2));
                    }
                    int e3 = on00.e(c5g.u(arrayList5, 10));
                    Map linkedHashMap = new LinkedHashMap(e3 >= 16 ? e3 : 16);
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        Object next3 = it5.next();
                        linkedHashMap.put(((Group) next3).c, next3);
                    }
                    map4 = linkedHashMap;
                } else {
                    map4 = map5;
                }
                List<VideoVideoFullDto> e4 = shortVideoGetTemplateVideosResponseDto.e();
                ArrayList arrayList6 = new ArrayList(c5g.u(e4, 10));
                Iterator<T> it6 = e4.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(new wih0.a(k15.B(ums0.d(ums0.a, (VideoVideoFullDto) it6.next(), n, map3, map4, 16)), null));
                }
                PaginationKey paginationKey = PaginationKey.LoadedFull.b;
                String f = shortVideoGetTemplateVideosResponseDto.f();
                return new qih0(arrayList6, paginationKey, (f == null || f.length() == 0 || f.equals("null")) ? paginationKey : new PaginationKey.Next(f), null, null);
            case 3:
                ((j4e) this.receiver).getClass();
                return Boolean.valueOf(((ClipsFavoritesFolderRenamingState) obj).c != ClipsFavoritesFolderRenamingState.SaveState.None);
            case 4:
                bre breVar = (bre) this.receiver;
                breVar.getClass();
                xn50.a.c(breVar, (zqe) obj);
                return s3q0.a;
            case 5:
                ((iqf) this.receiver).T((ttf) obj);
                return s3q0.a;
            case 6:
                p8k.U((p8k) this.receiver, (Throwable) obj);
                return s3q0.a;
            case 7:
                p3o p3oVar = (p3o) this.receiver;
                p3oVar.getClass();
                xn50.a.c(p3oVar, (i3o) obj);
                return s3q0.a;
            case 8:
                ((z37) this.receiver).b((cro) obj);
                return s3q0.a;
            case 9:
                ((d9w) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 10:
                yj20 yj20Var = (yj20) obj;
                com.vk.method.selector.impl.b bVar = (com.vk.method.selector.impl.b) this.receiver;
                if (yj20Var instanceof yj20.c) {
                    bVar.getClass();
                    cVar = (yj20.c) yj20Var;
                } else {
                    cVar = null;
                }
                if (j5g.P(bVar.l, bVar.f)) {
                    if ((cVar != null ? snr0.a(cVar) : null) == bVar.f) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 11:
                ((vn60) this.receiver).a((r070) obj);
                return s3q0.a;
            case 12:
                ((bn50) this.receiver).b((com.vk.onboardingpromo.impl.ui.entity.a) obj);
                return s3q0.a;
            case 13:
                j03.j(((u4a0) ((f5a0) this.receiver).c).getContext(), (Throwable) obj);
                return s3q0.a;
            case 14:
                ((uzh0) this.receiver).d((View) obj);
                return s3q0.a;
            case 15:
                L.i((Throwable) obj);
                return s3q0.a;
            default:
                ((spj) this.receiver).resumeWith((HealthConnectSdkStatus) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee8(Object obj, int i) {
        super(1, obj, j4e.class, "mapIsSpinnerVisible", "mapIsSpinnerVisible(Lcom/vk/clips/favorites/impl/ui/folders/renaming/ClipsFavoritesFolderRenamingState;)Z", 0);
        this.b = i;
        switch (i) {
            case 8:
                super(1, obj, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                break;
            case 10:
                super(1, obj, com.vk.method.selector.impl.b.class, "removeSelectedVerificationType", "removeSelectedVerificationType(Lcom/vk/method/selector/api/MethodSelectorItem;)Z", 0);
                break;
            case 11:
                super(1, obj, vn60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0);
                break;
            case 15:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
