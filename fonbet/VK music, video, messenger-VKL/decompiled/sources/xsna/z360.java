package xsna;

import com.vk.core.preference.Preference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NetworkInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class z360 extends FunctionReferenceImpl implements gzs<Integer> {
    @Override // xsna.gzs
    public final Integer invoke() {
        ((o2l) this.receiver).getClass();
        return Integer.valueOf(Preference.j().getInt("__dbg_api_max_length", 0));
    }
}
