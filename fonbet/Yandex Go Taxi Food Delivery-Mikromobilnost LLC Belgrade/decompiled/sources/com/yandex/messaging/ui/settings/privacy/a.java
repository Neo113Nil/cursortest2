package com.yandex.messaging.ui.settings.privacy;

import android.os.Build;
import com.yandex.messaging.base.util.AndroidVersion;
import defpackage.b00;
import defpackage.bvf0;
import defpackage.di9;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.e4f0;
import defpackage.gci0;
import defpackage.h4f0;
import defpackage.il7;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.lqo;
import defpackage.m320;
import defpackage.o430;
import defpackage.r96;
import defpackage.rcc;
import defpackage.rcy0;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sft;
import defpackage.tz10;
import defpackage.w3f0;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.yr31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a extends yr31 {
    public final kotlinx.coroutines.channels.a A;
    public final sft b;
    public final h4f0 c;
    public final List w;
    public final List x;
    public final r0 y;
    public final gci0 z;

    public a(b00 b00Var, sft sftVar, il7 il7Var, rcy0 rcy0Var, h4f0 h4f0Var) {
        AndroidVersion androidVersion;
        ListBuilder j;
        Object next;
        this.b = sftVar;
        this.c = h4f0Var;
        int i = 0;
        List g = scc.g(0, 1, 2);
        this.w = g;
        List g2 = scc.g(0, 2);
        this.x = g2;
        if (rcy0Var.w) {
            ListBuilder a = rcc.a();
            a.add(new w3f0(PrivacyType.Search, g));
            a.add(new w3f0(PrivacyType.Write, g));
            a.add(new w3f0(PrivacyType.Calls, g));
            a.add(new w3f0(PrivacyType.OnlineStatus, g2));
            a.add(new w3f0(PrivacyType.Invites, g));
            j = a.j();
        } else {
            ListBuilder a2 = rcc.a();
            a2.add(new w3f0(PrivacyType.Write, g));
            a2.add(new w3f0(PrivacyType.Invites, g));
            lqo lqoVar = il7Var.b;
            AndroidVersion androidVersion2 = AndroidVersion.ANDROID_6;
            int i2 = Build.VERSION.SDK_INT;
            AndroidVersion[] values = AndroidVersion.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    androidVersion = null;
                    break;
                }
                androidVersion = values[i3];
                if (androidVersion.getApiLevel() == i2) {
                    break;
                } else {
                    i3++;
                }
            }
            if (androidVersion == null) {
                AndroidVersion[] values2 = AndroidVersion.values();
                ArrayList arrayList = new ArrayList();
                for (AndroidVersion androidVersion3 : values2) {
                    if (androidVersion3 != AndroidVersion.FUTURE) {
                        arrayList.add(androidVersion3);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int apiLevel = ((AndroidVersion) next).getApiLevel();
                        do {
                            Object next2 = it.next();
                            int apiLevel2 = ((AndroidVersion) next2).getApiLevel();
                            if (apiLevel < apiLevel2) {
                                next = next2;
                                apiLevel = apiLevel2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                AndroidVersion androidVersion4 = (AndroidVersion) next;
                androidVersion = i2 > (androidVersion4 == null ? AndroidVersion.UNKNOWN : androidVersion4).getApiLevel() ? AndroidVersion.FUTURE : AndroidVersion.UNKNOWN;
            }
            if (androidVersion.getApiLevel() >= androidVersion2.getApiLevel()) {
                r96 r96Var = tz10.p;
                if (lqoVar.a(r96Var) && lqoVar.a(r96Var) && lqoVar.a(tz10.r)) {
                    il7Var.a.getClass();
                    try {
                        m320.d().a().newInstance();
                        a2.add(new w3f0(PrivacyType.Calls, this.x));
                    } catch (Exception | NoClassDefFoundError unused) {
                    }
                }
            }
            a2.add(new w3f0(PrivacyType.OnlineStatus, this.x));
            a2.add(new w3f0(PrivacyType.Search, this.w));
            j = a2.j();
        }
        r0 c = bvf0.c(new e4f0(this.c.b ? PrivacyType.Search : null, j));
        this.y = c;
        n nVar = new n(c, new PrivacyScreenViewModel$uiState$1(this, null));
        k5c a3 = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        o430 o430Var = e3n.b;
        this.z = e.R(nVar, a3, jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), new e4f0(i));
        kotlinx.coroutines.channels.a a4 = sb2.a(0, null, null, 7);
        this.A = a4;
        new di9(a4);
    }
}
