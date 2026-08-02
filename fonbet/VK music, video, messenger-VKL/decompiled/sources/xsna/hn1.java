package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AlbumsInteractor.kt */
/* loaded from: classes7.dex */
public final class hn1 implements cn1 {
    public final cde0 a;

    public hn1(cde0 cde0Var) {
        this.a = cde0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009f, code lost:
    
        if (r13 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(VideoFile videoFile, List list, List list2, boolean z, ContinuationImpl continuationImpl) {
        dn1 dn1Var;
        int i;
        Object j;
        ArrayList u;
        Object i2;
        VideoFile videoFile2;
        boolean z2;
        List list3;
        List list4;
        Throwable a;
        Throwable a2;
        if (continuationImpl instanceof dn1) {
            dn1Var = (dn1) continuationImpl;
            int i3 = dn1Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dn1Var.label = i3 - Integer.MIN_VALUE;
                Object obj = dn1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dn1Var.label;
                cde0 cde0Var = this.a;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (list.isEmpty() && list2.isEmpty()) {
                        return s3q0.a;
                    }
                    ArrayList u2 = d02.u(list);
                    if (!u2.isEmpty()) {
                        dn1Var.L$0 = videoFile;
                        dn1Var.L$1 = list;
                        dn1Var.L$2 = list2;
                        dn1Var.L$3 = null;
                        dn1Var.Z$0 = z;
                        dn1Var.label = 1;
                        j = cde0Var.j(videoFile, u2, dn1Var);
                    }
                    u = d02.u(list2);
                    if (!u.isEmpty()) {
                        dn1Var.L$0 = videoFile;
                        dn1Var.L$1 = list;
                        dn1Var.L$2 = list2;
                        dn1Var.L$3 = null;
                        dn1Var.L$4 = null;
                        dn1Var.Z$0 = z;
                        dn1Var.label = 2;
                        i2 = cde0Var.i(videoFile, u, dn1Var);
                        if (i2 != coroutineSingletons) {
                            boolean z3 = z;
                            videoFile2 = videoFile;
                            z2 = z3;
                            List list5 = list2;
                            list3 = list;
                            list4 = list5;
                            a2 = Result.a(i2);
                            if (a2 == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (z) {
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = dn1Var.Z$0;
                    list4 = (List) dn1Var.L$2;
                    list3 = (List) dn1Var.L$1;
                    videoFile2 = (VideoFile) dn1Var.L$0;
                    kotlin.a.a(obj);
                    i2 = ((Result) obj).d();
                    a2 = Result.a(i2);
                    if (a2 == null) {
                        return new Result.Failure(a2);
                    }
                    VideoFile videoFile3 = videoFile2;
                    z = z2;
                    videoFile = videoFile3;
                    List list6 = list3;
                    list2 = list4;
                    list = list6;
                    if (z) {
                        wjs0.a(new mxr0(videoFile, videoFile.I0(), list, list2));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            StringBuilder sb = new StringBuilder();
                            sb.append(videoFile.I0());
                            sb.append('_');
                            sb.append(intValue);
                            wjs0.a(new cwr0(videoFile, sb.toString(), 28));
                        }
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            int intValue2 = ((Number) it2.next()).intValue();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(videoFile.I0());
                            sb2.append('_');
                            sb2.append(intValue2);
                            wjs0.a(new wxr0(videoFile, null, sb2.toString(), 2));
                        }
                        wjs0.a(new fwr0(0));
                    }
                    return s3q0.a;
                }
                z = dn1Var.Z$0;
                list2 = (List) dn1Var.L$2;
                list = (List) dn1Var.L$1;
                videoFile = (VideoFile) dn1Var.L$0;
                kotlin.a.a(obj);
                j = ((Result) obj).d();
                a = Result.a(j);
                if (a != null) {
                    return new Result.Failure(a);
                }
                u = d02.u(list2);
                if (!u.isEmpty()) {
                }
                if (z) {
                }
                return s3q0.a;
            }
        }
        dn1Var = new dn1(this, continuationImpl);
        Object obj2 = dn1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dn1Var.label;
        cde0 cde0Var2 = this.a;
        if (i != 0) {
        }
        a = Result.a(j);
        if (a != null) {
        }
        u = d02.u(list2);
        if (!u.isEmpty()) {
        }
        if (z) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UserId userId, int i, int i2, ContinuationImpl continuationImpl) {
        en1 en1Var;
        int i3;
        if (continuationImpl instanceof en1) {
            en1Var = (en1) continuationImpl;
            int i4 = en1Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                en1Var.label = i4 - Integer.MIN_VALUE;
                Object obj = en1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = en1Var.label;
                if (i3 == 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                en1Var.L$0 = null;
                en1Var.I$0 = i;
                en1Var.I$1 = i2;
                en1Var.label = 1;
                Object b = this.a.b(userId, i, i2, en1Var);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        en1Var = new en1(this, continuationImpl);
        Object obj2 = en1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = en1Var.label;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(VideoFile videoFile, UserId userId, ContinuationImpl continuationImpl) {
        fn1 fn1Var;
        int i;
        if (continuationImpl instanceof fn1) {
            fn1Var = (fn1) continuationImpl;
            int i2 = fn1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fn1Var.label = i2 - Integer.MIN_VALUE;
                Object obj = fn1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fn1Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                fn1Var.L$0 = null;
                fn1Var.L$1 = null;
                fn1Var.label = 1;
                Object f = this.a.f(videoFile, userId, fn1Var);
                return f == coroutineSingletons ? coroutineSingletons : f;
            }
        }
        fn1Var = new fn1(this, continuationImpl);
        Object obj2 = fn1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fn1Var.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xsna.cn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(List list, List list2, VideoFile videoFile, Date date, ContinuationImpl continuationImpl) {
        gn1 gn1Var;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof gn1) {
            gn1Var = (gn1) continuationImpl;
            int i2 = gn1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gn1Var.label = i2 - Integer.MIN_VALUE;
                gn1 gn1Var2 = gn1Var;
                Object obj = gn1Var2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gn1Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((VideoAlbumResultData) it.next()).b));
                    }
                    Set S0 = j5g.S0(arrayList);
                    List list4 = list;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new Integer(((VideoAlbumResultData) it2.next()).b));
                    }
                    Set S02 = j5g.S0(arrayList2);
                    List O0 = j5g.O0(izi0.g(S02, S0));
                    List O02 = j5g.O0(izi0.g(S0, S02));
                    boolean z = date == null;
                    gn1Var2.L$0 = null;
                    gn1Var2.L$1 = null;
                    gn1Var2.L$2 = null;
                    gn1Var2.L$3 = null;
                    gn1Var2.L$4 = null;
                    gn1Var2.L$5 = null;
                    gn1Var2.L$6 = null;
                    gn1Var2.L$7 = null;
                    gn1Var2.label = 1;
                    a = a(videoFile, O0, O02, z, gn1Var2);
                    if (a == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    a = ((Result) obj).d();
                }
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                a2 = Result.a(a);
                if (a2 != null) {
                    bVar.a(a2);
                }
                return s3q0.a;
            }
        }
        gn1Var = new gn1(this, continuationImpl);
        gn1 gn1Var22 = gn1Var;
        Object obj3 = gn1Var22.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gn1Var22.label;
        if (i != 0) {
        }
        com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return s3q0.a;
    }
}
