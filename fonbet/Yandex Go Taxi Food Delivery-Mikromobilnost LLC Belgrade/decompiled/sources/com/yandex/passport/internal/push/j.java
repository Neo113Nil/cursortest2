package com.yandex.passport.internal.push;

import android.view.View;

/* loaded from: classes15.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsBuilderActivity b;

    public /* synthetic */ j(NotificationsBuilderActivity notificationsBuilderActivity, int i) {
        this.a = i;
        this.b = notificationsBuilderActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        NotificationsBuilderActivity notificationsBuilderActivity = this.b;
        switch (i) {
            case 0:
                notificationsBuilderActivity.showNotificationAsync();
                break;
            default:
                notificationsBuilderActivity.finish();
                break;
        }
    }
}
