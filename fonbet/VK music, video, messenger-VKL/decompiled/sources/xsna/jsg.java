package xsna;

import android.content.Context;
import android.util.Size;
import com.unity3d.ads.BuildConfig;
import com.vk.community.design.view.avatar.CommunityProfileAvatarViewContainer;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.tags.Tag;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import xsna.drz;
import xsna.efc0;
import xsna.fmc0;
import xsna.ikv0;
import xsna.ksg;
import xsna.l3h;
import xsna.nh60;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jsg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jsg(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.yzs] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        fmc0.p e;
        switch (this.b) {
            case 0:
                ksg ksgVar = (ksg) this.c;
                l3h.a aVar = (l3h.a) this.d;
                CommunityProfileAvatarViewContainer communityProfileAvatarViewContainer = (CommunityProfileAvatarViewContainer) this.e;
                UserId userId = (UserId) this.f;
                ksgVar.c.invoke();
                boolean z = aVar.h;
                int i = aVar.i;
                if (z) {
                    Context context = communityProfileAvatarViewContainer.getContext();
                    ListBuilder e2 = e43.e();
                    ksg.a.b bVar = ksg.a.b.c;
                    boolean z2 = aVar.h;
                    boolean z3 = aVar.k;
                    p4g.a(bVar, e2, z2);
                    if (aVar.j) {
                        e2.add(ksg.a.c.c);
                    } else if (i == 1) {
                        e2.add(ksg.a.f.c);
                    } else if (i > 1) {
                        e2.add(ksg.a.e.c);
                    }
                    p4g.a(ksg.a.d.c, e2, z3);
                    p4g.a(ksg.a.C3202a.c, e2, z2 && z3);
                    p4g.a(ksg.a.g.c, e2, z2 && !z3);
                    ListBuilder g = e2.g();
                    boolean z4 = g.size() == 1;
                    hsg hsgVar = new hsg(ksgVar, communityProfileAvatarViewContainer, z4, userId);
                    if (!g.isEmpty()) {
                        if (z4) {
                            hsgVar.invoke(j5g.Y(g));
                        } else {
                            ArrayList arrayList = new ArrayList(c5g.u(g, 10));
                            ListIterator listIterator = g.listIterator(0);
                            while (true) {
                                ListBuilder.a aVar2 = (ListBuilder.a) listIterator;
                                if (aVar2.hasNext()) {
                                    ksg.a aVar3 = (ksg.a) aVar2.next();
                                    arrayList.add(new VkContextMenu.a(context.getString(aVar3.a), dhr0.t.b(aVar3.b, R.attr.vk_ui_icon_primary), null, false, false, new com.vk.movika.sdk.base.logic.processor.actions.e(5, hsgVar, aVar3), 28));
                                } else {
                                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                                    communityProfileAvatarViewContainer.getContext();
                                    e.b bVar2 = new e.b(communityProfileAvatarViewContainer, null, null, l, 6);
                                    bVar2.w = R.layout.ds_internal_context_menu_item;
                                    dhr0.a.getClass();
                                    bVar2.e = dhr0.E();
                                    bVar2.h(arrayList);
                                    bVar2.m = iah0.a(4);
                                    bVar2.l(false);
                                }
                            }
                        }
                    }
                } else if (i > 0) {
                    ksgVar.e.invoke(communityProfileAvatarViewContainer, ksgVar.a, Boolean.FALSE);
                } else {
                    ksgVar.f.invoke(Boolean.FALSE);
                    g2h g2hVar = new g2h(userId);
                    g2hVar.b = "avatar";
                    g2hVar.d = BuildConfig.FLAVOR;
                    g2hVar.a();
                }
                break;
            case 1:
                u0s u0sVar = (u0s) this.c;
                Context context2 = (Context) this.d;
                DialogExt dialogExt = (DialogExt) this.e;
                io.reactivex.rxjava3.disposables.b bVar3 = (io.reactivex.rxjava3.disposables.b) this.f;
                rpm rpmVar = (rpm) ((Map) ((drz.a) obj).a).get(Integer.valueOf(u0sVar.b));
                if (rpmVar != null && (str = rpmVar.b) != null) {
                    edw edwVar = edw.a;
                    int i2 = 2;
                    d66 d66Var = new d66(u0sVar, dialogExt, bVar3, i2);
                    if (edw.c) {
                        tlo0.a aVar4 = tlo0.Companion;
                        String format = String.format(context2.getString(R.string.vkim_folder_dialog_delete_from_folder_toast), Arrays.copyOf(new Object[]{str}, 1));
                        aVar4.getClass();
                        fdw.a(context2, new tlo0.h(format), new tlo0.f(R.string.vkim_cancel), d66Var);
                    } else {
                        ikv0.a aVar5 = new ikv0.a(context2);
                        aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                        aVar5.u = new ikv0.d(String.format(context2.getString(R.string.vkim_folder_dialog_delete_from_folder_toast), Arrays.copyOf(new Object[]{str}, 1)), (String) null, (ikv0.d.a) null, 6);
                        aVar5.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context2.getString(R.string.vkim_cancel), new cqv(d66Var, i2));
                        edw.b(aVar5);
                    }
                    break;
                } else {
                    break;
                }
            case 2:
                nh60 nh60Var = (nh60) this.c;
                og60 og60Var = (og60) this.d;
                krk0 krk0Var = (krk0) this.e;
                bwq bwqVar = (bwq) this.f;
                nh60.a aVar6 = (nh60.a) obj;
                mx6<x960> c = nh60Var.a.c(new vg60(og60Var.a, og60Var.b, og60Var.c, og60Var.d, og60Var.e, og60Var.f, aVar6.a, aVar6.b, aVar6.c, aVar6.d, og60Var.g), krk0Var);
                bwqVar.u(c.c);
                break;
            case 3:
                o2c0 o2c0Var = (o2c0) this.c;
                PostingState.Editing editing = (PostingState.Editing) this.d;
                PhotoTag photoTag = (PhotoTag) this.e;
                Tag tag = (Tag) this.f;
                Throwable th = (Throwable) obj;
                efc0.a aVar7 = o2c0Var.a;
                if (editing.p) {
                    Context context3 = e43.a;
                    e = o2c0.e(new PostingUserMessageText.StringText(j03.g(context3 != null ? context3 : null, th, R.string.error)));
                } else {
                    e = o2c0.e(new PostingUserMessageText.ResText(R.string.posting_common_network_error));
                }
                aVar7.e(e);
                aVar7.a(new eic0(photoTag, tag));
                break;
            default:
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                wh50 wh50Var = (wh50) this.e;
                wh50 wh50Var2 = (wh50) this.f;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, str2);
                qgi0.q(tgi0Var, ((Boolean) wh50Var.getValue()).booleanValue() ? "" : String.format(str3, Arrays.copyOf(new Object[]{Integer.valueOf(((Number) wh50Var2.getValue()).intValue())}, 1)));
                break;
        }
        return s3q0.a;
    }
}
