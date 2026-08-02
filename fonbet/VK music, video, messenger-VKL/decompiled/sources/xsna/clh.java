package xsna;

import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityProfileContentServicesViewHolder.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class clh extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ clh(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
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
                    elhVar.E.i(new yoi0(f5uVar, intValue, services));
                }
                return s3q0.a;
            case 1:
                return com.vk.geo.impl.presentation.b.U((com.vk.geo.impl.presentation.b) this.receiver, (Map) obj, (spj) obj2);
            default:
                long longValue = ((Number) obj2).longValue();
                ((a2m0) this.receiver).c((StoryMultiData) obj, longValue);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clh(Object obj) {
        super(2, obj, com.vk.geo.impl.presentation.b.class, "loadIcons", "loadIcons(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.b = 1;
    }
}
