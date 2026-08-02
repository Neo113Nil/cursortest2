package xsna;

import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.im.nspkchooser.impl.nspk.MalformedSbpLinkException;
import com.vk.im.nspkchooser.impl.nspk.Source;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.mm70;
import xsna.om70;
import xsna.um70;

/* compiled from: NspkChooserFeature.kt */
/* loaded from: classes2.dex */
public final class km70 extends di6<qm70, om70, Object, mm70> {
    public final v2h0 h;
    public final LinkedHashMap i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public km70(v2h0 v2h0Var, String str) {
        super(new qm70(r2, r5, r11, EmptyList.b));
        Object obj;
        Uri parse = Uri.parse(str);
        uy9 uy9Var = new uy9();
        try {
            if (!um70.a(parse)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String lastPathSegment = parse.getLastPathSegment();
            if (lastPathSegment == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String queryParameter = parse.getQueryParameter(um70.a.BANK.getTitle());
            String str2 = "";
            String str3 = queryParameter == null ? "" : queryParameter;
            String queryParameter2 = parse.getQueryParameter(um70.a.SUM.getTitle());
            Long n = queryParameter2 != null ? arm0.n(queryParameter2) : null;
            String queryParameter3 = parse.getQueryParameter(um70.a.CURRENCY.getTitle());
            Iterator<E> it = Source.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String i = ((Source) obj).i();
                String queryParameter4 = parse.getQueryParameter("source");
                if (epx.f(i, (queryParameter4 == null ? "" : queryParameter4).toUpperCase(Locale.ROOT))) {
                    break;
                }
            }
            b3h0 b3h0Var = new b3h0(lastPathSegment, n, queryParameter3, str3, (Source) obj);
            if (n != null) {
                long longValue = n.longValue();
                if (queryParameter3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                str2 = uy9Var.b(longValue / 100.0d, queryParameter3, true).toString();
            }
            if (!um70.a(parse)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (parse.getQuery() != null) {
                Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                zrp<um70.a> h = um70.a.h();
                ArrayList arrayList = new ArrayList(c5g.u(h, 10));
                Iterator<E> it2 = h.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((um70.a) it2.next()).getTitle());
                }
                Set S0 = j5g.S0(arrayList);
                for (String str4 : parse.getQueryParameterNames()) {
                    if (S0.contains(str4)) {
                        clearQuery.appendQueryParameter(str4, parse.getQueryParameter(str4));
                    }
                }
                parse = clearQuery.build();
            }
            this.h = v2h0Var;
            io.reactivex.rxjava3.core.w c = asu0.a.c();
            this.i = new LinkedHashMap();
            di6.l(this, new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.v(new gca(this, 1)).q(c), new o060(new yr00(this, 11), 2)).h(new w250(new bk30(this, 9), 4)), null, 3);
        } catch (IllegalArgumentException e) {
            throw new MalformedSbpLinkException(i6n0.a(parse, "Malformed SBP link: "), e);
        }
    }

    @Override // xsna.di6
    public final void d(om70 om70Var) {
        om70 om70Var2 = om70Var;
        if (om70Var2 instanceof om70.a) {
            Intent intent = (Intent) this.i.get(Integer.valueOf(((om70.a) om70Var2).b));
            if (intent != null) {
                m(new mm70.b(intent));
            }
        } else if (om70Var2.equals(om70.c.b)) {
            m(new mm70.b(Intent.createChooser(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, g().a), null)));
        } else if (!om70Var2.equals(om70.b.b)) {
            throw new NoWhenBranchMatchedException();
        }
        m(mm70.a.a);
    }
}
