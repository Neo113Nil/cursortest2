package com.yandex.go.inapp_calls.ui.permission;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.q;
import defpackage.d6z;
import defpackage.g16;
import defpackage.ijs;
import defpackage.ip11;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.sls;
import defpackage.tje;
import defpackage.tkv;
import defpackage.zmh;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes12.dex */
public final class a {
    public final Activity a;
    public final ip11 b;
    public final pav c;
    public final k7x0 d;
    public final q e;

    public a(Activity activity, ip11 ip11Var, pav pavVar, k7x0 k7x0Var, q qVar) {
        this.a = activity;
        this.b = ip11Var;
        this.c = pavVar;
        this.d = k7x0Var;
        this.e = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v11, types: [sls] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v12, types: [sls] */
    /* JADX WARN: Type inference failed for: r13v5, types: [sls] */
    /* JADX WARN: Type inference failed for: r13v7, types: [sls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tkv tkvVar, tkv tkvVar2, ContinuationImpl continuationImpl) {
        PermissionDialogBuilder$show$1 permissionDialogBuilder$show$1;
        int i;
        tkv tkvVar3;
        tkv tkvVar4;
        String str;
        InAppCallExperiment inAppCallExperiment;
        Bitmap bitmap;
        ?? r0;
        InAppCallExperiment inAppCallExperiment2;
        tkv tkvVar5;
        tkv tkvVar6;
        tkv tkvVar7;
        if (continuationImpl instanceof PermissionDialogBuilder$show$1) {
            permissionDialogBuilder$show$1 = (PermissionDialogBuilder$show$1) continuationImpl;
            int i2 = permissionDialogBuilder$show$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                permissionDialogBuilder$show$1.label = i2 - Integer.MIN_VALUE;
                Object obj = permissionDialogBuilder$show$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = permissionDialogBuilder$show$1.label;
                Activity activity = this.a;
                if (i != 0) {
                    b.b(obj);
                    permissionDialogBuilder$show$1.L$0 = tkvVar;
                    permissionDialogBuilder$show$1.L$1 = tkvVar2;
                    permissionDialogBuilder$show$1.label = 1;
                    obj = this.e.d.b(permissionDialogBuilder$show$1);
                    tkvVar4 = tkvVar;
                    tkvVar3 = tkvVar2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        inAppCallExperiment2 = (InAppCallExperiment) permissionDialogBuilder$show$1.L$2;
                        ?? r13 = (sls) permissionDialogBuilder$show$1.L$1;
                        r0 = (sls) permissionDialogBuilder$show$1.L$0;
                        b.b(obj);
                        tkvVar7 = r13;
                        bitmap = (Bitmap) obj;
                        tkv tkvVar8 = r0;
                        inAppCallExperiment = inAppCallExperiment2;
                        tkvVar6 = tkvVar8;
                        tkvVar5 = tkvVar7;
                        AlertDialog cancelable = new AlertDialog(activity).setCancelable(true);
                        InAppCallExperiment.PermissionsDialog permissionsDialog = inAppCallExperiment.j;
                        AlertDialog titleTypeface = cancelable.setTitle(d6z.Y(inAppCallExperiment, permissionsDialog.a)).setTitleTypeface(((zmh) this.b).d());
                        String str2 = permissionsDialog.b;
                        titleTypeface.setMessage(str2 != null ? d6z.Y(inAppCallExperiment, str2) : null).setPositiveButton(d6z.Y(inAppCallExperiment, permissionsDialog.c), new ijs(21, tkvVar6)).setNegativeButton(d6z.Y(inAppCallExperiment, permissionsDialog.d)).setOnHideAnimationEndListener(new ijs(22, tkvVar5)).setDialogDrawable(bitmap != null ? new BitmapDrawable(activity.getResources(), bitmap) : null).show();
                        return zy11.a;
                    }
                    ?? r132 = (sls) permissionDialogBuilder$show$1.L$1;
                    ?? r12 = (sls) permissionDialogBuilder$show$1.L$0;
                    b.b(obj);
                    tkvVar4 = r12;
                    tkvVar3 = r132;
                }
                InAppCallExperiment inAppCallExperiment3 = (InAppCallExperiment) obj;
                str = inAppCallExperiment3.j.e;
                if (str != null) {
                    inAppCallExperiment = inAppCallExperiment3;
                    bitmap = null;
                    tkvVar6 = tkvVar4;
                    tkvVar5 = tkvVar3;
                    AlertDialog cancelable2 = new AlertDialog(activity).setCancelable(true);
                    InAppCallExperiment.PermissionsDialog permissionsDialog2 = inAppCallExperiment.j;
                    AlertDialog titleTypeface2 = cancelable2.setTitle(d6z.Y(inAppCallExperiment, permissionsDialog2.a)).setTitleTypeface(((zmh) this.b).d());
                    String str22 = permissionsDialog2.b;
                    titleTypeface2.setMessage(str22 != null ? d6z.Y(inAppCallExperiment, str22) : null).setPositiveButton(d6z.Y(inAppCallExperiment, permissionsDialog2.c), new ijs(21, tkvVar6)).setNegativeButton(d6z.Y(inAppCallExperiment, permissionsDialog2.d)).setOnHideAnimationEndListener(new ijs(22, tkvVar5)).setDialogDrawable(bitmap != null ? new BitmapDrawable(activity.getResources(), bitmap) : null).show();
                    return zy11.a;
                }
                int u = tje.u(40, activity);
                g16 g = this.c.b().b(((m7x0) this.d).a(str)).g(u, u);
                permissionDialogBuilder$show$1.L$0 = tkvVar4;
                permissionDialogBuilder$show$1.L$1 = tkvVar3;
                permissionDialogBuilder$show$1.L$2 = inAppCallExperiment3;
                permissionDialogBuilder$show$1.L$3 = null;
                permissionDialogBuilder$show$1.I$0 = u;
                permissionDialogBuilder$show$1.label = 2;
                Object b = ru.yandex.taxi.utils.a.b(g, permissionDialogBuilder$show$1);
                if (b != coroutineSingletons) {
                    r0 = tkvVar4;
                    inAppCallExperiment2 = inAppCallExperiment3;
                    obj = b;
                    tkvVar7 = tkvVar3;
                    bitmap = (Bitmap) obj;
                    tkv tkvVar82 = r0;
                    inAppCallExperiment = inAppCallExperiment2;
                    tkvVar6 = tkvVar82;
                    tkvVar5 = tkvVar7;
                    AlertDialog cancelable22 = new AlertDialog(activity).setCancelable(true);
                    InAppCallExperiment.PermissionsDialog permissionsDialog22 = inAppCallExperiment.j;
                    AlertDialog titleTypeface22 = cancelable22.setTitle(d6z.Y(inAppCallExperiment, permissionsDialog22.a)).setTitleTypeface(((zmh) this.b).d());
                    String str222 = permissionsDialog22.b;
                    titleTypeface22.setMessage(str222 != null ? d6z.Y(inAppCallExperiment, str222) : null).setPositiveButton(d6z.Y(inAppCallExperiment, permissionsDialog22.c), new ijs(21, tkvVar6)).setNegativeButton(d6z.Y(inAppCallExperiment, permissionsDialog22.d)).setOnHideAnimationEndListener(new ijs(22, tkvVar5)).setDialogDrawable(bitmap != null ? new BitmapDrawable(activity.getResources(), bitmap) : null).show();
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        permissionDialogBuilder$show$1 = new PermissionDialogBuilder$show$1(this, continuationImpl);
        Object obj2 = permissionDialogBuilder$show$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = permissionDialogBuilder$show$1.label;
        Activity activity2 = this.a;
        if (i != 0) {
        }
        InAppCallExperiment inAppCallExperiment32 = (InAppCallExperiment) obj2;
        str = inAppCallExperiment32.j.e;
        if (str != null) {
        }
    }
}
