package xsna;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.apps.dto.AppsGetTrackBridgeCallHandlersResponseDto;
import com.vk.bridges.ImageViewer;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.core.preference.Preference;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.CanvasStickerDraft;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.f;
import com.vk.libvideo.bottomsheet.about.TopVideoBottomSheetCallback;
import com.vk.libvideo.bottomsheet.about.a;
import com.vk.libvideo.bottomsheet.about.delegate.w;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.superapp.browser.internal.ui.menu.action.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import xsna.b4;
import xsna.b8b;
import xsna.cse;
import xsna.iwa;
import xsna.mwa;
import xsna.nye;
import xsna.uqe;
import xsna.uxd0;
import xsna.wk50;
import xsna.xf8;
import xsna.yf8;
import xsna.z1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class e1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v90, types: [com.vk.im.ui.fragments.ImFragment, xsna.zwb$a] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qvw0 qvw0Var;
        List<CatalogMarketCategoryContext> list;
        String str;
        int i = this.b;
        int i2 = 5;
        r6 = null;
        ArrayList arrayList = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((g1) obj2).j.b(z1.b.a);
                return s3q0.a;
            case 1:
                com.vk.libvideo.bottomsheet.about.a aVar = (com.vk.libvideo.bottomsheet.about.a) obj2;
                bpn0 bpn0Var = aVar.e;
                dw20 dw20Var = aVar.c;
                int i3 = a.C1212a.$EnumSwitchMapping$0[((TopVideoBottomSheetCallback.Action) obj).ordinal()];
                if (i3 == 1) {
                    aVar.d = true;
                    View view = (View) bpn0Var.getValue();
                    if (view != null) {
                        view.setAlpha(1.0f);
                    }
                } else if (i3 == 2) {
                    aVar.d = true;
                    View view2 = (View) bpn0Var.getValue();
                    if (view2 != null) {
                        view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                } else if (i3 == 3) {
                    aVar.d = true;
                    Dialog dialog = dw20Var.s;
                    nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
                    if (nw20Var != null) {
                        nw20Var.Q = null;
                    }
                    dw20Var.dismiss();
                } else if (i3 == 4) {
                    aVar.d = false;
                } else {
                    if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.d = false;
                    Dialog dialog2 = dw20Var.s;
                    nw20 nw20Var2 = dialog2 instanceof nw20 ? (nw20) dialog2 : null;
                    if (nw20Var2 != null) {
                        nw20Var2.Q = null;
                    }
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 2:
                w.a aVar2 = (w.a) obj2;
                noj0 noj0Var = aVar2.v;
                if (noj0Var == null) {
                    return s3q0.a;
                }
                VideoFile videoFile = noj0Var.a;
                if (o25.a().b()) {
                    Set<View> set = g6z.a;
                    ImageView imageView = aVar2.t;
                    g6z.c(imageView, imageView, !videoFile.O9(), true, 48);
                }
                aVar2.l.d(new b4.k0(videoFile));
                return s3q0.a;
            case 3:
                ((fw) obj2).d.c();
                return s3q0.a;
            case 4:
                com.vk.superapp.browser.internal.ui.menu.action.c cVar = (com.vk.superapp.browser.internal.ui.menu.action.c) obj2;
                cVar.p = null;
                cVar.o = null;
                cVar.f();
                n.a aVar3 = cVar.e;
                if (aVar3 != null) {
                    aVar3.b();
                }
                return s3q0.a;
            case 5:
                v70 v70Var = (v70) obj2;
                v70Var.b.invoke((u60) obj);
                dw20 dw20Var2 = v70Var.d;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                v70Var.d = null;
                return s3q0.a;
            case 6:
                frn0 system = ((xgl0) obj).system();
                String str2 = ((jd3) obj2).d;
                system.e(system.n(str2) + 1, str2);
                return s3q0.a;
            case 7:
                qv4 qv4Var = (qv4) obj;
                zlv zlvVar = ((vu4) obj2).u;
                if (zlvVar != null) {
                    zlvVar.b(qv4Var);
                }
                return s3q0.a;
            case 8:
                ((wa6) obj2).Q.a((String) obj, true);
                return s3q0.a;
            case 9:
                ug6 ug6Var = (ug6) obj2;
                int i4 = ug6.j1;
                ug6Var.ao();
                ug6Var.dismiss();
                return s3q0.a;
            case 10:
                List<? extends Photo> list2 = (List) obj;
                ImageViewer.c<Photo> cVar2 = ((BasePhotoListFragment) obj2).c0;
                if (cVar2 != null) {
                    cVar2.c(list2);
                }
                return s3q0.a;
            case 11:
                ((wk50.a) obj2).b(new ClipItemPatch.h(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 12:
                ((Float) obj).floatValue();
                return Float.valueOf(((azl) obj2).I0(64));
            case 13:
                wf8 wf8Var = (wf8) obj2;
                yf8 yf8Var = wf8Var.y.c;
                if (yf8Var != null) {
                    yf8.b bVar = yf8Var instanceof yf8.b ? (yf8.b) yf8Var : null;
                    if (bVar != null && (qvw0Var = bVar.j) != null) {
                        wf8Var.d(new xf8.f(qvw0Var));
                    }
                }
                return s3q0.a;
            case 14:
                j19 j19Var = (j19) obj2;
                long j = j19Var.a;
                AppsGetTrackBridgeCallHandlersResponseDto appsGetTrackBridgeCallHandlersResponseDto = (AppsGetTrackBridgeCallHandlersResponseDto) obj;
                if (appsGetTrackBridgeCallHandlersResponseDto.d()) {
                    j19Var.c = true;
                    Preference.K(j5g.S0(appsGetTrackBridgeCallHandlersResponseDto.e()), "vk_bridge", "vk_app_bridge_call_argument_storage");
                    Preference.F(j, "vk_bridge", "vk_app_bridge_call_argument_last_date");
                } else {
                    Preference.K(EmptySet.b, "vk_bridge", "vk_app_bridge_call_argument_storage");
                    Preference.F(j, "vk_bridge", "vk_app_bridge_call_argument_last_date");
                }
                return s3q0.a;
            case 15:
                n3a n3aVar = (n3a) obj;
                return Boolean.valueOf(!(n3aVar instanceof dgx) || epx.f(((dgx) n3aVar).b, ((lda) obj2).c));
            case 16:
                mwa mwaVar = (mwa) obj2;
                iwa.a aVar4 = (iwa.a) obj;
                return mwa.a.a(mwaVar.a(), aVar4.a, mwaVar.a().c.Ib(aVar4.b), 1);
            case 17:
                ((s7b) obj2).T(b8b.c.b);
                return s3q0.a;
            case 18:
                ((com.vk.channels.impl.list.b) obj2).s().b((Throwable) obj, new d4(i2));
                return s3q0.a;
            case 19:
                com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.c cVar3 = (com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.c) obj2;
                com.vk.im.engine.models.dialogs.Dialog dialog3 = (com.vk.im.engine.models.dialogs.Dialog) ((r480) obj).c.c.get(Long.valueOf(cVar3.f));
                if (dialog3 != null) {
                    cVar3.T(new f.b(dialog3));
                }
                return s3q0.a;
            case 20:
                zwb zwbVar = (zwb) obj2;
                uxd0 uxd0Var = (uxd0) obj;
                if (uxd0Var instanceof uxd0.b) {
                    uxd0.b bVar2 = (uxd0.b) uxd0Var;
                    if (bVar2.b) {
                        Peer peer = bVar2.a;
                        Context context = zwbVar.i;
                        peer.getClass();
                        if (peer.Ab(Peer.Type.GROUP)) {
                            g2v.c().b().J(context, peer);
                        } else {
                            g2v.c().b().R(context);
                        }
                    } else {
                        ?? r12 = zwbVar.k;
                        if (r12 != 0) {
                            r12.J();
                        }
                    }
                } else if (uxd0Var instanceof uxd0.r0) {
                    zwbVar.m.e();
                } else {
                    zwbVar.X0().r(uxd0Var);
                }
                return s3q0.a;
            case 21:
                ((a8c) obj2).getClass();
                a8c.f((tr90) obj);
                return s3q0.a;
            case 22:
                ffc ffcVar = (ffc) obj2;
                int i5 = rec.j1;
                ffcVar.b(ffcVar.e);
                return s3q0.a;
            case 23:
                ClassifiedsCatalogSimpleRootVh classifiedsCatalogSimpleRootVh = (ClassifiedsCatalogSimpleRootVh) obj2;
                mu00 mu00Var = (mu00) obj;
                CatalogMarketFilter catalogMarketFilter = mu00Var.c;
                if (catalogMarketFilter != null) {
                    CatalogMarketCategoryContext.Context context2 = catalogMarketFilter.b;
                }
                CatalogMarketFilter catalogMarketFilter2 = mu00Var.c;
                if (catalogMarketFilter2 != null && (list = catalogMarketFilter2.g) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (CatalogMarketCategoryContext catalogMarketCategoryContext : list) {
                        String h = catalogMarketCategoryContext.b.h();
                        Integer num = catalogMarketCategoryContext.e;
                        Pair pair = num == null ? null : new Pair(h, num);
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    arrayList = arrayList2;
                }
                classifiedsCatalogSimpleRootVh.M = arrayList;
                return s3q0.a;
            case 24:
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) obj;
                ArrayList<List> arrayList3 = ((pdo) obj2).a;
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                for (List list3 : arrayList3) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        CanvasStickerDraft c = v9l0.c((nov) it.next());
                        if (c != null) {
                            arrayList5.add(c);
                        }
                    }
                    arrayList4.add(arrayList5);
                }
                clipsDraftVk.c.b = arrayList4;
                return s3q0.a;
            case 25:
                ClipsEditorVoiceOverRecordButton clipsEditorVoiceOverRecordButton = (ClipsEditorVoiceOverRecordButton) obj2;
                clipsEditorVoiceOverRecordButton.z = false;
                gzs<s3q0> gzsVar = clipsEditorVoiceOverRecordButton.y;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 26:
                return Boolean.valueOf(((eie) obj2).a.get() <= 0);
            case 27:
                ((com.vk.clips.playlists.ui.picker.b) obj2).k.b(new uqe.c(((cse.a.b) obj).a));
                return s3q0.a;
            case 28:
                tgi0 tgi0Var = (tgi0) obj;
                int i6 = nye.d.$EnumSwitchMapping$0[((lvd0) obj2).b.ordinal()];
                if (i6 == 1) {
                    str = "authorClipsRatingCounter";
                } else if (i6 == 2) {
                    str = "authorClipsViewCounter";
                } else if (i6 == 3) {
                    str = "authorClipsSubscriptionCounter";
                } else {
                    if (i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "authorClipsFollowerCounter";
                }
                qgi0.r(tgi0Var, str);
                return s3q0.a;
            default:
                nzg nzgVar = (nzg) obj2;
                pzg pzgVar = (pzg) obj;
                if (pzgVar instanceof ozg) {
                    ((d0i) nzgVar.h1.getValue()).d(nzgVar.requireContext(), fkq0.a(((ozg) pzgVar).a));
                    return s3q0.a;
                }
                qcy<Object>[] qcyVarArr = nzg.k1;
                throw new NoWhenBranchMatchedException();
        }
    }
}
