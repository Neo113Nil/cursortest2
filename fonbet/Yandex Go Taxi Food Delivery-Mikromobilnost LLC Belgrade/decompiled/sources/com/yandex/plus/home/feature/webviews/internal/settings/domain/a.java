package com.yandex.plus.home.feature.webviews.internal.settings.domain;

import com.yandex.plus.home.feature.webviews.internal.settings.domain.ChangePlusSettingsInteractor$ChangeSettingError;
import defpackage.ba6;
import defpackage.j18;
import defpackage.mf60;
import kotlin.Result;

/* loaded from: classes11.dex */
public final class a {
    public final /* synthetic */ j18 a;
    public final /* synthetic */ ba6 b;
    public final /* synthetic */ b c;
    public final /* synthetic */ String d;

    public a(j18 j18Var, ba6 ba6Var, b bVar, String str) {
        this.a = j18Var;
        this.b = ba6Var;
        this.c = bVar;
        this.d = str;
    }

    public final void a(boolean z) {
        j18 j18Var = this.a;
        if (j18Var.t() instanceof mf60) {
            ba6 ba6Var = this.b;
            if (ba6Var.c == z) {
                j18Var.resumeWith(Boolean.valueOf(z));
            } else {
                j18Var.resumeWith(new Result.Failure(new ChangePlusSettingsInteractor$ChangeSettingError.HostChangeSettingError(new IllegalStateException("value has not been changed on host side"), ba6.a(ba6Var, z, 15))));
            }
        }
    }
}
