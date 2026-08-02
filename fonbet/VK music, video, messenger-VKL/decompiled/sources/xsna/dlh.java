package xsna;

import com.vk.catalog2.common.ui.mvp.holder.stories.MusicTrackPickerVh;
import com.vk.profile.community.impl.ui.profile.state.Services;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityProfileContentServicesViewHolder.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class dlh extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dlh(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                f5u f5uVar = (f5u) obj;
                int intValue = ((Number) obj2).intValue();
                elh elhVar = (elh) this.receiver;
                int i = elh.M;
                Services services = (Services) elhVar.t;
                if (services != null) {
                    elhVar.E.h(new toi0(elhVar.itemView, f5uVar, intValue, services));
                }
                break;
            case 1:
                ((MusicTrackPickerVh) this.receiver).getClass();
                break;
            case 2:
                int intValue2 = ((Number) obj2).intValue();
                ((a2m0) this.receiver).b((u90) obj, intValue2);
                break;
            default:
                long longValue = ((Number) obj2).longValue();
                dmx0 dmx0Var = (dmx0) this.receiver;
                dmx0 dmx0Var2 = dmx0.a;
                dmx0Var.getClass();
                ((php0) dmx0.c.getValue()).b((g840) obj, longValue);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlh(Object obj) {
        super(2, obj, dmx0.class, "sendTask", "sendTask(Lcom/vk/network/whitelist/tracker/MultipleUrlsPingTask;J)V", 0);
        this.b = 3;
    }
}
