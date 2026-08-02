package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.yandex.bricks.Brick;
import com.yandex.messaging.chat.a;
import com.yandex.messaging.internal.ServerMessageRef;
import java.util.LinkedList;

/* loaded from: classes15.dex */
public final class mrh extends Brick implements g3v0 {
    public uds0 A;
    public int B;
    public final Handler a = new Handler();
    public final LinkedList b = new LinkedList();
    public final Activity c;
    public final a w;
    public final View x;
    public final TextView y;
    public final doc z;

    public mrh(Activity activity, a aVar, doc docVar) {
        this.z = docVar;
        this.c = activity;
        this.w = aVar;
        View inflate = inflate(activity, olh0.msg_b_delete_message);
        this.x = inflate;
        this.y = (TextView) inflate.findViewById(e9h0.messaging_title);
        inflate.setVisibility(8);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.x;
    }

    @Override // defpackage.g3v0
    public final void i() {
        z83.h(null, isAttached());
        LinkedList linkedList = this.b;
        z83.c(null, linkedList.isEmpty());
        this.B++;
        this.A = null;
        linkedList.pop();
        q();
        if (this.A == null) {
            this.B = 0;
            this.a.removeCallbacksAndMessages(null);
            this.x.setVisibility(8);
        }
    }

    @Override // defpackage.g3v0
    public final void n() {
        z83.h(null, isAttached());
        LinkedList linkedList = this.b;
        z83.c(null, linkedList.isEmpty());
        this.z.a.a("delete_msg_error", null);
        this.A = null;
        linkedList.clear();
        Handler handler = this.a;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new lrh(this, 1), 2000L);
        this.x.setVisibility(0);
        this.y.setText(oyh0.messaging_something_went_wrong);
    }

    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        super.onBrickAttach(bundle);
        q();
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.a.removeCallbacksAndMessages(null);
        this.x.setVisibility(8);
        uds0 uds0Var = this.A;
        if (uds0Var != null) {
            uds0Var.close();
            this.A = null;
        }
    }

    public final void q() {
        uds0 uds0Var = this.A;
        LinkedList linkedList = this.b;
        if (uds0Var == null && !linkedList.isEmpty()) {
            Handler handler = this.a;
            handler.removeCallbacksAndMessages(null);
            if (this.x.getVisibility() != 0) {
                handler.postDelayed(new lrh(this, 0), 1000L);
            }
            ServerMessageRef serverMessageRef = (ServerMessageRef) linkedList.getFirst();
            k9b k9bVar = new k9b(2, this);
            a aVar = this.w;
            aVar.getClass();
            qhw0 a = jl40.a();
            sjh sjhVar = uyj.a;
            this.A = new uds0(bvf0.a(cvw.U(a, o400.a.x)), k9bVar, aVar, serverMessageRef);
        }
        int size = linkedList.size() + this.B;
        TextView textView = this.y;
        if (size <= 1) {
            textView.setText(oyh0.messaging_delete_single_message_progress);
            return;
        }
        textView.setText(this.c.getString(oyh0.messaging_delete_few_messages_progress, Integer.valueOf(this.B + 1), Integer.valueOf(size)));
    }
}
