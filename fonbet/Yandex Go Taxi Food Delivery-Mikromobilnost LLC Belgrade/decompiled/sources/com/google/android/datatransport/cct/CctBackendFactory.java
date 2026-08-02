package com.google.android.datatransport.cct;

import defpackage.d011;
import defpackage.u59;
import defpackage.u8f;

/* loaded from: classes.dex */
public class CctBackendFactory {
    public d011 create(u8f u8fVar) {
        return new u59(u8fVar.a(), u8fVar.d(), u8fVar.c());
    }
}
