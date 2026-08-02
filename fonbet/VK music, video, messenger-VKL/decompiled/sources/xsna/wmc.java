package xsna;

import android.content.Context;
import android.view.View;
import com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsFragment;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.DonutSettingsDialogConfig;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.community.PostingSettingsCommunityView;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.user.PostingSettingsUserView;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.wih0;
import xsna.xn50;

/* compiled from: ClipCatalogListSource.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class wmc extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmc(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem$a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.vk.clips.sdk.shared.paging.PaginationKey$Next] */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        ?? r6;
        CatalogBlockDto F;
        Object obj2;
        Integer valueOf;
        Context context;
        String str = null;
        Context context2 = null;
        str = null;
        switch (this.b) {
            case 0:
                CatalogBlockItemsDto catalogBlockItemsDto = (CatalogBlockItemsDto) obj;
                vmc vmcVar = (vmc) this.receiver;
                vmcVar.getClass();
                List<UsersUserFullDto> i2 = catalogBlockItemsDto.i2();
                ?? r7 = jgp.b;
                if (i2 != null) {
                    List<UsersUserFullDto> list = i2;
                    k2r0 k2r0Var = vmcVar.c;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(k2r0Var.a((UsersUserFullDto) it.next()));
                    }
                    int e = on00.e(c5g.u(arrayList, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    linkedHashMap = new LinkedHashMap(e);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        linkedHashMap.put(((Owner) next).b, next);
                    }
                } else {
                    linkedHashMap = r7;
                }
                List<GroupsGroupFullDto> N0 = catalogBlockItemsDto.N0();
                if (N0 != null) {
                    List<GroupsGroupFullDto> list2 = N0;
                    equ equVar = vmcVar.e;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                    for (GroupsGroupFullDto groupsGroupFullDto : list2) {
                        equVar.getClass();
                        arrayList2.add(equ.a(groupsGroupFullDto));
                    }
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Owner owner = (Owner) it3.next();
                        if (!fkq0.b(owner.b)) {
                            owner = Owner.e(owner, fkq0.e(owner.b), 4194302);
                        }
                        arrayList3.add(owner);
                    }
                    int e2 = on00.e(c5g.u(arrayList3, 10));
                    if (e2 < 16) {
                        e2 = 16;
                    }
                    linkedHashMap2 = new LinkedHashMap(e2);
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        linkedHashMap2.put(((Owner) next2).b, next2);
                    }
                } else {
                    linkedHashMap2 = r7;
                }
                LinkedHashMap n = pn00.n(linkedHashMap, linkedHashMap2);
                List<UsersUserFullDto> i22 = catalogBlockItemsDto.i2();
                if (i22 != null) {
                    vmcVar.b.getClass();
                    linkedHashMap3 = j2r0.b(i22);
                } else {
                    linkedHashMap3 = r7;
                }
                List<GroupsGroupFullDto> N02 = catalogBlockItemsDto.N0();
                if (N02 != null) {
                    List<GroupsGroupFullDto> list3 = N02;
                    dqu dquVar = vmcVar.d;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
                    for (GroupsGroupFullDto groupsGroupFullDto2 : list3) {
                        dquVar.getClass();
                        arrayList4.add(dqu.a(groupsGroupFullDto2));
                    }
                    int e3 = on00.e(c5g.u(arrayList4, 10));
                    r7 = new LinkedHashMap(e3 >= 16 ? e3 : 16);
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        Object next3 = it5.next();
                        r7.put(((Group) next3).c, next3);
                    }
                }
                Map map = r7;
                List<VideoVideoFullDto> V2 = catalogBlockItemsDto.V2();
                if (V2 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj3 : V2) {
                        Integer s1 = ((VideoVideoFullDto) obj3).s1();
                        if (s1 == null || s1.intValue() != 0) {
                            arrayList5.add(obj3);
                        }
                    }
                    r6 = new ArrayList(c5g.u(arrayList5, 10));
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        r6.add(new wih0.a(k15.B(ums0.d(ums0.a, (VideoVideoFullDto) it6.next(), n, linkedHashMap3, map, 16)), null));
                    }
                } else {
                    r6 = EmptyList.b;
                }
                List list4 = r6;
                List<VideoVideoFullDto> V22 = catalogBlockItemsDto.V2();
                int size = V22 != null ? V22.size() : 0;
                int size2 = size - list4.size();
                PaginationKey.LoadedFull loadedFull = PaginationKey.LoadedFull.b;
                CatalogBlockDto F2 = catalogBlockItemsDto.F();
                String V1 = F2 != null ? F2.V1() : null;
                PaginationKey.LoadedFull next4 = (V1 == null || V1.length() == 0 || V1.equals("null")) ? loadedFull : new PaginationKey.Next(V1);
                if (!vmcVar.a.a) {
                    catalogBlockItemsDto = null;
                }
                if (catalogBlockItemsDto != null && (F = catalogBlockItemsDto.F()) != null) {
                    str = F.getTitle();
                }
                return new qih0(list4, size, size2, loadedFull, next4, str, null, null);
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 2:
                EasyPromoteSettingsFragment easyPromoteSettingsFragment = (EasyPromoteSettingsFragment) this.receiver;
                easyPromoteSettingsFragment.getClass();
                xn50.a.c(easyPromoteSettingsFragment, (uvo) obj);
                return s3q0.a;
            case 3:
                ((com.vk.metrics.eventtracking.b) this.receiver).q((Throwable) obj);
                return s3q0.a;
            case 4:
                L.i((Throwable) obj);
                return s3q0.a;
            case 5:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 6:
                PostingSettingsCommunityItem postingSettingsCommunityItem = (PostingSettingsCommunityItem) obj;
                PostingSettingsCommunityView.a aVar = ((PostingSettingsCommunityView) this.receiver).c;
                if (aVar != null) {
                    dmc0 dmc0Var = (dmc0) ((cmc0) aVar).c;
                    if (postingSettingsCommunityItem instanceof PostingSettingsCommunityItem.a) {
                        ylc0 ylc0Var = dmc0Var.c;
                        if (ylc0Var != null) {
                            xch b = ylc0Var.b();
                            qdc0 qdc0Var = b.d;
                            boolean z = !qdc0Var.Jc();
                            qdc0Var.ue(z);
                            List<PostingSettingsCommunityItem> list5 = b.g.a;
                            ArrayList arrayList6 = new ArrayList(c5g.u(list5, 10));
                            Iterator it7 = list5.iterator();
                            while (it7.hasNext()) {
                                ?? r3 = (PostingSettingsCommunityItem) it7.next();
                                if (r3 instanceof PostingSettingsCommunityItem.a) {
                                    r3 = PostingSettingsCommunityItem.a.d((PostingSettingsCommunityItem.a) r3, z, false, false, 6);
                                }
                                arrayList6.add(r3);
                            }
                            b.g = new rlc0(arrayList6);
                            b.b();
                        }
                    } else if (postingSettingsCommunityItem instanceof PostingSettingsCommunityItem.b) {
                        ylc0 ylc0Var2 = dmc0Var.c;
                        if (ylc0Var2 != null) {
                            xch b2 = ylc0Var2.b();
                            qdc0 qdc0Var2 = b2.d;
                            DonutSettingsDialogConfig.Mode mode = qdc0Var2.Zg() ? DonutSettingsDialogConfig.Mode.Dones : DonutSettingsDialogConfig.Mode.All;
                            List<PostingSettingsCommunityItem> list6 = b2.g.a;
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj4 : list6) {
                                if (obj4 instanceof PostingSettingsCommunityItem.b) {
                                    arrayList7.add(obj4);
                                }
                            }
                            PostingSettingsCommunityItem.b bVar = (PostingSettingsCommunityItem.b) j5g.a0(arrayList7);
                            if (bVar != null && bVar.f && !qdc0Var2.B6().isEmpty()) {
                                dmc0 dmc0Var2 = b2.a;
                                if (b2.h) {
                                    valueOf = qdc0Var2.Ld();
                                } else {
                                    Integer Ld = qdc0Var2.Ld();
                                    valueOf = Integer.valueOf(Ld != null ? Ld.intValue() : -1);
                                }
                                DonutSettingsDialogConfig donutSettingsDialogConfig = new DonutSettingsDialogConfig(mode, valueOf, qdc0Var2.B6(), bVar.e);
                                PostingSettingsUserView postingSettingsUserView = dmc0Var2.h;
                                if (postingSettingsUserView == null || (context = postingSettingsUserView.getContext()) == null) {
                                    PostingSettingsCommunityView postingSettingsCommunityView = dmc0Var2.i;
                                    if (postingSettingsCommunityView != null) {
                                        context2 = postingSettingsCommunityView.getContext();
                                    }
                                } else {
                                    context2 = context;
                                }
                                if (context2 != null) {
                                    tpc0.a(context2, new q210(context2, donutSettingsDialogConfig, dmc0Var2, 3));
                                }
                                b2.h = false;
                            }
                        }
                    } else if (postingSettingsCommunityItem instanceof PostingSettingsCommunityItem.c) {
                        ylc0 ylc0Var3 = dmc0Var.c;
                        if (ylc0Var3 != null) {
                            xch b3 = ylc0Var3.b();
                            if (b3.d.Um() != null) {
                                dmc0 dmc0Var3 = b3.a;
                                tlc0 tlc0Var = (tlc0) dmc0Var3.e.getValue();
                                PostingSettingsCommunityView postingSettingsCommunityView2 = dmc0Var3.i;
                                if (postingSettingsCommunityView2 != null) {
                                    Iterator it8 = postingSettingsCommunityView2.b.f.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            obj2 = it8.next();
                                            if (((slc0) obj2).m instanceof PostingSettingsCommunityItem.c) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    slc0 slc0Var = (slc0) obj2;
                                    View view = slc0Var != null ? slc0Var.itemView : null;
                                    if (view != null) {
                                        tlc0Var.b(view);
                                    }
                                }
                            } else {
                                b3.c.e(b3.f);
                                ckc0 ckc0Var = b3.e;
                                if (ckc0Var != null) {
                                    ckc0.c(ckc0Var, b3.d.Um(), null, null, 6);
                                }
                            }
                            jbc0 jbc0Var = b3.b;
                            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                            jbc0Var.g();
                        }
                    } else {
                        if (!(postingSettingsCommunityItem instanceof PostingSettingsCommunityItem.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ylc0 ylc0Var4 = dmc0Var.c;
                        if (ylc0Var4 != null) {
                            ylc0Var4.g2();
                        }
                    }
                }
                return s3q0.a;
            case 7:
                StoryStatisticsStickersFragment storyStatisticsStickersFragment = (StoryStatisticsStickersFragment) this.receiver;
                storyStatisticsStickersFragment.getClass();
                xn50.a.c(storyStatisticsStickersFragment, (com.vk.stories.design.view.stats.tabs.stickers.mvi.a) obj);
                return s3q0.a;
            default:
                com.vk.superapp.verification.account.f.k((com.vk.superapp.verification.account.f) this.receiver, (Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmc(Object obj, int i) {
        super(1, obj, com.vk.metrics.eventtracking.b.class, "logOrFail", "logOrFail(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 5:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmc(vmc vmcVar) {
        super(1, vmcVar, vmc.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogBlockItemsDto;)Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;", 0);
        this.b = 0;
    }
}
