package xsna;

import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkStepsSelectedDataSourceUseCase.kt */
/* loaded from: classes11.dex */
public final class vwt {
    public final gmv0 a;
    public final ayu0 b;

    /* compiled from: GetVkStepsSelectedDataSourceUseCase.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileServicesType.values().length];
            try {
                iArr[MobileServicesType.GOOGLE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileServicesType.HUAWEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileServicesType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vwt(gmv0 gmv0Var, ayu0 ayu0Var) {
        this.a = gmv0Var;
        this.b = ayu0Var;
    }

    public static SelectedDataSource b(SelectedDataSource selectedDataSource, iyu0 iyu0Var) {
        SelectedDataSource selectedDataSource2 = SelectedDataSource.GOOGLE_FIT;
        if (selectedDataSource == selectedDataSource2 && jyu0.b(iyu0Var)) {
            return selectedDataSource2;
        }
        SelectedDataSource selectedDataSource3 = SelectedDataSource.HEALTH_CONNECT;
        if (selectedDataSource == selectedDataSource3 && jyu0.c(iyu0Var)) {
            return selectedDataSource3;
        }
        SelectedDataSource selectedDataSource4 = SelectedDataSource.HUAWEI_HEALTH;
        return (selectedDataSource == selectedDataSource4 && jyu0.d(iyu0Var)) ? selectedDataSource4 : SelectedDataSource.UNKNOWN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0049, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(Context context, ContinuationImpl continuationImpl) {
        wwt wwtVar;
        int i;
        iyu0 iyu0Var;
        int i2;
        SelectedDataSource b;
        if (continuationImpl instanceof wwt) {
            wwtVar = (wwt) continuationImpl;
            int i3 = wwtVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wwtVar.label = i3 - Integer.MIN_VALUE;
                Object obj = wwtVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wwtVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_STEPS;
                    wwtVar.label = 1;
                    obj = byu0.b(this.b, context, requestedMiniApp, wwtVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iyu0Var = (iyu0) wwtVar.L$0;
                        kotlin.a.a(obj);
                        SelectedDataSource selectedDataSource = (SelectedDataSource) obj;
                        SelectedDataSource selectedDataSource2 = selectedDataSource == null ? SelectedDataSource.GOOGLE_FIT : selectedDataSource;
                        xgx0 xgx0Var = xgx0.a;
                        StringBuilder sb = new StringBuilder("GetVkStepsSelectedDataSourceUseCase.execute() -> Get saved data source: ");
                        sb.append(selectedDataSource != null ? selectedDataSource.name() : null);
                        String sb2 = sb.toString();
                        xgx0Var.getClass();
                        xgx0.a(sb2);
                        b = b(selectedDataSource2, iyu0Var);
                        xgx0 xgx0Var2 = xgx0.a;
                        String str = "GetVkStepsSelectedDataSourceUseCase.execute() -> Selected data source: " + b.name() + ". Mobile service type : " + iyu0Var.h.name();
                        xgx0Var2.getClass();
                        xgx0.a(str);
                        return b;
                    }
                    kotlin.a.a(obj);
                }
                iyu0Var = (iyu0) obj;
                i2 = a.$EnumSwitchMapping$0[iyu0Var.h.ordinal()];
                if (i2 != 1) {
                    xgx0 xgx0Var3 = xgx0.a;
                    StringBuilder sb3 = new StringBuilder("GetVkStepsSelectedDataSourceUseCase.execute() -> sa_steps_health_connect = ");
                    sb3.append(e370.s != null);
                    String sb4 = sb3.toString();
                    xgx0Var3.getClass();
                    xgx0.a(sb4);
                    if (e370.s != null) {
                        wwtVar.L$0 = iyu0Var;
                        wwtVar.label = 2;
                        obj = myc0.k(dgn0.f().getIo(), new emv0(this.a, null), wwtVar);
                    } else {
                        b = b(SelectedDataSource.GOOGLE_FIT, iyu0Var);
                    }
                } else if (i2 == 2) {
                    b = b(SelectedDataSource.HUAWEI_HEALTH, iyu0Var);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b = SelectedDataSource.UNKNOWN;
                }
                xgx0 xgx0Var22 = xgx0.a;
                String str2 = "GetVkStepsSelectedDataSourceUseCase.execute() -> Selected data source: " + b.name() + ". Mobile service type : " + iyu0Var.h.name();
                xgx0Var22.getClass();
                xgx0.a(str2);
                return b;
            }
        }
        wwtVar = new wwt(this, continuationImpl);
        Object obj2 = wwtVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wwtVar.label;
        if (i != 0) {
        }
        iyu0Var = (iyu0) obj2;
        i2 = a.$EnumSwitchMapping$0[iyu0Var.h.ordinal()];
        if (i2 != 1) {
        }
        xgx0 xgx0Var222 = xgx0.a;
        String str22 = "GetVkStepsSelectedDataSourceUseCase.execute() -> Selected data source: " + b.name() + ". Mobile service type : " + iyu0Var.h.name();
        xgx0Var222.getClass();
        xgx0.a(str22);
        return b;
    }
}
