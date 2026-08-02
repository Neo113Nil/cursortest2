package com.yandex.go.mainscreen.superapp.impl.header.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tsv0;
import defpackage.vn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/experiment/SuperAppMainScreenLogoImageExperiment;", "Lvn11;", "Lc6z;", "Companion", "com/yandex/go/mainscreen/superapp/impl/header/experiment/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppMainScreenLogoImageExperiment implements vn11, c6z {
    public static final e Companion = new e();
    public static final i3y[] j = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(27)), null, null, null, null, null, null, null};
    public static final SuperAppMainScreenLogoImageExperiment k = new SuperAppMainScreenLogoImageExperiment(0);
    public final Map b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ SuperAppMainScreenLogoImageExperiment(int i, Map map, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str4;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str5;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    public SuperAppMainScreenLogoImageExperiment() {
        this(0);
    }

    public SuperAppMainScreenLogoImageExperiment(int i) {
        this.b = kotlin.collections.b.f();
        this.c = "";
        this.d = "";
        this.e = false;
        this.f = false;
        this.g = "";
        this.h = "";
        this.i = "";
    }
}
