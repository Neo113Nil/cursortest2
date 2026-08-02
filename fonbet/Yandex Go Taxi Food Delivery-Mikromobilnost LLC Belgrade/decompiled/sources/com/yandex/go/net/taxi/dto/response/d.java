package com.yandex.go.net.taxi.dto.response;

import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import defpackage.kw11;

/* loaded from: classes12.dex */
public abstract class d {
    public static final NearestZoneResponse a(kw11 kw11Var) {
        return new NearestZoneResponse(null, kw11Var != null ? kw11Var.c : null, new NearestZoneResponse.NearestZoneError(kw11Var != null ? kw11Var.d : null, kw11Var != null ? kw11Var.e : null, 1), kw11Var != null ? kw11Var.a : null, kw11Var != null ? kw11Var.b : null, 33);
    }
}
