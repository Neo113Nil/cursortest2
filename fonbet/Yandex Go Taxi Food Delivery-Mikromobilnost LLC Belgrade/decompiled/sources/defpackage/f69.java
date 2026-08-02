package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class f69 implements e2v0, izc0, fh81 {
    public final List a;

    public f69(List list) {
        this.a = list;
        list.isEmpty();
        z83.i();
    }

    public static void k(String str, List list) {
        xi7.a.l(oby.c, str, list, null);
    }

    @Override // defpackage.fh81
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.fh81
    public long b(int i) {
        if (i == 0) {
            return 0L;
        }
        w511.q();
        return 0L;
    }

    @Override // defpackage.e2v0
    public long c(int i) {
        d6z.l(i == 0);
        return 0L;
    }

    @Override // defpackage.fh81
    public List d(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // defpackage.izc0
    public rh3 f() {
        return (rh3) this.a.get(0);
    }

    @Override // defpackage.e2v0
    public int g() {
        return 1;
    }

    @Override // defpackage.e2v0
    public int h(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.e2v0
    public List i(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // defpackage.izc0
    public rh3 j() {
        return (rh3) this.a.get(0);
    }

    public void l(oby obyVar, String str, List list, Throwable th) {
        int i = obyVar.b;
        yeo yeoVar = oj51.c;
        if (i < aw91.b("Calls").a.b) {
            return;
        }
        Map i2 = b.i(new Pair("loggerName", "Calls"), new Pair(Constants.KEY_MESSAGE, str), new Pair("level", b.i(new Pair("name", obyVar.a), new Pair("value", Integer.valueOf(i)))), new Pair("tags", a.m0(list, this.a)), new Pair("stackTrace", th != null ? ljo.b(th) : null));
        yeo yeoVar2 = oj51.c;
        if (yeoVar2 != null) {
            yeoVar2.success(i2);
        }
    }

    public void m(String str, Exception exc, List list) {
        l(oby.d, str, list, exc);
    }

    @Override // defpackage.izc0
    public void reset() {
    }

    @Override // defpackage.fh81
    public int a() {
        return 1;
    }

    public f69(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }

    public f69() {
        this.a = EmptyList.a;
    }

    public /* synthetic */ f69(List list, boolean z) {
        this.a = list;
    }
}
