package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.d;
import java.util.Objects;
import xsna.na8;

/* compiled from: ObjectHelper.java */
/* loaded from: classes11.dex */
public final class b {
    public static final a a = new a();

    /* compiled from: ObjectHelper.java */
    public static final class a implements d<Object, Object> {
        @Override // io.reactivex.rxjava3.functions.d
        public final boolean test(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    public static void a(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(na8.a(i, str, " > 0 required but it was "));
        }
    }

    public static void b(long j, String str) {
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j);
    }
}
