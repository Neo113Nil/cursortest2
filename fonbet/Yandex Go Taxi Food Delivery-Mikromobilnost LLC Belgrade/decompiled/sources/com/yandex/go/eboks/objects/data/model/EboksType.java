package com.yandex.go.eboks.objects.data.model;

import defpackage.fgn;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/data/model/EboksType;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/data/model/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EboksType {
    public static final i Companion = new i();
    public static final i3y[] h = {null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(12))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final EboksTypeStyle e;
    public final EboksTypeOverlay f;
    public final List g;

    public /* synthetic */ EboksType(int i, String str, String str2, String str3, String str4, EboksTypeStyle eboksTypeStyle, EboksTypeOverlay eboksTypeOverlay, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = eboksTypeStyle;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = eboksTypeOverlay;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
    }

    public EboksType() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
