package com.yandex.passport.common.permission;

import android.content.DialogInterface;
import defpackage.i18;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PermissionManager$showRationale_1vKEnOE$lambda$14$lambda$13$lambda$12$$inlined$positiveButton$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ i18 $continuation$inlined;
    final /* synthetic */ d $request$inlined;

    public PermissionManager$showRationale_1vKEnOE$lambda$14$lambda$13$lambda$12$$inlined$positiveButton$1(i18 i18Var, d dVar) {
        this.$continuation$inlined = i18Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.$continuation$inlined.isActive()) {
            this.$continuation$inlined.resumeWith(null);
        }
    }
}
