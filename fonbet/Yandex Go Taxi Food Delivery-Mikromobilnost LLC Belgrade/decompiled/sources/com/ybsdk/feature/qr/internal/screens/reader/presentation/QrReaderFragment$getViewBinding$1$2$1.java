package com.ybsdk.feature.qr.internal.screens.reader.presentation;

import defpackage.fcy0;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class QrReaderFragment$getViewBinding$1$2$1 extends FunctionReferenceImpl implements wls {
    public QrReaderFragment$getViewBinding$1$2$1(Object obj) {
        super(2, obj, fcy0.class, "techCameraEvent", "techCameraEvent(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fcy0 fcy0Var = (fcy0) this.receiver;
        fcy0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("action", (String) obj);
        linkedHashMap.put("camera_type", (String) obj2);
        fcy0Var.a.a("tech.camera_event", linkedHashMap);
        return zy11.a;
    }
}
