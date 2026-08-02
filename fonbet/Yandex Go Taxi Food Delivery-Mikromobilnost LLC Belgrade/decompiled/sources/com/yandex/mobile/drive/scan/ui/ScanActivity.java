package com.yandex.mobile.drive.scan.ui;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.mobile.drive.scan.ScanResult;
import com.yandex.mobile.drive.scan.service.e;
import com.yandex.mobile.drive.scan.service.f;
import com.yandex.mobile.drive.scan.ui.ScanActivity;
import com.yandex.mobile.drive.scan.ui.b;
import com.yandex.mobile.drive.view.AlertView;
import defpackage.bgc;
import defpackage.bvf0;
import defpackage.dph0;
import defpackage.glm0;
import defpackage.h651;
import defpackage.i3y;
import defpackage.ike;
import defpackage.ir1;
import defpackage.irb0;
import defpackage.jl40;
import defpackage.n7p;
import defpackage.ny61;
import defpackage.o751;
import defpackage.p751;
import defpackage.pdy;
import defpackage.q751;
import defpackage.qc;
import defpackage.qke;
import defpackage.sls;
import defpackage.ss7;
import defpackage.tls;
import defpackage.ulm0;
import defpackage.va90;
import defpackage.vam0;
import defpackage.vlm0;
import defpackage.zd00;
import defpackage.zgh0;
import defpackage.zy11;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001LB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0003J\u001f\u0010!\u001a\u00020\u00062\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b!\u0010\u001fR+\u0010)\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010+\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010,R\u001b\u00100\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010,R\u001d\u00104\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u00103R\u001d\u00107\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u00103R\u001d\u0010:\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b9\u00103R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010&\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/yandex/mobile/drive/scan/ui/ScanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "onDestroy", "", "keyCode", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "Lcom/yandex/mobile/drive/scan/ScanResult;", "scans", "toPreviousScreenWithResult", "(Ljava/util/List;)V", "toPreviousScreen", "publishResult", "Ljava/util/ArrayList;", "Lcom/yandex/mobile/drive/scan/ui/ScanMeta;", "Lkotlin/collections/ArrayList;", "photoMeta$delegate", "Li3y;", "getPhotoMeta", "()Ljava/util/ArrayList;", ScanActivity.keyPhotoMeta, "isFaceDetectorEnabled$delegate", "isFaceDetectorEnabled", "()Z", "isFlutterVideoUploadEnabled$delegate", "isFlutterVideoUploadEnabled", "isChatService$delegate", ScanActivity.keyIsChatService, "permissionMessage$delegate", "getPermissionMessage", "()Ljava/lang/String;", ScanActivity.keyPermissionMessage, "noFaceSelfieAlertTitle$delegate", "getNoFaceSelfieAlertTitle", ScanActivity.keyNoFaceSelfieAlertTitle, "noFaceSelfieAlertSubtitle$delegate", "getNoFaceSelfieAlertSubtitle", ScanActivity.keyNoFaceSelfieAlertSubtitle, "Lir1;", "alertDialog$delegate", "getAlertDialog", "()Lir1;", "alertDialog", "Lzd00;", "volumeClicks", "Lzd00;", "Lcom/yandex/mobile/drive/scan/ui/c;", "scanView", "Lcom/yandex/mobile/drive/scan/ui/c;", "Lcom/yandex/mobile/drive/scan/ui/b;", "scanPresenter$delegate", "getScanPresenter", "()Lcom/yandex/mobile/drive/scan/ui/b;", "scanPresenter", "Companion", "glm0", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ScanActivity extends AppCompatActivity {
    public static final glm0 Companion = new glm0();
    private static n7p _faceDetector = null;
    private static final String keyAttachments = "attachments";
    private static final String keyIsChatService = "isChatService";
    private static final String keyIsFaceDetectorEnabled = "faceDetectorEnabled";
    private static final String keyIsFlutterVideoUploadEnabled = "flutterVideoUploadEnabled";
    private static final String keyNoFaceSelfieAlertSubtitle = "noFaceSelfieAlertSubtitle";
    private static final String keyNoFaceSelfieAlertTitle = "noFaceSelfieAlertTitle";
    private static final String keyPermissionMessage = "permissionMessage";
    private static final String keyPhotoMeta = "photoMeta";
    private static sls onGetFaceDetector;

    /* renamed from: alertDialog$delegate, reason: from kotlin metadata */
    private final i3y alertDialog;

    /* renamed from: isChatService$delegate, reason: from kotlin metadata */
    private final i3y isChatService;

    /* renamed from: isFaceDetectorEnabled$delegate, reason: from kotlin metadata */
    private final i3y isFaceDetectorEnabled;

    /* renamed from: isFlutterVideoUploadEnabled$delegate, reason: from kotlin metadata */
    private final i3y isFlutterVideoUploadEnabled;

    /* renamed from: noFaceSelfieAlertSubtitle$delegate, reason: from kotlin metadata */
    private final i3y noFaceSelfieAlertSubtitle;

    /* renamed from: noFaceSelfieAlertTitle$delegate, reason: from kotlin metadata */
    private final i3y noFaceSelfieAlertTitle;

    /* renamed from: permissionMessage$delegate, reason: from kotlin metadata */
    private final i3y permissionMessage;

    /* renamed from: photoMeta$delegate, reason: from kotlin metadata */
    private final i3y photoMeta;

    /* renamed from: scanPresenter$delegate, reason: from kotlin metadata */
    private final i3y scanPresenter;
    private c scanView;
    private final zd00 volumeClicks = new zd00(0);

    public ScanActivity() {
        final int i = 0;
        this.photoMeta = kotlin.a.a(new sls(this) { // from class: flm0
            public final /* synthetic */ ScanActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ArrayList photoMeta_delegate$lambda$0;
                boolean isFaceDetectorEnabled_delegate$lambda$1;
                String permissionMessage_delegate$lambda$4;
                String noFaceSelfieAlertTitle_delegate$lambda$5;
                String noFaceSelfieAlertSubtitle_delegate$lambda$6;
                ir1 alertDialog_delegate$lambda$7;
                b scanPresenter_delegate$lambda$9;
                int i2 = i;
                ScanActivity scanActivity = this.b;
                switch (i2) {
                    case 0:
                        photoMeta_delegate$lambda$0 = ScanActivity.photoMeta_delegate$lambda$0(scanActivity);
                        return photoMeta_delegate$lambda$0;
                    case 1:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFaceDetectorEnabled_delegate$lambda$1(scanActivity);
                        break;
                    case 2:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFlutterVideoUploadEnabled_delegate$lambda$2(scanActivity);
                        break;
                    case 3:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isChatService_delegate$lambda$3(scanActivity);
                        break;
                    case 4:
                        permissionMessage_delegate$lambda$4 = ScanActivity.permissionMessage_delegate$lambda$4(scanActivity);
                        return permissionMessage_delegate$lambda$4;
                    case 5:
                        noFaceSelfieAlertTitle_delegate$lambda$5 = ScanActivity.noFaceSelfieAlertTitle_delegate$lambda$5(scanActivity);
                        return noFaceSelfieAlertTitle_delegate$lambda$5;
                    case 6:
                        noFaceSelfieAlertSubtitle_delegate$lambda$6 = ScanActivity.noFaceSelfieAlertSubtitle_delegate$lambda$6(scanActivity);
                        return noFaceSelfieAlertSubtitle_delegate$lambda$6;
                    case 7:
                        alertDialog_delegate$lambda$7 = ScanActivity.alertDialog_delegate$lambda$7(scanActivity);
                        return alertDialog_delegate$lambda$7;
                    default:
                        scanPresenter_delegate$lambda$9 = ScanActivity.scanPresenter_delegate$lambda$9(scanActivity);
                        return scanPresenter_delegate$lambda$9;
                }
                return Boolean.valueOf(isFaceDetectorEnabled_delegate$lambda$1);
            }
        });
        final int i2 = 1;
        this.isFaceDetectorEnabled = kotlin.a.a(new sls(this) { // from class: flm0
            public final /* synthetic */ ScanActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ArrayList photoMeta_delegate$lambda$0;
                boolean isFaceDetectorEnabled_delegate$lambda$1;
                String permissionMessage_delegate$lambda$4;
                String noFaceSelfieAlertTitle_delegate$lambda$5;
                String noFaceSelfieAlertSubtitle_delegate$lambda$6;
                ir1 alertDialog_delegate$lambda$7;
                b scanPresenter_delegate$lambda$9;
                int i22 = i2;
                ScanActivity scanActivity = this.b;
                switch (i22) {
                    case 0:
                        photoMeta_delegate$lambda$0 = ScanActivity.photoMeta_delegate$lambda$0(scanActivity);
                        return photoMeta_delegate$lambda$0;
                    case 1:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFaceDetectorEnabled_delegate$lambda$1(scanActivity);
                        break;
                    case 2:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFlutterVideoUploadEnabled_delegate$lambda$2(scanActivity);
                        break;
                    case 3:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isChatService_delegate$lambda$3(scanActivity);
                        break;
                    case 4:
                        permissionMessage_delegate$lambda$4 = ScanActivity.permissionMessage_delegate$lambda$4(scanActivity);
                        return permissionMessage_delegate$lambda$4;
                    case 5:
                        noFaceSelfieAlertTitle_delegate$lambda$5 = ScanActivity.noFaceSelfieAlertTitle_delegate$lambda$5(scanActivity);
                        return noFaceSelfieAlertTitle_delegate$lambda$5;
                    case 6:
                        noFaceSelfieAlertSubtitle_delegate$lambda$6 = ScanActivity.noFaceSelfieAlertSubtitle_delegate$lambda$6(scanActivity);
                        return noFaceSelfieAlertSubtitle_delegate$lambda$6;
                    case 7:
                        alertDialog_delegate$lambda$7 = ScanActivity.alertDialog_delegate$lambda$7(scanActivity);
                        return alertDialog_delegate$lambda$7;
                    default:
                        scanPresenter_delegate$lambda$9 = ScanActivity.scanPresenter_delegate$lambda$9(scanActivity);
                        return scanPresenter_delegate$lambda$9;
                }
                return Boolean.valueOf(isFaceDetectorEnabled_delegate$lambda$1);
            }
        });
        final int i3 = 2;
        this.isFlutterVideoUploadEnabled = kotlin.a.a(new sls(this) { // from class: flm0
            public final /* synthetic */ ScanActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ArrayList photoMeta_delegate$lambda$0;
                boolean isFaceDetectorEnabled_delegate$lambda$1;
                String permissionMessage_delegate$lambda$4;
                String noFaceSelfieAlertTitle_delegate$lambda$5;
                String noFaceSelfieAlertSubtitle_delegate$lambda$6;
                ir1 alertDialog_delegate$lambda$7;
                b scanPresenter_delegate$lambda$9;
                int i22 = i3;
                ScanActivity scanActivity = this.b;
                switch (i22) {
                    case 0:
                        photoMeta_delegate$lambda$0 = ScanActivity.photoMeta_delegate$lambda$0(scanActivity);
                        return photoMeta_delegate$lambda$0;
                    case 1:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFaceDetectorEnabled_delegate$lambda$1(scanActivity);
                        break;
                    case 2:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFlutterVideoUploadEnabled_delegate$lambda$2(scanActivity);
                        break;
                    case 3:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isChatService_delegate$lambda$3(scanActivity);
                        break;
                    case 4:
                        permissionMessage_delegate$lambda$4 = ScanActivity.permissionMessage_delegate$lambda$4(scanActivity);
                        return permissionMessage_delegate$lambda$4;
                    case 5:
                        noFaceSelfieAlertTitle_delegate$lambda$5 = ScanActivity.noFaceSelfieAlertTitle_delegate$lambda$5(scanActivity);
                        return noFaceSelfieAlertTitle_delegate$lambda$5;
                    case 6:
                        noFaceSelfieAlertSubtitle_delegate$lambda$6 = ScanActivity.noFaceSelfieAlertSubtitle_delegate$lambda$6(scanActivity);
                        return noFaceSelfieAlertSubtitle_delegate$lambda$6;
                    case 7:
                        alertDialog_delegate$lambda$7 = ScanActivity.alertDialog_delegate$lambda$7(scanActivity);
                        return alertDialog_delegate$lambda$7;
                    default:
                        scanPresenter_delegate$lambda$9 = ScanActivity.scanPresenter_delegate$lambda$9(scanActivity);
                        return scanPresenter_delegate$lambda$9;
                }
                return Boolean.valueOf(isFaceDetectorEnabled_delegate$lambda$1);
            }
        });
        final int i4 = 3;
        this.isChatService = kotlin.a.a(new sls(this) { // from class: flm0
            public final /* synthetic */ ScanActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ArrayList photoMeta_delegate$lambda$0;
                boolean isFaceDetectorEnabled_delegate$lambda$1;
                String permissionMessage_delegate$lambda$4;
                String noFaceSelfieAlertTitle_delegate$lambda$5;
                String noFaceSelfieAlertSubtitle_delegate$lambda$6;
                ir1 alertDialog_delegate$lambda$7;
                b scanPresenter_delegate$lambda$9;
                int i22 = i4;
                ScanActivity scanActivity = this.b;
                switch (i22) {
                    case 0:
                        photoMeta_delegate$lambda$0 = ScanActivity.photoMeta_delegate$lambda$0(scanActivity);
                        return photoMeta_delegate$lambda$0;
                    case 1:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFaceDetectorEnabled_delegate$lambda$1(scanActivity);
                        break;
                    case 2:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFlutterVideoUploadEnabled_delegate$lambda$2(scanActivity);
                        break;
                    case 3:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isChatService_delegate$lambda$3(scanActivity);
                        break;
                    case 4:
                        permissionMessage_delegate$lambda$4 = ScanActivity.permissionMessage_delegate$lambda$4(scanActivity);
                        return permissionMessage_delegate$lambda$4;
                    case 5:
                        noFaceSelfieAlertTitle_delegate$lambda$5 = ScanActivity.noFaceSelfieAlertTitle_delegate$lambda$5(scanActivity);
                        return noFaceSelfieAlertTitle_delegate$lambda$5;
                    case 6:
                        noFaceSelfieAlertSubtitle_delegate$lambda$6 = ScanActivity.noFaceSelfieAlertSubtitle_delegate$lambda$6(scanActivity);
                        return noFaceSelfieAlertSubtitle_delegate$lambda$6;
                    case 7:
                        alertDialog_delegate$lambda$7 = ScanActivity.alertDialog_delegate$lambda$7(scanActivity);
                        return alertDialog_delegate$lambda$7;
                    default:
                        scanPresenter_delegate$lambda$9 = ScanActivity.scanPresenter_delegate$lambda$9(scanActivity);
                        return scanPresenter_delegate$lambda$9;
                }
                return Boolean.valueOf(isFaceDetectorEnabled_delegate$lambda$1);
            }
        });
        final int i5 = 4;
        this.permissionMessage = kotlin.a.a(new sls(this) { // from class: flm0
            public final /* synthetic */ ScanActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ArrayList photoMeta_delegate$lambda$0;
                boolean isFaceDetectorEnabled_delegate$lambda$1;
                String permissionMessage_delegate$lambda$4;
                String noFaceSelfieAlertTitle_delegate$lambda$5;
                String noFaceSelfieAlertSubtitle_delegate$lambda$6;
                ir1 alertDialog_delegate$lambda$7;
                b scanPresenter_delegate$lambda$9;
                int i22 = i5;
                ScanActivity scanActivity = this.b;
                switch (i22) {
                    case 0:
                        photoMeta_delegate$lambda$0 = ScanActivity.photoMeta_delegate$lambda$0(scanActivity);
                        return photoMeta_delegate$lambda$0;
                    case 1:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFaceDetectorEnabled_delegate$lambda$1(scanActivity);
                        break;
                    case 2:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFlutterVideoUploadEnabled_delegate$lambda$2(scanActivity);
                        break;
                    case 3:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isChatService_delegate$lambda$3(scanActivity);
                        break;
                    case 4:
                        permissionMessage_delegate$lambda$4 = ScanActivity.permissionMessage_delegate$lambda$4(scanActivity);
                        return permissionMessage_delegate$lambda$4;
                    case 5:
                        noFaceSelfieAlertTitle_delegate$lambda$5 = ScanActivity.noFaceSelfieAlertTitle_delegate$lambda$5(scanActivity);
                        return noFaceSelfieAlertTitle_delegate$lambda$5;
                    case 6:
                        noFaceSelfieAlertSubtitle_delegate$lambda$6 = ScanActivity.noFaceSelfieAlertSubtitle_delegate$lambda$6(scanActivity);
                        return noFaceSelfieAlertSubtitle_delegate$lambda$6;
                    case 7:
                        alertDialog_delegate$lambda$7 = ScanActivity.alertDialog_delegate$lambda$7(scanActivity);
                        return alertDialog_delegate$lambda$7;
                    default:
                        scanPresenter_delegate$lambda$9 = ScanActivity.scanPresenter_delegate$lambda$9(scanActivity);
                        return scanPresenter_delegate$lambda$9;
                }
                return Boolean.valueOf(isFaceDetectorEnabled_delegate$lambda$1);
            }
        });
        final int i6 = 5;
        this.noFaceSelfieAlertTitle = kotlin.a.a(new sls(this) { // from class: flm0
            public final /* synthetic */ ScanActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ArrayList photoMeta_delegate$lambda$0;
                boolean isFaceDetectorEnabled_delegate$lambda$1;
                String permissionMessage_delegate$lambda$4;
                String noFaceSelfieAlertTitle_delegate$lambda$5;
                String noFaceSelfieAlertSubtitle_delegate$lambda$6;
                ir1 alertDialog_delegate$lambda$7;
                b scanPresenter_delegate$lambda$9;
                int i22 = i6;
                ScanActivity scanActivity = this.b;
                switch (i22) {
                    case 0:
                        photoMeta_delegate$lambda$0 = ScanActivity.photoMeta_delegate$lambda$0(scanActivity);
                        return photoMeta_delegate$lambda$0;
                    case 1:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFaceDetectorEnabled_delegate$lambda$1(scanActivity);
                        break;
                    case 2:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFlutterVideoUploadEnabled_delegate$lambda$2(scanActivity);
                        break;
                    case 3:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isChatService_delegate$lambda$3(scanActivity);
                        break;
                    case 4:
                        permissionMessage_delegate$lambda$4 = ScanActivity.permissionMessage_delegate$lambda$4(scanActivity);
                        return permissionMessage_delegate$lambda$4;
                    case 5:
                        noFaceSelfieAlertTitle_delegate$lambda$5 = ScanActivity.noFaceSelfieAlertTitle_delegate$lambda$5(scanActivity);
                        return noFaceSelfieAlertTitle_delegate$lambda$5;
                    case 6:
                        noFaceSelfieAlertSubtitle_delegate$lambda$6 = ScanActivity.noFaceSelfieAlertSubtitle_delegate$lambda$6(scanActivity);
                        return noFaceSelfieAlertSubtitle_delegate$lambda$6;
                    case 7:
                        alertDialog_delegate$lambda$7 = ScanActivity.alertDialog_delegate$lambda$7(scanActivity);
                        return alertDialog_delegate$lambda$7;
                    default:
                        scanPresenter_delegate$lambda$9 = ScanActivity.scanPresenter_delegate$lambda$9(scanActivity);
                        return scanPresenter_delegate$lambda$9;
                }
                return Boolean.valueOf(isFaceDetectorEnabled_delegate$lambda$1);
            }
        });
        final int i7 = 6;
        this.noFaceSelfieAlertSubtitle = kotlin.a.a(new sls(this) { // from class: flm0
            public final /* synthetic */ ScanActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ArrayList photoMeta_delegate$lambda$0;
                boolean isFaceDetectorEnabled_delegate$lambda$1;
                String permissionMessage_delegate$lambda$4;
                String noFaceSelfieAlertTitle_delegate$lambda$5;
                String noFaceSelfieAlertSubtitle_delegate$lambda$6;
                ir1 alertDialog_delegate$lambda$7;
                b scanPresenter_delegate$lambda$9;
                int i22 = i7;
                ScanActivity scanActivity = this.b;
                switch (i22) {
                    case 0:
                        photoMeta_delegate$lambda$0 = ScanActivity.photoMeta_delegate$lambda$0(scanActivity);
                        return photoMeta_delegate$lambda$0;
                    case 1:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFaceDetectorEnabled_delegate$lambda$1(scanActivity);
                        break;
                    case 2:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFlutterVideoUploadEnabled_delegate$lambda$2(scanActivity);
                        break;
                    case 3:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isChatService_delegate$lambda$3(scanActivity);
                        break;
                    case 4:
                        permissionMessage_delegate$lambda$4 = ScanActivity.permissionMessage_delegate$lambda$4(scanActivity);
                        return permissionMessage_delegate$lambda$4;
                    case 5:
                        noFaceSelfieAlertTitle_delegate$lambda$5 = ScanActivity.noFaceSelfieAlertTitle_delegate$lambda$5(scanActivity);
                        return noFaceSelfieAlertTitle_delegate$lambda$5;
                    case 6:
                        noFaceSelfieAlertSubtitle_delegate$lambda$6 = ScanActivity.noFaceSelfieAlertSubtitle_delegate$lambda$6(scanActivity);
                        return noFaceSelfieAlertSubtitle_delegate$lambda$6;
                    case 7:
                        alertDialog_delegate$lambda$7 = ScanActivity.alertDialog_delegate$lambda$7(scanActivity);
                        return alertDialog_delegate$lambda$7;
                    default:
                        scanPresenter_delegate$lambda$9 = ScanActivity.scanPresenter_delegate$lambda$9(scanActivity);
                        return scanPresenter_delegate$lambda$9;
                }
                return Boolean.valueOf(isFaceDetectorEnabled_delegate$lambda$1);
            }
        });
        final int i8 = 7;
        this.alertDialog = kotlin.a.a(new sls(this) { // from class: flm0
            public final /* synthetic */ ScanActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ArrayList photoMeta_delegate$lambda$0;
                boolean isFaceDetectorEnabled_delegate$lambda$1;
                String permissionMessage_delegate$lambda$4;
                String noFaceSelfieAlertTitle_delegate$lambda$5;
                String noFaceSelfieAlertSubtitle_delegate$lambda$6;
                ir1 alertDialog_delegate$lambda$7;
                b scanPresenter_delegate$lambda$9;
                int i22 = i8;
                ScanActivity scanActivity = this.b;
                switch (i22) {
                    case 0:
                        photoMeta_delegate$lambda$0 = ScanActivity.photoMeta_delegate$lambda$0(scanActivity);
                        return photoMeta_delegate$lambda$0;
                    case 1:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFaceDetectorEnabled_delegate$lambda$1(scanActivity);
                        break;
                    case 2:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFlutterVideoUploadEnabled_delegate$lambda$2(scanActivity);
                        break;
                    case 3:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isChatService_delegate$lambda$3(scanActivity);
                        break;
                    case 4:
                        permissionMessage_delegate$lambda$4 = ScanActivity.permissionMessage_delegate$lambda$4(scanActivity);
                        return permissionMessage_delegate$lambda$4;
                    case 5:
                        noFaceSelfieAlertTitle_delegate$lambda$5 = ScanActivity.noFaceSelfieAlertTitle_delegate$lambda$5(scanActivity);
                        return noFaceSelfieAlertTitle_delegate$lambda$5;
                    case 6:
                        noFaceSelfieAlertSubtitle_delegate$lambda$6 = ScanActivity.noFaceSelfieAlertSubtitle_delegate$lambda$6(scanActivity);
                        return noFaceSelfieAlertSubtitle_delegate$lambda$6;
                    case 7:
                        alertDialog_delegate$lambda$7 = ScanActivity.alertDialog_delegate$lambda$7(scanActivity);
                        return alertDialog_delegate$lambda$7;
                    default:
                        scanPresenter_delegate$lambda$9 = ScanActivity.scanPresenter_delegate$lambda$9(scanActivity);
                        return scanPresenter_delegate$lambda$9;
                }
                return Boolean.valueOf(isFaceDetectorEnabled_delegate$lambda$1);
            }
        });
        final int i9 = 8;
        this.scanPresenter = kotlin.a.a(new sls(this) { // from class: flm0
            public final /* synthetic */ ScanActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ArrayList photoMeta_delegate$lambda$0;
                boolean isFaceDetectorEnabled_delegate$lambda$1;
                String permissionMessage_delegate$lambda$4;
                String noFaceSelfieAlertTitle_delegate$lambda$5;
                String noFaceSelfieAlertSubtitle_delegate$lambda$6;
                ir1 alertDialog_delegate$lambda$7;
                b scanPresenter_delegate$lambda$9;
                int i22 = i9;
                ScanActivity scanActivity = this.b;
                switch (i22) {
                    case 0:
                        photoMeta_delegate$lambda$0 = ScanActivity.photoMeta_delegate$lambda$0(scanActivity);
                        return photoMeta_delegate$lambda$0;
                    case 1:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFaceDetectorEnabled_delegate$lambda$1(scanActivity);
                        break;
                    case 2:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isFlutterVideoUploadEnabled_delegate$lambda$2(scanActivity);
                        break;
                    case 3:
                        isFaceDetectorEnabled_delegate$lambda$1 = ScanActivity.isChatService_delegate$lambda$3(scanActivity);
                        break;
                    case 4:
                        permissionMessage_delegate$lambda$4 = ScanActivity.permissionMessage_delegate$lambda$4(scanActivity);
                        return permissionMessage_delegate$lambda$4;
                    case 5:
                        noFaceSelfieAlertTitle_delegate$lambda$5 = ScanActivity.noFaceSelfieAlertTitle_delegate$lambda$5(scanActivity);
                        return noFaceSelfieAlertTitle_delegate$lambda$5;
                    case 6:
                        noFaceSelfieAlertSubtitle_delegate$lambda$6 = ScanActivity.noFaceSelfieAlertSubtitle_delegate$lambda$6(scanActivity);
                        return noFaceSelfieAlertSubtitle_delegate$lambda$6;
                    case 7:
                        alertDialog_delegate$lambda$7 = ScanActivity.alertDialog_delegate$lambda$7(scanActivity);
                        return alertDialog_delegate$lambda$7;
                    default:
                        scanPresenter_delegate$lambda$9 = ScanActivity.scanPresenter_delegate$lambda$9(scanActivity);
                        return scanPresenter_delegate$lambda$9;
                }
                return Boolean.valueOf(isFaceDetectorEnabled_delegate$lambda$1);
            }
        });
    }

    public static final /* synthetic */ n7p access$get_faceDetector$cp() {
        return null;
    }

    public static final /* synthetic */ void access$set_faceDetector$cp(n7p n7pVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ir1 alertDialog_delegate$lambda$7(ScanActivity scanActivity) {
        return new ir1(scanActivity, new h651(scanActivity.getWindow()), scanActivity.getOnBackPressedDispatcher());
    }

    private final ir1 getAlertDialog() {
        return (ir1) this.alertDialog.getValue();
    }

    private final String getNoFaceSelfieAlertSubtitle() {
        return (String) this.noFaceSelfieAlertSubtitle.getValue();
    }

    private final String getNoFaceSelfieAlertTitle() {
        return (String) this.noFaceSelfieAlertTitle.getValue();
    }

    private final String getPermissionMessage() {
        return (String) this.permissionMessage.getValue();
    }

    private final ArrayList<ScanMeta> getPhotoMeta() {
        return (ArrayList) this.photoMeta.getValue();
    }

    private final b getScanPresenter() {
        return (b) this.scanPresenter.getValue();
    }

    private final boolean isChatService() {
        return ((Boolean) this.isChatService.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isChatService_delegate$lambda$3(ScanActivity scanActivity) {
        return scanActivity.getIntent().getBooleanExtra(keyIsChatService, false);
    }

    private final boolean isFaceDetectorEnabled() {
        return ((Boolean) this.isFaceDetectorEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFaceDetectorEnabled_delegate$lambda$1(ScanActivity scanActivity) {
        return scanActivity.getIntent().getBooleanExtra(keyIsFaceDetectorEnabled, false);
    }

    private final boolean isFlutterVideoUploadEnabled() {
        return ((Boolean) this.isFlutterVideoUploadEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFlutterVideoUploadEnabled_delegate$lambda$2(ScanActivity scanActivity) {
        return scanActivity.getIntent().getBooleanExtra(keyIsFlutterVideoUploadEnabled, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String noFaceSelfieAlertSubtitle_delegate$lambda$6(ScanActivity scanActivity) {
        return scanActivity.getIntent().getStringExtra(keyNoFaceSelfieAlertSubtitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String noFaceSelfieAlertTitle_delegate$lambda$5(ScanActivity scanActivity) {
        return scanActivity.getIntent().getStringExtra(keyNoFaceSelfieAlertTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String permissionMessage_delegate$lambda$4(ScanActivity scanActivity) {
        return scanActivity.getIntent().getStringExtra(keyPermissionMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList photoMeta_delegate$lambda$0(ScanActivity scanActivity) {
        ArrayList parcelableArrayListExtra;
        Intent intent = scanActivity.getIntent();
        if (Build.VERSION.SDK_INT < 33) {
            return intent.getParcelableArrayListExtra(keyPhotoMeta);
        }
        try {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("photoMeta", ScanMeta.class);
            return parcelableArrayListExtra;
        } catch (NullPointerException unused) {
            return intent.getParcelableArrayListExtra(keyPhotoMeta);
        }
    }

    private final void publishResult(List<ScanResult> scans) {
        if (scans != null) {
            setResult(-1, new Intent().putParcelableArrayListExtra(keyAttachments, new ArrayList<>(scans)));
        } else {
            setResult(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b scanPresenter_delegate$lambda$9(ScanActivity scanActivity) {
        irb0 eVar;
        Context applicationContext = scanActivity.getApplicationContext();
        File file = new File(applicationContext.getFilesDir(), "scan");
        file.mkdirs();
        boolean isFaceDetectorEnabled = scanActivity.isFaceDetectorEnabled();
        Window window = scanActivity.getWindow();
        if (!scanActivity.isChatService()) {
            glm0.a(Companion);
            eVar = new e(new com.yandex.mobile.drive.scan.dao.a(), scanActivity.getAlertDialog(), scanActivity.getNoFaceSelfieAlertTitle(), scanActivity.getNoFaceSelfieAlertSubtitle());
        } else if (scanActivity.isFlutterVideoUploadEnabled()) {
            glm0.a(Companion);
            eVar = new com.yandex.mobile.drive.scan.service.c(new com.yandex.mobile.drive.scan.dao.a(), scanActivity.getAlertDialog(), scanActivity.getNoFaceSelfieAlertTitle(), scanActivity.getNoFaceSelfieAlertSubtitle(), file);
        } else {
            glm0.a(Companion);
            eVar = new com.yandex.mobile.drive.scan.service.b(new com.yandex.mobile.drive.scan.dao.a(), scanActivity.getAlertDialog(), scanActivity.getNoFaceSelfieAlertTitle(), scanActivity.getNoFaceSelfieAlertSubtitle(), file);
        }
        return new b(applicationContext, isFaceDetectorEnabled, window, scanActivity, file, scanActivity, new f(eVar, scanActivity.getPhotoMeta()), scanActivity.getOnBackPressedDispatcher(), scanActivity.volumeClicks, scanActivity.getAlertDialog());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(dph0.activity_scan);
        int i = 0;
        jl40.L(getWindow(), false);
        getWindow().setNavigationBarColor(0);
        Window window = getWindow();
        va90 va90Var = new va90(getWindow().getDecorView().findViewById(R.id.content));
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 35 ? new q751(window, va90Var) : i2 >= 30 ? new p751(window, va90Var) : new o751(window, va90Var)).T(false);
        ViewGroup viewGroup = (ViewGroup) findViewById(zgh0.root);
        this.scanView = new c(viewGroup, getPermissionMessage());
        b scanPresenter = getScanPresenter();
        c cVar = this.scanView;
        if (cVar == null) {
            cVar = null;
        }
        if (scanPresenter.a != null) {
            ny61.g("already attached");
            return;
        }
        scanPresenter.a = cVar;
        scanPresenter.o = bvf0.b();
        scanPresenter.j.a(scanPresenter.f, new qc(18, scanPresenter));
        final ulm0 ulm0Var = new ulm0(scanPresenter, 0);
        ss7.a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: rs7
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                if (th instanceof NullPointerException) {
                    ulm0.this.invoke();
                    return;
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = ss7.a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        });
        cVar.t.setListener(new vlm0(scanPresenter, i));
        cVar.u.setListener(new vlm0(scanPresenter, 1));
        cVar.v.setListener(new vam0(10, scanPresenter, cVar));
        cVar.w.setListener(new vlm0(scanPresenter, 2));
        cVar.x.setListener(new vlm0(scanPresenter, 3));
        cVar.y.setListener(new vlm0(scanPresenter, 4));
        cVar.z.setListener(new vlm0(scanPresenter, 5));
        cVar.A.setListener(new vlm0(scanPresenter, 6));
        getAlertDialog().f = viewGroup;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        b scanPresenter = getScanPresenter();
        c cVar = scanPresenter.a;
        if (cVar != null) {
            ExecutorService executorService = scanPresenter.z;
            ike ikeVar = scanPresenter.o;
            if (ikeVar != null) {
                bvf0.j(ikeVar, null);
            }
            scanPresenter.o = null;
            scanPresenter.k.setListener(null);
            scanPresenter.n.invoke();
            scanPresenter.n = new bgc(12);
            kotlinx.coroutines.a.g(cVar.B.a, null);
            executorService.shutdown();
            executorService.awaitTermination(1000L, TimeUnit.MILLISECONDS);
            pdy pdyVar = scanPresenter.q;
            if (pdyVar != null) {
                pdyVar.z();
            }
            Thread.setDefaultUncaughtExceptionHandler(ss7.a);
            scanPresenter.a = null;
            scanPresenter.b.remove();
        }
        ir1 alertDialog = getAlertDialog();
        alertDialog.f = null;
        AlertView alertView = alertDialog.g;
        if (alertView != null) {
            ViewParent parent = alertView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(alertView);
            }
        }
        AlertView alertView2 = alertDialog.g;
        if (alertView2 != null) {
            alertView2.destroy();
        }
        alertDialog.g = null;
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != 24 && keyCode != 25) {
            return super.onKeyDown(keyCode, event);
        }
        tls tlsVar = this.volumeClicks.b;
        if (tlsVar == null) {
            return false;
        }
        tlsVar.invoke(zy11.a);
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        boolean z = qke.h(this, "android.permission.CAMERA") == 0;
        c cVar = this.scanView;
        if (!z) {
            if (cVar == null) {
                cVar = null;
            }
            cVar.b(true);
        } else {
            if (cVar == null) {
                cVar = null;
            }
            cVar.b(false);
            getScanPresenter().g();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (qke.h(this, "android.permission.CAMERA") != 0) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 0);
            return;
        }
        c cVar = this.scanView;
        if (cVar == null) {
            cVar = null;
        }
        cVar.b(false);
        getScanPresenter().g();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getScanPresenter().getClass();
    }

    public void toPreviousScreen() {
        publishResult(null);
        finish();
    }

    public void toPreviousScreenWithResult(List<ScanResult> scans) {
        publishResult(scans);
        finish();
    }
}
