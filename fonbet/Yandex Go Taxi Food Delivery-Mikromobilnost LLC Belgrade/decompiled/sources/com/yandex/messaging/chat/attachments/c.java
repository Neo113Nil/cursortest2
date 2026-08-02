package com.yandex.messaging.chat.attachments;

import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.AddFilesParam;
import com.yandex.messaging.core.net.entities.AddFilesParams;
import com.yandex.messaging.core.net.entities.AddFilesResponse;
import com.yandex.messaging.core.net.entities.AddFilesResult;
import com.yandex.messaging.core.net.entities.ResolveYaDiskParam;
import com.yandex.messaging.core.net.entities.ResolveYaDiskParams;
import com.yandex.messaging.core.net.entities.ResolveYaDiskResponse;
import com.yandex.messaging.core.net.entities.ResolvedYaDiskFile;
import com.yandex.messaging.core.net.entities.YaDiskErrorInfo;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$addFiles$$inlined$makeCall$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$resolveYaDiskFileUrl$$inlined$makeCall$1;
import com.yandex.messaging.internal.pending.OutgoingAttachment$ExistingAttachment;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import defpackage.a1r;
import defpackage.ac3;
import defpackage.bc3;
import defpackage.bvf0;
import defpackage.cc3;
import defpackage.dc3;
import defpackage.doc;
import defpackage.fse;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.ic3;
import defpackage.j2r;
import defpackage.jl40;
import defpackage.jzq;
import defpackage.k2r;
import defpackage.kse;
import defpackage.kzq;
import defpackage.lqo;
import defpackage.m2r;
import defpackage.n2r;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.oyj0;
import defpackage.oyr;
import defpackage.pm50;
import defpackage.rr41;
import defpackage.scc;
import defpackage.t2r;
import defpackage.tcc;
import defpackage.tje;
import defpackage.to3;
import defpackage.tw80;
import defpackage.tz10;
import defpackage.u2r;
import defpackage.v0r;
import defpackage.x22;
import defpackage.yb3;
import defpackage.yw80;
import defpackage.z83;
import defpackage.zb3;
import defpackage.zj51;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public final class c {
    public final o1b0 a;
    public final a1r b;
    public final to3 c;
    public final kzq d;
    public final a e;
    public final t2r f;
    public final ic3 g;
    public final rr41 h;
    public final lqo i;
    public final doc j;
    public final kse k;
    public final pm50 l;

    public c(o1b0 o1b0Var, a1r a1rVar, to3 to3Var, kzq kzqVar, a aVar, t2r t2rVar, ic3 ic3Var, rr41 rr41Var, lqo lqoVar, doc docVar, kse kseVar, pm50 pm50Var) {
        this.a = o1b0Var;
        this.b = a1rVar;
        this.c = to3Var;
        this.d = kzqVar;
        this.e = aVar;
        this.f = t2rVar;
        this.g = ic3Var;
        this.h = rr41Var;
        this.i = lqoVar;
        this.j = docVar;
        this.k = kseVar;
        this.l = pm50Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
    
        if (r11 != r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0090, code lost:
    
        if (r11 == r1) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(k2r k2rVar, ArrayList arrayList, ContinuationImpl continuationImpl) {
        YaDiskAttachmentsUploader$addFiles$1 yaDiskAttachmentsUploader$addFiles$1;
        int i;
        ArrayList arrayList2;
        AddFilesResponse addFilesResponse;
        Object obj;
        bc3 bc3Var;
        if (continuationImpl instanceof YaDiskAttachmentsUploader$addFiles$1) {
            yaDiskAttachmentsUploader$addFiles$1 = (YaDiskAttachmentsUploader$addFiles$1) continuationImpl;
            int i2 = yaDiskAttachmentsUploader$addFiles$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yaDiskAttachmentsUploader$addFiles$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = yaDiskAttachmentsUploader$addFiles$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yaDiskAttachmentsUploader$addFiles$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = k2rVar.a;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new AddFilesParam(((u2r) it.next()).a));
                    }
                    AddFilesParams addFilesParams = new AddFilesParams(this.a.b, arrayList3);
                    yaDiskAttachmentsUploader$addFiles$1.L$0 = this;
                    yaDiskAttachmentsUploader$addFiles$1.L$1 = arrayList;
                    yaDiskAttachmentsUploader$addFiles$1.label = 1;
                    fse fseVar = yaDiskAttachmentsUploader$addFiles$1.get_context();
                    if (fseVar == null) {
                        fseVar = yaDiskAttachmentsUploader$addFiles$1.get_context();
                    }
                    obj2 = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$addFiles$$inlined$makeCall$1(null, this.c, addFilesParams), yaDiskAttachmentsUploader$addFiles$1);
                    arrayList2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                            return (dc3) obj2;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r10 = (List) yaDiskAttachmentsUploader$addFiles$1.L$1;
                    this = (c) yaDiskAttachmentsUploader$addFiles$1.L$0;
                    kotlin.b.b(obj2);
                    arrayList2 = r10;
                }
                addFilesResponse = (AddFilesResponse) ((oyj0) obj2).b();
                if (addFilesResponse != null) {
                    if (addFilesResponse.getFiles().size() != arrayList2.size()) {
                        z83.i();
                    } else {
                        Iterator it2 = addFilesResponse.getFiles().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (((AddFilesResult) obj).getFileId() == null) {
                                break;
                            }
                        }
                        if (((AddFilesResult) obj) == null) {
                            List<AddFilesResult> files = addFilesResponse.getFiles();
                            ArrayList arrayList4 = new ArrayList(tcc.n(files, 10));
                            int i3 = 0;
                            for (Object obj3 : files) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                String fileId = ((AddFilesResult) obj3).getFileId();
                                arrayList4.add(fileId != null ? new u2r(fileId, (AttachInfo) arrayList2.get(i3)) : null);
                                i3 = i4;
                            }
                            bc3Var = new bc3(kotlin.collections.a.M(arrayList4));
                            this.b(bc3Var);
                            if (bc3Var != null) {
                                return bc3Var;
                            }
                        }
                    }
                    bc3Var = null;
                    if (bc3Var != null) {
                    }
                }
                fse fseVar2 = yaDiskAttachmentsUploader$addFiles$1.get_context();
                YaDiskAttachmentsUploader$addFiles$$inlined$cancelableCoroutineWrapper$default$1 yaDiskAttachmentsUploader$addFiles$$inlined$cancelableCoroutineWrapper$default$1 = new YaDiskAttachmentsUploader$addFiles$$inlined$cancelableCoroutineWrapper$default$1(2, null);
                yaDiskAttachmentsUploader$addFiles$1.L$0 = null;
                yaDiskAttachmentsUploader$addFiles$1.L$1 = null;
                yaDiskAttachmentsUploader$addFiles$1.label = 2;
                obj2 = tje.k0(fseVar2, yaDiskAttachmentsUploader$addFiles$$inlined$cancelableCoroutineWrapper$default$1, yaDiskAttachmentsUploader$addFiles$1);
            }
        }
        yaDiskAttachmentsUploader$addFiles$1 = new YaDiskAttachmentsUploader$addFiles$1(this, continuationImpl);
        Object obj22 = yaDiskAttachmentsUploader$addFiles$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yaDiskAttachmentsUploader$addFiles$1.label;
        if (i != 0) {
        }
        addFilesResponse = (AddFilesResponse) ((oyj0) obj22).b();
        if (addFilesResponse != null) {
        }
        fse fseVar22 = yaDiskAttachmentsUploader$addFiles$1.get_context();
        YaDiskAttachmentsUploader$addFiles$$inlined$cancelableCoroutineWrapper$default$1 yaDiskAttachmentsUploader$addFiles$$inlined$cancelableCoroutineWrapper$default$12 = new YaDiskAttachmentsUploader$addFiles$$inlined$cancelableCoroutineWrapper$default$1(2, null);
        yaDiskAttachmentsUploader$addFiles$1.L$0 = null;
        yaDiskAttachmentsUploader$addFiles$1.L$1 = null;
        yaDiskAttachmentsUploader$addFiles$1.label = 2;
        obj22 = tje.k0(fseVar22, yaDiskAttachmentsUploader$addFiles$$inlined$cancelableCoroutineWrapper$default$12, yaDiskAttachmentsUploader$addFiles$1);
    }

    public final void b(bc3 bc3Var) {
        List list = bc3Var.a;
        if (list.size() != 1) {
            return;
        }
        u2r u2rVar = (u2r) kotlin.collections.a.P(list);
        if (u2rVar.b.isImage()) {
            this.g.b(u2rVar.a, u2rVar.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0213, code lost:
    
        if (r1 == r3) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0196  */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(yw80 yw80Var, List list, ContinuationImpl continuationImpl) {
        YaDiskAttachmentsUploader$uploadAttachments$1 yaDiskAttachmentsUploader$uploadAttachments$1;
        int i;
        Object obj;
        ArrayList arrayList;
        yw80 yw80Var2;
        List list2;
        String str;
        c cVar;
        List list3;
        ac3 ac3Var;
        String str2;
        oyj0 oyj0Var;
        c cVar2;
        String str3;
        c cVar3;
        String str4;
        n2r n2rVar;
        ResolveYaDiskResponse resolveYaDiskResponse;
        Object j2rVar;
        YaDiskErrorInfo yaDiskErrorInfo;
        c cVar4;
        c cVar5 = this;
        if (continuationImpl instanceof YaDiskAttachmentsUploader$uploadAttachments$1) {
            yaDiskAttachmentsUploader$uploadAttachments$1 = (YaDiskAttachmentsUploader$uploadAttachments$1) continuationImpl;
            int i2 = yaDiskAttachmentsUploader$uploadAttachments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yaDiskAttachmentsUploader$uploadAttachments$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = yaDiskAttachmentsUploader$uploadAttachments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yaDiskAttachmentsUploader$uploadAttachments$1.label;
                ac3 ac3Var2 = ac3.a;
                String str5 = "messageId";
                cc3 cc3Var = cc3.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    list.isEmpty();
                    z83.i();
                    List list4 = list;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list4) {
                        if (obj3 instanceof tw80) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list4) {
                        if (obj4 instanceof OutgoingAttachment$ExistingAttachment) {
                            arrayList3.add(obj4);
                        }
                    }
                    String str6 = cVar5.a.b;
                    yaDiskAttachmentsUploader$uploadAttachments$1.L$0 = cVar5;
                    yaDiskAttachmentsUploader$uploadAttachments$1.L$1 = yw80Var;
                    yaDiskAttachmentsUploader$uploadAttachments$1.L$2 = arrayList2;
                    yaDiskAttachmentsUploader$uploadAttachments$1.label = 1;
                    Object a = cVar5.e.a(str6, arrayList3, yaDiskAttachmentsUploader$uploadAttachments$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        arrayList = arrayList2;
                        yw80Var2 = yw80Var;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    ?? r0 = (List) yaDiskAttachmentsUploader$uploadAttachments$1.L$2;
                    yw80Var2 = (yw80) yaDiskAttachmentsUploader$uploadAttachments$1.L$1;
                    c cVar6 = (c) yaDiskAttachmentsUploader$uploadAttachments$1.L$0;
                    kotlin.b.b(obj2);
                    obj = obj2;
                    arrayList = r0;
                    cVar5 = cVar6;
                } else if (i == 2) {
                    String str7 = (String) yaDiskAttachmentsUploader$uploadAttachments$1.L$1;
                    c cVar7 = (c) yaDiskAttachmentsUploader$uploadAttachments$1.L$0;
                    kotlin.b.b(obj2);
                    cVar = cVar7;
                    str = str7;
                    list3 = (List) obj2;
                    if (!list3.isEmpty()) {
                        cVar.h.s(str, "all files failed to prepare");
                        cVar.b.a(str, new IOException("all files failed to prepare"));
                        return cc3Var;
                    }
                    List<zj51> list5 = list3;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list5, 10));
                    for (zj51 zj51Var : list5) {
                        jzq jzqVar = zj51Var.c.b.b;
                        arrayList4.add(new ResolveYaDiskParam(zj51Var.a, jzqVar.a, jzqVar.b));
                        ac3Var2 = ac3Var2;
                        str5 = str5;
                    }
                    ac3Var = ac3Var2;
                    str2 = str5;
                    if (arrayList4.isEmpty()) {
                        arrayList4 = null;
                    }
                    if (arrayList4 != null) {
                        a1r a1rVar = cVar.b;
                        a1rVar.d.post(new v0r(a1rVar, str, 2));
                        to3 to3Var = cVar.c;
                        ResolveYaDiskParams resolveYaDiskParams = new ResolveYaDiskParams(arrayList4, cVar.l.c);
                        yaDiskAttachmentsUploader$uploadAttachments$1.L$0 = cVar;
                        yaDiskAttachmentsUploader$uploadAttachments$1.L$1 = str;
                        yaDiskAttachmentsUploader$uploadAttachments$1.L$2 = list3;
                        yaDiskAttachmentsUploader$uploadAttachments$1.label = 3;
                        fse fseVar = yaDiskAttachmentsUploader$uploadAttachments$1.get_context();
                        if (fseVar == null) {
                            fseVar = yaDiskAttachmentsUploader$uploadAttachments$1.get_context();
                        }
                        obj2 = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$resolveYaDiskFileUrl$$inlined$makeCall$1(null, to3Var, resolveYaDiskParams), yaDiskAttachmentsUploader$uploadAttachments$1);
                    } else {
                        oyj0Var = null;
                        cVar2 = cVar;
                        str3 = str;
                        if (oyj0Var == null) {
                        }
                        if (oyj0Var == null) {
                        }
                        cVar3 = cVar2;
                        str4 = str3;
                        n2rVar = null;
                        if (!(n2rVar instanceof m2r)) {
                        }
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str4 = (String) yaDiskAttachmentsUploader$uploadAttachments$1.L$1;
                            cVar4 = (c) yaDiskAttachmentsUploader$uploadAttachments$1.L$0;
                            kotlin.b.b(obj2);
                            str2 = "messageId";
                            dc3 dc3Var = (dc3) obj2;
                            rr41 rr41Var = cVar4.h;
                            Long l = (Long) ((HashMap) rr41Var.c).get(str4);
                            ((x22) rr41Var.b).reportEvent("yadisk_upload_flow_succeed", kotlin.collections.b.i(new Pair(str2, str4), new Pair(RemoteBioParameters.TIME, l != null ? Long.valueOf(SystemClock.elapsedRealtime() - l.longValue()) : null)));
                            return dc3Var;
                        }
                        str4 = (String) yaDiskAttachmentsUploader$uploadAttachments$1.L$1;
                        cVar3 = (c) yaDiskAttachmentsUploader$uploadAttachments$1.L$0;
                        kotlin.b.b(obj2);
                        ac3Var = ac3Var2;
                        str2 = "messageId";
                        n2rVar = (n2r) obj2;
                        if (!(n2rVar instanceof m2r)) {
                            cVar3.h.s(str4, "no space on ya.disk");
                            cVar3.b.a(str4, new IOException("no space on ya.disk"));
                            return ac3Var;
                        }
                        if (!(n2rVar instanceof k2r)) {
                            cVar3.h.s(str4, "unhandled error");
                            cVar3.j.d(str4, "unhandled error");
                            cVar3.b.a(str4, new IOException("unhandled error"));
                            return cc3Var;
                        }
                        k2r k2rVar = (k2r) n2rVar;
                        List list6 = k2rVar.a;
                        ArrayList arrayList5 = new ArrayList(tcc.n(list6, 10));
                        Iterator it = list6.iterator();
                        while (it.hasNext()) {
                            arrayList5.add(((u2r) it.next()).b);
                        }
                        yaDiskAttachmentsUploader$uploadAttachments$1.L$0 = cVar3;
                        yaDiskAttachmentsUploader$uploadAttachments$1.L$1 = str4;
                        yaDiskAttachmentsUploader$uploadAttachments$1.L$2 = null;
                        yaDiskAttachmentsUploader$uploadAttachments$1.label = 5;
                        obj2 = cVar3.a(k2rVar, arrayList5, yaDiskAttachmentsUploader$uploadAttachments$1);
                        if (obj2 != coroutineSingletons) {
                            cVar4 = cVar3;
                            dc3 dc3Var2 = (dc3) obj2;
                            rr41 rr41Var2 = cVar4.h;
                            Long l2 = (Long) ((HashMap) rr41Var2.c).get(str4);
                            ((x22) rr41Var2.b).reportEvent("yadisk_upload_flow_succeed", kotlin.collections.b.i(new Pair(str2, str4), new Pair(RemoteBioParameters.TIME, l2 != null ? Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue()) : null)));
                            return dc3Var2;
                        }
                        return coroutineSingletons;
                    }
                    list3 = (List) yaDiskAttachmentsUploader$uploadAttachments$1.L$2;
                    str = (String) yaDiskAttachmentsUploader$uploadAttachments$1.L$1;
                    cVar = (c) yaDiskAttachmentsUploader$uploadAttachments$1.L$0;
                    kotlin.b.b(obj2);
                    ac3Var = ac3Var2;
                    str2 = "messageId";
                    oyj0Var = (oyj0) obj2;
                    cVar2 = cVar;
                    str3 = str;
                    if (oyj0Var == null && (yaDiskErrorInfo = (YaDiskErrorInfo) oyj0Var.a()) != null) {
                        String str8 = yaDiskErrorInfo.b;
                        int i3 = yaDiskErrorInfo.a;
                        if (i3 == 403) {
                            if (!jl40.l(str8, "DiskUnsupportedUserAccountTypeError")) {
                                cVar2.h.s(str3, "ya.disk storage overflow");
                                cVar2.b.a(str3, new IOException("ya.disk storage overflow"));
                                return yb3.a;
                            }
                            cVar2.h.s(str3, "unauthorize error");
                            cVar2.j.d(str3, "unauthorize error " + str8);
                            cVar2.b.a(str3, new IOException(g8e.o("unauthorize error ", str8)));
                            return cc3Var;
                        }
                        if (i3 == 413) {
                            cVar2.h.s(str3, "file too large to upload to ya.disk");
                            cVar2.b.a(str3, new IOException("file too large to upload to ya.disk"));
                            return zb3.a;
                        }
                        if (i3 == 507) {
                            cVar2.h.s(str3, "no space on ya.disk");
                            cVar2.b.a(str3, new IOException("no space on ya.disk"));
                            return ac3Var;
                        }
                        cVar2.h.s(str3, "unhandled error code " + i3);
                        cVar2.j.d(str3, "unhandled error code " + i3);
                        cVar2.b.a(str3, new IOException(oyr.i(i3, "unhandled error code ")));
                        return cc3Var;
                    }
                    if (oyj0Var == null && (resolveYaDiskResponse = (ResolveYaDiskResponse) oyj0Var.b()) != null) {
                        yaDiskAttachmentsUploader$uploadAttachments$1.L$0 = cVar2;
                        yaDiskAttachmentsUploader$uploadAttachments$1.L$1 = str3;
                        yaDiskAttachmentsUploader$uploadAttachments$1.L$2 = null;
                        yaDiskAttachmentsUploader$uploadAttachments$1.label = 4;
                        cVar2.getClass();
                        List<ResolvedYaDiskFile> files = resolveYaDiskResponse.getFiles();
                        List<ResolvedYaDiskFile> list7 = files;
                        if (list7 == null || list7.isEmpty()) {
                            z83.i();
                            new IllegalArgumentException("no files in response");
                            j2rVar = new j2r();
                        } else {
                            List list8 = list3;
                            int d = gw00.d(tcc.n(list8, 10));
                            if (d < 16) {
                                d = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                            for (Object obj5 : list8) {
                                linkedHashMap.put(((zj51) obj5).a, obj5);
                            }
                            j2rVar = tje.k0(yaDiskAttachmentsUploader$uploadAttachments$1.get_context(), new YaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1(null, cVar2, files, linkedHashMap, str3), yaDiskAttachmentsUploader$uploadAttachments$1);
                        }
                        obj2 = j2rVar;
                        if (obj2 != coroutineSingletons) {
                            cVar3 = cVar2;
                            str4 = str3;
                            n2rVar = (n2r) obj2;
                            if (!(n2rVar instanceof m2r)) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    cVar3 = cVar2;
                    str4 = str3;
                    n2rVar = null;
                    if (!(n2rVar instanceof m2r)) {
                    }
                }
                list2 = (List) obj;
                if (list2.isEmpty()) {
                    arrayList.isEmpty();
                    z83.i();
                    bc3 bc3Var = new bc3(list2);
                    cVar5.b(bc3Var);
                    return bc3Var;
                }
                str = yw80Var2.a;
                String uuid = cVar5.i.a(tz10.n) ? str : UUID.randomUUID().toString();
                rr41 rr41Var3 = cVar5.h;
                ((HashMap) rr41Var3.c).put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                ((x22) rr41Var3.b).reportEvent("yadisk_upload_flow_start", kotlin.collections.b.i(new Pair("messageId", str), new Pair("filesCount", Integer.valueOf(arrayList.size()))));
                yaDiskAttachmentsUploader$uploadAttachments$1.L$0 = cVar5;
                yaDiskAttachmentsUploader$uploadAttachments$1.L$1 = str;
                yaDiskAttachmentsUploader$uploadAttachments$1.L$2 = null;
                yaDiskAttachmentsUploader$uploadAttachments$1.label = 2;
                obj2 = bvf0.n(new YaDiskAttachmentsUploader$prepareFiles$2(arrayList, cVar5, uuid, null), yaDiskAttachmentsUploader$uploadAttachments$1);
                if (obj2 != coroutineSingletons) {
                    cVar = cVar5;
                    list3 = (List) obj2;
                    if (!list3.isEmpty()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        yaDiskAttachmentsUploader$uploadAttachments$1 = new YaDiskAttachmentsUploader$uploadAttachments$1(cVar5, continuationImpl);
        Object obj22 = yaDiskAttachmentsUploader$uploadAttachments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yaDiskAttachmentsUploader$uploadAttachments$1.label;
        ac3 ac3Var22 = ac3.a;
        String str52 = "messageId";
        cc3 cc3Var2 = cc3.a;
        if (i != 0) {
        }
        list2 = (List) obj;
        if (list2.isEmpty()) {
        }
    }
}
