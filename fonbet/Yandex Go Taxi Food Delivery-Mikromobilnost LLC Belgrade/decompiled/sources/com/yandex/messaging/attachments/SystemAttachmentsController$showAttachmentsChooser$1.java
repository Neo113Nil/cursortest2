package com.yandex.messaging.attachments;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.MediaStore;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.hi91;
import defpackage.kc3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.tse;
import defpackage.w0i0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x1x0;
import defpackage.ydz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.attachments.SystemAttachmentsController$showAttachmentsChooser$1", f = "SystemAttachmentsController.kt", l = {59, 61}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SystemAttachmentsController$showAttachmentsChooser$1 extends SuspendLambda implements wls {
    final /* synthetic */ kc3 $showData;
    final /* synthetic */ wls $startActivityForResult;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemAttachmentsController$showAttachmentsChooser$1(e eVar, kc3 kc3Var, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$showData = kc3Var;
        this.$startActivityForResult = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SystemAttachmentsController$showAttachmentsChooser$1(this.this$0, this.$showData, this.$startActivityForResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SystemAttachmentsController$showAttachmentsChooser$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0098, code lost:
    
        if (r12 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        SystemAttachmentsController$ChooserType systemAttachmentsController$ChooserType;
        Intent intent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Intent intent2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            kc3 kc3Var = this.$showData;
            this.label = 1;
            eVar.getClass();
            final fyc b2 = gwk0.b();
            x1x0 x1x0Var = (x1x0) eVar.c.get();
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(eVar.a, w0i0.Messaging_Theme_BottomSheetDialog);
            bottomSheetDialog.setCancelable(true);
            bottomSheetDialog.setCanceledOnTouchOutside(true);
            bottomSheetDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.yandex.messaging.attachments.b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    fyc.this.T(SystemAttachmentsController$ChooserType.NOTHING);
                }
            });
            bottomSheetDialog.setContentView(x1x0Var.getRoot());
            hi91.g(new SystemAttachmentsController$showTypeSelection$2$1(bottomSheetDialog, b2, null), x1x0Var.c);
            AttachmentsFileTypes attachmentsFileTypes = kc3Var.a;
            AttachmentsFileTypes attachmentsFileTypes2 = AttachmentsFileTypes.ALL;
            TextView textView = x1x0Var.w;
            if (attachmentsFileTypes == attachmentsFileTypes2) {
                textView.setVisibility(0);
                hi91.g(new SystemAttachmentsController$showTypeSelection$2$2(bottomSheetDialog, b2, null), textView);
            } else {
                textView.setVisibility(8);
            }
            hi91.g(new SystemAttachmentsController$showTypeSelection$2$3(bottomSheetDialog, b2, null), x1x0Var.x);
            hi91.g(new SystemAttachmentsController$showTypeSelection$2$4(bottomSheetDialog, b2, null), x1x0Var.y);
            bottomSheetDialog.show();
            obj = b2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                systemAttachmentsController$ChooserType = (SystemAttachmentsController$ChooserType) this.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    int i2 = d.a[systemAttachmentsController$ChooserType.ordinal()];
                    if (i2 == 1) {
                        e eVar2 = this.this$0;
                        Intent intent3 = new Intent("android.media.action.IMAGE_CAPTURE");
                        eVar2.getClass();
                        try {
                            eVar2.a(intent3, systemAttachmentsController$ChooserType);
                            intent2 = intent3;
                        } catch (SecurityException e) {
                            ydz.c("SystemAttachmentsController", "Unexpected exception", e);
                            Toast.makeText(eVar2.a, oyh0.loading_error, 1).show();
                        }
                        intent = intent2;
                    } else if (i2 == 2) {
                        intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    } else if (i2 == 3) {
                        intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    } else if (i2 != 4) {
                        w511.b();
                        return null;
                    }
                    if (intent != null) {
                        try {
                            this.$startActivityForResult.invoke(intent, new Integer(666));
                        } catch (ActivityNotFoundException e2) {
                            ydz.c("SystemAttachmentsController", "Unexpected ActivityNotFoundException", e2);
                            Toast.makeText(this.this$0.a, oyh0.no_app_found_error, 1).show();
                        } catch (SecurityException e3) {
                            ydz.c("SystemAttachmentsController", "Unexpected SecurityException", e3);
                            Toast.makeText(this.this$0.a, oyh0.loading_error, 1).show();
                        }
                    }
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        SystemAttachmentsController$ChooserType systemAttachmentsController$ChooserType2 = (SystemAttachmentsController$ChooserType) obj;
        e eVar3 = this.this$0;
        this.L$0 = systemAttachmentsController$ChooserType2;
        this.label = 2;
        eVar3.getClass();
        int i3 = c.a[systemAttachmentsController$ChooserType2.ordinal()];
        if (i3 == 1 || i3 == 2) {
            b = eVar3.b(this);
        } else {
            if (i3 != 3 && i3 != 4) {
                w511.b();
                return null;
            }
            b = Boolean.TRUE;
        }
        if (b != coroutineSingletons) {
            systemAttachmentsController$ChooserType = systemAttachmentsController$ChooserType2;
            obj = b;
            if (((Boolean) obj).booleanValue()) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
