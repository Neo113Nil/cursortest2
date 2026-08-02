package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.VkStepsReadInterval;
import com.vk.superapp.vksteps.domain.GoogleServicesDataSource;
import com.vk.superapp.vksteps.utils.enums.VkStepsSyncDurationStrategy;
import java.io.Serializable;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkStepsForPartialMonthlySyncUseCase.kt */
/* loaded from: classes11.dex */
public final class rwt {
    public final umv0 a;
    public final qwt b;

    /* compiled from: GetVkStepsForPartialMonthlySyncUseCase.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoogleServicesDataSource.values().length];
            try {
                iArr[GoogleServicesDataSource.HEALTH_CONNECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoogleServicesDataSource.GOOGLE_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rwt(umv0 umv0Var, qwt qwtVar) {
        this.a = umv0Var;
        this.b = qwtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0140, code lost:
    
        if (r6 != r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fa, code lost:
    
        if (r6 == r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x011f, code lost:
    
        if (r6 == r4) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01d2 -> B:15:0x01d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(e9q0 e9q0Var, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, GoogleServicesDataSource googleServicesDataSource, ContinuationImpl continuationImpl) {
        swt swtVar;
        int i;
        boolean z;
        Object b;
        Object a2;
        List list;
        e9q0 e9q0Var2;
        List list2;
        Object a3;
        List list3;
        Collection arrayList;
        GoogleServicesDataSource googleServicesDataSource2;
        e9q0 e9q0Var3;
        Iterator it;
        int i2;
        e9q0 e9q0Var4;
        GoogleServicesDataSource googleServicesDataSource3;
        List list4;
        Collection collection;
        List list5;
        swt swtVar2;
        ArrayList arrayList2;
        Iterator it2;
        Object obj;
        e9q0 e9q0Var5 = e9q0Var;
        GoogleServicesDataSource googleServicesDataSource4 = googleServicesDataSource;
        if (continuationImpl instanceof swt) {
            swtVar = (swt) continuationImpl;
            int i3 = swtVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                swtVar.label = i3 - Integer.MIN_VALUE;
                swt swtVar3 = swtVar;
                Object obj2 = swtVar3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = swtVar3.label;
                umv0 umv0Var = this.a;
                int i4 = 5;
                int i5 = 4;
                int i6 = 2;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    int i7 = a.$EnumSwitchMapping$0[googleServicesDataSource4.ordinal()];
                    if (i7 == 1) {
                        z = true;
                        Context a4 = e9q0Var5.a();
                        VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy = VkStepsSyncDurationStrategy.ONE_DAY;
                        swtVar3.L$0 = e9q0Var5;
                        swtVar3.L$1 = googleServicesDataSource4;
                        swtVar3.label = 1;
                        b = umv0Var.b(a4, zonedDateTime, zonedDateTime2, vkStepsSyncDurationStrategy, swtVar3);
                    } else {
                        if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = true;
                        Context a5 = e9q0Var5.a();
                        VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy2 = VkStepsSyncDurationStrategy.ONE_DAY;
                        swtVar3.L$0 = e9q0Var5;
                        swtVar3.L$1 = googleServicesDataSource4;
                        swtVar3.label = 2;
                        a2 = umv0Var.a(a5, zonedDateTime, zonedDateTime2, vkStepsSyncDurationStrategy2, swtVar3);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    GoogleServicesDataSource googleServicesDataSource5 = (GoogleServicesDataSource) swtVar3.L$1;
                    e9q0 e9q0Var6 = (e9q0) swtVar3.L$0;
                    kotlin.a.a(obj2);
                    googleServicesDataSource4 = googleServicesDataSource5;
                    e9q0Var5 = e9q0Var6;
                    b = obj2;
                    z = true;
                    list = (List) b;
                } else if (i == 2) {
                    GoogleServicesDataSource googleServicesDataSource6 = (GoogleServicesDataSource) swtVar3.L$1;
                    e9q0 e9q0Var7 = (e9q0) swtVar3.L$0;
                    kotlin.a.a(obj2);
                    googleServicesDataSource4 = googleServicesDataSource6;
                    e9q0Var5 = e9q0Var7;
                    a2 = obj2;
                    z = true;
                    list = (List) a2;
                } else if (i == 3) {
                    list2 = (List) swtVar3.L$2;
                    googleServicesDataSource4 = (GoogleServicesDataSource) swtVar3.L$1;
                    e9q0Var2 = (e9q0) swtVar3.L$0;
                    kotlin.a.a(obj2);
                    a3 = obj2;
                    z = true;
                    List list6 = (List) a3;
                    list3 = list2;
                    arrayList = new ArrayList(c5g.u(list6, 10));
                    googleServicesDataSource2 = googleServicesDataSource4;
                    e9q0Var3 = e9q0Var2;
                    it = list6.iterator();
                    if (it.hasNext()) {
                    }
                } else if (i == 4) {
                    arrayList = (Collection) swtVar3.L$5;
                    it = (Iterator) swtVar3.L$4;
                    Collection collection2 = (Collection) swtVar3.L$3;
                    List list7 = (List) swtVar3.L$2;
                    GoogleServicesDataSource googleServicesDataSource7 = (GoogleServicesDataSource) swtVar3.L$1;
                    e9q0 e9q0Var8 = (e9q0) swtVar3.L$0;
                    kotlin.a.a(obj2);
                    e9q0Var4 = e9q0Var8;
                    googleServicesDataSource3 = googleServicesDataSource7;
                    list4 = list7;
                    collection = collection2;
                    i2 = 2;
                    list5 = (List) obj2;
                    swtVar2 = swtVar3;
                    int i8 = u0l0.b;
                    ArrayList b2 = u0l0.b(list5, VkStepsReadInterval.DAY.h());
                    arrayList2 = new ArrayList();
                    it2 = b2.iterator();
                    while (it2.hasNext()) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    arrayList.add(b2);
                    arrayList = collection;
                    list3 = list4;
                    googleServicesDataSource2 = googleServicesDataSource3;
                    i6 = i2;
                    e9q0Var3 = e9q0Var4;
                    swtVar3 = swtVar2;
                    z = true;
                    i4 = 5;
                    i5 = 4;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (Collection) swtVar3.L$5;
                    it = (Iterator) swtVar3.L$4;
                    Collection collection3 = (Collection) swtVar3.L$3;
                    List list8 = (List) swtVar3.L$2;
                    GoogleServicesDataSource googleServicesDataSource8 = (GoogleServicesDataSource) swtVar3.L$1;
                    e9q0 e9q0Var9 = (e9q0) swtVar3.L$0;
                    kotlin.a.a(obj2);
                    Object a6 = obj2;
                    umv0 umv0Var2 = umv0Var;
                    e9q0 e9q0Var10 = e9q0Var9;
                    googleServicesDataSource3 = googleServicesDataSource8;
                    list4 = list8;
                    collection = collection3;
                    swtVar2 = swtVar3;
                    i2 = 2;
                    list5 = (List) a6;
                    umv0 umv0Var3 = umv0Var2;
                    e9q0Var4 = e9q0Var10;
                    umv0Var = umv0Var3;
                    int i82 = u0l0.b;
                    ArrayList b22 = u0l0.b(list5, VkStepsReadInterval.DAY.h());
                    arrayList2 = new ArrayList();
                    it2 = b22.iterator();
                    while (it2.hasNext()) {
                        m0l0 m0l0Var = (m0l0) it2.next();
                        Iterator it3 = list4.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            qvo0 qvo0Var = qvo0.a;
                            long g = ((m0l0) obj).g();
                            qvo0Var.getClass();
                            if (qvo0.e(g) == qvo0.e(m0l0Var.g())) {
                                break;
                            }
                        }
                        m0l0 m0l0Var2 = (m0l0) obj;
                        if (m0l0Var2 != null && (m0l0Var2.f() > 0 || m0l0Var2.c() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                            arrayList2.add(m0l0.a(m0l0Var2, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(m0l0Var.e(), m0l0Var2.f()), Math.min(m0l0Var.d(), m0l0Var2.c()), m0l0Var.b(), 39));
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        b22 = arrayList2;
                    }
                    arrayList.add(b22);
                    arrayList = collection;
                    list3 = list4;
                    googleServicesDataSource2 = googleServicesDataSource3;
                    i6 = i2;
                    e9q0Var3 = e9q0Var4;
                    swtVar3 = swtVar2;
                    z = true;
                    i4 = 5;
                    i5 = 4;
                    if (it.hasNext()) {
                        m0l0 m0l0Var3 = (m0l0) it.next();
                        int i9 = a.$EnumSwitchMapping$0[googleServicesDataSource2.ordinal()];
                        if (i9 == z) {
                            umv0 umv0Var4 = umv0Var;
                            swt swtVar4 = swtVar3;
                            i2 = i6;
                            swtVar4.L$0 = e9q0Var3;
                            swtVar4.L$1 = googleServicesDataSource2;
                            swtVar4.L$2 = list3;
                            swtVar4.L$3 = arrayList;
                            swtVar4.L$4 = it;
                            swtVar4.L$5 = arrayList;
                            swtVar4.label = i5;
                            qvo0 qvo0Var2 = qvo0.a;
                            long g2 = m0l0Var3.g();
                            qvo0Var2.getClass();
                            umv0Var = umv0Var4;
                            Serializable b3 = umv0Var.b(e9q0Var3.a(), ZonedDateTime.ofInstant(Instant.ofEpochMilli(qvo0.e(g2)), TimeZone.getDefault().toZoneId()), ZonedDateTime.ofInstant(Instant.ofEpochMilli(qvo0.b(m0l0Var3.g())), TimeZone.getDefault().toZoneId()), VkStepsSyncDurationStrategy.ONE_MINUTE, swtVar4);
                            if (b3 != coroutineSingletons) {
                                e9q0Var4 = e9q0Var3;
                                googleServicesDataSource3 = googleServicesDataSource2;
                                list4 = list3;
                                collection = arrayList;
                                list5 = (List) b3;
                                swtVar2 = swtVar4;
                                int i822 = u0l0.b;
                                ArrayList b222 = u0l0.b(list5, VkStepsReadInterval.DAY.h());
                                arrayList2 = new ArrayList();
                                it2 = b222.iterator();
                                while (it2.hasNext()) {
                                }
                                if (!arrayList2.isEmpty()) {
                                }
                                arrayList.add(b222);
                                arrayList = collection;
                                list3 = list4;
                                googleServicesDataSource2 = googleServicesDataSource3;
                                i6 = i2;
                                e9q0Var3 = e9q0Var4;
                                swtVar3 = swtVar2;
                                z = true;
                                i4 = 5;
                                i5 = 4;
                                if (it.hasNext()) {
                                    return c5g.v((List) arrayList);
                                }
                            }
                        } else {
                            if (i9 != i6) {
                                throw new NoWhenBranchMatchedException();
                            }
                            swtVar3.L$0 = e9q0Var3;
                            swtVar3.L$1 = googleServicesDataSource2;
                            swtVar3.L$2 = list3;
                            swtVar3.L$3 = arrayList;
                            swtVar3.L$4 = it;
                            swtVar3.L$5 = arrayList;
                            swtVar3.label = i4;
                            qvo0 qvo0Var3 = qvo0.a;
                            long g3 = m0l0Var3.g();
                            qvo0Var3.getClass();
                            swt swtVar5 = swtVar3;
                            i2 = i6;
                            a6 = umv0Var.a(e9q0Var3.a(), ZonedDateTime.ofInstant(Instant.ofEpochMilli(qvo0.e(g3)), TimeZone.getDefault().toZoneId()), ZonedDateTime.ofInstant(Instant.ofEpochMilli(qvo0.b(m0l0Var3.g())), TimeZone.getDefault().toZoneId()), VkStepsSyncDurationStrategy.TEN_MINUTES, swtVar5);
                            umv0Var2 = umv0Var;
                            if (a6 != coroutineSingletons) {
                                swtVar2 = swtVar5;
                                e9q0Var10 = e9q0Var3;
                                googleServicesDataSource3 = googleServicesDataSource2;
                                list4 = list3;
                                collection = arrayList;
                                list5 = (List) a6;
                                umv0 umv0Var32 = umv0Var2;
                                e9q0Var4 = e9q0Var10;
                                umv0Var = umv0Var32;
                                int i8222 = u0l0.b;
                                ArrayList b2222 = u0l0.b(list5, VkStepsReadInterval.DAY.h());
                                arrayList2 = new ArrayList();
                                it2 = b2222.iterator();
                                while (it2.hasNext()) {
                                }
                                if (!arrayList2.isEmpty()) {
                                }
                                arrayList.add(b2222);
                                arrayList = collection;
                                list3 = list4;
                                googleServicesDataSource2 = googleServicesDataSource3;
                                i6 = i2;
                                e9q0Var3 = e9q0Var4;
                                swtVar3 = swtVar2;
                                z = true;
                                i4 = 5;
                                i5 = 4;
                                if (it.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                e9q0Var2 = e9q0Var5;
                list2 = list;
                boolean z2 = e9q0Var2.f() == SelectedDataSource.HEALTH_CONNECT ? z : false;
                swtVar3.L$0 = e9q0Var2;
                swtVar3.L$1 = googleServicesDataSource4;
                swtVar3.L$2 = list2;
                swtVar3.label = 3;
                a3 = this.b.a(list2, false, z2, swtVar3);
            }
        }
        swtVar = new swt(this, continuationImpl);
        swt swtVar32 = swtVar;
        Object obj22 = swtVar32.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = swtVar32.label;
        umv0 umv0Var5 = this.a;
        int i42 = 5;
        int i52 = 4;
        int i62 = 2;
        if (i != 0) {
        }
        e9q0Var2 = e9q0Var5;
        list2 = list;
        if (e9q0Var2.f() == SelectedDataSource.HEALTH_CONNECT) {
        }
        swtVar32.L$0 = e9q0Var2;
        swtVar32.L$1 = googleServicesDataSource4;
        swtVar32.L$2 = list2;
        swtVar32.label = 3;
        a3 = this.b.a(list2, false, z2, swtVar32);
    }
}
