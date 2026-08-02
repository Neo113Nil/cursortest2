package com.yandex.go.settings.email;

import defpackage.c6z;
import defpackage.fsn;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/settings/email/EmailRequireExperiment;", "Lxn11;", "Lc6z;", "Companion", "com/yandex/go/settings/email/b", "$serializer", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmailRequireExperiment implements xn11, c6z {
    public static final b Companion = new b();
    public static final i3y[] i = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(0)), null, null, null, null, null};
    public static final EmailRequireExperiment j = new EmailRequireExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ EmailRequireExperiment(int i2, boolean z, Map map, String str, String str2, String str3, String str4, String str5) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i2 & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i2 & 32) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i2 & 64) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public EmailRequireExperiment() {
        this(0);
    }

    public EmailRequireExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
    }
}
