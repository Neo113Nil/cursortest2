package com.yandex.go.drive.unifiedpolling.dto;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jbm;
import defpackage.pnz;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/drive/unifiedpolling/dto/DriveOrderDto;", "", "Companion", "$serializer", "com/yandex/go/drive/unifiedpolling/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DriveOrderDto {
    public static final a Companion = new a();
    public static final i3y[] i = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jbm(4))};
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final DriveOrderStatusDto h;

    public /* synthetic */ DriveOrderDto(int i2, String str, String str2, Long l, String str3, String str4, String str5, String str6, DriveOrderStatusDto driveOrderStatusDto) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i2 & 128) == 0) {
            this.h = DriveOrderStatusDto.UNRECOGNIZED;
        } else {
            this.h = driveOrderStatusDto;
        }
    }

    public static final /* synthetic */ void j(DriveOrderDto driveOrderDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || driveOrderDto.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, driveOrderDto.a);
        }
        if (yjdVar.F() || driveOrderDto.b != null) {
            yjdVar.g(serialDescriptor, 1, auu0.a, driveOrderDto.b);
        }
        if (yjdVar.F() || driveOrderDto.c != null) {
            yjdVar.g(serialDescriptor, 2, pnz.a, driveOrderDto.c);
        }
        if (yjdVar.F() || driveOrderDto.d != null) {
            yjdVar.g(serialDescriptor, 3, auu0.a, driveOrderDto.d);
        }
        if (yjdVar.F() || driveOrderDto.e != null) {
            yjdVar.g(serialDescriptor, 4, auu0.a, driveOrderDto.e);
        }
        if (yjdVar.F() || driveOrderDto.f != null) {
            yjdVar.g(serialDescriptor, 5, auu0.a, driveOrderDto.f);
        }
        if (yjdVar.F() || driveOrderDto.g != null) {
            yjdVar.g(serialDescriptor, 6, auu0.a, driveOrderDto.g);
        }
        if (!yjdVar.F() && driveOrderDto.h == DriveOrderStatusDto.UNRECOGNIZED) {
            return;
        }
        yjdVar.e(serialDescriptor, 7, (KSerializer) i[7].getValue(), driveOrderDto.h);
    }

    /* renamed from: b, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: c, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: d, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: e, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: f, reason: from getter */
    public final Long getC() {
        return this.c;
    }

    /* renamed from: g, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: h, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: i, reason: from getter */
    public final DriveOrderStatusDto getH() {
        return this.h;
    }

    public DriveOrderDto() {
        DriveOrderStatusDto driveOrderStatusDto = DriveOrderStatusDto.UNRECOGNIZED;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = driveOrderStatusDto;
    }
}
