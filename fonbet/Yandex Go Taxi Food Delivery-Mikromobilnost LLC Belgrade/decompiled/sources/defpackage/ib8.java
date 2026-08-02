package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.order.ui.presentation.car.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.banners.CardBannerV2ModalView;
import ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoModalView;
import ru.yandex.taxi.utils.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class ib8 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ ib8(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ony onyVar;
        Bitmap bitmap;
        String str;
        g18 g18Var;
        m25 m25Var;
        int i = this.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                CardBannerV2ModalView.showAnimation$lambda$0((CardBannerV2ModalView) obj4, (Integer) obj3, (ci2) obj2, (nsz) obj);
                break;
            case 1:
                ((rjy) obj).d((kj) obj4, (Events$Zalogin$LinkageContext) obj3, (Runnable) obj2);
                break;
            case 2:
                LinkedOrderInfoModalView linkedOrderInfoModalView = (LinkedOrderInfoModalView) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                ImageView imageView = (ImageView) obj;
                if (imageView != null) {
                    onyVar = linkedOrderInfoModalView.presenter;
                    onyVar.getClass();
                    Integer S = q5z.S(str2);
                    if (S != null) {
                        bitmap = ((a) onyVar.D).a(S.intValue());
                    } else {
                        bitmap = null;
                    }
                    if (bitmap == null) {
                        str = linkedOrderInfoModalView.lastLoadedIconTag;
                        if (!jl40.l(str3, str)) {
                            linkedOrderInfoModalView.lastLoadedIconTag = str3;
                            g18Var = linkedOrderInfoModalView.loadIconCancelable;
                            g18Var.cancel();
                            m25Var = linkedOrderInfoModalView.baseImageProvider;
                            obv obvVar = new obv(str3, null, 6, 0);
                            jny jnyVar = new jny(linkedOrderInfoModalView, 2);
                            qu quVar = new qu(14);
                            nac nacVar = (nac) ((c) m25Var).a.a(imageView);
                            nacVar.h = quVar;
                            nacVar.i = jnyVar;
                            linkedOrderInfoModalView.loadIconCancelable = nacVar.b(obvVar);
                            break;
                        }
                    } else {
                        imageView.setImageBitmap(bitmap);
                        break;
                    }
                }
                break;
            case 3:
                kz00 kz00Var = (kz00) obj;
                kz00Var.b = (String) obj4;
                kz00Var.c = (String) obj3;
                kz00Var.a = (String) obj2;
                break;
            case 4:
                RecyclerView recyclerView = (RecyclerView) obj4;
                wp81 wp81Var = (wp81) obj3;
                com.yandex.go.shortcuts.impl.view.a aVar = (com.yandex.go.shortcuts.impl.view.a) obj2;
                View view = (View) obj;
                x0 childViewHolder = recyclerView.getChildViewHolder(view);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if ((childViewHolder instanceof umw0) && !((bzg) wp81Var).c.contains(Integer.valueOf(childAdapterPosition))) {
                    com.yandex.go.shortcuts.impl.view.a.r(view, aVar.c);
                    break;
                }
                break;
            default:
                com.yandex.go.shortcuts.impl.router.a aVar2 = (com.yandex.go.shortcuts.impl.router.a) obj4;
                nc6 nc6Var = (nc6) obj3;
                eor eorVar = (eor) obj;
                ((ArrayList) aVar2.c.getValue()).add(Integer.valueOf(nc6Var.e));
                ((HashMap) aVar2.d.getValue()).put(nc6Var.a, eorVar);
                ((r330) obj2).addFloatButton(eorVar, nc6Var.e, false);
                break;
        }
    }
}
