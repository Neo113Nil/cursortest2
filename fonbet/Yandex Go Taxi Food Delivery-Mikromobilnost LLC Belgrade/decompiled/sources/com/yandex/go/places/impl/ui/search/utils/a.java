package com.yandex.go.places.impl.ui.search.utils;

import android.text.SpannableStringBuilder;
import defpackage.msy0;
import defpackage.ny61;
import defpackage.og10;
import defpackage.qg10;
import defpackage.sg10;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public abstract class a {
    public static final msy0 a(e eVar, FormattedText formattedText) {
        if (formattedText == null) {
            return new msy0("", new MediaInfoConverterUtilsKt$getFormattedText$1(1, null));
        }
        SpannableStringBuilder r = eVar.r(formattedText);
        return formattedText.e() ? new msy0(r, new MediaInfoConverterUtilsKt$getFormattedText$2(1, null)) : new msy0(r, new MediaInfoConverterUtilsKt$getFormattedText$function0$1(eVar, formattedText, r, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:32|33))(3:34|35|(1:37))|12|13|(2:15|16)(4:18|(1:20)|21|(2:23|24)(2:25|(2:27|28)(2:29|30)))))|42|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0035, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0052, code lost:
    
        r8 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, FormattedText formattedText, CharSequence charSequence, ContinuationImpl continuationImpl) {
        MediaInfoConverterUtilsKt$getMediaText$1 mediaInfoConverterUtilsKt$getMediaText$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof MediaInfoConverterUtilsKt$getMediaText$1) {
            mediaInfoConverterUtilsKt$getMediaText$1 = (MediaInfoConverterUtilsKt$getMediaText$1) continuationImpl;
            int i2 = mediaInfoConverterUtilsKt$getMediaText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaInfoConverterUtilsKt$getMediaText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaInfoConverterUtilsKt$getMediaText$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaInfoConverterUtilsKt$getMediaText$1.label;
                if (i != 0) {
                    b.b(obj);
                    mediaInfoConverterUtilsKt$getMediaText$1.L$0 = null;
                    mediaInfoConverterUtilsKt$getMediaText$1.L$1 = null;
                    mediaInfoConverterUtilsKt$getMediaText$1.L$2 = charSequence;
                    mediaInfoConverterUtilsKt$getMediaText$1.label = 1;
                    obj = eVar.t(formattedText, mediaInfoConverterUtilsKt$getMediaText$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence = (CharSequence) mediaInfoConverterUtilsKt$getMediaText$1.L$2;
                    b.b(obj);
                }
                Object failure = (CharSequence) obj;
                a = Result.a(failure);
                if (a == null) {
                    return new qg10(a);
                }
                CharSequence charSequence2 = (CharSequence) (failure instanceof Result.Failure ? null : failure);
                return charSequence2 == null ? new qg10(new NullPointerException()) : charSequence2.equals(charSequence) ? og10.a : new sg10(charSequence2);
            }
        }
        mediaInfoConverterUtilsKt$getMediaText$1 = new MediaInfoConverterUtilsKt$getMediaText$1(continuationImpl);
        Object obj3 = mediaInfoConverterUtilsKt$getMediaText$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaInfoConverterUtilsKt$getMediaText$1.label;
        if (i != 0) {
        }
        Object failure2 = (CharSequence) obj3;
        a = Result.a(failure2);
        if (a == null) {
        }
    }
}
