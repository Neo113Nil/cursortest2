package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import xsna.zcl;

/* renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5136r7 implements Converter {
    public final C5059o7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5136r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C5111q7 c5111q7) {
        ContentValues contentValues = new ContentValues();
        Long l = c5111q7.a;
        if (l != null) {
            contentValues.put("session_id", Long.valueOf(l.longValue()));
        }
        EnumC4840fl enumC4840fl = c5111q7.b;
        if (enumC4840fl != null) {
            contentValues.put("session_type", Integer.valueOf(enumC4840fl.a));
        }
        Long l2 = c5111q7.c;
        if (l2 != null) {
            contentValues.put("number_in_session", Long.valueOf(l2.longValue()));
        }
        EnumC5037nb enumC5037nb = c5111q7.d;
        if (enumC5037nb != null) {
            contentValues.put("type", Integer.valueOf(enumC5037nb.a));
        }
        Long l3 = c5111q7.e;
        if (l3 != null) {
            contentValues.put("global_number", Long.valueOf(l3.longValue()));
        }
        Long l4 = c5111q7.f;
        if (l4 != null) {
            contentValues.put("time", Long.valueOf(l4.longValue()));
        }
        C5059o7 c5059o7 = this.a;
        contentValues.put("event_description", MessageNano.toByteArray(c5059o7.a.fromModel(c5111q7.g)));
        return contentValues;
    }

    public C5136r7(C5059o7 c5059o7) {
        this.a = c5059o7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C5136r7(C5059o7 c5059o7, int i, zcl zclVar) {
        this((i & 1) != 0 ? new C5059o7(null, 1, 0 == true ? 1 : 0) : c5059o7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5111q7 toModel(ContentValues contentValues) {
        EnumC4840fl enumC4840fl;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC4840fl = EnumC4840fl.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC4840fl = EnumC4840fl.BACKGROUND;
            }
        } else {
            enumC4840fl = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C5111q7(asLong, enumC4840fl, asLong2, asInteger2 != null ? EnumC5037nb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
