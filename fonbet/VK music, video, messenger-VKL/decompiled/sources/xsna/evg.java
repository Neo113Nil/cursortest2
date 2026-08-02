package xsna;

import com.vk.api.generated.groups.dto.GroupsChatDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentChatsDto;
import com.vk.dto.common.data.VKList;
import com.vk.lists.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.t8a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class evg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.vk.lists.c c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ c.k e;

    public /* synthetic */ evg(com.vk.lists.c cVar, c.k kVar, boolean z, int i) {
        this.b = i;
        this.c = cVar;
        this.e = kVar;
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r3;
        List<GroupsChatDto> d;
        switch (this.b) {
            case 0:
                fvg fvgVar = (fvg) this.e;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentChatsDto f = groupsGetContentForTabsResponseDto.f();
                if (f == null || (d = f.d()) == null) {
                    r3 = 0;
                } else {
                    List<GroupsChatDto> list = d;
                    r3 = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r3.add(fai.x((GroupsChatDto) it.next()));
                    }
                }
                if (r3 == 0) {
                    r3 = EmptyList.b;
                }
                GroupsTabContentChatsDto f2 = groupsGetContentForTabsResponseDto.f();
                this.c.s(f2 != null ? f2.e() : null);
                fvgVar.b.lo(new VKList<>((Collection) r3), this.d);
                break;
            default:
                t8a0 t8a0Var = (t8a0) this.e;
                t8a0.a aVar = (t8a0.a) obj;
                boolean z = !aVar.b;
                com.vk.lists.c cVar = this.c;
                cVar.r(z);
                cVar.q(cVar.k() + cVar.i());
                t8a0Var.g.invoke(aVar.a, Boolean.valueOf(this.d));
                break;
        }
        return s3q0.a;
    }
}
