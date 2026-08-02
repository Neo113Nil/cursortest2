package defpackage;

import android.app.DownloadManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.emoji2.emojipicker.EmojiPickerView;
import com.cloudwebrtc.webrtc.FlutterWebRTCPlugin;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.FieldBinding;
import com.yandex.go.due_timetable.presentation.DueTimetableModalView;
import com.yandex.go.explorer.impl.ui.map.c;
import com.yandex.go.external_service.view.ExternalServiceModalView;
import com.yandex.xplat.common.JSONItemKind;
import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;
import com.yx360.design.compose.atoms.DsListItem$Divider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.eatskit.EatsKitContentView;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.a;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.f;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.DoubleTariffRibbonView;
import ru.yandex.taxi.superapp.q;

/* loaded from: classes5.dex */
public final /* synthetic */ class loj implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ loj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 verticalsView$lambda$0;
        b1x b1xVar;
        Object obj3;
        zy11 _init_$lambda$0;
        Object value;
        LinkedHashMap linkedHashMap;
        zy11 createEmojiPickerBodyAdapter$lambda$4;
        zy11 lambda$1$0;
        zy11 builderSetter$lambda$0;
        zy11 builderSetter$lambda$1;
        zy11 builderSetter$lambda$2;
        CharSequence charSequence;
        zy11 lambda$startListening$0;
        zy11 onViewCreated$lambda$9;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.d((foj) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                jrq0 jrq0Var = (jrq0) obj4;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                } else if (jrq0Var == null) {
                    btsVar.e0(-1150836801);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1150836800);
                    pj91.b(jrq0Var.a, pj91.e(jrq0Var.b), btsVar, 0);
                    btsVar.t(false);
                }
                return zy11Var;
            case 2:
                verticalsView$lambda$0 = DoubleTariffRibbonView.verticalsView$lambda$0((DoubleTariffRibbonView) obj4, ((Integer) obj).intValue(), (ob31) obj2);
                return verticalsView$lambda$0;
            case 3:
                z9m z9mVar = (z9m) obj4;
                ((zvd0) obj).a();
                tx40 tx40Var = z9mVar.c;
                tx40Var.setFloatValue(z9m.a(z9mVar, Float.intBitsToFloat((int) (((wu60) obj2).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + tx40Var.getFloatValue()));
                oz40 oz40Var = z9mVar.a;
                tx40 tx40Var2 = z9mVar.c;
                l3t0 l3t0Var = z9mVar.d;
                yx40 yx40Var = z9mVar.b;
                int intValue2 = yx40Var.getIntValue();
                if (intValue2 != -1 && (b1xVar = (b1x) l3t0Var.get(Integer.valueOf(intValue2))) != null) {
                    float f = b1xVar.a;
                    float floatValue = tx40Var2.getFloatValue() + (b1xVar.b / 2.0f) + f;
                    Iterator it = l3t0Var.b.iterator();
                    while (true) {
                        if (((c5u0) it).hasNext()) {
                            Object next = ((c5u0) it).next();
                            Map.Entry entry = (Map.Entry) next;
                            int intValue3 = ((Number) entry.getKey()).intValue();
                            b1x b1xVar2 = (b1x) entry.getValue();
                            if (intValue3 != intValue2) {
                                float f2 = b1xVar2.a;
                                obj3 = (floatValue <= b1xVar2.b + f2 && f2 <= floatValue) ? next : null;
                            }
                        }
                    }
                    Map.Entry entry2 = (Map.Entry) obj3;
                    if (entry2 != null) {
                        int intValue4 = ((Number) entry2.getKey()).intValue();
                        b1x b1xVar3 = (b1x) entry2.getValue();
                        ArrayList arrayList = new ArrayList(((bpl0) oz40Var.getValue()).a);
                        arrayList.add(intValue4, arrayList.remove(intValue2));
                        oz40Var.setValue(com.yandex.go.design.compose.list.a.b(arrayList, ((bpl0) oz40Var.getValue()).b));
                        tx40Var2.setFloatValue((f - b1xVar3.a) + tx40Var2.getFloatValue());
                        yx40Var.setIntValue(intValue4);
                    }
                }
                tx40Var2.setFloatValue(z9m.a(z9mVar, tx40Var2.getFloatValue()));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                pnm.b((d31) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                mrm.c((DsListItem$Divider) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                ysm ysmVar = (ysm) obj4;
                zvd0 zvd0Var = (zvd0) obj;
                if (((Float) obj2).floatValue() < 0.0f) {
                    ysmVar.a.setValue(Boolean.FALSE);
                }
                zvd0Var.a();
                return zy11Var;
            case 7:
                _init_$lambda$0 = DueTimetableModalView._init_$lambda$0((DueTimetableModalView) obj4, ((Integer) obj).intValue(), (nsg) obj2);
                return _init_$lambda$0;
            case 8:
                q5n q5nVar = (q5n) obj4;
                fid fidVar2 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    aib1.c(null, q5nVar.d, q5nVar.e, null, btsVar2, 0, 9);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 9:
                f6n f6nVar = (f6n) obj4;
                fid fidVar3 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    web1.e(null, null, null, f6nVar.c, null, 0L, null, null, null, 0, false, 1, null, f6nVar.d, null, null, null, null, false, 0L, 0, false, 1, false, null, false, btsVar3, 0, 384, HProv.ALG_CLASS_DATA_ENCRYPT, 251621367);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 10:
                ((f) obj4).b.H((gv90) obj, (String) obj2);
                return zy11Var;
            case 11:
                ((q) obj4).a(((ryq0) obj).a, (gcn) obj2);
                return zy11Var;
            case 12:
                String str = (String) obj;
                r0 r0Var = ((enn) obj4).f.a;
                do {
                    value = r0Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    linkedHashMap.put(str, obj2);
                } while (!r0Var.k(value, linkedHashMap));
                return zy11Var;
            case 13:
                createEmojiPickerBodyAdapter$lambda$4 = EmojiPickerView.createEmojiPickerBodyAdapter$lambda$4((EmojiPickerView) obj4, (vtn) obj, (tun) obj2);
                return createEmojiPickerBodyAdapter$lambda$4;
            case 14:
                p6o p6oVar = (p6o) obj4;
                fid fidVar4 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    btsVar4.Y();
                } else if (p6oVar.a == null) {
                    btsVar4.e0(-733887207);
                    btsVar4.t(false);
                } else {
                    btsVar4.e0(-733887206);
                    yqb1.e(p6oVar.a, null, null, xya1.e(btsVar4).g.b, 0, 0, null, null, null, 0, 0, btsVar4, 0, 2038);
                    btsVar4.t(false);
                }
                return zy11Var;
            case 15:
                c cVar = (c) obj4;
                int intValue8 = ((Integer) obj).intValue();
                float floatValue2 = ((Float) obj2).floatValue();
                n3e0 n3e0Var = (n3e0) kotlin.collections.a.S(intValue8, cVar.C);
                if (n3e0Var != null) {
                    n3e0Var.r(yga1.b(floatValue2, cVar.O));
                    n3e0Var.u(yga1.b(floatValue2, cVar.P));
                    if (floatValue2 > 1.0f) {
                        floatValue2 = 1.0f;
                    }
                    n3e0Var.p(floatValue2 * 2.0f);
                }
                return zy11Var;
            case 16:
                com.yandex.go.external_service.deeplink.a aVar = (com.yandex.go.external_service.deeplink.a) obj4;
                aVar.b.a = (o3p) obj2;
                aVar.c.a();
                return zy11Var;
            case 17:
                lambda$1$0 = ExternalServiceModalView.lambda$1$0((ExternalServiceModalView) obj4, (EatsKitContentView) obj, (Drawable) obj2);
                return lambda$1$0;
            case 18:
                cuq cuqVar = (cuq) obj4;
                fid fidVar5 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ymb1.e(cuqVar.b, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar5, 0, 0, 65534);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 19:
                builderSetter$lambda$0 = FieldBinding.getBuilderSetter$lambda$0((WireField) obj4, (Message.Builder) obj, obj2);
                return builderSetter$lambda$0;
            case 20:
                builderSetter$lambda$1 = FieldBinding.getBuilderSetter$lambda$1((Method) obj4, (Message.Builder) obj, obj2);
                return builderSetter$lambda$1;
            case 21:
                builderSetter$lambda$2 = FieldBinding.getBuilderSetter$lambda$2((Field) obj4, (Message.Builder) obj, obj2);
                return builderSetter$lambda$2;
            case 22:
                mxq mxqVar = (mxq) obj4;
                fid fidVar6 = (fid) obj;
                int intValue10 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Object Q = btsVar6.Q();
                    if (Q == did.a) {
                        Q = new teb(20);
                        btsVar6.o0(Q);
                    }
                    f530 a = fnq0.a(c530.a, (tls) Q);
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar6, 0);
                    int hashCode = Long.hashCode(btsVar6.T);
                    r1b0 o = btsVar6.o();
                    f530 d = b.d(btsVar6, a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, a2);
                    qje.W(btsVar6, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar6, hashCode, wlsVar);
                    }
                    qje.W(btsVar6, d.d, d);
                    boolean z = mxqVar.e;
                    CharSequence charSequence2 = mxqVar.d;
                    if (z) {
                        btsVar6.e0(-333646738);
                        if (charSequence2 == null) {
                            btsVar6.e0(-1753114285);
                            btsVar6.t(false);
                            charSequence = charSequence2;
                        } else {
                            btsVar6.e0(-1753114284);
                            zgb1.a(charSequence2, null, 8388611, false, null, null, false, null, btsVar6, 384, 250);
                            charSequence = charSequence2;
                            btsVar6 = btsVar6;
                            btsVar6.t(false);
                        }
                        btsVar6.t(false);
                    } else {
                        charSequence = charSequence2;
                        btsVar6.e0(-1752912877);
                        btsVar6.t(false);
                    }
                    String str2 = mxqVar.c;
                    if (str2 == null) {
                        btsVar6.e0(-1752875120);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(-1752875119);
                        cib1.d(str2, null, mxqVar.f, null, 1, 2, btsVar6, 221184, 10);
                        btsVar6.t(false);
                    }
                    if (mxqVar.e) {
                        btsVar6.e0(-1752333549);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(-333628050);
                        if (charSequence == null) {
                            btsVar6.e0(-1752534957);
                            btsVar6.t(false);
                        } else {
                            btsVar6.e0(-1752534956);
                            bts btsVar7 = btsVar6;
                            zgb1.a(charSequence, null, 8388611, false, null, null, false, null, btsVar7, 384, 250);
                            btsVar6 = btsVar7;
                            btsVar6.t(false);
                        }
                        btsVar6.t(false);
                    }
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 23:
                ((DownloadManager.Request) obj4).addRequestHeader((String) obj, (String) obj2);
                return zy11Var;
            case 24:
                ((t4j0) obj4).a((String) obj, (String) obj2);
                return zy11Var;
            case 25:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj4;
                y3x y3xVar = (y3x) obj;
                String str3 = (String) obj2;
                if (y3xVar.a == JSONItemKind.string) {
                    linkedHashMap2.put(str3, ((ktu0) y3xVar).b);
                }
                return zy11Var;
            case 26:
                lambda$startListening$0 = ((FlutterWebRTCPlugin) obj4).lambda$startListening$0((List) obj, (hf3) obj2);
                return lambda$startListening$0;
            case 27:
                ((Integer) obj2).getClass();
                msa1.d((l5f) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 28:
                StringBuilder sb = (StringBuilder) obj4;
                sb.insert(0, (String) obj);
                sb.append((String) obj2);
                return zy11Var;
            default:
                onViewCreated$lambda$9 = FpsPayEnrollFragment.onViewCreated$lambda$9((FpsPayEnrollFragment) obj4, (String) obj, (Bundle) obj2);
                return onViewCreated$lambda$9;
        }
    }

    public /* synthetic */ loj(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
