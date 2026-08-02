package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.GroupChannelInfo;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockSettings;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.GifWithQueryData;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vk.profile.core.content.ContentTab;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Triple;
import xsna.arh;
import xsna.c5i;
import xsna.xrh;
import xsna.yrh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dq1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dq1(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x040b, code lost:
    
        if (r0 == null) goto L237;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0259  */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String id;
        Hint p;
        ed0 ed0Var;
        csh cshVar;
        String id2;
        Hint hint;
        Hint hint2;
        Hint hint3;
        Hint hint4;
        Hint hint5;
        xrh aVar;
        s3q0 s3q0Var;
        HintId hintId;
        String id3;
        String id4;
        String id5;
        GroupContentTabSetting groupContentTabSetting;
        String str;
        int i = this.b;
        boolean z = false;
        z = false;
        z = false;
        boolean z2 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) obj3;
                cVar.r(!r0.b);
                cVar.q(cVar.k() + cVar.i());
                ((gq1) obj2).f.invoke(((AlbumsRepository.a) obj).a, Boolean.valueOf(z2));
                break;
            case 1:
                arh arhVar = (arh) obj3;
                ContentTab contentTab = (ContentTab) obj2;
                ptk ptkVar = (ptk) obj;
                T t = ptkVar.a;
                boolean z3 = ptkVar.b;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) t;
                bhu bhuVar = arhVar.c;
                ioh iohVar = arhVar.j;
                arh.b bVar = arhVar.e;
                csh cshVar2 = arhVar.a;
                Object obj4 = fo50.A().get(String.valueOf(-cshVar2.a.b));
                Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                if (num != null) {
                    extendedCommunityProfile.E2 = num;
                }
                mzp0 mzp0Var = cshVar2.c;
                if (mzp0Var != null) {
                    mzp0Var.c(z3);
                }
                bVar.h.d(extendedCommunityProfile, z3, false);
                int i2 = extendedCommunityProfile.a1;
                if (i2 == 1 || i2 == 2) {
                    t6g0 t6g0Var = t6g0.b;
                    t6g0.b().h0(bwd0.k(extendedCommunityProfile));
                }
                extendedCommunityProfile.v1 = bVar.f.b(extendedCommunityProfile.a.c, extendedCommunityProfile.v1);
                arhVar.h.invoke(new d.i.c(extendedCommunityProfile, z2));
                arhVar.i.invoke(new d.k(extendedCommunityProfile, false, false, z3));
                arhVar.e(extendedCommunityProfile);
                iohVar.invoke(new CommunityProfileAction.n.b(z3));
                iohVar.invoke(new CommunityProfileAction.a.c(z3));
                arhVar.p.a.invoke(new d.j.z(extendedCommunityProfile));
                if (!z3) {
                    bVar.b.a(extendedCommunityProfile);
                    yrh yrhVar = bVar.d;
                    q7v0 q7v0Var = yrhVar.c;
                    boolean a = w2h.a(extendedCommunityProfile);
                    boolean b = w2h.b(extendedCommunityProfile);
                    GroupChannelInfo groupChannelInfo = extendedCommunityProfile.Y2;
                    boolean z4 = groupChannelInfo != null && groupChannelInfo.b && ((str = groupChannelInfo.d) == null || !(drm0.N(str) ^ true)) && (w2h.e(extendedCommunityProfile) || (fkq0.d(o25.a().o().a) && extendedCommunityProfile.h0 && !extendedCommunityProfile.g0));
                    boolean z5 = extendedCommunityProfile.c3;
                    GroupsPrimaryBlockSettings groupsPrimaryBlockSettings = extendedCommunityProfile.L2;
                    GroupContentTabType groupContentTabType = (groupsPrimaryBlockSettings == null || (groupContentTabSetting = groupsPrimaryBlockSettings.b) == null) ? null : groupContentTabSetting.b;
                    hxg hxgVar = new hxg(a, b, z4, z5, groupContentTabType);
                    GroupContentTabType groupContentTabType2 = groupContentTabType;
                    h7v h7vVar = yrhVar.b;
                    HintId hintId2 = b ? HintId.STORIES_CREATE_ENTRY_POINT_COMMUNITY : null;
                    Hint p2 = (hintId2 == null || (id5 = hintId2.getId()) == null) ? null : h7vVar.p(id5);
                    String id6 = ((a || b) && yrhVar.d.k() == null) ? HintId.GROUP_MANAGED_GROUP.getId() : null;
                    Hint p3 = id6 != null ? h7vVar.p(id6) : null;
                    if (a || b) {
                        ImFeatures imFeatures = ImFeatures.GROUPS_MESSENGER_DISABLED;
                        imFeatures.getClass();
                        if (!com.vk.toggle.b.A.a(imFeatures)) {
                            id2 = HintId.GROUP_COMMUNITY_MESSENGER.getId();
                            Hint p4 = id2 == null ? h7vVar.p(id2) : null;
                            if (z4) {
                                HintId hintId3 = b ? HintId.GROUP_CHANNEL_BANNER : null;
                                if (hintId3 != null) {
                                    hint = h7vVar.p(hintId3.getId());
                                    if (z5) {
                                        hint2 = p4;
                                        hint3 = h7vVar.p(HintId.GROUP_COMMUNITY_ADBLOGGER_OZON_BANNER.getId());
                                    } else {
                                        hint2 = p4;
                                        hint3 = null;
                                    }
                                    if (groupContentTabType2 != null) {
                                        int i3 = yrh.a.$EnumSwitchMapping$0[groupContentTabType2.ordinal()];
                                        hint4 = hint3;
                                        if (i3 == 1 || i3 == 2) {
                                            if (a) {
                                                ComFeatures comFeatures = ComFeatures.COM_PB_GOODS_ALBUMS;
                                                comFeatures.getClass();
                                                hintId = com.vk.toggle.b.A.a(comFeatures) ? HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_ALBUMS_VIEW_SETTINGS_ONBOARDING : HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_GOODS_AND_SERVICES_ONBOARDING;
                                            } else {
                                                hintId = null;
                                            }
                                            if (hintId != null && (id3 = hintId.getId()) != null) {
                                                hint5 = h7vVar.p(id3);
                                                Hint p5 = a ? h7vVar.p(HintId.DONUT_ADMIN_PROMO_ONBOARDING_STEP_1.getId()) : null;
                                                if (hint4 == null) {
                                                    if (hint != null) {
                                                        hint5 = hint;
                                                    } else if (p3 != null) {
                                                        hint5 = p3;
                                                    } else if (hint2 != null) {
                                                        hint5 = hint2;
                                                    } else if (p2 != null) {
                                                        hint5 = p2;
                                                    } else if (hint5 == null) {
                                                        if (p5 != null) {
                                                            hint5 = p5;
                                                        }
                                                    }
                                                    if (hint5 != null) {
                                                        boolean z6 = extendedCommunityProfile.i2 != 0;
                                                        Context context = yrhVar.a;
                                                        String str2 = hint5.b;
                                                        Map<String, String> map = hint5.e;
                                                        String str3 = hint5.c;
                                                        if (epx.f(str2, HintId.STORIES_CREATE_ENTRY_POINT_COMMUNITY.getId())) {
                                                            if (str3 == null) {
                                                                str3 = "";
                                                            }
                                                            aVar = new xrh.d.f(str2, str3);
                                                        } else if (epx.f(str2, HintId.GROUP_CHANNEL_BANNER.getId())) {
                                                            if (str3 == null) {
                                                                str3 = "";
                                                            }
                                                            String str4 = map != null ? map.get("onboarding_banner_button") : null;
                                                            if (str4 == null) {
                                                                str4 = "";
                                                            }
                                                            aVar = new xrh.b.a(str2, str3, str4, iah0.s(context));
                                                        } else {
                                                            boolean z7 = z6;
                                                            if (epx.f(str2, HintId.GROUP_MANAGED_GROUP.getId())) {
                                                                if (str3 == null) {
                                                                    str3 = "";
                                                                }
                                                                String str5 = map != null ? map.get("onboarding_banner_button") : null;
                                                                if (str5 == null) {
                                                                    str5 = "";
                                                                }
                                                                aVar = new xrh.b.C4043b(str2, str3, str5, iah0.s(context));
                                                            } else if (epx.f(str2, HintId.GROUP_COMMUNITY_MESSENGER.getId())) {
                                                                aVar = new xrh.d.a(hint5.b, str3 == null ? "" : str3, CommunityActionTags.ADMIN_MESSAGES, z7 ? VkTooltip$MarkerSize.Size72 : VkTooltip$MarkerSize.Size56, VkTooltip$MarkerStyle.Style6);
                                                            } else {
                                                                HintId hintId4 = HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_GOODS_AND_SERVICES_ONBOARDING;
                                                                if (!epx.f(str2, hintId4.getId()) && !epx.f(str2, HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_ALBUMS_VIEW_SETTINGS_ONBOARDING.getId()) && !epx.f(str2, HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_SERVICES_ONBOARDING.getId())) {
                                                                    if (epx.f(str2, HintId.DONUT_ADMIN_PROMO_ONBOARDING_STEP_1.getId())) {
                                                                        if (str3 == null) {
                                                                            str3 = "";
                                                                        }
                                                                        String str6 = hint5.d;
                                                                        if (str6 == null) {
                                                                            str6 = "";
                                                                        }
                                                                        aVar = new xrh.d.c(str2, str3, str6);
                                                                    }
                                                                    aVar = null;
                                                                } else if (epx.f(str2, hintId4.getId()) || epx.f(str2, HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_SERVICES_ONBOARDING.getId())) {
                                                                    if (str3 == null) {
                                                                        str3 = "";
                                                                    }
                                                                    aVar = new xrh.d.g.a(str2, str3);
                                                                } else {
                                                                    if (epx.f(str2, HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_ALBUMS_VIEW_SETTINGS_ONBOARDING.getId())) {
                                                                        if (str3 == null) {
                                                                            str3 = "";
                                                                        }
                                                                        aVar = new xrh.d.b.a(str2, str3);
                                                                    }
                                                                    aVar = null;
                                                                }
                                                            }
                                                        }
                                                        if (aVar == null) {
                                                            s3q0Var = null;
                                                            break;
                                                        } else {
                                                            yrhVar.e.invoke(new d.m.b(aVar));
                                                            s3q0Var = s3q0.a;
                                                            break;
                                                        }
                                                    }
                                                    if (!((Boolean) yrhVar.g.getValue()).booleanValue() || ((Boolean) yrhVar.h.getValue()).booleanValue()) {
                                                        q7v0Var.init();
                                                        q7v0Var.c(new svd(yrhVar, hxgVar, extendedCommunityProfile, 2));
                                                    }
                                                }
                                                hint5 = null;
                                                if (hint5 != null) {
                                                }
                                                if (!((Boolean) yrhVar.g.getValue()).booleanValue()) {
                                                }
                                                q7v0Var.init();
                                                q7v0Var.c(new svd(yrhVar, hxgVar, extendedCommunityProfile, 2));
                                            }
                                        } else if (i3 == 3) {
                                            HintId hintId5 = a ? HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_SERVICES_ONBOARDING : null;
                                            if (hintId5 != null && (id4 = hintId5.getId()) != null) {
                                                hint5 = h7vVar.p(id4);
                                                if (a) {
                                                }
                                                if (hint4 == null) {
                                                }
                                                hint5 = null;
                                                if (hint5 != null) {
                                                }
                                                if (!((Boolean) yrhVar.g.getValue()).booleanValue()) {
                                                }
                                                q7v0Var.init();
                                                q7v0Var.c(new svd(yrhVar, hxgVar, extendedCommunityProfile, 2));
                                            }
                                        }
                                    } else {
                                        hint4 = hint3;
                                    }
                                    hint5 = null;
                                    if (a) {
                                    }
                                    if (hint4 == null) {
                                    }
                                    hint5 = null;
                                    if (hint5 != null) {
                                    }
                                    if (!((Boolean) yrhVar.g.getValue()).booleanValue()) {
                                    }
                                    q7v0Var.init();
                                    q7v0Var.c(new svd(yrhVar, hxgVar, extendedCommunityProfile, 2));
                                }
                            }
                            hint = null;
                            if (z5) {
                            }
                            if (groupContentTabType2 != null) {
                            }
                            hint5 = null;
                            if (a) {
                            }
                            if (hint4 == null) {
                            }
                            hint5 = null;
                            if (hint5 != null) {
                            }
                            if (!((Boolean) yrhVar.g.getValue()).booleanValue()) {
                            }
                            q7v0Var.init();
                            q7v0Var.c(new svd(yrhVar, hxgVar, extendedCommunityProfile, 2));
                        }
                    }
                    id2 = null;
                    if (id2 == null) {
                    }
                    if (z4) {
                    }
                    hint = null;
                    if (z5) {
                    }
                    if (groupContentTabType2 != null) {
                    }
                    hint5 = null;
                    if (a) {
                    }
                    if (hint4 == null) {
                    }
                    hint5 = null;
                    if (hint5 != null) {
                    }
                    if (!((Boolean) yrhVar.g.getValue()).booleanValue()) {
                    }
                    q7v0Var.init();
                    q7v0Var.c(new svd(yrhVar, hxgVar, extendedCommunityProfile, 2));
                }
                ceh cehVar = bVar.g;
                boolean z8 = extendedCommunityProfile.c3;
                h7v h7vVar2 = cehVar.b;
                if (z8 && (p = h7vVar2.p((id = HintId.GROUP_COMMUNITY_ADBLOGGER_OZON_BANNER.getId()))) != null && h7vVar2.a(id)) {
                    String str7 = p.c;
                    String str8 = p.d;
                    Map<String, String> map2 = p.e;
                    String str9 = map2 != null ? map2.get("link") : null;
                    Triple triple = (str7 == null || str8 == null || str9 == null) ? null : new Triple(str7, str8, str9);
                    if (triple != null) {
                        ed0Var = new ed0(id, (String) triple.d(), (String) triple.g(), (String) triple.h());
                        if (ed0Var != null) {
                            cehVar.d.invoke(new d.c.b(ed0Var));
                        }
                        if (!bwd0.b(extendedCommunityProfile) || extendedCommunityProfile.g() || (!w2h.a(extendedCommunityProfile) && (bwd0.c(extendedCommunityProfile) || bwd0.f(extendedCommunityProfile)))) {
                            cshVar = cshVar2;
                            arhVar.a();
                        } else {
                            cshVar = cshVar2;
                            cih.c(bVar.a, extendedCommunityProfile, null, contentTab, ptkVar.b, 2);
                            if (!z3) {
                                ouh.b(bVar.c, extendedCommunityProfile, null, false, 6);
                            }
                        }
                        if (!z3) {
                            veh vehVar = arhVar.q;
                            vehVar.getClass();
                            CatchUpBanner catchUpBanner = extendedCommunityProfile.v2;
                            if (catchUpBanner != null) {
                                vehVar.b.invoke(new d.j.k(catchUpBanner));
                                vehVar.a.b(rsg0.y0(yfb.x(new zqu().q(fkq0.e(extendedCommunityProfile.a.c), cqm0.a(catchUpBanner.b))), null, null, 3).subscribe(new ueh(new y8(14), 0), new defpackage.p(new qm(11), 18)));
                            }
                        }
                        bVar.e.a(false);
                        arhVar.b(extendedCommunityProfile);
                        if (!epx.f(null, extendedCommunityProfile)) {
                            ((a5i) arhVar.b.c.getValue()).b(new c5i.c(cshVar.a));
                        }
                        break;
                    }
                }
                ed0Var = null;
                if (ed0Var != null) {
                }
                if (bwd0.b(extendedCommunityProfile)) {
                }
                cshVar = cshVar2;
                arhVar.a();
                if (!z3) {
                }
                bVar.e.a(false);
                arhVar.b(extendedCommunityProfile);
                if (!epx.f(null, extendedCommunityProfile)) {
                }
                break;
            case 2:
                zyt zytVar = (zyt) obj2;
                com.vk.lists.c cVar2 = (com.vk.lists.c) obj3;
                VKList vKList = (VKList) obj;
                czt cztVar = zytVar.b;
                cztVar.d = false;
                String j = vKList.j();
                if (j != null && j.length() != 0 && !epx.f(vKList.j(), "0")) {
                    z = true;
                }
                cVar2.r(z);
                cVar2.s(vKList.j());
                ArrayList arrayList = z2 ? new ArrayList() : new ArrayList(cztVar.b.c);
                arrayList.addAll(vKList);
                cztVar.b = GifWithQueryData.zb(cztVar.b, null, j5g.O0(arrayList), 1);
                zytVar.f.invoke(Boolean.FALSE, Boolean.TRUE);
                break;
            case 3:
                w0f0 w0f0Var = (w0f0) obj3;
                wzs wzsVar = (wzs) obj2;
                k0f0 k0f0Var = (k0f0) obj;
                if (z2) {
                    Activity w = bwt0.w(w0f0Var);
                    if (w == null) {
                        w = e3m.h(w0f0Var.getContext());
                    }
                    if (w != null) {
                        wzsVar.invoke(Integer.valueOf(k0f0Var.a), Boolean.valueOf(k0f0Var.d));
                        m5f0 m5f0Var = m5f0.a;
                        boolean z9 = w0f0Var.o;
                        s sVar = new s(19, w0f0Var, k0f0Var);
                        m5f0Var.getClass();
                        m5f0.d(w, z9, sVar);
                    }
                }
                break;
            case 4:
                ((kcl0) ((com.vk.stickers.settings.a) obj3).d.b).V0((StickerStockItem) obj2, z2, new c80(z ? 1 : 0));
                break;
            default:
                pm90 pm90Var = (pm90) obj2;
                dw20 dw20Var = ((y7w0) obj3).b;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                pm90Var.invoke(Boolean.valueOf(!z2));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dq1(arh arhVar, boolean z, ContentTab contentTab) {
        this.b = 1;
        this.d = arhVar;
        this.c = z;
        this.e = contentTab;
    }

    public /* synthetic */ dq1(zyt zytVar, com.vk.lists.c cVar, boolean z) {
        this.b = 2;
        this.e = zytVar;
        this.d = cVar;
        this.c = z;
    }

    public /* synthetic */ dq1(boolean z, w0f0 w0f0Var, wzs wzsVar) {
        this.b = 3;
        this.c = z;
        this.d = w0f0Var;
        this.e = wzsVar;
    }
}
