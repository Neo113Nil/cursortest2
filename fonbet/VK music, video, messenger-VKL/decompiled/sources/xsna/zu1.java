package xsna;

import android.content.DialogInterface;
import android.net.Uri;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.vmoji.character.model.VmojiProductModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cwb0;
import xsna.eeu0;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zu1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zu1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        wzs<? super DialogInterface, ? super CharSequence, s3q0> wzsVar;
        switch (this.b) {
            case 0:
                dv1 dv1Var = (dv1) this.c;
                WebGroup webGroup = (WebGroup) this.d;
                String str = (String) this.e;
                List list = (List) obj;
                xwv0 xwv0Var = (xwv0) dv1Var.a.invoke();
                if (xwv0Var != null) {
                    long appId = xwv0Var.getAppId();
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    jfn0 l = vdx0Var.l();
                    long j = webGroup.b;
                    ev1 ev1Var = dv1Var.e;
                    xwv0Var.getView().D6().b(l.c(appId, j, ev1Var != null ? ev1Var.c : null, list).subscribe(new c40(new yu1(0, dv1Var, str), 3), new j41(new defpackage.v(2, dv1Var, str), 1)));
                } else {
                    dv1Var.d.a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), str, 1, null));
                }
                return s3q0.a;
            case 1:
                ((x2b) this.c).a((MsgFromChannel) this.d, (ug30) obj, (cwb0.l0) this.e);
                return s3q0.a;
            case 2:
                ((tgp0) obj).d((ur4) this.c, (Uri) this.d, (Throwable) this.e);
                return s3q0.a;
            case 3:
                izs izsVar = (izs) this.c;
                List list2 = (List) this.d;
                sum0.c cVar = (sum0.c) this.e;
                sum0.d dVar = (sum0.d) obj;
                wow wowVar = new wow(list2);
                ArrayList arrayList = new ArrayList(c5g.u(wowVar, 10));
                Iterator it = wowVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    sum0.d dVar2 = (sum0.d) next;
                    if (i == cVar.c) {
                        dVar2 = dVar;
                    }
                    arrayList.add(dVar2);
                    i = i2;
                }
                izsVar.invoke(arrayList);
                return s3q0.a;
            case 4:
                izs izsVar2 = (izs) this.c;
                VmojiProductModel vmojiProductModel = (VmojiProductModel) this.d;
                msp0 msp0Var = (msp0) this.e;
                izsVar2.invoke(vmojiProductModel);
                dw20 dw20Var = msp0Var.b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 5:
                u8j u8jVar = (u8j) this.c;
                mkr0 mkr0Var = ((uur0) this.d).l;
                qtd0 qtd0Var = (qtd0) this.e;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo = u8jVar.b.b;
                if (imSearchItemLoggingInfo != null) {
                    mkr0Var.t0(ImSearchAnalytics.ClickAction.TAP, imSearchItemLoggingInfo);
                }
                mkr0Var.Q(qtd0Var, u8jVar.b.b);
                return s3q0.a;
            case 6:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                eeu0.a.C2801a c2801a = (eeu0.a.C2801a) this.d;
                n3x n3xVar = (n3x) this.e;
                androidx.appcompat.app.d dVar3 = (androidx.appcompat.app.d) ref$ObjectRef.element;
                if (dVar3 != null && (wzsVar = c2801a.t) != null) {
                    wzsVar.invoke(dVar3, n3xVar.getEtInput().getText());
                }
                return s3q0.a;
            default:
                ((zhw0) this.c).c0((UserId) this.d, (yiw0) this.e, new eni0(18));
                return s3q0.a;
        }
    }

    public /* synthetic */ zu1(kw70 kw70Var, ur4 ur4Var, Uri uri, Throwable th) {
        this.b = 2;
        this.c = ur4Var;
        this.d = uri;
        this.e = th;
    }
}
