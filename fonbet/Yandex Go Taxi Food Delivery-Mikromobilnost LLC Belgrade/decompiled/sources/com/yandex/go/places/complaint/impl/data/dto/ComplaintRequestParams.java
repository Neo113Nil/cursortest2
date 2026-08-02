package com.yandex.go.places.complaint.impl.data.dto;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/complaint/impl/data/dto/ComplaintRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/complaint/impl/data/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComplaintRequestParams {
    public static final a Companion = new a();
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ ComplaintRequestParams(long j, String str, String str2, String str3, String str4, int i) {
        this.a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public ComplaintRequestParams() {
        this(31, 0L, null, null, null);
    }

    public ComplaintRequestParams(int i, long j, String str, String str2, String str3) {
        j = (i & 1) != 0 ? 0L : j;
        str = (i & 2) != 0 ? "" : str;
        str2 = (i & 4) != 0 ? "" : str2;
        str3 = (i & 8) != 0 ? "" : str3;
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = null;
    }
}
