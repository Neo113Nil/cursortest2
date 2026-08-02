package com.airbnb.lottie.parser.moshi;

/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ void a(StringBuilder sb, Object obj) {
        sb.append(" at path ");
        sb.append(obj);
        throw new JsonDataException(sb.toString());
    }
}
