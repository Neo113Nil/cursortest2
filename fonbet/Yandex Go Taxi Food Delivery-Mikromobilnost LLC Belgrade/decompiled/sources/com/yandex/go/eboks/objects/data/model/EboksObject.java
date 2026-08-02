package com.yandex.go.eboks.objects.data.model;

import defpackage.gsq0;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/data/model/EboksObject;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EboksObject {
    public static final a Companion = new a();
    public final String a;
    public final zzs b;
    public final String c;
    public final kotlinx.serialization.json.c d;

    public /* synthetic */ EboksObject(int i, String str, zzs zzsVar, String str2, kotlinx.serialization.json.c cVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cVar;
        }
    }

    public EboksObject() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
