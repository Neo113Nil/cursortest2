package com.yandex.go.taxi.order.chat.ui.chat;

import com.yandex.go.taxi.order.chat.api.data.model.Message;
import com.yandex.go.taxi.order.chat.api.data.model.Sender;
import com.yandex.go.taxi.order.chat.api.data.model.Translation;
import com.yandex.go.taxi.order.chat.domain.model.MessagePresentationModel$State;
import defpackage.a3y0;
import defpackage.d3y0;
import defpackage.drq0;
import defpackage.e3y0;
import defpackage.gv10;
import defpackage.hs10;
import defpackage.hv10;
import defpackage.isa0;
import defpackage.iv10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oew0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.wy10;
import defpackage.xkh0;
import defpackage.z2y0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Ljv10;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.ui.chat.MessageAdapter$DiffDispatcher$mapToModels$2", f = "MessageAdapter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MessageAdapter$DiffDispatcher$mapToModels$2 extends SuspendLambda implements wls {
    final /* synthetic */ hs10 $adapter;
    final /* synthetic */ wy10 $messages;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAdapter$DiffDispatcher$mapToModels$2(hs10 hs10Var, wy10 wy10Var, Continuation continuation) {
        super(2, continuation);
        this.$adapter = hs10Var;
        this.$messages = wy10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageAdapter$DiffDispatcher$mapToModels$2(this.$adapter, this.$messages, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageAdapter$DiffDispatcher$mapToModels$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [gv10] */
    /* JADX WARN: Type inference failed for: r18v2, types: [iv10] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a3y0 a3y0Var;
        int i;
        hv10 hv10Var;
        hv10 hv10Var2;
        String str;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e3y0 e3y0Var = this.$adapter.x;
        wy10 wy10Var = this.$messages;
        a3y0 a3y0Var2 = e3y0Var.d;
        if (e3y0Var.c == Integer.MIN_VALUE) {
            a3y0Var2.b("mapToModel", new IllegalStateException("Try to map model without initialize message width"), null);
        }
        Collection collection = wy10Var.c;
        ArrayList arrayList = new ArrayList(tcc.n(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(e3y0Var.a((isa0) it.next(), MessagePresentationModel$State.ERROR));
        }
        Collection collection2 = wy10Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(collection2, 10));
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(e3y0Var.a((isa0) it2.next(), MessagePresentationModel$State.PROGRESS));
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.a.m0(arrayList2, arrayList));
        Collections.sort(arrayList3, Collections.reverseOrder());
        Collection<drq0> collection3 = wy10Var.a;
        ArrayList arrayList4 = new ArrayList(tcc.n(collection3, 10));
        for (drq0 drq0Var : collection3) {
            Message message = drq0Var.b;
            zzs zzsVar = message.c;
            String str2 = message.d;
            Translation translation = message.f;
            Calendar calendar = message.g;
            Sender sender = message.b;
            Object obj3 = obj2;
            if (zzsVar != null) {
                long j = drq0Var.a;
                Sender.Role role = sender.b;
                int i3 = d3y0.a[role.ordinal()];
                if (i3 == 1) {
                    i2 = xkh0.item_chat_client_location;
                } else if (i3 == 2) {
                    i2 = xkh0.item_chat_driver_location;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        w511.b();
                        return obj3;
                    }
                    a3y0Var2.b("locationMessageType", new IllegalArgumentException("Unsupported sender role"), new oew0(10, role));
                    i2 = xkh0.item_chat_driver_location;
                }
                a3y0Var = a3y0Var2;
                hv10Var2 = new gv10(j, i2, calendar.getTime(), e3y0Var.b(zzsVar), MessagePresentationModel$State.SENT);
            } else {
                if (sender.b != Sender.Role.DRIVER || translation == null || (str = translation.b) == null || str.length() == 0) {
                    Sender.Role role2 = sender.b;
                    a3y0Var = a3y0Var2;
                    long j2 = drq0Var.a;
                    int i4 = d3y0.a[role2.ordinal()];
                    if (i4 == 1) {
                        i = xkh0.item_chat_client_message;
                    } else if (i4 == 2) {
                        i = xkh0.item_chat_driver_message;
                    } else if (i4 == 3) {
                        i = xkh0.item_chat_system_message;
                    } else {
                        if (i4 != 4) {
                            w511.b();
                            return obj3;
                        }
                        a3y0Var.b("textMessageType", new IllegalArgumentException("Unsupported sender role"), new z2y0(13));
                        i = xkh0.item_chat_system_message;
                    }
                    hv10Var = new hv10(j2, i, calendar.getTime(), str2 == null ? "" : str2, MessagePresentationModel$State.SENT);
                } else {
                    if (str == null) {
                        ny61.g("Translation text must not be null for driver message with translation");
                        return obj3;
                    }
                    a3y0Var = a3y0Var2;
                    hv10Var = new iv10(drq0Var.a, xkh0.item_chat_driver_message_with_translation, calendar.getTime(), str2 == null ? "" : str2, str, MessagePresentationModel$State.SENT);
                }
                hv10Var2 = hv10Var;
            }
            arrayList4.add(hv10Var2);
            a3y0Var2 = a3y0Var;
            obj2 = obj3;
        }
        return kotlin.collections.a.m0(arrayList4, arrayList3);
    }
}
