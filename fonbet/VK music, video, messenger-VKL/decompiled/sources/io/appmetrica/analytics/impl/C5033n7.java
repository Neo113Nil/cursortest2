package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import xsna.epx;
import xsna.zcl;

/* renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5033n7 implements ProtobufConverter {
    public final C5271we a;
    public final C5239v7 b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5033n7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5314y7 fromModel(C5085p7 c5085p7) {
        C5314y7 c5314y7 = new C5314y7();
        Integer num = c5085p7.a;
        if (num != null) {
            c5314y7.a = num.intValue();
        }
        String str = c5085p7.b;
        if (str != null) {
            c5314y7.b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c5085p7.c;
        if (str2 != null) {
            c5314y7.c = StringUtils.correctIllFormedString(str2);
        }
        Long l = c5085p7.d;
        if (l != null) {
            c5314y7.d = l.longValue();
        }
        C5214u7 c5214u7 = c5085p7.e;
        if (c5214u7 != null) {
            c5314y7.e = this.b.fromModel(c5214u7);
        }
        String str3 = c5085p7.f;
        if (str3 != null) {
            c5314y7.f = str3;
        }
        String str4 = c5085p7.g;
        if (str4 != null) {
            c5314y7.g = str4;
        }
        Long l2 = c5085p7.h;
        if (l2 != null) {
            c5314y7.h = l2.longValue();
        }
        Integer num2 = c5085p7.i;
        if (num2 != null) {
            c5314y7.i = num2.intValue();
        }
        Integer num3 = c5085p7.j;
        if (num3 != null) {
            c5314y7.j = num3.intValue();
        }
        String str5 = c5085p7.k;
        if (str5 != null) {
            c5314y7.k = str5;
        }
        U8 u8 = c5085p7.l;
        if (u8 != null) {
            c5314y7.l = u8.a;
        }
        String str6 = c5085p7.m;
        if (str6 != null) {
            c5314y7.m = str6;
        }
        EnumC5088pa enumC5088pa = c5085p7.n;
        if (enumC5088pa != null) {
            c5314y7.n = enumC5088pa.a;
        }
        EnumC5316y9 enumC5316y9 = c5085p7.o;
        if (enumC5316y9 != null) {
            c5314y7.o = enumC5316y9.a;
        }
        Boolean bool = c5085p7.p;
        if (bool != null) {
            c5314y7.p = this.a.fromModel(bool).intValue();
        }
        Integer num4 = c5085p7.q;
        if (num4 != null) {
            c5314y7.q = num4.intValue();
        }
        byte[] bArr = c5085p7.r;
        if (bArr != null) {
            c5314y7.r = bArr;
        }
        return c5314y7;
    }

    public C5033n7(C5271we c5271we, C5239v7 c5239v7) {
        this.a = c5271we;
        this.b = c5239v7;
    }

    public /* synthetic */ C5033n7(C5271we c5271we, C5239v7 c5239v7, int i, zcl zclVar) {
        this((i & 1) != 0 ? new C5271we() : c5271we, (i & 2) != 0 ? new C5239v7(null, 1, null) : c5239v7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5085p7 toModel(C5314y7 c5314y7) {
        EnumC5316y9 enumC5316y9;
        C5314y7 c5314y72 = new C5314y7();
        int i = c5314y7.a;
        Integer valueOf = i != c5314y72.a ? Integer.valueOf(i) : null;
        String str = c5314y7.b;
        String str2 = !epx.f(str, c5314y72.b) ? str : null;
        String str3 = c5314y7.c;
        String str4 = !epx.f(str3, c5314y72.c) ? str3 : null;
        long j = c5314y7.d;
        Long valueOf2 = j != c5314y72.d ? Long.valueOf(j) : null;
        C5214u7 model = this.b.toModel(c5314y7.e);
        String str5 = c5314y7.f;
        String str6 = !epx.f(str5, c5314y72.f) ? str5 : null;
        String str7 = c5314y7.g;
        String str8 = !epx.f(str7, c5314y72.g) ? str7 : null;
        long j2 = c5314y7.h;
        Long valueOf3 = Long.valueOf(j2);
        if (j2 == c5314y72.h) {
            valueOf3 = null;
        }
        int i2 = c5314y7.i;
        Integer valueOf4 = i2 != c5314y72.i ? Integer.valueOf(i2) : null;
        int i3 = c5314y7.j;
        Integer valueOf5 = i3 != c5314y72.j ? Integer.valueOf(i3) : null;
        String str9 = c5314y7.k;
        String str10 = !epx.f(str9, c5314y72.k) ? str9 : null;
        int i4 = c5314y7.l;
        Integer valueOf6 = Integer.valueOf(i4);
        if (i4 == c5314y72.l) {
            valueOf6 = null;
        }
        U8 a = valueOf6 != null ? U8.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c5314y7.m;
        String str12 = !epx.f(str11, c5314y72.m) ? str11 : null;
        int i5 = c5314y7.n;
        Integer valueOf7 = Integer.valueOf(i5);
        if (i5 == c5314y72.n) {
            valueOf7 = null;
        }
        EnumC5088pa a2 = valueOf7 != null ? EnumC5088pa.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i6 = c5314y7.o;
        Integer valueOf8 = Integer.valueOf(i6);
        if (i6 == c5314y72.o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC5316y9[] values = EnumC5316y9.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    enumC5316y9 = values[i7];
                    EnumC5316y9[] enumC5316y9Arr = values;
                    if (enumC5316y9.a == intValue) {
                        break;
                    }
                    i7++;
                    values = enumC5316y9Arr;
                } else {
                    enumC5316y9 = EnumC5316y9.NATIVE;
                    break;
                }
            }
        } else {
            enumC5316y9 = null;
        }
        Boolean a3 = this.a.a(c5314y7.p);
        int i8 = c5314y7.q;
        Integer valueOf9 = i8 != c5314y72.q ? Integer.valueOf(i8) : null;
        byte[] bArr = c5314y7.r;
        return new C5085p7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a, str12, a2, enumC5316y9, a3, valueOf9, !Arrays.equals(bArr, c5314y72.r) ? bArr : null);
    }
}
