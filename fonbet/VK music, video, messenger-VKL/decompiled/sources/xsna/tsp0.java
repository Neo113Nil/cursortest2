package xsna;

import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: TsPayloadReader.java */
/* loaded from: classes12.dex */
public interface tsp0 {

    /* compiled from: TsPayloadReader.java */
    public static final class a {
        public final String a;
        public final byte[] b;

        public a(String str, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    public static final class b {

        @Nullable
        public final String a;
        public final int b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, @Nullable String str, int i2, @Nullable ArrayList arrayList, byte[] bArr) {
            this.a = str;
            this.b = i2;
            this.c = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            this.d = bArr;
        }

        public final int a() {
            int i = this.b;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* compiled from: TsPayloadReader.java */
    public static final class c {
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;

        public c(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public final void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.a + this.d;
        }

        public final void b() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public c(int i, int i2, int i3) {
            this.a = i != Integer.MIN_VALUE ? l6g.a(i, DomExceptionUtils.SEPARATOR) : "";
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
    }

    void a(int i, xi90 xi90Var) throws ParserException;

    void b(txo0 txo0Var, rgq rgqVar, c cVar);

    void seek();
}
