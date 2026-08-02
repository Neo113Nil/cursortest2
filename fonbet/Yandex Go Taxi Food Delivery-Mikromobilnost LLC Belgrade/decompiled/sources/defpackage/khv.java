package defpackage;

import android.app.Activity;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.domain.user.UserNameType;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.yandex.messaging.ui.imageviewer.ImageViewerMessageActions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kotlin.a;

/* loaded from: classes15.dex */
public final class khv extends n7b {
    public final Activity i;
    public final ImageViewerInfo j;
    public final List k;
    public final i9b l;
    public final arg m;
    public final ImageViewerMessageActions n;
    public final rp21 o;
    public final int[] p;
    public final i3y q;

    public khv(Activity activity, String str, ImageViewerInfo imageViewerInfo, ArrayList arrayList, k020 k020Var, j jVar, i9b i9bVar, arg argVar, ImageViewerMessageActions imageViewerMessageActions, ks10 ks10Var, boolean z, rp21 rp21Var) {
        super(str, k020Var, jVar, ks10Var, z);
        this.i = activity;
        this.j = imageViewerInfo;
        this.k = arrayList;
        this.l = i9bVar;
        this.m = argVar;
        this.n = imageViewerMessageActions;
        this.o = rp21Var;
        this.p = new int[]{1, 10};
        this.q = a.a(new tzt(10, this));
    }

    @Override // defpackage.x790
    public final void a(qgg qggVar) {
        tje.e();
        qggVar.F(new w790(j(Collections.singletonList(this.j)), true, true));
        qggVar.F(new w790(j(this.k), true, true));
    }

    @Override // defpackage.n7b
    public final ArrayList f(j3b j3bVar, long j, long j2, int i) {
        tje.f();
        long j3 = j3bVar.a;
        k020 k020Var = this.b;
        at2 at2Var = k020Var.b;
        long g = at2Var.Y().g(j3);
        az10 B = at2Var.B();
        Moshi moshi = (Moshi) k020Var.h.get();
        int[] iArr = this.p;
        boolean z = this.e;
        yab yabVar = new yab(iArr == null ? B.Q(j3, j, j2, i, z) : B.R(j3, j, j2, i, iArr, z), moshi, g);
        ArrayList arrayList = new ArrayList();
        int count = yabVar.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            yabVar.moveToPosition(i2);
            MessageData R = yabVar.R();
            if (R instanceof ImageMessageData) {
                ImageViewerInfo.Companion.getClass();
                arrayList.add(lhv.b(yabVar.P(), (ImageMessageData) R, null, null));
            } else if (R instanceof GalleryMessageData) {
                if (this.e) {
                    j73.U(((GalleryMessageData) R).items);
                }
                PlainMessage.Item[] itemArr = ((GalleryMessageData) R).items;
                ArrayList arrayList2 = new ArrayList(itemArr.length);
                for (PlainMessage.Item item : itemArr) {
                    lhv lhvVar = ImageViewerInfo.Companion;
                    LocalMessageRef P = yabVar.P();
                    PlainMessage.Image image = item.image;
                    lhvVar.getClass();
                    arrayList2.add(lhv.a(P, image, null, null));
                }
                arrayList.addAll(arrayList2);
            }
        }
        yabVar.close();
        return j(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList j(List list) {
        ru10 ru10Var;
        LocalMessageRef localMessageRef;
        String str;
        long timestamp;
        String str2;
        LocalMessageRef localMessageRef2;
        List<ImageViewerInfo> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ImageViewerInfo imageViewerInfo : list2) {
            i3y i3yVar = this.q;
            String str3 = null;
            ImageViewerMessageActions imageViewerMessageActions = this.n;
            if (imageViewerMessageActions != null && (localMessageRef2 = imageViewerInfo.getLocalMessageRef()) != null) {
                j9b j9bVar = (j9b) i3yVar.getValue();
                ru10Var = j9bVar != null ? j9bVar.a().a(localMessageRef2) : null;
                if (ru10Var != null) {
                    if (!imageViewerMessageActions.getDelete()) {
                        ru10Var.d = null;
                    }
                    if (!imageViewerMessageActions.getForward()) {
                        ru10Var.f = null;
                    }
                    if (!imageViewerMessageActions.getPin()) {
                        ru10Var.j = null;
                    }
                    if (!imageViewerMessageActions.getReply()) {
                        ru10Var.g = null;
                    }
                    if (!imageViewerMessageActions.getShowMessage()) {
                        ru10Var.k = null;
                    }
                    ru10Var.t = imageViewerMessageActions.getResend();
                    localMessageRef = imageViewerInfo.getLocalMessageRef();
                    if (localMessageRef != null) {
                        j9b j9bVar2 = (j9b) i3yVar.getValue();
                        if (j9bVar2 != null) {
                            vcz0 b = j9bVar2.b();
                            o1b0 o1b0Var = b.a;
                            String messageId = localMessageRef.getMessageId();
                            az10 az10Var = b.e;
                            str2 = messageId != null ? az10Var.i(o1b0Var.a, localMessageRef.getMessageId()) : az10Var.h(o1b0Var.a, localMessageRef.getTimestamp());
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            rp21 rp21Var = this.o;
                            long c = rp21Var.b.c();
                            in21 a = rp21Var.a.a().a(str2);
                            str = h791.g(a == null ? new qp21(null, UserNameType.NOT_FOUND) : rp21Var.c.a(a, c), this.i.getResources(), null);
                            LocalMessageRef localMessageRef3 = imageViewerInfo.getLocalMessageRef();
                            timestamp = localMessageRef3 != null ? localMessageRef3.getTimestamp() : 0L;
                            if (timestamp != 0) {
                                arg argVar = this.m;
                                argVar.getClass();
                                str3 = argVar.a(new Date((timestamp / 1000000) * 1000));
                            }
                            arrayList.add(new mhv(imageViewerInfo, ru10Var, str, str3));
                        }
                    }
                    str = null;
                    LocalMessageRef localMessageRef32 = imageViewerInfo.getLocalMessageRef();
                    if (localMessageRef32 != null) {
                    }
                    if (timestamp != 0) {
                    }
                    arrayList.add(new mhv(imageViewerInfo, ru10Var, str, str3));
                }
            }
            ru10Var = null;
            localMessageRef = imageViewerInfo.getLocalMessageRef();
            if (localMessageRef != null) {
            }
            str = null;
            LocalMessageRef localMessageRef322 = imageViewerInfo.getLocalMessageRef();
            if (localMessageRef322 != null) {
            }
            if (timestamp != 0) {
            }
            arrayList.add(new mhv(imageViewerInfo, ru10Var, str, str3));
        }
        return arrayList;
    }
}
