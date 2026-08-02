package com.yandex.go.superapp.discovery.map.impl.ui.search.utils;

import android.text.SpannableStringBuilder;
import defpackage.lsy0;
import defpackage.ng10;
import defpackage.ny61;
import defpackage.pg10;
import defpackage.rg10;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public abstract class a {
    public static final lsy0 a(e eVar, FormattedText formattedText) {
        if (formattedText == null) {
            return new lsy0("", new SuperAppDiscoveryMapMediaInfoConverterUtilsKt$getFormattedText$1(1, null));
        }
        SpannableStringBuilder r = eVar.r(formattedText);
        return formattedText.e() ? new lsy0(r, new SuperAppDiscoveryMapMediaInfoConverterUtilsKt$getFormattedText$2(1, null)) : new lsy0(r, new SuperAppDiscoveryMapMediaInfoConverterUtilsKt$getFormattedText$function0$1(eVar, formattedText, r, null));
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
        SuperAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1 superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof SuperAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1) {
            superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1 = (SuperAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1) continuationImpl;
            int i2 = superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.label;
                if (i != 0) {
                    b.b(obj);
                    superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.L$0 = null;
                    superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.L$1 = null;
                    superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.L$2 = charSequence;
                    superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.label = 1;
                    obj = eVar.t(formattedText, superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence = (CharSequence) superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.L$2;
                    b.b(obj);
                }
                Object failure = (CharSequence) obj;
                a = Result.a(failure);
                if (a == null) {
                    return new pg10(a);
                }
                CharSequence charSequence2 = (CharSequence) (failure instanceof Result.Failure ? null : failure);
                return charSequence2 == null ? new pg10(new NullPointerException()) : charSequence2.equals(charSequence) ? ng10.a : new rg10(charSequence2);
            }
        }
        superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1 = new SuperAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1(continuationImpl);
        Object obj3 = superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapMediaInfoConverterUtilsKt$getMediaText$1.label;
        if (i != 0) {
        }
        Object failure2 = (CharSequence) obj3;
        a = Result.a(failure2);
        if (a == null) {
        }
    }
}
