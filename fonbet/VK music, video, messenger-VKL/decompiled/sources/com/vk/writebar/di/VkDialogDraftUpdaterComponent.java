package com.vk.writebar.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.ui.di.DialogDraftUpdaterComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.cdm;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.qcy;
import xsna.rjg0;

/* compiled from: VkDialogDraftUpdaterComponent.kt */
/* loaded from: classes7.dex */
public final class VkDialogDraftUpdaterComponent implements DialogDraftUpdaterComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new rjg0(11));

    /* compiled from: VkDialogDraftUpdaterComponent.kt */
    public static final class a implements b7m<DialogDraftUpdaterComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VkDialogDraftUpdaterComponent();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkDialogDraftUpdaterComponent.class, "dialogDraftUpdater", "getDialogDraftUpdater()Lcom/vk/im/ui/components/viewcontrollers/msg_send/DialogDraftUpdater;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.ui.di.DialogDraftUpdaterComponent
    public final cdm V1() {
        qcy<Object> qcyVar = b[0];
        return (cdm) this.a.c();
    }
}
