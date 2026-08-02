package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.ecomm.market.api.web.UpdateMarketItemInvalidParamsError;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: UpdateMarketItemCommandHandlerImpl.kt */
/* loaded from: classes18.dex */
public final class o8q0 implements m8q0 {
    public final sz00 a;
    public final fy00 b;

    public o8q0(sz00 sz00Var, fy00 fy00Var) {
        this.a = sz00Var;
        this.b = fy00Var;
    }

    public static io.reactivex.rxjava3.internal.operators.single.b0 b(int i, int i2) {
        yd10 yd10Var = new yd10();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('_');
        sb.append(i2);
        return rsg0.W(yfb.x(xd10.j(yd10Var, Collections.singletonList(sb.toString()), 14)), 7).l(new tj60(new kdw(24), 17)).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.m8q0
    public final io.reactivex.rxjava3.core.a a(FragmentImpl fragmentImpl, final String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n(str, this) { // from class: xsna.n8q0
            public final /* synthetic */ String b;

            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                Object obj;
                try {
                    JSONObject jSONObject = new JSONObject(this.b);
                    String optString = jSONObject.optString("type");
                    int optInt = jSONObject.optInt("owner_id");
                    int optInt2 = jSONObject.optInt("item_id");
                    MarketEventGoodCreated.Source.a aVar = MarketEventGoodCreated.Source.Companion;
                    String D = f370.D(jSONObject, "source");
                    aVar.getClass();
                    Iterator<E> it = MarketEventGoodCreated.Source.h().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (epx.f(((MarketEventGoodCreated.Source) obj).i(), D)) {
                            break;
                        }
                    }
                    MarketEventGoodCreated.Source source = (MarketEventGoodCreated.Source) obj;
                    if (source == null) {
                        source = MarketEventGoodCreated.Source.UNKNOWN;
                    }
                    return o8q0.b(optInt, optInt2).l(new aam0(new nm1(28, source, optString), 3));
                } catch (Throwable th) {
                    throw new UpdateMarketItemInvalidParamsError(th);
                }
            }
        }), new le50(new il7(19, this, fragmentImpl), 18)));
    }
}
