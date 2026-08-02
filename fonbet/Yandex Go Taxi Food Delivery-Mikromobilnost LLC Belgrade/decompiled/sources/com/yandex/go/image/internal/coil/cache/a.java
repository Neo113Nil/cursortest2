package com.yandex.go.image.internal.coil.cache;

import com.yandex.go.coroutines.h;
import defpackage.cvu0;
import defpackage.e3n;
import defpackage.esg;
import defpackage.iz50;
import defpackage.lg70;
import defpackage.ny61;
import defpackage.oc7;
import defpackage.oz50;
import defpackage.qc7;
import defpackage.r3c;
import defpackage.sav;
import defpackage.sls;
import defpackage.wu50;
import defpackage.zu50;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Instant;
import kotlinx.datetime.DateTimeFormatException;

/* loaded from: classes.dex */
public final class a implements qc7 {
    public final sls b = new TagCacheStrategy$1(0, r3c.a, r3c.class, "now", "now()Lkotlin/time/Instant;", 0);
    public final h c;

    public a(h hVar) {
        this.c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.qc7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oz50 oz50Var, iz50 iz50Var, lg70 lg70Var, ContinuationImpl continuationImpl) {
        TagCacheStrategy$read$1 tagCacheStrategy$read$1;
        int i;
        iz50 iz50Var2;
        Instant instant;
        long j;
        long j2;
        long j3;
        String str;
        Instant instant2;
        oz50 oz50Var2 = oz50Var;
        if (continuationImpl instanceof TagCacheStrategy$read$1) {
            tagCacheStrategy$read$1 = (TagCacheStrategy$read$1) continuationImpl;
            int i2 = tagCacheStrategy$read$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tagCacheStrategy$read$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tagCacheStrategy$read$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tagCacheStrategy$read$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (!lg70Var.h.getReadEnabled()) {
                        return new oc7(oz50Var2);
                    }
                    Instant instant3 = (Instant) ((TagCacheStrategy$1) this.b).invoke();
                    tagCacheStrategy$read$1.L$0 = null;
                    tagCacheStrategy$read$1.L$1 = null;
                    tagCacheStrategy$read$1.L$2 = null;
                    tagCacheStrategy$read$1.L$3 = oz50Var2;
                    iz50Var2 = iz50Var;
                    tagCacheStrategy$read$1.L$4 = iz50Var2;
                    tagCacheStrategy$read$1.L$5 = instant3;
                    tagCacheStrategy$read$1.label = 1;
                    Object a = this.c.a(tagCacheStrategy$read$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    instant = instant3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    instant = (Instant) tagCacheStrategy$read$1.L$5;
                    iz50 iz50Var3 = (iz50) tagCacheStrategy$read$1.L$4;
                    oz50 oz50Var3 = (oz50) tagCacheStrategy$read$1.L$3;
                    b.b(obj);
                    iz50Var2 = iz50Var3;
                    oz50Var2 = oz50Var3;
                }
                j = ((sav) obj).a;
                j2 = oz50Var2.b;
                j3 = oz50Var2.c;
                str = null;
                String str2 = null;
                for (Map.Entry entry : oz50Var2.d.a.entrySet()) {
                    String str3 = (String) entry.getKey();
                    String str4 = (String) kotlin.collections.a.R((List) entry.getValue());
                    if (str4 != null) {
                        if (cvu0.t(str3, "Date", true)) {
                            str = str4;
                        } else if (cvu0.t(str3, "ETag", true)) {
                            str2 = str4;
                        }
                    }
                }
                if (str == null) {
                    Instant instant4 = Instant.a;
                    try {
                        instant2 = kotlinx.datetime.format.b.a((kotlinx.datetime.format.b) esg.a.c(str));
                    } catch (IllegalArgumentException e) {
                        throw new DateTimeFormatException("Failed to parse an instant from '" + ((Object) str) + '\'', e);
                    }
                } else {
                    instant2 = null;
                }
                if ((instant2 == null ? Math.max(0L, j3 - instant2.c()) : 0L) + Math.max(0L, j3 - j2) + Math.max(0L, instant.c() - j3) >= e3n.e(j)) {
                    return new oc7(oz50Var2);
                }
                if (str2 == null) {
                    return new oc7(iz50Var2);
                }
                zu50 zu50Var = iz50Var2.c;
                zu50Var.getClass();
                wu50 wu50Var = new wu50(zu50Var);
                wu50Var.a("If-None-Match", str2);
                return new oc7(new iz50(iz50Var2.a, iz50Var2.b, wu50Var.b(), iz50Var2.d));
            }
        }
        tagCacheStrategy$read$1 = new TagCacheStrategy$read$1(this, continuationImpl);
        Object obj2 = tagCacheStrategy$read$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tagCacheStrategy$read$1.label;
        if (i != 0) {
        }
        j = ((sav) obj2).a;
        j2 = oz50Var2.b;
        j3 = oz50Var2.c;
        str = null;
        String str22 = null;
        while (r4.hasNext()) {
        }
        if (str == null) {
        }
        if (instant2 == null) {
        }
        if ((instant2 == null ? Math.max(0L, j3 - instant2.c()) : 0L) + Math.max(0L, j3 - j2) + Math.max(0L, instant.c() - j3) >= e3n.e(j)) {
        }
    }

    @Override // defpackage.qc7
    public final Object b(oz50 oz50Var, iz50 iz50Var, oz50 oz50Var2, lg70 lg70Var, ContinuationImpl continuationImpl) {
        return qc7.a.b(oz50Var, iz50Var, oz50Var2, lg70Var, continuationImpl);
    }
}
