package com.yandex.go.platform.js_api.contact;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.go.platform.js_api.contact.ContactSelectionError;
import defpackage.b60;
import defpackage.gyc;
import defpackage.l50;
import defpackage.lvj0;
import defpackage.ny61;
import defpackage.q40;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public static final String[] d;
    public static final String e;
    public static final String f;
    public final gyc a;
    public final l50 b;
    public final Context c;

    static {
        String[] strArr = {"display_name", "data1"};
        d = strArr;
        e = strArr[0];
        f = strArr[1];
    }

    public b(gyc gycVar, l50 l50Var, Context context) {
        this.a = gycVar;
        this.b = l50Var;
        this.c = context;
    }

    public final Contact a(Uri uri) {
        Cursor query = this.c.getContentResolver().query(uri, d, null, null, null);
        if (query == null) {
            ny61.r("Could not access cursor data");
            return null;
        }
        Cursor cursor = query;
        try {
            Cursor cursor2 = cursor;
            cursor2.moveToFirst();
            Contact contact = new Contact(cursor2.getString(cursor2.getColumnIndex(e)), cursor2.getString(cursor2.getColumnIndex(f)));
            cursor.close();
            return contact;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ContactPickerHandler$pickContact$1 contactPickerHandler$pickContact$1;
        int i;
        q40 q40Var;
        if (continuationImpl instanceof ContactPickerHandler$pickContact$1) {
            contactPickerHandler$pickContact$1 = (ContactPickerHandler$pickContact$1) continuationImpl;
            int i2 = contactPickerHandler$pickContact$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactPickerHandler$pickContact$1.label = i2 - Integer.MIN_VALUE;
                Object obj = contactPickerHandler$pickContact$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactPickerHandler$pickContact$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("vnd.android.cursor.dir/phone_v2");
                    ((b60) this.a.a).startActivityForResult(intent, lvj0.NOT_MODIFIED);
                    contactPickerHandler$pickContact$1.L$0 = this;
                    contactPickerHandler$pickContact$1.label = 1;
                    obj = this.b.a(lvj0.NOT_MODIFIED, contactPickerHandler$pickContact$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (b) contactPickerHandler$pickContact$1.L$0;
                    kotlin.b.b(obj);
                }
                q40Var = (q40) obj;
                Intent intent2 = q40Var.c;
                if (q40Var.b == -1 || intent2 == null) {
                    return new Result.Failure(ContactSelectionError.UserCancellation.a);
                }
                Uri data = intent2.getData();
                if (data == null) {
                    return new Result.Failure(ContactSelectionError.UriIsNull.a);
                }
                try {
                    return this.a(data);
                } catch (IllegalStateException e2) {
                    return new Result.Failure(e2);
                }
            }
        }
        contactPickerHandler$pickContact$1 = new ContactPickerHandler$pickContact$1(this, continuationImpl);
        Object obj2 = contactPickerHandler$pickContact$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactPickerHandler$pickContact$1.label;
        if (i != 0) {
        }
        q40Var = (q40) obj2;
        Intent intent22 = q40Var.c;
        if (q40Var.b == -1) {
        }
        return new Result.Failure(ContactSelectionError.UserCancellation.a);
    }
}
