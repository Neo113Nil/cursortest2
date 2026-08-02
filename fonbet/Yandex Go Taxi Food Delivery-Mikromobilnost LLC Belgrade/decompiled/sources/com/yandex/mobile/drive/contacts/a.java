package com.yandex.mobile.drive.contacts;

import android.app.Application;
import android.content.ContentResolver;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class a {
    public final ContentResolver a;

    public a(Application application) {
        this.a = application.getContentResolver();
    }

    public final Object a(Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ContactsDataSource$readContactsList$2(this, null), continuation);
    }
}
