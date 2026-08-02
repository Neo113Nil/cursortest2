package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.emoji2.emojipicker.EmojiPickerView;
import com.yandex.go.address.models.PlaceType;
import com.yandex.messaging.ui.settings.inviteLinkInfo.InviteLinkType;
import ru.yandex.taxi.masstransit.design.Direction;
import ru.yandex.taxi.surge.dialog.GradientComponentView;

/* loaded from: classes12.dex */
public final /* synthetic */ class adp implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ adp(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                EmojiPickerView emojiPickerView = new EmojiPickerView(new ContextThemeWrapper((Context) obj, y1i0.ThemeOverlay_EmojiPicker), null, 0, 6, null);
                emojiPickerView.setOnEmojiPickedListener(new k9b(4, tlsVar));
                return emojiPickerView;
            case 1:
                tlsVar.invoke(new pep((PlaceType) obj));
                return zy11Var;
            case 2:
                dd11 dd11Var = (dd11) obj;
                if (!(dd11Var instanceof z2t)) {
                    ny61.r("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) tlsVar.invoke(((z2t) dd11Var).a);
                bool.getClass();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                tlsVar.invoke(bool2);
                return zy11Var;
            case 4:
                return new mt6((GradientComponentView) obj, tlsVar, i2);
            case 5:
                hoy0 hoy0Var = (hoy0) obj;
                String v = cvu0.v(hoy0Var.a.b, " ", "", false);
                long j = hoy0Var.b;
                int i3 = asy0.c;
                tlsVar.invoke(new gzv(v, (int) (j >> 32)));
                return zy11Var;
            case 6:
                tlsVar.invoke(((Boolean) obj).booleanValue() ? InviteLinkType.TEMPORARY : InviteLinkType.PERMANENT);
                return zy11Var;
            case 7:
                tlsVar.invoke(obj);
                return zy11Var;
            case 8:
                tlsVar.invoke(new zwz((String) obj));
                return zy11Var;
            case 9:
                ipr iprVar = (ipr) obj;
                if (jl40.l(iprVar, dpr.a)) {
                    tlsVar.invoke(n700.a);
                } else if (jl40.l(iprVar, epr.a)) {
                    tlsVar.invoke(q700.a);
                } else if (jl40.l(iprVar, fpr.a)) {
                    tlsVar.invoke(r700.a);
                } else if (jl40.l(iprVar, hpr.a)) {
                    tlsVar.invoke(v700.a);
                } else {
                    if (!jl40.l(iprVar, gpr.a)) {
                        w511.b();
                        return null;
                    }
                    tlsVar.invoke(t700.a);
                }
                return zy11Var;
            case 10:
                tlsVar.invoke(new w930((String) obj));
                return zy11Var;
            case 11:
                tlsVar.invoke(new x930((String) obj));
                return zy11Var;
            case 12:
                tlsVar.invoke((y930) obj);
                return zy11Var;
            case 13:
                tlsVar.invoke(new gh30((h711) obj));
                return zy11Var;
            case 14:
                tlsVar.invoke(new jh30((bzy0) obj));
                return zy11Var;
            case 15:
                tlsVar.invoke(new hh30((ee01) obj));
                return zy11Var;
            case 16:
                tlsVar.invoke(new kh30((ge01) obj));
                return zy11Var;
            case 17:
                tlsVar.invoke((ml30) obj);
                return zy11Var;
            case 18:
                tlsVar.invoke(new tp30((String) obj));
                return zy11Var;
            case 19:
                tlsVar.invoke(new nv30((String) obj));
                return zy11Var;
            case 20:
                int i4 = v140.a[((Direction) obj).ordinal()];
                if (i4 == 1) {
                    tlsVar.invoke(m040.a);
                } else if (i4 == 2) {
                    tlsVar.invoke(l040.a);
                } else if (i4 != 3) {
                    w511.b();
                    return null;
                }
                return zy11Var;
            case 21:
                tlsVar.invoke(new h940((n410) obj));
                return zy11Var;
            case 22:
                tlsVar.invoke(new id40(((Integer) obj).intValue()));
                return zy11Var;
            case 23:
                tlsVar.invoke(new kd40(((Integer) obj).intValue()));
                return zy11Var;
            case 24:
                tlsVar.invoke(new sd40((String) obj));
                return zy11Var;
            case 25:
                tlsVar.invoke(new ts40((h711) obj));
                return zy11Var;
            case 26:
                tlsVar.invoke(new ws40((bzy0) obj));
                return zy11Var;
            case 27:
                tlsVar.invoke(new us40((ee01) obj));
                return zy11Var;
            case 28:
                tlsVar.invoke(new xs40((ge01) obj));
                return zy11Var;
            default:
                h7p h7pVar = (h7p) obj;
                if (jl40.l(h7pVar, e7p.a)) {
                    tlsVar.invoke(new os40());
                } else if (h7pVar instanceof f7p) {
                    tlsVar.invoke(new qs40(((f7p) h7pVar).a));
                } else {
                    if (!jl40.l(h7pVar, g7p.a)) {
                        w511.b();
                        return null;
                    }
                    tlsVar.invoke(rs40.a);
                }
                return zy11Var;
        }
    }
}
