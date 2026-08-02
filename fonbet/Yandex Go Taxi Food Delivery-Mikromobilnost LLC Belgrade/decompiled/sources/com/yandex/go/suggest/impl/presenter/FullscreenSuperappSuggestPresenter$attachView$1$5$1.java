package com.yandex.go.suggest.impl.presenter;

import android.view.ContextThemeWrapper;
import com.yandex.go.address.models.Address;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import defpackage.als;
import defpackage.avj0;
import defpackage.b4h0;
import defpackage.b760;
import defpackage.bdc;
import defpackage.bls;
import defpackage.cls;
import defpackage.dls;
import defpackage.dms;
import defpackage.dxp0;
import defpackage.els;
import defpackage.evu0;
import defpackage.fls;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.kyh0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q4v0;
import defpackage.q5z;
import defpackage.s8o;
import defpackage.wa90;
import defpackage.xby;
import defpackage.zks;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.address.experiment.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/yandex/go/address/models/Address;", "address", "Lru/yandex/taxi/address/experiment/e;", "suggestExperiment", "", "scroll", "", "isAiAssistantOpeningPreparing", "Lfls;", "<anonymous>", "(Lcom/yandex/go/address/models/Address;Lru/yandex/taxi/address/experiment/e;IZ)Lfls;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$5$1", f = "FullscreenSuperappSuggestPresenter.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class FullscreenSuperappSuggestPresenter$attachView$1$5$1 extends SuspendLambda implements dms {
    final /* synthetic */ q4v0 $cartButtonConfiguration;
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenSuperappSuggestPresenter$attachView$1$5$1(c cVar, q4v0 q4v0Var, Continuation continuation) {
        super(5, continuation);
        this.this$0 = cVar;
        this.$cartButtonConfiguration = q4v0Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj3).intValue();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        FullscreenSuperappSuggestPresenter$attachView$1$5$1 fullscreenSuperappSuggestPresenter$attachView$1$5$1 = new FullscreenSuperappSuggestPresenter$attachView$1$5$1(this.this$0, this.$cartButtonConfiguration, (Continuation) obj5);
        fullscreenSuperappSuggestPresenter$attachView$1$5$1.L$0 = (Address) obj;
        fullscreenSuperappSuggestPresenter$attachView$1$5$1.L$1 = (e) obj2;
        fullscreenSuperappSuggestPresenter$attachView$1$5$1.I$0 = intValue;
        fullscreenSuperappSuggestPresenter$attachView$1$5$1.Z$0 = booleanValue;
        return fullscreenSuperappSuggestPresenter$attachView$1$5$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
    
        if (r4 != false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0063  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [als] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [zks] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [els] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String F;
        String str;
        String str2;
        Throwable th;
        boolean z;
        ?? r6;
        ?? r7;
        ?? r62;
        ?? r2;
        ?? r22;
        dxp0 dxp0Var;
        ?? r11;
        q4v0 q4v0Var;
        Object obj2;
        Object alsVar;
        int i;
        Address address = (Address) this.L$0;
        e eVar = (e) this.L$1;
        int i2 = this.I$0;
        boolean z2 = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            F = q5z.F(address);
            if (evu0.J(F)) {
                F = null;
            }
            if (F == null) {
                F = ((avj0) this.this$0.I).h(kyh0.new_mainscreen_pending);
            }
            if (address != null) {
                c cVar = this.this$0;
                this.L$0 = address;
                this.L$1 = eVar;
                this.L$2 = F;
                this.I$0 = i2;
                this.Z$0 = z2;
                this.label = 1;
                if (c.Kg(cVar, address, F, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = F;
            }
            str2 = eVar == null ? eVar.i : null;
            if (str2 != null || evu0.J(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = ((avj0) this.this$0.I).h(kyh0.superapp_search_current_address_title);
            }
            String str3 = str2;
            if (address != null) {
                th = null;
                z = true;
            } else {
                th = null;
                z = false;
            }
            r6 = eVar == null ? eVar.q : th;
            r7 = eVar == null ? eVar.r : th;
            ?? r8 = eVar == null ? eVar.s : th;
            boolean z3 = this.this$0.A.k() != null;
            if (r7 != 0 && !evu0.J(r7)) {
                i = r6 != 0 ? -1 : b760.a[r6.ordinal()];
                if (i == 1) {
                    if (i == 2 && z3) {
                        r62 = new els(r7);
                    }
                } else if (r8 != 0 && !evu0.J(r8)) {
                    String str4 = r7;
                    if (!z3) {
                        str4 = r8;
                    }
                    r62 = new els(str4);
                }
                r2 = eVar == null ? eVar.g : th;
                if (r2 != 0) {
                    boolean J = evu0.J(r2);
                    r22 = r2;
                }
                r22 = th;
                if (r22 == 0) {
                    r22 = ((avj0) this.this$0.I).h(kyh0.superapp_search_input_hint);
                }
                String str5 = r22;
                dls clsVar = (eVar == null ? eVar.b : th) == null ? new cls(eVar.b) : bls.a(b4h0.ic_select_address);
                c cVar2 = this.this$0;
                dxp0Var = cVar2.N.f;
                if (dxp0Var == null) {
                    wa90 wa90Var = cVar2.O;
                    k7x0 k7x0Var = cVar2.P;
                    bdc b = wa90Var.b(dxp0Var.a());
                    if (b == null) {
                        xby.t(jst.e, "SUPERAPP:SEARCH:TRAIL_BUTTON", th, "Couldn't parse background color", 6);
                        alsVar = th;
                    } else {
                        m7x0 m7x0Var = (m7x0) k7x0Var;
                        String a = m7x0Var.a(dxp0Var.d());
                        String e = dxp0Var.e();
                        alsVar = new als(a, e != null ? m7x0Var.a(e) : th, s8o.m(b, new ContextThemeWrapper(cVar2.z, cVar2.Q.a(cVar2.M.getThemeType()).b)));
                    }
                    r11 = alsVar;
                } else {
                    r11 = th;
                }
                c cVar3 = this.this$0;
                String str6 = cVar3.N.g;
                ?? a2 = str6 == null ? ((m7x0) cVar3.P).a(str6) : th;
                q4v0Var = this.$cartButtonConfiguration;
                if (q4v0Var != null) {
                    c cVar4 = this.this$0;
                    String b2 = q4v0Var.b();
                    if (b2 != null) {
                        String a3 = q4v0Var.a();
                        obj2 = new zks(b2, a3 != null ? ((m7x0) cVar4.P).a(a3) : th);
                        return new fls(str3, F, z, r62, str5, clsVar, i2, z2, r11, a2, this.this$0.N.e == SuperappSuggestExperiment.SearchScaffoldStyle.FLOATING_INPUT ? obj2 : th);
                    }
                }
                obj2 = th;
                return new fls(str3, F, z, r62, str5, clsVar, i2, z2, r11, a2, this.this$0.N.e == SuperappSuggestExperiment.SearchScaffoldStyle.FLOATING_INPUT ? obj2 : th);
            }
            r62 = th;
            if (eVar == null) {
            }
            if (r2 != 0) {
            }
            r22 = th;
            if (r22 == 0) {
            }
            String str52 = r22;
            dls clsVar2 = (eVar == null ? eVar.b : th) == null ? new cls(eVar.b) : bls.a(b4h0.ic_select_address);
            c cVar22 = this.this$0;
            dxp0Var = cVar22.N.f;
            if (dxp0Var == null) {
            }
            c cVar32 = this.this$0;
            String str62 = cVar32.N.g;
            if (str62 == null) {
            }
            q4v0Var = this.$cartButtonConfiguration;
            if (q4v0Var != null) {
            }
            obj2 = th;
            return new fls(str3, F, z, r62, str52, clsVar2, i2, z2, r11, a2, this.this$0.N.e == SuperappSuggestExperiment.SearchScaffoldStyle.FLOATING_INPUT ? obj2 : th);
        }
        if (i3 != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = (String) this.L$2;
        kotlin.b.b(obj);
        this.this$0.T = address;
        F = str;
        if (eVar == null) {
        }
        if (str2 != null) {
        }
        str2 = null;
        if (str2 == null) {
        }
        String str32 = str2;
        if (address != null) {
        }
        if (eVar == null) {
        }
        if (eVar == null) {
        }
        if (eVar == null) {
        }
        if (this.this$0.A.k() != null) {
        }
        if (r7 != 0) {
            if (r6 != 0) {
            }
            if (i == 1) {
            }
            if (eVar == null) {
            }
            if (r2 != 0) {
            }
            r22 = th;
            if (r22 == 0) {
            }
            String str522 = r22;
            dls clsVar22 = (eVar == null ? eVar.b : th) == null ? new cls(eVar.b) : bls.a(b4h0.ic_select_address);
            c cVar222 = this.this$0;
            dxp0Var = cVar222.N.f;
            if (dxp0Var == null) {
            }
            c cVar322 = this.this$0;
            String str622 = cVar322.N.g;
            if (str622 == null) {
            }
            q4v0Var = this.$cartButtonConfiguration;
            if (q4v0Var != null) {
            }
            obj2 = th;
            return new fls(str32, F, z, r62, str522, clsVar22, i2, z2, r11, a2, this.this$0.N.e == SuperappSuggestExperiment.SearchScaffoldStyle.FLOATING_INPUT ? obj2 : th);
        }
        r62 = th;
        if (eVar == null) {
        }
        if (r2 != 0) {
        }
        r22 = th;
        if (r22 == 0) {
        }
        String str5222 = r22;
        dls clsVar222 = (eVar == null ? eVar.b : th) == null ? new cls(eVar.b) : bls.a(b4h0.ic_select_address);
        c cVar2222 = this.this$0;
        dxp0Var = cVar2222.N.f;
        if (dxp0Var == null) {
        }
        c cVar3222 = this.this$0;
        String str6222 = cVar3222.N.g;
        if (str6222 == null) {
        }
        q4v0Var = this.$cartButtonConfiguration;
        if (q4v0Var != null) {
        }
        obj2 = th;
        return new fls(str32, F, z, r62, str5222, clsVar222, i2, z2, r11, a2, this.this$0.N.e == SuperappSuggestExperiment.SearchScaffoldStyle.FLOATING_INPUT ? obj2 : th);
    }
}
