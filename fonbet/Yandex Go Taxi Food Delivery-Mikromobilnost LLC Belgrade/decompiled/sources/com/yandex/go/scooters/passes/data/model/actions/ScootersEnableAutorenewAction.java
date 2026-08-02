package com.yandex.go.scooters.passes.data.model.actions;

import defpackage.gsq0;
import defpackage.gz;
import defpackage.i3y;
import defpackage.kr;
import defpackage.qje;
import defpackage.s3n0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/actions/ScootersEnableAutorenewAction;", "Lkr;", "Lgz;", "Companion", "$serializer", "com/yandex/go/scooters/passes/data/model/actions/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersEnableAutorenewAction extends kr implements gz {
    public static final g Companion = new g();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final kr e;
    public final kr f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new s3n0(17)), kotlin.a.b(lazyThreadSafetyMode, new s3n0(18))};
    }

    public /* synthetic */ ScootersEnableAutorenewAction(int i, String str, String str2, String str3, boolean z, kr krVar, kr krVar2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, ScootersEnableAutorenewAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = krVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = krVar2;
        }
    }

    @Override // defpackage.gz
    /* renamed from: a, reason: from getter */
    public final kr getE() {
        return this.e;
    }

    @Override // defpackage.gz
    /* renamed from: b, reason: from getter */
    public final kr getF() {
        return this.f;
    }
}
