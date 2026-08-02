package xsna;

import android.content.Context;
import android.graphics.Rect;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.TooltipsData;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: CtaCell.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.cta.CtaCellKt$CtaCell$2", f = "CtaCell.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class hkk extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<Rect> $cellRect;
    final /* synthetic */ Context $context;
    final /* synthetic */ ClipInvolvementActionButton<?> $item;
    final /* synthetic */ izs<ClipInvolvementActionButton<?>, s3q0> $onTooltipShown;
    final /* synthetic */ TooltipsData $tooltipsData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hkk(ClipInvolvementActionButton<?> clipInvolvementActionButton, TooltipsData tooltipsData, Context context, Ref$ObjectRef<Rect> ref$ObjectRef, izs<? super ClipInvolvementActionButton<?>, s3q0> izsVar, spj<? super hkk> spjVar) {
        super(2, spjVar);
        this.$item = clipInvolvementActionButton;
        this.$tooltipsData = tooltipsData;
        this.$context = context;
        this.$cellRect = ref$ObjectRef;
        this.$onTooltipShown = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hkk(this.$item, this.$tooltipsData, this.$context, this.$cellRect, this.$onTooltipShown, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hkk) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ClipInvolvementActionButton<?> clipInvolvementActionButton = this.$item;
        if (clipInvolvementActionButton == null) {
            return s3q0.a;
        }
        if (clipInvolvementActionButton instanceof ClipInvolvementActionButton.DonutLevel) {
            pair = new Pair(Boolean.FALSE, new Integer(0));
        } else if (clipInvolvementActionButton instanceof ClipInvolvementActionButton.VkTicket) {
            pair = new Pair(Boolean.FALSE, new Integer(0));
        } else if (clipInvolvementActionButton.equals(ClipInvolvementActionButton.MessageToBusinessCommunity.e)) {
            pair = new Pair(Boolean.valueOf(this.$tooltipsData.e), new Integer(R.string.clips_publish_involvement_message_to_bc_tip));
        } else if (clipInvolvementActionButton.equals(ClipInvolvementActionButton.OnlineBooking.e)) {
            pair = new Pair(Boolean.valueOf(this.$tooltipsData.f), new Integer(R.string.clips_publish_involvement_online_booking_tip));
        } else {
            if (!clipInvolvementActionButton.equals(ClipInvolvementActionButton.OpenChannel.e)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(Boolean.FALSE, new Integer(0));
        }
        boolean booleanValue = ((Boolean) pair.d()).booleanValue();
        int intValue = ((Number) pair.g()).intValue();
        if (booleanValue) {
            VkTooltip.a aVar = new VkTooltip.a(this.$context);
            aVar.c = this.$context.getString(intValue);
            aVar.e = VkTooltip.Appearance.Inversion;
            aVar.g = true;
            aVar.a(this.$cellRect.element);
            this.$onTooltipShown.invoke(this.$item);
        }
        return s3q0.a;
    }
}
