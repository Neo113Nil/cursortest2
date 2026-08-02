package com.yandex.payment.divkit.usecases;

import com.yandex.div.state.db.StateEntry;
import defpackage.abe;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ov5;
import defpackage.pv5;
import defpackage.ryh0;
import defpackage.tse;
import defpackage.tyh0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lorg/json/JSONObject;", "<anonymous>", "(Ltse;)Lorg/json/JSONObject;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.FetchBindCardScreenUseCaseImpl$createFromPredefine$2", f = "FetchBindCardScreenUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FetchBindCardScreenUseCaseImpl$createFromPredefine$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isPaymentContext;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchBindCardScreenUseCaseImpl$createFromPredefine$2(d dVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$isPaymentContext = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchBindCardScreenUseCaseImpl$createFromPredefine$2(this.this$0, this.$isPaymentContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchBindCardScreenUseCaseImpl$createFromPredefine$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        JSONArray jSONArray;
        JSONObject jSONObject;
        int i;
        JSONArray jSONArray2;
        JSONObject jSONObject2;
        JSONArray jSONArray3;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        JSONObject a = this.this$0.a.a("bind_screen.json");
        d dVar = this.this$0;
        boolean z2 = this.$isPaymentContext;
        int i3 = 0;
        JSONArray jSONArray4 = a.getJSONObject("card").getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items");
        int length = jSONArray4.length();
        int i4 = 0;
        while (i4 < length) {
            Object obj2 = jSONArray4.get(i4);
            if (obj2 instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) obj2;
                int i5 = 2;
                if (i4 == 0) {
                    z = z2;
                    jSONObject = a;
                    jSONArray = jSONArray4;
                    JSONArray jSONArray5 = jSONObject3.getJSONArray("items");
                    int length2 = jSONArray5.length();
                    int i6 = i3;
                    while (i6 < length2) {
                        Object obj3 = jSONArray5.get(i6);
                        if (obj3 instanceof JSONObject) {
                            JSONObject jSONObject4 = (JSONObject) obj3;
                            if (i6 == 0) {
                                JSONObject jSONObject5 = jSONObject4.getJSONObject("accessibility");
                                abe abeVar = dVar.b;
                                ((pv5) dVar.c).getClass();
                                jSONObject5.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, abeVar.a.getString(tyh0.paymentsdk_prebuilt_back_button_content_description));
                            } else if (i6 == 1) {
                                abe abeVar2 = dVar.b;
                                ov5 ov5Var = dVar.c;
                                if (z) {
                                    ((pv5) ov5Var).getClass();
                                    i = tyh0.paymentsdk_divkit_pay_new_card_title;
                                } else {
                                    ((pv5) ov5Var).getClass();
                                    i = ryh0.paymentsdk_bind_card_title;
                                }
                                jSONObject4.put("text", abeVar2.a.getString(i));
                            } else if (i6 == i5) {
                                JSONObject jSONObject6 = jSONObject4.getJSONObject("accessibility");
                                abe abeVar3 = dVar.b;
                                ((pv5) dVar.c).getClass();
                                jSONObject6.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, abeVar3.a.getString(tyh0.paymentsdk_prebuilt_close));
                            }
                        }
                        i6++;
                        i5 = 2;
                    }
                } else if (i4 == 1) {
                    z = z2;
                    jSONObject = a;
                    jSONArray = jSONArray4;
                    JSONArray jSONArray6 = jSONObject3.getJSONArray("items");
                    int length3 = jSONArray6.length();
                    for (int i7 = 0; i7 < length3; i7++) {
                        Object obj4 = jSONArray6.get(i7);
                        if (obj4 instanceof JSONObject) {
                            JSONObject jSONObject7 = (JSONObject) obj4;
                            if (i7 == 0) {
                                JSONObject jSONObject8 = jSONObject7.getJSONArray("items").getJSONObject(0);
                                abe abeVar4 = dVar.b;
                                ((pv5) dVar.c).getClass();
                                jSONObject8.put("text", abeVar4.a.getString(tyh0.paymentsdk_prebuilt_card_nfc_bring_card));
                            } else if (i7 == 1) {
                                abe abeVar5 = dVar.b;
                                ((pv5) dVar.c).getClass();
                                jSONObject7.put("text", abeVar5.a.getString(tyh0.paymentsdk_prebuilt_card_nfc_enter_manually));
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 4) {
                        z = z2;
                        JSONArray jSONArray7 = jSONObject3.getJSONArray("states");
                        int length4 = jSONArray7.length();
                        int i8 = 0;
                        while (i8 < length4) {
                            Object obj5 = jSONArray7.get(i8);
                            if (obj5 instanceof JSONObject) {
                                JSONObject jSONObject9 = (JSONObject) obj5;
                                dVar.getClass();
                                JSONObject jSONObject10 = jSONObject9.getJSONObject("div");
                                JSONObject jSONObject11 = jSONObject10.getJSONObject("accessibility");
                                jSONArray2 = jSONArray7;
                                abe abeVar6 = dVar.b;
                                jSONObject2 = a;
                                boolean z3 = jSONObject9.getBoolean(StateEntry.COLUMN_STATE_ID);
                                ov5 ov5Var2 = dVar.c;
                                if (z3) {
                                    ((pv5) ov5Var2).getClass();
                                    i2 = tyh0.paymentsdk_divkit_save_card_title_short;
                                } else {
                                    ((pv5) ov5Var2).getClass();
                                    i2 = tyh0.paymentsdk_prebuild_save_card_unchecked_description_short;
                                }
                                jSONArray3 = jSONArray4;
                                jSONObject11.put("state_description", abeVar6.a.getString(i2));
                                JSONObject jSONObject12 = jSONObject10.getJSONArray("items").getJSONObject(1);
                                ((pv5) ov5Var2).getClass();
                                jSONObject12.put("text", abeVar6.a.getString(tyh0.paymentsdk_divkit_save_card_title_short));
                            } else {
                                jSONArray2 = jSONArray7;
                                jSONObject2 = a;
                                jSONArray3 = jSONArray4;
                            }
                            i8++;
                            jSONArray7 = jSONArray2;
                            a = jSONObject2;
                            jSONArray4 = jSONArray3;
                        }
                    } else if (i4 == 6) {
                        z = z2;
                        int i9 = 1;
                        JSONArray jSONArray8 = jSONObject3.getJSONArray("items").getJSONObject(0).getJSONArray("states");
                        int length5 = jSONArray8.length();
                        int i10 = 0;
                        while (i10 < length5) {
                            Object obj6 = jSONArray8.get(i10);
                            if (obj6 instanceof JSONObject) {
                                JSONObject jSONObject13 = (JSONObject) obj6;
                                if (i10 == 0) {
                                    abe abeVar7 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.a(dVar, jSONObject13, abeVar7.a.getString(tyh0.paymentsdk_divkit_enter_number));
                                } else if (i10 == i9) {
                                    abe abeVar8 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.a(dVar, jSONObject13, abeVar8.a.getString(tyh0.paymentsdk_divkit_continue));
                                } else if (i10 == 2) {
                                    abe abeVar9 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.a(dVar, jSONObject13, abeVar9.a.getString(tyh0.paymentsdk_divkit_checking));
                                } else if (i10 == 3) {
                                    abe abeVar10 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.a(dVar, jSONObject13, abeVar10.a.getString(tyh0.paymentsdk_divkit_enter_date_code));
                                } else if (i10 == 4) {
                                    abe abeVar11 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.a(dVar, jSONObject13, abeVar11.a.getString(tyh0.paymentsdk_divkit_enter_date));
                                }
                            }
                            i10++;
                            i9 = 1;
                        }
                    } else if (i4 == 7) {
                        abe abeVar12 = dVar.b;
                        pv5 pv5Var = (pv5) dVar.c;
                        pv5Var.getClass();
                        String string = abeVar12.a.getString(tyh0.paymentsdk_divkit_terms_begin);
                        pv5Var.getClass();
                        String string2 = abeVar12.a.getString(tyh0.paymentsdk_divkit_terms_underline);
                        pv5Var.getClass();
                        String string3 = abeVar12.a.getString(tyh0.paymentsdk_divkit_terms_end);
                        JSONObject jSONObject14 = jSONObject3.getJSONArray("ranges").getJSONObject(0);
                        z = z2;
                        jSONObject14.put("start", string.length() + 1);
                        jSONObject14.put("end", string2.length() + string.length() + 1);
                        StringBuilder sb = new StringBuilder();
                        g8e.D(sb, string, " ", string2, " ");
                        sb.append(string3);
                        jSONObject3.put("text", sb.toString());
                    }
                    jSONObject = a;
                    jSONArray = jSONArray4;
                } else {
                    z = z2;
                    jSONObject = a;
                    jSONArray = jSONArray4;
                    JSONArray jSONArray9 = jSONObject3.getJSONArray("states");
                    int length6 = jSONArray9.length();
                    for (int i11 = 0; i11 < length6; i11++) {
                        Object obj7 = jSONArray9.get(i11);
                        if (obj7 instanceof JSONObject) {
                            JSONObject jSONObject15 = (JSONObject) obj7;
                            switch (i11) {
                                case 1:
                                    abe abeVar13 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.b(dVar, jSONObject15, abeVar13.a.getString(tyh0.paymentsdk_prebuilt_wrong_card_number_try_again_message));
                                    break;
                                case 2:
                                    abe abeVar14 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.b(dVar, jSONObject15, abeVar14.a.getString(tyh0.paymentsdk_prebuilt_wrong_date_try_again_message));
                                    break;
                                case 3:
                                    abe abeVar15 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.b(dVar, jSONObject15, abeVar15.a.getString(tyh0.paymentsdk_prebuilt_wrong_code_try_again_message));
                                    break;
                                case 4:
                                    abe abeVar16 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.b(dVar, jSONObject15, abeVar16.a.getString(tyh0.paymentsdk_prebuilt_wrong_date_and_code_try_again_message));
                                    break;
                                case 5:
                                    abe abeVar17 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.b(dVar, jSONObject15, abeVar17.a.getString(tyh0.paymentsdk_prebuilt_forbidden_for_service));
                                    break;
                                case 6:
                                    abe abeVar18 = dVar.b;
                                    ((pv5) dVar.c).getClass();
                                    d.b(dVar, jSONObject15, abeVar18.a.getString(tyh0.paymentsdk_prebuilt_split_forbidden_for_service));
                                    break;
                            }
                        }
                    }
                }
                i4++;
                z2 = z;
                a = jSONObject;
                jSONArray4 = jSONArray;
                i3 = 0;
            }
            z = z2;
            jSONObject = a;
            jSONArray = jSONArray4;
            i4++;
            z2 = z;
            a = jSONObject;
            jSONArray4 = jSONArray;
            i3 = 0;
        }
        return a;
    }
}
