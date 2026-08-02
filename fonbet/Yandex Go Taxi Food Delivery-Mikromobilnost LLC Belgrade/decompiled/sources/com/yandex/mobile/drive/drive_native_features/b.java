package com.yandex.mobile.drive.drive_native_features;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.mobile.drive.scan.ScanMode$DriverLicense$LicenseSide;
import com.yandex.mobile.drive.scan.ScanMode$Passport$PassportPage;
import com.yandex.mobile.drive.scan.ScanMode$Selfie$SelfieWith;
import com.yandex.mobile.drive.scan.ScanReason;
import com.yandex.mobile.drive.scan.ScanResult;
import com.yandex.mobile.drive.scan.ui.CameraPattern;
import com.yandex.mobile.drive.scan.ui.ScanActivity;
import com.yandex.mobile.drive.scan.ui.ScanMeta;
import defpackage.ba20;
import defpackage.bcz;
import defpackage.bvf0;
import defpackage.c0m;
import defpackage.ca20;
import defpackage.da20;
import defpackage.dfm;
import defpackage.ea20;
import defpackage.ffm;
import defpackage.ffx;
import defpackage.glm0;
import defpackage.ike;
import defpackage.jdj;
import defpackage.jl40;
import defpackage.klb1;
import defpackage.l0b1;
import defpackage.l40;
import defpackage.ny61;
import defpackage.nzc0;
import defpackage.plm0;
import defpackage.qlm0;
import defpackage.qsr;
import defpackage.r30;
import defpackage.rlm0;
import defpackage.scc;
import defpackage.slm0;
import defpackage.ssr;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tlm0;
import defpackage.tsr;
import defpackage.w511;
import defpackage.wrr;
import defpackage.wwg;
import defpackage.wxh0;
import defpackage.x920;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.license.LicenseConstants;
import ru.yandex.common.network.Request;

/* loaded from: classes15.dex */
public final class b implements tsr, ca20, r30, nzc0 {
    public l40 a;
    public ea20 b;
    public ike c;
    public com.yandex.mobile.drive.contacts.a w;
    public com.yandex.mobile.drive.scan.a x;
    public final n0 y = ffx.c(0, 0, null, 7);
    public static final a z = new a();
    public static final bcz A = new bcz();
    public static final r0 B = bvf0.c(null);

    public static final com.yandex.mobile.drive.scan.a a(b bVar, Context context, x920 x920Var) {
        com.yandex.mobile.drive.scan.a aVar = bVar.x;
        if (aVar != null) {
            return aVar;
        }
        jdj jdjVar = new jdj(context, (String) klb1.a(x920Var, "selfieBadPhotoTitle"), (String) klb1.a(x920Var, "selfieBadPhotoMessage"));
        Boolean b = klb1.b(x920Var, "enableClientSelfieVerification");
        Boolean bool = Boolean.TRUE;
        com.yandex.mobile.drive.scan.a aVar2 = new com.yandex.mobile.drive.scan.a(jdjVar, jl40.l(b, bool), jl40.l(klb1.b(x920Var, "isFlutterVideoUploadEnabled"), bool));
        bVar.x = aVar2;
        return aVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable b(b bVar, Activity activity, com.yandex.mobile.drive.scan.a aVar, x920 x920Var, ContinuationImpl continuationImpl) {
        DriveNativeFeaturesPlugin$takeDocumentsPhotos$1 driveNativeFeaturesPlugin$takeDocumentsPhotos$1;
        int i;
        List list;
        List list2;
        bVar.getClass();
        if (continuationImpl instanceof DriveNativeFeaturesPlugin$takeDocumentsPhotos$1) {
            driveNativeFeaturesPlugin$takeDocumentsPhotos$1 = (DriveNativeFeaturesPlugin$takeDocumentsPhotos$1) continuationImpl;
            int i2 = driveNativeFeaturesPlugin$takeDocumentsPhotos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveNativeFeaturesPlugin$takeDocumentsPhotos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driveNativeFeaturesPlugin$takeDocumentsPhotos$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveNativeFeaturesPlugin$takeDocumentsPhotos$1.label;
                EmptyList emptyList = EmptyList.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = (String) x920Var.a("type");
                    if (str != null) {
                        boolean l = jl40.l(klb1.b(x920Var, "preCheckPhoto"), Boolean.TRUE);
                        ScanReason scanReason = ScanReason.Registration;
                        switch (str.hashCode()) {
                            case -1720722408:
                                if (str.equals("passport_biographical")) {
                                    list = Collections.singletonList(new qlm0(ScanMode$Passport$PassportPage.Bio, l));
                                    break;
                                }
                                list = emptyList;
                                break;
                            case -1623690298:
                                if (str.equals("passport_registration")) {
                                    list = Collections.singletonList(new qlm0(ScanMode$Passport$PassportPage.Registration, l));
                                    break;
                                }
                                list = emptyList;
                                break;
                            case -1562259285:
                                if (str.equals("license_front")) {
                                    list = Collections.singletonList(new plm0(ScanMode$DriverLicense$LicenseSide.Front, l));
                                    break;
                                }
                                list = emptyList;
                                break;
                            case -825321690:
                                if (str.equals("license_selfie")) {
                                    list = Collections.singletonList(new rlm0(ScanMode$Selfie$SelfieWith.License, l));
                                    break;
                                }
                                list = emptyList;
                                break;
                            case 166757441:
                                if (str.equals(LicenseConstants.LICENSE)) {
                                    list = scc.g(new plm0(ScanMode$DriverLicense$LicenseSide.Front, l), new plm0(ScanMode$DriverLicense$LicenseSide.Back, l));
                                    break;
                                }
                                list = emptyList;
                                break;
                            case 310923829:
                                if (str.equals("passport_selfie")) {
                                    list = Collections.singletonList(new rlm0(ScanMode$Selfie$SelfieWith.Passport, l));
                                    break;
                                }
                                list = emptyList;
                                break;
                            case 1216777234:
                                if (str.equals("passport")) {
                                    list = scc.g(new qlm0(ScanMode$Passport$PassportPage.Bio, l), new qlm0(ScanMode$Passport$PassportPage.Registration, l));
                                    break;
                                }
                                list = emptyList;
                                break;
                            case 1612036645:
                                if (str.equals("license_back")) {
                                    list = Collections.singletonList(new plm0(ScanMode$DriverLicense$LicenseSide.Back, l));
                                    break;
                                }
                                list = emptyList;
                                break;
                            default:
                                list = emptyList;
                                break;
                        }
                        d(activity, aVar, scanReason, list);
                        n0 n0Var = bVar.y;
                        driveNativeFeaturesPlugin$takeDocumentsPhotos$1.L$0 = null;
                        driveNativeFeaturesPlugin$takeDocumentsPhotos$1.L$1 = null;
                        driveNativeFeaturesPlugin$takeDocumentsPhotos$1.L$2 = null;
                        driveNativeFeaturesPlugin$takeDocumentsPhotos$1.L$3 = null;
                        driveNativeFeaturesPlugin$takeDocumentsPhotos$1.Z$0 = l;
                        driveNativeFeaturesPlugin$takeDocumentsPhotos$1.label = 1;
                        obj = e.y(n0Var, driveNativeFeaturesPlugin$takeDocumentsPhotos$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return emptyList;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                list2 = (List) obj;
                if (list2 != null) {
                    List<ScanResult> list3 = list2;
                    ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                    for (ScanResult scanResult : list3) {
                        arrayList.add(kotlin.collections.b.h(new Pair("photoPath", scanResult.getPhotoPath()), new Pair("videoPath", scanResult.getVideoPath())));
                    }
                    return arrayList;
                }
                return emptyList;
            }
        }
        driveNativeFeaturesPlugin$takeDocumentsPhotos$1 = new DriveNativeFeaturesPlugin$takeDocumentsPhotos$1(bVar, continuationImpl);
        Object obj2 = driveNativeFeaturesPlugin$takeDocumentsPhotos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveNativeFeaturesPlugin$takeDocumentsPhotos$1.label;
        EmptyList emptyList2 = EmptyList.a;
        if (i != 0) {
        }
        list2 = (List) obj2;
        if (list2 != null) {
        }
        return emptyList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b bVar, Activity activity, com.yandex.mobile.drive.scan.a aVar, ContinuationImpl continuationImpl) {
        DriveNativeFeaturesPlugin$verifyUserSelfie$1 driveNativeFeaturesPlugin$verifyUserSelfie$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof DriveNativeFeaturesPlugin$verifyUserSelfie$1) {
            driveNativeFeaturesPlugin$verifyUserSelfie$1 = (DriveNativeFeaturesPlugin$verifyUserSelfie$1) continuationImpl;
            int i2 = driveNativeFeaturesPlugin$verifyUserSelfie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveNativeFeaturesPlugin$verifyUserSelfie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driveNativeFeaturesPlugin$verifyUserSelfie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveNativeFeaturesPlugin$verifyUserSelfie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d(activity, aVar, ScanReason.Verification, Collections.singletonList(new rlm0(null, false)));
                    n0 n0Var = bVar.y;
                    driveNativeFeaturesPlugin$verifyUserSelfie$1.L$0 = null;
                    driveNativeFeaturesPlugin$verifyUserSelfie$1.L$1 = null;
                    driveNativeFeaturesPlugin$verifyUserSelfie$1.label = 1;
                    obj = e.y(n0Var, driveNativeFeaturesPlugin$verifyUserSelfie$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(obj != null);
            }
        }
        driveNativeFeaturesPlugin$verifyUserSelfie$1 = new DriveNativeFeaturesPlugin$verifyUserSelfie$1(bVar, continuationImpl);
        Object obj2 = driveNativeFeaturesPlugin$verifyUserSelfie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveNativeFeaturesPlugin$verifyUserSelfie$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(obj2 != null);
    }

    public static void d(Activity activity, com.yandex.mobile.drive.scan.a aVar, ScanReason scanReason, List list) {
        String string;
        String string2;
        String str;
        ScanMeta scanMeta;
        String str2;
        String str3;
        String str4;
        jdj jdjVar = aVar.a;
        Context context = (Context) jdjVar.w;
        glm0 glm0Var = ScanActivity.Companion;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                boolean z2 = scanReason == ScanReason.Registration;
                boolean z3 = aVar.b;
                int i = ffm.a[scanReason.ordinal()];
                if (i == 1) {
                    string = context.getString(wxh0.camera_registration_permission_rationale);
                } else {
                    if (i != 2) {
                        w511.b();
                        return;
                    }
                    string = context.getString(wxh0.camera_permission_rationale);
                }
                String str5 = (String) jdjVar.c;
                if (str5 == null) {
                    str5 = context.getString(wxh0.noFaceSelfieAlertTitle);
                }
                String str6 = (String) jdjVar.b;
                if (str6 == null) {
                    str6 = context.getString(wxh0.noFaceSelfieAlertSubtitle);
                }
                boolean z4 = aVar.c;
                glm0Var.getClass();
                Intent intent = new Intent(activity, (Class<?>) ScanActivity.class);
                intent.putParcelableArrayListExtra("photoMeta", new ArrayList<>(arrayList));
                intent.putExtra("isChatService", z2);
                intent.putExtra("permissionMessage", string);
                intent.putExtra("faceDetectorEnabled", z3);
                intent.putExtra("flutterVideoUploadEnabled", z4);
                intent.putExtra("noFaceSelfieAlertTitle", str5);
                intent.putExtra("noFaceSelfieAlertSubtitle", str6);
                activity.startActivityForResult(intent, 420);
                return;
            }
            slm0 slm0Var = (slm0) it.next();
            boolean z5 = slm0Var instanceof plm0;
            if (z5) {
                string2 = context.getString(wxh0.captionLicense);
            } else if (slm0Var instanceof qlm0) {
                string2 = context.getString(wxh0.captionPassport);
            } else {
                if (!(slm0Var instanceof rlm0)) {
                    w511.b();
                    return;
                }
                ScanMode$Selfie$SelfieWith scanMode$Selfie$SelfieWith = ((rlm0) slm0Var).a;
                int i2 = scanMode$Selfie$SelfieWith == null ? -1 : ffm.b[scanMode$Selfie$SelfieWith.ordinal()];
                if (i2 == -1) {
                    string2 = context.getString(wxh0.captionSelfie);
                } else if (i2 == 1) {
                    string2 = context.getString(wxh0.captionLicenseSelfie);
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return;
                    }
                    string2 = context.getString(wxh0.captionPassportSelfie);
                }
            }
            String str7 = string2;
            if (z5) {
                int i3 = ffm.c[((plm0) slm0Var).a.ordinal()];
                if (i3 == 1) {
                    str = context.getString(wxh0.captionLicenseFront);
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return;
                    }
                    str = context.getString(wxh0.captionLicenseBack);
                }
            } else if (slm0Var instanceof qlm0) {
                int i4 = ffm.d[((qlm0) slm0Var).a.ordinal()];
                if (i4 == 1) {
                    str = context.getString(wxh0.captionPassportBio);
                } else {
                    if (i4 != 2) {
                        w511.b();
                        return;
                    }
                    str = context.getString(wxh0.captionPassportReg);
                }
            } else {
                if (!(slm0Var instanceof rlm0)) {
                    w511.b();
                    return;
                }
                str = null;
            }
            String str8 = str;
            if (z5) {
                plm0 plm0Var = (plm0) slm0Var;
                int i5 = tlm0.a[plm0Var.a.ordinal()];
                if (i5 == 1) {
                    str4 = "lf";
                } else {
                    if (i5 != 2) {
                        w511.b();
                        return;
                    }
                    str4 = "lb";
                }
                scanMeta = new ScanMeta(str4, str7, str8, CameraPattern.License, false, false, plm0Var.b);
            } else if (slm0Var instanceof qlm0) {
                qlm0 qlm0Var = (qlm0) slm0Var;
                int i6 = tlm0.b[qlm0Var.a.ordinal()];
                if (i6 == 1) {
                    str3 = "pb";
                } else {
                    if (i6 != 2) {
                        w511.b();
                        return;
                    }
                    str3 = "pr";
                }
                scanMeta = new ScanMeta(str3, str7, str8, CameraPattern.Passport, false, false, qlm0Var.b);
            } else {
                if (!(slm0Var instanceof rlm0)) {
                    w511.b();
                    return;
                }
                rlm0 rlm0Var = (rlm0) slm0Var;
                ScanMode$Selfie$SelfieWith scanMode$Selfie$SelfieWith2 = rlm0Var.a;
                int i7 = scanMode$Selfie$SelfieWith2 == null ? -1 : tlm0.c[scanMode$Selfie$SelfieWith2.ordinal()];
                if (i7 == -1) {
                    str2 = "selfie";
                } else if (i7 == 1) {
                    str2 = "ls";
                } else {
                    if (i7 != 2) {
                        w511.b();
                        return;
                    }
                    str2 = "ps";
                }
                scanMeta = new ScanMeta(str2, str7, str8, null, true, scanReason == ScanReason.Registration, rlm0Var.b);
            }
            arrayList.add(scanMeta);
        }
    }

    @Override // defpackage.nzc0
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        List list;
        if (i != 420) {
            return false;
        }
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (i2 != -1 || extras == null || this.x == null) {
            list = null;
        } else {
            ScanActivity.Companion.getClass();
            list = extras.getParcelableArrayList("attachments");
            if (list == null) {
                list = EmptyList.a;
            }
        }
        ike ikeVar = this.c;
        if (ikeVar == null) {
            return true;
        }
        tje.N(ikeVar, null, null, new DriveNativeFeaturesPlugin$onActivityResult$1(this, list, null), 3);
        return true;
    }

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        this.a = l40Var;
        ((wrr) l40Var).a(this);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "drive_sdk");
        ea20Var.b(this);
        this.b = ea20Var;
        this.c = bvf0.b();
        Context context = ssrVar.a;
        this.w = new com.yandex.mobile.drive.contacts.a((Application) context);
        c0m c0mVar = new c0m(4);
        if (l0b1.b) {
            return;
        }
        l0b1.b = true;
        l0b1.a = c0mVar;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        l40 l40Var = this.a;
        if (l40Var != null) {
            ((wrr) l40Var).k(this);
        }
        this.a = null;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ike ikeVar = this.c;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.c = null;
        ea20 ea20Var = this.b;
        if (ea20Var != null) {
            ea20Var.b(null);
        }
        this.b = null;
        this.a = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        qsr qsrVar;
        ike ikeVar = this.c;
        l40 l40Var = this.a;
        Activity activity = l40Var != null ? (Activity) ((wrr) l40Var).b : null;
        if (activity == null) {
            ((ba20) da20Var).error("failed-setup", null, null);
        }
        String str = x920Var.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1462356793:
                    if (str.equals("updateNetworkConfig")) {
                        String str2 = (String) klb1.a(x920Var, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
                        Map map = (Map) klb1.a(x920Var, "extraUrlParameters");
                        Map map2 = (Map) klb1.a(x920Var, "headers");
                        if (str2 == null) {
                            qsrVar = null;
                        } else {
                            if (map == null) {
                                map = kotlin.collections.b.f();
                            }
                            if (map2 == null) {
                                map2 = kotlin.collections.b.f();
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                            linkedHashMap.put("content-type", "application/json");
                            linkedHashMap.remove("lat");
                            linkedHashMap.remove("lon");
                            linkedHashMap.remove("location-accuracy");
                            linkedHashMap.remove("accept-encoding", Request.PARAM_GZIP);
                            qsrVar = new qsr(str2, map, wwg.y(linkedHashMap));
                        }
                        B.l(qsrVar);
                        ((ba20) da20Var).success(null);
                        break;
                    }
                    break;
                case -805445166:
                    if (str.equals("takeDocumentsPhotos")) {
                        tje.N(ikeVar, null, null, new DriveNativeFeaturesPlugin$onMethodCall$2(this, activity, x920Var, da20Var, null), 3);
                        break;
                    }
                    break;
                case 454078060:
                    if (str.equals("verifyUserSelfie")) {
                        tje.N(ikeVar, null, null, new DriveNativeFeaturesPlugin$onMethodCall$3(this, activity, x920Var, da20Var, null), 3);
                        break;
                    }
                    break;
                case 634450690:
                    if (str.equals("uploadPendingDocuments")) {
                        tje.N(ikeVar, null, null, new DriveNativeFeaturesPlugin$onMethodCall$4(this, activity, x920Var, da20Var, null), 3);
                        break;
                    }
                    break;
                case 1510448585:
                    if (str.equals("getContacts")) {
                        tje.N(ikeVar, null, null, new DriveNativeFeaturesPlugin$onMethodCall$5(this, da20Var, null), 3);
                        break;
                    }
                    break;
                case 1615488901:
                    if (str.equals("changeLocation")) {
                        Double d = (Double) klb1.a(x920Var, "lat");
                        Double d2 = (Double) klb1.a(x920Var, "lon");
                        Double d3 = (Double) klb1.a(x920Var, "accuracy");
                        if (d != null && d2 != null) {
                            Location location = new Location("sdk");
                            location.setLatitude(d.doubleValue());
                            location.setLongitude(d2.doubleValue());
                            location.setAccuracy(d3 != null ? (float) d3.doubleValue() : 0.0f);
                            bcz bczVar = A;
                            bczVar.b = location;
                            Iterator it = bczVar.a.iterator();
                            while (it.hasNext()) {
                                ((dfm) it.next()).getClass();
                                dfm.a(location);
                            }
                        }
                        ((ba20) da20Var).success(null);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        onAttachedToActivity(l40Var);
    }
}
