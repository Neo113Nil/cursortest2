package com.yandex.messaging.chat.attachments;

import android.net.Uri;
import com.yandex.messaging.internal.pending.OutgoingAttachment$ExistingAttachment;
import defpackage.bc3;
import defpackage.bx10;
import defpackage.f22;
import defpackage.h3y;
import defpackage.h73;
import defpackage.ic3;
import defpackage.ny61;
import defpackage.s5r;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tw80;
import defpackage.u2r;
import defpackage.uw80;
import defpackage.yw80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final h3y a;
    public final a b;
    public final ic3 c;

    public b(h3y h3yVar, a aVar, ic3 ic3Var) {
        this.a = h3yVar;
        this.b = aVar;
        this.c = ic3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c4, code lost:
    
        if (r3 == r5) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0116 A[LOOP:0: B:12:0x0110->B:14:0x0116, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, yw80 yw80Var, ContinuationImpl continuationImpl) {
        AttachmentsUploader$uploadAttachments$1 attachmentsUploader$uploadAttachments$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ArrayList arrayList;
        b bVar;
        List list;
        s5r s5rVar;
        b bVar2 = this;
        if (continuationImpl instanceof AttachmentsUploader$uploadAttachments$1) {
            attachmentsUploader$uploadAttachments$1 = (AttachmentsUploader$uploadAttachments$1) continuationImpl;
            int i2 = attachmentsUploader$uploadAttachments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                attachmentsUploader$uploadAttachments$1.label = i2 - Integer.MIN_VALUE;
                obj = attachmentsUploader$uploadAttachments$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = attachmentsUploader$uploadAttachments$1.label;
                EmptyList emptyList = EmptyList.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    uw80[] uw80VarArr = yw80Var.d;
                    if (uw80VarArr == null) {
                        return new bc3(emptyList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (uw80 uw80Var : uw80VarArr) {
                        if (uw80Var instanceof tw80) {
                            arrayList2.add(uw80Var);
                        }
                    }
                    arrayList = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        tw80 tw80Var = (tw80) it.next();
                        arrayList.add(new bx10(Uri.parse(tw80Var.a), str, yw80Var.a, tw80Var.b));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (uw80 uw80Var2 : uw80VarArr) {
                        if (uw80Var2 instanceof OutgoingAttachment$ExistingAttachment) {
                            arrayList3.add(uw80Var2);
                        }
                    }
                    attachmentsUploader$uploadAttachments$1.L$0 = bVar2;
                    attachmentsUploader$uploadAttachments$1.L$1 = arrayList;
                    attachmentsUploader$uploadAttachments$1.label = 1;
                    obj = bVar2.b.a(str, arrayList3, attachmentsUploader$uploadAttachments$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = (List) attachmentsUploader$uploadAttachments$1.L$1;
                        bVar = (b) attachmentsUploader$uploadAttachments$1.L$0;
                        kotlin.b.b(obj);
                        ArrayList m0 = kotlin.collections.a.m0(list, (List) obj);
                        s5rVar = new s5r(kotlin.sequences.b.g(new h73(1, m0), new f22(25)));
                        while (s5rVar.hasNext()) {
                            u2r u2rVar = (u2r) s5rVar.next();
                            bVar.c.b(u2rVar.a, u2rVar.b);
                        }
                        return new bc3(m0);
                    }
                    ?? r0 = (List) attachmentsUploader$uploadAttachments$1.L$1;
                    b bVar3 = (b) attachmentsUploader$uploadAttachments$1.L$0;
                    kotlin.b.b(obj);
                    arrayList = r0;
                    bVar2 = bVar3;
                }
                List list2 = (List) obj;
                attachmentsUploader$uploadAttachments$1.L$0 = bVar2;
                attachmentsUploader$uploadAttachments$1.L$1 = list2;
                attachmentsUploader$uploadAttachments$1.label = 2;
                bVar2.getClass();
                obj = !arrayList.isEmpty() ? emptyList : tje.k0(attachmentsUploader$uploadAttachments$1.get_context(), new AttachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1(null, bVar2, arrayList), attachmentsUploader$uploadAttachments$1);
                if (obj != coroutineSingletons) {
                    bVar = bVar2;
                    list = list2;
                    ArrayList m02 = kotlin.collections.a.m0(list, (List) obj);
                    s5rVar = new s5r(kotlin.sequences.b.g(new h73(1, m02), new f22(25)));
                    while (s5rVar.hasNext()) {
                    }
                    return new bc3(m02);
                }
                return coroutineSingletons;
            }
        }
        attachmentsUploader$uploadAttachments$1 = new AttachmentsUploader$uploadAttachments$1(bVar2, continuationImpl);
        obj = attachmentsUploader$uploadAttachments$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = attachmentsUploader$uploadAttachments$1.label;
        EmptyList emptyList2 = EmptyList.a;
        if (i != 0) {
        }
        List list22 = (List) obj;
        attachmentsUploader$uploadAttachments$1.L$0 = bVar2;
        attachmentsUploader$uploadAttachments$1.L$1 = list22;
        attachmentsUploader$uploadAttachments$1.label = 2;
        bVar2.getClass();
        if (!arrayList.isEmpty()) {
        }
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
