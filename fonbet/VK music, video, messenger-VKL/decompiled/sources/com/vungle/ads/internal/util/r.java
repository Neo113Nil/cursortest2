package com.vungle.ads.internal.util;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import xsna.c9y;
import xsna.pn00;

/* loaded from: classes7.dex */
public abstract class r {
    public static String a(String str, JsonObject jsonObject) {
        try {
            return c9y.e((JsonElement) pn00.h(str, jsonObject)).c();
        } catch (Exception unused) {
            return null;
        }
    }
}
