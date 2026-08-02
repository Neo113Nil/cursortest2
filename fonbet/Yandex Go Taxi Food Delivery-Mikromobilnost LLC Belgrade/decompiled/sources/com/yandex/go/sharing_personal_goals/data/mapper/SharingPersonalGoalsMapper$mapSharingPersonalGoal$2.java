package com.yandex.go.sharing_personal_goals.data.mapper;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalDto$Available;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalDto$Completed;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalDto$InProgress;
import com.yandex.go.sharing_personal_goals.data.model.g;
import com.yandex.go.sharing_personal_goals.data.model.h;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tqr0;
import defpackage.tse;
import defpackage.uqr0;
import defpackage.vqr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wqr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxqr0;", "<anonymous>", "(Ltse;)Lxqr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sharing_personal_goals.data.mapper.SharingPersonalGoalsMapper$mapSharingPersonalGoal$2", f = "SharingPersonalGoalsMapper.kt", l = {65, 66, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 69, 72, 85, MSException.ERROR_INVALID_PASSWORD, HProv.ALG_SID_KECCAK_224, HProv.ALG_SID_KECCAK_256, HProv.PP_HASHOID, 105, 106, 108, 109, 112}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharingPersonalGoalsMapper$mapSharingPersonalGoal$2 extends SuspendLambda implements wls {
    final /* synthetic */ h $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharingPersonalGoalsMapper$mapSharingPersonalGoal$2(a aVar, h hVar, Continuation continuation) {
        super(2, continuation);
        this.$response = hVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SharingPersonalGoalsMapper$mapSharingPersonalGoal$2 sharingPersonalGoalsMapper$mapSharingPersonalGoal$2 = new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2(this.this$0, this.$response, continuation);
        sharingPersonalGoalsMapper$mapSharingPersonalGoal$2.L$0 = obj;
        return sharingPersonalGoalsMapper$mapSharingPersonalGoal$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharingPersonalGoalsMapper$mapSharingPersonalGoal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0333  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh nohVar;
        String str;
        noh nohVar2;
        noh nohVar3;
        noh h2;
        noh nohVar4;
        String str2;
        noh nohVar5;
        noh nohVar6;
        noh h3;
        noh h4;
        noh nohVar7;
        String str3;
        noh nohVar8;
        Object k;
        CharSequence charSequence;
        noh nohVar9;
        noh nohVar10;
        String str4;
        Object k2;
        noh nohVar11;
        noh nohVar12;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Long l;
        Object k3;
        BitmapDrawable bitmapDrawable;
        noh nohVar13;
        String str5;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Long l2;
        Object k4;
        BitmapDrawable bitmapDrawable2;
        CharSequence charSequence6;
        String str6;
        Integer num;
        Integer num2;
        BitmapDrawable bitmapDrawable3;
        CharSequence charSequence7;
        Object k5;
        noh nohVar14;
        CharSequence charSequence8;
        noh nohVar15;
        String str7;
        Long l3;
        Object k6;
        CharSequence charSequence9;
        noh nohVar16;
        Object k7;
        BitmapDrawable bitmapDrawable4;
        noh nohVar17;
        String str8;
        CharSequence charSequence10;
        CharSequence charSequence11;
        Long l4;
        Object k8;
        BitmapDrawable bitmapDrawable5;
        CharSequence charSequence12;
        String str9;
        Integer num3;
        Integer num4;
        BitmapDrawable bitmapDrawable6;
        CharSequence charSequence13;
        Object k9;
        noh nohVar18;
        CharSequence charSequence14;
        noh nohVar19;
        String str10;
        Long l5;
        Object k10;
        CharSequence charSequence15;
        noh nohVar20;
        Object k11;
        BitmapDrawable bitmapDrawable7;
        noh nohVar21;
        String str11;
        CharSequence charSequence16;
        CharSequence charSequence17;
        Long l6;
        Object k12;
        BitmapDrawable bitmapDrawable8;
        CharSequence charSequence18;
        BitmapDrawable bitmapDrawable9;
        String str12;
        Integer num5;
        Integer num6;
        CharSequence charSequence19;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                b.b(obj);
                h hVar = this.$response;
                if (hVar instanceof SharingPersonalGoalDto$Available) {
                    qoh h5 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$titleAsync$1(this.this$0, hVar, null), 3);
                    h3 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$subtitleAsync$1(this.this$0, this.$response, null), 3);
                    qoh h6 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$actionIconAsync$1(this.this$0, this.$response, null), 3);
                    h4 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$rewardIconAsync$1(this.this$0, this.$response, null), 3);
                    qoh h7 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$deadlineLabelAsync$1(this.this$0, this.$response, null), 3);
                    String str13 = ((SharingPersonalGoalDto$Available) this.$response).a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = h3;
                    this.L$3 = h6;
                    this.L$4 = h4;
                    this.L$5 = h7;
                    this.L$6 = str13;
                    this.label = 1;
                    obj = h5.s(this);
                    if (obj != coroutineSingletons) {
                        nohVar7 = h7;
                        str3 = str13;
                        nohVar8 = h6;
                        CharSequence charSequence20 = (CharSequence) obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = nohVar8;
                        this.L$4 = h4;
                        this.L$5 = nohVar7;
                        this.L$6 = str3;
                        this.L$7 = charSequence20;
                        this.label = 2;
                        k = h3.k(this);
                        if (k != coroutineSingletons) {
                            String str14 = str3;
                            charSequence = charSequence20;
                            obj = k;
                            nohVar9 = nohVar8;
                            nohVar10 = h4;
                            str4 = str14;
                            CharSequence charSequence21 = (CharSequence) obj;
                            Long l7 = ((SharingPersonalGoalDto$Available) this.$response).h;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = nohVar10;
                            this.L$5 = nohVar7;
                            this.L$6 = str4;
                            this.L$7 = charSequence;
                            this.L$8 = charSequence21;
                            this.L$9 = l7;
                            this.label = 3;
                            k2 = nohVar9.k(this);
                            if (k2 != coroutineSingletons) {
                                nohVar11 = nohVar10;
                                nohVar12 = nohVar7;
                                charSequence2 = charSequence21;
                                obj = k2;
                                charSequence3 = charSequence;
                                l = l7;
                                BitmapDrawable bitmapDrawable10 = (BitmapDrawable) obj;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = nohVar12;
                                this.L$6 = str4;
                                this.L$7 = charSequence3;
                                this.L$8 = charSequence2;
                                this.L$9 = l;
                                this.L$10 = bitmapDrawable10;
                                this.label = 4;
                                k3 = nohVar11.k(this);
                                if (k3 != coroutineSingletons) {
                                    CharSequence charSequence22 = charSequence3;
                                    bitmapDrawable = bitmapDrawable10;
                                    obj = k3;
                                    nohVar13 = nohVar12;
                                    str5 = str4;
                                    charSequence4 = charSequence22;
                                    charSequence5 = charSequence2;
                                    l2 = l;
                                    CharSequence charSequence23 = charSequence5;
                                    BitmapDrawable bitmapDrawable11 = (BitmapDrawable) obj;
                                    SharingPersonalGoalDto$Available sharingPersonalGoalDto$Available = (SharingPersonalGoalDto$Available) this.$response;
                                    Integer num7 = sharingPersonalGoalDto$Available.f;
                                    Integer num8 = sharingPersonalGoalDto$Available.g;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = str5;
                                    this.L$7 = charSequence4;
                                    this.L$8 = charSequence23;
                                    this.L$9 = l2;
                                    this.L$10 = bitmapDrawable;
                                    this.L$11 = bitmapDrawable11;
                                    this.L$12 = num7;
                                    this.L$13 = num8;
                                    this.label = 5;
                                    k4 = nohVar13.k(this);
                                    if (k4 != coroutineSingletons) {
                                        bitmapDrawable2 = bitmapDrawable;
                                        charSequence6 = charSequence4;
                                        str6 = str5;
                                        num = num8;
                                        num2 = num7;
                                        bitmapDrawable3 = bitmapDrawable11;
                                        charSequence7 = charSequence23;
                                        obj = k4;
                                        return new tqr0(str6, charSequence6, charSequence7, bitmapDrawable2, bitmapDrawable3, num2, num, (CharSequence) obj);
                                    }
                                }
                            }
                        }
                    }
                } else if (hVar instanceof SharingPersonalGoalDto$InProgress) {
                    qoh h8 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$titleAsync$2(this.this$0, hVar, null), 3);
                    h2 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$subtitleAsync$2(this.this$0, this.$response, null), 3);
                    qoh h9 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$actionIconAsync$2(this.this$0, this.$response, null), 3);
                    qoh h10 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$rewardIconAsync$2(this.this$0, this.$response, null), 3);
                    qoh h11 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$deadlineLabelAsync$2(this.this$0, this.$response, null), 3);
                    String str15 = ((SharingPersonalGoalDto$InProgress) this.$response).a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = h2;
                    this.L$3 = h9;
                    this.L$4 = h10;
                    this.L$5 = h11;
                    this.L$6 = str15;
                    this.label = 6;
                    obj = h8.s(this);
                    if (obj != coroutineSingletons) {
                        nohVar4 = h11;
                        str2 = str15;
                        nohVar5 = h10;
                        nohVar6 = h9;
                        CharSequence charSequence24 = (CharSequence) obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = nohVar6;
                        this.L$4 = nohVar5;
                        this.L$5 = nohVar4;
                        this.L$6 = str2;
                        this.L$7 = charSequence24;
                        this.label = 7;
                        k5 = h2.k(this);
                        if (k5 != coroutineSingletons) {
                            nohVar14 = nohVar5;
                            charSequence8 = charSequence24;
                            obj = k5;
                            nohVar15 = nohVar6;
                            str7 = str2;
                            CharSequence charSequence25 = (CharSequence) obj;
                            l3 = ((SharingPersonalGoalDto$InProgress) this.$response).h;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = nohVar14;
                            this.L$5 = nohVar4;
                            this.L$6 = str7;
                            this.L$7 = charSequence8;
                            this.L$8 = charSequence25;
                            this.L$9 = l3;
                            this.label = 8;
                            k6 = nohVar15.k(this);
                            if (k6 != coroutineSingletons) {
                                noh nohVar22 = nohVar4;
                                charSequence9 = charSequence25;
                                obj = k6;
                                nohVar16 = nohVar22;
                                BitmapDrawable bitmapDrawable12 = (BitmapDrawable) obj;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = nohVar16;
                                this.L$6 = str7;
                                this.L$7 = charSequence8;
                                this.L$8 = charSequence9;
                                this.L$9 = l3;
                                this.L$10 = bitmapDrawable12;
                                this.label = 9;
                                k7 = nohVar14.k(this);
                                if (k7 != coroutineSingletons) {
                                    CharSequence charSequence26 = charSequence8;
                                    bitmapDrawable4 = bitmapDrawable12;
                                    obj = k7;
                                    nohVar17 = nohVar16;
                                    str8 = str7;
                                    charSequence10 = charSequence26;
                                    charSequence11 = charSequence9;
                                    l4 = l3;
                                    CharSequence charSequence27 = charSequence11;
                                    BitmapDrawable bitmapDrawable13 = (BitmapDrawable) obj;
                                    SharingPersonalGoalDto$InProgress sharingPersonalGoalDto$InProgress = (SharingPersonalGoalDto$InProgress) this.$response;
                                    Integer num9 = sharingPersonalGoalDto$InProgress.f;
                                    Integer num10 = sharingPersonalGoalDto$InProgress.g;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = str8;
                                    this.L$7 = charSequence10;
                                    this.L$8 = charSequence27;
                                    this.L$9 = l4;
                                    this.L$10 = bitmapDrawable4;
                                    this.L$11 = bitmapDrawable13;
                                    this.L$12 = num9;
                                    this.L$13 = num10;
                                    this.label = 10;
                                    k8 = nohVar17.k(this);
                                    if (k8 != coroutineSingletons) {
                                        bitmapDrawable5 = bitmapDrawable4;
                                        charSequence12 = charSequence10;
                                        str9 = str8;
                                        num3 = num10;
                                        num4 = num9;
                                        bitmapDrawable6 = bitmapDrawable13;
                                        charSequence13 = charSequence27;
                                        obj = k8;
                                        return new vqr0(str9, charSequence12, charSequence13, bitmapDrawable5, bitmapDrawable6, num4, num3, (CharSequence) obj);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (!(hVar instanceof SharingPersonalGoalDto$Completed)) {
                        if (jl40.l(hVar, g.INSTANCE)) {
                            return wqr0.a;
                        }
                        w511.b();
                        return null;
                    }
                    qoh h12 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$titleAsync$3(this.this$0, hVar, null), 3);
                    h = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$subtitleAsync$3(this.this$0, this.$response, null), 3);
                    qoh h13 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$actionIconAsync$3(this.this$0, this.$response, null), 3);
                    qoh h14 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$rewardIconAsync$3(this.this$0, this.$response, null), 3);
                    qoh h15 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoal$2$deadlineLabelAsync$3(this.this$0, this.$response, null), 3);
                    String str16 = ((SharingPersonalGoalDto$Completed) this.$response).a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = h;
                    this.L$3 = h13;
                    this.L$4 = h14;
                    this.L$5 = h15;
                    this.L$6 = str16;
                    this.label = 11;
                    obj = h12.s(this);
                    if (obj != coroutineSingletons) {
                        nohVar = h15;
                        str = str16;
                        nohVar2 = h14;
                        nohVar3 = h13;
                        CharSequence charSequence28 = (CharSequence) obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = nohVar3;
                        this.L$4 = nohVar2;
                        this.L$5 = nohVar;
                        this.L$6 = str;
                        this.L$7 = charSequence28;
                        this.label = 12;
                        k9 = h.k(this);
                        if (k9 != coroutineSingletons) {
                            nohVar18 = nohVar2;
                            charSequence14 = charSequence28;
                            obj = k9;
                            nohVar19 = nohVar3;
                            str10 = str;
                            CharSequence charSequence29 = (CharSequence) obj;
                            l5 = ((SharingPersonalGoalDto$Completed) this.$response).i;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = nohVar18;
                            this.L$5 = nohVar;
                            this.L$6 = str10;
                            this.L$7 = charSequence14;
                            this.L$8 = charSequence29;
                            this.L$9 = l5;
                            this.label = 13;
                            k10 = nohVar19.k(this);
                            if (k10 != coroutineSingletons) {
                                noh nohVar23 = nohVar;
                                charSequence15 = charSequence29;
                                obj = k10;
                                nohVar20 = nohVar23;
                                BitmapDrawable bitmapDrawable14 = (BitmapDrawable) obj;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = nohVar20;
                                this.L$6 = str10;
                                this.L$7 = charSequence14;
                                this.L$8 = charSequence15;
                                this.L$9 = l5;
                                this.L$10 = bitmapDrawable14;
                                this.label = 14;
                                k11 = nohVar18.k(this);
                                if (k11 != coroutineSingletons) {
                                    CharSequence charSequence30 = charSequence14;
                                    bitmapDrawable7 = bitmapDrawable14;
                                    obj = k11;
                                    nohVar21 = nohVar20;
                                    str11 = str10;
                                    charSequence16 = charSequence30;
                                    charSequence17 = charSequence15;
                                    l6 = l5;
                                    CharSequence charSequence31 = charSequence17;
                                    BitmapDrawable bitmapDrawable15 = (BitmapDrawable) obj;
                                    SharingPersonalGoalDto$Completed sharingPersonalGoalDto$Completed = (SharingPersonalGoalDto$Completed) this.$response;
                                    Integer num11 = sharingPersonalGoalDto$Completed.f;
                                    Integer num12 = sharingPersonalGoalDto$Completed.g;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = str11;
                                    this.L$7 = charSequence16;
                                    this.L$8 = charSequence31;
                                    this.L$9 = l6;
                                    this.L$10 = bitmapDrawable7;
                                    this.L$11 = bitmapDrawable15;
                                    this.L$12 = num11;
                                    this.L$13 = num12;
                                    this.label = 15;
                                    k12 = nohVar21.k(this);
                                    if (k12 != coroutineSingletons) {
                                        CharSequence charSequence32 = charSequence16;
                                        bitmapDrawable8 = bitmapDrawable15;
                                        obj = k12;
                                        charSequence18 = charSequence32;
                                        bitmapDrawable9 = bitmapDrawable7;
                                        str12 = str11;
                                        num5 = num12;
                                        num6 = num11;
                                        charSequence19 = charSequence31;
                                        String str17 = ((SharingPersonalGoalDto$Completed) this.$response).h;
                                        return new uqr0(str12, charSequence18, charSequence19, bitmapDrawable9, bitmapDrawable8, num6, num5, (CharSequence) obj);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                str3 = (String) this.L$6;
                nohVar7 = (noh) this.L$5;
                h4 = (noh) this.L$4;
                nohVar8 = (noh) this.L$3;
                h3 = (noh) this.L$2;
                b.b(obj);
                CharSequence charSequence202 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar8;
                this.L$4 = h4;
                this.L$5 = nohVar7;
                this.L$6 = str3;
                this.L$7 = charSequence202;
                this.label = 2;
                k = h3.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                charSequence = (CharSequence) this.L$7;
                String str18 = (String) this.L$6;
                noh nohVar24 = (noh) this.L$5;
                nohVar10 = (noh) this.L$4;
                nohVar9 = (noh) this.L$3;
                b.b(obj);
                str4 = str18;
                nohVar7 = nohVar24;
                CharSequence charSequence212 = (CharSequence) obj;
                Long l72 = ((SharingPersonalGoalDto$Available) this.$response).h;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar10;
                this.L$5 = nohVar7;
                this.L$6 = str4;
                this.L$7 = charSequence;
                this.L$8 = charSequence212;
                this.L$9 = l72;
                this.label = 3;
                k2 = nohVar9.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                l = (Long) this.L$9;
                charSequence2 = (CharSequence) this.L$8;
                charSequence3 = (CharSequence) this.L$7;
                str4 = (String) this.L$6;
                nohVar12 = (noh) this.L$5;
                nohVar11 = (noh) this.L$4;
                b.b(obj);
                BitmapDrawable bitmapDrawable102 = (BitmapDrawable) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar12;
                this.L$6 = str4;
                this.L$7 = charSequence3;
                this.L$8 = charSequence2;
                this.L$9 = l;
                this.L$10 = bitmapDrawable102;
                this.label = 4;
                k3 = nohVar11.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                BitmapDrawable bitmapDrawable16 = (BitmapDrawable) this.L$10;
                l2 = (Long) this.L$9;
                CharSequence charSequence33 = (CharSequence) this.L$8;
                charSequence4 = (CharSequence) this.L$7;
                str5 = (String) this.L$6;
                nohVar13 = (noh) this.L$5;
                b.b(obj);
                charSequence5 = charSequence33;
                bitmapDrawable = bitmapDrawable16;
                CharSequence charSequence232 = charSequence5;
                BitmapDrawable bitmapDrawable112 = (BitmapDrawable) obj;
                SharingPersonalGoalDto$Available sharingPersonalGoalDto$Available2 = (SharingPersonalGoalDto$Available) this.$response;
                Integer num72 = sharingPersonalGoalDto$Available2.f;
                Integer num82 = sharingPersonalGoalDto$Available2.g;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = str5;
                this.L$7 = charSequence4;
                this.L$8 = charSequence232;
                this.L$9 = l2;
                this.L$10 = bitmapDrawable;
                this.L$11 = bitmapDrawable112;
                this.L$12 = num72;
                this.L$13 = num82;
                this.label = 5;
                k4 = nohVar13.k(this);
                if (k4 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                Integer num13 = (Integer) this.L$13;
                Integer num14 = (Integer) this.L$12;
                BitmapDrawable bitmapDrawable17 = (BitmapDrawable) this.L$11;
                BitmapDrawable bitmapDrawable18 = (BitmapDrawable) this.L$10;
                CharSequence charSequence34 = (CharSequence) this.L$8;
                CharSequence charSequence35 = (CharSequence) this.L$7;
                String str19 = (String) this.L$6;
                b.b(obj);
                num2 = num14;
                str6 = str19;
                bitmapDrawable3 = bitmapDrawable17;
                charSequence6 = charSequence35;
                bitmapDrawable2 = bitmapDrawable18;
                charSequence7 = charSequence34;
                num = num13;
                return new tqr0(str6, charSequence6, charSequence7, bitmapDrawable2, bitmapDrawable3, num2, num, (CharSequence) obj);
            case 6:
                str2 = (String) this.L$6;
                nohVar4 = (noh) this.L$5;
                nohVar5 = (noh) this.L$4;
                nohVar6 = (noh) this.L$3;
                h2 = (noh) this.L$2;
                b.b(obj);
                CharSequence charSequence242 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar6;
                this.L$4 = nohVar5;
                this.L$5 = nohVar4;
                this.L$6 = str2;
                this.L$7 = charSequence242;
                this.label = 7;
                k5 = h2.k(this);
                if (k5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 7:
                CharSequence charSequence36 = (CharSequence) this.L$7;
                String str20 = (String) this.L$6;
                noh nohVar25 = (noh) this.L$5;
                noh nohVar26 = (noh) this.L$4;
                nohVar15 = (noh) this.L$3;
                b.b(obj);
                nohVar14 = nohVar26;
                str7 = str20;
                nohVar4 = nohVar25;
                charSequence8 = charSequence36;
                CharSequence charSequence252 = (CharSequence) obj;
                l3 = ((SharingPersonalGoalDto$InProgress) this.$response).h;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar14;
                this.L$5 = nohVar4;
                this.L$6 = str7;
                this.L$7 = charSequence8;
                this.L$8 = charSequence252;
                this.L$9 = l3;
                this.label = 8;
                k6 = nohVar15.k(this);
                if (k6 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 8:
                l3 = (Long) this.L$9;
                charSequence9 = (CharSequence) this.L$8;
                charSequence8 = (CharSequence) this.L$7;
                str7 = (String) this.L$6;
                nohVar16 = (noh) this.L$5;
                nohVar14 = (noh) this.L$4;
                b.b(obj);
                BitmapDrawable bitmapDrawable122 = (BitmapDrawable) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar16;
                this.L$6 = str7;
                this.L$7 = charSequence8;
                this.L$8 = charSequence9;
                this.L$9 = l3;
                this.L$10 = bitmapDrawable122;
                this.label = 9;
                k7 = nohVar14.k(this);
                if (k7 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 9:
                BitmapDrawable bitmapDrawable19 = (BitmapDrawable) this.L$10;
                l4 = (Long) this.L$9;
                CharSequence charSequence37 = (CharSequence) this.L$8;
                charSequence10 = (CharSequence) this.L$7;
                str8 = (String) this.L$6;
                nohVar17 = (noh) this.L$5;
                b.b(obj);
                charSequence11 = charSequence37;
                bitmapDrawable4 = bitmapDrawable19;
                CharSequence charSequence272 = charSequence11;
                BitmapDrawable bitmapDrawable132 = (BitmapDrawable) obj;
                SharingPersonalGoalDto$InProgress sharingPersonalGoalDto$InProgress2 = (SharingPersonalGoalDto$InProgress) this.$response;
                Integer num92 = sharingPersonalGoalDto$InProgress2.f;
                Integer num102 = sharingPersonalGoalDto$InProgress2.g;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = str8;
                this.L$7 = charSequence10;
                this.L$8 = charSequence272;
                this.L$9 = l4;
                this.L$10 = bitmapDrawable4;
                this.L$11 = bitmapDrawable132;
                this.L$12 = num92;
                this.L$13 = num102;
                this.label = 10;
                k8 = nohVar17.k(this);
                if (k8 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 10:
                Integer num15 = (Integer) this.L$13;
                Integer num16 = (Integer) this.L$12;
                BitmapDrawable bitmapDrawable20 = (BitmapDrawable) this.L$11;
                BitmapDrawable bitmapDrawable21 = (BitmapDrawable) this.L$10;
                CharSequence charSequence38 = (CharSequence) this.L$8;
                CharSequence charSequence39 = (CharSequence) this.L$7;
                String str21 = (String) this.L$6;
                b.b(obj);
                num4 = num16;
                str9 = str21;
                bitmapDrawable6 = bitmapDrawable20;
                charSequence12 = charSequence39;
                bitmapDrawable5 = bitmapDrawable21;
                charSequence13 = charSequence38;
                num3 = num15;
                return new vqr0(str9, charSequence12, charSequence13, bitmapDrawable5, bitmapDrawable6, num4, num3, (CharSequence) obj);
            case 11:
                str = (String) this.L$6;
                nohVar = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                nohVar3 = (noh) this.L$3;
                h = (noh) this.L$2;
                b.b(obj);
                CharSequence charSequence282 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar3;
                this.L$4 = nohVar2;
                this.L$5 = nohVar;
                this.L$6 = str;
                this.L$7 = charSequence282;
                this.label = 12;
                k9 = h.k(this);
                if (k9 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 12:
                CharSequence charSequence40 = (CharSequence) this.L$7;
                String str22 = (String) this.L$6;
                noh nohVar27 = (noh) this.L$5;
                noh nohVar28 = (noh) this.L$4;
                nohVar19 = (noh) this.L$3;
                b.b(obj);
                nohVar18 = nohVar28;
                str10 = str22;
                nohVar = nohVar27;
                charSequence14 = charSequence40;
                CharSequence charSequence292 = (CharSequence) obj;
                l5 = ((SharingPersonalGoalDto$Completed) this.$response).i;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar18;
                this.L$5 = nohVar;
                this.L$6 = str10;
                this.L$7 = charSequence14;
                this.L$8 = charSequence292;
                this.L$9 = l5;
                this.label = 13;
                k10 = nohVar19.k(this);
                if (k10 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 13:
                l5 = (Long) this.L$9;
                charSequence15 = (CharSequence) this.L$8;
                charSequence14 = (CharSequence) this.L$7;
                str10 = (String) this.L$6;
                nohVar20 = (noh) this.L$5;
                nohVar18 = (noh) this.L$4;
                b.b(obj);
                BitmapDrawable bitmapDrawable142 = (BitmapDrawable) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar20;
                this.L$6 = str10;
                this.L$7 = charSequence14;
                this.L$8 = charSequence15;
                this.L$9 = l5;
                this.L$10 = bitmapDrawable142;
                this.label = 14;
                k11 = nohVar18.k(this);
                if (k11 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 14:
                BitmapDrawable bitmapDrawable22 = (BitmapDrawable) this.L$10;
                l6 = (Long) this.L$9;
                CharSequence charSequence41 = (CharSequence) this.L$8;
                charSequence16 = (CharSequence) this.L$7;
                str11 = (String) this.L$6;
                nohVar21 = (noh) this.L$5;
                b.b(obj);
                charSequence17 = charSequence41;
                bitmapDrawable7 = bitmapDrawable22;
                CharSequence charSequence312 = charSequence17;
                BitmapDrawable bitmapDrawable152 = (BitmapDrawable) obj;
                SharingPersonalGoalDto$Completed sharingPersonalGoalDto$Completed2 = (SharingPersonalGoalDto$Completed) this.$response;
                Integer num112 = sharingPersonalGoalDto$Completed2.f;
                Integer num122 = sharingPersonalGoalDto$Completed2.g;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = str11;
                this.L$7 = charSequence16;
                this.L$8 = charSequence312;
                this.L$9 = l6;
                this.L$10 = bitmapDrawable7;
                this.L$11 = bitmapDrawable152;
                this.L$12 = num112;
                this.L$13 = num122;
                this.label = 15;
                k12 = nohVar21.k(this);
                if (k12 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 15:
                Integer num17 = (Integer) this.L$13;
                Integer num18 = (Integer) this.L$12;
                BitmapDrawable bitmapDrawable23 = (BitmapDrawable) this.L$11;
                BitmapDrawable bitmapDrawable24 = (BitmapDrawable) this.L$10;
                CharSequence charSequence42 = (CharSequence) this.L$8;
                CharSequence charSequence43 = (CharSequence) this.L$7;
                String str23 = (String) this.L$6;
                b.b(obj);
                num6 = num18;
                str12 = str23;
                bitmapDrawable8 = bitmapDrawable23;
                charSequence18 = charSequence43;
                bitmapDrawable9 = bitmapDrawable24;
                charSequence19 = charSequence42;
                num5 = num17;
                String str172 = ((SharingPersonalGoalDto$Completed) this.$response).h;
                return new uqr0(str12, charSequence18, charSequence19, bitmapDrawable9, bitmapDrawable8, num6, num5, (CharSequence) obj);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
