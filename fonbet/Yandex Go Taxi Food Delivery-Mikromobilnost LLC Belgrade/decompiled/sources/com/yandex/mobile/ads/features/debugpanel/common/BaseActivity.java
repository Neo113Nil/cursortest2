package com.yandex.mobile.ads.features.debugpanel.common;

import android.app.Activity;
import android.os.Bundle;
import defpackage.b071;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.gp51;
import defpackage.gp81;
import defpackage.h081;
import defpackage.h971;
import defpackage.hu71;
import defpackage.jl40;
import defpackage.jn81;
import defpackage.lz61;
import defpackage.o400;
import defpackage.q971;
import defpackage.qhw0;
import defpackage.qm81;
import defpackage.r971;
import defpackage.s681;
import defpackage.sg81;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.va71;
import defpackage.vd81;
import defpackage.wi71;
import defpackage.y781;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/mobile/ads/features/debugpanel/common/BaseActivity;", "Lq971;", "T", "Landroid/app/Activity;", "<init>", "()V", "yads/gm", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseActivity<T extends q971> extends Activity {
    private final tse a;
    private final Object b;
    private q971 c;

    public BaseActivity() {
        hu71 hu71Var = new hu71();
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        this.a = bvf0.a(cvw.U(a, o400.a.x).plus(hu71Var));
        getLastNonConfigurationInstance();
    }

    /* renamed from: a, reason: from getter */
    public final tse getA() {
        return this.a;
    }

    public final q971 b() {
        q971 q971Var = this.c;
        if (q971Var != null) {
            return q971Var;
        }
        h971 h971Var = (h971) ((gp51) c()).b;
        q971 q971Var2 = new q971((sg81) h971Var.E.getValue(), (lz61) h971Var.F.getValue(), (vd81) h971Var.G.getValue(), (s681) h971Var.H.getValue(), (h081) h971Var.I.getValue(), (jn81) h971Var.J.getValue(), (y781) h971Var.K.getValue(), (wi71) h971Var.L.getValue(), (r971) h971Var.M.getValue(), (b071) h971Var.N.getValue(), (qm81) h971Var.O.getValue());
        this.c = q971Var2;
        return q971Var2;
    }

    public abstract gp81 c();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        va71 va71Var = lastNonConfigurationInstance instanceof va71 ? (va71) lastNonConfigurationInstance : null;
        if (va71Var != null) {
            q971 q971Var = va71Var.a;
            this.c = q971Var != null ? q971Var : null;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        q971 q971Var;
        super.onDestroy();
        bvf0.j(this.a, null);
        if (isChangingConfigurations() || (q971Var = this.c) == null) {
            return;
        }
        bvf0.j(q971Var.a, null);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return new va71(b());
    }
}
