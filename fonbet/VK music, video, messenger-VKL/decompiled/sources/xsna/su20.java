package xsna;

import com.ironsource.B5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import okhttp3.Interceptor;
import okhttp3.l;
import okhttp3.u;
import okhttp3.v;
import xsna.a03;

/* compiled from: MockApiHttpInterceptor.kt */
/* loaded from: classes2.dex */
public final class su20 implements Interceptor {
    public static final Charset c = Charset.forName(C.UTF8_NAME);
    public final j90 a;
    public final izs<a03, String> b;

    public su20(j90 j90Var, izs izsVar) {
        this.a = j90Var;
        this.b = izsVar;
    }

    public static okhttp3.u a(okhttp3.v vVar, okhttp3.u uVar, String str) {
        Charset a;
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.FEED_MOCK_API.h(), null, "mock_response", null, String.valueOf(o25.a().c().b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
        l5mVar.q();
        bn8 source = vVar.source();
        source.o3(Long.MAX_VALUE);
        okhttp3.m contentType = vVar.contentType();
        Charset charset = c;
        if (contentType != null && (a = contentType.a(charset)) != null) {
            charset = a;
        }
        source.C().clone().p3(charset);
        u.a w = uVar.w();
        w.c = 200;
        v.b bVar = okhttp3.v.Companion;
        okhttp3.m contentType2 = vVar.contentType();
        bVar.getClass();
        w.g = v.b.a(str, contentType2);
        return w.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143 A[SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.l lVar;
        Charset charset;
        CharSequence charSequence;
        okhttp3.p request = aVar.request();
        okhttp3.u a = aVar.a(request);
        String str = request.a.i;
        okhttp3.t tVar = request.d;
        Object obj = null;
        Map map = jgp.b;
        if (tVar != null) {
            if (tVar instanceof okhttp3.h) {
                MapBuilder mapBuilder = new MapBuilder();
                okhttp3.h hVar = (okhttp3.h) tVar;
                List<String> list = hVar.c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    mapBuilder.put(l.b.c(0, 0, 3, list.get(i)), l.b.c(0, 0, 3, hVar.d.get(i)));
                }
                map = mapBuilder.h();
            } else if (!(tVar instanceof okhttp3.n) && !tVar.isOneShot() && !tVar.isDuplex()) {
                vl8 vl8Var = new vl8();
                tVar.writeTo(vl8Var);
                okhttp3.m contentType = tVar.contentType();
                if (contentType == null || (charset = contentType.a(emb.b)) == null) {
                    charset = emb.b;
                }
                String obj2 = drm0.p0(vl8Var.w(vl8Var.c, charset)).toString();
                char[] cArr = {'?'};
                int length = obj2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        charSequence = "";
                        break;
                    }
                    if (!rl3.F(cArr, obj2.charAt(i2))) {
                        charSequence = obj2.subSequence(i2, obj2.length());
                        break;
                    }
                    i2++;
                }
                List b0 = drm0.b0(charSequence.toString(), new char[]{'&'}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : b0) {
                    if (!drm0.N((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int L = drm0.L(str2, B5.U, 0, 6);
                    Pair pair = L <= 0 ? null : new Pair(drm0.p0(str2.substring(0, L)).toString(), drm0.p0(str2.substring(L + 1)).toString());
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                map = pn00.s(arrayList2);
            }
        }
        try {
            l.a aVar2 = new l.a();
            aVar2.e(null, str);
            lVar = aVar2.b();
        } catch (IllegalArgumentException unused) {
            lVar = null;
        }
        Iterable iterable = (Iterable) this.a.invoke();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : iterable) {
            c03 c03Var = (c03) obj4;
            a03 a03Var = c03Var.c;
            if (!(a03Var instanceof a03.b)) {
                if (!(a03Var instanceof a03.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!drm0.N(((a03.a) a03Var).a)) {
                    if (drm0.N(c03Var.a)) {
                    }
                }
            } else if (!drm0.N(((a03.b) a03Var).a)) {
                if (drm0.N(c03Var.a)) {
                    arrayList3.add(obj4);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            c03 c03Var2 = (c03) next;
            if (drm0.D(str, c03Var2.a, false)) {
                Map<String, String> map2 = c03Var2.b;
                if (!map2.isEmpty()) {
                    if (lVar != null) {
                        if (!map2.isEmpty()) {
                            for (Map.Entry<String, String> entry : map2.entrySet()) {
                                String key = entry.getKey();
                                String value = entry.getValue();
                                if (epx.f(lVar.g(key), value) || epx.f(map.get(key), value)) {
                                }
                            }
                        }
                    }
                }
                arrayList4.add(next);
            }
        }
        Iterator it3 = arrayList4.iterator();
        if (it3.hasNext()) {
            obj = it3.next();
            if (it3.hasNext()) {
                int size2 = ((c03) obj).b.size();
                do {
                    Object next2 = it3.next();
                    int size3 = ((c03) next2).b.size();
                    if (size2 < size3) {
                        obj = next2;
                        size2 = size3;
                    }
                } while (it3.hasNext());
            }
        }
        c03 c03Var3 = (c03) obj;
        if (c03Var3 == null) {
            return a;
        }
        okhttp3.v vVar = a.h;
        if (vVar == null) {
            return a;
        }
        try {
            okhttp3.u a2 = a(vVar, a, this.b.invoke(c03Var3.c));
            vVar.close();
            return a2;
        } finally {
        }
    }
}
