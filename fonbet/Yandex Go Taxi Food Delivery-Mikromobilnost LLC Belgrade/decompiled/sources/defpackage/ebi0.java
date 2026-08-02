package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.bricks.BrickBoundHelper;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.authorized.chat.b;
import com.yandex.messaging.internal.entities.MessageReactions;
import com.yandex.messaging.internal.view.timeline.overlay.ReactionsView;
import kotlin.a;

/* loaded from: classes15.dex */
public final class ebi0 implements dbi0, yj6, c5b {
    public final i3y A;
    public lg B;
    public int C;
    public final /* synthetic */ fbi0 E;
    public final ViewGroup a;
    public final lun b;
    public ct21 w;
    public ssa0 x;
    public MessageReactions y;
    public final BrickBoundHelper c = new BrickBoundHelper(this);
    public final i3y z = a.a(new vyf0(8, this));
    public final yln D = new yln(16, this);

    public ebi0(fbi0 fbi0Var, ViewGroup viewGroup, ip31 ip31Var) {
        this.E = fbi0Var;
        this.a = viewGroup;
        this.b = new lun(viewGroup, ip31Var);
        this.A = a.a(new agc0(21, this, fbi0Var));
    }

    @Override // defpackage.yj6
    public final void C() {
        g();
    }

    public final ViewGroup a() {
        return (ViewGroup) this.z.getValue();
    }

    @Override // defpackage.dbi0
    public final void b() {
        this.c.unbind();
        g();
    }

    public final void c(ssa0 ssa0Var) {
        this.x = ssa0Var;
        g();
    }

    @Override // defpackage.dbi0
    public final void d(yab yabVar) {
        ServerMessageRef v0 = yabVar.P0() ? yabVar.v0() : null;
        long j = yabVar.R().reactionsVersion;
        MessageReactions messageReactions = yabVar.R().reactions;
        if (v0 == null) {
            b();
            return;
        }
        BrickBoundHelper brickBoundHelper = this.c;
        if (brickBoundHelper.keyIsDifferent(v0) || ((na31) brickBoundHelper.data()).a < j) {
            brickBoundHelper.bind((View) this.a, (ViewGroup) v0, (ServerMessageRef) new na31(j, messageReactions));
        }
    }

    @Override // defpackage.dbi0, defpackage.b190
    public final void e(int i) {
        if (this.C == i) {
            return;
        }
        this.C = i;
        g();
    }

    @Override // defpackage.dbi0, defpackage.c5b
    public final void f(long j, MessageReactions messageReactions) {
        BrickBoundHelper brickBoundHelper = this.c;
        if (((na31) brickBoundHelper.data()).a >= j) {
            return;
        }
        brickBoundHelper.bind((View) this.a, (ViewGroup) brickBoundHelper.key(), (Object) new na31(j, messageReactions));
    }

    public final void g() {
        MessageReactions messageReactions;
        BrickBoundHelper brickBoundHelper = this.c;
        zy11 zy11Var = null;
        if (brickBoundHelper.isBound()) {
            ssa0 ssa0Var = this.x;
            na31 na31Var = (na31) brickBoundHelper.data();
            messageReactions = (ssa0Var == null || ssa0Var.a < na31Var.a) ? na31Var.b : ssa0Var.b;
        } else {
            messageReactions = null;
        }
        this.y = messageReactions;
        ViewGroup a = a();
        yln ylnVar = this.D;
        a.removeOnLayoutChangeListener(ylnVar);
        MessageReactions messageReactions2 = this.y;
        lun lunVar = this.b;
        if (messageReactions2 != null) {
            ((ReactionsView) this.A.getValue()).setReactions(messageReactions2);
            ViewGroup a2 = a();
            if (!lunVar.w) {
                lunVar.z = a2;
            }
            lunVar.n();
            lunVar.g(a().getPaddingEnd() - this.C, a().getPaddingBottom() + kjs0.b(16));
            a().addOnLayoutChangeListener(ylnVar);
            lg lgVar = this.B;
            if (lgVar != null) {
                lgVar.h((a().getWidth() - a().getPaddingStart()) - a().getPaddingEnd());
                zy11Var = zy11.a;
            }
            if (zy11Var != null) {
                return;
            }
        }
        lunVar.c();
        lg lgVar2 = this.B;
        if (lgVar2 != null) {
            lgVar2.h(0);
        }
    }

    @Override // defpackage.b190
    public final Integer getWidth() {
        na31 na31Var;
        BrickBoundHelper brickBoundHelper = this.c;
        if (!brickBoundHelper.isBound()) {
            brickBoundHelper = null;
        }
        if (brickBoundHelper == null || (na31Var = (na31) brickBoundHelper.data()) == null || na31Var.b == null) {
            return null;
        }
        return Integer.valueOf(lj91.a((ReactionsView) this.A.getValue()).getWidth());
    }

    @Override // defpackage.b190
    public final void i(lg lgVar) {
        this.B = lgVar;
    }

    @Override // defpackage.dbi0
    public final boolean j() {
        return this.y != null;
    }

    @Override // defpackage.b190
    public final lg m() {
        return this.B;
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickAttach() {
        oy80 oy80Var = this.E.c;
        ServerMessageRef serverMessageRef = (ServerMessageRef) this.c.key();
        this.w = ((b) oy80Var.c).e(p8b.a(serverMessageRef.getRequiredChatId()), new hta0(oy80Var, serverMessageRef, this));
        g();
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickDetach() {
        this.x = null;
        ct21 ct21Var = this.w;
        if (ct21Var != null) {
            ct21Var.close();
        }
        this.w = null;
    }

    @Override // defpackage.yj6
    public final boolean t(Object obj, Object obj2) {
        return ((ServerMessageRef) obj).equals((ServerMessageRef) obj2);
    }
}
