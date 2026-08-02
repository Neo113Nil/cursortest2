package xsna;

import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.external.action.ClipExternalAction;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.core.tips.Tooltip;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingBlock;
import com.vk.dto.photo.Photo;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.dug0;
import xsna.kb7;
import xsna.q2j;
import xsna.qdd;
import xsna.qie;
import xsna.u8m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class z90 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ z90(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.x D;
        int i;
        int i2;
        int i3 = 10;
        int i4 = 2;
        r5 = 0;
        r5 = 0;
        int i5 = 0;
        int i6 = 1;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!sl2.m.containsKey((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return io.reactivex.rxjava3.core.x.k(list);
                }
                sl2.a.getClass();
                if (arrayList.isEmpty()) {
                    D = io.reactivex.rxjava3.core.x.k(jgp.b);
                } else {
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        final String str = (String) it.next();
                        arrayList2.add(new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.ol2
                            @Override // io.reactivex.rxjava3.functions.n
                            public final Object get() {
                                ojh0 ojh0Var = sl2.e;
                                if (ojh0Var == null) {
                                    ojh0Var = null;
                                }
                                return ojh0Var.c(Uri.parse(str)).K();
                            }
                        }).q(asu0.a.c()).l(new rx0(new zw(str, i6), i4)), new ql2(str, false ? 1 : 0), null));
                    }
                    D = io.reactivex.rxjava3.core.x.D(arrayList2, new xl0(new rl2(false ? 1 : 0), i6));
                }
                return D.l(new ox0(new ns1(list, i4), i4));
            case 2:
                xgx0.a.getClass();
                xgx0.b("Toggle tracking is not implemented for anonymous users.");
                return s3q0.a;
            case 3:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 4:
                return new PhotoAttachment(new Photo((Image) obj));
            case 5:
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, wjk.a(), new GCMParameterSpec(128, (byte[]) obj));
                return cipher;
            case 6:
                return kb7.e.a;
            case 7:
                qgi0.r((tgi0) obj, "clips_grid_footer_empty_title");
                return s3q0.a;
            case 8:
                qgi0.r((tgi0) obj, "CatalogBannerDismiss");
                return s3q0.a;
            case 9:
                return new Pair(EmptyList.b, null);
            case 10:
                return Long.valueOf(((yj30) obj).a);
            case 11:
                return Long.valueOf(((Peer) obj).b);
            case 12:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -4097, 7);
            case 13:
                return ((k7r) obj).getKey().e;
            case 14:
                SdkExternalNpsCondition sdkExternalNpsCondition = (SdkExternalNpsCondition) obj;
                sdkExternalNpsCondition.getClass();
                return Boolean.valueOf(sdkExternalNpsCondition == SdkExternalNpsCondition.CLIP_STARTED || sdkExternalNpsCondition == SdkExternalNpsCondition.CLIP_LIKED || sdkExternalNpsCondition == SdkExternalNpsCondition.CLIP_SHARED || sdkExternalNpsCondition == SdkExternalNpsCondition.CLIP_COMMENTED || sdkExternalNpsCondition == SdkExternalNpsCondition.CLIP_DOWNLOADED);
            case 15:
                ClipExternalAction clipExternalAction = (ClipExternalAction) obj;
                if (clipExternalAction == ClipExternalAction.ShowActionButton.ACTIVE) {
                    return ClipItemPatch.ActionButton.Show.ACTIVE;
                }
                if (clipExternalAction == ClipExternalAction.ShowActionButton.INACTIVE) {
                    return ClipItemPatch.ActionButton.Show.INACTIVE;
                }
                if (!(clipExternalAction instanceof ClipExternalAction.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipExternalAction.a aVar = (ClipExternalAction.a) clipExternalAction;
                return new ClipItemPatch.f(aVar.b, aVar.c);
            case 16:
                return Boolean.valueOf(!(((qdd.c) obj) instanceof qdd.c.d));
            case 17:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    for (qie.a aVar2 : (List) it2.next()) {
                        String r1 = aVar2.a.r1();
                        qie.a aVar3 = (qie.a) linkedHashMap.get(r1);
                        Object[] objArr = aVar3 == null;
                        Object[] objArr2 = (aVar3 instanceof qie.a.C3564a) && (aVar2 instanceof qie.a.b);
                        if (objArr != false || objArr2 != false) {
                            linkedHashMap.put(r1, aVar2);
                        }
                    }
                }
                return j5g.O0(linkedHashMap.values());
            case 18:
                return Boolean.valueOf(((dug0.c) obj).c());
            case 19:
                return Boolean.valueOf(!(((com.vk.photo.editor.features.colorgrading.a) obj).a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            case 20:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 21:
                abg0 abg0Var = dhr0.t;
                return new Tooltip.f(abg0Var.c(R.attr.vk_ui_background_contrast_inverse), Integer.valueOf(abg0Var.c(R.attr.vk_ui_text_contrast)), null, 48, null, cn70.b(-6), 32505721);
            case 22:
                return Boolean.valueOf(((GroupCreationOnboardingBlock.Option) obj).h);
            case 23:
                csi0.e((nvy) obj, e43.l(new esi0("1", "Service section 1", true, e43.l(new zni0(0L, csi0.d()), new zni0(1L, csi0.d()), new zni0(2L, csi0.d()))), new esi0("2", "Service section 2", false, e43.l(new zni0(0L, csi0.d()), new zni0(1L, csi0.d()), new zni0(2L, csi0.d())))), false, true, false, null, new am0(27));
                return s3q0.a;
            case 24:
                q2j.c cVar = (q2j.c) obj;
                if (cVar.d && (i = cVar.c) > 0 && (i2 = cVar.b) > 0) {
                    if (i2 < i) {
                        i5 = 1;
                    } else {
                        i5 = i2 / i;
                        if (i2 % i > 0) {
                            i5++;
                        }
                    }
                }
                return Integer.valueOf(i5);
            case 25:
                qgi0.r((tgi0) obj, "errorImage");
                return s3q0.a;
            case 26:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj;
                LinkedHashMap linkedHashMap3 = DialogActionsListView.j;
                DialogActionsListView.b bVar = new DialogActionsListView.b();
                u8m.g0 g0Var = u8m.g0.b;
                bVar.b = g0Var;
                int i7 = 17;
                bVar.c = new gv3(i7);
                int i8 = 21;
                bVar.d = new oa(i8);
                s3q0 s3q0Var = s3q0.a;
                linkedHashMap2.put(g0Var, bVar);
                DialogActionsListView.b bVar2 = new DialogActionsListView.b();
                u8m.f0 f0Var = u8m.f0.b;
                bVar2.b = f0Var;
                bVar2.c = new rl2(i7);
                int i9 = 19;
                bVar2.d = new ci7(i9);
                linkedHashMap2.put(f0Var, bVar2);
                DialogActionsListView.b bVar3 = new DialogActionsListView.b();
                u8m.x xVar = u8m.x.b;
                bVar3.b = xVar;
                int i10 = 23;
                bVar3.c = new a60(i10);
                int i11 = 18;
                bVar3.d = new qm0(i11);
                linkedHashMap2.put(xVar, bVar3);
                DialogActionsListView.b bVar4 = new DialogActionsListView.b();
                u8m.v vVar = u8m.v.b;
                bVar4.b = vVar;
                bVar4.c = new com.vk.movika.sdk.base.logic.interactor.f(i7);
                bVar4.d = new l8k(i6);
                linkedHashMap2.put(vVar, bVar4);
                DialogActionsListView.b bVar5 = new DialogActionsListView.b();
                u8m.w wVar = u8m.w.b;
                bVar5.b = wVar;
                int i12 = 25;
                bVar5.c = new pt(i12);
                bVar5.d = new qt(24);
                linkedHashMap2.put(wVar, bVar5);
                DialogActionsListView.b bVar6 = new DialogActionsListView.b();
                u8m.y yVar = u8m.y.b;
                bVar6.b = yVar;
                bVar6.c = new ak(20);
                bVar6.d = new c2(26);
                linkedHashMap2.put(yVar, bVar6);
                DialogActionsListView.b bVar7 = new DialogActionsListView.b();
                u8m.m mVar = u8m.m.b;
                bVar7.b = mVar;
                bVar7.c = new x90(13);
                bVar7.d = new y90(i10);
                linkedHashMap2.put(mVar, bVar7);
                DialogActionsListView.b bVar8 = new DialogActionsListView.b();
                u8m.b0 b0Var = u8m.b0.b;
                bVar8.b = b0Var;
                bVar8.c = new x4(28);
                bVar8.d = new dh5(i7);
                linkedHashMap2.put(b0Var, bVar8);
                DialogActionsListView.b bVar9 = new DialogActionsListView.b();
                u8m.c0 c0Var = u8m.c0.b;
                bVar9.b = c0Var;
                int i13 = 29;
                bVar9.c = new db(i13);
                bVar9.d = new ot(i9);
                linkedHashMap2.put(c0Var, bVar9);
                DialogActionsListView.b bVar10 = new DialogActionsListView.b();
                u8m.p0 p0Var = u8m.p0.b;
                bVar10.b = p0Var;
                bVar10.c = new xx0(i13);
                bVar10.d = new d0k(4);
                linkedHashMap2.put(p0Var, bVar10);
                DialogActionsListView.b bVar11 = new DialogActionsListView.b();
                u8m.q0 q0Var = u8m.q0.b;
                bVar11.b = q0Var;
                bVar11.c = new d37(i3);
                bVar11.d = new y8m(false ? 1 : 0);
                linkedHashMap2.put(q0Var, bVar11);
                DialogActionsListView.b bVar12 = new DialogActionsListView.b();
                u8m.c cVar2 = u8m.c.b;
                bVar12.b = cVar2;
                bVar12.c = new cj1(i11);
                bVar12.d = new dj1(i12);
                linkedHashMap2.put(cVar2, bVar12);
                DialogActionsListView.b bVar13 = new DialogActionsListView.b();
                u8m.t0 t0Var = u8m.t0.b;
                bVar13.b = t0Var;
                bVar13.c = new yy(22);
                int i14 = 16;
                bVar13.d = new oc0(i14);
                linkedHashMap2.put(t0Var, bVar13);
                DialogActionsListView.b bVar14 = new DialogActionsListView.b();
                u8m.b bVar15 = u8m.b.b;
                bVar14.b = bVar15;
                bVar14.c = new sm0(i14);
                bVar14.d = new jr3(12);
                linkedHashMap2.put(bVar15, bVar14);
                DialogActionsListView.b bVar16 = new DialogActionsListView.b();
                u8m.n0 n0Var = u8m.n0.b;
                bVar16.b = n0Var;
                bVar16.c = new ve0(i8);
                bVar16.d = new nj(i7);
                linkedHashMap2.put(n0Var, bVar16);
                return s3q0.a;
            case 27:
                return ((x960) obj).a();
            case 28:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.LOADING_PAGINATION, 0, false, false, 59);
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ z90(m57 m57Var) {
        this.b = 5;
    }
}
