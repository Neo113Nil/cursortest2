package defpackage;

import android.text.Editable;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.bricks.BrickBoundHelper;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.images.b;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.input.edit.EditMessageDraft;
import com.yandex.messaging.internal.view.input.edit.a;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class emn implements yj6, g3v0 {
    public static final /* synthetic */ kgx[] y = {new MutablePropertyReference1Impl("messageSubscription", 0, "getMessageSubscription()Lcom/yandex/alicekit/core/Disposable;", emn.class), oyr.B(qoi0.a, emn.class, "mentionsSubscription", "getMentionsSubscription()Lcom/yandex/alicekit/core/Disposable;", 0), new MutablePropertyReference1Impl("applyCall", 0, "getApplyCall()Lcom/yandex/messaging/Cancelable;", emn.class)};
    public final qp3 a = new qp3();
    public final qp3 b = new qp3();
    public final op3 c = new op3();
    public String w;
    public final /* synthetic */ a x;

    public emn(a aVar) {
        this.x = aVar;
    }

    public final void a() {
        a aVar = this.x;
        tzt tztVar = aVar.L;
        if (tztVar != null) {
            tztVar.invoke();
        }
        aVar.J.unbind();
        aVar.M = null;
        nmn nmnVar = aVar.x;
        nmnVar.a.edit().remove(nmnVar.c).apply();
    }

    public final void b(vq80 vq80Var) {
        tje.e();
        kgx[] kgxVarArr = y;
        kgx kgxVar = kgxVarArr[1];
        qp3 qp3Var = this.b;
        qp3Var.b(null);
        String str = vq80Var.a;
        this.w = str;
        a aVar = this.x;
        ImageView imageView = aVar.E;
        TextView textView = aVar.G;
        nmn nmnVar = aVar.x;
        InputTextController inputTextController = aVar.F;
        if (inputTextController.getText().toString().length() == 0) {
            EditMessageDraft a = nmnVar.a();
            if (a == null) {
                a = new EditMessageDraft();
                a.messageTimestamp = ((ServerMessageRef) aVar.J.key()).getTimestamp();
                a.text = str;
                nmnVar.a.edit().putString(nmnVar.c, nmnVar.b.adapter(EditMessageDraft.class).toJson(a)).apply();
            }
            aVar.M = a;
            String str2 = a.text;
            if (str2 != null) {
                inputTextController.setText(str2, str2.length());
            }
        }
        aVar.H.setState(as10.a);
        textView.setText(((v3k0) aVar.c).b(0, str), TextView.BufferType.EDITABLE);
        tmt0 tmt0Var = aVar.w;
        Editable editableText = textView.getEditableText();
        tmt0Var.getClass();
        smt0 smt0Var = new smt0(tmt0Var, null, editableText, tmt0.e, false);
        kgx kgxVar2 = kgxVarArr[1];
        qp3Var.b(smt0Var);
        PlainMessage.Image image = vq80Var.b;
        if (image == null) {
            imageView.setImageResource(wwg0.msg_ic_edit);
            return;
        }
        int dimensionPixelSize = aVar.C.getResources().getDimensionPixelSize(gvg0.chat_edit_message_image_size);
        yn50 yn50Var = (yn50) aVar.y.load(b.f(image.fileInfo.id2));
        xn50 xn50Var = yn50Var.b;
        xn50Var.i = dimensionPixelSize;
        xn50Var.j = dimensionPixelSize;
        xn50Var.k = ScaleMode.CENTER_CROP;
        yn50Var.b(imageView, null);
    }

    public final void c(zs21 zs21Var) {
        kgx kgxVar = y[2];
        this.c.b(zs21Var);
    }

    @Override // defpackage.g3v0
    public final void i() {
        tje.e();
        c(null);
        a aVar = this.x;
        tzt tztVar = aVar.L;
        if (tztVar != null) {
            tztVar.invoke();
        }
        aVar.J.unbind();
        aVar.M = null;
        nmn nmnVar = aVar.x;
        nmnVar.a.edit().remove(nmnVar.c).apply();
    }

    @Override // defpackage.g3v0
    public final void n() {
        c(null);
        this.x.H.setState(as10.a);
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickAttach() {
        a aVar = this.x;
        aVar.H.setState(cs10.b);
        InputTextController inputTextController = aVar.F;
        inputTextController.setText("", 0);
        aVar.G.setText((CharSequence) null);
        BrickBoundHelper brickBoundHelper = aVar.J;
        ServerMessageRef serverMessageRef = (ServerMessageRef) brickBoundHelper.key();
        inputTextController.onAttach();
        wq80 wq80Var = aVar.a;
        ct21 e = wq80Var.a.e(wq80Var.b, new uq80(this, serverMessageRef));
        kgx kgxVar = y[0];
        this.a.b(e);
        brickBoundHelper.isAttached();
        z83.i();
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickDetach() {
        tje.e();
        c(null);
        kgx[] kgxVarArr = y;
        kgx kgxVar = kgxVarArr[0];
        this.a.b(null);
        kgx kgxVar2 = kgxVarArr[1];
        this.b.b(null);
        this.x.F.onDetach();
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickPause() {
        a aVar = this.x;
        EditMessageDraft editMessageDraft = aVar.M;
        if (editMessageDraft != null) {
            editMessageDraft.text = aVar.F.createDecodedText();
            nmn nmnVar = aVar.x;
            nmnVar.a.edit().putString(nmnVar.c, nmnVar.b.adapter(EditMessageDraft.class).toJson(editMessageDraft)).apply();
        }
    }

    @Override // defpackage.yj6
    public final boolean t(Object obj, Object obj2) {
        return ((ServerMessageRef) obj).equals((ServerMessageRef) obj2);
    }
}
