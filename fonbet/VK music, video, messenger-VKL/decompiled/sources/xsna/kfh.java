package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentAudiosDto;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.profile.ProfilePrivacy$Category;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.cvd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kfh implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kfh(mfh mfhVar, j15 j15Var, boolean z) {
        this.d = mfhVar;
        this.e = j15Var;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        j15 j15Var;
        List list;
        ProfilePrivacy$Category profilePrivacy$Category;
        List<Playlist> list2;
        List list3;
        ProfilePrivacy$Category profilePrivacy$Category2;
        List<MusicTrack> list4;
        switch (this.b) {
            case 0:
                mfh mfhVar = (mfh) this.d;
                j15 j15Var2 = (j15) this.e;
                Pair pair = (Pair) obj;
                it80 it80Var = (it80) pair.i();
                it80 it80Var2 = (it80) pair.j();
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) it80Var.a;
                GroupsTabContentAudiosDto e = groupsGetContentForTabsResponseDto != null ? groupsGetContentForTabsResponseDto.e() : null;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto2 = (GroupsGetContentForTabsResponseDto) it80Var2.a;
                GroupsTabContentAudiosDto e2 = groupsGetContentForTabsResponseDto2 != null ? groupsGetContentForTabsResponseDto2.e() : null;
                if (j15Var2.k.h()) {
                    List<AudioPlaylistDto> d0 = e2 != null ? e2.d0() : null;
                    if (d0 == null || d0.isEmpty()) {
                        cvd0.a aVar = j15Var2.j;
                        List<Playlist> list5 = aVar != null ? aVar.a : null;
                        if (list5 == null || list5.isEmpty()) {
                            mfhVar.t(j15.i(j15Var2, null, CommunityProfileContentItem.ContentType.ITEMS, null, false, false, false, null, null, null, null, 32765), true);
                            break;
                        }
                    }
                }
                boolean z = this.c;
                if (z) {
                    List<AudioAudioDto> d = e != null ? e.d() : null;
                    if (d == null || d.isEmpty()) {
                        List<AudioPlaylistDto> d02 = e2 != null ? e2.d0() : null;
                        if (d02 == null || d02.isEmpty()) {
                            mfh.v(mfhVar, j15Var2, CommunityProfileContentItem.State.EMPTY, null, 4);
                        }
                    }
                }
                j15 i = j15.i(j15Var2, null, null, null, false, false, false, null, null, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
                cvd0.a aVar2 = i.j;
                if (e != null) {
                    ArrayList arrayList = new ArrayList();
                    if (aVar2 != null && (list4 = aVar2.b) != null) {
                        arrayList.addAll(list4);
                    }
                    List<AudioAudioDto> d2 = e.d();
                    if (d2 == null) {
                        d2 = EmptyList.b;
                    }
                    List<AudioAudioDto> list6 = d2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list6, 10));
                    Iterator<T> it = list6.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(oc4.d((AudioAudioDto) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                    if (aVar2 == null || (list3 = aVar2.a) == null) {
                        list3 = EmptyList.b;
                    }
                    if (aVar2 == null || (profilePrivacy$Category2 = aVar2.c) == null) {
                        profilePrivacy$Category2 = ProfilePrivacy$Category.ALL;
                    }
                    i = j15.i(i, new cvd0.a(list3, arrayList, profilePrivacy$Category2), null, null, myc0.f(e.e()) && !arrayList2.isEmpty(), false, false, e.e(), z ? CommunityProfileContentItem.State.LOADED : i.s, z ? i.u : CommunityProfileContentItem.State.LOADED, null, 30134);
                }
                cvd0.a aVar3 = i.j;
                if (e2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    if (aVar3 != null && (list2 = aVar3.a) != null) {
                        arrayList3.addAll(list2);
                    }
                    List<AudioPlaylistDto> d03 = e2.d0();
                    if (d03 == null) {
                        d03 = EmptyList.b;
                    }
                    List<AudioPlaylistDto> list7 = d03;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list7, 10));
                    for (AudioPlaylistDto audioPlaylistDto : list7) {
                        jt4.a.getClass();
                        arrayList4.add(jt4.a(audioPlaylistDto));
                    }
                    arrayList3.addAll(arrayList4);
                    if (aVar3 == null || (list = aVar3.b) == null) {
                        list = EmptyList.b;
                    }
                    if (aVar3 == null || (profilePrivacy$Category = aVar3.c) == null) {
                        profilePrivacy$Category = ProfilePrivacy$Category.ALL;
                    }
                    cvd0.a aVar4 = new cvd0.a(arrayList3, list, profilePrivacy$Category);
                    boolean z2 = !arrayList4.isEmpty() && myc0.f(e2.f());
                    j15Var = i.k.h() ? j15.i(i, aVar4, null, e2.f(), z2, false, false, null, z ? CommunityProfileContentItem.State.LOADED : i.s, z ? i.u : CommunityProfileContentItem.State.LOADED, null, 30194) : j15.i(i, aVar4, null, null, false, z2, false, null, null, null, null, 32750);
                } else {
                    j15Var = i;
                }
                if (z) {
                    CommunityProfileContentItem.ContentType contentType = j15Var.k;
                    cvd0.a aVar5 = j15Var.j;
                    if (contentType.l()) {
                        List<MusicTrack> list8 = aVar5 != null ? aVar5.b : null;
                        if (list8 == null || list8.isEmpty()) {
                            j15Var = j15.i(j15Var, null, CommunityProfileContentItem.ContentType.ALBUMS, null, false, false, false, null, null, null, null, 32765);
                        }
                    }
                    if (contentType.l()) {
                        List<Playlist> list9 = aVar5 != null ? aVar5.a : null;
                        if (list9 == null || list9.isEmpty()) {
                            j15Var = j15.i(j15Var, null, CommunityProfileContentItem.ContentType.ITEMS, null, false, false, false, null, null, null, null, 32765);
                        }
                    }
                    if (contentType.h()) {
                        List<MusicTrack> list10 = aVar5 != null ? aVar5.b : null;
                        if (list10 != null && !list10.isEmpty()) {
                            j15Var = j15.i(j15Var, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, false, null, null, null, null, 32765);
                        }
                    }
                    if (contentType.j()) {
                        List<Playlist> list11 = aVar5 != null ? aVar5.a : null;
                        if (list11 != null && !list11.isEmpty()) {
                            j15Var = j15.i(j15Var, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, false, null, null, null, null, 32765);
                        }
                    }
                }
                mfhVar.c.invoke(new d.f(j15Var));
                break;
            default:
                com.vk.im.ui.components.msg_list.c cVar = (com.vk.im.ui.components.msg_list.c) this.d;
                w8v w8vVar = (w8v) this.e;
                if (this.c) {
                    cVar.getClass();
                    if (w8vVar.b.p()) {
                        jl30 jl30Var = cVar.d;
                        jl30Var.a.c((mdz) jl30Var.j.getValue());
                    }
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kfh(boolean z, com.vk.im.ui.components.msg_list.c cVar, w8v w8vVar) {
        this.c = z;
        this.d = cVar;
        this.e = w8vVar;
    }
}
