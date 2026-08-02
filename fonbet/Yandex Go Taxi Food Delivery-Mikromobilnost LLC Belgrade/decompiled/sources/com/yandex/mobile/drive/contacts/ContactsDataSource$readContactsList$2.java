package com.yandex.mobile.drive.contacts;

import android.database.Cursor;
import android.provider.ContactsContract;
import defpackage.l0b1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q9e;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lq9e;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.contacts.ContactsDataSource$readContactsList$2", f = "ContactsDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactsDataSource$readContactsList$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsDataSource$readContactsList$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactsDataSource$readContactsList$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactsDataSource$readContactsList$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Cursor query;
        EmptyList emptyList = EmptyList.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ArrayList arrayList = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            Cursor query2 = this.this$0.a.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
            if (query2 != null) {
                Cursor cursor = query2;
                a aVar = this.this$0;
                try {
                    Cursor cursor2 = cursor;
                    int columnIndex = cursor2.getColumnIndex(ClidProvider._ID);
                    int columnIndex2 = cursor2.getColumnIndex("display_name");
                    int columnIndex3 = cursor2.getColumnIndex("has_phone_number");
                    ArrayList arrayList2 = new ArrayList();
                    int min = Math.min(Integer.MAX_VALUE, cursor2.getCount());
                    for (int i = 0; i < min; i++) {
                        cursor2.moveToPosition(i);
                        String string = cursor2.getString(columnIndex);
                        String string2 = cursor2.getString(columnIndex2);
                        if (cursor2.getInt(columnIndex3) > 0 && (query = aVar.a.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ?", new String[]{string}, null)) != null) {
                            cursor = query;
                            try {
                                Cursor cursor3 = cursor;
                                int columnIndex4 = cursor3.getColumnIndex("data1");
                                if (columnIndex4 >= 0) {
                                    while (cursor3.moveToNext()) {
                                        arrayList2.add(new q9e(string2, cursor3.getString(columnIndex4)));
                                    }
                                }
                                cursor.close();
                            } finally {
                            }
                        }
                    }
                    cursor.close();
                    arrayList = arrayList2;
                } finally {
                }
            }
            return arrayList == null ? emptyList : arrayList;
        } catch (Exception e) {
            l0b1.h(new AssertionError("failed to read contacts", e));
            return emptyList;
        }
    }
}
