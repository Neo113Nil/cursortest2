package xsna;

import android.graphics.Bitmap;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.util.a;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.superapp.api.dto.restore.VkRestoreInstantAuth;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCardBind;
import com.vk.superapp.vkpay.checkout.api.dto.model.a;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.data.model.CreditCard;
import com.vk.superapp.vkpay.checkout.data.model.GooglePay;
import com.vk.superapp.vkpay.checkout.data.model.NoVkPay;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vk.superapp.vkpay.checkout.data.model.VkPay;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable;
import xsna.dn90;
import xsna.fzw0;
import xsna.j490;
import xsna.l3s;
import xsna.qi6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qs6 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, Cancelable, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.b, e380, qi6.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qs6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qi6.b
    public void a(View view, NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        PostViewFragment postViewFragment = (PostViewFragment) this.c;
        String[] strArr = PostViewFragment.T0;
        postViewFragment.Io(view.getContext(), new a.AbstractC1374a.b(view), newsEntry);
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((u70) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        PayMethodData vkPay;
        CreditCard creditCard;
        switch (this.b) {
            case 11:
                jsn jsnVar = (jsn) this.c;
                vww vwwVar = (vww) obj2;
                ArrayList arrayList = new ArrayList();
                Object d = ((Result) obj).d();
                if (d instanceof Result.Failure) {
                    d = null;
                }
                GooglePay googlePay = (GooglePay) d;
                List<a.C1916a> list = vwwVar.c;
                jsnVar.getClass();
                List<a.C1916a> list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (a.C1916a c1916a : list2) {
                    String str = c1916a.a;
                    String str2 = c1916a.b;
                    String str3 = c1916a.c;
                    CreditCard.a aVar = CreditCard.Companion;
                    VkCardBind.CardType cardType = c1916a.d;
                    aVar.getClass();
                    switch (CreditCard.a.C1920a.$EnumSwitchMapping$0[cardType.ordinal()]) {
                        case 1:
                            creditCard = CreditCard.VISA;
                            break;
                        case 2:
                            creditCard = CreditCard.MASTERCARD;
                            break;
                        case 3:
                            creditCard = CreditCard.DINERS;
                            break;
                        case 4:
                            creditCard = CreditCard.UNION;
                            break;
                        case 5:
                            creditCard = CreditCard.DISCOVER;
                            break;
                        case 6:
                            creditCard = CreditCard.JCB;
                            break;
                        case 7:
                            creditCard = CreditCard.AMERICAN_EXPRESS;
                            break;
                        case 8:
                            creditCard = CreditCard.MIR;
                            break;
                        case 9:
                            creditCard = CreditCard.UNKNOWN;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(new Card(str, str2, str3, creditCard));
                }
                arrayList.addAll(arrayList2);
                a.b bVar = vwwVar.d;
                if (bVar instanceof a.b.C1917a) {
                    vkPay = NoVkPay.c;
                } else {
                    if (!(bVar instanceof a.b.C1918b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.b.C1918b c1918b = (a.b.C1918b) bVar;
                    vkPay = new VkPay(c1918b.a, c1918b.b, c1918b.c, c1918b.d);
                }
                arrayList.add(vkPay);
                if (googlePay != null) {
                    arrayList.add(googlePay);
                }
                List O0 = j5g.O0(arrayList);
                return new ixw(vwwVar.b, vwwVar.e, O0);
            case 14:
                return (l3s.d.b) ((a76) this.c).invoke(obj, obj2);
            case 18:
                return (o5t0) ((a76) this.c).invoke(obj, obj2);
            default:
                return (j490.a) ((a76) this.c).invoke(obj, obj2);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable
    public void cancel() {
        ((io.reactivex.rxjava3.disposables.c) this.c).dispose();
    }

    @Override // xsna.e380
    public void onComplete(Throwable th) {
        ((fwj0) this.c).dispose();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 8:
                return ((Boolean) ((r3h) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((l850) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = us6.p1;
                return (fzw0.d) ((xr0) obj2).invoke(obj);
            case 1:
                return (s89) ((v89) obj2).invoke(obj);
            case 2:
                return (Boolean) ((xr0) obj2).invoke(obj);
            case 3:
                return (n3a) ((xr0) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.e) ((xr0) obj2).invoke(obj);
            case 5:
                return (Bitmap) ((mnd) obj2).invoke(obj);
            case 6:
                return (e2f) ((xr0) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.b0) ((h1) obj2).invoke(obj);
            case 8:
            case 10:
            case 11:
            case 14:
            case 18:
            case 19:
            case 22:
            case 24:
            case 25:
            default:
                return (dn90.a.b) ((cd10) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.b0) ((r3h) obj2).invoke(obj);
            case 12:
                return (UserId) ((xr0) obj2).invoke(obj);
            case 13:
                return (ipq) ((xr0) obj2).invoke(obj);
            case 15:
                return (NewsEntry) ((r3h) obj2).invoke(obj);
            case 16:
                return (Boolean) ((xr0) obj2).invoke(obj);
            case 17:
                return (VkRestoreInstantAuth) ((mf8) obj2).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((h1) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.b0) ((qqe) obj2).invoke(obj);
            case 23:
                return (hda) ((z6u) obj2).invoke(obj);
            case 26:
                return (gy80) ((mf8) obj2).invoke(obj);
        }
    }
}
