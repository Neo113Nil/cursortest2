package xsna;

import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetSelectedDataSourceVkWorkoutUseCase.kt */
/* loaded from: classes11.dex */
public final class cut {
    public static final String c = String.valueOf(fpf0.a(cut.class).l());
    public final d2w0 a;
    public final ayu0 b;

    public cut(d2w0 d2w0Var, ayu0 ayu0Var) {
        this.a = d2w0Var;
        this.b = ayu0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(Context context, ContinuationImpl continuationImpl) {
        but butVar;
        int i;
        iyu0 iyu0Var;
        if (continuationImpl instanceof but) {
            butVar = (but) continuationImpl;
            int i2 = butVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                butVar.label = i2 - Integer.MIN_VALUE;
                Object obj = butVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = butVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
                    butVar.label = 1;
                    obj = byu0.b(this.b, context, requestedMiniApp, butVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iyu0Var = (iyu0) butVar.L$0;
                        kotlin.a.a(obj);
                        SelectedDataSource selectedDataSource = (SelectedDataSource) obj;
                        xgx0 xgx0Var = xgx0.a;
                        StringBuilder sb = new StringBuilder();
                        String str = c;
                        sb.append(str);
                        sb.append(".execute() -> Get saved data source: ");
                        sb.append(selectedDataSource != null ? selectedDataSource.name() : null);
                        String sb2 = sb.toString();
                        xgx0Var.getClass();
                        xgx0.a(sb2);
                        if (selectedDataSource == null) {
                            selectedDataSource = SelectedDataSource.GOOGLE_FIT;
                        }
                        SelectedDataSource selectedDataSource2 = SelectedDataSource.GOOGLE_FIT;
                        if (selectedDataSource != selectedDataSource2 || !jyu0.e(iyu0Var)) {
                            SelectedDataSource selectedDataSource3 = SelectedDataSource.HEALTH_CONNECT;
                            if (selectedDataSource == selectedDataSource3 && jyu0.f(iyu0Var)) {
                                selectedDataSource2 = selectedDataSource3;
                            } else if (selectedDataSource != selectedDataSource3 || !jyu0.e(iyu0Var)) {
                                selectedDataSource2 = SelectedDataSource.UNKNOWN;
                            }
                        }
                        StringBuilder b = ho8.b(str, ".execute() -> Selected data source: ");
                        b.append(selectedDataSource2.name());
                        xgx0.a(b.toString());
                        return selectedDataSource2;
                    }
                    kotlin.a.a(obj);
                }
                iyu0Var = (iyu0) obj;
                butVar.L$0 = iyu0Var;
                butVar.label = 2;
                obj = myc0.k(dgn0.f().getIo(), new b2w0(this.a, null), butVar);
            }
        }
        butVar = new but(this, continuationImpl);
        Object obj2 = butVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = butVar.label;
        if (i != 0) {
        }
        iyu0Var = (iyu0) obj2;
        butVar.L$0 = iyu0Var;
        butVar.label = 2;
        obj2 = myc0.k(dgn0.f().getIo(), new b2w0(this.a, null), butVar);
    }
}
