package com.yandex.go.explorer.impl.navigation.appsettings;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.a60;
import defpackage.ny61;
import defpackage.y50;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.g;

/* loaded from: classes12.dex */
public final class a {
    public final Context a;
    public final y50 b;
    public final g c;

    public a(Context context, y50 y50Var, g gVar) {
        this.a = context;
        this.b = y50Var;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ExplorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1 explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1;
        int i;
        if (continuationImpl instanceof ExplorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1) {
            explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1 = (ExplorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1) continuationImpl;
            int i2 = explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1.label = i2 - Integer.MIN_VALUE;
                Object obj = explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1.label;
                if (i != 0) {
                    b.b(obj);
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", this.a.getPackageName(), null));
                    a60 a60Var = (a60) this.b;
                    a60Var.getClass();
                    try {
                        a60Var.e(HProv.PP_DELETE_SAVED_PASSWD, intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                    explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1.L$0 = null;
                    explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1.label = 1;
                    if (this.c.d(HProv.PP_DELETE_SAVED_PASSWD, explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1 = new ExplorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1(this, continuationImpl);
        Object obj2 = explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerAppSettingsForResultOpenerImpl$openAndWaitForReturn$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
