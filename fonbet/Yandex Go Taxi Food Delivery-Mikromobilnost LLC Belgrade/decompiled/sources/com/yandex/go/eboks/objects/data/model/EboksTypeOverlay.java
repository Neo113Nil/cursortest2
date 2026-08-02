package com.yandex.go.eboks.objects.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/data/model/EboksTypeOverlay;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/data/model/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EboksTypeOverlay {
    public static final j Companion = new j();
    public final float[] a;
    public final float[] b;
    public final String c;
    public final String d;
    public final FormattedText e;
    public final FormattedText f;

    public /* synthetic */ EboksTypeOverlay(int i, float[] fArr, float[] fArr2, String str, String str2, FormattedText formattedText, FormattedText formattedText2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = fArr;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = fArr2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = formattedText;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = formattedText2;
        }
    }

    public EboksTypeOverlay() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
