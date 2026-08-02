package com.yandex.go.antirobot.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i22;
import defpackage.i3y;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/antirobot/experiment/AntirobotExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/antirobot/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AntirobotExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] h = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i22(7)), null, null, null};
    public static final AntirobotExperiment i = new AntirobotExperiment(0);
    public final boolean b;
    public final String c;
    public final Map d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ AntirobotExperiment(int i2, String str, String str2, String str3, String str4, Map map, boolean z) {
        this.b = (i2 & 1) == 0 ? false : z;
        this.c = (i2 & 2) == 0 ? "default" : str;
        if ((i2 & 4) == 0) {
            this.d = kotlin.collections.b.f();
        } else {
            this.d = map;
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
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.d;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public AntirobotExperiment() {
        this(0);
    }

    public AntirobotExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = "default";
        this.d = f;
        this.e = "";
        this.f = "";
        this.g = "";
    }
}
