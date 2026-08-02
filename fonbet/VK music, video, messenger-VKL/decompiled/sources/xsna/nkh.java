package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentPodcastsDto;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.u8m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nkh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nkh(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                okh okhVar = (okh) obj3;
                xkb0 xkb0Var = (xkb0) obj2;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentPodcastsDto p = groupsGetContentForTabsResponseDto.p();
                List<AudioAudioDto> d = p != null ? p.d() : null;
                if (d == null) {
                    d = EmptyList.b;
                }
                if (z && d.isEmpty()) {
                    okh.s(okhVar, xkb0Var, CommunityProfileContentItem.State.EMPTY, null, 4);
                } else {
                    Collection collection = xkb0Var.j;
                    if (collection == null) {
                        collection = EmptyList.b;
                    }
                    Collection collection2 = collection;
                    List<AudioAudioDto> list = d;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(oc4.d((AudioAudioDto) it.next()));
                    }
                    ArrayList u0 = j5g.u0(arrayList, collection2);
                    GroupsTabContentPodcastsDto p2 = groupsGetContentForTabsResponseDto.p();
                    boolean f = myc0.f(p2 != null ? p2.e() : null);
                    CommunityProfileContentItem.State state = z ? CommunityProfileContentItem.State.LOADED : xkb0Var.o;
                    CommunityProfileContentItem.State state2 = z ? xkb0Var.q : CommunityProfileContentItem.State.LOADED;
                    GroupsTabContentPodcastsDto p3 = groupsGetContentForTabsResponseDto.p();
                    okhVar.q(xkb0.i(xkb0Var, u0, f, p3 != null ? p3.e() : null, state, state2, 88));
                }
                return s3q0.a;
            case 1:
                asm asmVar = (asm) obj3;
                DialogExt dialogExt = (DialogExt) obj2;
                io.reactivex.rxjava3.internal.operators.single.j jVar = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(asmVar.b.E(asmVar, new lgm(dialogExt.f, z, ((List) obj).contains(u8m.o0.b), asmVar.i)), new el6(new d50(11, asmVar, dialogExt), 19)), new shd(asmVar, 2));
                int i2 = kwg0.a;
                asmVar.h.b(jVar.subscribe(new iwg0(), new ia(new com.vk.movika.sdk.base.logic.interactor.f(18), 26)));
                return s3q0.a;
            default:
                com.vk.superapp.widget_settings.p004new.b bVar = (com.vk.superapp.widget_settings.p004new.b) obj3;
                String str = (String) obj2;
                boolean z2 = ((BaseBoolIntDto) obj) == BaseBoolIntDto.YES;
                if (!z2) {
                    bVar.r(str, !z);
                }
                return Boolean.valueOf(z2);
        }
    }
}
