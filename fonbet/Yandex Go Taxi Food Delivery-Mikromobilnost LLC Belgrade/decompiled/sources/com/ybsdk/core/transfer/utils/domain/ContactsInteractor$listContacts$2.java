package com.ybsdk.core.transfer.utils.domain;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import defpackage.e2k;
import defpackage.evu0;
import defpackage.foc;
import defpackage.h73;
import defpackage.jfb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v9e;
import defpackage.wi91;
import defpackage.wls;
import defpackage.xcc;
import defpackage.yce;
import defpackage.zce;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "Lv9e;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.transfer.utils.domain.ContactsInteractor$listContacts$2", f = "ContactsInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ContactsInteractor$listContacts$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $showOnlyRussianPhones;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsInteractor$listContacts$2(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$showOnlyRussianPhones = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContactsInteractor$listContacts$2 contactsInteractor$listContacts$2 = new ContactsInteractor$listContacts$2(this.this$0, this.$showOnlyRussianPhones, continuation);
        contactsInteractor$listContacts$2.L$0 = obj;
        return contactsInteractor$listContacts$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactsInteractor$listContacts$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v26, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        ?? failure2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            failure = this.this$0.a.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, a.b, null, null, null);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        a aVar = this.this$0;
        Throwable a = Result.a(failure);
        ?? r3 = EmptyList.a;
        if (a == null) {
            Cursor cursor = (Cursor) failure;
            if (cursor == null) {
                failure2 = new Result.Failure(new Exception("Failed load contacts: cursor null"));
            } else if (cursor.moveToFirst()) {
                aVar.getClass();
                Context context = aVar.a;
                ArrayList arrayList = new ArrayList();
                Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, a.c, null, null, null);
                if (query != null) {
                    Cursor cursor2 = query;
                    try {
                        Cursor cursor3 = cursor2;
                        if (cursor3.moveToFirst()) {
                            do {
                                try {
                                    long j = cursor3.getLong(cursor3.getColumnIndex("contact_id"));
                                    String string = cursor3.getString(cursor3.getColumnIndex("data1"));
                                    if (string == null) {
                                        string = "";
                                    }
                                    arrayList.add(new Pair(Long.valueOf(j), string));
                                } catch (Throwable unused) {
                                }
                            } while (cursor3.moveToNext());
                        }
                        cursor2.close();
                    } finally {
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Cursor query2 = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, a.d, "mimetype = 'vnd.android.cursor.item/photo'", null, null);
                if (query2 != null) {
                    Cursor cursor4 = query2;
                    try {
                        Cursor cursor5 = cursor4;
                        if (cursor5.moveToFirst()) {
                            do {
                                arrayList2.add(Long.valueOf(cursor5.getLong(cursor5.getColumnIndex("contact_id"))));
                            } while (cursor5.moveToNext());
                        }
                        cursor4.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                failure2 = new ArrayList();
                do {
                    long j2 = cursor.getLong(cursor.getColumnIndex(ClidProvider._ID));
                    String string2 = cursor.getString(cursor.getColumnIndex("display_name"));
                    if (string2 == null) {
                        string2 = "";
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((Number) ((Pair) next).c()).longValue() == j2) {
                            arrayList3.add(next);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Object f = ((Pair) it2.next()).f();
                        if (evu0.J((String) f)) {
                            f = null;
                        }
                        String str = (String) f;
                        if (str != null) {
                            arrayList4.add(str);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        com.google.i18n.phonenumbers.a aVar2 = jfb0.h;
                        jfb0 c = wi91.c(str2);
                        if (c != null) {
                            arrayList5.add(c);
                        }
                    }
                    Uri withAppendedPath = arrayList2.contains(new Long(j2)) ? Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j2), "photo") : null;
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        failure2.add(new v9e(string2, (jfb0) it4.next(), withAppendedPath));
                    }
                } while (cursor.moveToNext());
            } else {
                failure2 = r3;
            }
        } else {
            failure2 = new Result.Failure(a);
        }
        boolean z = this.$showOnlyRussianPhones;
        boolean z2 = failure2 instanceof Result.Failure;
        Object obj2 = failure2;
        if (!z2) {
            e2k e2kVar = new e2k(0, kotlin.sequences.b.g(new h73(1, (List) failure2), new yce(z, 0)), new foc(14));
            zce zceVar = new zce();
            List t = kotlin.sequences.b.t(e2kVar);
            xcc.q(t, zceVar);
            Iterator it5 = ((ArrayList) t).iterator();
            if (it5.hasNext()) {
                Object next2 = it5.next();
                if (it5.hasNext()) {
                    r3 = new ArrayList();
                    r3.add(next2);
                    while (it5.hasNext()) {
                        r3.add(it5.next());
                    }
                } else {
                    r3 = Collections.singletonList(next2);
                }
            }
            obj2 = r3;
        }
        return new Result(obj2);
    }
}
