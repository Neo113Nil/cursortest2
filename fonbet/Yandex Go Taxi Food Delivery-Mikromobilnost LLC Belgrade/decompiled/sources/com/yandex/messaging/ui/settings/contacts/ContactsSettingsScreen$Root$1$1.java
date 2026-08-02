package com.yandex.messaging.ui.settings.contacts;

import defpackage.sls;
import defpackage.vde;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ContactsSettingsScreen$Root$1$1 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m223invoke() {
        ((vde) this.receiver).b.launchWhenReady(new ContactsSettingsFragment$ContactsScreen$2$onBackPressed$1(2, null));
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m223invoke();
        return zy11.a;
    }
}
