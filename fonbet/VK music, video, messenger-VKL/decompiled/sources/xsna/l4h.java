package xsna;

import android.content.Context;
import com.vk.dto.group.AdminLeaveAction;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.e4h;
import xsna.epx;

/* compiled from: CommunityHelperImpl.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class l4h extends AdaptedFunctionReference implements gzs<s3q0> {
    final /* synthetic */ izs<AdminLeaveAction, s3q0> $callback;
    final /* synthetic */ Context $context;
    final /* synthetic */ izs<Integer, s3q0> $fallback;
    final /* synthetic */ e4h.b $leaveParams;
    final /* synthetic */ gzs<s3q0> $onCancelListener = null;
    final /* synthetic */ j4h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4h(j4h j4hVar, Context context, e4h.b bVar, izs izsVar, izs izsVar2) {
        super(0, epx.a.class, "nextAction", "doLeave$nextAction(Lcom/vk/subscription/impl/CommunityHelperImpl;Landroid/content/Context;Lcom/vk/subscription/api/CommunityHelper$CommunityLeaveParams;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/vk/dto/group/AdminLeaveAction;)V", 0);
        this.this$0 = j4hVar;
        this.$context = context;
        this.$leaveParams = bVar;
        this.$callback = izsVar;
        this.$fallback = izsVar2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        j4h.n(this.this$0, this.$context, this.$leaveParams, this.$callback, this.$onCancelListener, this.$fallback, null);
        return s3q0.a;
    }
}
