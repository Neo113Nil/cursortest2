package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.ads.api.di.PlayerAdsComponent;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.lfb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kfb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kfb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        CharSequence charSequence;
        switch (this.b) {
            case 0:
                return (lfb.b) ((l7r0) this.c).d((ij20) this.d, (lfb.a) this.e);
            case 1:
                PlayerService playerService = (PlayerService) this.c;
                mb4 mb4Var = (mb4) this.d;
                uw1 uw1Var = (uw1) this.e;
                return ((PlayerAdsComponent) m7m.e().a(fpf0.a(PlayerAdsComponent.class))).O4(mb4Var, uw1Var);
            case 2:
                String str = (String) this.c;
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                wh50Var.setValue(str);
                wh50Var2.setValue(Boolean.FALSE);
                return s3q0.a;
            case 3:
                hh80 hh80Var = (hh80) this.c;
                mc90 mc90Var = (mc90) this.d;
                ((izs) this.e).invoke(new a.d(((dh80) hh80Var.c.get(mc90Var.r())).a, mc90Var.r()));
                return s3q0.a;
            case 4:
                return up2.f((h7m) this.c, (Context) this.d, (f5z) this.e);
            case 5:
                RecyclerView recyclerView = (RecyclerView) this.c;
                wjf0.c(recyclerView, new z2d0((arl0) this.d, recyclerView, (Ref$ObjectRef) this.e, 3));
                return s3q0.a;
            case 6:
                vtn0 vtn0Var = (vtn0) this.c;
                Context context = (Context) this.d;
                List list = (List) this.e;
                List<Integer> list2 = vtn0Var.i;
                List list3 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (list2.contains(Integer.valueOf(((Number) obj).intValue()))) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                if (size == 1) {
                    i = R.string.superapp_tabbar_tooltip_one_item;
                } else if (size == 2) {
                    i = R.string.superapp_tabbar_tooltip_two_item;
                } else {
                    if (size != 3) {
                        charSequence = "";
                        String string = context.getString(R.string.superapp_tabbar_tooltip_subtitle_services);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list3) {
                            if (!list2.contains(Integer.valueOf(((Number) obj2).intValue()))) {
                                arrayList2.add(obj2);
                            }
                        }
                        return vtn0Var.d(context, true, charSequence, string, arrayList2);
                    }
                    i = R.string.superapp_tabbar_tooltip_three_item;
                }
                Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i, Arrays.copyOf(numArr, numArr.length)));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    int K = drm0.K(0, 6, spannableStringBuilder, String.valueOf(intValue), false);
                    spannableStringBuilder.replace(K, String.valueOf(intValue).length() + K, (CharSequence) vtn0Var.c(context, Integer.valueOf(intValue)));
                }
                charSequence = spannableStringBuilder;
                String string2 = context.getString(R.string.superapp_tabbar_tooltip_subtitle_services);
                ArrayList arrayList22 = new ArrayList();
                while (r0.hasNext()) {
                }
                return vtn0Var.d(context, true, charSequence, string2, arrayList22);
            default:
                List list4 = (List) this.c;
                qgp0 qgp0Var = (qgp0) this.d;
                UserId userId = (UserId) this.e;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "size=" + list4.size()});
                }
                return c5g.v(j5g.V0(list4, 512, 512, true, new z5a(27, qgp0Var, userId)));
        }
    }
}
