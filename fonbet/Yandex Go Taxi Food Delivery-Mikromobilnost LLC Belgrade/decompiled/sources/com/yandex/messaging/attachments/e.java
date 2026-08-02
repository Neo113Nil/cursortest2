package com.yandex.messaging.attachments;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.messaging.contacts.PermissionState;
import defpackage.kc3;
import defpackage.miv0;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.tje;
import defpackage.vse;
import defpackage.wh91;
import defpackage.wls;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class e {
    public final Activity a;
    public final vse b;
    public final miv0 c;
    public final com.yandex.alicekit.core.permissions.b d;
    public Uri e;

    public e(Activity activity, vse vseVar, miv0 miv0Var, com.yandex.alicekit.core.permissions.b bVar) {
        this.a = activity;
        this.b = vseVar;
        this.c = miv0Var;
        this.d = bVar;
    }

    public final void a(Intent intent, SystemAttachmentsController$ChooserType systemAttachmentsController$ChooserType) {
        ContentValues contentValues = new ContentValues(1);
        if (systemAttachmentsController$ChooserType == SystemAttachmentsController$ChooserType.PHOTO) {
            contentValues.put("mime_type", "image/jpeg");
        } else {
            contentValues.put("mime_type", "video/mp4");
        }
        intent.addFlags(3);
        Uri insert = this.a.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        this.e = insert;
        intent.putExtra("output", insert);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SystemAttachmentsController$requestCameraPermissions$1 systemAttachmentsController$requestCameraPermissions$1;
        int i;
        PermissionState permissionState;
        PermissionState permissionState2;
        if (continuationImpl instanceof SystemAttachmentsController$requestCameraPermissions$1) {
            systemAttachmentsController$requestCameraPermissions$1 = (SystemAttachmentsController$requestCameraPermissions$1) continuationImpl;
            int i2 = systemAttachmentsController$requestCameraPermissions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                systemAttachmentsController$requestCameraPermissions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = systemAttachmentsController$requestCameraPermissions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = systemAttachmentsController$requestCameraPermissions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Permission permission = Permission.CAMERA;
                    int i3 = oyh0.messaging_blocked_camera_permission_call_text;
                    systemAttachmentsController$requestCameraPermissions$1.L$0 = this;
                    systemAttachmentsController$requestCameraPermissions$1.label = 1;
                    obj = wh91.c(this.d, permission, 13, i3, systemAttachmentsController$requestCameraPermissions$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        permissionState2 = (PermissionState) systemAttachmentsController$requestCameraPermissions$1.L$0;
                        kotlin.b.b(obj);
                        permissionState = (PermissionState) obj;
                        PermissionState permissionState3 = PermissionState.GRANTED;
                        return Boolean.valueOf(permissionState2 != permissionState3 && permissionState == permissionState3);
                    }
                    this = (e) systemAttachmentsController$requestCameraPermissions$1.L$0;
                    kotlin.b.b(obj);
                }
                PermissionState permissionState4 = (PermissionState) obj;
                if (Build.VERSION.SDK_INT < 30) {
                    permissionState = PermissionState.GRANTED;
                    permissionState2 = permissionState4;
                    PermissionState permissionState32 = PermissionState.GRANTED;
                    return Boolean.valueOf(permissionState2 != permissionState32 && permissionState == permissionState32);
                }
                com.yandex.alicekit.core.permissions.b bVar = this.d;
                Permission permission2 = Permission.WRITE_EXTERNAL_STORAGE;
                int i4 = oyh0.disk_permission_blocked_message;
                systemAttachmentsController$requestCameraPermissions$1.L$0 = permissionState4;
                systemAttachmentsController$requestCameraPermissions$1.label = 2;
                Object c = wh91.c(bVar, permission2, 42, i4, systemAttachmentsController$requestCameraPermissions$1);
                if (c != coroutineSingletons) {
                    obj = c;
                    permissionState2 = permissionState4;
                    permissionState = (PermissionState) obj;
                    PermissionState permissionState322 = PermissionState.GRANTED;
                    return Boolean.valueOf(permissionState2 != permissionState322 && permissionState == permissionState322);
                }
                return coroutineSingletons;
            }
        }
        systemAttachmentsController$requestCameraPermissions$1 = new SystemAttachmentsController$requestCameraPermissions$1(this, continuationImpl);
        Object obj2 = systemAttachmentsController$requestCameraPermissions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = systemAttachmentsController$requestCameraPermissions$1.label;
        if (i != 0) {
        }
        PermissionState permissionState42 = (PermissionState) obj2;
        if (Build.VERSION.SDK_INT < 30) {
        }
    }

    public final void c(kc3 kc3Var, wls wlsVar) {
        tje.N(this.b.a(this.a), null, null, new SystemAttachmentsController$showAttachmentsChooser$1(this, kc3Var, wlsVar, null), 3);
    }
}
