package ru.ok.tracer.base.http;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.random.Random;
import ru.ok.tracer.base.http.HttpRequestBody;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: HttpMultipartBody.kt */
/* loaded from: classes9.dex */
public final class HttpMultipartBodyBuilder {
    public static final Companion Companion = new Companion(null);
    private final List<HttpPart> parts = new ArrayList();

    /* compiled from: HttpMultipartBody.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final HttpRequestBody build(izs<? super HttpMultipartBodyBuilder, s3q0> izsVar) {
            HttpMultipartBodyBuilder httpMultipartBodyBuilder = new HttpMultipartBodyBuilder();
            izsVar.invoke(httpMultipartBodyBuilder);
            return httpMultipartBodyBuilder.build();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ HttpMultipartBodyBuilder add$default(HttpMultipartBodyBuilder httpMultipartBodyBuilder, String str, String str2, HttpRequestBody httpRequestBody, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return httpMultipartBodyBuilder.add(str, str2, httpRequestBody);
    }

    public final HttpMultipartBodyBuilder add(String str, String str2, HttpRequestBody httpRequestBody) {
        this.parts.add(new HttpPart(str, str2, httpRequestBody.getContentType(), httpRequestBody));
        return this;
    }

    public final HttpMultipartBodyBuilder addString(String str, String str2) {
        this.parts.add(new HttpPart(str, null, null, HttpRequestBody.Companion.fromString$default(HttpRequestBody.Companion, "text/plain", str2, null, 4, null), 6, null));
        return this;
    }

    public final HttpRequestBody build() {
        Random.b.getClass();
        return new HttpMultipartBody(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(Random.c.m())}, 1)), j5g.O0(this.parts));
    }
}
