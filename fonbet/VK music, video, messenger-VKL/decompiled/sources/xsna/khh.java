package xsna;

import com.vk.api.generated.docs.dto.DocsDocDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentFilesDto;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.superapp.api.dto.story.WebStoryBox;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class khh implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ khh(lhh lhhVar, sun sunVar, boolean z) {
        this.d = lhhVar;
        this.e = sunVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.List] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                lhh lhhVar = (lhh) this.d;
                sun sunVar = (sun) this.e;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentFilesDto j = groupsGetContentForTabsResponseDto.j();
                List<DocsDocDto> d = j != null ? j.d() : null;
                if (d == null) {
                    d = EmptyList.b;
                }
                boolean z = this.c;
                if (z && d.isEmpty()) {
                    lhh.v(lhhVar, sunVar, CommunityProfileContentItem.State.EMPTY, null, 4);
                } else {
                    Collection collection = sunVar.j;
                    if (collection == null) {
                        collection = EmptyList.b;
                    }
                    Collection collection2 = collection;
                    List<DocsDocDto> list = d;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ao8.k((DocsDocDto) it.next()));
                    }
                    ArrayList u0 = j5g.u0(arrayList, collection2);
                    GroupsTabContentFilesDto j2 = groupsGetContentForTabsResponseDto.j();
                    boolean f = myc0.f(j2 != null ? j2.e() : null);
                    CommunityProfileContentItem.State state = z ? CommunityProfileContentItem.State.LOADED : sunVar.o;
                    CommunityProfileContentItem.State state2 = z ? sunVar.q : CommunityProfileContentItem.State.LOADED;
                    GroupsTabContentFilesDto j3 = groupsGetContentForTabsResponseDto.j();
                    lhhVar.q(sun.i(sunVar, u0, f, j3 != null ? j3.e() : null, state, state2, 88));
                }
                break;
            default:
                u440 u440Var = (u440) this.d;
                ArrayList arrayList2 = u440Var.v;
                di9 di9Var = u440Var.j;
                List<tam0> list2 = (List) obj;
                if (this.c) {
                    arrayList2.clear();
                }
                WebStoryBox webStoryBox = di9Var.x().e;
                if (webStoryBox != null && webStoryBox.Db()) {
                    WebStoryBox webStoryBox2 = di9Var.x().e;
                    ArrayList y = (webStoryBox2 == null || !webStoryBox2.Db()) ? null : di9Var.y();
                    if (y != null && !y.isEmpty()) {
                        for (tam0 tam0Var : list2) {
                            WebStoryBox webStoryBox3 = di9Var.x().e;
                            ArrayList y2 = (webStoryBox3 == null || !webStoryBox3.Db()) ? null : di9Var.y();
                            if (y2 != null) {
                                Iterator it2 = y2.iterator();
                                while (it2.hasNext()) {
                                    tam0Var.h.a(((nov) it2.next()).C0());
                                }
                            }
                        }
                    }
                }
                arrayList2.addAll(list2);
                u440Var.a8(arrayList2.size() - this.e.size());
                ((g440) u440Var.s).og();
                u440Var.c.setShutterPosition(true);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ khh(boolean z, u440 u440Var, List list) {
        this.c = z;
        this.d = u440Var;
        this.e = list;
    }
}
