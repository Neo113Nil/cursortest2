package com.yandex.go.taxi.summary.verticalsummary.interactor;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.yandex.go.taxi.summary.verticalsummary.state.TariffUiState$AlternativePosition;
import com.yandex.go.zone.dto.objects.TariffCard;
import defpackage.aqv0;
import defpackage.bdc;
import defpackage.bgx0;
import defpackage.cg31;
import defpackage.dg31;
import defpackage.elx0;
import defpackage.evu0;
import defpackage.fk31;
import defpackage.h3y;
import defpackage.kco;
import defpackage.kdc;
import defpackage.mja1;
import defpackage.nco;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pvi0;
import defpackage.pwy0;
import defpackage.q0f0;
import defpackage.qdx0;
import defpackage.qze0;
import defpackage.r0f0;
import defpackage.s0f0;
import defpackage.s8o;
import defpackage.t0f0;
import defpackage.tox0;
import defpackage.uox0;
import defpackage.vbx0;
import defpackage.vcx0;
import defpackage.w511;
import defpackage.wbx0;
import defpackage.wiq0;
import defpackage.xng0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;

/* loaded from: classes14.dex */
public final class f {
    public final Context a;
    public final ru.yandex.taxi.widget.utils.e b;
    public final wiq0 c;
    public final pwy0 d;
    public final fk31 e;
    public final aqv0 f;
    public final h3y g;
    public final cg31 h;
    public final bgx0 i;

    public f(Context context, ru.yandex.taxi.widget.utils.e eVar, wiq0 wiq0Var, pwy0 pwy0Var, fk31 fk31Var, aqv0 aqv0Var, h3y h3yVar, cg31 cg31Var, bgx0 bgx0Var) {
        this.a = context;
        this.b = eVar;
        this.c = wiq0Var;
        this.d = pwy0Var;
        this.e = fk31Var;
        this.f = aqv0Var;
        this.g = h3yVar;
        this.h = cg31Var;
        this.i = bgx0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0167, code lost:
    
        if (r2 == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0162, code lost:
    
        if (r2 != r5) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0164, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
    
        if (r2 == r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f7, code lost:
    
        if (defpackage.evu0.J(r7) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, elx0 elx0Var, Map map, ContinuationImpl continuationImpl) {
        TariffsUiStateInteractor$getTariffUiState$1 tariffsUiStateInteractor$getTariffUiState$1;
        int i;
        CharSequence charSequence;
        String str;
        TariffCard tariffCard;
        vbx0 vbx0Var;
        qze0 qze0Var;
        dg31 dg31Var;
        ?? r2;
        String str2;
        elx0 elx0Var2 = elx0Var;
        fVar.getClass();
        ru.yandex.taxi.widget.utils.e eVar = fVar.b;
        if (continuationImpl instanceof TariffsUiStateInteractor$getTariffUiState$1) {
            tariffsUiStateInteractor$getTariffUiState$1 = (TariffsUiStateInteractor$getTariffUiState$1) continuationImpl;
            int i2 = tariffsUiStateInteractor$getTariffUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffsUiStateInteractor$getTariffUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffsUiStateInteractor$getTariffUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffsUiStateInteractor$getTariffUiState$1.label;
                String str3 = "";
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str4 = elx0Var2.b;
                    boolean z = elx0Var2.u;
                    boolean z2 = elx0Var2.g;
                    pex0 pex0Var = (pex0) map.get(str4);
                    if (z2) {
                        vbx0Var = new vbx0(0);
                    } else {
                        nco ncoVar = elx0Var2.l;
                        if (z2) {
                            charSequence = "";
                        } else {
                            CharSequence text = ncoVar != null ? ncoVar.getText() : null;
                            if (text == null || evu0.J(text)) {
                                charSequence = null;
                            } else {
                                kdc bdcVar = z ? new bdc(xng0.textMain) : ncoVar instanceof kco ? ((kco) ncoVar).c : elx0Var2.w ? new bdc(xng0.textMain) : new bdc(xng0.textMinor);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                ForegroundColorSpanFix foregroundColorSpanFix = new ForegroundColorSpanFix(s8o.m(bdcVar, fVar.a));
                                int length = spannableStringBuilder.length();
                                spannableStringBuilder.append(text);
                                spannableStringBuilder.setSpan(foregroundColorSpanFix, length, spannableStringBuilder.length(), 17);
                                charSequence = new SpannedString(spannableStringBuilder);
                            }
                        }
                        if (!z2) {
                            str = (pex0Var == null || (tariffCard = pex0Var.i0) == null) ? null : tariffCard.a;
                            if (str != null) {
                            }
                        }
                        str = "";
                        vbx0Var = new vbx0(charSequence, str);
                    }
                    tariffsUiStateInteractor$getTariffUiState$1.L$0 = elx0Var2;
                    tariffsUiStateInteractor$getTariffUiState$1.L$1 = null;
                    tariffsUiStateInteractor$getTariffUiState$1.L$2 = null;
                    tariffsUiStateInteractor$getTariffUiState$1.L$3 = vbx0Var;
                    tariffsUiStateInteractor$getTariffUiState$1.label = 1;
                    if (z2 || pex0Var == null || (qze0Var = pex0Var.m) == null || (dg31Var = qze0Var.n) == null) {
                        obj = null;
                    } else {
                        obj = ru.yandex.taxi.widget.utils.e.s(eVar, (z ? dg31Var.b : dg31Var.a).a, tariffsUiStateInteractor$getTariffUiState$1);
                    }
                } else if (i == 1) {
                    vbx0Var = (vbx0) tariffsUiStateInteractor$getTariffUiState$1.L$3;
                    elx0Var2 = (elx0) tariffsUiStateInteractor$getTariffUiState$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vbx0Var = (vbx0) tariffsUiStateInteractor$getTariffUiState$1.L$3;
                    elx0Var2 = (elx0) tariffsUiStateInteractor$getTariffUiState$1.L$0;
                    kotlin.b.b(obj);
                    ?? r22 = (CharSequence) obj;
                    str2 = r22;
                }
                r2 = (CharSequence) obj;
                str2 = r2;
                if (r2 == 0) {
                    tariffsUiStateInteractor$getTariffUiState$1.L$0 = elx0Var2;
                    tariffsUiStateInteractor$getTariffUiState$1.L$1 = null;
                    tariffsUiStateInteractor$getTariffUiState$1.L$2 = null;
                    tariffsUiStateInteractor$getTariffUiState$1.L$3 = vbx0Var;
                    tariffsUiStateInteractor$getTariffUiState$1.label = 2;
                    if (!elx0Var2.g) {
                        t0f0 t0f0Var = elx0Var2.P;
                        if (t0f0Var instanceof q0f0) {
                            obj = ((q0f0) t0f0Var).c;
                        } else if (t0f0Var instanceof r0f0) {
                            obj = ru.yandex.taxi.widget.utils.e.s(eVar, ((r0f0) t0f0Var).a, tariffsUiStateInteractor$getTariffUiState$1);
                            if (obj != coroutineSingletons) {
                                obj = (CharSequence) obj;
                            }
                        } else if (!(t0f0Var instanceof s0f0) && t0f0Var != null) {
                            w511.b();
                            return null;
                        }
                    }
                    obj = null;
                }
                str3 = str2;
                String str5 = elx0Var2.Q;
                boolean z3 = elx0Var2.v;
                String str6 = elx0Var2.O;
                pvi0 b = str6 == null ? mja1.b(str6, null, 6) : null;
                boolean z4 = elx0Var2.g;
                boolean z5 = elx0Var2.u;
                String str7 = elx0Var2.f;
                boolean z6 = elx0Var2.w;
                return new uox0(z5, str7, z6 ? z3 ? TariffUiState$AlternativePosition.TOP : TariffUiState$AlternativePosition.BOTTOM : null, str3, str5, b, new tox0(elx0Var2.b, elx0Var2.a, elx0Var2.d, (z6 || z3) ? false : true), false, new vcx0(b, z5, str5), new wbx0(str7, vbx0Var, z5, z4), new qdx0(str3, z5, z4));
            }
        }
        tariffsUiStateInteractor$getTariffUiState$1 = new TariffsUiStateInteractor$getTariffUiState$1(fVar, continuationImpl);
        Object obj2 = tariffsUiStateInteractor$getTariffUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffsUiStateInteractor$getTariffUiState$1.label;
        String str32 = "";
        if (i != 0) {
        }
        r2 = (CharSequence) obj2;
        str2 = r2;
        if (r2 == 0) {
        }
        str32 = str2;
        String str52 = elx0Var2.Q;
        boolean z32 = elx0Var2.v;
        String str62 = elx0Var2.O;
        if (str62 == null) {
        }
        boolean z42 = elx0Var2.g;
        boolean z52 = elx0Var2.u;
        String str72 = elx0Var2.f;
        boolean z62 = elx0Var2.w;
        return new uox0(z52, str72, z62 ? z32 ? TariffUiState$AlternativePosition.TOP : TariffUiState$AlternativePosition.BOTTOM : null, str32, str52, b, new tox0(elx0Var2.b, elx0Var2.a, elx0Var2.d, (z62 || z32) ? false : true), false, new vcx0(b, z52, str52), new wbx0(str72, vbx0Var, z52, z42), new qdx0(str32, z52, z42));
    }
}
