package xsna;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MultipleUrlsPingTask.kt */
/* loaded from: classes3.dex */
public final class g840 implements Runnable {
    public final List<String> b;
    public final long c;
    public final FunctionReferenceImpl d;
    public final FunctionReferenceImpl e;
    public final FunctionReferenceImpl f;
    public final int g;
    public volatile boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public g840(List<String> list, int i, long j, izs<? super String, Result<s3q0>> izsVar, wzs<? super g840, ? super Long, s3q0> wzsVar, yzs<? super String, ? super Map<String, Boolean>, ? super Boolean, s3q0> yzsVar) {
        this.b = list;
        this.c = j;
        this.d = (FunctionReferenceImpl) izsVar;
        this.e = (FunctionReferenceImpl) wzsVar;
        this.f = (FunctionReferenceImpl) yzsVar;
        i = i < 1 ? 1 : i;
        int size = list.size();
        this.g = i > size ? size : i;
    }

    public final void a() {
        this.h = true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.yzs] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.yzs] */
    @Override // java.lang.Runnable
    public final void run() {
        this.b.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (String str : this.b) {
            if (this.h) {
                return;
            }
            Object d = ((Result) this.d.invoke(str)).d();
            if (!(d instanceof Result.Failure)) {
                if (!this.h) {
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap.put(str, bool);
                    this.f.invoke(str, linkedHashMap, bool);
                    this.e.invoke(this, Long.valueOf(this.c));
                    return;
                }
            }
            Throwable a = Result.a(d);
            if (a != null && !this.h) {
                if (a instanceof IOException) {
                    Boolean bool2 = Boolean.FALSE;
                    linkedHashMap.put(str, bool2);
                    i++;
                    if (i == this.g) {
                        this.f.invoke(str, linkedHashMap, bool2);
                    }
                } else {
                    a.toString();
                }
            }
        }
        if (this.h) {
            return;
        }
        this.e.invoke(this, Long.valueOf(this.c));
    }
}
