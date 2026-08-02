package com.ybsdk.core.transfer.utils.domain;

import android.content.Context;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class a {
    public static final String[] b = {ClidProvider._ID, "display_name"};
    public static final String[] c = {"contact_id", "data1"};
    public static final String[] d = {"contact_id"};
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        ContactsInteractor$listContacts$1 contactsInteractor$listContacts$1;
        int i;
        if (continuationImpl instanceof ContactsInteractor$listContacts$1) {
            contactsInteractor$listContacts$1 = (ContactsInteractor$listContacts$1) continuationImpl;
            int i2 = contactsInteractor$listContacts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactsInteractor$listContacts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = contactsInteractor$listContacts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactsInteractor$listContacts$1.label;
                if (i != 0) {
                    b.b(obj);
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ContactsInteractor$listContacts$2 contactsInteractor$listContacts$2 = new ContactsInteractor$listContacts$2(this, z, null);
                    contactsInteractor$listContacts$1.label = 1;
                    obj = tje.k0(mdhVar, contactsInteractor$listContacts$2, contactsInteractor$listContacts$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        contactsInteractor$listContacts$1 = new ContactsInteractor$listContacts$1(this, continuationImpl);
        Object obj2 = contactsInteractor$listContacts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactsInteractor$listContacts$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
