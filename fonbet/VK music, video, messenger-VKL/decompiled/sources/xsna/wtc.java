package xsna;

import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipEditSdkRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class wtc {
    public final msc a;
    public final ClipEditSdkItem b;
    public final gof c;
    public final eml d;
    public final otc e;
    public final cuc f;
    public final zrc g;
    public final ogj0 h;
    public final vft0 i;
    public final w1r0 j;
    public final aru k;

    public wtc(msc mscVar, ClipEditSdkItem clipEditSdkItem, gof gofVar, eml emlVar, otc otcVar, cuc cucVar, zrc zrcVar) {
        ogj0 ogj0Var = new ogj0();
        vft0 vft0Var = new vft0();
        w1r0 w1r0Var = new w1r0();
        aru aruVar = new aru();
        this.a = mscVar;
        this.b = clipEditSdkItem;
        this.c = gofVar;
        this.d = emlVar;
        this.e = otcVar;
        this.f = cucVar;
        this.g = zrcVar;
        this.h = ogj0Var;
        this.i = vft0Var;
        this.j = w1r0Var;
        this.k = aruVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserId userId, ContinuationImpl continuationImpl) {
        ptc ptcVar;
        Object obj;
        int i;
        if (continuationImpl instanceof ptc) {
            ptcVar = (ptc) continuationImpl;
            int i2 = ptcVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ptcVar.label = i2 - Integer.MIN_VALUE;
                obj = ptcVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ptcVar.label;
                boolean z = false;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (this.e != null) {
                        ptcVar.label = 1;
                        obj = Boolean.FALSE;
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                if (((Boolean) obj).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        ptcVar = new ptc(this, continuationImpl);
        obj = ptcVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ptcVar.label;
        boolean z2 = false;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Boolean.valueOf(z2);
    }

    public final Object b(UserId userId, osc oscVar) {
        return myc0.k((ovj) this.d.b, new qtc(this, userId, null), oscVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        rtc rtcVar;
        int i;
        List list;
        if (continuationImpl instanceof rtc) {
            rtcVar = (rtc) continuationImpl;
            int i2 = rtcVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rtcVar.label = i2 - Integer.MIN_VALUE;
                Object obj = rtcVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rtcVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    cuc cucVar = this.f;
                    if (cucVar == null) {
                        list = null;
                        return list == null ? EmptyList.b : list;
                    }
                    rtcVar.label = 1;
                    obj = cucVar.a(rtcVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                list = (List) obj;
                if (list == null) {
                }
            }
        }
        rtcVar = new rtc(this, continuationImpl);
        Object obj3 = rtcVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rtcVar.label;
        if (i != 0) {
        }
        list = (List) obj3;
        if (list == null) {
        }
    }

    public final Object d(UserId userId, osc oscVar) {
        return myc0.k((ovj) this.d.b, new stc(this, userId, null), oscVar);
    }

    public final Object e(String str, nsc nscVar) {
        return myc0.k((ovj) this.d.b, new ttc(this, str, null), nscVar);
    }

    public final Object f(UserId userId, qsc qscVar) {
        otc otcVar = this.e;
        if (otcVar == null) {
            return s3q0.a;
        }
        s3q0 a = otcVar.a();
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }

    public final Object g(UserId userId, qsc qscVar) {
        otc otcVar = this.e;
        if (otcVar == null) {
            return s3q0.a;
        }
        Object c = otcVar.c(userId, qscVar);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
    }

    public final Object h(UserId userId, qsc qscVar) {
        otc otcVar = this.e;
        if (otcVar == null) {
            return s3q0.a;
        }
        Object b = otcVar.b(qscVar);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }

    public final Object i(String str, SdkClipOrdData sdkClipOrdData, String str2, ArrayList arrayList, rsc rscVar) {
        return myc0.k((ovj) this.d.b, new utc(this, sdkClipOrdData, str, arrayList, str2, null), rscVar);
    }

    public final Object j(String str, ssc sscVar) {
        Object k = myc0.k((ovj) this.d.b, new vtc(this, str, null), sscVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }
}
