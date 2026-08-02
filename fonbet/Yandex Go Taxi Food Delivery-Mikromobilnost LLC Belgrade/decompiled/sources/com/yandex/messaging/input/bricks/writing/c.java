package com.yandex.messaging.input.bricks.writing;

import android.app.Activity;
import com.yandex.messaging.MessagingFlags$AttachmentsChooserMode;
import com.yandex.messaging.attachments.AttachmentsChooserMode;
import com.yandex.messaging.attachments.AttachmentsFileTypes;
import com.yandex.messaging.internal.entities.ChatBackendConfig;
import defpackage.c720;
import defpackage.f1w;
import defpackage.gm50;
import defpackage.h3y;
import defpackage.j3b;
import defpackage.j420;
import defpackage.jl40;
import defpackage.kc3;
import defpackage.l4o;
import defpackage.lqo;
import defpackage.nyh0;
import defpackage.oyh0;
import defpackage.pm50;
import defpackage.sfl0;
import defpackage.sls;
import defpackage.tz10;
import defpackage.w511;
import defpackage.x4b0;
import defpackage.xl50;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final /* synthetic */ class c implements sls {
    public final /* synthetic */ d a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ c(d dVar, Activity activity) {
        this.a = dVar;
        this.b = activity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        AttachmentsChooserMode attachmentsChooserMode;
        ChatBackendConfig chatBackendConfig;
        ChatBackendConfig chatBackendConfig2;
        x4b0 x4b0Var;
        d dVar = this.a;
        j420 j420Var = dVar.c0;
        h3y h3yVar = dVar.g0;
        sfl0 sfl0Var = dVar.D;
        lqo lqoVar = dVar.Q;
        boolean z = ((pm50) h3yVar.get()).c;
        zy11 zy11Var = zy11.a;
        if (z && (lqoVar.a(tz10.V) || ((x4b0Var = dVar.k0) != null && jl40.l(x4b0Var.k, "neophonish")))) {
            j3b j3bVar = dVar.j0;
            if ((j3bVar == null || !j3bVar.C) && ((Boolean) j420Var.d.getValue()).booleanValue() && (chatBackendConfig2 = dVar.l0) != null && chatBackendConfig2.d) {
                new xl50(c720.d, dVar.C);
                sfl0Var.getClass();
                return zy11Var;
            }
            new gm50(c720.d, null, null);
            sfl0Var.getClass();
            return zy11Var;
        }
        com.yandex.messaging.attachments.e eVar = dVar.S;
        l4o l4oVar = tz10.a;
        lqoVar.getClass();
        int i = f1w.a[((MessagingFlags$AttachmentsChooserMode) ((Enum) l4oVar.b)).ordinal()];
        if (i == 1) {
            attachmentsChooserMode = AttachmentsChooserMode.CHOOSER;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            attachmentsChooserMode = AttachmentsChooserMode.VIDEO_TRIM;
        }
        eVar.c(new kc3(AttachmentsFileTypes.ALL, attachmentsChooserMode, this.b.getString(oyh0.messenger_attach_aux_button_text), ((Boolean) j420Var.d.getValue()).booleanValue() && (chatBackendConfig = dVar.l0) != null && chatBackendConfig.d, Integer.valueOf(nyh0.messenger_attachment_storage_permission_explain_message)), new InputWritingBrick$openChooser$1$1(2, dVar, d.class, "startActivityForResult", "startActivityForResult(Landroid/content/Intent;I)V", 0));
        return zy11Var;
    }
}
