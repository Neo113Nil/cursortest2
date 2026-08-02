package defpackage;

import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.provider.ContactsContract;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import com.lightside.visum.layouts.constraint.ConstraintLayoutBuilder;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import com.yandex.go.payments.cards.ui.ConfirmPaymentMethodViewImpl;
import com.yandex.go.payments.shared.antifraud.ui.CorpAntiFraudModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpSuccessDraftCreatedModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.splash.CorpPersonalAccountSplashView;
import com.yandex.go.summary.navigation.c;
import com.yandex.go.summary.navigation.e;
import com.yandex.go.taxi.order.communications.h;
import com.yandex.go.taxi.order.communications.view.PromoCounterTrailView;
import com.yandex.messaging.core.net.entities.ContactCheckHashParam;
import com.yandex.messaging.ui.createpoll.CreatePollActivity;
import com.yandex.plus.pay.adapter.internal.CompositeOfferImpl;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.feature.offers.a;
import com.yandex.plus.pay.internal.feature.offers.b;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinScreenParams;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.tools.common.window.elements.IBioRndStatistics;
import ru.yandex.taxi.design.CroppedTextView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.eatskit.ContentView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes15.dex */
public final /* synthetic */ class lyc implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lyc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 init$lambda$2$0$2$0;
        zy11 onAttachedToWindow$lambda$0;
        ShimmeringFrameLayout shimmeringLayout_delegate$lambda$0;
        View insetsType$lambda$0;
        View logo_delegate$lambda$0;
        zy11 startLoadIcon$lambda$0;
        ns11 ui_delegate$lambda$0;
        zy11 onViewCreated$lambda$14$lambda$10;
        zy11 expandOnClickListener$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new c5j(((avj0) ((zuj0) ((vbb) obj).a)).h(kyh0.common_done), g9k0.a);
            case 1:
                return new etb(((g1d) obj).e.a);
            case 2:
                Paint paint = new Paint(1);
                kdd0 kdd0Var = ((ufd) obj).a;
                paint.setShader((kdd0Var != null ? kdd0Var : null).b());
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                return paint;
            case 3:
                pgd pgdVar = (pgd) obj;
                if (pgdVar.u()) {
                    pgdVar.r(new qu(9));
                }
                return zy11Var;
            case 4:
                return new c((e) obj);
            case 5:
                init$lambda$2$0$2$0 = ComposeViewAdapter.init$lambda$2$0$2$0((ComposeViewAdapter) obj);
                return init$lambda$2$0$2$0;
            case 6:
                a aVar = (a) obj;
                return new uad0((oed0) aVar.d.getValue(), (gdd0) aVar.e.getValue());
            case 7:
                List<PlusPayCompositeOffers.Offer> offers = ((mqd) obj).a.getOffers();
                ArrayList arrayList = new ArrayList(tcc.n(offers, 10));
                Iterator<T> it = offers.iterator();
                while (it.hasNext()) {
                    arrayList.add(new CompositeOfferImpl((PlusPayCompositeOffers.Offer) it.next()));
                }
                return arrayList;
            case 8:
                b bVar = (b) obj;
                return new yad0((oed0) bVar.g.getValue(), (gdd0) bVar.h.getValue());
            case 9:
                return ((h580) obj).a();
            case 10:
                onAttachedToWindow$lambda$0 = ConfirmPaymentMethodViewImpl.onAttachedToWindow$lambda$0((ConfirmPaymentMethodViewImpl) obj);
                return onAttachedToWindow$lambda$0;
            case 11:
                return ((ru.yandex.taxi.altpins.confirmation_screen.a) obj).c.p();
            case 12:
                return ((h0w) obj).c(":memory:");
            case 13:
                l7e l7eVar = (l7e) obj;
                ConstraintLayoutBuilder constraintLayoutBuilder = l7eVar.b;
                sme.a(constraintLayoutBuilder);
                ConstraintSetBuilder constraintSetBuilder = new ConstraintSetBuilder();
                constraintSetBuilder.g(constraintLayoutBuilder);
                l7eVar.a(constraintSetBuilder);
                constraintSetBuilder.b(constraintLayoutBuilder);
                l7eVar.c(constraintLayoutBuilder);
                return constraintLayoutBuilder;
            case 14:
                u9e u9eVar = (u9e) obj;
                u9eVar.C = null;
                s7m s7mVar = (s7m) u9eVar.D.poll();
                if (s7mVar != null) {
                    s7mVar.c();
                    u9eVar.C = s7mVar;
                } else if (u9eVar.B.a(tz10.c)) {
                    List c = u9eVar.y.v().c();
                    u9eVar.z.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : c) {
                        if (!((cvi0) obj2).d) {
                            arrayList2.add(obj2);
                        }
                    }
                    List<cvi0> x0 = kotlin.collections.a.x0(arrayList2, new w9e());
                    StringBuilder sb = new StringBuilder();
                    for (cvi0 cvi0Var : x0) {
                        sb.append(cvi0Var.b);
                        sb.append('|');
                        String str = cvi0Var.e;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append('|');
                        sb.append(cvi0Var.c);
                        sb.append(';');
                    }
                    byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
                    String format = String.format(IBioRndStatistics.BIO_DEFAULT_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(drb1.e(bytes.length, bytes) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)}, 1));
                    aqb1.d(u9eVar.x, "sync_check_hash", kotlin.collections.b.i(new Pair("uuid", u9eVar.w), new Pair("hash", format)));
                    xo3 xo3Var = u9eVar.F;
                    if (xo3Var != null) {
                        xo3Var.cancel();
                    }
                    to3 to3Var = u9eVar.b;
                    u9eVar.F = to3Var.a.a(new io3(2, to3Var, new ContactCheckHashParam(format, u9eVar.c.f()), new gyc(u9eVar)));
                } else {
                    u9eVar.c();
                }
                return zy11Var;
            case 15:
                ArrayList arrayList3 = new ArrayList();
                Cursor query = ((jde) obj).a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, jde.b, null, null, "display_name");
                if (query == null) {
                    return EmptyList.a;
                }
                int columnIndex = query.getColumnIndex("display_name");
                int columnIndex2 = query.getColumnIndex("data1");
                int columnIndex3 = query.getColumnIndex("contact_id");
                while (query.moveToNext()) {
                    String string = query.getString(columnIndex);
                    if (string == null) {
                        string = "";
                    }
                    String string2 = query.getString(columnIndex2);
                    if (string2 == null) {
                        string2 = "";
                    }
                    query.getString(columnIndex3);
                    arrayList3.add(new ide(string, string2, 4));
                }
                query.close();
                return arrayList3;
            case 16:
                shimmeringLayout_delegate$lambda$0 = ContentView.shimmeringLayout_delegate$lambda$0((ContentView) obj);
                return shimmeringLayout_delegate$lambda$0;
            case 17:
                ((j4v) ((ome) obj)).b.b.invoke();
                return zy11Var;
            case 18:
                return ((oay) obj).d();
            case 19:
                return new yny0((Orientation) obj);
            case 20:
                insetsType$lambda$0 = CorpAntiFraudModalView.insetsType$lambda$0((CorpAntiFraudModalView) obj);
                return insetsType$lambda$0;
            case 21:
                logo_delegate$lambda$0 = CorpPersonalAccountSplashView.logo_delegate$lambda$0((CorpPersonalAccountSplashView) obj);
                return logo_delegate$lambda$0;
            case 22:
                startLoadIcon$lambda$0 = CorpSuccessDraftCreatedModalView.startLoadIcon$lambda$0((AppCompatImageView) obj);
                return startLoadIcon$lambda$0;
            case 23:
                ListItemComponent listItemComponent = ((h) obj).j0;
                PromoCounterTrailView promoCounterTrailView = (PromoCounterTrailView) listItemComponent.getTrailViewAs(PromoCounterTrailView.class);
                if (promoCounterTrailView != null) {
                    return promoCounterTrailView;
                }
                PromoCounterTrailView promoCounterTrailView2 = new PromoCounterTrailView(listItemComponent.getContext(), null, 0, 6, null);
                listItemComponent.setTrailView(promoCounterTrailView2);
                return promoCounterTrailView2;
            case 24:
                ((l9) obj).run();
                return zy11Var;
            case 25:
                return new c7f(null, null, ((CreatePinScreenParams) obj).getToolbarText(), 191);
            case 26:
                ui_delegate$lambda$0 = CreatePollActivity.ui_delegate$lambda$0((CreatePollActivity) obj);
                return ui_delegate$lambda$0;
            case 27:
                onViewCreated$lambda$14$lambda$10 = CreditDepositFragment.onViewCreated$lambda$14$lambda$10((q661) obj);
                return onViewCreated$lambda$14$lambda$10;
            case 28:
                ((fyc) obj).T(ib21.d);
                return zy11Var;
            default:
                expandOnClickListener$lambda$0 = CroppedTextView.setExpandOnClickListener$lambda$0((CroppedTextView) obj);
                return expandOnClickListener$lambda$0;
        }
    }
}
