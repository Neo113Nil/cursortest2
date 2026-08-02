package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.emb;

/* renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5089pb {
    public static final M9 a(C5089pb c5089pb, V9 v9, JSONObject jSONObject) {
        int i;
        c5089pb.getClass();
        M9 m9 = new M9();
        switch (v9) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        m9.a = i;
        m9.b = jSONObject.toString().getBytes(emb.b);
        return m9;
    }
}
