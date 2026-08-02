package xsna;

import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.List;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import xsna.ttp0;
import xsna.wzs;

/* compiled from: VideoCacheKeyFactoryImpl.kt */
/* loaded from: classes11.dex */
public class s7s0 implements xw8 {
    public static final Integer[] b = {8, 10, 36};
    public static final Integer[] c = {11, 21};
    public static final Integer[] d = {12, 22};
    public static final Integer[] e = {28, 29};

    /* JADX WARN: Multi-variable type inference failed */
    public static spj a(final spj spjVar, final spj spjVar2, final wzs wzsVar) {
        if (wzsVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) wzsVar).create(spjVar, spjVar2);
        }
        final kotlin.coroutines.d context = spjVar2.getContext();
        return context == EmptyCoroutineContext.b ? new RestrictedContinuationImpl(spjVar2) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.label = 2;
                    a.a(obj);
                    return obj;
                }
                this.label = 1;
                a.a(obj);
                wzs wzsVar2 = wzsVar;
                ttp0.d(2, wzsVar2);
                return wzsVar2.invoke(spjVar, this);
            }
        } : new ContinuationImpl(spjVar2, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.label = 2;
                    a.a(obj);
                    return obj;
                }
                this.label = 1;
                a.a(obj);
                wzs wzsVar2 = wzsVar;
                ttp0.d(2, wzsVar2);
                return wzsVar2.invoke(spjVar, this);
            }
        };
    }

    public static spj c(spj spjVar) {
        spj<Object> intercepted;
        ContinuationImpl continuationImpl = spjVar instanceof ContinuationImpl ? (ContinuationImpl) spjVar : null;
        return (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) ? spjVar : intercepted;
    }

    public static final Object d(Object obj) {
        return obj instanceof d8i ? new Result.Failure(((d8i) obj).a) : obj;
    }

    public static String e(Uri uri, String str) {
        List<String> pathSegments = uri.getPathSegments();
        int indexOf = pathSegments.indexOf(str);
        if (indexOf < 0 || indexOf > pathSegments.size() - 2) {
            return null;
        }
        return pathSegments.get(indexOf + 1);
    }

    @Override // xsna.xw8
    public String k(evk evkVar) {
        String sb;
        long j = evkVar.g;
        Uri uri = evkVar.a;
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            queryParameter = e(uri, "id");
        }
        String queryParameter2 = uri.getQueryParameter("type");
        if (queryParameter2 == null) {
            queryParameter2 = e(uri, "type");
        }
        String queryParameter3 = uri.getQueryParameter("ct");
        if (queryParameter3 == null) {
            queryParameter3 = e(uri, "ct");
        }
        String queryParameter4 = uri.getQueryParameter("video");
        if (queryParameter4 == null) {
            queryParameter4 = e(uri, "video");
        }
        String path = uri.getPath();
        if (path != null && drm0.D(path, "mdct", false)) {
            queryParameter4 = uri.getLastPathSegment();
        }
        String queryParameter5 = uri.getQueryParameter("ix");
        if (queryParameter5 == null) {
            queryParameter5 = e(uri, "ix");
        }
        if (queryParameter == null) {
            return uri.toString();
        }
        Integer m = queryParameter3 != null ? arm0.m(10, queryParameter3) : null;
        Integer[] numArr = d;
        Integer[] numArr2 = c;
        if (m != null && m.intValue() == 6) {
            sb = "/manifest/".concat(queryParameter);
        } else if (m != null && m.intValue() == 0) {
            sb = y57.a("/mp4/", queryParameter, DomExceptionUtils.SEPARATOR, queryParameter2);
        } else if (rl3.G(b, m)) {
            StringBuilder a = xe9.a("/hls/", queryParameter, DomExceptionUtils.SEPARATOR, queryParameter2, DomExceptionUtils.SEPARATOR);
            a.append(queryParameter4);
            sb = a.toString();
        } else if (rl3.G(numArr2, m)) {
            sb = "/audio/" + queryParameter + DomExceptionUtils.SEPARATOR + j;
        } else if (rl3.G(numArr, m)) {
            sb = "/video/" + queryParameter + DomExceptionUtils.SEPARATOR + j;
        } else if (rl3.G(e, m)) {
            String e2 = e(uri, "ondemand");
            String lastPathSegment = uri.getLastPathSegment();
            StringBuilder a2 = xe9.a("/ondemand/", queryParameter, DomExceptionUtils.SEPARATOR, e2, DomExceptionUtils.SEPARATOR);
            a2.append(lastPathSegment);
            a2.append(DomExceptionUtils.SEPARATOR);
            a2.append(j);
            sb = a2.toString();
        } else if (m != null && m.intValue() == 13) {
            sb = y57.a("/subtitles/", queryParameter, DomExceptionUtils.SEPARATOR, queryParameter5);
        } else {
            StringBuilder a3 = xe9.a("/unknown/", queryParameter3, DomExceptionUtils.SEPARATOR, queryParameter, DomExceptionUtils.SEPARATOR);
            a3.append(j);
            sb = a3.toString();
        }
        StringBuilder sb2 = new StringBuilder(sb);
        String queryParameter6 = uri.getQueryParameter("tid");
        if (queryParameter6 == null) {
            queryParameter6 = e(uri, "tid");
        }
        if (queryParameter6 != null) {
            sb2.append(DomExceptionUtils.SEPARATOR.concat(queryParameter6));
            if (rl3.G(numArr2, m) || rl3.G(numArr, m)) {
                sb2.append(DomExceptionUtils.SEPARATOR + queryParameter3);
            }
        }
        return sb2.toString();
    }
}
