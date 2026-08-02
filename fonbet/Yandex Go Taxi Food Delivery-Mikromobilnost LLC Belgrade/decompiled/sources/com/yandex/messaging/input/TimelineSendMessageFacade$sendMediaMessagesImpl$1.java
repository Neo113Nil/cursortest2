package com.yandex.messaging.input;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.widget.Toast;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.entities.FileMessageData;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.TextMessageData;
import com.yandex.messaging.internal.entities.VideoMessageData;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import defpackage.ax80;
import defpackage.b00;
import defpackage.bvu0;
import defpackage.d1b1;
import defpackage.g6u;
import defpackage.g720;
import defpackage.l4o;
import defpackage.lqo;
import defpackage.m0z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7b1;
import defpackage.oyh0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tz10;
import defpackage.uw80;
import defpackage.v7b;
import defpackage.w7b;
import defpackage.wk31;
import defpackage.wls;
import defpackage.yw80;
import defpackage.z83;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.TimelineSendMessageFacade$sendMediaMessagesImpl$1", f = "SendMessageFacade.kt", l = {348}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineSendMessageFacade$sendMediaMessagesImpl$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<AttachInfo> $attachesSnapshot;
    final /* synthetic */ String $description;
    final /* synthetic */ ForwardMessageRef[] $forwardsSnapshot;
    final /* synthetic */ boolean $isSilent;
    final /* synthetic */ boolean $isStarred;
    final /* synthetic */ boolean $loadIntoYaDisk;
    final /* synthetic */ String[] $mentionedGuidsSnapshot;
    final /* synthetic */ String $quotedText;
    final /* synthetic */ g720 $sourceOverride;
    final /* synthetic */ boolean $videoBubblesEnabled;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.input.TimelineSendMessageFacade$sendMediaMessagesImpl$1$1", f = "SendMessageFacade.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.input.TimelineSendMessageFacade$sendMediaMessagesImpl$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $description;
        final /* synthetic */ ForwardMessageRef[] $forwardsSnapshot;
        final /* synthetic */ boolean $isSilent;
        final /* synthetic */ boolean $isStarred;
        final /* synthetic */ boolean $loadIntoYaDisk;
        final /* synthetic */ String[] $mentionedGuidsSnapshot;
        final /* synthetic */ List<AttachInfo> $processedAttaches;
        final /* synthetic */ String $quotedText;
        final /* synthetic */ g720 $sourceOverride;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, List list, g gVar, g720 g720Var, String str, String[] strArr, ForwardMessageRef[] forwardMessageRefArr, boolean z2, boolean z3, String str2, Continuation continuation) {
            super(2, continuation);
            this.$loadIntoYaDisk = z;
            this.$processedAttaches = list;
            this.this$0 = gVar;
            this.$sourceOverride = g720Var;
            this.$description = str;
            this.$mentionedGuidsSnapshot = strArr;
            this.$forwardsSnapshot = forwardMessageRefArr;
            this.$isStarred = z2;
            this.$isSilent = z3;
            this.$quotedText = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$loadIntoYaDisk, this.$processedAttaches, this.this$0, this.$sourceOverride, this.$description, this.$mentionedGuidsSnapshot, this.$forwardsSnapshot, this.$isStarred, this.$isSilent, this.$quotedText, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            List<AttachInfo> list;
            ax80 ax80Var;
            ArrayList arrayList;
            b00 b00Var;
            boolean z;
            boolean z2;
            String str;
            yw80 yw80Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (this.$loadIntoYaDisk) {
                i = 1;
                list = this.$processedAttaches;
            } else {
                g gVar = this.this$0;
                List<AttachInfo> list2 = this.$processedAttaches;
                lqo lqoVar = gVar.e;
                l4o l4oVar = tz10.a;
                lqoVar.getClass();
                Long l = 52428800L;
                long longValue = l.longValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((AttachInfo) obj2).size <= longValue) {
                        arrayList2.add(obj2);
                    }
                }
                i = 0;
                list = arrayList2;
            }
            if (list.size() < this.$processedAttaches.size()) {
                Toast.makeText(this.this$0.a, oyh0.invalid_attach_file_size_message, 0).show();
            }
            g gVar2 = this.this$0;
            w7b w7bVar = gVar2.c;
            g720 g720Var = this.$sourceOverride;
            if (g720Var == null) {
                g720Var = gVar2.b.a;
            }
            g720 g720Var2 = g720Var;
            CustomPayload b = gVar2.b(null);
            String str2 = this.$description;
            String[] strArr = this.$mentionedGuidsSnapshot;
            ForwardMessageRef[] forwardMessageRefArr = this.$forwardsSnapshot;
            boolean z3 = this.$isStarred;
            boolean z4 = this.$isSilent;
            Integer num = new Integer(i);
            String str3 = this.$quotedText;
            ChatRequest chatRequest = w7bVar.a;
            ax80 ax80Var2 = w7bVar.b;
            b00 b00Var2 = w7bVar.c;
            tje.e();
            if (!list.isEmpty()) {
                v7b v7bVar = new v7b(num);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (AttachInfo attachInfo : list) {
                    if (attachInfo.isImage()) {
                        arrayList3.add(attachInfo);
                    } else {
                        arrayList4.add(attachInfo);
                    }
                }
                int size = arrayList3.size();
                if (size > 1 || !(size != 1 || ((AttachInfo) arrayList3.get(0)).isAnimated() || TextUtils.isEmpty(str2))) {
                    String str4 = str3;
                    ax80Var = ax80Var2;
                    arrayList = arrayList4;
                    b00Var = b00Var2;
                    z = z4;
                    int i2 = 10;
                    ArrayList F = kotlin.collections.a.F(arrayList3, 10);
                    int size2 = F.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        List list3 = (List) F.get(i3);
                        String str5 = str4;
                        ArrayList arrayList5 = arrayList;
                        ArrayList arrayList6 = new ArrayList(tcc.n(list3, i2));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            AttachInfo attachInfo2 = (AttachInfo) it.next();
                            arrayList6.add(new PlainMessage.Item(new PlainMessage.Image(new PlainMessage.FileInfo(0L, attachInfo2.fileName, 0L, null, null, 29, null), attachInfo2.width, attachInfo2.height, false, 8, null)));
                            it = it;
                            str2 = str2;
                        }
                        String str6 = str2;
                        PlainMessage.Item[] itemArr = (PlainMessage.Item[]) arrayList6.toArray(new PlainMessage.Item[0]);
                        ArrayList arrayList7 = new ArrayList(tcc.n(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList7.add(d1b1.g((AttachInfo) it2.next()));
                        }
                        uw80[] uw80VarArr = (uw80[]) arrayList7.toArray(new uw80[0]);
                        ArrayList arrayList8 = F;
                        GalleryMessageData galleryMessageData = new GalleryMessageData();
                        galleryMessageData.text = i3 == 0 ? str6 : null;
                        galleryMessageData.items = itemArr;
                        v7bVar.e(galleryMessageData);
                        int i4 = i3;
                        if (i3 == 0) {
                            z2 = z;
                            str = str5;
                        } else {
                            z2 = z;
                            str = null;
                        }
                        ax80Var.getClass();
                        b00Var.c(chatRequest, ax80.b(galleryMessageData, uw80VarArr, forwardMessageRefArr, g720Var2, z3, z2, strArr, b, str));
                        int i5 = i4 + 1;
                        size2 = size2;
                        F = arrayList8;
                        i2 = 10;
                        z = z2;
                        arrayList = arrayList5;
                        str2 = str6;
                        str4 = str5;
                        i3 = i5;
                    }
                } else if (size == 1) {
                    AttachInfo attachInfo3 = (AttachInfo) arrayList3.get(0);
                    ImageMessageData imageMessageData = new ImageMessageData(1, attachInfo3.fileName);
                    imageMessageData.width = Integer.valueOf(attachInfo3.width);
                    imageMessageData.height = Integer.valueOf(attachInfo3.height);
                    imageMessageData.fileName = attachInfo3.fileName;
                    imageMessageData.fileSource = v7bVar.a;
                    ax80Var = ax80Var2;
                    uw80[] uw80VarArr2 = {d1b1.g(attachInfo3)};
                    ax80Var.getClass();
                    arrayList = arrayList4;
                    b00Var = b00Var2;
                    yw80 b2 = ax80.b(imageMessageData, uw80VarArr2, forwardMessageRefArr, g720Var2, z3, z4, null, b, str3);
                    z = z4;
                    if (str2 == null || str2.length() == 0) {
                        yw80Var = b2;
                    } else {
                        z83.h(null, attachInfo3.isAnimated());
                        yw80Var = b2;
                        yw80 e = ax80.e(w7bVar.b, new TextMessageData(0, str2), b, strArr, forwardMessageRefArr, g720Var2, z3, str3);
                        b = b;
                        forwardMessageRefArr = forwardMessageRefArr;
                        g720Var2 = g720Var2;
                        z3 = z3;
                        b00Var.c(chatRequest, e);
                    }
                    b00Var.c(chatRequest, yw80Var);
                } else {
                    ax80Var = ax80Var2;
                    arrayList = arrayList4;
                    b00Var = b00Var2;
                    z = z4;
                    if (str2 != null && str2.length() != 0) {
                        yw80 e2 = ax80.e(w7bVar.b, new TextMessageData(0, str2), b, strArr, forwardMessageRefArr, g720Var2, z3, str3);
                        b = b;
                        forwardMessageRefArr = forwardMessageRefArr;
                        g720Var2 = g720Var2;
                        z3 = z3;
                        b00Var.c(chatRequest, e2);
                    }
                }
                ArrayList arrayList9 = arrayList;
                boolean z5 = z;
                boolean z6 = ((wk31) w7bVar.d.get()).c;
                Iterator it3 = arrayList9.iterator();
                while (it3.hasNext()) {
                    AttachInfo attachInfo4 = (AttachInfo) it3.next();
                    MessageData messageData = (MessageData) ((attachInfo4.isVideo() && z6) ? new VideoMessageData(attachInfo4.size, attachInfo4.thumbHash, attachInfo4.width, attachInfo4.durationMs, attachInfo4.fileName, attachInfo4.height) : new FileMessageData(attachInfo4.fileName, attachInfo4.size)).a(v7bVar);
                    uw80[] uw80VarArr3 = {d1b1.g(attachInfo4)};
                    ax80Var.getClass();
                    b00Var.c(chatRequest, ax80.b(messageData, uw80VarArr3, forwardMessageRefArr, g720Var2, z3, z5, null, b, null));
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineSendMessageFacade$sendMediaMessagesImpl$1(boolean z, boolean z2, List list, g gVar, g720 g720Var, String str, String[] strArr, ForwardMessageRef[] forwardMessageRefArr, boolean z3, boolean z4, String str2, Continuation continuation) {
        super(2, continuation);
        this.$videoBubblesEnabled = z;
        this.$loadIntoYaDisk = z2;
        this.$attachesSnapshot = list;
        this.this$0 = gVar;
        this.$sourceOverride = g720Var;
        this.$description = str;
        this.$mentionedGuidsSnapshot = strArr;
        this.$forwardsSnapshot = forwardMessageRefArr;
        this.$isStarred = z3;
        this.$isSilent = z4;
        this.$quotedText = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimelineSendMessageFacade$sendMediaMessagesImpl$1(this.$videoBubblesEnabled, this.$loadIntoYaDisk, this.$attachesSnapshot, this.this$0, this.$sourceOverride, this.$description, this.$mentionedGuidsSnapshot, this.$forwardsSnapshot, this.$isStarred, this.$isSilent, this.$quotedText, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimelineSendMessageFacade$sendMediaMessagesImpl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<com.yandex.messaging.internal.view.attach.AttachInfo>] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r6;
        Iterator it;
        Bitmap bitmap;
        Bitmap bitmap2;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmap3;
        Bitmap bitmap4;
        byte[] bArr;
        Integer l;
        Integer l2;
        Integer l3;
        Long m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$videoBubblesEnabled && this.$loadIntoYaDisk) {
                List<AttachInfo> list = this.$attachesSnapshot;
                g gVar = this.this$0;
                int i2 = 10;
                r6 = new ArrayList(tcc.n(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AttachInfo attachInfo = (AttachInfo) it2.next();
                    if (attachInfo.isVideo()) {
                        Activity activity = gVar.a;
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(activity, attachInfo.uri);
                            try {
                                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                                long longValue = (extractMetadata == null || (m = bvu0.m(i2, extractMetadata)) == null) ? 0L : m.longValue();
                                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                                int i3 = 0;
                                int intValue = (extractMetadata2 == null || (l3 = bvu0.l(i2, extractMetadata2)) == null) ? 0 : l3.intValue();
                                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                                int intValue2 = (extractMetadata3 == null || (l2 = bvu0.l(i2, extractMetadata3)) == null) ? 0 : l2.intValue();
                                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(24);
                                int intValue3 = (extractMetadata4 == null || (l = bvu0.l(i2, extractMetadata4)) == null) ? 0 : l.intValue();
                                if (intValue3 == 90 || intValue3 == 270) {
                                    int i4 = intValue2;
                                    intValue2 = intValue;
                                    intValue = i4;
                                }
                                bitmap3 = mediaMetadataRetriever.getFrameAtTime(0L, 2);
                                if (bitmap3 != null) {
                                    if (intValue == 0 || intValue2 == 0) {
                                        try {
                                            intValue = bitmap3.getWidth();
                                            intValue2 = bitmap3.getHeight();
                                        } catch (Exception unused) {
                                            it = it2;
                                            bitmap4 = null;
                                            if (bitmap4 != null) {
                                            }
                                            if (bitmap3 != null) {
                                            }
                                            if (mediaMetadataRetriever != null) {
                                            }
                                            r6.add(attachInfo);
                                            it2 = it;
                                            i2 = 10;
                                        } catch (Throwable th) {
                                            th = th;
                                            bitmap2 = bitmap3;
                                            bitmap = null;
                                            if (bitmap != null) {
                                            }
                                            if (bitmap2 != null) {
                                            }
                                            if (mediaMetadataRetriever != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    bitmap4 = o7b1.c(bitmap3);
                                    try {
                                        try {
                                            int width = bitmap4.getWidth();
                                            int height = bitmap4.getHeight();
                                            int i5 = width * height;
                                            int[] iArr = new int[i5];
                                            bitmap4.getPixels(iArr, 0, width, 0, 0, width, height);
                                            byte[] bArr2 = new byte[i5 * 4];
                                            while (i3 < i5) {
                                                int i6 = iArr[i3];
                                                int i7 = i3 * 4;
                                                bArr2[i7] = (byte) Color.red(i6);
                                                it = it2;
                                                try {
                                                    bArr2[i7 + 1] = (byte) Color.green(i6);
                                                    bArr2[i7 + 2] = (byte) Color.blue(i6);
                                                    bArr2[i7 + 3] = (byte) Color.alpha(i6);
                                                    i3++;
                                                    it2 = it;
                                                } catch (Exception unused2) {
                                                    if (bitmap4 != null) {
                                                        bitmap4.recycle();
                                                    }
                                                    if (bitmap3 != null) {
                                                        bitmap3.recycle();
                                                    }
                                                    if (mediaMetadataRetriever != null) {
                                                        mediaMetadataRetriever.release();
                                                    }
                                                    r6.add(attachInfo);
                                                    it2 = it;
                                                    i2 = 10;
                                                }
                                            }
                                            it = it2;
                                            bArr = m0z0.a(width, height, bArr2);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bitmap2 = bitmap3;
                                            bitmap = bitmap4;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                            }
                                            if (bitmap2 != null) {
                                                bitmap2.recycle();
                                            }
                                            if (mediaMetadataRetriever != null) {
                                                mediaMetadataRetriever.release();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception unused3) {
                                        it = it2;
                                    }
                                } else {
                                    it = it2;
                                    bArr = null;
                                    bitmap4 = null;
                                }
                                try {
                                    bitmap2 = bitmap3;
                                } catch (Exception unused4) {
                                }
                                try {
                                    AttachInfo attachInfo2 = new AttachInfo(attachInfo.uri, attachInfo.existingId, attachInfo.originalChatId, attachInfo.fileName, attachInfo.size, attachInfo.mimeType, intValue, intValue2, attachInfo.forceAsFile, longValue, bArr);
                                    if (bitmap4 != null) {
                                        bitmap4.recycle();
                                    }
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    mediaMetadataRetriever.release();
                                    attachInfo = attachInfo2;
                                } catch (Exception unused5) {
                                    bitmap3 = bitmap2;
                                    if (bitmap4 != null) {
                                    }
                                    if (bitmap3 != null) {
                                    }
                                    if (mediaMetadataRetriever != null) {
                                    }
                                    r6.add(attachInfo);
                                    it2 = it;
                                    i2 = 10;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bitmap = bitmap4;
                                    if (bitmap != null) {
                                    }
                                    if (bitmap2 != null) {
                                    }
                                    if (mediaMetadataRetriever != null) {
                                    }
                                    throw th;
                                }
                            } catch (Exception unused6) {
                                it = it2;
                                bitmap3 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                bitmap = null;
                                bitmap2 = null;
                            }
                        } catch (Exception unused7) {
                            it = it2;
                            bitmap3 = null;
                            mediaMetadataRetriever = null;
                        } catch (Throwable th5) {
                            th = th5;
                            bitmap = null;
                            bitmap2 = null;
                            mediaMetadataRetriever = null;
                        }
                    } else {
                        it = it2;
                    }
                    r6.add(attachInfo);
                    it2 = it;
                    i2 = 10;
                }
            } else {
                r6 = this.$attachesSnapshot;
            }
            List list2 = r6;
            g gVar2 = this.this$0;
            g6u g6uVar = gVar2.n.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$loadIntoYaDisk, list2, gVar2, this.$sourceOverride, this.$description, this.$mentionedGuidsSnapshot, this.$forwardsSnapshot, this.$isStarred, this.$isSilent, this.$quotedText, null);
            this.label = 1;
            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
