package com.yandex.messaging.input.bricks.writing;

import com.yandex.alicekit.core.permissions.Permission;
import defpackage.mxh0;
import defpackage.nza0;
import defpackage.oyh0;
import defpackage.tls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class InputWritingBrick$onBrickAttach$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        nza0 nza0Var = (nza0) obj;
        d dVar = (d) this.receiver;
        dVar.getClass();
        if (!nza0Var.a()) {
            com.yandex.alicekit.core.permissions.b bVar = dVar.F;
            Permission permission = Permission.RECORD_AUDIO;
            int i = oyh0.record_audio_permission_blocked_message;
            int i2 = mxh0.button_settings;
            int i3 = mxh0.button_cancel;
            bVar.getClass();
            List singletonList = Collections.singletonList(permission);
            Set c = nza0Var.c();
            if (!(c instanceof Collection) || !c.isEmpty()) {
                Iterator it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (singletonList.contains((Permission) it.next())) {
                        bVar.g(i, i2, i3);
                        break;
                    }
                }
            }
        }
        return zy11.a;
    }
}
