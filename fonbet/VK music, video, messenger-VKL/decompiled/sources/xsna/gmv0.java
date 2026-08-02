package xsna;

import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: VkStepsDataSourceStore.kt */
/* loaded from: classes11.dex */
public final class gmv0 {
    public static final /* synthetic */ qcy<Object>[] b;
    public final tw8 a = new tw8("VkStepsDataSourceStore", "VkStepsDataSourceStore.key_vk_steps_selected_data_source");

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(gmv0.class, "selectedDatasourcePrefProperty", "getSelectedDatasourcePrefProperty()Ljava/lang/String;", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
    }

    public final Object a(SelectedDataSource selectedDataSource, SuspendLambda suspendLambda) {
        Object k = myc0.k(dgn0.f().getIo(), new fmv0(this, selectedDataSource, null), suspendLambda);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }
}
