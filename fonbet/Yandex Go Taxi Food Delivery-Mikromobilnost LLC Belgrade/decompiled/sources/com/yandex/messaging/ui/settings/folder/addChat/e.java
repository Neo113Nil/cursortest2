package com.yandex.messaging.ui.settings.folder.addChat;

import defpackage.n6y;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.s6y;
import defpackage.t6y;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class e implements vpr {
    public final /* synthetic */ androidx.compose.foundation.lazy.b a;
    public final /* synthetic */ oz40 b;

    public e(androidx.compose.foundation.lazy.b bVar, oz40 oz40Var) {
        this.a = bVar;
        this.b = oz40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r12 >= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if ((r7 + r3.p) <= r5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(List list, Continuation continuation) {
        AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1 addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1;
        int i;
        Integer num;
        Object obj;
        if (continuation instanceof AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1) {
            addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1 = (AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1) continuation;
            int i2 = addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list2 = (List) this.b.getValue();
                    if (list.size() == list2.size() + 1) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (!list2.contains((String) obj)) {
                                break;
                            }
                        }
                        String str = (String) obj;
                        if (str != null) {
                            int indexOf = list.indexOf(str);
                            num = Integer.valueOf(indexOf);
                        }
                    }
                    num = null;
                    if (num != null) {
                        androidx.compose.foundation.lazy.b bVar = this.a;
                        s6y j = bVar.j();
                        int intValue = num.intValue();
                        Iterator it2 = j.k.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (((t6y) ((n6y) next)).a == intValue) {
                                obj3 = next;
                                break;
                            }
                        }
                        n6y n6yVar = (n6y) obj3;
                        if (n6yVar != null) {
                            int i3 = j.l;
                            int i4 = j.m;
                            t6y t6yVar = (t6y) n6yVar;
                            int i5 = t6yVar.o;
                            if (i5 >= i3) {
                            }
                        }
                        int intValue2 = num.intValue();
                        addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.L$0 = this;
                        addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.L$1 = list;
                        addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.label = 1;
                        if (bVar.f(intValue2, 0, addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.L$1;
                    this = (e) addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.L$0;
                    kotlin.b.b(obj2);
                }
                this.b.setValue(list);
                return zy11.a;
            }
        }
        addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1 = new AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1(this, continuation);
        Object obj22 = addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addChatsFolderContentKt$FilterAndChatsItemsListContent$1$1$2$emit$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        this.b.setValue(list);
        return zy11.a;
    }
}
