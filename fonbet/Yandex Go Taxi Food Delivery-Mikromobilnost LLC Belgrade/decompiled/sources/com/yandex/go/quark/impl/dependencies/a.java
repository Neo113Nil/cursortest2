package com.yandex.go.quark.impl.dependencies;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import defpackage.a60;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.r40;
import defpackage.y50;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.activity.g;

/* loaded from: classes8.dex */
public final class a {
    public final h3y a;
    public final h3y b;

    public a(h3y h3yVar, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = h3yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable a(String[] strArr, ContinuationImpl continuationImpl) {
        QuarkGoFileChooserLauncher$launchFileChooser$1 quarkGoFileChooserLauncher$launchFileChooser$1;
        int i;
        Intent intent;
        if (continuationImpl instanceof QuarkGoFileChooserLauncher$launchFileChooser$1) {
            quarkGoFileChooserLauncher$launchFileChooser$1 = (QuarkGoFileChooserLauncher$launchFileChooser$1) continuationImpl;
            int i2 = quarkGoFileChooserLauncher$launchFileChooser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quarkGoFileChooserLauncher$launchFileChooser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = quarkGoFileChooserLauncher$launchFileChooser$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = quarkGoFileChooserLauncher$launchFileChooser$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y50 y50Var = (y50) this.a.get();
                    Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType("*/*").putExtra("android.intent.extra.MIME_TYPES", strArr);
                    a60 a60Var = (a60) y50Var;
                    a60Var.getClass();
                    try {
                        a60Var.e(Constants.VPN_TRAFFIC, putExtra);
                    } catch (ActivityNotFoundException unused) {
                    }
                    g gVar = (g) this.b.get();
                    quarkGoFileChooserLauncher$launchFileChooser$1.L$0 = null;
                    quarkGoFileChooserLauncher$launchFileChooser$1.label = 1;
                    obj = gVar.d(Constants.VPN_TRAFFIC, quarkGoFileChooserLauncher$launchFileChooser$1);
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
                intent = ((r40) obj).c;
                if (intent == null) {
                    return intent.getData();
                }
                return null;
            }
        }
        quarkGoFileChooserLauncher$launchFileChooser$1 = new QuarkGoFileChooserLauncher$launchFileChooser$1(this, continuationImpl);
        Object obj2 = quarkGoFileChooserLauncher$launchFileChooser$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = quarkGoFileChooserLauncher$launchFileChooser$1.label;
        if (i != 0) {
        }
        intent = ((r40) obj2).c;
        if (intent == null) {
        }
    }
}
