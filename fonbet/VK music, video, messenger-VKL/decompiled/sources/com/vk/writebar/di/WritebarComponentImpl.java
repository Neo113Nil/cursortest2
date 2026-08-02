package com.vk.writebar.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e3c0;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: WritebarComponentImpl.kt */
/* loaded from: classes7.dex */
public final class WritebarComponentImpl implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] a;

    /* compiled from: WritebarComponentImpl.kt */
    public static final class a implements b7m<Object> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new WritebarComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(WritebarComponentImpl.class, "attachmentsClickListenerFactory", "getAttachmentsClickListenerFactory()Lcom/vk/writebar/api/AttachmentsClickListenerFactory;", 0);
        fpf0.a.getClass();
        a = new qcy[]{propertyReference1Impl};
    }

    public WritebarComponentImpl() {
        new nwy(new e3c0(18));
    }
}
