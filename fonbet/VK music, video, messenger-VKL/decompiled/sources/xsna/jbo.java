package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsSubscribersVh;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.instantjobs.InstantJob;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixSettings;
import com.vk.music.mixsettings.MixCategoryType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ems;
import xsna.ue50;
import xsna.ve50;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jbo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jbo(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                Lifecycle lifecycle = (Lifecycle) this.c;
                lbo lboVar = new lbo(0, (izs) this.d, (nbo) this.e);
                lifecycle.addObserver(lboVar);
                break;
            case 1:
                UIBlockProfile uIBlockProfile = (UIBlockProfile) this.c;
                FriendsSubscribersVh friendsSubscribersVh = (FriendsSubscribersVh) this.d;
                Context context = (Context) this.e;
                uIBlockProfile.E = 0;
                friendsSubscribersVh.b.j(new ems.d(uIBlockProfile));
                if (uIBlockProfile.equals(friendsSubscribersVh.h)) {
                    VkRichCell vkRichCell = friendsSubscribersVh.g;
                    VkRichCell vkRichCell2 = vkRichCell != null ? vkRichCell : null;
                    if (vkRichCell == null) {
                        vkRichCell = null;
                    }
                    pgv0 middle = vkRichCell.getMiddle();
                    vkRichCell2.setMiddle(middle != null ? friendsSubscribersVh.d(middle, context, uIBlockProfile) : null);
                }
                break;
            case 2:
                zrz zrzVar = (zrz) this.c;
                String str = (String) this.d;
                zrzVar.j.b(new qk(11, (zrz.a) this.e, (Throwable) obj));
                zrzVar.b(str + " -> launchNetworkLoad onError");
                break;
            case 3:
                zn00 zn00Var = (zn00) this.c;
                Set set = (Set) this.d;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.e;
                InstantJob instantJob = (InstantJob) obj;
                yn00 yn00Var = instantJob instanceof yn00 ? (yn00) instantJob : null;
                if (yn00Var != null && yn00Var.c == zn00Var.b) {
                    Set<Integer> set2 = ((yn00) instantJob).d;
                    set.addAll(set2);
                    boolean equals = set.equals(set2);
                    ref$BooleanRef.element = equals;
                    if (!equals) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            case 4:
                bf50 bf50Var = (bf50) this.c;
                MixSettings mixSettings = (MixSettings) this.d;
                e4v0 e4v0Var = (e4v0) this.e;
                ve50.b bVar = bf50Var.c;
                List O0 = j5g.O0(e4v0Var.f.values());
                int e = on00.e(c5g.u(O0, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj2 : O0) {
                    linkedHashMap.put(((MixCategory) obj2).b, obj2);
                }
                List<MixCategory> list = mixSettings.e;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (MixCategory mixCategory : list) {
                    MixCategory mixCategory2 = (MixCategory) linkedHashMap.get(mixCategory.b);
                    if (mixCategory2 != null) {
                        mixCategory = mixCategory2;
                    } else if (mixCategory.d == MixCategoryType.HIDDEN) {
                        List<MixOption> list2 = mixCategory.e;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(MixOption.a((MixOption) it.next(), 15));
                        }
                        mixCategory = MixCategory.a(mixCategory, arrayList2);
                    }
                    arrayList.add(mixCategory);
                }
                bVar.invoke(new ue50.a(new MixSettings(mixSettings.b, mixSettings.c, mixSettings.d, arrayList)));
                break;
            case 5:
                zrp zrpVar = (zrp) this.c;
                rg50 rg50Var = (rg50) this.d;
                List list3 = (List) this.e;
                VkScreenSpinner vkScreenSpinner = (VkScreenSpinner) obj;
                vkScreenSpinner.setSpinnerState((VkSpinnerContent.SpinnerState) zrpVar.get(rg50Var.getIntValue()));
                vkScreenSpinner.b((CharSequence) list3.get(rg50Var.getIntValue()), true);
                break;
            case 6:
                arl0 arl0Var = (arl0) this.c;
                final kfb kfbVar = new kfb((RecyclerView) this.d, arl0Var, (Ref$ObjectRef) this.e, 5);
                RecyclerView.l itemAnimator = ((RecyclerView) arl0Var.itemView).getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.o(new RecyclerView.l.a() { // from class: xsna.xql0
                        @Override // androidx.recyclerview.widget.RecyclerView.l.a
                        public final void a() {
                            kfb.this.invoke();
                        }
                    });
                } else {
                    kfbVar.invoke();
                }
                break;
            default:
                s2x0 s2x0Var = (s2x0) this.c;
                View view = (View) this.d;
                String str2 = (String) this.e;
                com.vk.core.tips.b bVar2 = null;
                if (bwt0.K(view)) {
                    Rect C = bwt0.C(view);
                    int i = C.top;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    C.top = i + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                    RectF rectF = new RectF(C);
                    Context context2 = s2x0Var.a;
                    bVar2 = Tooltip.l(new Tooltip(context2, str2, null, Tooltip.WindowStyle.FULLSCREEN_WITH_STATUSBAR, null, null, null, context2.getColor(s2x0Var.d), s2x0Var.c, null, 1.0f, null, 0, false, null, 0, false, null, null, null, null, null, null, new hhj0(s2x0Var, 11), Long.valueOf(s2x0Var.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, true, 0, null, null, null, null, -293602704, 15), s2x0Var.a, rectF, false, true, false, true, 128);
                }
                s2x0Var.g = bVar2;
                break;
        }
        return s3q0.a;
    }
}
