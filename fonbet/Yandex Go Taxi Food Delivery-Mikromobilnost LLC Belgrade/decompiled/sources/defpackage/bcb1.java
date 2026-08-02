package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import com.yandex.messaging.SendAction;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.ui.sharing.SharingData$SharingFileData;
import com.yandex.messaging.ui.sharing.SharingData$SharingImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public abstract class bcb1 {
    public static long a() {
        return mhx.a;
    }

    public static long b() {
        return mhx.h;
    }

    public static long c() {
        return mhx.e;
    }

    public static long d() {
        return mhx.f;
    }

    public static long e() {
        return mhx.g;
    }

    public static long f() {
        return mhx.d;
    }

    public static long g() {
        return mhx.r;
    }

    public static long h() {
        return mhx.u;
    }

    public static long i() {
        return mhx.c;
    }

    public static long j() {
        return mhx.b;
    }

    public static long k() {
        return mhx.E;
    }

    public static long l() {
        return mhx.D;
    }

    public static long m() {
        return mhx.C;
    }

    public static long n() {
        return mhx.p;
    }

    public static final void o(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void p(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public static final defpackage.hqr0 q(android.os.Bundle r10) {
        /*
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r1 = "android.intent.extra.STREAM"
            java.lang.Object r10 = r10.get(r1)
            r6 = 0
            if (r0 != 0) goto L12
            if (r10 != 0) goto L12
            return r6
        L12:
            u620 r2 = defpackage.u620.d
            com.yandex.messaging.SendAction r3 = com.yandex.messaging.SendAction.SHARE
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.a
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.toString()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L24
        L23:
            r0 = r1
        L24:
            if (r10 == 0) goto L34
            boolean r4 = r10 instanceof android.net.Uri
            if (r4 == 0) goto L2d
            android.net.Uri r10 = (android.net.Uri) r10
            goto L2e
        L2d:
            r10 = r6
        L2e:
            java.util.List r10 = defpackage.scc.h(r10)
            r4 = r1
            goto L36
        L34:
            r10 = r1
            r4 = r10
        L36:
            hqr0 r1 = new hqr0
            r5 = 240(0xf0, float:3.36E-43)
            r7 = r5 & 4
            if (r7 == 0) goto L3f
            r0 = r4
        L3f:
            r7 = r5 & 8
            if (r7 == 0) goto L44
            r10 = r4
        L44:
            r5 = r5 & 32
            if (r5 == 0) goto L4a
            r7 = r4
            goto L4b
        L4a:
            r7 = r6
        L4b:
            r8 = 0
            r9 = 0
            r5 = r10
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcb1.q(android.os.Bundle):hqr0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hqr0 r(Bundle bundle) {
        SendAction sendAction;
        ?? r8;
        Object obj;
        String string = bundle.getString("sharing open source");
        if (string != null) {
            int i = g720.c;
            g720 b = glb1.b(string);
            if (b != null) {
                String string2 = bundle.getString("send_action");
                EmptyList emptyList = null;
                if (string2 != null) {
                    Iterator it = SendAction.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((SendAction) obj).getAction(), string2)) {
                            break;
                        }
                    }
                    sendAction = (SendAction) obj;
                }
                sendAction = SendAction.NO_ACTION;
                String[] stringArray = bundle.getStringArray("share_texts");
                EmptyList emptyList2 = EmptyList.a;
                EmptyList d0 = stringArray != null ? j73.d0(stringArray) : emptyList2;
                Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) nu6.c(bundle, Uri.class, "share uris") : bundle.getParcelableArray("share uris");
                if (parcelableArray != null) {
                    List<Parcelable> d02 = j73.d0(parcelableArray);
                    r8 = new ArrayList(tcc.n(d02, 10));
                    for (Parcelable parcelable : d02) {
                        if (parcelable == null) {
                            ny61.t("null cannot be cast to non-null type android.net.Uri");
                            return null;
                        }
                        r8.add((Uri) parcelable);
                    }
                } else {
                    r8 = 0;
                }
                if (r8 == 0) {
                    r8 = emptyList2;
                }
                String string3 = bundle.getString("chat_id");
                Parcelable[] parcelableArray2 = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) nu6.c(bundle, ServerMessageRef.class, "forward_message_ids") : bundle.getParcelableArray("forward_message_ids");
                if (parcelableArray2 != null) {
                    List<Parcelable> d03 = j73.d0(parcelableArray2);
                    ?? arrayList = new ArrayList(tcc.n(d03, 10));
                    for (Parcelable parcelable2 : d03) {
                        if (parcelable2 == null) {
                            ny61.t("null cannot be cast to non-null type com.yandex.messaging.internal.ServerMessageRef");
                            return null;
                        }
                        arrayList.add((ServerMessageRef) parcelable2);
                    }
                    emptyList = arrayList;
                }
                if (emptyList != null) {
                    emptyList2 = emptyList;
                }
                SharingData$SharingImageData sharingData$SharingImageData = (SharingData$SharingImageData) vng.u(bundle, SharingData$SharingImageData.class, "share_image");
                SharingData$SharingFileData sharingData$SharingFileData = (SharingData$SharingFileData) vng.u(bundle, SharingData$SharingFileData.class, "share_file");
                List list = r8;
                EmptyList emptyList3 = emptyList2;
                String str = string3;
                hqr0 hqr0Var = new hqr0(b, sendAction, d0, list, str, emptyList3, sharingData$SharingFileData, sharingData$SharingImageData);
                hqr0 q = q(bundle);
                if (q == null) {
                    return hqr0Var;
                }
                if (sendAction == SendAction.NO_ACTION) {
                    sendAction = q.b;
                }
                ArrayList m0 = a.m0(q.c, d0);
                ArrayList m02 = a.m0(q.d, list);
                if (str == null) {
                    str = q.e;
                }
                ArrayList m03 = a.m0(q.f, emptyList3);
                if (sharingData$SharingImageData == null) {
                    sharingData$SharingImageData = q.h;
                }
                if (sharingData$SharingFileData == null) {
                    sharingData$SharingFileData = q.g;
                }
                return new hqr0(b, sendAction, m0, m02, str, m03, sharingData$SharingFileData, sharingData$SharingImageData);
            }
        }
        return q(bundle);
    }

    public static final Bundle s(hqr0 hqr0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("send_action", hqr0Var.b.getAction());
        bundle.putString("sharing open source", hqr0Var.a.c());
        bundle.putStringArray("share_texts", (String[]) hqr0Var.c.toArray(new String[0]));
        bundle.putParcelableArray("share uris", (Parcelable[]) hqr0Var.d.toArray(new Uri[0]));
        bundle.putString("chat_id", hqr0Var.e);
        bundle.putParcelableArray("forward_message_ids", (Parcelable[]) hqr0Var.f.toArray(new ServerMessageRef[0]));
        bundle.putParcelable("share_image", hqr0Var.h);
        bundle.putParcelable("share_file", hqr0Var.g);
        return bundle;
    }
}
