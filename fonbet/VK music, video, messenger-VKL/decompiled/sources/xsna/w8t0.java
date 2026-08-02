package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoNotificationsStatus;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w8t0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w8t0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [T, com.vk.catalog.mvi.section.ui.entity.CatalogSectionState, java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                UserId userId = (UserId) this.c;
                VideoNotificationsStatus videoNotificationsStatus = (VideoNotificationsStatus) this.d;
                if (((BaseOkResponseDto) obj) != BaseOkResponseDto.OK) {
                    return io.reactivex.rxjava3.core.a.k(new IllegalStateException("User notification failed"));
                }
                tys0.a.onNext(new Pair<>(userId, videoNotificationsStatus));
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                izs izsVar = (izs) this.d;
                ?? r4 = (CatalogSectionState) obj;
                ref$ObjectRef.element = r4;
                return (CatalogSectionState) izsVar.invoke(r4);
        }
    }
}
