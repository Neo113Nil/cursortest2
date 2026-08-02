package com.yandex.messaging.chat.attachments;

import android.net.Uri;
import com.yandex.messaging.core.net.entities.ShareFileParams;
import com.yandex.messaging.core.net.entities.ShareFileResponse;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$shareFiles$$inlined$makeCall$1;
import com.yandex.messaging.internal.pending.OutgoingAttachment$ExistingAttachment;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import defpackage.fse;
import defpackage.gw00;
import defpackage.h3y;
import defpackage.k020;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.qv10;
import defpackage.tcc;
import defpackage.tje;
import defpackage.to3;
import defpackage.u2r;
import defpackage.ycc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a {
    public final h3y a;
    public final k020 b;

    public a(h3y h3yVar, k020 k020Var) {
        this.a = h3yVar;
        this.b = k020Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0127 -> B:10:0x012a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        AttachmentsSharingController$shareAttachments$1 attachmentsSharingController$shareAttachments$1;
        int i;
        LinkedHashMap linkedHashMap;
        a aVar;
        Iterator it;
        ArrayList arrayList2;
        if (continuationImpl instanceof AttachmentsSharingController$shareAttachments$1) {
            attachmentsSharingController$shareAttachments$1 = (AttachmentsSharingController$shareAttachments$1) continuationImpl;
            int i2 = attachmentsSharingController$shareAttachments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                attachmentsSharingController$shareAttachments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = attachmentsSharingController$shareAttachments$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = attachmentsSharingController$shareAttachments$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int d = gw00.d(tcc.n(arrayList, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    linkedHashMap = new LinkedHashMap(d);
                    for (Object obj3 : arrayList) {
                        linkedHashMap.put(((OutgoingAttachment$ExistingAttachment) obj3).getExistingId(), obj3);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : arrayList) {
                        String originalChatId = ((OutgoingAttachment$ExistingAttachment) obj4).getOriginalChatId();
                        Object obj5 = linkedHashMap2.get(originalChatId);
                        if (obj5 == null) {
                            obj5 = qv10.w(originalChatId, linkedHashMap2);
                        }
                        ((List) obj5).add(obj4);
                    }
                    ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        String u = this.b.u(str2);
                        List list2 = list;
                        ArrayList arrayList4 = new ArrayList(tcc.n(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((OutgoingAttachment$ExistingAttachment) it2.next()).getExistingId());
                        }
                        arrayList3.add(new ShareFileParams((String[]) arrayList4.toArray(new String[0]), str2, str, u));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    aVar = this;
                    it = arrayList3.iterator();
                    arrayList2 = arrayList5;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) attachmentsSharingController$shareAttachments$1.L$3;
                    ?? r12 = (Collection) attachmentsSharingController$shareAttachments$1.L$2;
                    ?? r13 = (Map) attachmentsSharingController$shareAttachments$1.L$1;
                    a aVar2 = (a) attachmentsSharingController$shareAttachments$1.L$0;
                    kotlin.b.b(obj);
                    linkedHashMap = r13;
                    arrayList2 = r12;
                    aVar = aVar2;
                    ycc.r((Iterable) obj, arrayList2);
                    if (it.hasNext()) {
                        ShareFileParams shareFileParams = (ShareFileParams) it.next();
                        attachmentsSharingController$shareAttachments$1.L$0 = aVar;
                        attachmentsSharingController$shareAttachments$1.L$1 = linkedHashMap;
                        attachmentsSharingController$shareAttachments$1.L$2 = arrayList2;
                        attachmentsSharingController$shareAttachments$1.L$3 = it;
                        attachmentsSharingController$shareAttachments$1.label = 1;
                        obj = aVar.b(shareFileParams, linkedHashMap, attachmentsSharingController$shareAttachments$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        ycc.r((Iterable) obj, arrayList2);
                        if (it.hasNext()) {
                            return arrayList2;
                        }
                    }
                }
            }
        }
        attachmentsSharingController$shareAttachments$1 = new AttachmentsSharingController$shareAttachments$1(this, continuationImpl);
        Object obj6 = attachmentsSharingController$shareAttachments$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = attachmentsSharingController$shareAttachments$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ShareFileParams shareFileParams, Map map, ContinuationImpl continuationImpl) {
        AttachmentsSharingController$shareFiles$1 attachmentsSharingController$shareFiles$1;
        int i;
        Map map2;
        ShareFileResponse shareFileResponse;
        String[] fileIds;
        Uri uri;
        ShareFileParams shareFileParams2 = shareFileParams;
        if (continuationImpl instanceof AttachmentsSharingController$shareFiles$1) {
            attachmentsSharingController$shareFiles$1 = (AttachmentsSharingController$shareFiles$1) continuationImpl;
            int i2 = attachmentsSharingController$shareFiles$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                attachmentsSharingController$shareFiles$1.label = i2 - Integer.MIN_VALUE;
                Object obj = attachmentsSharingController$shareFiles$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = attachmentsSharingController$shareFiles$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    to3 to3Var = (to3) this.a.get();
                    attachmentsSharingController$shareFiles$1.L$0 = shareFileParams2;
                    attachmentsSharingController$shareFiles$1.L$1 = map;
                    attachmentsSharingController$shareFiles$1.label = 1;
                    fse fseVar = attachmentsSharingController$shareFiles$1.get_context();
                    if (fseVar == null) {
                        fseVar = attachmentsSharingController$shareFiles$1.get_context();
                    }
                    Object k0 = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$shareFiles$$inlined$makeCall$1(null, to3Var, shareFileParams2), attachmentsSharingController$shareFiles$1);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = k0;
                    map2 = map;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map2 = (Map) attachmentsSharingController$shareFiles$1.L$1;
                    shareFileParams2 = (ShareFileParams) attachmentsSharingController$shareFiles$1.L$0;
                    kotlin.b.b(obj);
                }
                shareFileResponse = (ShareFileResponse) ((oyj0) obj).b();
                if (shareFileResponse != null || (fileIds = shareFileResponse.getFileIds()) == null) {
                    return EmptyList.a;
                }
                ArrayList arrayList = new ArrayList(fileIds.length);
                int length = fileIds.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    String str = fileIds[i3];
                    int i5 = i4 + 1;
                    Object obj2 = map2.get(shareFileParams2.getFileIds()[i4]);
                    if (obj2 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    OutgoingAttachment$ExistingAttachment outgoingAttachment$ExistingAttachment = (OutgoingAttachment$ExistingAttachment) obj2;
                    if (outgoingAttachment$ExistingAttachment.getUri() == null || (uri = Uri.parse(outgoingAttachment$ExistingAttachment.getUri())) == null) {
                        uri = Uri.EMPTY;
                    }
                    arrayList.add(new u2r(str, new AttachInfo(uri, outgoingAttachment$ExistingAttachment.getExistingId(), outgoingAttachment$ExistingAttachment.getOriginalChatId(), outgoingAttachment$ExistingAttachment.getFileName(), outgoingAttachment$ExistingAttachment.getFileSize(), outgoingAttachment$ExistingAttachment.getMimeType(), outgoingAttachment$ExistingAttachment.getWidth(), outgoingAttachment$ExistingAttachment.getHeight(), false, outgoingAttachment$ExistingAttachment.getDurationMs(), outgoingAttachment$ExistingAttachment.getThumbHash())));
                    i3++;
                    i4 = i5;
                }
                return arrayList;
            }
        }
        attachmentsSharingController$shareFiles$1 = new AttachmentsSharingController$shareFiles$1(this, continuationImpl);
        Object obj3 = attachmentsSharingController$shareFiles$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = attachmentsSharingController$shareFiles$1.label;
        if (i != 0) {
        }
        shareFileResponse = (ShareFileResponse) ((oyj0) obj3).b();
        if (shareFileResponse != null) {
        }
        return EmptyList.a;
    }
}
