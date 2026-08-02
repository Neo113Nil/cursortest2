package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoSlideDo;
import com.vk.onboardingpromo.impl.ui.store.delegate.PromoTheme;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* compiled from: OnboardingPromoMediaDelegate.kt */
/* loaded from: classes4.dex */
public final class tg80 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0119 -> B:20:0x011a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d3 -> B:12:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(long j, OnboardingPromoSlideDo onboardingPromoSlideDo, int i, ContinuationImpl continuationImpl) {
        rg80 rg80Var;
        int i2;
        long j2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        int i5;
        rg80 rg80Var2;
        int i6;
        Object failure;
        if (continuationImpl instanceof rg80) {
            rg80Var = (rg80) continuationImpl;
            int i7 = rg80Var.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                rg80Var.label = i7 - Integer.MIN_VALUE;
                Object obj = rg80Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = rg80Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    List<Pair<String, String>> b = b(onboardingPromoSlideDo);
                    ArrayList arrayList = new ArrayList();
                    j2 = j;
                    it = b.iterator();
                    collection = arrayList;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    rg80Var2 = rg80Var;
                    i6 = i;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = rg80Var.I$3;
                    int i9 = rg80Var.I$2;
                    int i10 = rg80Var.I$1;
                    int i11 = rg80Var.I$0;
                    long j3 = rg80Var.J$0;
                    it = (Iterator) rg80Var.L$5;
                    collection = (Collection) rg80Var.L$3;
                    try {
                        kotlin.a.a(obj);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (com.vk.core.files.a.x(((File) obj).getPath())) {
                        obj = null;
                    }
                    failure = (File) obj;
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    File file = (File) failure;
                    int i12 = i8;
                    rg80Var2 = rg80Var;
                    i6 = i11;
                    i3 = i12;
                    long j4 = j3;
                    i4 = i9;
                    i5 = i10;
                    j2 = j4;
                    if (file != null) {
                        collection.add(file);
                    }
                    if (!it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        String str = (String) pair.d();
                        String str2 = (String) pair.g();
                        if ((str.length() > 0 ? str : null) != null) {
                            try {
                            } catch (Throwable th2) {
                                int i13 = i3;
                                i11 = i6;
                                rg80Var = rg80Var2;
                                i8 = i13;
                                long j5 = j2;
                                i9 = i4;
                                i10 = i5;
                                j3 = j5;
                                failure = new Result.Failure(th2);
                            }
                            rg80Var2.L$0 = null;
                            rg80Var2.L$1 = null;
                            rg80Var2.L$2 = null;
                            rg80Var2.L$3 = collection;
                            rg80Var2.L$4 = null;
                            rg80Var2.L$5 = it;
                            rg80Var2.L$6 = null;
                            rg80Var2.L$7 = null;
                            rg80Var2.L$8 = null;
                            rg80Var2.L$9 = null;
                            rg80Var2.L$10 = null;
                            rg80Var2.J$0 = j2;
                            rg80Var2.I$0 = i6;
                            rg80Var2.I$1 = i5;
                            rg80Var2.I$2 = i4;
                            rg80Var2.I$3 = i3;
                            rg80Var2.I$4 = 0;
                            rg80Var2.I$5 = 0;
                            rg80Var2.I$6 = 0;
                            rg80Var2.I$7 = 0;
                            rg80Var2.label = 1;
                            obj = c(i6, str, str2, j2);
                            if (obj == obj2) {
                                return obj2;
                            }
                            int i14 = i3;
                            i11 = i6;
                            rg80Var = rg80Var2;
                            i8 = i14;
                            long j6 = j2;
                            i9 = i4;
                            i10 = i5;
                            j3 = j6;
                            if (com.vk.core.files.a.x(((File) obj).getPath())) {
                            }
                            failure = (File) obj;
                            if (failure instanceof Result.Failure) {
                            }
                            File file2 = (File) failure;
                            int i122 = i8;
                            rg80Var2 = rg80Var;
                            i6 = i11;
                            i3 = i122;
                            long j42 = j3;
                            i4 = i9;
                            i5 = i10;
                            j2 = j42;
                            if (file2 != null) {
                            }
                            if (!it.hasNext()) {
                                return (List) collection;
                            }
                        } else {
                            file2 = null;
                            if (file2 != null) {
                            }
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        rg80Var = new rg80(continuationImpl);
        Object obj3 = rg80Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = rg80Var.label;
        if (i2 != 0) {
        }
    }

    public static final List<Pair<String, String>> b(OnboardingPromoSlideDo onboardingPromoSlideDo) {
        return rl3.I(new Pair[]{new Pair(onboardingPromoSlideDo.e().e(), PromoTheme.LIGHT.h()), new Pair(onboardingPromoSlideDo.e().d(), PromoTheme.DARK.h())});
    }

    public static final File c(int i, String str, String str2, long j) {
        return PrivateFiles.e(e8r.a, PrivateSubdir.LARGE_TEMP_UPLOADS, d(j) + '_' + str2 + '_' + i, new Regex(".*\\.mp4$", RegexOption.IGNORE_CASE).f(str) ? "mp4" : "jpg", 24);
    }

    public static final String d(long j) {
        StringBuilder sb = new StringBuilder();
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        sb.append(((b25) bpn0Var.getValue()).c().b);
        return xy6.a(j, "_onboarding_promo_", sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0103 -> B:10:0x010a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0099 -> B:11:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(OnboardingPromoDo onboardingPromoDo, ContinuationImpl continuationImpl) {
        sg80 sg80Var;
        int i;
        ArrayList arrayList;
        int i2;
        sg80 sg80Var2;
        Iterator it;
        OnboardingPromoDo onboardingPromoDo2;
        if (continuationImpl instanceof sg80) {
            sg80Var = (sg80) continuationImpl;
            int i3 = sg80Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sg80Var.label = i3 - Integer.MIN_VALUE;
                Object obj = sg80Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sg80Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List<OnboardingPromoSlideDo> j = onboardingPromoDo.j();
                    arrayList = new ArrayList();
                    i2 = 0;
                    sg80Var2 = sg80Var;
                    it = j.iterator();
                    onboardingPromoDo2 = onboardingPromoDo;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = sg80Var.I$4;
                    int i5 = sg80Var.I$3;
                    int i6 = sg80Var.I$2;
                    int i7 = sg80Var.I$1;
                    int i8 = sg80Var.I$0;
                    Collection collection = (Collection) sg80Var.L$9;
                    Iterator it2 = (Iterator) sg80Var.L$7;
                    ?? r13 = (Collection) sg80Var.L$6;
                    Iterator it3 = (Iterator) sg80Var.L$2;
                    ?? r15 = (Collection) sg80Var.L$1;
                    OnboardingPromoDo onboardingPromoDo3 = (OnboardingPromoDo) sg80Var.L$0;
                    kotlin.a.a(obj);
                    Object c = obj;
                    int i9 = i4;
                    sg80Var2 = sg80Var;
                    it = it3;
                    Iterator it4 = it2;
                    int i10 = i7;
                    int i11 = i8;
                    int i12 = i6;
                    int i13 = i5;
                    ArrayList arrayList2 = r15;
                    ArrayList arrayList3 = r13;
                    collection.add((File) c);
                    onboardingPromoDo2 = onboardingPromoDo3;
                    int i14 = i9;
                    int i15 = i10;
                    ArrayList arrayList4 = arrayList3;
                    Iterator it5 = it4;
                    if (it5.hasNext()) {
                        Pair pair = (Pair) it5.next();
                        String str = (String) pair.d();
                        String str2 = (String) pair.g();
                        long g = onboardingPromoDo2.g();
                        sg80Var2.L$0 = onboardingPromoDo2;
                        sg80Var2.L$1 = arrayList2;
                        sg80Var2.L$2 = it;
                        OnboardingPromoDo onboardingPromoDo4 = onboardingPromoDo2;
                        sg80Var2.L$3 = null;
                        sg80Var2.L$4 = null;
                        sg80Var2.L$5 = null;
                        sg80Var2.L$6 = arrayList4;
                        sg80Var2.L$7 = it5;
                        sg80Var2.L$8 = null;
                        sg80Var2.L$9 = arrayList4;
                        sg80Var2.L$10 = null;
                        sg80Var2.L$11 = null;
                        sg80Var2.I$0 = i11;
                        sg80Var2.I$1 = i15;
                        sg80Var2.I$2 = i12;
                        sg80Var2.I$3 = i13;
                        sg80Var2.I$4 = i14;
                        sg80Var2.I$5 = 0;
                        sg80Var2.label = 1;
                        c = c(i15, str, str2, g);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i9 = i14;
                        it4 = it5;
                        onboardingPromoDo3 = onboardingPromoDo4;
                        ArrayList arrayList5 = arrayList4;
                        i10 = i15;
                        collection = arrayList5;
                        arrayList3 = arrayList5;
                        collection.add((File) c);
                        onboardingPromoDo2 = onboardingPromoDo3;
                        int i142 = i9;
                        int i152 = i10;
                        ArrayList arrayList42 = arrayList3;
                        Iterator it52 = it4;
                        if (it52.hasNext()) {
                            onboardingPromoDo = onboardingPromoDo2;
                            g5g.y(arrayList42, arrayList2);
                            arrayList = arrayList2;
                            i2 = i11;
                            onboardingPromoDo2 = onboardingPromoDo;
                            if (it.hasNext()) {
                                return arrayList;
                            }
                            Object next = it.next();
                            i11 = i2 + 1;
                            if (i2 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<Pair<String, String>> b = b((OnboardingPromoSlideDo) next);
                            ArrayList arrayList6 = new ArrayList(c5g.u(b, 10));
                            i152 = i2;
                            it52 = b.iterator();
                            arrayList42 = arrayList6;
                            i13 = 0;
                            i12 = 0;
                            arrayList2 = arrayList;
                            i142 = 0;
                            if (it52.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        sg80Var = new sg80(continuationImpl);
        Object obj2 = sg80Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sg80Var.label;
        if (i != 0) {
        }
    }
}
