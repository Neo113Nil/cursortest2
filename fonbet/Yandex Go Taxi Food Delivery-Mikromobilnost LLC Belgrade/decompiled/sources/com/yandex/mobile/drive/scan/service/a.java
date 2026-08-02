package com.yandex.mobile.drive.scan.service;

import android.graphics.Bitmap;
import defpackage.g3r;
import defpackage.l0b1;
import defpackage.ny61;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a {
    public final File a;

    public a(File file) {
        this.a = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Bitmap bitmap, File file, ContinuationImpl continuationImpl) {
        ChatPictureRepository$save$1 chatPictureRepository$save$1;
        int i;
        aVar.getClass();
        try {
            if (continuationImpl instanceof ChatPictureRepository$save$1) {
                chatPictureRepository$save$1 = (ChatPictureRepository$save$1) continuationImpl;
                int i2 = chatPictureRepository$save$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chatPictureRepository$save$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chatPictureRepository$save$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chatPictureRepository$save$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        file.getParentFile().mkdirs();
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                        chatPictureRepository$save$1.L$0 = null;
                        chatPictureRepository$save$1.L$1 = file;
                        chatPictureRepository$save$1.label = 1;
                        obj = com.yandex.mobile.drive.extensions.a.a(bitmap, compressFormat, 90, chatPictureRepository$save$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        file = (File) chatPictureRepository$save$1.L$1;
                        kotlin.b.b(obj);
                    }
                    g3r.f(file, (byte[]) obj);
                    return file.getAbsolutePath();
                }
            }
            if (i != 0) {
            }
            g3r.f(file, (byte[]) obj);
            return file.getAbsolutePath();
        } catch (Exception e) {
            l0b1.h(new AssertionError("failed to save picture", e));
            return null;
        }
        chatPictureRepository$save$1 = new ChatPictureRepository$save$1(aVar, continuationImpl);
        Object obj2 = chatPictureRepository$save$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatPictureRepository$save$1.label;
    }

    public static void b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            l0b1.h(new AssertionError("failed to remove picture", e));
        }
    }
}
