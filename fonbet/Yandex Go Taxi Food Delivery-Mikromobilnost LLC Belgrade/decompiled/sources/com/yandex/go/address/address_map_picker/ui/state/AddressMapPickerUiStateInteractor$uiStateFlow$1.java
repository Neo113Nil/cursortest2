package com.yandex.go.address.address_map_picker.ui.state;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import com.yandex.go.address.models.Address;
import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import com.yandex.go.pickup_from_photo.experiment.p;
import defpackage.aud0;
import defpackage.avj0;
import defpackage.b31;
import defpackage.bc1;
import defpackage.c31;
import defpackage.c91;
import defpackage.d31;
import defpackage.d6z;
import defpackage.d91;
import defpackage.dms;
import defpackage.dud0;
import defpackage.e91;
import defpackage.evu0;
import defpackage.f11;
import defpackage.f21;
import defpackage.f31;
import defpackage.f91;
import defpackage.g31;
import defpackage.g91;
import defpackage.gtd0;
import defpackage.h31;
import defpackage.h91;
import defpackage.i11;
import defpackage.i91;
import defpackage.itd0;
import defpackage.j31;
import defpackage.j91;
import defpackage.jl40;
import defpackage.jud0;
import defpackage.k91;
import defpackage.kyh0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.nrb;
import defpackage.ny61;
import defpackage.ptd0;
import defpackage.pv0;
import defpackage.q5z;
import defpackage.rb90;
import defpackage.scc;
import defpackage.w511;
import defpackage.xtd0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.map_object.a0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lf21;", ClidProvider.STATE, "Lbc1;", "adjustmentData", "Lrb90;", "panoramaButtonState", "Li11;", "mode", "Li31;", "<anonymous>", "(Lf21;Lbc1;Lrb90;Li11;)Li31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.ui.state.AddressMapPickerUiStateInteractor$uiStateFlow$1", f = "AddressMapPickerUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerUiStateInteractor$uiStateFlow$1(a aVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AddressMapPickerUiStateInteractor$uiStateFlow$1 addressMapPickerUiStateInteractor$uiStateFlow$1 = new AddressMapPickerUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj5);
        addressMapPickerUiStateInteractor$uiStateFlow$1.L$0 = (f21) obj;
        addressMapPickerUiStateInteractor$uiStateFlow$1.L$1 = (bc1) obj2;
        addressMapPickerUiStateInteractor$uiStateFlow$1.L$2 = (rb90) obj3;
        addressMapPickerUiStateInteractor$uiStateFlow$1.L$3 = (i11) obj4;
        return addressMapPickerUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0210  */
    /* JADX WARN: Type inference failed for: r0v26, types: [d31] */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v3, types: [c31] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [ru.yandex.taxi.common_models.net.FormattedText] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [ru.yandex.taxi.common_models.net.FormattedText] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [ru.yandex.taxi.common_models.net.FormattedText] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String h;
        int i;
        List list;
        String str;
        String str2;
        String d31Var;
        boolean z;
        String a;
        Address address;
        f21 f21Var = (f21) this.L$0;
        bc1 bc1Var = (bc1) this.L$1;
        rb90 rb90Var = (rb90) this.L$2;
        i11 i11Var = (i11) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str3 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        zuj0 zuj0Var = aVar.b;
        AddressMapPickerPointType addressMapPickerPointType = f21Var.a;
        pv0 pv0Var = f21Var.c;
        int i2 = j31.a[addressMapPickerPointType.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            h = ((avj0) zuj0Var).h(kyh0.summary_porch_button_label);
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            h = null;
        }
        k91 k91Var = f21Var.b;
        if (!jl40.l(k91Var, j91.a) && !jl40.l(k91Var, i91.a) && !jl40.l(k91Var, f91.a) && !(k91Var instanceof d91) && !(k91Var instanceof e91)) {
            int i4 = 0;
            if (jl40.l(k91Var, g91.a)) {
                nrb nrbVar = jl40.l(i11Var, f11.a) ? new nrb(((avj0) zuj0Var).h(kyh0.clarify_points_favorite_point_title), true) : new nrb(((avj0) zuj0Var).h(kyh0.new_point_selection_screen_starting_point_title_statement), false);
                AddressMapPickerPointType addressMapPickerPointType2 = f21Var.a;
                String F = q5z.F(pv0Var != null ? pv0Var.a : null);
                String D = q5z.D(pv0Var != null ? pv0Var.a : null);
                if (pv0Var != null && (address = pv0Var.a) != null) {
                    str3 = address.J1();
                }
                return new b31(addressMapPickerPointType2, nrbVar.a, F, D, h, str3, ((avj0) zuj0Var).h(kyh0.common_done), rb90Var.a, rb90Var.b, f21Var.d, f21Var.e, f21Var.f, nrbVar.b);
            }
            if (!jl40.l(k91Var, c91.a)) {
                if (!jl40.l(k91Var, h91.a)) {
                    w511.b();
                    return null;
                }
                p pVar = aVar.e.a;
                PickupPhotoRecognitionExperiment b = pVar.b();
                String Y = d6z.Y(b, b.i.getA());
                PickupPhotoRecognitionExperiment b2 = pVar.b();
                String Y2 = d6z.Y(b2, b2.i.getD());
                PickupPhotoRecognitionExperiment b3 = pVar.b();
                String Y3 = d6z.Y(b3, b3.i.getC());
                String str4 = pVar.b().i.b;
                avj0 avj0Var = (avj0) zuj0Var;
                return new h31(Y, Y2, avj0Var.h(kyh0.common_done), Y3, str4 != null ? ((m7x0) pVar.b).a(str4) : null, q5z.F(pv0Var != null ? pv0Var.a : null), q5z.D(pv0Var != null ? pv0Var.a : null), avj0Var.h(kyh0.summary_porch_button_label), rb90Var.a, rb90Var.b);
            }
            if (!jl40.l(bc1Var, bc1.g)) {
                a0 a0Var = bc1Var.a;
                List list2 = a0Var.d.b;
                AddressMapPickerPointType addressMapPickerPointType3 = f21Var.a;
                String a2 = a0Var.a.a();
                String str5 = a2 == null ? "" : a2;
                FormattedText formattedText = a0Var.b;
                String str6 = (formattedText == null || (a = formattedText.a()) == null || evu0.J(a)) ? null : a;
                String a3 = a0Var.c.a.a();
                String str7 = a3 == null ? "" : a3;
                String str8 = bc1Var.c;
                int i5 = a0Var.d.a;
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                for (Object obj2 : list2) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        ?? r19 = str3;
                        scc.m();
                        throw r19;
                    }
                    itd0 itd0Var = (itd0) obj2;
                    if (itd0Var != null) {
                        int i8 = (str8.length() == 0 && i6 == i5) ? i3 : i4;
                        str = str3;
                        itd0 itd0Var2 = (itd0) kotlin.collections.a.S(i7, list2);
                        int i9 = i3;
                        ?? r27 = (i6 == list2.size() + (-1) || itd0Var2 == null || (itd0Var2 instanceof jud0)) ? i4 : i9;
                        if (itd0Var instanceof xtd0) {
                            xtd0 xtd0Var = (xtd0) itd0Var;
                            List list3 = xtd0Var.d;
                            List list4 = xtd0Var.b;
                            aud0 aud0Var = (aud0) kotlin.collections.a.S(i4, list4);
                            aud0 aud0Var2 = (aud0) kotlin.collections.a.S(i9, list4);
                            if (i8 == 0) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : list3) {
                                    int i10 = i5;
                                    List list5 = list2;
                                    if (obj3 instanceof ptd0) {
                                        arrayList2.add(obj3);
                                    }
                                    i5 = i10;
                                    list2 = list5;
                                }
                                i = i5;
                                list = list2;
                                if (!arrayList2.isEmpty()) {
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        if (jl40.l(((ptd0) it.next()).a, str8)) {
                                        }
                                    }
                                }
                                z = false;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : list3) {
                                    if (obj4 instanceof gtd0) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                gtd0 gtd0Var = (gtd0) kotlin.collections.a.R(arrayList3);
                                String str9 = gtd0Var == null ? gtd0Var.a : str;
                                if (aud0Var != null || (r0 = aud0Var.a) == null) {
                                    FormattedText formattedText2 = FormattedText.c;
                                }
                                FormattedText formattedText3 = formattedText2;
                                ?? r22 = aud0Var == null ? aud0Var.b : str;
                                ?? r23 = aud0Var2 == null ? aud0Var2.a : str;
                                ?? r24 = aud0Var2 == null ? aud0Var2.b : str;
                                dud0 dud0Var = xtd0Var.a;
                                d31Var = new c31(formattedText3, r22, r23, r24, dud0Var == null ? dud0Var.a : str, z, r27, xtd0Var.e, str9);
                            } else {
                                i = i5;
                                list = list2;
                            }
                            z = true;
                            ArrayList arrayList32 = new ArrayList();
                            while (r3.hasNext()) {
                            }
                            gtd0 gtd0Var2 = (gtd0) kotlin.collections.a.R(arrayList32);
                            if (gtd0Var2 == null) {
                            }
                            if (aud0Var != null) {
                            }
                            FormattedText formattedText22 = FormattedText.c;
                            FormattedText formattedText32 = formattedText22;
                            if (aud0Var == null) {
                            }
                            if (aud0Var2 == null) {
                            }
                            if (aud0Var2 == null) {
                            }
                            dud0 dud0Var2 = xtd0Var.a;
                            d31Var = new c31(formattedText32, r22, r23, r24, dud0Var2 == null ? dud0Var2.a : str, z, r27, xtd0Var.e, str9);
                        } else {
                            i = i5;
                            list = list2;
                            if (!(itd0Var instanceof jud0)) {
                                w511.b();
                                return str;
                            }
                            String a4 = ((jud0) itd0Var).a.a();
                            if (a4 == null) {
                                a4 = "";
                            }
                            d31Var = new d31(a4);
                        }
                        str2 = d31Var;
                    } else {
                        i = i5;
                        list = list2;
                        str = str3;
                        str2 = str;
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i6 = i7;
                    i5 = i;
                    str3 = str;
                    list2 = list;
                    i3 = 1;
                    i4 = 0;
                }
                return new f31(addressMapPickerPointType3, str5, str6, str7, arrayList, f21Var.e, f21Var.f);
            }
        }
        return g31.a;
    }
}
