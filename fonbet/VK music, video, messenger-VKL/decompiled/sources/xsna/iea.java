package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.video.dto.VideoGetByIdsResponseDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import xsna.cs;
import xsna.e3m;
import xsna.ikv0;
import xsna.saj;
import xsna.t5e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class iea implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ iea(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Iterator it;
        switch (this.b) {
            case 0:
                UIBlockTopshelf uIBlockTopshelf = (UIBlockTopshelf) this.c;
                UIBlockList uIBlockList = (UIBlockList) this.d;
                mea meaVar = (mea) this.e;
                List e = ums0.e(ums0.a, ((VideoGetByIdsResponseDto) obj).d(), null, null, false, 62);
                int e2 = on00.e(c5g.u(e, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(e2 >= 16 ? e2 : 16);
                for (Object obj2 : e) {
                    linkedHashMap.put(((VideoFile) obj2).a1(), obj2);
                }
                String str = uIBlockTopshelf.b;
                CatalogViewType catalogViewType = uIBlockTopshelf.d;
                CatalogDataType catalogDataType = uIBlockTopshelf.e;
                String str2 = uIBlockTopshelf.f;
                UserId userId = uIBlockTopshelf.g;
                List<String> list = uIBlockTopshelf.h;
                Set<UIBlockDragDropAction> Db = uIBlockTopshelf.Db();
                UIBlockHint uIBlockHint = uIBlockTopshelf.j;
                List<UIBlockTopshelf.TopshelfItem> list2 = uIBlockTopshelf.y;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it) {
                    UIBlockTopshelf.TopshelfItem topshelfItem = (UIBlockTopshelf.TopshelfItem) it2.next();
                    if (topshelfItem instanceof UIBlockTopshelf.TopshelfLive) {
                        VideoFile videoFile = topshelfItem.c;
                        VideoFile videoFile2 = (VideoFile) linkedHashMap.get(videoFile != null ? videoFile.a1() : null);
                        if (videoFile2 != null) {
                            if (videoFile == null) {
                                it = it2;
                            } else {
                                if (videoFile.l6() == 0 || videoFile2.l6() != 0) {
                                    it = it2;
                                } else {
                                    videoFile2.f8(videoFile.l6());
                                    it = it2;
                                    videoFile2.m6(videoFile.Na());
                                    videoFile2.p5(videoFile.P8());
                                    videoFile2.J9(videoFile.K1());
                                }
                                videoFile2.E4(videoFile.x8());
                                String r = videoFile.r();
                                if (r == null) {
                                    r = videoFile2.r();
                                }
                                videoFile2.setTrackCode(r);
                                String M4 = videoFile.M4();
                                if (M4 == null) {
                                    M4 = videoFile2.M4();
                                }
                                videoFile2.m8(M4);
                                Owner s = videoFile.s();
                                if (s == null) {
                                    s = videoFile2.s();
                                }
                                videoFile2.f1(s);
                            }
                            topshelfItem = videoFile2.equals(videoFile) ? (UIBlockTopshelf.TopshelfLive) topshelfItem : new UIBlockTopshelf.TopshelfLive(topshelfItem.b, videoFile2, topshelfItem.d, topshelfItem.e, topshelfItem.f);
                        } else {
                            it = it2;
                            topshelfItem = (UIBlockTopshelf.TopshelfLive) topshelfItem;
                        }
                    } else {
                        it = it2;
                    }
                    arrayList.add(topshelfItem);
                }
                final UIBlockTopshelf uIBlockTopshelf2 = new UIBlockTopshelf(str, catalogViewType, catalogDataType, str2, userId, list, Db, uIBlockHint, null, arrayList, 256, null);
                uIBlockList.y.replaceAll(new UnaryOperator() { // from class: xsna.jea
                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        UIBlock uIBlock = (UIBlock) obj3;
                        return uIBlock instanceof UIBlockTopshelf ? UIBlockTopshelf.this : uIBlock;
                    }
                });
                meaVar.invoke(uIBlockList);
                return s3q0.a;
            case 1:
                ikv0.a aVar = (ikv0.a) this.c;
                u5e u5eVar = (u5e) this.d;
                t5e.h hVar = (t5e.h) this.e;
                dhr0 dhr0Var = dhr0.a;
                Context context = aVar.a;
                u5eVar.b.b(hVar.a, hVar.b, hVar.c, dhr0Var.c(context)).k(context);
                ((ikv0) obj).a();
                return s3q0.a;
            case 2:
                saj sajVar = (saj) this.c;
                LayoutInflater layoutInflater = (LayoutInflater) this.d;
                saj.a aVar2 = (saj.a) this.e;
                ViewGroup viewGroup = (ViewGroup) obj;
                return sajVar.i ? new vr8((VkCell) layoutInflater.inflate(R.layout.vkim_contacts_button, viewGroup, false), aVar2) : new wr8(layoutInflater.inflate(R.layout.vkim_contacts_button_old, viewGroup, false), aVar2);
            case 3:
                wb20 wb20Var = (wb20) this.c;
                yi30 yi30Var = (yi30) this.d;
                unp0 unp0Var = (unp0) this.e;
                String str3 = yi30Var.c;
                ez80 ez80Var = wb20Var.f.P0().a;
                wb20Var.l(new zm3(str3, str3.equals(ez80Var.a) ? ez80Var.b : false, wb20Var, unp0Var));
                wb20Var.d.c();
                return s3q0.a;
            case 4:
                a440 a440Var = (a440) this.c;
                final prq0 prq0Var = (prq0) this.d;
                wmd0 wmd0Var = (wmd0) this.e;
                View view = (View) obj;
                Hint b = pla.e().b().b(HintId.INFO_VIDEO_MULTIPLE_VOLUME.getId());
                if (b == null) {
                    return s3q0.a;
                }
                Context context2 = a440Var.a;
                String str4 = b.c;
                WeakReference weakReference = new WeakReference(view);
                Context context3 = a440Var.a;
                e3m.a aVar3 = e3m.a;
                Tooltip.l(new Tooltip(context2, null, str4, null, null, new DialogInterface.OnShowListener() { // from class: xsna.z340
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        prq0.this.invoke();
                    }
                }, null, -1, context3.getColor(R.color.vk_gray_800), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 0, false, null, 0, false, null, null, null, null, null, null, new x310(wmd0Var, 2), 2400L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, -iah0.a(16), weakReference, null, null, null, 1048573528, 15), a440Var.a, bwt0.G(view), false, false, false, false, 236);
                return s3q0.a;
            case 5:
                bgy bgyVar = (bgy) this.c;
                kck0 kck0Var = (kck0) this.d;
                e650 e650Var = (e650) this.e;
                int i = xck0.q;
                wd8 wd8Var = new wd8(e650Var, 11);
                tck0 tck0Var = new tck0(((ViewGroup) obj).getContext());
                tck0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new xck0(tck0Var, bgyVar, wd8Var, kck0Var);
            default:
                q1p0 q1p0Var = (q1p0) this.c;
                UserId userId2 = (UserId) this.d;
                String str5 = (String) this.e;
                xy2 e3 = cs.a.e((bs) q1p0Var.a.getValue(), null, null, null, userId2, 7);
                ufx ufxVar = (ufx) e3;
                gz2 gz2Var = new gz2(e3, "5.285", i5s.a(new StringBuilder(), ufxVar.a, str5));
                gz2Var.i = ufxVar.e;
                gz2Var.j.putAll(ufxVar.d);
                gz2Var.p();
                return s3q0.a;
        }
    }

    public /* synthetic */ iea(kea keaVar, UIBlockTopshelf uIBlockTopshelf, UIBlockList uIBlockList, mea meaVar) {
        this.b = 0;
        this.c = uIBlockTopshelf;
        this.d = uIBlockList;
        this.e = meaVar;
    }
}
