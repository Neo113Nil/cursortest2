package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import kotlin.Pair;
import xsna.on00;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5378x implements U {
    public final ClientContext a;

    public C5378x(ClientContext clientContext) {
        this.a = clientContext;
    }

    public final void a(String str) {
        this.a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(on00.f(new Pair("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
