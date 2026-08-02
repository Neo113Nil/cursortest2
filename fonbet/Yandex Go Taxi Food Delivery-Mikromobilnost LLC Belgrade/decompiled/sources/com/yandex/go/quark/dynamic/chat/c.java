package com.yandex.go.quark.dynamic.chat;

import android.net.Uri;
import defpackage.azq;
import defpackage.jyj0;
import defpackage.lhg0;
import defpackage.lyj0;
import defpackage.ny61;
import defpackage.vyq;
import defpackage.xyq;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c implements azq {
    public final lhg0 a;

    public c(lhg0 lhg0Var) {
        this.a = lhg0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String[] strArr, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        QuarkGoFileChooserLauncherProxy$launchFiles$1 quarkGoFileChooserLauncherProxy$launchFiles$1;
        int i;
        if (continuationImpl instanceof QuarkGoFileChooserLauncherProxy$launchFiles$1) {
            quarkGoFileChooserLauncherProxy$launchFiles$1 = (QuarkGoFileChooserLauncherProxy$launchFiles$1) continuationImpl;
            int i2 = quarkGoFileChooserLauncherProxy$launchFiles$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quarkGoFileChooserLauncherProxy$launchFiles$1.label = i2 - Integer.MIN_VALUE;
                Object obj = quarkGoFileChooserLauncherProxy$launchFiles$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = quarkGoFileChooserLauncherProxy$launchFiles$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.quark.impl.dependencies.a aVar = this.a.a;
                    if (aVar == null) {
                        return new jyj0(xyq.a);
                    }
                    quarkGoFileChooserLauncherProxy$launchFiles$1.L$0 = null;
                    quarkGoFileChooserLauncherProxy$launchFiles$1.L$1 = null;
                    quarkGoFileChooserLauncherProxy$launchFiles$1.Z$0 = z;
                    quarkGoFileChooserLauncherProxy$launchFiles$1.Z$1 = z2;
                    quarkGoFileChooserLauncherProxy$launchFiles$1.label = 1;
                    obj = aVar.a(strArr, quarkGoFileChooserLauncherProxy$launchFiles$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Uri uri = (Uri) obj;
                return uri == null ? new lyj0(Collections.singletonList(uri)) : new jyj0(vyq.a);
            }
        }
        quarkGoFileChooserLauncherProxy$launchFiles$1 = new QuarkGoFileChooserLauncherProxy$launchFiles$1(this, continuationImpl);
        Object obj3 = quarkGoFileChooserLauncherProxy$launchFiles$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = quarkGoFileChooserLauncherProxy$launchFiles$1.label;
        if (i != 0) {
        }
        Uri uri2 = (Uri) obj3;
        if (uri2 == null) {
        }
    }
}
