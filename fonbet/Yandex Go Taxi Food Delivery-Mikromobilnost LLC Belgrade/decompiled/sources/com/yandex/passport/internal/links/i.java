package com.yandex.passport.internal.links;

import android.net.Uri;
import android.os.Parcelable;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.social.gimap.GimapTrack;
import com.yandex.passport.internal.ui.social.gimap.MailGIMAPActivity;
import com.yandex.passport.internal.ui.social.gimap.o;
import java.util.concurrent.Callable;

/* loaded from: classes15.dex */
public final /* synthetic */ class i implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ PassportProcessGlobalComponent b;
    public final /* synthetic */ BaseActivity c;
    public final /* synthetic */ Parcelable w;

    public /* synthetic */ i(PassportProcessGlobalComponent passportProcessGlobalComponent, LinksHandlingActivity linksHandlingActivity, Uri uri) {
        this.b = passportProcessGlobalComponent;
        this.c = linksHandlingActivity;
        this.w = uri;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        g onCreate$lambda$2;
        o lambda$onCreate$0;
        int i = this.a;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.b;
        Parcelable parcelable = this.w;
        BaseActivity baseActivity = this.c;
        switch (i) {
            case 0:
                onCreate$lambda$2 = LinksHandlingActivity.onCreate$lambda$2(passportProcessGlobalComponent, (LinksHandlingActivity) baseActivity, (Uri) parcelable);
                return onCreate$lambda$2;
            default:
                lambda$onCreate$0 = ((MailGIMAPActivity) baseActivity).lambda$onCreate$0((GimapTrack) parcelable, passportProcessGlobalComponent);
                return lambda$onCreate$0;
        }
    }

    public /* synthetic */ i(MailGIMAPActivity mailGIMAPActivity, GimapTrack gimapTrack, PassportProcessGlobalComponent passportProcessGlobalComponent) {
        this.c = mailGIMAPActivity;
        this.w = gimapTrack;
        this.b = passportProcessGlobalComponent;
    }
}
