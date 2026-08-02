package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.common.links.AwayLink;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import xsna.fit;
import xsna.qjc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class nm3 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.i, io.reactivex.rxjava3.functions.m, h9l, io.reactivex.rxjava3.functions.b, hgh0, io.reactivex.rxjava3.functions.g, qjc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nm3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        ((dvu0) this.c).invoke();
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((com.vk.core.view.components.spinner.c) this.c).dismiss();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Boolean) ((x90) this.c).invoke(obj);
            case 1:
                return (Bitmap) ((kp5) this.c).invoke(obj);
            case 2:
            case 7:
            case 14:
            case 15:
            case 20:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                return (io.reactivex.rxjava3.core.e) ((adh0) this.c).invoke(obj);
            case 3:
                return (qih0) ((wmc) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((z5b) this.c).invoke(obj);
            case 5:
                return (b4e) ((wg1) this.c).invoke(obj);
            case 6:
                return (Bitmap) ((kp5) this.c).invoke(obj);
            case 8:
                return (NewsfeedGetResponse) ((wzf) this.c).invoke(obj);
            case 9:
                return (Drawable) ((gyg) this.c).invoke(obj);
            case 10:
                return (h4n) ((wzf) this.c).invoke(obj);
            case 11:
                return (ajp0) ((x90) this.c).invoke(obj);
            case 12:
                return (Boolean) ((x90) this.c).invoke(obj);
            case 13:
                return ((fit.o) this.c).invoke(obj);
            case 16:
                return (List) ((l74) this.c).invoke(obj);
            case 17:
                return (MarketMarketItemFullDto) ((x90) this.c).invoke(obj);
            case 18:
                return (Result) ((irt) this.c).invoke(obj);
            case 19:
                return (Boolean) ((d220) this.c).invoke(obj);
            case 21:
                return (String) ((t330) this.c).invoke(obj);
            case 22:
                return (Pair) ((h630) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.e) ((k330) this.c).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.t) ((k330) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (ixa0) ((j150) this.c).invoke(obj, obj2, obj3);
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (w79) ((u79) this.c).invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // xsna.hgh0
    public void onPageSelected(int i) {
        x6a0 x6a0Var = (x6a0) this.c;
        x8l0 x8l0Var = x6a0Var.P;
        afi0 afi0Var = x6a0Var.c0;
        if (afi0Var != null && afi0Var.e()) {
            afi0Var.a();
        }
        if (i == x6a0Var.D) {
            x8l0Var.a().p(x6a0Var.getContext(), true);
            return;
        }
        if (i != -1) {
            x6a0Var.Q.setCurrentItem(i, true);
            VkBottomSheetBehavior<ViewGroup> vkBottomSheetBehavior = x6a0Var.K;
            if (vkBottomSheetBehavior.i == 4) {
                vkBottomSheetBehavior.J(3);
                return;
            }
            return;
        }
        if (o25.a().b()) {
            x8l0Var.a().u(x6a0Var.getContext(), true, Collections.EMPTY_LIST, null, null);
            x6a0Var.S.q();
        } else {
            if (g620.f().k0().a(x6a0Var.getContext())) {
                return;
            }
            x6a0Var.S.close();
        }
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new dha0((oga0) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 7:
                return ((Boolean) ((x90) this.c).invoke(obj)).booleanValue();
            case 20:
                return ((Boolean) ((c220) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((h630) this.c).invoke(obj)).booleanValue();
        }
    }
}
