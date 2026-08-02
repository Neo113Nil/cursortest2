package com.vungle.ads.internal.network;

import kotlinx.serialization.KSerializer;

/* loaded from: classes7.dex */
public enum g {
    GET,
    POST;

    public static final f Companion = new Object() { // from class: com.vungle.ads.internal.network.f
        public final KSerializer<g> serializer() {
            return e.a;
        }
    };
}
