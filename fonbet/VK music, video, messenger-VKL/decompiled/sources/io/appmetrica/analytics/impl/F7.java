package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class F7 implements Converter {
    public final C7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public F7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(E7 e7) {
        ContentValues contentValues = new ContentValues();
        Long l = e7.a;
        if (l != null) {
            contentValues.put("id", Long.valueOf(l.longValue()));
        }
        EnumC4840fl enumC4840fl = e7.b;
        if (enumC4840fl != null) {
            contentValues.put("type", Integer.valueOf(enumC4840fl.a));
        }
        String str = e7.c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C7 c7 = this.a;
        contentValues.put("session_description", MessageNano.toByteArray(c7.a.fromModel(e7.d)));
        return contentValues;
    }

    public F7(C7 c7) {
        this.a = c7;
    }

    public /* synthetic */ F7(C7 c7, int i, zcl zclVar) {
        this((i & 1) != 0 ? new C7(null, 1, null) : c7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E7 toModel(ContentValues contentValues) {
        EnumC4840fl enumC4840fl;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC4840fl = EnumC4840fl.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC4840fl = EnumC4840fl.BACKGROUND;
            }
        } else {
            enumC4840fl = null;
        }
        return new E7(asLong, enumC4840fl, contentValues.getAsString("report_request_parameters"), this.a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
