package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.core.compose.utils.swipable.DismissValue;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.ig3;
import xsna.ij20;
import xsna.oi3;
import xsna.rfb;
import xsna.skm0;
import xsna.y6k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hj3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hj3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((nj3) this.c).d.invoke(new ig3.k.e((oi3.b) this.d, ((dj3) this.e).a));
                return s3q0.a;
            case 1:
                wgb wgbVar = (wgb) this.c;
                return wgbVar.s + ": updateExpiredHistory: finished load from cache, args=" + ((rfb.a.b) this.d) + ", size=" + ((sfb) this.e).a.size();
            case 2:
                y6k.b bVar = (y6k.b) this.c;
                y6k y6kVar = (y6k) this.d;
                zt4 zt4Var = (zt4) this.e;
                List<e0o> list = y6kVar.t.g;
                uoh uohVar = new uoh(zt4Var, 2);
                Context context = y6k.this.i;
                List singletonList = Collections.singletonList(new xu20(context.getString(R.string.vkim_new_chat_admission_levels_title), context.getString(R.string.vkim_new_chat_admission_levels_desc), 0, null, 12));
                List<e0o> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (e0o e0oVar : list2) {
                    int i = e0oVar.a;
                    int i2 = e0oVar.c;
                    arrayList.add(new ModalActionSheetListItem(i, null, e0oVar.b, null, e0oVar.d ? context.getString(R.string.vkim_new_chat_admission_levels_price_and_higher, Integer.valueOf(i2)) : context.getString(R.string.vkim_new_chat_admission_levels_price, Integer.valueOf(i2)), 0, null, false, false, 490));
                }
                ArrayList u0 = j5g.u0(arrayList, singletonList);
                a.C0785a c0785a = new a.C0785a();
                c0785a.b = u0;
                c0785a.c = new com.vk.libvideo.design.view.video.a(12, list, uohVar);
                c0785a.a(context, null);
                return s3q0.a;
            case 3:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.e;
                wh50Var.setValue(this.d);
                wh50Var2.setValue(Boolean.FALSE);
                return s3q0.a;
            case 4:
                clj0 clj0Var = (clj0) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                se8 se8Var = clj0Var.b;
                se8Var.getClass();
                ij20.a aVar = new ij20.a();
                aVar.c = "video.delete";
                aVar.b("video_id", str);
                aVar.b("owner_id", str2);
                aVar.i = false;
                aVar.g = 0;
                se8Var.a.f(new ij20(aVar));
                return s3q0.a;
            case 5:
                bp50 bp50Var = (bp50) this.c;
                b520 b520Var = (b520) this.d;
                skm0.a aVar2 = (skm0.a) this.e;
                bp50Var.d(b520Var);
                aVar2.e();
                return s3q0.a;
            case 6:
                return new ccn((DismissValue) this.c, (izs) this.d, (wzs) this.e);
            default:
                return new cop0(new aah0(new nnp0((Context) this.c, (a1w) ((llp) this.d)), (FragmentManager) this.e));
        }
    }
}
